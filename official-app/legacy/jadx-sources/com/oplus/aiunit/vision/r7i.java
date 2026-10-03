package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes8.dex */
public abstract class r7i {
    public final Context a;
    public final Set<npm> b = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16112c;
    public final String d;

    public r7i(Context context, String str, int i) {
        this.a = context;
        this.d = str;
        this.f16112c = i;
        w7i.a("SplitLoadManager", "splitLoadMode " + i, new Object[0]);
    }

    public Context a() {
        return this.a;
    }

    public final void b(Collection<npm> collection) {
        w7i.a("SplitLoadManager", "putSplits " + collection, new Object[0]);
        this.b.addAll(collection);
    }

    public Set<String> c() {
        HashSet hashSet = new HashSet(0);
        for (npm npmVar : this.b) {
            if (new File(npmVar.f14592c).exists()) {
                hashSet.add(npmVar.f14592c);
            } else {
                w7i.a("SplitLoadManager", "Split has been loaded, but its file " + npmVar.f14592c + " is not exist!", new Object[0]);
            }
        }
        return hashSet;
    }

    public final Set<npm> d() {
        return this.b;
    }

    public final void e() {
        w7i.a("SplitLoadManager", "clear ", new Object[0]);
        this.b.clear();
    }

    public int f() {
        return this.f16112c;
    }

    public ClassLoader g() {
        ClassLoader parent = this.a.getClassLoader().getParent();
        if (!(parent instanceof PathClassLoader)) {
            return parent;
        }
        w7i.a("SplitLoadManager", "is pathclassloader", new Object[0]);
        return parent.getParent();
    }

    public Set<String> h() {
        HashSet hashSet = new HashSet(0);
        Iterator<npm> it = this.b.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().b);
        }
        w7i.a("SplitLoadManager", "getLoadedSplitNames:" + hashSet, new Object[0]);
        return hashSet;
    }

    public ClassLoader i() {
        ClassLoader classLoader = this.a.getClassLoader();
        return classLoader instanceof vlm ? classLoader.getParent() : classLoader;
    }

    public abstract void j(Resources resources);

    public abstract void k();

    public abstract void l(List<Intent> list, ajd ajdVar);

    public abstract void m(Collection<String> collection);

    public final npm n(String str) {
        Iterator<npm> it = this.b.iterator();
        while (it.hasNext()) {
            npm next = it.next();
            if (TextUtils.equals(next.b, str)) {
                it.remove();
                w7i.a("SplitLoadManager", "removeLoadedSplits " + str, new Object[0]);
                return next;
            }
        }
        return null;
    }

    public abstract void o(String str);
}
