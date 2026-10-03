package com.omron;

/* JADX INFO: loaded from: classes5.dex */
public class aq {
    private int a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f8817c;
    private int d;

    public aq(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.f8817c = str2;
    }

    public String a() {
        return this.f8817c;
    }

    public int b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public String toString() {
        return "DeviceModel{category=" + this.a + ", type='" + this.b + "', bleName='" + this.f8817c + "'}";
    }

    public void a(int i) {
        this.d = i;
    }
}
