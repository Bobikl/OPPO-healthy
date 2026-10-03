package com.heytap.reflect;

import android.util.Log;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes19.dex */
public class RefStaticInt {
    private static final String TAG = "RefStaticInt";
    private Field mField;

    public RefStaticInt(Class<?> cls, Field field) throws NoSuchFieldException {
        Field declaredField = cls.getDeclaredField(field.getName());
        this.mField = declaredField;
        declaredField.setAccessible(true);
    }

    public int get() {
        try {
            return this.mField.getInt(null);
        } catch (Exception e2) {
            Log.e(TAG, e2.toString());
            return 0;
        }
    }

    public int getWithException() throws IllegalAccessException, IllegalArgumentException {
        return this.mField.getInt(null);
    }

    public void set(int i) {
        try {
            this.mField.setInt(null, i);
        } catch (Exception e2) {
            Log.e(TAG, e2.toString());
        }
    }
}
