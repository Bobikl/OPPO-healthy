package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes17.dex */
public class msc {
    public boolean a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14207c;

    public static msc a() {
        msc mscVar = new msc();
        mscVar.a = false;
        mscVar.b = yxj.d(22, 0);
        mscVar.f14207c = yxj.d(6, 0);
        return mscVar;
    }

    public msc b() {
        msc mscVar = new msc();
        mscVar.a = this.a;
        mscVar.b = this.b;
        mscVar.f14207c = this.f14207c;
        return mscVar;
    }

    public int c() {
        return this.f14207c;
    }

    public String d() {
        return sc8.g(this);
    }

    public int e() {
        return this.b;
    }

    public boolean f() {
        return this.a;
    }

    public void g(msc mscVar) {
        this.f14207c = mscVar.f14207c;
        this.b = mscVar.b;
        this.a = mscVar.a;
    }

    public void h(int i) {
        this.f14207c = i;
    }

    public void i(boolean z) {
        this.a = z;
    }

    public void j(int i) {
        this.b = i;
    }
}
