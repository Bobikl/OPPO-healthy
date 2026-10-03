package com.oplus.aiunit.vision;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class o2n implements szm {
    @Override // com.oplus.aiunit.vision.szm, com.oplus.aiunit.vision.h1n
    public final boolean a(Class<?> cls) {
        return Set.class.isAssignableFrom(cls);
    }

    @Override // com.oplus.aiunit.vision.szm
    public final Object b(Object obj, Type type) {
        if (!obj.getClass().equals(org.json.alipay.a.class)) {
            return null;
        }
        org.json.alipay.a aVar = (org.json.alipay.a) obj;
        HashSet hashSet = new HashSet();
        Type type2 = type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class;
        for (int i = 0; i < aVar.a(); i++) {
            hashSet.add(psm.a(aVar.a(i), type2));
        }
        return hashSet;
    }
}
