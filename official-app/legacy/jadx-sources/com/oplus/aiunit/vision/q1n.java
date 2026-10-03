package com.oplus.aiunit.vision;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public class q1n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static q1n f15592c;
    public final Context a;
    public final String b = x1n.d(w0n.t("RYW1hcF9kZXZpY2VfYWRpdQ"));

    public q1n(Context context) {
        this.a = context.getApplicationContext();
    }

    public static q1n a(Context context) {
        if (f15592c == null) {
            synchronized (q1n.class) {
                if (f15592c == null) {
                    f15592c = new q1n(context);
                }
            }
        }
        return f15592c;
    }

    public final synchronized void b() {
        try {
            if (p0n.x() == null) {
                p0n.p(u1n.a());
            }
        } catch (Throwable unused) {
        }
    }

    public final void c(String str) {
        r1n.b(this.a).d(this.b);
        r1n.b(this.a).g(str);
    }
}
