package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes13.dex */
public class ki2 extends rki {
    public static final boolean DEBUG;
    public static final String TAG = "GradualStopOverScroller";
    public final int s;
    public ji2 t;

    public static class a extends rki.c {
        public double S = 5.0d;
        public double T = 0.05d;
        public ji2 U;

        public a(ji2 ji2Var) {
            this.U = ji2Var;
        }

        public final void Q(int i) {
            int iY = y();
            if (iY == 0) {
                return;
            }
            float fD = this.U.d(i);
            boolean z = ki2.DEBUG;
            if (z) {
                Log.d(ki2.TAG, this + "[ simulateSplineDistance = " + iY + " edgeDistance = " + fD + " ]");
            }
            if (fD != 0.0f && Math.abs(iY) <= Math.abs(fD)) {
                j(0.0f);
                R();
                return;
            }
            float fJ = this.U.j(i, iY);
            if (z) {
                Log.d(ki2.TAG, this + "[ adaptDistance = " + fJ + " ]");
            }
            if (fJ != 0.0f) {
                j(fJ);
            }
        }

        public boolean R() {
            int iE = (int) this.U.e();
            if (ki2.DEBUG) {
                Log.d(ki2.TAG, this + " childCenterDiff " + iE + " ]");
            }
            return L(0, iE, iE, true);
        }

        @Override // com.oplus.aiunit.vision.rki.c
        public void p(int i, int i2, int i3, int i4, int i5) {
            super.p(i, i2, i3, i4, i5);
            Q(i4);
        }

        @Override // com.oplus.aiunit.vision.rki.c
        public double s() {
            return this.T;
        }

        @Override // com.oplus.aiunit.vision.rki.c
        public double x() {
            return this.S;
        }

        @Override // com.oplus.aiunit.vision.rki.c
        public double z(float f) {
            return 1.0d;
        }
    }

    static {
        DEBUG = bj2.LOG_DEBUG || bj2.e(TAG, 3);
    }

    public ki2(Context context, ji2 ji2Var) {
        super(context, null);
        this.s = 10000;
        this.t = ji2Var;
        this.a = new a(ji2Var);
        this.b = new a(ji2Var);
    }

    public boolean E(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int iE = (int) this.t.e();
        if (iE == 0) {
            return false;
        }
        if (DEBUG) {
            Log.d(TAG, this + " childCenterDiff " + iE + " ]");
        }
        if (i == 0) {
            i4 = iE;
            i5 = i4;
            i2 = 0;
            i3 = 0;
        } else {
            i2 = iE;
            i3 = i2;
            i4 = 0;
            i5 = 0;
        }
        springBack(0, 0, i4, i5, i2, i3);
        return true;
    }
}
