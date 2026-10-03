package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class opm implements xlm {
    public final uxm a;
    public List<String> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<String> f15015c;
    public List<String> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map<String, List<String>> f15016e;

    public opm(uxm uxmVar) {
        this.a = uxmVar;
    }

    @Override // com.oplus.aiunit.vision.xlm
    @SuppressLint({"DiscouragedPrivateApi"})
    public void a(Application application, Context context) throws com.oplus.oms.split.full.splitload.c.b {
        if (application != null) {
            try {
                Method declaredMethod = ContextWrapper.class.getDeclaredMethod("attachBaseContext", Context.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(application, context);
                e = null;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                e = e2;
            }
            if (e != null) {
                throw new com.oplus.oms.split.full.splitload.c.b(e);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.xlm
    @SuppressLint({"PrivateApi"})
    public Application b(ClassLoader classLoader, String str) throws com.oplus.oms.split.full.splitload.c.b {
        if (this.a == null) {
            return null;
        }
        String strB = bsm.b(str);
        if (TextUtils.isEmpty(strB)) {
            e = null;
        } else {
            try {
                return (Application) classLoader.loadClass(strB).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
                e = e2;
            }
        }
        if (e == null) {
            return null;
        }
        throw new com.oplus.oms.split.full.splitload.c.b(e);
    }

    @Override // com.oplus.aiunit.vision.xlm
    public boolean c(String str) {
        uxm uxmVar;
        if (this.d == null && (uxmVar = this.a) != null) {
            this.d = uxmVar.b();
        }
        List<String> list = this.d;
        if (list == null) {
            return false;
        }
        return list.contains(str);
    }

    @Override // com.oplus.aiunit.vision.xlm
    public String d(String str) {
        uxm uxmVar = this.a;
        if (uxmVar == null) {
            return null;
        }
        return uxmVar.b.get(str);
    }

    @Override // com.oplus.aiunit.vision.xlm
    public boolean a(String str) {
        if (this.b == null && c() != null) {
            Collection<List<String>> collectionValues = c().values();
            ArrayList arrayList = new ArrayList(0);
            if (!collectionValues.isEmpty()) {
                Iterator<List<String>> it = collectionValues.iterator();
                while (it.hasNext()) {
                    arrayList.addAll(it.next());
                }
            }
            this.b = arrayList;
        }
        List<String> list = this.b;
        if (list == null) {
            return false;
        }
        return list.contains(str);
    }

    public final Map<String, List<String>> c() {
        uxm uxmVar;
        if (this.f15016e == null && (uxmVar = this.a) != null) {
            this.f15016e = uxmVar.a();
        }
        return this.f15016e;
    }

    @Override // com.oplus.aiunit.vision.xlm
    public boolean b(String str) {
        uxm uxmVar;
        if (this.f15015c == null && (uxmVar = this.a) != null) {
            this.f15015c = uxmVar.c();
        }
        List<String> list = this.f15015c;
        if (list == null) {
            return false;
        }
        return list.contains(str);
    }
}
