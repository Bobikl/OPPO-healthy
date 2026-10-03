package com.oplus.aiunit.vision;

import android.content.Context;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.PathClassLoader;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class vlm extends PathClassLoader {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f17900c = "SplitDelegateClassloader";
    public BaseDexClassLoader a;
    public cim b;

    public vlm(ClassLoader classLoader) {
        super("", classLoader);
        this.a = (BaseDexClassLoader) classLoader;
    }

    public static void a(Context context, ClassLoader classLoader) throws IllegalAccessException, NoSuchFieldException {
        Object obj = wlm.a(context, "mPackageInfo").get(context);
        if (obj != null) {
            wlm.a(obj, "mClassLoader").set(obj, classLoader);
        }
        wlm.a(context, "mClassLoader").set(context, classLoader);
    }

    public static void b(ClassLoader classLoader, Context context) throws IllegalAccessException, NoSuchFieldException {
        a(context, new vlm(classLoader));
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Class<?> findClass(String str) throws ClassNotFoundException {
        Class<?> clsA;
        try {
            return this.a.loadClass(str);
        } catch (ClassNotFoundException e2) {
            cim cimVar = this.b;
            if (cimVar == null || (clsA = cimVar.a(str)) == null) {
                throw e2;
            }
            return clsA;
        }
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public String findLibrary(String str) {
        w7i.a(f17900c, "findLibrary0 " + str, new Object[0]);
        String strFindLibrary = this.a.findLibrary(str);
        if (strFindLibrary == null) {
            Iterator<e7i> it = a7i.f().b().iterator();
            while (it.hasNext() && (strFindLibrary = it.next().b(str)) == null) {
            }
        }
        return strFindLibrary;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public URL findResource(String str) {
        URL urlFindResource = super.findResource(str);
        if (urlFindResource == null) {
            Iterator<e7i> it = a7i.f().b().iterator();
            while (it.hasNext() && (urlFindResource = it.next().c(str)) == null) {
            }
        }
        return urlFindResource;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Enumeration<URL> findResources(String str) throws IOException {
        Enumeration<URL> enumerationFindResources = super.findResources(str);
        if (enumerationFindResources == null) {
            Iterator<e7i> it = a7i.f().b().iterator();
            while (it.hasNext() && (enumerationFindResources = it.next().d(str)) == null) {
            }
        }
        return enumerationFindResources;
    }

    @Override // java.lang.ClassLoader
    public URL getResource(String str) {
        return this.a.getResource(str);
    }

    @Override // java.lang.ClassLoader
    public Enumeration<URL> getResources(String str) throws IOException {
        return this.a.getResources(str);
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str) throws ClassNotFoundException {
        return findClass(str);
    }
}
