package com.oplus.utils.reflect;

import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.HashMap;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public final class RefClass {
    private static final Class<? extends IBaseRef>[] REF_CLASSES;
    private static final HashMap<Class<? extends IBaseRef>, Constructor<? extends IBaseRef>> REF_TYPES = new HashMap<>();
    private static final String TAG = "RefClass";

    static {
        Class<? extends IBaseRef>[] clsArr = {RefObject.class, RefMethod.class, RefInt.class, RefLong.class, RefFloat.class, RefDouble.class, RefBoolean.class, RefByte.class, RefChar.class, RefShort.class, RefConstructor.class};
        REF_CLASSES = clsArr;
        try {
            for (Class<? extends IBaseRef> cls : clsArr) {
                REF_TYPES.put(cls, cls.getConstructor(Class.class, Field.class));
            }
        } catch (Exception e) {
            Log.e(TAG, e.getMessage(), e);
        }
    }

    private static Class<?> getRealClass(ClassLoader classLoader, String str) {
        if (str == null) {
            return null;
        }
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException e) {
            Log.e(TAG, "Cannot find class : " + e.getMessage());
            return null;
        }
    }

    public static Class<?> load(Class<?> cls, String str) {
        return load(cls, str, (Class<?>) null);
    }

    private static IBaseRef newInstance(Class<?> cls, Field field, Constructor<? extends IBaseRef> constructor) {
        try {
            return constructor.newInstance(cls, field);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            if (cls == null) {
                Log.e(TAG, "targetClass load : null");
                return null;
            }
            Log.e(TAG, "targetClass load : " + cls.getName(), e);
            return null;
        }
    }

    public static Class<?> load(Class<?> cls, Class<?> cls2) {
        return load(cls, cls2, (Class<?>) null);
    }

    public static Class<?> load(Class<?> cls, String str, Class<?> cls2) {
        Class<?> realClass = getRealClass(cls.getClassLoader(), str);
        load(cls, realClass, cls2, (String) null);
        return realClass;
    }

    public static Class<?> load(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        load(cls, cls2, cls3, (String) null);
        return cls2;
    }

    public static RefConstructor<?> load(Class<?> cls, String str, Class<?> cls2, String str2) {
        return load(cls, getRealClass(cls.getClassLoader(), str), cls2, str2);
    }

    public static RefConstructor<?> load(Class<?> cls, Class<?> cls2, Class<?> cls3, String str) {
        Object objNewInstance;
        if (cls != null) {
            if (cls3 != null) {
                try {
                    objNewInstance = cls3.newInstance();
                } catch (IllegalAccessException | InstantiationException e) {
                    Log.e(TAG, cls3 + ".newInstance", e);
                    objNewInstance = null;
                }
            } else {
                objNewInstance = null;
            }
            RefConstructor<?> refConstructor = null;
            for (Field field : cls.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && !Modifier.isFinal(field.getModifiers())) {
                    try {
                        field.setAccessible(true);
                        if (field.get(null) == null) {
                            Constructor<? extends IBaseRef> constructor = REF_TYPES.get(field.getType());
                            if (constructor != null) {
                                IBaseRef iBaseRefNewInstance = cls2 != null ? newInstance(cls2, field, constructor) : null;
                                if ((iBaseRefNewInstance == null || iBaseRefNewInstance.isEmpty()) && cls2 != cls3) {
                                    iBaseRefNewInstance = newInstance(cls3, field, constructor);
                                }
                                if (iBaseRefNewInstance == null) {
                                    iBaseRefNewInstance = newInstance(null, field, constructor);
                                }
                                if (iBaseRefNewInstance != null) {
                                    iBaseRefNewInstance.bindStub(objNewInstance);
                                }
                                field.set(null, iBaseRefNewInstance);
                                if (field.getName().equals(str) && field.getType().equals(RefConstructor.class)) {
                                    refConstructor = (RefConstructor) iBaseRefNewInstance;
                                }
                            }
                        } else {
                            throw new UnsupportedOperationException("Already loaded : " + field.getName());
                        }
                    } catch (IllegalAccessException e2) {
                        Log.e(TAG, cls.getName() + ".load", e2);
                    }
                }
            }
            return refConstructor;
        }
        throw new IllegalArgumentException("mappingClass is null");
    }
}
