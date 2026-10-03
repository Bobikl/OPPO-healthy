package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class ye4 extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public gj0 f18990l;
    public ozf m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ozf f18991n;

    public ye4(gj0 gj0Var, gj0 gj0Var2, gj0 gj0Var3) {
        if (!(gj0Var instanceof ye4)) {
            if (gj0Var == null) {
                this.f18990l = new nhe(new v73('M', "mathnormal"), false, true, true);
            } else {
                this.f18990l = gj0Var;
            }
            this.m = new ozf(gj0Var3);
            this.f18991n = new ozf(gj0Var2);
            return;
        }
        ye4 ye4Var = (ye4) gj0Var;
        this.f18990l = ye4Var.f18990l;
        ye4Var.m.f(gj0Var3);
        ye4Var.f18991n.f(gj0Var2);
        this.m = ye4Var.m;
        this.f18991n = ye4Var.f18991n;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        return new ijg(this.f18990l, this.f18991n, this.m).c(rpjVar);
    }
}
