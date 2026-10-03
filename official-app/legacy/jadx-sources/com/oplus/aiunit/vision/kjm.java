package com.oplus.aiunit.vision;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes12.dex */
public final class kjm implements szm, h1n {
    public static Collection<Object> c(Class<?> cls, Type type) {
        if (cls == AbstractCollection.class) {
            return new ArrayList();
        }
        if (cls.isAssignableFrom(HashSet.class)) {
            return new HashSet();
        }
        if (cls.isAssignableFrom(LinkedHashSet.class)) {
            return new LinkedHashSet();
        }
        if (cls.isAssignableFrom(TreeSet.class)) {
            return new TreeSet();
        }
        if (cls.isAssignableFrom(ArrayList.class)) {
            return new ArrayList();
        }
        if (cls.isAssignableFrom(EnumSet.class)) {
            return EnumSet.noneOf((Class) (type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class));
        }
        try {
            return (Collection) cls.newInstance();
        } catch (Exception unused) {
            throw new IllegalArgumentException("create instane error, class " + cls.getName());
        }
    }

    @Override // com.oplus.aiunit.vision.h1n
    public final Object a(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(dvm.b(it.next()));
        }
        return arrayList;
    }

    @Override // com.oplus.aiunit.vision.szm
    public final Object b(Object obj, Type type) {
        if (!obj.getClass().equals(org.json.alipay.a.class)) {
            return null;
        }
        org.json.alipay.a aVar = (org.json.alipay.a) obj;
        Collection<Object> collectionC = c(z9m.a(type), type);
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalArgumentException("Does not support the implement for generics.");
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        for (int i = 0; i < aVar.a(); i++) {
            collectionC.add(psm.a(aVar.a(i), type2));
        }
        return collectionC;
    }

    @Override // com.oplus.aiunit.vision.szm, com.oplus.aiunit.vision.h1n
    public final boolean a(Class<?> cls) {
        return Collection.class.isAssignableFrom(cls);
    }
}
