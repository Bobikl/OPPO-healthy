package com.heytap.health.watchface.provider.wallpaper;

import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public class DeviceInfo implements Serializable {
    private double deviceScreenHeight;
    private double deviceScreenRadius;
    private int deviceScreenType;
    private double deviceScreenWidth;
    private String idImg;
    private double idImgViewHeight;
    private double idImgViewWidth;
    private String model;
    private String unique;

    public double getDeviceScreenHeight() {
        return this.deviceScreenHeight;
    }

    public double getDeviceScreenRadius() {
        return this.deviceScreenRadius;
    }

    public int getDeviceScreenType() {
        return this.deviceScreenType;
    }

    public double getDeviceScreenWidth() {
        return this.deviceScreenWidth;
    }

    public String getIdImg() {
        return this.idImg;
    }

    public double getIdImgViewHeight() {
        return this.idImgViewHeight;
    }

    public double getIdImgViewWidth() {
        return this.idImgViewWidth;
    }

    public String getModel() {
        return this.model;
    }

    public String getUnique() {
        return this.unique;
    }

    public void setDeviceScreenHeight(double d) {
        this.deviceScreenHeight = d;
    }

    public void setDeviceScreenRadius(double d) {
        this.deviceScreenRadius = d;
    }

    public void setDeviceScreenType(int i) {
        this.deviceScreenType = i;
    }

    public void setDeviceScreenWidth(double d) {
        this.deviceScreenWidth = d;
    }

    public void setIdImg(String str) {
        this.idImg = str;
    }

    public void setIdImgViewHeight(double d) {
        this.idImgViewHeight = d;
    }

    public void setIdImgViewWidth(double d) {
        this.idImgViewWidth = d;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setUnique(String str) {
        this.unique = str;
    }

    public String toString() {
        return "DeviceInfo{unique='" + this.unique + "', model='" + this.model + "', idImg='" + this.idImg + "', idImgViewWidth=" + this.idImgViewWidth + ", idImgViewHeight=" + this.idImgViewHeight + ", deviceScreenWidth=" + this.deviceScreenWidth + ", deviceScreenHeight=" + this.deviceScreenHeight + ", deviceScreenType=" + this.deviceScreenType + ", deviceScreenRadius=" + this.deviceScreenRadius + '}';
    }
}
