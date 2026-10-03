package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes19.dex */
public class lkf {
    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            e6b.a("upgrade_ReflectHelp", "getClassFromName failed : " + e2.getMessage());
            return null;
        }
    }

    public static Field b(Class cls, String str) {
        Field fieldB;
        if (cls == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e2) {
            try {
                fieldB = cls.getField(str);
            } catch (NoSuchFieldException e3) {
                if (cls.getSuperclass() == null) {
                    return null;
                }
                fieldB = b(cls.getSuperclass(), str);
                e6b.a("upgrade_ReflectHelp", "getField failed : " + e3.getMessage());
            }
            e6b.a("upgrade_ReflectHelp", "getField failed : " + e2.getMessage());
            return fieldB;
        }
    }

    public static Object c(Class cls, Object obj, String str) {
        if ((obj != null || cls != null) && !TextUtils.isEmpty(str)) {
            if (obj != null) {
                cls = obj.getClass();
            }
            Field fieldB = b(cls, str);
            if (fieldB != null) {
                fieldB.setAccessible(true);
                try {
                    return fieldB.get(obj);
                } catch (IllegalAccessException e2) {
                    e6b.a("upgrade_ReflectHelp", "getFieldValue failed : " + e2.getMessage());
                } catch (IllegalArgumentException e3) {
                    e6b.a("upgrade_ReflectHelp", "getFieldValue failed : " + e3.getMessage());
                }
            }
        }
        return null;
    }

    public static Method d(Class cls, String str, Class[] clsArr) {
        if (cls == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (Exception unused) {
                return cls.getMethod(str, clsArr);
            }
        } catch (Exception unused2) {
            if (cls.getSuperclass() == null) {
                return null;
            }
            return d(cls.getSuperclass(), str, clsArr);
        }
    }

    public static Object e(Object obj, String str, Class[] clsArr, Object[] objArr) {
        if (obj != null && !TextUtils.isEmpty(str)) {
            try {
                Method methodD = d(obj.getClass(), str, clsArr);
                if (methodD != null) {
                    methodD.setAccessible(true);
                    return methodD.invoke(obj, objArr);
                }
            } catch (IllegalAccessException e2) {
                e6b.a("upgrade_ReflectHelp", "invoke failed : " + e2.getMessage());
            } catch (IllegalArgumentException e3) {
                e6b.a("upgrade_ReflectHelp", "invoke failed : " + e3.getMessage());
            } catch (SecurityException e4) {
                e6b.a("upgrade_ReflectHelp", "invoke failed : " + e4.getMessage());
            } catch (InvocationTargetException e5) {
                e6b.a("upgrade_ReflectHelp", "invoke failed : " + e5.getMessage());
            }
        }
        return null;
    }

    public static Object f(Class cls, String str, Class[] clsArr, Object[] objArr) {
        if (cls != null && !TextUtils.isEmpty(str)) {
            try {
                Method methodD = d(cls, str, clsArr);
                if (methodD != null) {
                    methodD.setAccessible(true);
                    return methodD.invoke(null, objArr);
                }
            } catch (IllegalAccessException e2) {
                e6b.a("upgrade_ReflectHelp", "invokeStatic failed : " + e2.getMessage());
            } catch (IllegalArgumentException e3) {
                e6b.a("upgrade_ReflectHelp", "invokeStatic failed : " + e3.getMessage());
            } catch (SecurityException e4) {
                e6b.a("upgrade_ReflectHelp", "invokeStatic failed : " + e4.getMessage());
            } catch (InvocationTargetException e5) {
                e6b.a("upgrade_ReflectHelp", "invokeStatic failed : " + e5.getMessage());
            }
        }
        return null;
    }
}
