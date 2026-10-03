package com.oplus.aiunit.vision;

import android.content.Context;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class yp6 implements cr9 {
    public cr9 a;

    public static class b {
        public static final yp6 a = new yp6();
    }

    public static yp6 c() {
        return b.a;
    }

    @Override // com.oplus.aiunit.vision.cr9
    public String a(Context context) {
        cr9 cr9Var = this.a;
        return cr9Var == null ? "0" : cr9Var.a(context);
    }

    public void b(cr9 cr9Var) {
        this.a = cr9Var;
    }

    public yp6() {
        this.a = null;
    }
}
