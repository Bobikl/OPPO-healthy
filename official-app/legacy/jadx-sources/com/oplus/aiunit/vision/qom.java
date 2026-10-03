package com.oplus.aiunit.vision;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes12.dex */
public final class qom {
    public static final Map<String, a> a = new ConcurrentHashMap();

    public static class a {
        public String a;
        public long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f15885c;
    }

    public static String a(String str) {
        a aVar;
        String str2;
        Map<String, a> map = a;
        if (map == null || (aVar = map.get(str)) == null) {
            return null;
        }
        if ((System.currentTimeMillis() - aVar.b < aVar.f15885c) && (str2 = aVar.a) != null) {
            return str2;
        }
        map.remove(str);
        return null;
    }

    public static void b(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        Map<String, a> map = a;
        a aVar = map.get(str);
        if (aVar == null) {
            aVar = new a();
        }
        aVar.a = str2;
        aVar.f15885c = 86400000L;
        aVar.b = System.currentTimeMillis();
        map.put(str, aVar);
    }
}
