package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes15.dex */
public class t97 {
    public final a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16931c;
    public final String a = "Data-Sync";
    public final Set<n97> d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedList<n97> f16932e = new LinkedList<>();
    public final LinkedList<n97> f = new LinkedList<>();
    public final Object g = new Object();

    public interface a {
        void a(o97 o97Var);
    }

    public t97(a aVar, int i) {
        this.b = aVar;
        this.f16931c = i;
    }

    public void c() {
        synchronized (this.g) {
            this.d.clear();
            this.f16932e.clear();
            this.f.clear();
        }
    }

    public void d(n97 n97Var) {
        synchronized (this.g) {
            if (m(n97Var)) {
                this.f16932e.add(n97Var);
            }
            f();
        }
    }

    public void e(List<n97> list) {
        Iterator<n97> it = list.iterator();
        while (it.hasNext()) {
            d(it.next());
        }
    }

    public final void f() {
        synchronized (this.g) {
            if (this.f16932e.isEmpty()) {
                return;
            }
            if (this.d.size() >= this.f16931c) {
                return;
            }
            final n97 n97VarRemoveFirst = this.f16932e.removeFirst();
            if (j(n97VarRemoveFirst)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Fetch request is in fetching, request=");
                sb.append(n97VarRemoveFirst);
                this.f16932e.add(n97VarRemoveFirst);
                return;
            }
            com.heytap.device.data.sporthealth.pull.fetcher.h hVarA = u97.a(n97VarRemoveFirst);
            ty4.b(n97VarRemoveFirst.a, n97VarRemoveFirst.b);
            if (hVarA != null) {
                this.d.add(n97VarRemoveFirst);
                this.f.add(n97VarRemoveFirst);
                hVarA.k(n97VarRemoveFirst.a);
                if (hVarA.q()) {
                    hVarA.h(new com.heytap.device.data.sporthealth.pull.fetcher.h.a() { // from class: com.oplus.aiunit.vision.r97
                        @Override // com.heytap.device.data.sporthealth.pull.fetcher.h.a
                        public final void a(com.heytap.device.data.sporthealth.pull.fetcher.h hVar, int i) {
                            this.a.k(n97VarRemoveFirst, hVar, i);
                        }
                    });
                }
                hVarA.i(new com.heytap.device.data.sporthealth.pull.fetcher.h.b() { // from class: com.oplus.aiunit.vision.s97
                    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h.b
                    public final void a(com.heytap.device.data.sporthealth.pull.fetcher.h hVar, int i) {
                        this.a.l(n97VarRemoveFirst, hVar, i);
                    }
                });
                hVarA.y();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(hVarA.m());
                sb2.append(" Start data fetch, request=");
                sb2.append(n97VarRemoveFirst);
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Create fetcher error, error request=");
                sb3.append(n97VarRemoveFirst);
                a aVar = this.b;
                if (aVar != null) {
                    aVar.a(new o97(n97VarRemoveFirst, 3));
                }
            }
        }
    }

    public List<Integer> g() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.g) {
            Iterator<n97> it = this.d.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(it.next().a));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void k(n97 n97Var, com.heytap.device.data.sporthealth.pull.fetcher.h hVar, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(hVar.m());
        sb.append(" BT fetch complete, request=");
        sb.append(n97Var);
        sb.append(", resultCode=");
        sb.append(i);
        synchronized (this.g) {
            this.d.remove(n97Var);
            f();
        }
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void l(n97 n97Var, com.heytap.device.data.sporthealth.pull.fetcher.h hVar, int i) {
        o97 o97Var;
        StringBuilder sb = new StringBuilder();
        sb.append(hVar.m());
        sb.append(" Data fetch complete, request=");
        sb.append(n97Var);
        sb.append(", resultCode=");
        sb.append(i);
        synchronized (this.g) {
            this.f.remove(n97Var);
            if (!hVar.q()) {
                this.d.remove(n97Var);
            }
            if (this.b != null) {
                int i2 = 1;
                if (i == 1) {
                    if (!hVar.p()) {
                        i2 = 2;
                    }
                    o97Var = new o97(n97Var, i2);
                    ty4.c(n97Var.a, n97Var.b, hVar.p());
                } else {
                    o97 o97Var2 = new o97(n97Var, 3);
                    ty4.a(n97Var.a, i, n97Var.b);
                    o97Var = o97Var2;
                }
                o97Var.e(hVar.o());
                o97Var.d(hVar.n());
                this.b.a(o97Var);
            }
            if (!hVar.q()) {
                f();
            }
        }
    }

    public final boolean j(n97 n97Var) {
        Iterator<n97> it = this.d.iterator();
        while (it.hasNext()) {
            if (it.next().a == n97Var.a) {
                return true;
            }
        }
        return false;
    }

    public final boolean m(n97 n97Var) {
        if (this.d.contains(n97Var)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fetch request is in fetching, request=");
            sb.append(n97Var);
            return false;
        }
        if (this.f16932e.contains(n97Var)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Fetch request is in waiting queue, request=");
            sb2.append(n97Var);
            return false;
        }
        if (!this.f.contains(n97Var)) {
            return true;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Fetch request is in need fetch queue, request=");
        sb3.append(n97Var);
        return false;
    }
}
