package com.oplus.aiunit.vision;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public final class b94 {
    public static Context a;

    public static synchronized Context a() {
        if (a == null) {
            a = b();
        }
        return a;
    }

    public static Context b() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(cls, new Object[0]);
            return (Context) objInvoke.getClass().getMethod("getApplication", new Class[0]).invoke(objInvoke, new Object[0]);
        } catch (Exception e2) {
            StringBuilder sbA = zqm.a("newContext currentActivityThread meet exception:");
            sbA.append(e2.getMessage());
            d3d.f("ContextUtils", sbA.toString());
            return null;
        }
    }
}
