package com.oplus.aiunit.vision;

import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes11.dex */
public class otk extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LinkedList<gj0> f15051l = new LinkedList<>();
    public d4i m = new d4i(1, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f15052n = false;
    public boolean o = false;
    public int p = 5;

    public otk() {
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        float fG;
        tvk tvkVar = new tvk();
        if (this.p != 5) {
            LinkedList linkedList = new LinkedList();
            ListIterator<gj0> listIterator = this.f15051l.listIterator();
            float fK = Float.NEGATIVE_INFINITY;
            while (listIterator.hasNext()) {
                t22 t22VarC = listIterator.next().c(rpjVar);
                linkedList.add(t22VarC);
                if (fK < t22VarC.k()) {
                    fK = t22VarC.k();
                }
            }
            s1j s1jVar = new s1j(0.0f, rpjVar.g(), 0.0f, 0.0f);
            ListIterator listIterator2 = linkedList.listIterator();
            while (listIterator2.hasNext()) {
                tvkVar.b(new af9((t22) listIterator2.next(), fK, this.p));
                if (this.f15052n && listIterator2.hasNext()) {
                    tvkVar.b(s1jVar);
                }
            }
        } else {
            s1j s1jVar2 = new s1j(0.0f, rpjVar.g(), 0.0f, 0.0f);
            ListIterator<gj0> listIterator3 = this.f15051l.listIterator();
            while (listIterator3.hasNext()) {
                tvkVar.b(listIterator3.next().c(rpjVar));
                if (this.f15052n && listIterator3.hasNext()) {
                    tvkVar.b(s1jVar2);
                }
            }
        }
        tvkVar.o(-this.m.c(rpjVar).k());
        if (this.o) {
            fG = tvkVar.s() != 0 ? tvkVar.i.getFirst().h() : 0.0f;
            tvkVar.n(fG);
            tvkVar.m((tvkVar.g() + tvkVar.h()) - fG);
        } else {
            fG = tvkVar.s() != 0 ? tvkVar.i.getLast().g() : 0.0f;
            tvkVar.n((tvkVar.g() + tvkVar.h()) - fG);
            tvkVar.m(fG);
        }
        return tvkVar;
    }

    public final void f(gj0 gj0Var) {
        if (gj0Var != null) {
            this.f15051l.add(0, gj0Var);
        }
    }

    public final void i(gj0 gj0Var) {
        if (gj0Var != null) {
            this.f15051l.add(gj0Var);
        }
    }

    public void j(boolean z) {
        this.f15052n = z;
    }

    public void k(int i) {
        this.p = i;
    }

    public void m(int i, float f) {
        this.m = new d4i(i, f, 0.0f, 0.0f);
    }

    public void q(boolean z) {
        this.o = z;
    }

    public otk(gj0 gj0Var) {
        if (gj0Var != null) {
            if (gj0Var instanceof otk) {
                this.f15051l.addAll(((otk) gj0Var).f15051l);
            } else {
                this.f15051l.add(gj0Var);
            }
        }
    }
}
