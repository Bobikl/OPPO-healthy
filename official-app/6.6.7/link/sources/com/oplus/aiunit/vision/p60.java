package com.oplus.aiunit.vision;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class p60 {
    public final Object a;
    public final Map<String, Method> b;
    public final Map<Class<?>, Map<String, Method>> c;

    public p60(Object obj) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.c = concurrentHashMap;
        this.a = obj;
        Class<?> cls = obj.getClass();
        if (!concurrentHashMap.containsKey(cls)) {
            concurrentHashMap.put(cls, b(cls));
        }
        this.b = (Map) concurrentHashMap.get(cls);
    }

    public aw6 a(String str) {
        Method method = this.b.get(str);
        if (method == null) {
            return null;
        }
        n60 n60Var = new n60(this.a, method);
        mka mkaVar = (mka) method.getAnnotation(mka.class);
        if (mkaVar != null) {
            return new aw6(n60Var, mkaVar.uiThread());
        }
        return null;
    }

    public final Map<String, Method> b(Class<?> cls) {
        HashMap map = new HashMap(4);
        for (Method method : cls.getMethods()) {
            mka mkaVar = (mka) method.getAnnotation(mka.class);
            if (mkaVar != null) {
                map.put(mkaVar.product() + d14.POINT_REGEX + mkaVar.method(), method);
            }
        }
        this.c.put(cls, map);
        return map;
    }
}
