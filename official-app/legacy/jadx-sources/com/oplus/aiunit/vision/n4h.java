package com.oplus.aiunit.vision;

import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
public class n4h {
    public String a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14336c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14337e;
    public boolean f;
    public String g;

    public String a() {
        return this.b;
    }

    public int b() {
        return this.f14336c;
    }

    public int c() {
        return this.f14337e;
    }

    public int d() {
        return this.d;
    }

    public String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        n4h n4hVar = (n4h) obj;
        return this.f14336c == n4hVar.f14336c && this.d == n4hVar.d && this.f14337e == n4hVar.f14337e && Objects.equals(this.a, n4hVar.a) && Objects.equals(Boolean.valueOf(this.f), Boolean.valueOf(n4hVar.f)) && Objects.equals(this.b, n4hVar.b);
    }

    public String f() {
        return this.a;
    }

    public boolean g() {
        return this.f;
    }

    public void h(boolean z) {
        this.f = z;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.f14336c), Boolean.valueOf(this.f), Integer.valueOf(this.d), Integer.valueOf(this.f14337e));
    }

    public void i(String str) {
        this.b = str;
    }

    public void j(int i) {
        this.f14336c = i;
    }

    public void k(int i) {
        this.f14337e = i;
    }

    public void l(int i) {
        this.d = i;
    }

    public void m(String str) {
        this.g = str;
    }

    public void n(String str) {
        this.a = str;
    }

    public String toString() {
        return "SimpleWatchFaceBean{wfUnique='" + this.a + "', previewUrl='" + this.b + "', radius=" + this.f14336c + ", isCreationWf=" + this.f + ", screen_width=" + this.d + ", screen_height=" + this.f14337e + '}';
    }
}
