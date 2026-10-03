package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.utrace.lib.PackageNames;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class cb0 {
    public static final String[] d = {"com.coloros.gamespace", "com.oplus.cosa", "com.oppo.launcher", PackageNames.LAUNCHER, "com.coloros.childrenspace", kb0.APP_USAGE_PACKAGE};
    public static volatile cb0 e = null;
    public Context a;
    public Set<String> b = Collections.synchronizedSet(new HashSet());
    public Set<String> c = Collections.synchronizedSet(new HashSet());

    public cb0(Context context) {
        this.a = context;
    }

    public static cb0 b(Context context) {
        if (e == null) {
            synchronized (cb0.class) {
                if (e == null) {
                    e = new cb0(context);
                }
            }
        }
        return e;
    }

    public synchronized boolean a(String str) {
        boolean z;
        if (this.c.isEmpty()) {
            c();
        }
        boolean zContains = this.b.contains(str);
        z = true;
        boolean z2 = !this.c.contains(str);
        if (!zContains && !z2) {
            z = false;
        }
        return z;
    }

    public synchronized void c() {
        this.b.clear();
        this.c.clear();
        for (String str : d) {
            this.b.add(str);
        }
        this.b.addAll(b5e.b(this.a));
        this.b.remove("com.android.settings");
        this.c.addAll(b5e.e(this.a));
    }
}
