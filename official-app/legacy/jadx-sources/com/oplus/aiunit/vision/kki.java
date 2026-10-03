package com.oplus.aiunit.vision;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes13.dex */
public class kki {
    public static int o;
    public mki a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13328c;
    public final b d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f13329e;
    public final b f;
    public double g;
    public double h;
    public boolean i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public double f13330j = 0.005d;
    public double k = 0.005d;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CopyOnWriteArraySet<pki> f13331l = new CopyOnWriteArraySet<>();
    public double m = 0.0d;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d91 f13332n;

    public static class b {
        public double a;
        public double b;

        public b() {
        }
    }

    public kki(d91 d91Var) {
        this.d = new b();
        this.f13329e = new b();
        this.f = new b();
        if (d91Var == null) {
            throw new IllegalArgumentException("Spring cannot be created outside of a BaseSpringSystem");
        }
        this.f13332n = d91Var;
        StringBuilder sb = new StringBuilder();
        sb.append("spring:");
        int i = o;
        o = i + 1;
        sb.append(i);
        this.f13328c = sb.toString();
        p(mki.defaultConfig);
    }

    public kki a(pki pkiVar) {
        if (pkiVar == null) {
            throw new IllegalArgumentException("newListener is required");
        }
        this.f13331l.add(pkiVar);
        return this;
    }

    public void b(double d) {
        double d2;
        boolean z;
        boolean z2;
        boolean zI = i();
        if (zI && this.i) {
            return;
        }
        this.m += d <= 0.064d ? d : 0.064d;
        mki mkiVar = this.a;
        double d3 = mkiVar.b;
        double d4 = mkiVar.a;
        b bVar = this.d;
        double d5 = bVar.a;
        double d6 = bVar.b;
        b bVar2 = this.f;
        double d7 = bVar2.a;
        double d8 = bVar2.b;
        while (true) {
            d2 = this.m;
            if (d2 < 0.001d) {
                break;
            }
            double d9 = d2 - 0.001d;
            this.m = d9;
            if (d9 < 0.001d) {
                b bVar3 = this.f13329e;
                bVar3.a = d5;
                bVar3.b = d6;
            }
            double d10 = this.h;
            double d11 = ((d10 - d7) * d3) - (d4 * d6);
            double d12 = d6 + (d11 * 0.001d * 0.5d);
            double d13 = ((d10 - (((d6 * 0.001d) * 0.5d) + d5)) * d3) - (d4 * d12);
            double d14 = d6 + (d13 * 0.001d * 0.5d);
            double d15 = ((d10 - (d5 + ((d12 * 0.001d) * 0.5d))) * d3) - (d4 * d14);
            double d16 = d5 + (d14 * 0.001d);
            double d17 = d6 + (d15 * 0.001d);
            d5 += (d6 + ((d12 + d14) * 2.0d) + d17) * 0.16666666666666666d * 0.001d;
            d6 += (d11 + ((d13 + d15) * 2.0d) + (((d10 - d16) * d3) - (d4 * d17))) * 0.16666666666666666d * 0.001d;
            d7 = d16;
            d8 = d17;
        }
        b bVar4 = this.f;
        bVar4.a = d7;
        bVar4.b = d8;
        b bVar5 = this.d;
        bVar5.a = d5;
        bVar5.b = d6;
        if (d2 > 0.0d) {
            h(d2 / 0.001d);
        }
        boolean z3 = true;
        if (i() || (this.b && j())) {
            if (d3 > 0.0d) {
                double d18 = this.h;
                this.g = d18;
                this.d.a = d18;
            } else {
                double d19 = this.d.a;
                this.h = d19;
                this.g = d19;
            }
            q(0.0d);
            z = true;
        } else {
            z = zI;
        }
        if (this.i) {
            this.i = false;
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            this.i = true;
        } else {
            z3 = false;
        }
        for (pki pkiVar : this.f13331l) {
            if (z2) {
                pkiVar.onSpringActivate(this);
            }
            pkiVar.onSpringUpdate(this);
            if (z3) {
                pkiVar.onSpringAtRest(this);
            }
        }
    }

    public double c() {
        return this.d.a;
    }

    public final double d(b bVar) {
        return Math.abs(this.h - bVar.a);
    }

    public double e() {
        return this.h;
    }

    public String f() {
        return this.f13328c;
    }

    public double g() {
        return this.d.b;
    }

    public final void h(double d) {
        b bVar = this.d;
        double d2 = bVar.a * d;
        b bVar2 = this.f13329e;
        double d3 = 1.0d - d;
        bVar.a = d2 + (bVar2.a * d3);
        bVar.b = (bVar.b * d) + (bVar2.b * d3);
    }

    public boolean i() {
        return Math.abs(this.d.b) <= this.f13330j && (d(this.d) <= this.k || this.a.b == 0.0d);
    }

    public boolean j() {
        return this.a.b > 0.0d && ((this.g < this.h && c() > this.h) || (this.g > this.h && c() < this.h));
    }

    public kki k() {
        this.f13331l.clear();
        return this;
    }

    public kki l() {
        b bVar = this.d;
        double d = bVar.a;
        this.h = d;
        this.f.a = d;
        bVar.b = 0.0d;
        return this;
    }

    public kki m(double d) {
        return n(d, true);
    }

    public kki n(double d, boolean z) {
        this.g = d;
        this.d.a = d;
        this.f13332n.a(f());
        Iterator<pki> it = this.f13331l.iterator();
        while (it.hasNext()) {
            it.next().onSpringUpdate(this);
        }
        if (z) {
            l();
        }
        return this;
    }

    public kki o(double d) {
        if (this.h == d && i()) {
            return this;
        }
        this.g = c();
        this.h = d;
        this.f13332n.a(f());
        Iterator<pki> it = this.f13331l.iterator();
        while (it.hasNext()) {
            it.next().onSpringEndStateChange(this);
        }
        return this;
    }

    public kki p(mki mkiVar) {
        if (mkiVar == null) {
            throw new IllegalArgumentException("springConfig is required");
        }
        this.a = mkiVar;
        return this;
    }

    public kki q(double d) {
        b bVar = this.d;
        if (d == bVar.b) {
            return this;
        }
        bVar.b = d;
        this.f13332n.a(f());
        return this;
    }

    public boolean r() {
        return (i() && s()) ? false : true;
    }

    public boolean s() {
        return this.i;
    }
}
