package com.nearme.instant.xcard;

import android.content.Context;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
public class ReflectHelper {
    public static Object sActivityThread;
    public static Object sLoadedApk;

    public static Object getActivityThread(Context context) {
        Object field;
        if (sActivityThread == null) {
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                try {
                    field = getField(cls, null, "sCurrentActivityThread");
                } catch (Exception unused) {
                    field = null;
                }
                if (field == null) {
                    field = ((ThreadLocal) getField(cls, null, "sThreadLocal")).get();
                }
                sActivityThread = field;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return sActivityThread;
    }

    public static Object getField(Class cls, Object obj, String str) throws Exception {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    public static Object getFieldNoException(Class cls, Object obj, String str) {
        try {
            return getField(cls, obj, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object getPackageInfo(Context context) {
        if (sLoadedApk == null) {
            try {
                sLoadedApk = getField(context.getClass(), context, "mPackageInfo");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return sLoadedApk;
    }

    public static Object invoke(Class cls, Object obj, String str, Object... objArr) throws Exception {
        Class<?>[] clsArr;
        if (objArr != null) {
            clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = objArr[i].getClass();
            }
        } else {
            clsArr = null;
        }
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        declaredMethod.setAccessible(true);
        return declaredMethod.invoke(obj, objArr);
    }

    public static void setField(Class cls, Object obj, String str, Object obj2) throws Exception {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        declaredField.set(obj, obj2);
    }
}
