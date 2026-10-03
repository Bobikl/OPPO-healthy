package com.heytap.accessory.base.bean;

/* JADX INFO: loaded from: classes14.dex */
public class a {
    public final long a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2430c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2431e;
    public String f;
    public int g;
    public int h;
    public FrameworkServiceDescription i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f2432j;

    public a(long j2, int i) {
        this.a = j2;
        this.b = i;
    }

    public void a(String str, int i, int i2, long j2, FrameworkServiceDescription frameworkServiceDescription) {
        this.f = str;
        this.h = i;
        this.g = i2;
        this.i = frameworkServiceDescription;
        this.f2432j = j2;
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.f2431e;
    }

    public int d() {
        return this.f2430c;
    }

    public int e() {
        return this.b;
    }

    public int f() {
        return this.g;
    }

    public String g() {
        return this.f;
    }

    public int h() {
        return this.h;
    }

    public FrameworkServiceDescription i() {
        return this.i;
    }

    public long j() {
        return this.f2432j;
    }

    public a(long j2, int i, int i2) {
        this.a = j2;
        this.b = i;
        this.f2430c = i2;
    }

    public void a(int i, int i2) {
        this.h = i2;
        this.g = i;
    }

    public a(long j2, int i, int i2, int i3, int i4) {
        this.a = j2;
        this.d = i;
        this.f2431e = i2;
        this.b = i3;
        this.f2430c = i4;
    }

    public long a() {
        return this.a;
    }
}
