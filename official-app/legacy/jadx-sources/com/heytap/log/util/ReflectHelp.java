package com.heytap.log.util;

import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes19.dex */
public class ReflectHelp {
    public static boolean DEBUG = false;
    private static String TAG = "ReflectHelp";

    public static Class getClassFromName(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable th) {
            if (DEBUG) {
                Log.w(TAG, "reflect:" + th.getMessage());
            }
            return null;
        }
    }

    public static Constructor getConstructor(String str, Class[] clsArr) {
        try {
            return Class.forName(str).getDeclaredConstructor(clsArr);
        } catch (Throwable th) {
            if (DEBUG) {
                Log.w(TAG, "reflect:" + th.getMessage());
            }
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Constructor getConstructorForInnerClass(String str, Class[] clsArr) {
        String[] strArrSplit = str.split("\\$");
        Class[] clsArr2 = new Class[clsArr.length + 1];
        if (strArrSplit.length >= 1) {
            int i = 0;
            try {
                Class<?> cls = Class.forName(strArrSplit[0]);
                clsArr2[0] = cls;
                while (i < clsArr.length) {
                    int i2 = i + 1;
                    clsArr2[i2] = clsArr[i];
                    i = i2;
                }
                Class.forName(str);
                return cls.getDeclaredConstructor(clsArr2);
            } catch (Throwable th) {
                if (DEBUG) {
                    Log.w(TAG, "reflect:" + th.getMessage());
                }
            }
        }
        return null;
    }

    public static Field getField(Class cls, String str) {
        if (cls != null && !TextUtils.isEmpty(str)) {
            try {
                try {
                    return cls.getDeclaredField(str);
                } catch (NoSuchFieldException unused) {
                    return cls.getField(str);
                }
            } catch (NoSuchFieldException unused2) {
                if (cls.getSuperclass() != null) {
                    return getField(cls.getSuperclass(), str);
                }
            }
        }
        return null;
    }

    public static Object getFieldValue(Object obj, String str) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Throwable th) {
            if (DEBUG) {
                Log.w(TAG, "reflect:" + th.getMessage());
            }
            return null;
        }
    }

    public static Method getMethod(Class cls, String str, Class[] clsArr) {
        if (cls != null && !TextUtils.isEmpty(str)) {
            try {
                try {
                    return cls.getDeclaredMethod(str, clsArr);
                } catch (Exception unused) {
                    return cls.getMethod(str, clsArr);
                }
            } catch (Exception unused2) {
                if (cls.getSuperclass() != null) {
                    return getMethod(cls.getSuperclass(), str, clsArr);
                }
            }
        }
        return null;
    }

    public static Object getObjectByConstructor(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> declaredConstructor = Class.forName(str).getDeclaredConstructor(clsArr);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(objArr);
        } catch (Throwable th) {
            if (DEBUG) {
                Log.w(TAG, "reflect:" + th.getMessage());
            }
            return null;
        }
    }

    public static Object getObjectFromInnerClass(String str, Class[] clsArr, Object[] objArr, Class[] clsArr2, Object[] objArr2) {
        try {
            if (getConstructorForInnerClass(str, clsArr2) == null) {
                return null;
            }
            int length = objArr2.length + 1;
            Object[] objArr3 = new Object[length];
            if (length < 1) {
                return null;
            }
            String[] strArrSplit = str.split("\\$");
            if (strArrSplit.length <= 0) {
                return null;
            }
            int i = 0;
            objArr3[0] = getConstructor(strArrSplit[0], clsArr).newInstance(objArr);
            while (i < objArr2.length) {
                int i2 = i + 1;
                objArr3[i2] = objArr2[i];
                i = i2;
            }
            return getConstructorForInnerClass(str, clsArr2).newInstance(objArr3);
        } catch (Throwable th) {
            if (!DEBUG) {
                return null;
            }
            Log.w(TAG, "reflect:" + th.getMessage());
            return null;
        }
    }

    public static Object invoke(Object obj, String str, Class[] clsArr, Object[] objArr) {
        if (obj != null && !TextUtils.isEmpty(str)) {
            try {
                Method method = getMethod(obj.getClass(), str, clsArr);
                if (method != null) {
                    method.setAccessible(true);
                    return method.invoke(obj, objArr);
                }
            } catch (Throwable th) {
                if (DEBUG) {
                    Log.w(TAG, "reflect:" + th.getMessage());
                }
            }
        }
        return null;
    }

    public static Object invokeStatic(Class cls, String str, Class[] clsArr, Object[] objArr) {
        if (cls != null && !TextUtils.isEmpty(str)) {
            try {
                Method method = getMethod(cls, str, clsArr);
                if (method != null) {
                    method.setAccessible(true);
                    return method.invoke(null, objArr);
                }
            } catch (Throwable th) {
                if (DEBUG) {
                    Log.w(TAG, "reflect:" + th.getMessage());
                }
            }
        }
        return null;
    }

    public static Object invokeThrowException(Object obj, String str, Class[] clsArr, Object[] objArr) throws Exception {
        if (obj == null || TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("obj == null or method is null");
        }
        Method method = getMethod(obj.getClass(), str, clsArr);
        if (method == null) {
            throw new IllegalStateException("method is null");
        }
        method.setAccessible(true);
        return method.invoke(obj, objArr);
    }

    public static void modifyFileValue(Object obj, String str, String str2) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(obj, str2);
        } catch (Throwable th) {
            if (DEBUG) {
                Log.w(TAG, "reflect:" + th.getMessage());
            }
        }
    }

    public static void setDebug(boolean z) {
        DEBUG = z;
    }

    public static void setFieldValue(Class cls, Object obj, String str, Object obj2) {
        if ((obj == null && cls == null) || TextUtils.isEmpty(str)) {
            return;
        }
        if (obj != null) {
            cls = obj.getClass();
        }
        Field field = getField(cls, str);
        if (field != null) {
            field.setAccessible(true);
            try {
                field.set(obj, obj2);
            } catch (Throwable th) {
                if (DEBUG) {
                    Log.w(TAG, "reflect:" + th.getMessage());
                }
            }
        }
    }

    public static Object getFieldValue(Class cls, Object obj, String str) {
        if ((obj == null && cls == null) || TextUtils.isEmpty(str)) {
            return null;
        }
        if (obj != null) {
            cls = obj.getClass();
        }
        Field field = getField(cls, str);
        if (field != null) {
            field.setAccessible(true);
            try {
                return field.get(obj);
            } catch (Throwable th) {
                if (DEBUG) {
                    Log.w(TAG, "reflect:" + th.getMessage());
                }
            }
        }
        return null;
    }
}
