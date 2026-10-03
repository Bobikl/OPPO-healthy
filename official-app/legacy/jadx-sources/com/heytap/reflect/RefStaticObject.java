package com.heytap.reflect;

import android.util.Log;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes19.dex */
public class RefStaticObject<T> {
    private static final String TAG = "RefStaticObject";
    private Field mField;

    public RefStaticObject(Class<?> cls, Field field) throws NoSuchFieldException {
        Field declaredField = cls.getDeclaredField(field.getName());
        this.mField = declaredField;
        declaredField.setAccessible(true);
    }

    public T get() {
        try {
            return (T) this.mField.get(null);
        } catch (Exception e2) {
            Log.e(TAG, e2.toString());
            return null;
        }
    }

    public T getWithException() throws IllegalAccessException, IllegalArgumentException {
        return (T) this.mField.get(null);
    }

    public void set(T t) {
        try {
            this.mField.set(null, t);
        } catch (Exception e2) {
            Log.e(TAG, e2.toString());
        }
    }

    public Class<?> type() {
        return this.mField.getType();
    }
}
