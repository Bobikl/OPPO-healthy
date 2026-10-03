package com.autonavi.base.ae.gmap;

import com.autonavi.base.amap.mapcore.jbinding.JBindingExclude;
import com.autonavi.base.amap.mapcore.jbinding.JBindingInclude;

/* JADX INFO: loaded from: classes13.dex */
@JBindingInclude
public class MapPoi {
    private String extendInfo;
    private long iconXMax;
    private long iconXMin;
    private long iconYMax;
    private long iconYMin;
    private boolean isFocus;
    private double latitude;
    private double longitude;
    private long mainKey;
    private String name;
    private long poiType;
    private String poiid;
    private float screenX;
    private float screenY;
    private long subKey;
    private long subType;
    private long timestamp;
    private double z;

    @JBindingExclude
    public String getExtendInfo() {
        return this.extendInfo;
    }

    @JBindingExclude
    public long getIconXMax() {
        return this.iconXMax;
    }

    @JBindingExclude
    public long getIconXMin() {
        return this.iconXMin;
    }

    @JBindingExclude
    public long getIconYMax() {
        return this.iconYMax;
    }

    @JBindingExclude
    public long getIconYMin() {
        return this.iconYMin;
    }

    @JBindingExclude
    public double getLatitude() {
        return this.latitude;
    }

    @JBindingExclude
    public double getLongitude() {
        return this.longitude;
    }

    @JBindingExclude
    public long getMainKey() {
        return this.mainKey;
    }

    @JBindingExclude
    public String getName() {
        return this.name;
    }

    @JBindingExclude
    public long getPoiType() {
        return this.poiType;
    }

    @JBindingExclude
    public String getPoiid() {
        return this.poiid;
    }

    @JBindingExclude
    public float getScreenX() {
        return this.screenX;
    }

    @JBindingExclude
    public float getScreenY() {
        return this.screenY;
    }

    @JBindingExclude
    public long getSubKey() {
        return this.subKey;
    }

    @JBindingExclude
    public long getSubType() {
        return this.subType;
    }

    @JBindingExclude
    public long getTimestamp() {
        return this.timestamp;
    }

    @JBindingExclude
    public double getZ() {
        return this.z;
    }

    @JBindingExclude
    public boolean isFocus() {
        return this.isFocus;
    }

    @JBindingExclude
    public void setExtendInfo(String str) {
        this.extendInfo = str;
    }

    @JBindingExclude
    public void setFocus(boolean z) {
        this.isFocus = z;
    }

    @JBindingExclude
    public void setIconXMax(long j2) {
        this.iconXMax = j2;
    }

    @JBindingExclude
    public void setIconXMin(long j2) {
        this.iconXMin = j2;
    }

    @JBindingExclude
    public void setIconYMax(long j2) {
        this.iconYMax = j2;
    }

    @JBindingExclude
    public void setIconYMin(long j2) {
        this.iconYMin = j2;
    }

    @JBindingExclude
    public void setLatitude(double d) {
        this.latitude = d;
    }

    @JBindingExclude
    public void setLongitude(double d) {
        this.longitude = d;
    }

    @JBindingExclude
    public void setMainKey(long j2) {
        this.mainKey = j2;
    }

    @JBindingExclude
    public void setName(String str) {
        this.name = str;
    }

    @JBindingExclude
    public void setPoiType(long j2) {
        this.poiType = j2;
    }

    @JBindingExclude
    public void setPoiid(String str) {
        this.poiid = str;
    }

    @JBindingExclude
    public void setScreenX(float f) {
        this.screenX = f;
    }

    @JBindingExclude
    public void setScreenY(float f) {
        this.screenY = f;
    }

    @JBindingExclude
    public void setSubKey(long j2) {
        this.subKey = j2;
    }

    @JBindingExclude
    public void setSubType(long j2) {
        this.subType = j2;
    }

    @JBindingExclude
    public void setTimestamp(long j2) {
        this.timestamp = j2;
    }

    @JBindingExclude
    public void setZ(double d) {
        this.z = d;
    }
}
