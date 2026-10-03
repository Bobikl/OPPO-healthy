package com.heytap.log.core;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes19.dex */
public class Util {
    private static final String TAG = "Nearx-Util";
    private static SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public static long getCurrentTime() {
        try {
            return sDateFormat.parse(sDateFormat.format(new Date(System.currentTimeMillis()))).getTime();
        } catch (Exception e2) {
            Log.e(TAG, "loadLibrary : " + e2.toString());
            return 0L;
        }
    }

    public static String getDateStr(long j2) {
        return sDateFormat.format(new Date(j2));
    }

    public static boolean loadLibrary(String str, Class cls) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            Method declaredMethod = Runtime.getRuntime().getClass().getDeclaredMethod("loadLibrary0", ClassLoader.class, String.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(Runtime.getRuntime(), classLoader, str);
            return true;
        } catch (IllegalAccessException e2) {
            Log.e(TAG, "loadLibrary : " + e2.toString());
            return false;
        } catch (NoSuchMethodException e3) {
            Log.e(TAG, "loadLibrary : " + e3.toString());
            return false;
        } catch (InvocationTargetException e4) {
            Log.e(TAG, "loadLibrary : " + e4.toString());
            return false;
        } catch (Throwable th) {
            Log.e(TAG, "loadLibrary : " + th.toString());
            return false;
        }
    }
}
