package com.heytap.store.apm.util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes19.dex */
public class ReflectUtil {
    public static <T> T getFieldValue(Object obj, String str) {
        if (obj != null && str != null && !"".equals(str)) {
            Class<?> cls = obj.getClass();
            try {
                try {
                    Field declaredField = cls.getDeclaredField(str);
                    if (!Modifier.isPublic(declaredField.getModifiers())) {
                        declaredField.setAccessible(true);
                    }
                    return (T) declaredField.get(obj);
                } catch (Exception unused) {
                    Field declaredField2 = cls.getSuperclass().getDeclaredField(str);
                    if (!Modifier.isPublic(declaredField2.getModifiers())) {
                        declaredField2.setAccessible(true);
                    }
                    return (T) declaredField2.get(obj);
                }
            } catch (Exception unused2) {
            }
        }
        return null;
    }
}
