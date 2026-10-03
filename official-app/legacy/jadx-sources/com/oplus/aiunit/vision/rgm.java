package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes12.dex */
public class rgm {
    public static final String a = "IdentifierManager";
    public static Object b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class<?> f16199c;
    public static Method d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f16200e;
    public static Method f;
    public static Method g;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f16199c = cls;
            b = cls.newInstance();
            d = f16199c.getMethod("getUDID", Context.class);
            f16200e = f16199c.getMethod("getOAID", Context.class);
            f = f16199c.getMethod("getVAID", Context.class);
            g = f16199c.getMethod("getAAID", Context.class);
        } catch (Exception e2) {
            Log.e(a, "reflect exception!", e2);
        }
    }

    public static String a(Context context, Method method) {
        Object obj = b;
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(obj, context);
            if (objInvoke != null) {
                return (String) objInvoke;
            }
            return null;
        } catch (Exception e2) {
            Log.e(a, "invoke exception!", e2);
            return null;
        }
    }

    public static boolean b() {
        return (f16199c == null || b == null) ? false : true;
    }

    public static String c(Context context) {
        return a(context, f16200e);
    }
}
