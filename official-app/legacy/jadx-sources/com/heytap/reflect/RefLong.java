package com.heytap.reflect;

import android.util.Log;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes19.dex */
public class RefLong {
    private static final String TAG = "RefLong";
    private Field mField;

    public RefLong(Class cls, Field field) throws NoSuchFieldException {
        Field declaredField = cls.getDeclaredField(field.getName());
        this.mField = declaredField;
        declaredField.setAccessible(true);
    }

    public long get(Object obj) {
        try {
            return this.mField.getLong(obj);
        } catch (Exception e2) {
            Log.e(TAG, e2.toString());
            return 0L;
        }
    }

    public long getWithException(Object obj) throws IllegalAccessException, IllegalArgumentException {
        return this.mField.getLong(obj);
    }

    public void set(Object obj, long j2) {
        try {
            this.mField.setLong(obj, j2);
        } catch (Exception e2) {
            Log.e(TAG, e2.toString());
        }
    }
}
