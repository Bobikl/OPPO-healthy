package com.oplus.aiunit.vision;

import android.os.Build;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class pum {
    public static final String a = "SplitCompatLibraryLoader";

    public static final class a {
        public static void a(ClassLoader classLoader, File file) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, ClassCastException, InvocationTargetException {
            Object obj = wlm.a(classLoader, "pathList").get(classLoader);
            if (obj == null) {
                w7i.i(pum.a, "V23 dexPathList null", new Object[0]);
                return;
            }
            List arrayList = (List) wlm.a(obj, "nativeLibraryDirectories").get(obj);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (file.equals((File) it.next())) {
                    it.remove();
                    break;
                }
            }
            arrayList.add(0, file);
            List arrayList2 = (List) wlm.a(obj, "systemNativeLibraryDirectories").get(obj);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList(2);
            }
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + arrayList.size() + 1);
            arrayList3.addAll(arrayList);
            arrayList3.addAll(arrayList2);
            wlm.a(obj, "nativeLibraryPathElements").set(obj, (Object[]) wlm.c(obj, "makePathElements", List.class, File.class, List.class).invoke(obj, arrayList3, null, new ArrayList()));
        }
    }

    public static final class b {
        public static void a(ClassLoader classLoader, File file) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, ClassCastException, InvocationTargetException {
            Object obj = wlm.a(classLoader, "pathList").get(classLoader);
            if (obj == null) {
                w7i.i(pum.a, "V25 dexPathList null", new Object[0]);
                return;
            }
            List arrayList = (List) wlm.a(obj, "nativeLibraryDirectories").get(obj);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (file.equals((File) it.next())) {
                    it.remove();
                    break;
                }
            }
            arrayList.add(0, file);
            List arrayList2 = (List) wlm.a(obj, "systemNativeLibraryDirectories").get(obj);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList(2);
            }
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + arrayList.size() + 1);
            arrayList3.addAll(arrayList);
            arrayList3.addAll(arrayList2);
            wlm.a(obj, "nativeLibraryPathElements").set(obj, (Object[]) wlm.c(obj, "makePathElements", List.class).invoke(obj, arrayList3));
        }
    }

    public static void a(ClassLoader classLoader, File file) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        if (file == null || !file.exists()) {
            w7i.c(a, "load, folder " + file + " is illegal", new Object[0]);
            return;
        }
        try {
            b.a(classLoader, file);
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e2) {
            w7i.c(a, "load, v25 fail, sdk: " + Build.VERSION.SDK_INT + ", error: " + e2.getMessage() + ", try to fallback to V23", new Object[0]);
            a.a(classLoader, file);
        }
    }
}
