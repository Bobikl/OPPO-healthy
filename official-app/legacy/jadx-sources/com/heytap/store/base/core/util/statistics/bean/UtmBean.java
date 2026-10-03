package com.heytap.store.base.core.util.statistics.bean;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class UtmBean {
    public static final String DEFAULT = "direct";
    public static final int EXPIRATION_DATE = 172800000;
    public static final String UC = "uc";
    public static final String UM = "um";
    public static final String US = "us";
    public static final String UT = "ut";
    public static final String UTM_CAMPAIGN = "utm_campaign";
    public static final String UTM_MEDIUM = "utm_medium";
    public static final String UTM_SOURCE = "utm_source";
    public static final String UTM_TERM = "utm_term";
    private String latest_utm_campaign;
    private String latest_utm_medium;
    private String latest_utm_source;
    private String latest_utm_term;
    private String uc;
    private String um;
    private long updateTime;
    private String us;
    private String ut;

    private boolean isExpiration() {
        return System.currentTimeMillis() - this.updateTime > 172800000;
    }

    public String getLatest_utm_campaign() {
        return (TextUtils.isEmpty(this.latest_utm_campaign) || isExpiration()) ? DEFAULT : this.latest_utm_campaign;
    }

    public String getLatest_utm_medium() {
        return (TextUtils.isEmpty(this.latest_utm_medium) || isExpiration()) ? DEFAULT : this.latest_utm_medium;
    }

    public String getLatest_utm_source() {
        return (TextUtils.isEmpty(this.latest_utm_source) || isExpiration()) ? DEFAULT : this.latest_utm_source;
    }

    public String getLatest_utm_term() {
        return (TextUtils.isEmpty(this.latest_utm_term) || isExpiration()) ? DEFAULT : this.latest_utm_term;
    }

    public String getUc() {
        return this.uc;
    }

    public String getUm() {
        return this.um;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public String getUs() {
        return this.us;
    }

    public String getUt() {
        return this.ut;
    }

    public void setLatest_utm_campaign(String str) {
        this.latest_utm_campaign = str;
    }

    public void setLatest_utm_medium(String str) {
        this.latest_utm_medium = str;
    }

    public void setLatest_utm_source(String str) {
        this.latest_utm_source = str;
    }

    public void setLatest_utm_term(String str) {
        this.latest_utm_term = str;
    }

    public void setUc(String str) {
        this.uc = str;
    }

    public void setUm(String str) {
        this.um = str;
    }

    public void setUs(String str) {
        this.us = str;
    }

    public void setUt(String str) {
        this.ut = str;
    }

    public void updateTime() {
        this.updateTime = System.currentTimeMillis();
    }
}
