package com.heytap.reflect;

import android.util.Log;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes19.dex */
public class RefBoolean {
    private static final String TAG = "RefBoolean";
    private Field mField;

    public RefBoolean(Class<?> cls, Field field) throws NoSuchFieldException {
        Field declaredField = cls.getDeclaredField(field.getName());
        this.mField = declaredField;
        declaredField.setAccessible(true);
    }

    public boolean get(Object obj) {
        try {
            return this.mField.getBoolean(obj);
        } catch (Exception e2) {
            Log.e(TAG, e2.toString());
            return false;
        }
    }

    public boolean getWithException(Object obj) throws IllegalAccessException, IllegalArgumentException {
        return this.mField.getBoolean(obj);
    }

    public void set(Object obj, boolean z) {
        try {
            this.mField.setBoolean(obj, z);
        } catch (Exception e2) {
            Log.e(TAG, e2.toString());
        }
    }
}
