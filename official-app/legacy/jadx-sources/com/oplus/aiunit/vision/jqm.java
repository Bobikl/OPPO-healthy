package com.oplus.aiunit.vision;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes12.dex */
public final class jqm implements szm, h1n {
    @Override // com.oplus.aiunit.vision.h1n
    public final Object a(Object obj) {
        return ((Enum) obj).name();
    }

    @Override // com.oplus.aiunit.vision.szm
    public final Object b(Object obj, Type type) {
        return Enum.valueOf((Class) type, obj.toString());
    }

    @Override // com.oplus.aiunit.vision.szm, com.oplus.aiunit.vision.h1n
    public final boolean a(Class<?> cls) {
        return Enum.class.isAssignableFrom(cls);
    }
}
