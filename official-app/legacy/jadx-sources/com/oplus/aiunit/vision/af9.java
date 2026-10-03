package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes11.dex */
public class af9 extends t22 {
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<Integer> f9335n;

    public af9(t22 t22Var, float f, int i) {
        this.m = 0.0f;
        if (f == Float.POSITIVE_INFINITY) {
            b(t22Var);
            return;
        }
        float fK = f - t22Var.k();
        if (fK <= 0.0f) {
            b(t22Var);
            return;
        }
        if (i == 2 || i == 5) {
            s1j s1jVar = new s1j(fK / 2.0f, 0.0f, 0.0f, 0.0f);
            b(s1jVar);
            b(t22Var);
            b(s1jVar);
            return;
        }
        if (i == 0) {
            b(t22Var);
            b(new s1j(fK, 0.0f, 0.0f, 0.0f));
        } else if (i != 1) {
            b(t22Var);
        } else {
            b(new s1j(fK, 0.0f, 0.0f, 0.0f));
            b(t22Var);
        }
    }

    @Override // com.oplus.aiunit.vision.t22
    public final void a(int i, t22 t22Var) {
        t(t22Var);
        super.a(i, t22Var);
    }

    @Override // com.oplus.aiunit.vision.t22
    public final void b(t22 t22Var) {
        t(t22Var);
        super.b(t22Var);
    }

    @Override // com.oplus.aiunit.vision.t22
    public void c(tb8 tb8Var, float f, float f2) {
        q(tb8Var, f, f2);
        for (t22 t22Var : this.i) {
            t22Var.c(tb8Var, f, t22Var.g + f2);
            f += t22Var.k();
        }
        f(tb8Var);
    }

    @Override // com.oplus.aiunit.vision.t22
    public int i() {
        LinkedList<t22> linkedList = this.i;
        ListIterator<t22> listIterator = linkedList.listIterator(linkedList.size());
        int i = -1;
        while (i == -1 && listIterator.hasPrevious()) {
            i = listIterator.previous().i();
        }
        return i;
    }

    public void r(int i) {
        if (this.f9335n == null) {
            this.f9335n = new ArrayList();
        }
        this.f9335n.add(Integer.valueOf(i));
    }

    public af9 s() {
        af9 af9Var = new af9(this.a, this.b);
        af9Var.g = this.g;
        return af9Var;
    }

    public final void t(t22 t22Var) {
        this.d += t22Var.k();
        this.f16854e = Math.max(this.i.size() == 0 ? Float.NEGATIVE_INFINITY : this.f16854e, t22Var.f16854e - t22Var.g);
        this.f = Math.max(this.i.size() != 0 ? this.f : Float.NEGATIVE_INFINITY, t22Var.f + t22Var.g);
    }

    public af9[] u(int i) {
        return v(i, 1);
    }

    public final af9[] v(int i, int i2) {
        af9 af9VarS = s();
        af9 af9VarS2 = s();
        for (int i3 = 0; i3 <= i; i3++) {
            af9VarS.b(this.i.get(i3));
        }
        for (int i4 = i2 + i; i4 < this.i.size(); i4++) {
            af9VarS2.b(this.i.get(i4));
        }
        if (this.f9335n != null) {
            for (int i5 = 0; i5 < this.f9335n.size(); i5++) {
                if (this.f9335n.get(i5).intValue() > i + 1) {
                    af9VarS2.r((this.f9335n.get(i5).intValue() - i) - 1);
                }
            }
        }
        return new af9[]{af9VarS, af9VarS2};
    }

    public af9[] w(int i) {
        return v(i, 2);
    }

    public af9(t22 t22Var) {
        this.m = 0.0f;
        b(t22Var);
    }

    public af9() {
        this.m = 0.0f;
    }

    public af9(lk3 lk3Var, lk3 lk3Var2) {
        super(lk3Var, lk3Var2);
        this.m = 0.0f;
    }
}
