package com.oplus.aiunit.vision;

import android.content.Context;

/* JADX INFO: loaded from: classes15.dex */
public class p90 {
    public int a;
    public boolean b;

    public static p90 a(Context context) {
        p90 p90Var = new p90();
        p90Var.b = qe0.s();
        p90Var.a = c(context);
        return p90Var;
    }

    public static int c(Context context) {
        if (gxe.f(context)) {
            return 1;
        }
        if (gxe.k(context)) {
            return 4;
        }
        if (gxe.l(context)) {
            return 2;
        }
        if (gxe.h(context)) {
            return 8;
        }
        return gxe.j(context) ? 16 : Integer.MIN_VALUE;
    }

    public int b() {
        return this.a;
    }

    public boolean d() {
        return this.b;
    }

    public String toString() {
        return "AppEnv{process=" + this.a + ", debugType=" + this.b + "}  " + super.toString();
    }
}
