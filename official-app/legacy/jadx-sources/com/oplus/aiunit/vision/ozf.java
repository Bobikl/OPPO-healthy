package com.oplus.aiunit.vision;

import java.util.BitSet;
import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes11.dex */
public class ozf extends gj0 implements nzf {
    public static BitSet o;
    public static BitSet p;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LinkedList<gj0> f15124l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public s66 f15125n;

    static {
        BitSet bitSet = new BitSet(16);
        o = bitSet;
        bitSet.set(2);
        o.set(1);
        o.set(3);
        o.set(4);
        o.set(6);
        BitSet bitSet2 = new BitSet(16);
        p = bitSet2;
        bitSet2.set(0);
        p.set(1);
        p.set(2);
        p.set(3);
        p.set(4);
        p.set(5);
        p.set(6);
    }

    public ozf() {
        this.f15124l = new LinkedList<>();
        this.m = false;
        this.f15125n = null;
    }

    @Override // com.oplus.aiunit.vision.nzf
    public void a(s66 s66Var) {
        this.f15125n = s66Var;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        float fP;
        s66 s66Var;
        spj spjVarN = rpjVar.n();
        af9 af9Var = new af9(rpjVar.f(), rpjVar.e());
        rpjVar.r();
        ListIterator<gj0> listIterator = this.f15124l.listIterator();
        int i = 0;
        while (true) {
            gj0 next = null;
            if (!listIterator.hasNext()) {
                this.f15125n = null;
                return af9Var;
            }
            gj0 next2 = listIterator.next();
            i++;
            boolean z = false;
            while (next2 instanceof q52) {
                if (!z) {
                    z = true;
                }
                if (!listIterator.hasNext()) {
                    break;
                }
                next2 = listIterator.next();
                i++;
            }
            if (next2 instanceof y66) {
                y66 y66Var = (y66) next2;
                if (y66Var.i()) {
                    next2 = y66Var.f();
                    if (next2 instanceof ozf) {
                        int i2 = i - 1;
                        this.f15124l.remove(i2);
                        this.f15124l.addAll(i2, ((ozf) next2).f15124l);
                        listIterator = this.f15124l.listIterator(i2);
                        next2 = listIterator.next();
                    }
                }
            }
            s66 s66Var2 = new s66(next2);
            if (listIterator.hasNext()) {
                next = listIterator.next();
                listIterator.previous();
            }
            i(s66Var2, this.f15125n, next);
            while (true) {
                if (listIterator.hasNext() && s66Var2.e() == 0 && s66Var2.g()) {
                    gj0 next3 = listIterator.next();
                    i++;
                    if ((next3 instanceof y73) && p.get(next3.d())) {
                        s66Var2.i();
                        x73 x73VarC = s66Var2.c(spjVarN);
                        x73 x73VarF = ((y73) next3).f(spjVarN);
                        x73 x73VarC2 = spjVarN.C(x73VarC, x73VarF);
                        if (x73VarC2 == null) {
                            fP = spjVarN.p(x73VarC, x73VarF, rpjVar.m());
                            listIterator.previous();
                            i--;
                            break;
                        }
                        s66Var2.a(new uq7(x73VarC2));
                    } else {
                        listIterator.previous();
                        i--;
                    }
                }
                fP = 0.0f;
                break;
            }
            if (listIterator.previousIndex() != 0 && (s66Var = this.f15125n) != null && !s66Var.h() && !s66Var2.h()) {
                af9Var.b(u78.b(this.f15125n.e(), s66Var2.d(), rpjVar));
            }
            s66Var2.j(this.f15125n);
            t22 t22VarB = s66Var2.b(rpjVar);
            if (s66Var2.f() && (t22VarB instanceof w73)) {
                ((w73) t22VarB).r();
            }
            if (z || ((next2 instanceof v73) && Character.isDigit(((v73) next2).q()))) {
                af9Var.r(af9Var.i.size());
            }
            af9Var.b(t22VarB);
            rpjVar.w(t22VarB.i());
            if (Math.abs(fP) > 1.0E-7f) {
                af9Var.b(new s1j(fP, 0.0f, 0.0f, 0.0f));
            }
            if (!s66Var2.h()) {
                this.f15125n = s66Var2;
            }
        }
    }

    @Override // com.oplus.aiunit.vision.gj0
    public int d() {
        if (this.f15124l.size() == 0) {
            return 0;
        }
        return this.f15124l.get(0).d();
    }

    @Override // com.oplus.aiunit.vision.gj0
    public int e() {
        if (this.f15124l.size() == 0) {
            return 0;
        }
        LinkedList<gj0> linkedList = this.f15124l;
        return linkedList.get(linkedList.size() - 1).e();
    }

    public final void f(gj0 gj0Var) {
        if (gj0Var != null) {
            this.f15124l.add(gj0Var);
        }
    }

    public final void i(s66 s66Var, s66 s66Var2, gj0 gj0Var) {
        if (s66Var.d() == 2 && (s66Var2 == null || o.get(s66Var2.e()) || gj0Var == null)) {
            s66Var.k(0);
            return;
        }
        if (gj0Var == null || s66Var.e() != 2) {
            return;
        }
        int iD = gj0Var.d();
        if (iD == 3 || iD == 5 || iD == 6) {
            s66Var.k(0);
        }
    }

    public gj0 j() {
        return this.f15124l.size() != 0 ? this.f15124l.removeLast() : new d4i(3, 0.0f, 0.0f, 0.0f);
    }

    public ozf(gj0 gj0Var) {
        LinkedList<gj0> linkedList = new LinkedList<>();
        this.f15124l = linkedList;
        this.m = false;
        this.f15125n = null;
        if (gj0Var != null) {
            if (gj0Var instanceof ozf) {
                linkedList.addAll(((ozf) gj0Var).f15124l);
            } else {
                linkedList.add(gj0Var);
            }
        }
    }
}
