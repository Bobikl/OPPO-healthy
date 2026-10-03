package com.oplus.aiunit.vision;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class f60 {
    public final Object a;
    public final Map<String, Method> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Class<?>, Map<String, Method>> f11231c;

    public f60(Object obj) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f11231c = concurrentHashMap;
        this.a = obj;
        Class<?> cls = obj.getClass();
        if (!concurrentHashMap.containsKey(cls)) {
            concurrentHashMap.put(cls, b(cls));
        }
        this.b = (Map) concurrentHashMap.get(cls);
    }

    public zu6 a(String str) {
        Method method = this.b.get(str);
        if (method == null) {
            return null;
        }
        d60 d60Var = new d60(this.a, method);
        eja ejaVar = (eja) method.getAnnotation(eja.class);
        if (ejaVar != null) {
            return new zu6(d60Var, ejaVar.uiThread());
        }
        return null;
    }

    public final Map<String, Method> b(Class<?> cls) {
        HashMap map = new HashMap(4);
        for (Method method : cls.getMethods()) {
            eja ejaVar = (eja) method.getAnnotation(eja.class);
            if (ejaVar != null) {
                map.put(ejaVar.product() + "." + ejaVar.method(), method);
            }
        }
        this.f11231c.put(cls, map);
        return map;
    }
}
