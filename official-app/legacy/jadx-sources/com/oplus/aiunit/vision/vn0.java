package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class vn0 {

    @Nullable
    public static volatile y12 a;

    public static boolean a(y12 y12Var) {
        if (y12Var == null) {
            throw new NullPointerException("defaultChecker == null");
        }
        y12 y12Var2 = a;
        try {
            return y12Var2 == null ? y12Var.getAsBoolean() : y12Var2.getAsBoolean();
        } catch (Throwable th) {
            throw hu6.a(th);
        }
    }
}
