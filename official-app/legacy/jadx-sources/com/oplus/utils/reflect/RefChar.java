package com.oplus.utils.reflect;

import android.util.Log;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes8.dex */
public class RefChar extends BaseField<Character> {
    private static final char DEFAULT_VALUE = ((Character) BaseRef.DEFAULT_TYPES.get(Character.class)).charValue();
    private static final String TAG = "RefChar";

    public RefChar(Class<?> cls, Field field) {
        super(cls, field, TAG);
    }

    @Override // com.oplus.utils.reflect.BaseRef, com.oplus.utils.reflect.IBaseRef
    public /* bridge */ /* synthetic */ void bindStub(Object obj) {
        super.bindStub(obj);
    }

    public char get(Object obj) {
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

    public char getWithDefault(Object obj, char c2) {
        try {
            return getWithException(obj);
        } catch (Exception e2) {
            Log.e(TAG, e2.getMessage());
            return c2;
        }
    }

    public char getWithException(Object obj) throws Exception {
        return this.mField.getChar(checkStub(obj));
    }

    @Override // com.oplus.utils.reflect.BaseField, com.oplus.utils.reflect.IBaseRef
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public void set(Object obj, char c2) {
        try {
            this.mField.setChar(checkStub(obj), c2);
        } catch (Exception e2) {
            Log.e(TAG, e2.getMessage());
        }
    }
}
