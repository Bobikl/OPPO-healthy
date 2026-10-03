package com.oplus.aiunit.vision;

import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public class cfl {
    public String a = "";
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f10069c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n4h f10070e;
    public yy9 f;

    public yy9 a() {
        return this.f;
    }

    public String b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public float d() {
        return this.f10069c;
    }

    public n4h e() {
        return this.f10070e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cfl cflVar = (cfl) obj;
        return this.b == cflVar.b && Objects.equals(this.a, cflVar.a) && Objects.equals(this.d, cflVar.d) && Objects.equals(this.f10070e, cflVar.f10070e) && Objects.equals(this.f, cflVar.f);
    }

    public void f(yy9 yy9Var) {
        this.f = yy9Var;
    }

    public void g(String str) {
        this.d = str;
    }

    public void h(String str) {
        this.a = str;
    }

    public int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.d, this.f10070e, this.f);
    }

    public void i(int i) {
        this.b = i;
    }

    public void j(float f) {
        this.f10069c = f;
    }

    public void k(n4h n4hVar) {
        this.f10070e = n4hVar;
    }

    public String toString() {
        return "WatchFaceWarrper{ortherUrl='" + this.a + "', radius=" + this.b + ", deviceModel='" + this.d + "', mSimpleWatchFaceBean=" + this.f10070e + ", mBandSimpleWatchFaceBeans=" + this.f + '}';
    }
}
