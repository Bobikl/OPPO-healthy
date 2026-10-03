package com.heytap.reflect;

import android.util.Log;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes19.dex */
public class RefObject<T> {
    private static final String TAG = "RefObject";
    private Field mField;

    public RefObject(Class<?> cls, Field field) throws NoSuchFieldException {
        Field declaredField = cls.getDeclaredField(field.getName());
        this.mField = declaredField;
        declaredField.setAccessible(true);
    }

    public T get(Object obj) {
        try {
            return (T) this.mField.get(obj);
        } catch (Exception e2) {
            Log.e(TAG, e2.toString());
            return null;
        }
    }

    public T getWithException(Object obj) throws IllegalAccessException, IllegalArgumentException {
        return (T) this.mField.get(obj);
    }

    public void set(Object obj, T t) {
        try {
            this.mField.set(obj, t);
        } catch (Exception e2) {
            Log.e(TAG, e2.toString());
        }
    }
}
