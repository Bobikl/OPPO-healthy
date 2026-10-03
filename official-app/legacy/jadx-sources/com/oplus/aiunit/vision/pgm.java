package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes12.dex */
public class pgm {
    public static final String a = "OpenIdHelper";
    public static Method b;

    public static final boolean a() {
        Context context = null;
        try {
            if (b == null) {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]);
                b = method;
                method.setAccessible(true);
            }
            context = (Context) b.invoke(null, new Object[0]);
        } catch (Exception e2) {
            Log.e(a, "ActivityThread:currentApplication --> " + e2.toString());
        }
        if (context == null) {
            return false;
        }
        return fvm.b().g(context, false);
    }

    public static String b(Context context) {
        fvm fvmVarB = fvm.b();
        return fvmVarB.c(context.getApplicationContext(), fvmVarB.b);
    }
}
