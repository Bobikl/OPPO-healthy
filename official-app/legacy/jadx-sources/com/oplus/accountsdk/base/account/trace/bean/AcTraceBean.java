package com.oplus.accountsdk.base.account.trace.bean;

import androidx.annotation.Keep;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcTraceBean {
    private String app_package;
    private String app_version;
    private String brand;
    private String client_time;
    private String dayno;
    private String duid;
    private String event_id;
    private Map<String, String> log_map;
    private String log_tag;
    private String os_version;
    private String region;
    private String resource_id;
    private String rom_version;

    public String getLog_tag() {
        return this.log_tag;
    }

    public String getResourceId() {
        return this.resource_id;
    }

    public void setAppPackage(String str) {
        this.app_package = str;
    }

    public void setAppVersion(String str) {
        this.app_version = str;
    }

    public void setBrand(String str) {
        this.brand = str;
    }

    public void setClientTime(String str) {
        this.client_time = str;
    }

    public void setDayno(String str) {
        this.dayno = str;
    }

    public void setDuid(String str) {
        this.duid = str;
    }

    public void setEventId(String str) {
        this.event_id = str;
    }

    public void setLogMap(Map<String, String> map) {
        this.log_map = map;
    }

    public void setLogTag(String str) {
        this.log_tag = str;
    }

    public void setOsVersion(String str) {
        this.os_version = str;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    public void setResourceId(String str) {
        this.resource_id = str;
    }

    public void setRomVersion(String str) {
        this.rom_version = str;
    }
}
