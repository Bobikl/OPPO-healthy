package com.oplus.utils.reflect;

import android.util.Log;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes8.dex */
public class RefLong extends BaseField<Long> {
    private static final long DEFAULT_VALUE = ((Long) BaseRef.DEFAULT_TYPES.get(Long.class)).longValue();
    private static final String TAG = "RefLong";

    public RefLong(Class<?> cls, Field field) {
        super(cls, field, TAG);
    }

    @Override // com.oplus.utils.reflect.BaseRef, com.oplus.utils.reflect.IBaseRef
    public /* bridge */ /* synthetic */ void bindStub(Object obj) {
        super.bindStub(obj);
    }

    public long get(Object obj) {
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

    public long getWithDefault(Object obj, long j2) {
        try {
            return getWithException(obj);
        } catch (Exception e2) {
            Log.e(TAG, e2.getMessage());
            return j2;
        }
    }

    public long getWithException(Object obj) throws Exception {
        return this.mField.getLong(checkStub(obj));
    }

    @Override // com.oplus.utils.reflect.BaseField, com.oplus.utils.reflect.IBaseRef
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public void set(Object obj, long j2) {
        try {
            this.mField.setLong(checkStub(obj), j2);
        } catch (Exception e2) {
            Log.e(TAG, e2.getMessage());
        }
    }
}
