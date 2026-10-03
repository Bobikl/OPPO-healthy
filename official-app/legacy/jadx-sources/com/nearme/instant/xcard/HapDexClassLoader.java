package com.nearme.instant.xcard;

import dalvik.system.DexClassLoader;

/* JADX INFO: loaded from: classes5.dex */
public class HapDexClassLoader extends DexClassLoader {
    public HapDexClassLoader(String str, String str2, String str3, ClassLoader classLoader) {
        super(str, str2, str3, classLoader);
    }

    private boolean isOurPackage(String str) {
        if (str.startsWith("java")) {
            return false;
        }
        if (str.startsWith("android.support") || str.startsWith("androidx")) {
            return true;
        }
        return (str.startsWith("android") || str.startsWith("org.json") || str.startsWith("org.hapjs.card") || str.startsWith("com.nearme.instant.xcard")) ? false : true;
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str) throws ClassNotFoundException {
        Class<?> clsFindLoadedClass = findLoadedClass(str);
        if (clsFindLoadedClass != null) {
            return clsFindLoadedClass;
        }
        if (isOurPackage(str)) {
            try {
                clsFindLoadedClass = findClass(str);
            } catch (Exception unused) {
            }
        }
        return clsFindLoadedClass == null ? super.loadClass(str) : clsFindLoadedClass;
    }
}
