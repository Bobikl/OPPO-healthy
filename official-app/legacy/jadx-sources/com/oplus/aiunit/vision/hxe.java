package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes6.dex */
public class hxe {
    public String a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12304c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public String f12305e;

    public hxe(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.f12304c = i;
        this.d = str3;
        this.f12305e = str3;
    }

    public String toString() {
        return "ProcessedInfo{ipcSessionId='" + this.a + "', tackInfoId='" + this.b + "', code=" + this.f12304c + ", message='" + this.d + "'}";
    }

    public hxe(String str, String str2) {
        this.f12304c = 0;
        this.d = cxe.MSG_SUC;
        this.a = str;
        this.b = str2;
        this.f12305e = cxe.MSG_SUC;
    }
}
