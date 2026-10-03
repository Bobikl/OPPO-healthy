package com.client.platform.opensdk.pay.download.util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes13.dex */
public class BeanUtils {
    private BeanUtils() {
    }

    public static Field getDeclaredField(Object obj, String str) {
        return getDeclaredField(obj.getClass(), str);
    }

    public static void makeAccessible(Field field) {
        if (Modifier.isPublic(field.getModifiers()) && Modifier.isPublic(field.getDeclaringClass().getModifiers())) {
            return;
        }
        field.setAccessible(true);
    }

    public static void setFieldValue(Object obj, String str, Object obj2) {
        Field declaredField = getDeclaredField(obj, str);
        if (declaredField != null) {
            makeAccessible(declaredField);
            try {
                declaredField.set(obj, obj2);
                return;
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return;
            }
        }
        throw new IllegalArgumentException("Could not find field [" + str + "] on target [" + obj + "]");
    }

    public static Field getDeclaredField(Class<?> cls, String str) {
        while (cls != Object.class) {
            try {
                return cls.getDeclaredField(str);
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }
}
