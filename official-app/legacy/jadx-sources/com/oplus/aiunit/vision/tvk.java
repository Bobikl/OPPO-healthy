package com.oplus.aiunit.vision;

import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes11.dex */
public class tvk extends t22 {
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f17178n;

    public tvk() {
        this.m = Float.MAX_VALUE;
        this.f17178n = -3.4028235E38f;
    }

    @Override // com.oplus.aiunit.vision.t22
    public void a(int i, t22 t22Var) {
        super.a(i, t22Var);
        if (i == 0) {
            this.f += t22Var.f + this.f16854e;
            this.f16854e = t22Var.f16854e;
        } else {
            this.f += t22Var.f16854e + t22Var.f;
        }
        t(t22Var);
    }

    @Override // com.oplus.aiunit.vision.t22
    public final void b(t22 t22Var) {
        super.b(t22Var);
        if (this.i.size() == 1) {
            this.f16854e = t22Var.f16854e;
            this.f = t22Var.f;
        } else {
            this.f += t22Var.f16854e + t22Var.f;
        }
        t(t22Var);
    }

    @Override // com.oplus.aiunit.vision.t22
    public void c(tb8 tb8Var, float f, float f2) {
        float fG = f2 - this.f16854e;
        for (t22 t22Var : this.i) {
            float fH = fG + t22Var.h();
            t22Var.c(tb8Var, (t22Var.j() + f) - this.m, fH);
            fG = fH + t22Var.g();
        }
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

    public final void r(t22 t22Var, float f) {
        if (this.i.size() >= 1) {
            b(new s1j(0.0f, f, 0.0f, 0.0f));
        }
        b(t22Var);
    }

    public int s() {
        return this.i.size();
    }

    public final void t(t22 t22Var) {
        this.m = Math.min(this.m, t22Var.g);
        float f = this.f17178n;
        float f2 = t22Var.g;
        float f3 = t22Var.d;
        if (f3 <= 0.0f) {
            f3 = 0.0f;
        }
        float fMax = Math.max(f, f2 + f3);
        this.f17178n = fMax;
        this.d = fMax - this.m;
    }

    public tvk(t22 t22Var, float f, int i) {
        this();
        b(t22Var);
        if (i == 2) {
            float f2 = f / 2.0f;
            s1j s1jVar = new s1j(0.0f, f2, 0.0f, 0.0f);
            super.a(0, s1jVar);
            this.f16854e += f2;
            this.f += f2;
            super.b(s1jVar);
            return;
        }
        if (i == 3) {
            this.f += f;
            super.b(new s1j(0.0f, f, 0.0f, 0.0f));
        } else if (i == 4) {
            this.f16854e += f;
            super.a(0, new s1j(0.0f, f, 0.0f, 0.0f));
        }
    }
}
