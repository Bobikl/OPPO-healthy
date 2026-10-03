package com.oplus.aiunit.vision;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public class yo6 implements wp9 {
    public wp9 a;

    public static class b {
        public static final yo6 a = new yo6();
    }

    public static yo6 c() {
        return b.a;
    }

    @Override // com.oplus.aiunit.vision.wp9
    public String a(Context context) {
        wp9 wp9Var = this.a;
        return wp9Var == null ? "0" : wp9Var.a(context);
    }

    public void b(wp9 wp9Var) {
        this.a = wp9Var;
    }

    public yo6() {
        this.a = null;
    }
}
