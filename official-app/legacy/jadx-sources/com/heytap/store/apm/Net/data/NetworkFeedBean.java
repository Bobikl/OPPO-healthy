package com.heytap.store.apm.Net.data;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class NetworkFeedBean implements Serializable {
    private int connectTimeoutMillis;
    private String mBody;
    private int mBusinessCode;
    private String mCURL;
    private String mContentType;
    private long mCostTime;
    private long mCreateTime;
    private String mHost;
    private String mMethod;
    private String mName;
    private Map<String, String> mRequestHeadersMap;
    private String mRequestId;
    private Map<String, String> mResponseHeadersMap;
    private int mSize;
    private int mStatus;
    private String mUrl;
    private int readTimeoutMillis;
    private int writeTimeoutMillis;

    public String getBody() {
        return this.mBody;
    }

    public int getBusinessCode() {
        return this.mBusinessCode;
    }

    public String getCURL() {
        return this.mCURL;
    }

    public int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    public String getContentType() {
        return this.mContentType;
    }

    public long getCostTime() {
        return this.mCostTime;
    }

    public long getCreateTime() {
        return this.mCreateTime;
    }

    public String getHost() {
        return this.mHost;
    }

    public String getMethod() {
        return this.mMethod;
    }

    public String getName() {
        return this.mName;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public Map<String, String> getRequestHeadersMap() {
        return this.mRequestHeadersMap;
    }

    public String getRequestId() {
        return this.mRequestId;
    }

    public Map<String, String> getResponseHeadersMap() {
        return this.mResponseHeadersMap;
    }

    public int getSize() {
        return this.mSize;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public void setBody(String str) {
        this.mBody = str;
    }

    public void setBusinessCode(int i) {
        this.mBusinessCode = i;
    }

    public void setCURL(String str) {
        this.mCURL = str;
    }

    public void setConnectTimeoutMillis(int i) {
        this.connectTimeoutMillis = i;
    }

    public void setContentType(String str) {
        this.mContentType = str;
    }

    public void setCostTime(long j2) {
        this.mCostTime = j2;
    }

    public void setCreateTime(long j2) {
        this.mCreateTime = j2;
    }

    public void setHost(String str) {
        this.mHost = str;
    }

    public void setMethod(String str) {
        this.mMethod = str;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setReadTimeoutMillis(int i) {
        this.readTimeoutMillis = i;
    }

    public void setRequestHeadersMap(Map<String, String> map) {
        this.mRequestHeadersMap = map;
    }

    public void setRequestId(String str) {
        this.mRequestId = str;
    }

    public void setResponseHeadersMap(Map<String, String> map) {
        this.mResponseHeadersMap = map;
    }

    public void setSize(int i) {
        this.mSize = i;
    }

    public void setStatus(int i) {
        this.mStatus = i;
    }

    public void setUrl(String str) {
        this.mUrl = str;
    }

    public void setWriteTimeoutMillis(int i) {
        this.writeTimeoutMillis = i;
    }

    public String toString() {
        return "NetworkFeedBean{mRequestId='" + this.mRequestId + "', mUrl='" + this.mUrl + "', mHost='" + this.mHost + "', mMethod='" + this.mMethod + "', mRequestHeadersMap=" + this.mRequestHeadersMap + ", mName='" + this.mName + "', mStatus=" + this.mStatus + ", mSize=" + this.mSize + ", mCostTime=" + this.mCostTime + ", mContentType='" + this.mContentType + "', mBody='" + this.mBody + "', mResponseHeadersMap=" + this.mResponseHeadersMap + ", mCreateTime=" + this.mCreateTime + ", mCURL='" + this.mCURL + "'}";
    }
}
