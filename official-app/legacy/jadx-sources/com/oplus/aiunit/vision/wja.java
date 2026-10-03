package com.oplus.aiunit.vision;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class wja {
    public static final <T> T a(String str, Class<T> cls) {
        try {
            return (T) Class.forName(b(cls)).getMethod("parse", JSONObject.class).invoke(null, new JSONObject(str));
        } catch (Exception e2) {
            t7b.INSTANCE.d("JsonAnnotationUtils", "fromJson exception: " + e2.getMessage());
            return (T) gia.b(str, cls);
        }
    }

    public static String b(Class<?> cls) {
        String canonicalName;
        if (cls.getEnclosingClass() == null || cls.getPackage() == null) {
            canonicalName = cls.getCanonicalName();
        } else {
            canonicalName = cls.getPackage().getName() + "." + cls.getSimpleName();
        }
        return canonicalName + "_JsonParser";
    }

    public static String c(Class<?> cls) {
        String canonicalName;
        if (cls.getEnclosingClass() == null || cls.getPackage() == null) {
            canonicalName = cls.getCanonicalName();
        } else {
            canonicalName = cls.getPackage().getName() + "." + cls.getSimpleName();
        }
        return canonicalName + "_JsonSerializer";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> String d(T t) {
        try {
            if (t instanceof Map) {
                return new JSONObject((Map) t).toString();
            }
            return t instanceof String ? (String) t : ((JSONObject) Class.forName(c(t.getClass())).getMethod("serialize", t.getClass()).invoke(null, t)).toString();
        } catch (Exception e2) {
            t7b.INSTANCE.d("JsonAnnotationUtils", "toJsonStr exception: " + e2.getMessage());
            return gia.a(t);
        }
    }
}
