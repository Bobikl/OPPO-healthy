package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes16.dex */
public class e3k {
    public long a;
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f12204c;
    public float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f12205e;
    public float f;
    public long g;
    public long h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f12206j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f12207l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12208n;

    public e3k() {
    }

    public long a() {
        return this.b;
    }

    public float b() {
        return this.d;
    }

    public float c() {
        return this.f12204c;
    }

    public float d() {
        return this.f12205e;
    }

    public float e() {
        return this.f12206j;
    }

    public float f() {
        return this.f;
    }

    public float g() {
        return this.k;
    }

    public long h() {
        return this.a;
    }

    public void i(long j2) {
        this.b = j2;
    }

    public void j(float f) {
        this.d = f;
    }

    public void k(float f) {
        this.f12204c = f;
    }

    public void l(long j2) {
        this.h = j2;
    }

    public void m(long j2) {
        this.m = j2;
    }

    public void n(float f) {
        this.f12205e = f;
    }

    public void o(float f) {
        this.f12206j = f;
    }

    public void p(float f) {
        this.f = f;
    }

    public void q(float f) {
        this.k = f;
    }

    public void r(long j2) {
        this.g = j2;
    }

    public void s(long j2) {
        this.f12207l = j2;
    }

    public void t(int i) {
        this.i = i;
    }

    public String toString() {
        return "TimeStampedCandleEntry{timestamp=" + this.a + ", endTimestamp=" + this.b + ", low=" + this.f12204c + ", high=" + this.d + ", middleHigh=" + this.f12205e + ", middleLow=" + this.f + ", middleStartTime=" + this.g + ", middleEndTime=" + this.h + ", middleType=" + this.i + ", middleHighV2=" + this.f12206j + ", middleLowV2=" + this.k + ", middleStartTimeV2=" + this.f12207l + ", middleEndTimeV2=" + this.m + ", middleTypeV2=" + this.f12208n + '}';
    }

    public void u(int i) {
        this.f12208n = i;
    }

    public void v(long j2) {
        this.a = j2;
    }

    public e3k(long j2, float f, float f2, float f3, float f4) {
        this.a = j2;
        this.f12204c = f2;
        this.d = f;
        this.f12205e = f3;
        this.f = f4;
    }
}