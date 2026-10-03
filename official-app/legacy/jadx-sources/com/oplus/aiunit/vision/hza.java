package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class hza extends w5 {
    public final fza a = new fza();
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12320c;

    public hza(int i) {
        this.b = i;
    }

    @Override // com.oplus.aiunit.vision.w5, com.oplus.aiunit.vision.wh1
    public boolean a(qh1 qh1Var) {
        if (!this.f12320c) {
            return true;
        }
        qh1 qh1VarF = this.a.f();
        if (!(qh1VarF instanceof zya)) {
            return true;
        }
        ((zya) qh1VarF).o(false);
        return true;
    }

    @Override // com.oplus.aiunit.vision.w5, com.oplus.aiunit.vision.wh1
    public boolean b() {
        return true;
    }

    @Override // com.oplus.aiunit.vision.wh1
    public qh1 d() {
        return this.a;
    }

    @Override // com.oplus.aiunit.vision.wh1
    public th1 h(l8e l8eVar) {
        if (!l8eVar.a()) {
            return l8eVar.d() >= this.b ? th1.a(l8eVar.getColumn() + this.b) : th1.d();
        }
        if (this.a.c() == null) {
            return th1.d();
        }
        qh1 qh1VarD = l8eVar.e().d();
        this.f12320c = (qh1VarD instanceof a7e) || (qh1VarD instanceof fza);
        return th1.b(l8eVar.c());
    }
}
