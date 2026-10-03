package com.heytap.store.util;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes15.dex */
public class HarmonyOSUtil {
    public static boolean isHarmonyOSa() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            Method method = cls.getMethod("getOsBrand", new Class[0]);
            ClassLoader classLoader = cls.getClassLoader();
            if (classLoader == null || classLoader.getParent() != null) {
                return false;
            }
            return "harmony".equals(method.invoke(cls, new Object[0]));
        } catch (Exception unused) {
            return false;
        }
    }
}
