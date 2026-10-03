package com.oplus.aiunit.vision;

import com.garmin.fit.FitRuntimeException;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public class bxb {
    public String a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9882c;
    public ArrayList<w97> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<t95> f9883e;
    public long f;
    public int g;

    public bxb(bxb bxbVar) {
        this.d = new ArrayList<>();
        this.f9883e = new ArrayList<>();
        if (bxbVar == null) {
            this.a = "unknown";
            this.b = ixb.INVALID;
            this.f = 0L;
            return;
        }
        this.a = bxbVar.a;
        this.b = bxbVar.b;
        this.f9882c = bxbVar.f9882c;
        this.f = bxbVar.f;
        this.g = bxbVar.g;
        for (w97 w97Var : bxbVar.d) {
            if (w97Var.r() > 0) {
                this.d.add(new w97(w97Var));
            }
        }
        for (t95 t95Var : bxbVar.f9883e) {
            if (t95Var.r() > 0) {
                this.f9883e.add(new t95(t95Var));
            }
        }
    }

    public void d(t95 t95Var) {
        for (int i = 0; i < this.f9883e.size(); i++) {
            t95 t95Var2 = this.f9883e.get(i);
            if (t95Var2.T() == t95Var.T() && t95Var2.R() == t95Var.R()) {
                this.f9883e.set(i, t95Var);
                return;
            }
        }
        this.f9883e.add(t95Var);
    }

    public void e(w97 w97Var) {
        this.d.add(w97Var);
    }

    public int f(int i) {
        w97 w97VarA = w07.a(this.b, i);
        if (w97VarA == null) {
            return 65535;
        }
        for (int i2 = 0; i2 < w97VarA.k.size(); i2++) {
            if (w97VarA.k.get(i2).c(this)) {
                return i2;
            }
        }
        return 65535;
    }

    public final t95 g(short s, int i) {
        for (t95 t95Var : this.f9883e) {
            if (t95Var.R() == s && t95Var.T() == i) {
                return t95Var;
            }
        }
        return null;
    }

    public Iterable<t95> h() {
        return this.f9883e;
    }

    public w97 i(int i) {
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            if (this.d.get(i2).d == i) {
                return this.d.get(i2);
            }
        }
        return null;
    }

    public Byte j(int i, int i2, int i3) {
        w97 w97VarI = i(i);
        if (w97VarI == null) {
            return null;
        }
        if (i3 == 65534) {
            return w97VarI.f(i2, f(i));
        }
        p2j p2jVarB = w97VarI.B(i3);
        if (p2jVarB == null || p2jVarB.c(this)) {
            return w97VarI.f(i2, i3);
        }
        return null;
    }

    public Float k(int i, int i2, int i3) {
        w97 w97VarI = i(i);
        if (w97VarI == null) {
            return null;
        }
        if (i3 == 65534) {
            return w97VarI.i(i2, f(i));
        }
        p2j p2jVarB = w97VarI.B(i3);
        if (p2jVarB == null || p2jVarB.c(this)) {
            return w97VarI.i(i2, i3);
        }
        return null;
    }

    public Integer l(int i, int i2, int i3) {
        w97 w97VarI = i(i);
        if (w97VarI == null) {
            return null;
        }
        if (i3 == 65534) {
            return w97VarI.k(i2, f(i));
        }
        p2j p2jVarB = w97VarI.B(i3);
        if (p2jVarB == null || p2jVarB.c(this)) {
            return w97VarI.k(i2, i3);
        }
        return null;
    }

    public Long m(int i, int i2, int i3) {
        w97 w97VarI = i(i);
        if (w97VarI == null) {
            return null;
        }
        if (i3 == 65534) {
            return w97VarI.n(i2, f(i));
        }
        p2j p2jVarB = w97VarI.B(i3);
        if (p2jVarB == null || p2jVarB.c(this)) {
            return w97VarI.n(i2, i3);
        }
        return null;
    }

    public Short n(int i, int i2, int i3) {
        w97 w97VarI = i(i);
        if (w97VarI == null) {
            return null;
        }
        if (i3 == 65534) {
            return w97VarI.w(i2, f(i));
        }
        p2j p2jVarB = w97VarI.B(i3);
        if (p2jVarB == null || p2jVarB.c(this)) {
            return w97VarI.w(i2, i3);
        }
        return null;
    }

    public String o(int i, int i2, int i3) {
        w97 w97VarI = i(i);
        if (w97VarI == null) {
            return null;
        }
        if (i3 == 65534) {
            return w97VarI.z(i2, f(i));
        }
        p2j p2jVarB = w97VarI.B(i3);
        if (p2jVarB == null || p2jVarB.c(this)) {
            return w97VarI.z(i2, i3);
        }
        return null;
    }

    public Collection<w97> p() {
        return Collections.unmodifiableCollection(this.d);
    }

    public int q() {
        return this.b;
    }

    public int r(int i, int i2) {
        w97 w97VarI = i(i);
        if (w97VarI == null) {
            return 0;
        }
        if (i2 == 65534) {
            return w97VarI.r();
        }
        p2j p2jVarB = w97VarI.B(i2);
        if (p2jVarB == null || p2jVarB.c(this)) {
            return w97VarI.r();
        }
        return 0;
    }

    public boolean s(int i) {
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            if (this.d.get(i2).d == i) {
                return true;
            }
        }
        return false;
    }

    public void t(int i) {
        this.g = i;
    }

    public void u(w97 w97Var) {
        for (int i = 0; i < this.d.size(); i++) {
            if (this.d.get(i).d == w97Var.d) {
                this.d.set(i, w97Var);
                return;
            }
        }
        this.d.add(w97Var);
    }

    public void v(int i, int i2, Object obj, int i3) {
        if (i3 == 65534) {
            i3 = f(i);
        }
        w97 w97VarI = i(i);
        if (w97VarI == null) {
            w97VarI = w07.a(this.b, i);
            e(w97VarI);
        }
        w97VarI.L(i2, obj, i3);
    }

    public void w(bxb bxbVar) {
        if (bxbVar.b != this.b) {
            return;
        }
        Iterator<w97> it = bxbVar.d.iterator();
        while (it.hasNext()) {
            u(it.next());
        }
    }

    public s05 x(Long l2) {
        if (l2 == null) {
            return null;
        }
        s05 s05Var = new s05(l2.longValue());
        s05Var.g(this.f);
        return s05Var;
    }

    public void y(OutputStream outputStream, fxb fxbVar) {
        try {
            new DataOutputStream(outputStream).writeByte(this.f9882c & 15);
            if (fxbVar == null) {
                fxbVar = new fxb(this);
            }
            for (ea7 ea7Var : fxbVar.d) {
                w97 w97VarI = i(ea7Var.a);
                if (w97VarI == null) {
                    w97VarI = w07.a(this.b, ea7Var.a);
                }
                w97VarI.P(outputStream, ea7Var);
            }
            for (u95 u95Var : fxbVar.f11557e) {
                t95 t95VarG = g(u95Var.c(), u95Var.e());
                if (t95VarG == null) {
                    t95VarG = u95Var.b();
                }
                t95VarG.P(outputStream, u95Var);
            }
        } catch (IOException e2) {
            throw new FitRuntimeException(e2);
        }
    }

    public bxb(String str, int i) {
        this.a = str;
        this.b = i;
        this.f9882c = 0;
        this.d = new ArrayList<>();
        this.f9883e = new ArrayList<>();
        this.f = 0L;
    }
}
