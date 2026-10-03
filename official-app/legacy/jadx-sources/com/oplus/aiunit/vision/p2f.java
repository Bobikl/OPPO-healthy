package com.oplus.aiunit.vision;

import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class p2f {
    public String a;
    public Map<String, r2f> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, Method> f15165c;

    public Method a(String str) {
        Method method = this.f15165c.get(str);
        if (method != null) {
            return method;
        }
        r2f r2fVar = this.b.get(str);
        try {
            Method declaredMethod = Class.forName(this.a).getDeclaredMethod(r2fVar.a(), b(r2fVar.b()));
            this.f15165c.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            return null;
        }
    }

    public final Class<?>[] b(String[] strArr) throws ClassNotFoundException {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        int length = strArr.length;
        Class<?>[] clsArr = new Class[length];
        for (int i = 0; i < length; i++) {
            clsArr[i] = Class.forName(strArr[i]);
        }
        return clsArr;
    }
}
