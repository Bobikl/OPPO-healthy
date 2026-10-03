package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class dvm {
    public static List<h1n> a;

    static {
        ArrayList arrayList = new ArrayList();
        a = arrayList;
        arrayList.add(new p3n());
        a.add(new jqm());
        a.add(new bnm());
        a.add(new yym());
        a.add(new kjm());
        a.add(new y9m());
        a.add(new yxm());
    }

    public static String a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object objB = b(obj);
        if (z9m.b(objB.getClass())) {
            return org.json.alipay.b.c(objB.toString());
        }
        if (Collection.class.isAssignableFrom(objB.getClass())) {
            return new org.json.alipay.a((Collection) objB).toString();
        }
        if (Map.class.isAssignableFrom(objB.getClass())) {
            return new org.json.alipay.b((Map) objB).toString();
        }
        throw new IllegalArgumentException("Unsupported Class : " + objB.getClass());
    }

    public static Object b(Object obj) {
        Object objA;
        if (obj == null) {
            return null;
        }
        for (h1n h1nVar : a) {
            if (h1nVar.a(obj.getClass()) && (objA = h1nVar.a(obj)) != null) {
                return objA;
            }
        }
        throw new IllegalArgumentException("Unsupported Class : " + obj.getClass());
    }
}
