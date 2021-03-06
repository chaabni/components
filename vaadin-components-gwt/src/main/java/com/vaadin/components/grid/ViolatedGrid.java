package com.vaadin.components.grid;

import com.vaadin.client.widgets.Escalator;

public class ViolatedGrid extends com.vaadin.client.widgets.Grid<Object> {

    public native boolean refreshHeader()
    /*-{
        this.@com.vaadin.client.widgets.Grid::refreshHeader()();
    }-*/;

    public native boolean refreshFooter()
    /*-{
      this.@com.vaadin.client.widgets.Grid::refreshFooter()();
    }-*/;

    public void refreshStaticSection(StaticSection.StaticCell cell) {
        if (cell instanceof HeaderCell) {
            refreshHeader();
        } else {
            refreshFooter();
        }
    }

    @Override
    public Escalator getEscalator() {
        return super.getEscalator();
    }
}
