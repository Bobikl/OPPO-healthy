package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes18.dex */
public class ihg {
    public Bundle a = new Bundle();

    public static ihg a() {
        return new ihg();
    }

    public void b(Context context, String str) {
        x81.d(context, str, this.a.isEmpty() ? null : this.a);
    }

    public void c(Context context, String str, int i, int i2, q50 q50Var) {
        x81.g(context, str, this.a.isEmpty() ? null : this.a, i, i2, q50Var);
    }

    public ihg d(String str, boolean z) {
        this.a.putBoolean(str, z);
        return this;
    }

    public ihg e(String str, int i) {
        this.a.putInt(str, i);
        return this;
    }

    public ihg f(String str, String str2) {
        this.a.putString(str, str2);
        return this;
    }
}
