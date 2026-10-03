package com.oplus.aiunit.vision;

import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import com.oplus.smartenginehelper.entity.ViewEntity;

/* JADX INFO: loaded from: classes13.dex */
public final class b56 implements c56 {
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SparseIntArray f9603j;
    public final c56 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9604l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9605n;
    public int o;
    public int p;

    public b56(String str, @NonNull c56 c56Var) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.f9603j = sparseIntArray;
        this.f9604l = 0;
        this.m = 0;
        this.f9605n = true;
        this.o = 0;
        this.p = 0;
        this.i = str;
        this.k = c56Var;
        sparseIntArray.put(16842908, 2);
        sparseIntArray.put(16843623, 4);
        sparseIntArray.put(1, 1);
        sparseIntArray.put(16842913, 8);
        sparseIntArray.put(16842919, 16);
        sparseIntArray.put(16842910, 32);
    }

    public void A() {
        this.f9604l = 1;
        w(1, false);
    }

    @Override // com.oplus.aiunit.vision.c56
    public void a() {
        this.f9604l = 0;
        w(1, true);
    }

    @Override // com.oplus.aiunit.vision.c56
    public void b() {
        w(16842908, false);
    }

    @Override // com.oplus.aiunit.vision.c56
    public void c() {
        w(16843623, true);
    }

    @Override // com.oplus.aiunit.vision.c56
    public void d(int i, boolean z, boolean z2, boolean z3) {
        if (z) {
            this.p = this.f9603j.get(i) | this.p;
        } else {
            this.p = (~this.f9603j.get(i)) & this.p;
        }
    }

    @Override // com.oplus.aiunit.vision.c56
    public void e(int i) {
        this.k.e(i);
    }

    @Override // com.oplus.aiunit.vision.c56
    public void f() {
        this.f9604l = 0;
        w(1, false);
    }

    public final void g(int[] iArr, int i) {
        boolean z = false;
        for (int i2 : iArr) {
            if (i2 == i) {
                z = true;
                break;
            }
        }
        if (!(z && (this.o & this.f9603j.get(i)) == 0) && (z || (this.o & this.f9603j.get(i)) == 0)) {
            return;
        }
        w(i, z);
    }

    public String h(int i) {
        switch (i) {
            case 1:
                return "touch entered #" + l();
            case 16842908:
                return "focused";
            case 16842910:
                return ViewEntity.ENABLED;
            case 16842913:
                return "selected";
            case 16842919:
                return "pressed";
            case 16843623:
                return "hovered";
            default:
                return "Unknown";
        }
    }

    @Override // com.oplus.aiunit.vision.c56
    public void i() {
        w(16843623, false);
    }

    @Override // com.oplus.aiunit.vision.c56
    public void j() {
        w(16842908, true);
    }

    public int k() {
        return this.f9604l;
    }

    public final String l() {
        int i = this.f9604l;
        if (i != 0) {
            return i != 1 ? "Unknown" : "selected";
        }
        return "pressed";
    }

    public boolean m() {
        return this.f9605n;
    }

    public boolean n() {
        return (this.f9603j.get(16842910) & this.o) != 0;
    }

    public boolean o() {
        return (this.f9603j.get(16842908) & this.o) != 0;
    }

    public boolean p() {
        return (this.f9603j.get(16843623) & this.o) != 0;
    }

    public boolean q(int i) {
        return (this.m & i) == 0;
    }

    public boolean r() {
        return (this.f9603j.get(16842919) & this.o) != 0;
    }

    public boolean s() {
        return (this.f9603j.get(16842913) & this.o) != 0;
    }

    public boolean t(int i) {
        return (this.f9603j.get(i) & this.p) != 0;
    }

    public boolean u() {
        return true;
    }

    public boolean v() {
        return (this.f9603j.get(1) & this.o) != 0;
    }

    public final void w(int i, boolean z) {
        if (((this.o & this.f9603j.get(i)) != 0 && z) || ((this.o & this.f9603j.get(i)) == 0 && !z)) {
            bj2.d(this.i, "state " + h(i) + " not changed: " + z);
            if (i != 1) {
                return;
            }
        }
        boolean z2 = (this.o & this.f9603j.get(i)) != 0;
        int i2 = this.o;
        int i3 = this.f9603j.get(i);
        this.o = z ? i2 | i3 : i2 & (~i3);
        e(i);
        bj2.a(this.i, "state " + h(i) + " changed from " + z2 + " to " + z);
    }

    public void x(int[] iArr) {
        if (q(32)) {
            g(iArr, 16842910);
        }
        if (q(2)) {
            g(iArr, 16842908);
        }
        if (q(4)) {
            g(iArr, 16843623);
        }
        if (q(8)) {
            g(iArr, 16842913);
        }
        if (q(16)) {
            g(iArr, 16842919);
        }
    }

    public void y(boolean z) {
        this.f9605n = z;
    }

    public void z() {
        this.f9604l = 1;
        w(1, true);
    }
}
