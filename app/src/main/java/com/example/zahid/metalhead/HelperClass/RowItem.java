package com.example.zahid.metalhead.HelperClass;

/**
 * Created by ZAHID on 11/14/2015.
 */
public class RowItem {
    private String bandName;
    private int icon;

    public RowItem(String bandName, int icon) {
        this.bandName = bandName;
        this.icon = icon;

    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
