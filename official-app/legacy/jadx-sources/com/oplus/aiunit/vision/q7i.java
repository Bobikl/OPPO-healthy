package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

/* JADX INFO: loaded from: classes8.dex */
public class q7i {
    public static boolean a(ClassLoader classLoader, String str, String str2) {
        try {
            Class<?> clsLoadClass = classLoader.loadClass("com.oplus.oms.split.full.core.splitlib." + str + "SplitLibraryLoader");
            wlm.b(clsLoadClass, "loadSplitLibrary", String.class).invoke(clsLoadClass.getDeclaredConstructor(null).newInstance(null), str2);
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            w7i.b("SplitLibraryLoaderHelper", "loadSplitLibrary0 error", e2);
            return false;
        }
    }

    @SuppressLint({"UnsafeDynamicallyLoadedCode"})
    public static boolean b(Context context, String str) {
        h7i.b bVarM;
        if (!t7i.F()) {
            w7i.i("SplitLibraryLoaderHelper", "hasInstance null", new Object[0]);
            return false;
        }
        if (t7i.E().f() != 1) {
            w7i.i("SplitLibraryLoaderHelper", "splitLoadMode not MULTIPLE_CLASSLOADER", new Object[0]);
            return false;
        }
        i7i i7iVarS = j7i.s();
        if (i7iVarS == null) {
            w7i.i("SplitLibraryLoaderHelper", "manager null", new Object[0]);
            return false;
        }
        Collection<h7i> collectionE = i7iVarS.e(context);
        if (collectionE == null) {
            w7i.i("SplitLibraryLoaderHelper", "splits null", new Object[0]);
            return false;
        }
        for (h7i h7iVar : collectionE) {
            try {
                bVarM = h7iVar.m(context);
            } catch (IOException unused) {
                w7i.c("SplitLibraryLoaderHelper", "loadSplitLibrary error", new Object[0]);
                bVarM = null;
            }
            if (bVarM == null) {
                w7i.i("SplitLibraryLoaderHelper", "splits libData null", new Object[0]);
            } else {
                String strQ = h7iVar.q();
                for (h7i.b.a aVar : bVarM.c()) {
                    w7i.a("SplitLibraryLoaderHelper", "splits libData getName:" + aVar.a() + ",libraryName:" + str, new Object[0]);
                    if (aVar.a().equals(System.mapLibraryName(str))) {
                        if (!(context instanceof Application)) {
                            e7i e7iVarA = a7i.f().a(h7iVar.q());
                            w7i.a("SplitLibraryLoaderHelper", "splits libData classLoader:" + e7iVarA + ",info.getSplitName:" + h7iVar.q(), new Object[0]);
                            if (e7iVarA == null) {
                                break;
                            }
                            return a(e7iVarA, h7iVar.q(), str);
                        }
                        String str2 = a8i.o().i(strQ, bVarM.b(), o7i.e(context, strQ)).getAbsolutePath() + File.separator + aVar.a();
                        w7i.a("SplitLibraryLoaderHelper", "splits libData libPath:" + str2, new Object[0]);
                        try {
                            System.load(str2);
                            return true;
                        } catch (UnsatisfiedLinkError e2) {
                            w7i.i("SplitLibraryLoaderHelper", "splits libData error:" + e2.getMessage(), new Object[0]);
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }
}
