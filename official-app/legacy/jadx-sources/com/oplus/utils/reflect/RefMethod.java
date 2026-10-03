package com.oplus.utils.reflect;

import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes8.dex */
public class RefMethod<T> extends BaseRef<T> {
    private static final String TAG = "RefMethod";
    private final Method mMethod;

    public RefMethod(Class<?> cls, Field field) {
        super(field);
        this.mMethod = load(cls, field);
    }

    private Method getMethod(Class<?> cls, Field field, Class<?>[] clsArr, String str) throws NoSuchMethodException {
        return !str.isEmpty() ? cls.getDeclaredMethod(str, clsArr) : cls.getDeclaredMethod(field.getName(), clsArr);
    }

    public static Class<?> getProtoType(String str) {
        if (str.equals("int")) {
            return Integer.TYPE;
        }
        if (str.equals("long")) {
            return Long.TYPE;
        }
        if (str.equals(TypedValues.Custom.S_BOOLEAN)) {
            return Boolean.TYPE;
        }
        if (str.equals("byte")) {
            return Byte.TYPE;
        }
        if (str.equals("short")) {
            return Short.TYPE;
        }
        if (str.equals("char")) {
            return Character.TYPE;
        }
        if (str.equals(TypedValues.Custom.S_FLOAT)) {
            return Float.TYPE;
        }
        if (str.equals("double")) {
            return Double.TYPE;
        }
        if (str.equals("void")) {
            return Void.TYPE;
        }
        return null;
    }

    private Method load(Class<?> cls, Field field) {
        Class<?> cls2;
        Method method = null;
        try {
            if (field.isAnnotationPresent(MethodName.class)) {
                Method method2 = getMethod(cls, field, ((MethodName) field.getAnnotation(MethodName.class)).params(), ((MethodName) field.getAnnotation(MethodName.class)).name());
                method2.setAccessible(true);
                return method2;
            }
            int i = 0;
            if (!field.isAnnotationPresent(MethodSignature.class)) {
                Method[] declaredMethods = cls.getDeclaredMethods();
                int length = declaredMethods.length;
                while (i < length) {
                    Method method3 = declaredMethods[i];
                    if (method3.getName().equals(field.getName())) {
                        try {
                            method3.setAccessible(true);
                            return method3;
                        } catch (Exception e2) {
                            e = e2;
                            method = method3;
                            Log.e(TAG, e.getMessage());
                            return method;
                        }
                    }
                    i++;
                }
                return null;
            }
            String[] strArrParams = ((MethodSignature) field.getAnnotation(MethodSignature.class)).params();
            Class<?>[] clsArr = new Class[strArrParams.length];
            Class<?>[] clsArr2 = new Class[strArrParams.length];
            boolean z = false;
            for (int i2 = 0; i2 < strArrParams.length; i2++) {
                Class<?> protoType = getProtoType(strArrParams[i2]);
                if (protoType == null) {
                    try {
                        protoType = Class.forName(strArrParams[i2]);
                    } catch (ClassNotFoundException e3) {
                        Log.e(TAG, e3.getMessage());
                    }
                }
                clsArr[i2] = protoType;
                if ("java.util.HashSet".equals(strArrParams[i2])) {
                    try {
                        cls2 = Class.forName("android.util.ArraySet");
                    } catch (ClassNotFoundException e4) {
                        Log.e(TAG, e4.getMessage());
                        cls2 = protoType;
                    }
                    if (cls2 != null) {
                        clsArr2[i2] = cls2;
                    } else {
                        clsArr2[i2] = protoType;
                    }
                    z = true;
                } else {
                    clsArr2[i2] = protoType;
                }
            }
            try {
                method = getMethod(cls, field, clsArr, ((MethodSignature) field.getAnnotation(MethodSignature.class)).name());
            } catch (Exception e5) {
                Log.e(TAG, e5.getMessage());
                if (z) {
                    method = getMethod(cls, field, clsArr2, ((MethodSignature) field.getAnnotation(MethodSignature.class)).name());
                }
            }
            Class<?>[] clsArr3 = new Class[strArrParams.length];
            while (i < strArrParams.length) {
                Class<?> protoType2 = getProtoType(strArrParams[i]);
                if (protoType2 == null) {
                    try {
                        protoType2 = Class.forName(strArrParams[i]);
                    } catch (ClassNotFoundException e6) {
                        Log.e(TAG, e6.getMessage());
                    }
                }
                clsArr3[i] = protoType2;
                i++;
            }
            Method method4 = getMethod(cls, field, clsArr3, ((MethodSignature) field.getAnnotation(MethodSignature.class)).name());
            method4.setAccessible(true);
            return method4;
        } catch (Exception e7) {
            e = e7;
            Log.e(TAG, e.getMessage());
            return method;
        }
    }

    @Override // com.oplus.utils.reflect.BaseRef, com.oplus.utils.reflect.IBaseRef
    public /* bridge */ /* synthetic */ void bindStub(Object obj) {
        super.bindStub(obj);
    }

    public T call(Object obj, Object... objArr) {
        return callWithDefault(obj, null, objArr);
    }

    public T callWithDefault(Object obj, T t, Object... objArr) {
        try {
            return callWithException(obj, objArr);
        } catch (Throwable th) {
            Log.e(TAG, th.getMessage());
            return t != null ? t : getDefaultValue();
        }
    }

    public T callWithException(Object obj, Object... objArr) throws Throwable {
        try {
            return (T) this.mMethod.invoke(checkStub(obj), objArr);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw e2;
        }
    }

    @Override // com.oplus.utils.reflect.IBaseRef
    public Class<?> getDeclaringClass() {
        if (isEmpty()) {
            return null;
        }
        return this.mMethod.getDeclaringClass();
    }

    @Override // com.oplus.utils.reflect.BaseRef, com.oplus.utils.reflect.IBaseRef
    public /* bridge */ /* synthetic */ String getName() {
        return super.getName();
    }

    @Override // com.oplus.utils.reflect.IBaseRef
    public boolean isEmpty() {
        return this.mMethod == null;
    }
}
