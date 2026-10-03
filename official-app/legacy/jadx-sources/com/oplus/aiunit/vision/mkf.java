package com.oplus.aiunit.vision;

import dalvik.system.PathClassLoader;

/* JADX INFO: loaded from: classes8.dex */
public class mkf {
    public static ClassLoader a;

    public static ClassLoader a() {
        return a;
    }

    public static Class<?> b(String str) throws ClassNotFoundException {
        ClassLoader classLoader = a;
        return classLoader != null ? Class.forName(str, true, classLoader) : Class.forName(str);
    }

    public static void c(ClassLoader classLoader) {
        if (classLoader instanceof PathClassLoader) {
            a = classLoader;
        }
    }
}
