package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public class p2j {
    public String a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f15166c;
    public double d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f15167e;
    public ArrayList<a> f = new ArrayList<>();
    public ArrayList<da7> g = new ArrayList<>();

    public class a {
        public int a;
        public long b;

        public a(int i, long j2) {
            this.a = i;
            this.b = j2;
        }

        public boolean a(bxb bxbVar) {
            Long lN;
            w97 w97VarI = bxbVar.i(this.a);
            return (w97VarI == null || (lN = w97VarI.n(0, 65535)) == null || lN.longValue() != this.b) ? false : true;
        }
    }

    public p2j(String str, int i, double d, double d2, String str2) {
        this.a = str;
        this.b = i;
        this.f15166c = d;
        this.d = d2;
        this.f15167e = str2;
    }

    public void a(da7 da7Var) {
        this.g.add(da7Var);
    }

    public void b(int i, long j2) {
        this.f.add(new a(i, j2));
    }

    public boolean c(bxb bxbVar) {
        Iterator<a> it = this.f.iterator();
        while (it.hasNext()) {
            if (it.next().a(bxbVar)) {
                return true;
            }
        }
        return false;
    }

    public int d() {
        return this.b;
    }
}
