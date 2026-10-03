package com.heytap.theme.watch.domain.dto.response;

import io.protostuff.Tag;

/* JADX INFO: loaded from: classes17.dex */
public class ThemewPicDto {

    @Tag(4)
    private int height;

    @Tag(1)
    private String id;

    @Tag(5)
    private int picType;

    @Tag(2)
    private String url;

    @Tag(3)
    private int width;

    public int getHeight() {
        return this.height;
    }

    public String getId() {
        return this.id;
    }

    public int getPicType() {
        return this.picType;
    }

    public String getUrl() {
        return this.url;
    }

    public int getWidth() {
        return this.width;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setPicType(int i) {
        this.picType = i;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public String toString() {
        return "ThemewPicDto{id='" + this.id + "', url='" + this.url + "', width=" + this.width + ", height=" + this.height + ", picType=" + this.picType + '}';
    }
}
