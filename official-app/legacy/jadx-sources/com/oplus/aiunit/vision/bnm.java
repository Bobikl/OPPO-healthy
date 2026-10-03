package com.oplus.aiunit.vision;

import java.lang.reflect.Type;
import java.util.Date;

/* JADX INFO: loaded from: classes12.dex */
public final class bnm implements szm, h1n {
    @Override // com.oplus.aiunit.vision.h1n
    public final Object a(Object obj) {
        return Long.valueOf(((Date) obj).getTime());
    }

    @Override // com.oplus.aiunit.vision.szm
    public final Object b(Object obj, Type type) {
        return new Date(((Long) obj).longValue());
    }

    @Override // com.oplus.aiunit.vision.szm, com.oplus.aiunit.vision.h1n
    public final boolean a(Class<?> cls) {
        return Date.class.isAssignableFrom(cls);
    }
}
