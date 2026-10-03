package com.lifesense.android.bluetooth.core.business.log;

/* JADX INFO: loaded from: classes4.dex */
public class b {
    public String a;
    public com.lifesense.android.bluetooth.core.business.log.report.a b;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f8580e;
    public int f;
    public boolean g = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8579c = false;

    public com.lifesense.android.bluetooth.core.business.log.report.a a() {
        return this.b;
    }

    public int b() {
        return this.f;
    }

    public String c() {
        return this.a;
    }

    public String d() {
        return this.d;
    }

    public String e() {
        return this.f8580e;
    }

    public boolean f() {
        return this.g;
    }

    public boolean g() {
        return this.f8579c;
    }

    public String toString() {
        return "LogInfo [macAddress=" + this.a + ", eventType=" + this.b + ", isSuccess=" + this.f8579c + ", message=" + this.d + ", type=" + this.f8580e + ", logLevel=" + this.f + ", isSaveFile=" + this.g + "]";
    }

    public void a(int i) {
        this.f = i;
    }

    public void b(String str) {
        this.d = str;
    }

    public void c(String str) {
        this.f8580e = str;
    }

    public void a(com.lifesense.android.bluetooth.core.business.log.report.a aVar) {
        this.b = aVar;
    }

    public void b(boolean z) {
        this.f8579c = z;
    }

    public void a(String str) {
        this.a = str;
    }

    public void a(boolean z) {
        this.g = z;
    }
}
