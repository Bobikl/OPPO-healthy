package com.oplus.aiunit.vision;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public final class y9m implements szm, h1n {
    @Override // com.oplus.aiunit.vision.h1n
    public final Object a(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Object[]) obj) {
            arrayList.add(dvm.b(obj2));
        }
        return arrayList;
    }

    @Override // com.oplus.aiunit.vision.szm
    public final Object b(Object obj, Type type) {
        if (!obj.getClass().equals(org.json.alipay.a.class)) {
            return null;
        }
        org.json.alipay.a aVar = (org.json.alipay.a) obj;
        if (type instanceof GenericArrayType) {
            throw new IllegalArgumentException("Does not support generic array!");
        }
        Class<?> componentType = ((Class) type).getComponentType();
        int iA = aVar.a();
        Object objNewInstance = Array.newInstance(componentType, iA);
        for (int i = 0; i < iA; i++) {
            Array.set(objNewInstance, i, psm.a(aVar.a(i), componentType));
        }
        return objNewInstance;
    }

    @Override // com.oplus.aiunit.vision.szm, com.oplus.aiunit.vision.h1n
    public final boolean a(Class<?> cls) {
        return cls.isArray();
    }
}
