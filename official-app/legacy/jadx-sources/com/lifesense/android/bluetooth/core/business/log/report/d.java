package com.lifesense.android.bluetooth.core.business.log.report;

/* JADX INFO: loaded from: classes4.dex */
public class d {
    public boolean a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8588e;
    public boolean f;
    public String h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f8589j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8587c = false;
    public boolean b = false;
    public boolean d = false;
    public boolean g = false;

    public d(boolean z) {
        this.a = z;
        this.f = z;
        this.f8588e = z;
    }

    public String a() {
        return this.f8589j;
    }

    public String b() {
        return this.h;
    }

    public String c() {
        return this.i;
    }

    public boolean d() {
        return this.f;
    }

    public boolean e() {
        return this.a;
    }

    public String toString() {
        return "BleReportProfiles [sdkPermission=" + this.a + ", automaticUploadErrorReport=" + this.b + ", automaticUploadActionReport=" + this.f8587c + ", automaticUploadStatisticReport=" + this.d + ", saveErrorReport=" + this.f8588e + ", saveActionReport=" + this.f + ", saveStatisticReport=" + this.g + ", filePath=" + this.h + ", userName=" + this.i + ", appVersion=" + this.f8589j + "]";
    }

    public void a(String str) {
        this.f8589j = str;
    }

    public void b(String str) {
        this.h = str;
    }

    public void c(String str) {
        this.i = str;
    }

    public void a(boolean z) {
        this.a = z;
        this.f = z;
        this.f8588e = z;
    }
}
