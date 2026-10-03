package com.oplus.aiunit.vision;

import com.heytap.health.linkage.watch.WatchController;

/* JADX INFO: loaded from: classes16.dex */
public class jya {
    public static volatile jya b;
    public final WatchController a = new WatchController();

    public static jya a() {
        if (b == null) {
            synchronized (jya.class) {
                if (b == null) {
                    b = new jya();
                }
            }
        }
        return b;
    }

    public WatchController b() {
        return this.a;
    }
}
