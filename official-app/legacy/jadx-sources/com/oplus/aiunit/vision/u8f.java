package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class u8f extends m1 {
    public u1 i;

    public u8f(u1 u1Var) {
        this.i = u1Var;
    }

    public static u8f g(Object obj) {
        if (obj instanceof u8f) {
            return (u8f) obj;
        }
        if (obj != null) {
            return new u8f(u1.o(obj));
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        return this.i;
    }

    public wj0 f() {
        if (this.i.size() == 0) {
            return null;
        }
        return wj0.f(this.i.q(0));
    }

    public wj0[] h() {
        int size = this.i.size();
        wj0[] wj0VarArr = new wj0[size];
        for (int i = 0; i != size; i++) {
            wj0VarArr[i] = wj0.f(this.i.q(i));
        }
        return wj0VarArr;
    }

    public boolean i() {
        return this.i.size() > 1;
    }
}
