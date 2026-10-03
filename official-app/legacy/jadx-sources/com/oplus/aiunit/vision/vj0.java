package com.oplus.aiunit.vision;

import com.badlogic.gdx.utils.GdxRuntimeException;

/* JADX INFO: loaded from: classes13.dex */
public abstract class vj0 implements Comparable<vj0> {
    public static final wg0<String> k = new wg0<>();
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f17877j;

    public vj0(long j2) {
        this.i = j2;
        this.f17877j = Long.numberOfTrailingZeros(j2);
    }

    public static final String d(long j2) {
        int i = -1;
        while (j2 != 0 && (i = i + 1) < 63 && ((j2 >> i) & 1) == 0) {
        }
        if (i >= 0) {
            wg0<String> wg0Var = k;
            if (i < wg0Var.f18241j) {
                return wg0Var.get(i);
            }
        }
        return null;
    }

    public static final long e(String str) {
        int i = 0;
        while (true) {
            wg0<String> wg0Var = k;
            if (i >= wg0Var.f18241j) {
                return 0L;
            }
            if (wg0Var.get(i).compareTo(str) == 0) {
                return 1 << i;
            }
            i++;
        }
    }

    public static final long g(String str) {
        long jE = e(str);
        if (jE > 0) {
            return jE;
        }
        wg0<String> wg0Var = k;
        if (wg0Var.f18241j < 64) {
            wg0Var.a(str);
            return 1 << (wg0Var.f18241j - 1);
        }
        throw new GdxRuntimeException("Cannot register " + str + ", maximum registered attribute count reached.");
    }

    public boolean b(vj0 vj0Var) {
        return vj0Var.hashCode() == hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vj0)) {
            return false;
        }
        vj0 vj0Var = (vj0) obj;
        if (this.i != vj0Var.i) {
            return false;
        }
        return b(vj0Var);
    }

    public int hashCode() {
        return this.f17877j * 7489;
    }

    public String toString() {
        return d(this.i);
    }
}
