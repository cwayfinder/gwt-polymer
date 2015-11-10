package com.vaadin.polymer.demo.client;

import java.util.Arrays;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.vaadin.polymer.demo.client.sampler.Sampler;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.elemental.Function;

public class Demo implements EntryPoint {

    public void onModuleLoad() {
        Polymer.startLoading();

        // Although gwt-polymer-elements takes care of dynamic loading of components
        // when they are created using Polymer.createElement or we use Polymer Widgets,
        // there are certain features which must be loaded previously to start
        // the application. Hence you have to add import tags to your host page or
        // import them dynamically, in this case it might be necessary to wait until
        // the components are ready.

        // The `Polymer` utility class provide a set of methods for facilitating it,
        // you can pass tag-names for standard component locations (tag-name/tag-name.html)
        // or relative urls otherwise.
        Polymer.importHref(Arrays.asList(
                // Paper applications must always import paper-styles
                "paper-styles",
                // Styles for paper examples
                "paper-styles/demo-pages.html",
                // Iconsets must be loaded before using any component depending on them
                //   Iron comes with the collections:
                //   communication, device, editor, hardware, image, iron, maps, notifications, social.
                "iron-icons/iron-icons.html",
                "iron-icons/communication-icons.html",
                "iron-flex-layout/iron-flex-layout.html",
                // Animation must be loaded at the beginning
                "neon-animation/neon-animations.html"
                ));
        Polymer.whenReady(new Function() {
            public Object call(Object arg) {
                // The app is executed when all imports succeed.
                RootPanel.get().add(new Sampler());
                return null;
            }
        });
    }
}
