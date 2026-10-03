package com.oplus.aiunit.vision;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class gdf {
    public static volatile hdf a;
    public static final Object b = new Object();

    public static hdf a(Context context) {
        if (a == null) {
            synchronized (b) {
                if (a == null) {
                    Context contextH = w56.h();
                    if (contextH == null && context != null) {
                        contextH = context.getApplicationContext();
                    }
                    if (contextH == null) {
                        throw new IllegalStateException("storageContext is null");
                    }
                    a = new hdf(contextH);
                }
            }
        }
        return a;
    }
}
