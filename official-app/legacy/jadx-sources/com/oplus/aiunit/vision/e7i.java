package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.net.URL;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class e7i extends BaseDexClassLoader {
    public final String a;
    public final Set<e7i> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10815c;
    public ClassLoader d;

    public e7i(String str, List<String> list, File file, String str2, List<String> list2, ClassLoader classLoader) {
        super(list == null ? "" : TextUtils.join(File.pathSeparator, list), file, str2, classLoader);
        w7i.a("SplitDexClassLoader", "dexPaths:" + list + ",optimizedDirectory:" + file + ",librarySearchPath:" + str2, new Object[0]);
        this.a = str;
        this.b = a7i.f().c(list2);
        this.d = mkf.a();
    }

    public static e7i a(ClassLoader classLoader, String str, List<String> list, File file, File file2, List<String> list2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        e7i e7iVar = new e7i(str, list, file, file2 == null ? null : file2.getAbsolutePath(), list2, classLoader);
        w7i.a("SplitDexClassLoader", "Cost " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms to load " + str + " code", new Object[0]);
        return e7iVar;
    }

    public String b(String str) {
        return super.findLibrary(str);
    }

    public URL c(String str) {
        return super.findResource(str);
    }

    public Enumeration<URL> d(String str) {
        return super.findResources(str);
    }

    public boolean e() {
        return this.f10815c;
    }

    public Class<?> f(String str) throws ClassNotFoundException {
        Class<?> clsFindLoadedClass = findLoadedClass(str);
        return clsFindLoadedClass != null ? clsFindLoadedClass : super.findClass(str);
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Class<?> findClass(String str) throws ClassNotFoundException {
        if (!TextUtils.isEmpty(str) && str.contains(SplitInstallHelper.a) && this.d != null) {
            w7i.a("SplitDexClassLoader", "find class from originClassLoader - name = ".concat(str), new Object[0]);
            return this.d.loadClass(str);
        }
        try {
            return super.findClass(str);
        } catch (ClassNotFoundException e2) {
            if (this.b != null) {
                Iterator<e7i> it = this.b.iterator();
                while (it.hasNext()) {
                    e7i next = it.next();
                    try {
                        return next.f(str);
                    } catch (ClassNotFoundException unused) {
                        w7i.i("SplitDexClassLoader", "SplitDexClassLoader: Class " + str + " is not found in " + next.g() + " ClassLoader", new Object[0]);
                    }
                }
            }
            throw e2;
        }
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public String findLibrary(String str) {
        Set<e7i> set;
        w7i.a("SplitDexClassLoader", "findLibrary " + str, new Object[0]);
        String strFindLibrary = super.findLibrary(str);
        if (strFindLibrary == null && (set = this.b) != null) {
            Iterator<e7i> it = set.iterator();
            while (it.hasNext() && (strFindLibrary = it.next().findLibrary(str)) == null) {
            }
        }
        return (strFindLibrary == null && (getParent() instanceof BaseDexClassLoader)) ? ((BaseDexClassLoader) getParent()).findLibrary(str) : strFindLibrary;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public URL findResource(String str) {
        Set<e7i> set;
        URL urlFindResource = super.findResource(str);
        if (urlFindResource == null && (set = this.b) != null) {
            Iterator<e7i> it = set.iterator();
            while (it.hasNext() && (urlFindResource = it.next().c(str)) == null) {
            }
        }
        return urlFindResource;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Enumeration<URL> findResources(String str) {
        Set<e7i> set;
        Enumeration<URL> enumerationFindResources = super.findResources(str);
        if (enumerationFindResources == null && (set = this.b) != null) {
            Iterator<e7i> it = set.iterator();
            while (it.hasNext() && (enumerationFindResources = it.next().d(str)) == null) {
            }
        }
        return enumerationFindResources;
    }

    public String g() {
        return this.a;
    }

    public void h(boolean z) {
        this.f10815c = z;
    }

    @Override // dalvik.system.BaseDexClassLoader
    public String toString() {
        return "SplitDexClassLoader(0x" + Integer.toHexString(hashCode()) + "){moduleName='" + this.a + "', valid=" + this.f10815c + ", dependenciesLoaders=" + this.b + '}';
    }
}
