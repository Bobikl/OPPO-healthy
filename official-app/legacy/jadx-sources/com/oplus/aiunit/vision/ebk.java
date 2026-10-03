package com.oplus.aiunit.vision;

import android.util.SparseIntArray;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes16.dex */
public class ebk extends fs4 {
    public static final int TYPE_NOTSUPPORT = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10851c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10852e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f10853j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f10854l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f10855n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public SparseIntArray u;

    public ebk(@Nullable byte[] bArr) {
        super(bArr);
        this.f10851c = 0;
        this.d = 1;
        this.f10852e = 2;
        this.f = 3;
        this.g = 4;
        this.h = 5;
        this.i = 6;
        this.f10853j = 7;
        this.k = 8;
        this.f10854l = 9;
        this.m = 10;
        this.f10855n = 11;
        this.o = 12;
        this.p = 13;
        this.q = 14;
        this.r = 15;
        this.s = 16;
        this.t = 17;
        this.u = new SparseIntArray();
        j();
    }

    public Integer e() {
        int i = this.u.get(14, -1);
        if (i != -1) {
            return b(18, i);
        }
        return -1;
    }

    public Integer f() {
        int i = this.u.get(12, -1);
        if (i != -1) {
            return b(17, i);
        }
        return -1;
    }

    public Integer g() {
        int i = this.u.get(0, -1);
        if (i != -1) {
            return b(18, i);
        }
        return -1;
    }

    public Integer h() {
        int i = this.u.get(2, -1);
        if (i != -1) {
            return b(19, i);
        }
        return -1;
    }

    public Integer i() {
        int i = this.u.get(9, -1);
        if (i != -1) {
            return b(18, i);
        }
        return -1;
    }

    public final void j() {
        int i;
        this.u.put(0, 2);
        if (l()) {
            this.u.put(1, 4);
            i = 6;
        } else {
            i = 4;
        }
        if (w()) {
            this.u.put(2, i);
            i += 3;
        }
        if (s()) {
            this.u.put(3, i);
            int i2 = i + 2;
            this.u.put(4, i2);
            i = i2 + 2;
        }
        if (o()) {
            this.u.put(5, i);
            int i3 = i + 2;
            this.u.put(6, i3);
            i = i3 + 2;
        }
        if (t()) {
            this.u.put(7, i);
            i++;
        }
        if (k()) {
            this.u.put(8, i);
            i++;
        }
        if (p()) {
            this.u.put(9, i);
            int i4 = i + 2;
            this.u.put(10, i4);
            int i5 = i4 + 2;
            this.u.put(11, i5);
            i = i5 + 1;
        }
        if (r()) {
            this.u.put(12, i);
            i++;
        }
        if (u()) {
            this.u.put(13, i);
            i++;
        }
        if (n()) {
            this.u.put(14, i);
            i += 2;
        }
        if (v()) {
            this.u.put(15, i);
            i += 2;
        }
        if (q()) {
            this.u.put(16, i);
            this.u.put(17, i + 2);
        }
    }

    public boolean k() {
        return a(0, 6);
    }

    public boolean l() {
        return a(0, 1);
    }

    public boolean m() {
        Integer numG = g();
        Integer num = 0;
        if (numG.intValue() == -1) {
            numG = num;
        }
        Integer numE = e();
        return numG.intValue() > 0 && (numE.intValue() != -1 ? numE : 0).intValue() > 0;
    }

    public boolean n() {
        return a(1, 2);
    }

    public boolean o() {
        return a(0, 4);
    }

    public boolean p() {
        return a(0, 7);
    }

    public boolean q() {
        return a(1, 4);
    }

    public boolean r() {
        return a(1, 0);
    }

    public boolean s() {
        return a(0, 3);
    }

    public boolean t() {
        return a(0, 5);
    }

    public boolean u() {
        return a(1, 1);
    }

    public boolean v() {
        return a(1, 3);
    }

    public boolean w() {
        return a(0, 2);
    }
}
