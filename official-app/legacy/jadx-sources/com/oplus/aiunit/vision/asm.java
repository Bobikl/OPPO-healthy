package com.oplus.aiunit.vision;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class asm {
    public static final String a = "SplitCompatDexLoader";
    public static int b;

    public static final class a {
        public static Object[] a(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Method methodC;
            try {
                methodC = wlm.c(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class);
            } catch (NoSuchMethodException unused) {
                w7i.c(asm.a, "NoSuchMethodException: makeDexElements(ArrayList,File,ArrayList) failure", new Object[0]);
                try {
                    methodC = wlm.c(obj, "makeDexElements", List.class, File.class, List.class);
                } catch (NoSuchMethodException e2) {
                    w7i.c(asm.a, "NoSuchMethodException: makeDexElements(List,File,List) failure", new Object[0]);
                    throw e2;
                }
            }
            return (Object[]) methodC.invoke(obj, arrayList, file, arrayList2);
        }
    }

    public static final class b {
        public static Object[] a(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Method methodC;
            try {
                methodC = wlm.c(obj, "makePathElements", List.class, File.class, List.class);
            } catch (NoSuchMethodException unused) {
                w7i.c(asm.a, "NoSuchMethodException: makePathElements(List,File,List) failure", new Object[0]);
                try {
                    methodC = wlm.c(obj, "makePathElements", ArrayList.class, File.class, ArrayList.class);
                } catch (NoSuchMethodException unused2) {
                    w7i.c(asm.a, "NoSuchMethodException: makeDexElements(ArrayList,File,ArrayList) failure", new Object[0]);
                    try {
                        w7i.i(asm.a, "NoSuchMethodException: try use v19 instead", new Object[0]);
                        return a.a(obj, arrayList, file, arrayList2);
                    } catch (NoSuchMethodException e2) {
                        w7i.c(asm.a, "NoSuchMethodException: makeDexElements(List,File,List) failure", new Object[0]);
                        throw e2;
                    }
                }
            }
            return (Object[]) methodC.invoke(obj, arrayList, file, arrayList2);
        }

        public static void b(ClassLoader classLoader, List<File> list, File file) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, IOException, IllegalArgumentException, InvocationTargetException {
            Object obj = wlm.a(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            wlm.e(obj, "dexElements", a(obj, new ArrayList(list), file, arrayList));
            if (arrayList.isEmpty()) {
                return;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                IOException iOException = (IOException) it.next();
                w7i.b(asm.a, "Exception in makePathElement", iOException);
                throw iOException;
            }
        }
    }

    public static void a(ClassLoader classLoader) throws IllegalAccessException, NoSuchFieldException {
        if (b <= 0) {
            return;
        }
        wlm.d(wlm.a(classLoader, "pathList").get(classLoader), "dexElements", b);
    }

    public static void b(ClassLoader classLoader, File file, List<File> list) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, IOException, InvocationTargetException {
        if (list.isEmpty()) {
            w7i.i(a, "load null", new Object[0]);
        } else {
            b.b(classLoader, list, file);
            b = list.size();
        }
    }
}
