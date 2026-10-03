package com.oplus.aiunit.vision;

import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public class fo1 extends b49 {
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11443e;
    public int f;
    public int g;
    public int h;
    public int i;

    public fo1() {
    }

    @Override // com.oplus.aiunit.vision.b49
    public int a() {
        return this.f;
    }

    @Override // com.oplus.aiunit.vision.b49
    public int b() {
        return this.f11443e;
    }

    @Override // com.oplus.aiunit.vision.b49
    public long c() {
        return this.d;
    }

    @Override // com.oplus.aiunit.vision.b49
    public void d(int i) {
        this.f = i;
    }

    @Override // com.oplus.aiunit.vision.b49
    public void e(int i) {
        this.f11443e = i;
    }

    @Override // com.oplus.aiunit.vision.b49
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fo1) && this.d == ((fo1) obj).d;
    }

    @Override // com.oplus.aiunit.vision.b49
    public void f(long j2) {
        this.d = j2;
    }

    public int g() {
        return this.g;
    }

    public int h() {
        return this.h;
    }

    @Override // com.oplus.aiunit.vision.b49
    public int hashCode() {
        return Objects.hash(Long.valueOf(this.d));
    }

    public int i() {
        return this.i;
    }

    public void j(int i) {
        this.g = i;
    }

    public void k(int i) {
        this.h = i;
    }

    public void l(int i) {
        this.i = i;
    }

    public fo1(long j2, int i, int i2, int i3, int i4) {
        this.d = j2;
        this.f11443e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }
}
