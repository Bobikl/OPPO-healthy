package com.oplus.aiunit.vision;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes13.dex */
public class d91 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qki f10436c;
    public final Map<String, kki> a = new HashMap();
    public final Set<kki> b = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet<tki> d = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10437e = true;

    public d91(qki qkiVar) {
        if (qkiVar == null) {
            throw new IllegalArgumentException("springLooper is required");
        }
        this.f10436c = qkiVar;
        qkiVar.a(this);
    }

    public void a(String str) {
        kki kkiVar = this.a.get(str);
        if (kkiVar == null) {
            throw new IllegalArgumentException("springId " + str + " does not reference a registered spring");
        }
        this.b.add(kkiVar);
        if (d()) {
            this.f10437e = false;
            this.f10436c.b();
        }
    }

    public void b(double d) {
        for (kki kkiVar : this.b) {
            if (kkiVar.r()) {
                kkiVar.b(d / 1000.0d);
            } else {
                this.b.remove(kkiVar);
            }
        }
    }

    public kki c() {
        kki kkiVar = new kki(this);
        f(kkiVar);
        return kkiVar;
    }

    public boolean d() {
        return this.f10437e;
    }

    public void e(double d) {
        Iterator<tki> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
        b(d);
        if (this.b.isEmpty()) {
            this.f10437e = true;
        }
        Iterator<tki> it2 = this.d.iterator();
        while (it2.hasNext()) {
            it2.next().a(this);
        }
        if (this.f10437e) {
            this.f10436c.c();
        }
    }

    public void f(kki kkiVar) {
        if (kkiVar == null) {
            throw new IllegalArgumentException("spring is required");
        }
        if (this.a.containsKey(kkiVar.f())) {
            throw new IllegalArgumentException("spring is already registered");
        }
        this.a.put(kkiVar.f(), kkiVar);
    }
}
