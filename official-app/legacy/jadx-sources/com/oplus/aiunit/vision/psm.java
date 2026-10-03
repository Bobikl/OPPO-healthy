package com.oplus.aiunit.vision;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class psm {
    public static List<szm> a;

    static {
        ArrayList arrayList = new ArrayList();
        a = arrayList;
        arrayList.add(new p3n());
        a.add(new jqm());
        a.add(new bnm());
        a.add(new yym());
        a.add(new o2n());
        a.add(new kjm());
        a.add(new y9m());
        a.add(new yxm());
    }

    public static final <T> T a(Object obj, Type type) {
        T t;
        for (szm szmVar : a) {
            if (szmVar.a(z9m.a(type)) && (t = (T) szmVar.b(obj, type)) != null) {
                return t;
            }
        }
        return null;
    }

    public static final Object b(String str, Type type) {
        Object bVar;
        if (str == null || str.length() == 0) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.startsWith("[") && strTrim.endsWith("]")) {
            bVar = new org.json.alipay.a(strTrim);
        } else {
            if (!strTrim.startsWith(n04.OPEN_BRACE_REGEX) || !strTrim.endsWith("}")) {
                return a(strTrim, type);
            }
            bVar = new org.json.alipay.b(strTrim);
        }
        return a(bVar, type);
    }
}
