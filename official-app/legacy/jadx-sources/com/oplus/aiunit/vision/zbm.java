package com.oplus.aiunit.vision;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zbm implements cim {
    public static final String d = "Split:ClassNotFound";
    public final Context a;
    public final ClassLoader b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19360c;

    public zbm(Context context, ClassLoader classLoader, int i) {
        this.a = context;
        this.b = classLoader;
        this.f19360c = i;
    }

    @Override // com.oplus.aiunit.vision.cim
    public Class<?> a(String str) {
        if (!t7i.F()) {
            return null;
        }
        int i = this.f19360c;
        if (i == 1) {
            return d(str);
        }
        if (i == 2) {
            return e(str);
        }
        return null;
    }

    public final Class<?> b(String str) {
        for (e7i e7iVar : a7i.f().b()) {
            try {
                Class<?> clsF = e7iVar.f(str);
                w7i.a(d, "Class " + str + " is found in " + e7iVar.g() + " ClassLoader", new Object[0]);
                return clsF;
            } catch (ClassNotFoundException unused) {
                w7i.i(d, "Class " + str + " is not found in " + e7iVar.g() + " ClassLoader", new Object[0]);
            }
        }
        return null;
    }

    public final boolean c(String str) {
        List<String> listA;
        i7i i7iVarS = j7i.s();
        if (i7iVarS == null || (listA = i7iVarS.a(this.a)) == null || listA.isEmpty()) {
            return false;
        }
        return listA.contains(str);
    }

    public final Class<?> d(String str) {
        Class<?> clsB = b(str);
        if (clsB != null) {
            return clsB;
        }
        Class<?> clsA = bcm.f().a(str);
        if (clsA == null && !c(str)) {
            return null;
        }
        String strG = bcm.f().g(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(strG);
        t7i.E().m(arrayList);
        Class<?> clsB2 = b(str);
        if (clsB2 != null) {
            w7i.a(d, "Class " + str + " is found in Split after loading " + strG + " installed splits.", new Object[0]);
            return clsB2;
        }
        if (clsA == null) {
            return null;
        }
        w7i.i(d, "Split component " + str + " is still not found after installed " + strG + " splits, return a " + clsA.getSimpleName() + " to avoid crash", new Object[0]);
        return clsA;
    }

    public final Class<?> e(String str) {
        Class<?> clsA = bcm.f().a(str);
        if (clsA == null && !c(str)) {
            return null;
        }
        String strG = bcm.f().g(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(strG);
        t7i.E().m(arrayList);
        try {
            return this.b.loadClass(str);
        } catch (ClassNotFoundException unused) {
            if (clsA == null) {
                return null;
            }
            w7i.i(d, "Split2 component " + str + " is still not found after installing " + strG + " installed splits,return a " + clsA.getSimpleName() + " to avoid crash", new Object[0]);
            return clsA;
        }
    }
}
