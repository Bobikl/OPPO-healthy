package com.oplus.utils.reflect;

import android.util.Log;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes8.dex */
public class RefInt extends BaseField<Integer> {
    private static final int DEFAULT_VALUE = ((Integer) BaseRef.DEFAULT_TYPES.get(Integer.class)).intValue();
    private static final String TAG = "RefInt";

    public RefInt(Class<?> cls, Field field) {
        super(cls, field, TAG);
    }

    @Override // com.oplus.utils.reflect.BaseRef, com.oplus.utils.reflect.IBaseRef
    public /* bridge */ /* synthetic */ void bindStub(Object obj) {
        super.bindStub(obj);
    }

    public int get(Object obj) {
        return getWithDefault(obj, DEFAULT_VALUE);
    }

    @Override // com.oplus.utils.reflect.BaseField, com.oplus.utils.reflect.IBaseRef
    public /* bridge */ /* synthetic */ Class getDeclaringClass() {
        return super.getDeclaringClass();
    }

    @Override // com.oplus.utils.reflect.BaseRef, com.oplus.utils.reflect.IBaseRef
    public /* bridge */ /* synthetic */ String getName() {
        return super.getName();
    }

    public int getWithDefault(Object obj, int i) {
        try {
            return getWithException(obj);
        } catch (Exception e2) {
            Log.e(TAG, e2.getMessage());
            return i;
        }
    }

    public int getWithException(Object obj) throws Exception {
        return this.mField.getInt(checkStub(obj));
    }

    @Override // com.oplus.utils.reflect.BaseField, com.oplus.utils.reflect.IBaseRef
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public void set(Object obj, int i) {
        try {
            this.mField.setInt(checkStub(obj), i);
        } catch (Exception e2) {
            Log.e(TAG, e2.getMessage());
        }
    }
}
