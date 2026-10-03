package com.oplus.utils.reflect;

import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class RefConstructor<T> extends BaseRef<T> {
    private static final String TAG = "RefConstructor";
    private final Constructor<?> mConstructor;

    public RefConstructor(Class<?> cls, Field field) {
        super(field);
        this.mConstructor = load(cls, field);
    }

    private Constructor<?> load(Class<?> cls, Field field) {
        Constructor<?> declaredConstructor;
        Constructor<?> constructor = null;
        try {
            if (field.isAnnotationPresent(MethodName.class)) {
                declaredConstructor = cls.getDeclaredConstructor(((MethodName) field.getAnnotation(MethodName.class)).params());
            } else {
                int i = 0;
                if (field.isAnnotationPresent(MethodSignature.class)) {
                    String[] strArrParams = ((MethodSignature) field.getAnnotation(MethodSignature.class)).params();
                    Class<?>[] clsArr = new Class[strArrParams.length];
                    while (i < strArrParams.length) {
                        try {
                            clsArr[i] = Class.forName(strArrParams[i]);
                            i++;
                        } catch (Exception e) {
                            Log.e(TAG, e.getMessage());
                        }
                    }
                    declaredConstructor = cls.getDeclaredConstructor(clsArr);
                } else {
                    declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                }
            }
            constructor = declaredConstructor;
            if (constructor != null && !constructor.isAccessible()) {
                constructor.setAccessible(true);
            }
        } catch (Exception e2) {
            Log.e(TAG, e2.getMessage());
        }
        return constructor;
    }

    private void printCauseMessage(InvocationTargetException invocationTargetException) {
        Throwable cause = invocationTargetException.getCause();
        if (cause != null) {
            Log.e(TAG, cause.getMessage());
        } else {
            Log.e(TAG, invocationTargetException.getMessage());
        }
    }

    @Override // com.oplus.utils.reflect.BaseRef, com.oplus.utils.reflect.IBaseRef
    public /* bridge */ /* synthetic */ void bindStub(Object obj) {
        super.bindStub(obj);
    }

    @Override // com.oplus.utils.reflect.IBaseRef
    public Class<?> getDeclaringClass() {
        if (isEmpty()) {
            return null;
        }
        return this.mConstructor.getDeclaringClass();
    }

    @Override // com.oplus.utils.reflect.BaseRef, com.oplus.utils.reflect.IBaseRef
    public /* bridge */ /* synthetic */ String getName() {
        return super.getName();
    }

    @Override // com.oplus.utils.reflect.IBaseRef
    public boolean isEmpty() {
        return this.mConstructor == null;
    }

    public T newInstance() {
        try {
            return (T) this.mConstructor.newInstance(new Object[0]);
        } catch (InvocationTargetException e) {
            printCauseMessage(e);
            return null;
        } catch (Exception e2) {
            Log.e(TAG, e2.getMessage());
            return null;
        }
    }

    public T newInstance(Object... objArr) {
        try {
            return (T) this.mConstructor.newInstance(objArr);
        } catch (InvocationTargetException e) {
            printCauseMessage(e);
            return null;
        } catch (Exception e2) {
            Log.e(TAG, e2.getMessage());
            return null;
        }
    }
}
