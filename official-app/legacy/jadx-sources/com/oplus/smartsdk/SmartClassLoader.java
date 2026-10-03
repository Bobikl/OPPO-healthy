package com.oplus.smartsdk;

import dalvik.system.DexClassLoader;

/* JADX INFO: loaded from: classes8.dex */
public class SmartClassLoader extends DexClassLoader {
    private final ClassLoader mHostClassLoader;

    public SmartClassLoader(String str, String str2, String str3, ClassLoader classLoader) {
        super(str, str2, str3, classLoader.getParent());
        this.mHostClassLoader = classLoader;
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str) throws ClassNotFoundException {
        return str.startsWith("com.oplus.smartsdk.") ? this.mHostClassLoader.loadClass(str) : super.loadClass(str);
    }
}
