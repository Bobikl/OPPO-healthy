package com.oplus.aiunit.vision;

import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public class xj0 implements Iterable<vj0>, Comparator<vj0>, Comparable<xj0> {
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wg0<vj0> f18653j = new wg0<>();
    public boolean k = true;

    public int d() {
        o();
        int i = this.f18653j.f18241j;
        long jHashCode = this.i + 71;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 7) & 65535;
            jHashCode += this.i * ((long) this.f18653j.get(i3).hashCode()) * ((long) i2);
        }
        return (int) ((jHashCode >> 32) ^ jHashCode);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final int compare(vj0 vj0Var, vj0 vj0Var2) {
        return (int) (vj0Var.i - vj0Var2.i);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof xj0)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return m((xj0) obj, true);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(xj0 xj0Var) {
        if (xj0Var == this) {
            return 0;
        }
        long j2 = this.i;
        long j3 = xj0Var.i;
        if (j2 != j3) {
            return j2 < j3 ? -1 : 1;
        }
        o();
        xj0Var.o();
        int i = 0;
        while (true) {
            wg0<vj0> wg0Var = this.f18653j;
            if (i >= wg0Var.f18241j) {
                return 0;
            }
            int iCompareTo = wg0Var.get(i).compareTo(xj0Var.f18653j.get(i));
            if (iCompareTo != 0) {
                if (iCompareTo < 0) {
                    return -1;
                }
                return iCompareTo > 0 ? 1 : 0;
            }
            i++;
        }
    }

    public final void h(long j2) {
        this.i = j2 | this.i;
    }

    public int hashCode() {
        return d();
    }

    public final boolean i(long j2) {
        return j2 != 0 && (this.i & j2) == j2;
    }

    @Override // java.lang.Iterable
    public final Iterator<vj0> iterator() {
        return this.f18653j.iterator();
    }

    public int l(long j2) {
        if (!i(j2)) {
            return -1;
        }
        int i = 0;
        while (true) {
            wg0<vj0> wg0Var = this.f18653j;
            if (i >= wg0Var.f18241j) {
                return -1;
            }
            if (wg0Var.get(i).i == j2) {
                return i;
            }
            i++;
        }
    }

    public final boolean m(xj0 xj0Var, boolean z) {
        if (xj0Var == this) {
            return true;
        }
        if (xj0Var == null || this.i != xj0Var.i) {
            return false;
        }
        if (!z) {
            return true;
        }
        o();
        xj0Var.o();
        int i = 0;
        while (true) {
            wg0<vj0> wg0Var = this.f18653j;
            if (i >= wg0Var.f18241j) {
                return true;
            }
            if (!wg0Var.get(i).b(xj0Var.f18653j.get(i))) {
                return false;
            }
            i++;
        }
    }

    public final void n(vj0 vj0Var) {
        int iL = l(vj0Var.i);
        if (iL < 0) {
            h(vj0Var.i);
            this.f18653j.a(vj0Var);
            this.k = false;
        } else {
            this.f18653j.k(iL, vj0Var);
        }
        o();
    }

    public final void o() {
        if (this.k) {
            return;
        }
        this.f18653j.sort(this);
        this.k = true;
    }
}
