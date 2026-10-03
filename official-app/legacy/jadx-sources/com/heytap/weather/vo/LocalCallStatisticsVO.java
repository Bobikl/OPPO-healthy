package com.heytap.weather.vo;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class LocalCallStatisticsVO {
    private long callTime;
    private String method;
    private Map<String, Object> paramsMap;

    public LocalCallStatisticsVO() {
    }

    public LocalCallStatisticsVO(String str, Map<String, Object> map, long j2) {
        this.method = str;
        this.paramsMap = map;
        this.callTime = j2;
    }

    public long getCallTime() {
        return this.callTime;
    }

    public String getMethod() {
        return this.method;
    }

    public Map<String, Object> getParamsMap() {
        return this.paramsMap;
    }

    public void setCallTime(long j2) {
        this.callTime = j2;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setParamsMap(Map<String, Object> map) {
        this.paramsMap = map;
    }
}
