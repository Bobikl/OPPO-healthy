package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class p7a {
    public final String a;
    public final List<sga> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<co3> f15229c;
    public final Map<String, co3> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<co3> f15230e;
    public final List<co3> f;
    public final List<hxe> g;
    public final List<hxe> h;
    public final Set<String> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f15231j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15232l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15233n;
    public final Map<String, Map<String, Integer>> o;
    public long p;
    public agf q;

    public p7a(String str, List<sga> list) {
        this.d = new HashMap();
        this.f15230e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new HashSet();
        this.f15231j = false;
        this.k = false;
        this.f15232l = 0;
        this.m = 0;
        this.f15233n = 0;
        this.o = new HashMap();
        this.p = 0L;
        this.a = str;
        this.b = new ArrayList(list);
        this.f15229c = new ArrayList();
        if (list.isEmpty()) {
            return;
        }
        this.p = list.get(0).p();
    }

    public static p7a d(String str, List<co3> list) {
        return new p7a(str, list, true);
    }

    public void a(sga sgaVar, int i) {
        g(i);
        this.g.add(new hxe(this.a, sgaVar.C()));
    }

    public void b(sga sgaVar, int i, String str) {
        this.h.add(new hxe(this.a, sgaVar.C(), i, str));
    }

    public void c(sga sgaVar) {
        this.g.add(new hxe(this.a, sgaVar.C()));
    }

    public boolean e() {
        return !this.f15229c.isEmpty();
    }

    public void f(String str, String str2, int i) {
        if (str == null || str2 == null) {
            return;
        }
        Map<String, Integer> map = this.o.get(str);
        if (map == null) {
            map = new HashMap<>();
            this.o.put(str, map);
        }
        Integer num = map.get(str2);
        if (num == null) {
            map.put(str2, Integer.valueOf(i));
        } else {
            map.put(str2, Integer.valueOf(num.intValue() + i));
        }
    }

    public final void g(int i) {
        if (i == -1002) {
            this.m++;
        } else {
            if (i != -1001) {
                return;
            }
            this.f15232l++;
        }
    }

    public p7a(String str, List<co3> list, boolean z) {
        this.d = new HashMap();
        this.f15230e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new HashSet();
        this.f15231j = false;
        this.k = false;
        this.f15232l = 0;
        this.m = 0;
        this.f15233n = 0;
        this.o = new HashMap();
        this.p = 0L;
        this.a = str;
        this.b = new ArrayList();
        this.f15229c = new ArrayList(list);
        for (co3 co3Var : list) {
            String strValueOf = co3Var.h;
            if (strValueOf == null) {
                strValueOf = String.valueOf(System.nanoTime());
            }
            this.d.put(strValueOf, co3Var);
        }
    }
}
