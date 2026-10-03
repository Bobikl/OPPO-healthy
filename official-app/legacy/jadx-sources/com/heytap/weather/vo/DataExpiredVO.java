package com.heytap.weather.vo;

/* JADX INFO: loaded from: classes3.dex */
public class DataExpiredVO {
    private long createTime;
    private Object object;

    public DataExpiredVO() {
    }

    public DataExpiredVO(Object obj, long j2) {
        this.object = obj;
        this.createTime = j2;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public Object getObject() {
        return this.object;
    }

    public void setCreateTime(long j2) {
        this.createTime = j2;
    }

    public void setObject(Object obj) {
        this.object = obj;
    }
}
