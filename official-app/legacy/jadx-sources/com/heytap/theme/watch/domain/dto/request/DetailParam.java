package com.heytap.theme.watch.domain.dto.request;

import io.protostuff.Tag;

/* JADX INFO: loaded from: classes17.dex */
public class DetailParam {

    @Tag(101)
    private long masterId;

    @Tag(104)
    private String packageName;

    @Tag(102)
    private String token;

    @Tag(103)
    private int type;

    public long getMasterId() {
        return this.masterId;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getToken() {
        return this.token;
    }

    public int getType() {
        return this.type;
    }

    public void setMasterId(long j2) {
        this.masterId = j2;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String toString() {
        return "DetailParam{masterId=" + this.masterId + ", token='" + this.token + "', type=" + this.type + ", packageName='" + this.packageName + "'}";
    }
}
