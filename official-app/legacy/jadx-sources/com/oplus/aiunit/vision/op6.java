package com.oplus.aiunit.vision;

import android.view.View;

/* JADX INFO: loaded from: classes16.dex */
public class op6 {
    public static View a(z62 z62Var, int i, String str) {
        pp6 w48Var;
        if (c(i)) {
            w48Var = new qoc();
        } else {
            w48Var = b(i) ? new w48() : null;
        }
        if (w48Var != null) {
            return w48Var.a(z62Var, i, str);
        }
        return null;
    }

    public static boolean b(int i) {
        return (i >= -16 && i < -1) || i == -100;
    }

    public static boolean c(int i) {
        return i == -1;
    }
}
