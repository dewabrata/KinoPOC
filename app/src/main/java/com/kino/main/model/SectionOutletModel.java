package com.kino.main.model;

import com.kino.main.modelservice.GroupOutlet;
import com.kino.main.modelservice.Outlet;

/**
 * Created by user on 1/23/2018.
 */

public class SectionOutletModel {
    public boolean section = false;
    public GroupOutlet groupOutlet;

    public SectionOutletModel(boolean section, GroupOutlet groupOutlet, Outlet outlet, String images) {
        this.section = section;
        this.groupOutlet = groupOutlet;
        this.outlet = outlet;
        this.images = images;
    }

    public Outlet outlet;
    public String images;


    public boolean isSection() {
        return section;
    }

    public void setSection(boolean section) {
        this.section = section;
    }

    public GroupOutlet getGroupOutlet() {
        return groupOutlet;
    }

    public void setGroupOutlet(GroupOutlet groupOutlet) {
        this.groupOutlet = groupOutlet;
    }

    public Outlet getOutlet() {
        return outlet;
    }

    public void setOutlet(Outlet outlet) {
        this.outlet = outlet;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }




}