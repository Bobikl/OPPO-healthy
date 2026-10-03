package com.oplus.aiunit.vision;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public class wc1 {
    public static Field a(Class<?> cls, String str) {
        while (cls != Object.class) {
            if (cls != null) {
                try {
                    return cls.getDeclaredField(str);
                } catch (NoSuchFieldException unused) {
                    continue;
                }
            }
            Objects.requireNonNull(cls);
            cls = cls.getSuperclass();
        }
        return null;
    }

    public static Field b(Object obj, String str) {
        return a(obj.getClass(), str);
    }

    public static void c(Field field) {
        if (Modifier.isPublic(field.getModifiers()) && Modifier.isPublic(field.getDeclaringClass().getModifiers())) {
            return;
        }
        field.setAccessible(true);
    }

    public static void d(Object obj, String str, Object obj2) {
        Field fieldB = b(obj, str);
        if (fieldB != null) {
            c(fieldB);
            try {
                fieldB.set(obj, obj2);
                return;
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return;
            }
        }
        throw new IllegalArgumentException("Could not find field [" + str + "] on target [" + obj + "]");
    }
}
