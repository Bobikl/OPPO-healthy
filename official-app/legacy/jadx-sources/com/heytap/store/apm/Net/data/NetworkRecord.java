package com.heytap.store.apm.Net.data;

import android.text.TextUtils;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public class NetworkRecord implements Serializable {
    private static final String METHOD_GET = "get";
    private static final String METHOD_POST = "post";
    private long endTime;
    private String method;
    private String requestId;
    private long requestLength;
    private long responseLength;
    private long startTime;
    private String url;

    public boolean filter(String str) {
        return (getUrl() == null || TextUtils.isEmpty(this.url) || !this.url.contains(str)) ? false : true;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public String getMethod() {
        return this.method;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public long getRequestLength() {
        return this.requestLength;
    }

    public long getResponseLength() {
        return this.responseLength;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isGetRecord() {
        return getMethod() != null && TextUtils.equals("get", getMethod().toLowerCase());
    }

    public boolean isPostRecord() {
        return getMethod() != null && TextUtils.equals(METHOD_POST, getMethod().toLowerCase());
    }

    public void setEndTime(long j2) {
        this.endTime = j2;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setRequestLength(long j2) {
        this.requestLength = j2;
    }

    public void setResponseLength(long j2) {
        this.responseLength = j2;
    }

    public void setStartTime(long j2) {
        this.startTime = j2;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
