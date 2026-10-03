package com.heytap.reflect;

import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes19.dex */
public class RefMethod<T> {
    private static final String TAG = "RefMethod";
    private Method mMethod;

    public RefMethod(Class<?> cls, Field field) throws NoSuchMethodException {
        if (field.isAnnotationPresent(MethodName.class)) {
            setMethod(cls, field, ((MethodName) field.getAnnotation(MethodName.class)).params(), ((MethodName) field.getAnnotation(MethodName.class)).name());
            this.mMethod.setAccessible(true);
        } else {
            int i = 0;
            if (field.isAnnotationPresent(MethodSignature.class)) {
                String[] strArrParams = ((MethodSignature) field.getAnnotation(MethodSignature.class)).params();
                Class<?>[] clsArr = new Class[strArrParams.length];
                while (i < strArrParams.length) {
                    Class<?> protoType = RefStaticMethod.getProtoType(strArrParams[i]);
                    if (protoType == null) {
                        try {
                            protoType = Class.forName(strArrParams[i]);
                        } catch (ClassNotFoundException e2) {
                            Log.e(TAG, e2.toString());
                        }
                    }
                    clsArr[i] = protoType;
                    i++;
                }
                setMethod(cls, field, clsArr, ((MethodSignature) field.getAnnotation(MethodSignature.class)).name());
                this.mMethod.setAccessible(true);
            } else {
                Method[] declaredMethods = cls.getDeclaredMethods();
                int length = declaredMethods.length;
                while (i < length) {
                    Method method = declaredMethods[i];
                    if (method.getName().equals(field.getName())) {
                        this.mMethod = method;
                        method.setAccessible(true);
                        break;
                    }
                    i++;
                }
            }
        }
        if (this.mMethod == null) {
            throw new NoSuchMethodException(field.getName());
        }
    }

    private void setMethod(Class<?> cls, Field field, Class<?>[] clsArr, String str) throws NoSuchMethodException {
        if (str.isEmpty()) {
            this.mMethod = cls.getDeclaredMethod(field.getName(), clsArr);
        } else {
            this.mMethod = cls.getDeclaredMethod(str, clsArr);
        }
    }

    public T call(Object obj, Object... objArr) {
        try {
            return (T) this.mMethod.invoke(obj, objArr);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() != null) {
                Log.e(TAG, e2.getCause().toString());
                return null;
            }
            Log.e(TAG, e2.toString());
            return null;
        } catch (Throwable th) {
            Log.e(TAG, th.toString());
            return null;
        }
    }

    public T callWithException(Object obj, Object... objArr) throws Throwable {
        try {
            return (T) this.mMethod.invoke(obj, objArr);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() != null) {
                throw e2.getCause();
            }
            throw e2;
        }
    }

    public Class<?>[] paramList() {
        return this.mMethod.getParameterTypes();
    }
}
