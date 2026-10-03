package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes15.dex */
public class iz4 {
    public final List<n97> a;
    public final ConcurrentHashMap<n97, o97> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt4.b f12695c;

    public iz4(@NonNull List<n97> list, @Nullable dt4.b bVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = new ConcurrentHashMap<>();
        this.f12695c = bVar;
        arrayList.addAll(list);
    }

    public void a() {
        if (this.f12695c == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.a.size());
        for (n97 n97Var : this.a) {
            o97 o97Var = this.b.get(n97Var);
            if (o97Var == null) {
                o97Var = new o97(n97Var, 3);
            }
            arrayList.add(o97Var);
        }
        this.f12695c.a(new egj(arrayList));
    }

    public synchronized boolean b() {
        return this.b.size() == this.a.size();
    }

    public synchronized void c(o97 o97Var) {
        if (this.a.contains(o97Var.a) && this.b.get(o97Var.a) == null) {
            this.b.put(o97Var.a, o97Var);
        }
        if (b() && this.f12695c != null) {
            this.f12695c.a(new egj(new ArrayList(this.b.values())));
        }
    }
}
