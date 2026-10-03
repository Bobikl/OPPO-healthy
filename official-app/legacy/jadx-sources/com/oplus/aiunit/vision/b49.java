package com.oplus.aiunit.vision;

import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public class b49 {
    public long a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9591c;

    public b49() {
    }

    public int a() {
        return this.f9591c;
    }

    public int b() {
        return this.b;
    }

    public long c() {
        return this.a;
    }

    public void d(int i) {
        this.f9591c = i;
    }

    public void e(int i) {
        this.b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b49) && this.a == ((b49) obj).a;
    }

    public void f(long j2) {
        this.a = j2;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.a));
    }

    public b49(long j2, int i, int i2) {
        this.a = j2;
        this.b = i;
        this.f9591c = i2;
    }
}
