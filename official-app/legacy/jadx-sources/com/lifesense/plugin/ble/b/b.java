package com.lifesense.plugin.ble.b;

/* JADX INFO: loaded from: classes5.dex */
public class b {
    private String a;
    private com.lifesense.plugin.ble.b.a.a b;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f8697e;
    private int f;
    private boolean g = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8696c = false;

    public String a() {
        return this.a;
    }

    public com.lifesense.plugin.ble.b.a.a b() {
        return this.b;
    }

    public void c(String str) {
        this.f8697e = str;
    }

    public String d() {
        return this.d;
    }

    public String e() {
        return this.f8697e;
    }

    public int f() {
        return this.f;
    }

    public boolean g() {
        return this.g;
    }

    public String toString() {
        return "LogInfo [macAddress=" + this.a + ", eventType=" + this.b + ", isSuccess=" + this.f8696c + ", message=" + this.d + ", type=" + this.f8697e + ", logLevel=" + this.f + ", isSaveFile=" + this.g + "]";
    }

    public void a(int i) {
        this.f = i;
    }

    public void b(String str) {
        this.d = str;
    }

    public boolean c() {
        return this.f8696c;
    }

    public void a(com.lifesense.plugin.ble.b.a.a aVar) {
        this.b = aVar;
    }

    public void b(boolean z) {
        this.g = z;
    }

    public void a(String str) {
        this.a = str;
    }

    public void a(boolean z) {
        this.f8696c = z;
    }
}
