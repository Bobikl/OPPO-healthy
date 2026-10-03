package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.oplus.oms.split.full.splitload.SplitCompatResourcesException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class d7i {
    public static final acm a = new b(null);

    public static class b implements acm {
        public b(a aVar) {
        }

        public static Collection<String> c() {
            r7i r7iVarE = t7i.E();
            return r7iVarE != null ? r7iVarE.c() : Collections.emptyList();
        }

        public static List<String> d(AssetManager assetManager) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
            ArrayList arrayList = new ArrayList();
            Object[] objArr = (Object[]) d.b().invoke(assetManager, null);
            if (objArr != null) {
                for (Object obj : objArr) {
                    arrayList.add((String) d.c().invoke(obj, null));
                }
            }
            return arrayList;
        }

        public static void e(Context context, Resources resources) throws SplitCompatResourcesException {
            try {
                List<String> listD = d(resources.getAssets());
                Collection<String> collectionC = c();
                if (collectionC == null || collectionC.isEmpty() || listD.containsAll(collectionC)) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (String str : collectionC) {
                    if (!listD.contains(str)) {
                        arrayList.add(str);
                    }
                }
                try {
                    c.d(resources, arrayList);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                    throw new SplitCompatResourcesException("Failed to install resources " + arrayList + " for " + context.getClass().getName(), e2);
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e3) {
                throw new SplitCompatResourcesException("Failed to get all loaded split resources for ".concat(context.getClass().getName()), e3);
            }
        }

        @Override // com.oplus.aiunit.vision.acm
        public void a(Context context, Resources resources) throws SplitCompatResourcesException {
            e(context, resources);
        }

        @Override // com.oplus.aiunit.vision.acm
        public void b(Context context, Resources resources, String str) throws SplitCompatResourcesException {
            try {
                if (d(resources.getAssets()).contains(str)) {
                    return;
                }
                try {
                    c.d(resources, Collections.singletonList(str));
                    w7i.a("SplitCompatResourcesLoader", "Install split " + str + " resources for application.", new Object[0]);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                    throw new SplitCompatResourcesException("installSplitResDirs error ".concat(context.getClass().getName()), e2);
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e3) {
                throw new SplitCompatResourcesException("getLoadedResourcesDirs error ".concat(context.getClass().getName()), e3);
            }
        }
    }

    public static class c extends d {
        public static void d(Resources resources, List<String> list) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Method methodA = d.a();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                methodA.invoke(resources.getAssets(), it.next());
            }
        }
    }

    public static abstract class d {
        public static Field a;
        public static Method b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static Method f10413c;
        public static Method d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static Method f10414e;

        public static Method a() throws NoSuchMethodException {
            if (b == null) {
                b = wlm.b(AssetManager.class, "addAssetPath", String.class);
            }
            return b;
        }

        public static Method b() throws NoSuchMethodException {
            if (d == null) {
                d = wlm.b(AssetManager.class, "getApkAssets", new Class[0]);
            }
            return d;
        }

        @SuppressLint({"PrivateApi"})
        public static Method c() throws NoSuchMethodException, ClassNotFoundException {
            if (f10413c == null) {
                f10413c = wlm.b(Class.forName("android.content.res.ApkAssets"), "getAssetPath", new Class[0]);
            }
            return f10413c;
        }
    }

    public static void a(Context context, Resources resources, String str) throws SplitCompatResourcesException {
        a.b(context, resources, str);
    }

    public static void b(Context context, Resources resources) throws SplitCompatResourcesException {
        a.a(context, resources);
    }
}
