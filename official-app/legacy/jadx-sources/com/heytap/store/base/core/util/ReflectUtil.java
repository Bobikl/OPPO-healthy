package com.heytap.store.base.core.util;

import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes3.dex */
public class ReflectUtil {
    private static final String TAG = "ReflectUtil";

    public static final Object getField(String str, Object obj, String str2) {
        if (obj == null) {
            return null;
        }
        try {
            Field field = Class.forName(str).getField(str2);
            if (field != null) {
                return field.get(obj);
            }
        } catch (Exception unused) {
            Log.e(TAG, "getStaticField got Exception:");
        }
        return null;
    }

    public static <T> T getFieldValue(Object obj, String str) {
        if (obj != null && str != null && !"".equals(str)) {
            try {
                Field declaredField = obj.getClass().getDeclaredField(str);
                if (!Modifier.isPublic(declaredField.getModifiers())) {
                    declaredField.setAccessible(true);
                }
                return (T) declaredField.get(obj);
            } catch (Exception e2) {
                Log.d(TAG, e2.getMessage());
            }
        }
        return null;
    }

    public static final Object getStaticField(String str, String str2) {
        try {
            Field field = Class.forName(str).getField(str2);
            if (field != null) {
                return field.get("");
            }
            return null;
        } catch (Exception unused) {
            Log.e(TAG, "getStaticField got Exception:");
            return null;
        }
    }

    public static Object invokeMethod(Object obj, String str, Object[] objArr, Class[] clsArr) {
        Method declaredMethod;
        if (obj == null || TextUtils.isEmpty(str)) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls != Object.class) {
            try {
                declaredMethod = cls.getDeclaredMethod(str, clsArr);
            } catch (Exception unused) {
                return null;
            }
        } else {
            declaredMethod = null;
        }
        if (declaredMethod == null) {
            return null;
        }
        declaredMethod.setAccessible(true);
        try {
            return declaredMethod.invoke(obj, objArr);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static Object invokeStaticMethod(String str, String str2, Class<?>[] clsArr, Object... objArr) {
        try {
            Method declaredMethod = Class.forName(str).getDeclaredMethod(str2, clsArr);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                return declaredMethod.invoke(null, objArr);
            }
        } catch (Exception unused) {
            Log.e(TAG, "invokeStaticMethod got Exception:");
        }
        return null;
    }

    public static void setFieldValue(Object obj, String str, Class cls, Object obj2) {
        if (obj == null || str == null || "".equals(str)) {
            return;
        }
        if (obj2 == null || cls.isAssignableFrom(obj2.getClass())) {
            try {
                Field declaredField = obj.getClass().getDeclaredField(str);
                if (!Modifier.isPublic(declaredField.getModifiers())) {
                    declaredField.setAccessible(true);
                }
                declaredField.set(obj, obj2);
            } catch (Exception e2) {
                Log.d(TAG, e2.getMessage());
            }
        }
    }
}
