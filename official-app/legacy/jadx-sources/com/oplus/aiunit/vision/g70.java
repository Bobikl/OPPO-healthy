package com.oplus.aiunit.vision;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes8.dex */
public class g70 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static g70 f11658c;
    public evf a;
    public String b = "";

    public static synchronized g70 b() {
        if (f11658c == null) {
            synchronized (g70.class) {
                if (f11658c == null) {
                    f11658c = new g70();
                }
            }
        }
        return f11658c;
    }

    public <T> T a(Class<T> cls) {
        return (T) this.a.b(cls);
    }

    public boolean c() {
        return TextUtils.isEmpty(this.b);
    }
}
