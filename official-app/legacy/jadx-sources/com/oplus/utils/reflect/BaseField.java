package com.oplus.utils.reflect;

import android.util.Log;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes8.dex */
abstract class BaseField<T> extends BaseRef<T> {
    final Field mField;

    public BaseField(Class<?> cls, Field field, String str) {
        super(field);
        this.mField = getField(cls, field, str);
    }

    private Field getField(Class<?> cls, Field field, String str) {
        Field declaredField = null;
        try {
            declaredField = cls.getDeclaredField(field.getName());
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Exception e2) {
            Log.e(str, e2.getMessage());
            return declaredField;
        }
    }

    @Override // com.oplus.utils.reflect.IBaseRef
    public Class<?> getDeclaringClass() {
        if (isEmpty()) {
            return null;
        }
        return this.mField.getDeclaringClass();
    }

    @Override // com.oplus.utils.reflect.IBaseRef
    public boolean isEmpty() {
        return this.mField == null;
    }
}
