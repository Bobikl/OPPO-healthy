package com.lifesense.plugin.ble.b.a;

/* JADX INFO: loaded from: classes5.dex */
public class h {
    private boolean a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f8689e;
    private boolean f;
    private String h;
    private String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f8690j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8688c = false;
    private boolean b = false;
    private boolean d = false;
    private boolean g = false;

    public h(boolean z) {
        this.a = z;
        this.f = z;
        this.f8689e = z;
    }

    public String a() {
        return this.h;
    }

    public String b() {
        return this.i;
    }

    public String c() {
        return this.f8690j;
    }

    public boolean d() {
        return this.f;
    }

    public boolean e() {
        return this.a;
    }

    public String toString() {
        return "BleReportProfiles [sdkPermission=" + this.a + ", automaticUploadErrorReport=" + this.b + ", automaticUploadActionReport=" + this.f8688c + ", automaticUploadStatisticReport=" + this.d + ", saveErrorReport=" + this.f8689e + ", saveActionReport=" + this.f + ", saveStatisticReport=" + this.g + ", filePath=" + this.h + ", userName=" + this.i + ", appVersion=" + this.f8690j + "]";
    }

    public void a(String str) {
        this.h = str;
    }

    public void b(String str) {
        this.i = str;
    }

    public void c(String str) {
        this.f8690j = str;
    }

    public void a(boolean z) {
        this.a = z;
        this.f = z;
        this.f8689e = z;
    }
}
