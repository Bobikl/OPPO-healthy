package com.autonavi.aps.amapapi.restruct;

import com.cloud.sdk.cloudstorage.common.ErrorInfo;

/* JADX INFO: loaded from: classes13.dex */
public final class d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1126l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1127n;
    public int a = 0;
    public int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1123c = 0;
    public int d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f1124e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public int i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1125j = 0;
    public int k = ErrorInfo.OC_OPTION_ERROR_DIR;
    public short m = 0;
    public int o = 32767;
    public int p = Integer.MAX_VALUE;
    public int q = Integer.MAX_VALUE;
    public boolean r = true;
    public int s = 99;
    public long t = 0;

    public d(int i, boolean z) {
        this.f1126l = i;
        this.f1127n = z;
    }

    private String e() {
        int i = this.f1126l;
        return this.f1126l + "#" + this.a + "#" + this.b + "#0#" + a();
    }

    private String f() {
        return this.f1126l + "#" + this.h + "#" + this.i + "#" + this.f1125j;
    }

    public final long a() {
        return this.f1126l == 5 ? this.f1124e : this.d;
    }

    public final String b() {
        int i = this.f1126l;
        if (i != 1) {
            if (i == 2) {
                return f();
            }
            if (i != 3 && i != 4 && i != 5) {
                return null;
            }
        }
        return e();
    }

    public final String c() {
        String strB = b();
        if (strB == null || strB.length() <= 0) {
            return "";
        }
        return (this.r ? 1 : 0) + "#" + strB;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final d clone() {
        d dVar = new d(this.f1126l, this.f1127n);
        dVar.a = this.a;
        dVar.b = this.b;
        dVar.f1123c = this.f1123c;
        dVar.d = this.d;
        dVar.f1124e = this.f1124e;
        dVar.f = this.f;
        dVar.g = this.g;
        dVar.h = this.h;
        dVar.i = this.i;
        dVar.f1125j = this.f1125j;
        dVar.k = this.k;
        dVar.m = this.m;
        dVar.o = this.o;
        dVar.p = this.p;
        dVar.q = this.q;
        dVar.r = this.r;
        dVar.s = this.s;
        dVar.t = this.t;
        return dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof d)) {
            d dVar = (d) obj;
            int i = dVar.f1126l;
            if (i != 1) {
                if (i == 2) {
                    return this.f1126l == 2 && dVar.f1125j == this.f1125j && dVar.i == this.i && dVar.h == this.h;
                }
                if (i == 3) {
                    return this.f1126l == 3 && dVar.f1123c == this.f1123c && dVar.d == this.d && dVar.b == this.b;
                }
                if (i != 4) {
                    return i == 5 && this.f1126l == 5 && dVar.f1123c == this.f1123c && dVar.f1124e == this.f1124e && dVar.q == this.q;
                }
                return this.f1126l == 4 && dVar.f1123c == this.f1123c && dVar.d == this.d && dVar.b == this.b;
            }
            if (this.f1126l == 1 && dVar.f1123c == this.f1123c && dVar.d == this.d && dVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3 = String.valueOf(this.f1126l).hashCode();
        if (this.f1126l == 2) {
            iHashCode = String.valueOf(this.f1125j).hashCode() + String.valueOf(this.i).hashCode();
            iHashCode2 = String.valueOf(this.h).hashCode();
        } else {
            iHashCode = String.valueOf(this.f1123c).hashCode() + String.valueOf(this.d).hashCode();
            iHashCode2 = String.valueOf(this.b).hashCode();
        }
        return iHashCode3 + iHashCode + iHashCode2;
    }
}
