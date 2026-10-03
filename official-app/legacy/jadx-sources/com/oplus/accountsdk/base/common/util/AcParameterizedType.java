package com.oplus.accountsdk.base.common.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class AcParameterizedType implements ParameterizedType {
    Class clazz;

    public AcParameterizedType(Class cls) {
        this.clazz = cls;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return new Type[]{this.clazz};
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return null;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return List.class;
    }
}
