package com.itic91.luispech.weatherpop_up;

/**
 * Created by luis on 07/07/15.
 */
public class List {

    private String title;
    private String subtitle;
    private int picture;

    public List(String title, String subtitle, int picture)
    {
        super();
        this.title=title;
        this.subtitle=subtitle;
        this.picture=picture;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public String toString() {
        return "Dia"+title;
    }
}
