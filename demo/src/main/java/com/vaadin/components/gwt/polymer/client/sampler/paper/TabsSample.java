package com.vaadin.components.gwt.polymer.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.components.gwt.polymer.client.widget.PaperTabs;

public class TabsSample extends Composite {
    interface TabsSampleUiBinder extends UiBinder<HTMLPanel, TabsSample> {
    }

    private static TabsSampleUiBinder ourUiBinder = GWT.create(TabsSampleUiBinder.class);
    
    @UiField
    PaperTabs scrollableTabs;

    public TabsSample() {
        initWidget(ourUiBinder.createAndBindUi(this));
        
        //TODO: add media-query listener
    }
}