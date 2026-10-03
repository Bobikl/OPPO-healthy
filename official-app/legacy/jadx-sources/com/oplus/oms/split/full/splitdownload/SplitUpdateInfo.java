package com.oplus.oms.split.full.splitdownload;

/* JADX INFO: loaded from: classes8.dex */
public class SplitUpdateInfo {
    public String a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f20016c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f20017e;
    public int f;

    public String getMd5() {
        return this.d;
    }

    public long getSize() {
        return this.f20016c;
    }

    public String getSplitName() {
        return this.a;
    }

    public String getUrl() {
        return this.b;
    }

    public int getVersionCode() {
        return this.f;
    }

    public String getVersionName() {
        return this.f20017e;
    }

    public void setMd5(String str) {
        this.d = str;
    }

    public void setSize(long j2) {
        this.f20016c = j2;
    }

    public void setSplitName(String str) {
        this.a = str;
    }

    public void setUrl(String str) {
        this.b = str;
    }

    public void setVersionCode(int i) {
        this.f = i;
    }

    public void setVersionName(String str) {
        this.f20017e = str;
    }
}
