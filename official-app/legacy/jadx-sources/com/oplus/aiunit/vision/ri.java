package com.oplus.aiunit.vision;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class ri {
    public static Object a(Object obj, String str, Class[] clsArr, Object[] objArr) {
        try {
            Method declaredMethod = Class.forName(obj.getClass().getName()).getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(obj, objArr);
        } catch (Exception e2) {
            mb.a("AcIntercept.Reflect", "invokeMethod exception " + e2.getMessage() + ",obj:" + obj + "methodName:" + str + "paramTypes:" + clsArr + ", params:" + objArr);
            return null;
        }
    }

    public static Object b(String str, String str2, Class[] clsArr, Object[] objArr) {
        try {
            Method declaredMethod = Class.forName(str).getDeclaredMethod(str2, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, objArr);
        } catch (Exception e2) {
            mb.a("AcIntercept.Reflect", "invokeStaticMethod1 exception " + e2.getMessage() + ",clzName:" + str + "methodName:" + str2 + "paramTypes:" + clsArr + ", params:" + objArr);
            return null;
        }
    }
}
