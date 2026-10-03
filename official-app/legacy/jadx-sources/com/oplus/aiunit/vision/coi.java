package com.oplus.aiunit.vision;

import com.heytap.health.watchface.network.bean.WatchFaceHomeCard;

/* JADX INFO: loaded from: classes19.dex */
public class coi extends o41 {
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10177c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f10178e;
    public String f;
    public String g;
    public int h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f10179j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f10180l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f10181n;
    public x72 o;
    public WatchFaceHomeCard.Item p;
    public int q;
    public int r;
    public int s;
    public int t;

    public coi() {
        super(0);
    }

    public void A(int i) {
        this.i = i;
    }

    public void B(String str) {
        this.d = str;
    }

    public void C(long j2) {
        this.f10181n = j2;
    }

    public void D(int i) {
        this.s = i;
    }

    public void E(int i) {
        this.t = i;
    }

    public void F(int i) {
        this.q = i;
    }

    public void G(int i) {
        this.r = i;
    }

    public void H(long j2) {
        this.f10180l = j2;
    }

    public void I(String str) {
        this.g = str;
    }

    public void J(long j2) {
        this.m = j2;
    }

    public void K(int i) {
        this.h = i;
    }

    public void L(long j2) {
        this.f10177c = j2;
    }

    public void M(String str) {
        this.f10178e = str;
    }

    public void N(String str) {
        this.f = str;
    }

    public x72 b() {
        return this.o;
    }

    public WatchFaceHomeCard.Item c() {
        return this.p;
    }

    public String d() {
        return this.k;
    }

    public long e() {
        return this.b;
    }

    public int f() {
        return this.i;
    }

    public String g() {
        return this.d;
    }

    public long h() {
        return this.f10181n;
    }

    public int i() {
        return this.s;
    }

    public int j() {
        return this.t;
    }

    public int k() {
        return this.q;
    }

    public int l() {
        return this.r;
    }

    public long m() {
        return this.f10180l;
    }

    public String n() {
        return this.g;
    }

    public long o() {
        return this.m;
    }

    public int p() {
        return this.h;
    }

    public long q() {
        return this.f10177c;
    }

    public String r() {
        return this.f10178e;
    }

    public String s() {
        return this.f;
    }

    public boolean t() {
        return this.i == 0;
    }

    public String toString() {
        return "StatusInfoItem{masterId=" + this.b + ", versionId=" + this.f10177c + ", wfName='" + this.f10178e + "', wfUnique='" + this.f + "', tag='" + this.g + "', version=" + this.h + ", pay=" + this.i + ", isNotSupport=" + this.f10179j + ", mBtnStatusBean=" + this.o + '}';
    }

    public boolean u() {
        return this.f10179j;
    }

    public void v(x72 x72Var) {
        this.o = x72Var;
    }

    public void w(WatchFaceHomeCard.Item item) {
        this.p = item;
    }

    public void x(String str) {
        this.k = str;
    }

    public void y(long j2) {
        this.b = j2;
    }

    public void z(boolean z) {
        this.f10179j = z;
    }
}
