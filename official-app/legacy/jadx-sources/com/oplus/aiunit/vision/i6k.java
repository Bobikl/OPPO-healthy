package com.oplus.aiunit.vision;

import android.content.Context;

/* JADX INFO: loaded from: classes17.dex */
public class i6k {
    public long a;
    public cu6 b;

    public i6k(Context context, long j2) {
        x84.b(context);
        this.a = j2;
    }

    public static i6k a(Context context, long j2) {
        return new i6k(context, j2);
    }

    public cu6 b() {
        return this.b;
    }

    public void c(IExceptionProcess iExceptionProcess) {
        this.b = new cu6(this.a, iExceptionProcess);
        yt6.f().g(this);
    }
}
