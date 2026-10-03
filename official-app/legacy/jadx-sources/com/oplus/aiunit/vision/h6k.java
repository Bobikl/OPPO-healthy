package com.oplus.aiunit.vision;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public class h6k {
    public long a;
    public bu6 b;

    public h6k(Context context, long j2) {
        w84.b(context);
        this.a = j2;
    }

    public static h6k a(Context context, long j2) {
        return new h6k(context, j2);
    }

    public bu6 b() {
        return this.b;
    }

    public void c() {
        this.b = null;
        xt6.f().h(this);
    }

    public void d(zp9 zp9Var) {
        this.b = new bu6(this.a, zp9Var);
        xt6.f().g(this);
    }
}
