package com.oplus.aiunit.vision;

import android.content.Context;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public class h7i implements f2a, Cloneable {
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f12035j;
    public final HashMap<String, String> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f12036l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f12037n;
    public final int o;
    public final List<String> p;
    public final List<String> q;
    public final List<a> r;
    public final List<b> s;
    public final AtomicReference<b> t = new AtomicReference<>();
    public int u;
    public String v;
    public boolean w;
    public boolean x;
    public String y;
    public boolean z;

    public static class a {
        public String a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f12038c;
        public long d;

        public a(String str, String str2, String str3, long j2) {
            this.a = str;
            this.b = str2;
            this.f12038c = str3;
            this.d = j2;
        }

        public String b() {
            return this.f12038c;
        }

        public String c() {
            return this.b;
        }
    }

    public static class b {
        public final String a;
        public final List<a> b;

        public static class a {
            public final String a;
            public final String b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f12039c;

            public a(String str, String str2, long j2) {
                this.a = str;
                this.b = str2;
                this.f12039c = j2;
            }

            public String a() {
                return this.a;
            }
        }

        public b(String str, List<a> list) {
            this.a = str;
            this.b = list;
        }

        public String b() {
            return this.a;
        }

        public List<a> c() {
            return this.b;
        }
    }

    public h7i(String str, String str2, int i, String str3, boolean z, int i2, int i3, List<String> list, List<String> list2, List<a> list3, List<b> list4, HashMap<String, String> map, boolean z2, boolean z3, String str4, boolean z4) {
        this.i = str;
        this.f12035j = str2;
        this.u = i;
        this.v = str3;
        this.f12036l = z;
        this.o = i2;
        this.f12037n = i3 > 1;
        this.m = i3;
        this.p = list;
        this.q = list2;
        this.s = list4;
        this.r = list3;
        this.k = map;
        this.w = z2;
        this.x = z3;
        this.y = str4;
        this.z = z4;
    }

    @Override // com.oplus.aiunit.vision.f2a
    public String a() {
        return this.i + "@" + this.v + "@" + this.u;
    }

    public List<String> b() {
        return this.q;
    }

    public HashMap<String, String> c() {
        return this.k;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean d() {
        return this.z;
    }

    public String e() {
        List<a> list = this.r;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.r.get(0).b();
    }

    public long f() {
        List<a> list = this.r;
        if (list == null || list.isEmpty()) {
            return 0L;
        }
        return this.r.get(0).d;
    }

    public String i() {
        List<a> list = this.r;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.r.get(0).c();
    }

    public int j() {
        return this.o;
    }

    public String k() {
        return this.y;
    }

    public b m(Context context) throws IOException {
        if (this.t.get() != null) {
            return this.t.get();
        }
        if (this.s == null) {
            return null;
        }
        String strF = e2.f(context);
        ArrayList arrayList = new ArrayList();
        Iterator<b> it = this.s.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a);
        }
        String strE = e2.e(strF, arrayList);
        if (strE == null) {
            throw new IOException("No supported abi for split " + this.i + ",baseAbi:" + strF);
        }
        for (b bVar : this.s) {
            if (bVar.a.equals(strE)) {
                fue.a(this.t, null, bVar);
                break;
            }
        }
        return this.t.get();
    }

    public String q() {
        return this.i;
    }

    public int r() {
        return this.u;
    }

    public String s() {
        return this.v;
    }

    public String t() {
        return this.v + "@" + this.u;
    }

    public String toString() {
        return "SplitInfo{splitName='" + this.i + "', splitVersionCode='" + this.u + "', splitVersionName='" + this.v + "', extra=" + this.k + ", workProcesses=" + this.p + '}';
    }

    public List<String> u() {
        return this.p;
    }

    public boolean v() {
        return this.m > 0;
    }

    public boolean w() {
        return this.f12036l;
    }

    public boolean x() {
        return this.x;
    }

    public boolean y() {
        return this.w;
    }
}
