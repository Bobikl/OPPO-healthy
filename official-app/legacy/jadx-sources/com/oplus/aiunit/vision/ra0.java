package com.oplus.aiunit.vision;

import android.content.Context;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public class ra0 {
    public static final String[] d = {"com.coloros.gamespace", "com.oplus.cosa", "com.oppo.launcher", "com.android.launcher", "com.coloros.childrenspace", "com.coloros.digitalwellbeing"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile ra0 f16135e = null;
    public Context a;
    public Set<String> b = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set<String> f16136c = Collections.synchronizedSet(new HashSet());

    public ra0(Context context) {
        this.a = context;
    }

    public static ra0 b(Context context) {
        if (f16135e == null) {
            synchronized (ra0.class) {
                if (f16135e == null) {
                    f16135e = new ra0(context);
                }
            }
        }
        return f16135e;
    }

    public synchronized boolean a(String str) {
        boolean z;
        if (this.f16136c.isEmpty()) {
            c();
        }
        boolean zContains = this.b.contains(str);
        z = true;
        boolean z2 = !this.f16136c.contains(str);
        if (!zContains && !z2) {
            z = false;
        }
        return z;
    }

    public synchronized void c() {
        this.b.clear();
        this.f16136c.clear();
        for (String str : d) {
            this.b.add(str);
        }
        this.b.addAll(e3e.b(this.a));
        this.b.remove("com.android.settings");
        this.f16136c.addAll(e3e.e(this.a));
    }
}
