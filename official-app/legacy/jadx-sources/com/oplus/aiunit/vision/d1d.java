package com.oplus.aiunit.vision;

import android.util.Log;
import com.oplus.utrace.lib.ConstValuesKt;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class d1d {

    /* JADX INFO: renamed from: O00, reason: collision with root package name */
    public static final boolean f10338O00;

    /* JADX INFO: renamed from: O0O, reason: collision with root package name */
    public static final int f10339O0O;

    static {
        boolean z = false;
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
            Boolean bool = Boolean.FALSE;
            Object objInvoke = declaredMethod.invoke(null, "persist.sys.assert.panic", bool);
            Object objInvoke2 = declaredMethod.invoke(null, ConstValuesKt.PERSIST_SYS_ALWAYSON_ENABLE, bool);
            Object objInvoke3 = declaredMethod.invoke(null, "persist.sys.alwayson.switch", bool);
            Boolean boolValueOf = Boolean.valueOf(objInvoke != null ? ((Boolean) objInvoke).booleanValue() : false);
            Boolean boolValueOf2 = Boolean.valueOf(objInvoke2 != null ? ((Boolean) objInvoke2).booleanValue() : false);
            Boolean boolValueOf3 = Boolean.valueOf(objInvoke3 != null ? ((Boolean) objInvoke3).booleanValue() : false);
            if (boolValueOf.booleanValue() || boolValueOf2.booleanValue() || boolValueOf3.booleanValue()) {
                z = true;
            }
        } catch (Exception e2) {
            Log.e("CarLink.SDK.", "isAssertPanic(): ", e2);
        }
        f10338O00 = z;
        Log.w("LogUtils", "oppoRefreshLogSwitch sDebug : " + z);
        f10339O0O = z ? 2 : 4;
    }

    public static void a(String str, String str2) {
        if (f10339O0O <= 3) {
            Log.d("CarLink.SDK.".concat(str), "(" + Thread.currentThread().getName() + ")" + str2);
        }
    }

    public static void b(String str, String str2, Exception exc) {
        if (f10339O0O <= 6) {
            Log.e("CarLink.SDK.".concat(str), str2, exc);
        }
    }

    public static void c(String str, String str2) {
        if (f10339O0O <= 6) {
            Log.e("CarLink.SDK.".concat(str), "(" + Thread.currentThread().getName() + ")" + str2);
        }
    }

    public static void d(String str, String str2) {
        if (f10339O0O <= 4) {
            Log.i("CarLink.SDK.".concat(str), "(" + Thread.currentThread().getName() + ")" + str2);
        }
    }

    public static void e(String str, String str2) {
        if (f10339O0O <= 5) {
            Log.w("CarLink.SDK.".concat(str), "(" + Thread.currentThread().getName() + ")" + str2);
        }
    }
}
