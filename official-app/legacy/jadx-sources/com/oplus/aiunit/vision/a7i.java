package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class a7i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference<a7i> f9230c = new AtomicReference<>();
    public final Set<e7i> a = Collections.newSetFromMap(new ConcurrentHashMap());
    public final List<WeakReference<e7i>> b = new ArrayList();

    public static a7i f() {
        AtomicReference<a7i> atomicReference = f9230c;
        if (atomicReference.get() == null) {
            atomicReference.set(new a7i());
        }
        return atomicReference.get();
    }

    public e7i a(String str) {
        for (e7i e7iVar : this.a) {
            if (e7iVar.g().equals(str) && e7iVar.e()) {
                return e7iVar;
            }
        }
        return null;
    }

    public Set<e7i> b() {
        HashSet hashSet = new HashSet(this.a.size());
        for (e7i e7iVar : this.a) {
            if (e7iVar.e()) {
                hashSet.add(e7iVar);
            }
        }
        w7i.a("SplitApplicationLoaders", "getValidClassLoaders:" + this.a, new Object[0]);
        return hashSet;
    }

    public Set<e7i> c(List<String> list) {
        if (list == null) {
            return null;
        }
        HashSet hashSet = new HashSet(list.size());
        for (e7i e7iVar : this.a) {
            if (list.contains(e7iVar.g()) && e7iVar.e()) {
                hashSet.add(e7iVar);
            }
        }
        w7i.a("SplitApplicationLoaders", "getValidClassLoaders:" + this.a, new Object[0]);
        return hashSet;
    }

    public void d(String str, e7i e7iVar) {
        w7i.a("SplitApplicationLoaders", "new ClassLoader: %s[0x%d]", str, Integer.valueOf(e7iVar.hashCode()));
        this.a.add(e7iVar);
    }

    public e7i e(String str) {
        for (e7i e7iVar : this.a) {
            if (e7iVar.g().equals(str)) {
                return e7iVar;
            }
        }
        Iterator<WeakReference<e7i>> it = this.b.iterator();
        while (it.hasNext()) {
            WeakReference<e7i> next = it.next();
            if (next == null) {
                it.remove();
            } else {
                e7i e7iVar2 = next.get();
                if (e7iVar2 == null) {
                    it.remove();
                } else if (TextUtils.equals(e7iVar2.g(), str)) {
                    it.remove();
                    this.a.add(e7iVar2);
                    w7i.a("SplitApplicationLoaders", "use recycle cl:%s[%d] ", str, Integer.valueOf(e7iVar2.hashCode()));
                    return e7iVar2;
                }
            }
        }
        return null;
    }

    public void g(String str) {
        e7i next;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Iterator<e7i> it = this.a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!str.equals(next.g()));
        if (next == null) {
            return;
        }
        this.a.remove(next);
        this.b.add(new WeakReference<>(next));
        w7i.a("SplitApplicationLoaders", "removeClassLoader: %s[0x%d]", str, Integer.valueOf(next.hashCode()));
    }
}
