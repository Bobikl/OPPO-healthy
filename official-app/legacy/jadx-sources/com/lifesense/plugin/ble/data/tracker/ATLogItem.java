package com.lifesense.plugin.ble.data.tracker;

import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes5.dex */
public class ATLogItem {
    private String date;
    private int errorCode;
    private String errorContent;
    private int invertLen;
    private int len;
    private long utc;

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorContent() {
        return this.errorContent;
    }

    public int getInvertLen() {
        return this.invertLen;
    }

    public int getLen() {
        return this.len;
    }

    public long getUtc() {
        return this.utc;
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
    }

    public void setErrorContent(String str) {
        this.errorContent = str;
    }

    public void setInvertLen(int i) {
        this.invertLen = i;
    }

    public void setLen(int i) {
        this.len = i;
    }

    public void setUtc(long j2) {
        this.utc = j2;
        this.date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.valueOf(j2 * 1000));
    }

    public String toString() {
        return "ATLogItem [utc=" + this.utc + ", date=" + this.date + ", errorCode=" + this.errorCode + ", len=" + this.len + ", invertLen=" + this.invertLen + ", errorContent=" + this.errorContent + "]";
    }
}
