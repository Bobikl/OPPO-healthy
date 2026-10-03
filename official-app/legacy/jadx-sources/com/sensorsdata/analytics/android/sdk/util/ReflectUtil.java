package com.sensorsdata.analytics.android.sdk.util;

import android.annotation.SuppressLint;
import android.util.LruCache;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class ReflectUtil {

    @SuppressLint({"NewApi"})
    private static final LruCache<String, Class<?>> mObjectLruCache = new LruCache<>(64);
    private static final Set<String> mObjectSet = new HashSet();

    public static <T> T callMethod(Object obj, String str, Object... objArr) {
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        Method method = getMethod(obj.getClass(), str, clsArr);
        if (method == null) {
            return null;
        }
        try {
            return (T) method.invoke(obj, objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> T callStaticMethod(Class<?> cls, String str, Object... objArr) {
        if (cls == null) {
            return null;
        }
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        Method method = getMethod(cls, str, clsArr);
        if (method != null) {
            try {
                return (T) method.invoke(null, objArr);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static <T> T findField(Class<?> cls, Object obj, String... strArr) {
        Field fieldFindFieldObj = findFieldObj(cls, strArr);
        if (fieldFindFieldObj == null) {
            return null;
        }
        try {
            return (T) fieldFindFieldObj.get(obj);
        } catch (IllegalAccessException | Exception unused) {
            return null;
        }
    }

    public static Field findFieldObj(Class<?> cls, String... strArr) {
        if (strArr != null) {
            try {
                if (strArr.length != 0) {
                    Field declaredField = null;
                    for (String str : strArr) {
                        try {
                            declaredField = cls.getDeclaredField(str);
                        } catch (NoSuchFieldException unused) {
                            declaredField = null;
                        }
                        if (declaredField != null) {
                            break;
                        }
                    }
                    if (declaredField == null) {
                        return null;
                    }
                    declaredField.setAccessible(true);
                    return declaredField;
                }
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    public static Field findFieldObjRecur(Class<?> cls, String str) {
        while (cls != Object.class) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    public static <T> T findFieldRecur(Object obj, String str) {
        Field fieldFindFieldObjRecur = findFieldObjRecur(obj.getClass(), str);
        if (fieldFindFieldObjRecur == null) {
            return null;
        }
        try {
            return (T) fieldFindFieldObjRecur.get(obj);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    public static Class<?> getClassByName(String str) {
        try {
            LruCache<String, Class<?>> lruCache = mObjectLruCache;
            Class<?> cls = lruCache.get(str);
            if (cls != null || mObjectSet.contains(str)) {
                return cls;
            }
            Class<?> cls2 = Class.forName(str);
            lruCache.put(str, cls2);
            return cls2;
        } catch (ClassNotFoundException unused) {
            mObjectSet.add(str);
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static Class<?> getCurrentClass(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        Class<?> cls = null;
        for (int i = 0; i < strArr.length; i++) {
            try {
                LruCache<String, Class<?>> lruCache = mObjectLruCache;
                Class<?> cls2 = lruCache.get(strArr[i]);
                if (cls2 == null && !mObjectSet.contains(strArr[i])) {
                    cls2 = Class.forName(strArr[i]);
                    lruCache.put(strArr[i], cls2);
                }
                cls = cls2;
            } catch (Throwable unused) {
                mObjectSet.add(strArr[i]);
                cls = null;
            }
            if (cls != null) {
                break;
            }
        }
        return cls;
    }

    public static Method getDeclaredRecur(Class<?> cls, String str, Class<?>... clsArr) {
        while (cls != Object.class) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (declaredMethod != null) {
                    return declaredMethod;
                }
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    public static Method getMethod(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static boolean isInstance(Object obj, String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        boolean zIsInstance = false;
        for (String str : strArr) {
            try {
                LruCache<String, Class<?>> lruCache = mObjectLruCache;
                Class<?> cls = lruCache.get(str);
                if (cls == null && !mObjectSet.contains(str)) {
                    cls = Class.forName(str);
                    lruCache.put(str, cls);
                }
                if (cls != null) {
                    zIsInstance = cls.isInstance(obj);
                }
            } catch (Throwable unused) {
                mObjectSet.add(str);
            }
            if (zIsInstance) {
                break;
            }
        }
        return zIsInstance;
    }

    public static <T> T findField(String[] strArr, Object obj, String... strArr2) {
        Class<?> currentClass = getCurrentClass(strArr);
        if (currentClass != null) {
            return (T) findField(currentClass, obj, strArr2);
        }
        return null;
    }
}
