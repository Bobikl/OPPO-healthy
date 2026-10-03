package com.oplus.aiunit.vision;

import com.badlogic.gdx.utils.reflect.ReflectionException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes13.dex */
public final class kc3 {
    public static Class a(String str) throws ReflectionException {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw new ReflectionException("Class not found: " + str, e2);
        }
    }

    public static c14 b(Class cls, Class... clsArr) throws ReflectionException {
        try {
            return new c14(cls.getConstructor(clsArr));
        } catch (NoSuchMethodException e2) {
            throw new ReflectionException("Constructor not found for class: " + cls.getName(), e2);
        } catch (SecurityException e3) {
            throw new ReflectionException("Security violation occurred while getting constructor for class: '" + cls.getName() + "'.", e3);
        }
    }

    public static c14 c(Class cls, Class... clsArr) throws ReflectionException {
        try {
            return new c14(cls.getDeclaredConstructor(clsArr));
        } catch (NoSuchMethodException e2) {
            throw new ReflectionException("Constructor not found for class: " + cls.getName(), e2);
        } catch (SecurityException e3) {
            throw new ReflectionException("Security violation while getting constructor for class: " + cls.getName(), e3);
        }
    }

    public static y97[] d(Class cls) {
        Field[] declaredFields = cls.getDeclaredFields();
        y97[] y97VarArr = new y97[declaredFields.length];
        int length = declaredFields.length;
        for (int i = 0; i < length; i++) {
            y97VarArr[i] = new y97(declaredFields[i]);
        }
        return y97VarArr;
    }

    public static String e(Class cls) {
        return cls.getSimpleName();
    }

    public static boolean f(Class cls, Class cls2) {
        return cls.isAssignableFrom(cls2);
    }

    public static boolean g(Class cls) {
        return cls.isMemberClass();
    }

    public static boolean h(Class cls) {
        return Modifier.isStatic(cls.getModifiers());
    }

    public static <T> T i(Class<T> cls) throws ReflectionException {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e2) {
            throw new ReflectionException("Could not instantiate instance of class: " + cls.getName(), e2);
        } catch (InstantiationException e3) {
            throw new ReflectionException("Could not instantiate instance of class: " + cls.getName(), e3);
        }
    }
}
