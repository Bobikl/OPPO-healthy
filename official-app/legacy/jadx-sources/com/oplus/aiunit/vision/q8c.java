package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class q8c extends gj0 {
    public static final int GATHER = 1;
    public static final int GATHERED = 2;
    public static final int MULTLINE = 0;
    public static d4i vsep_in = new d4i(1, 0.0f, 1.0f, 0.0f);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public bh0 f15668l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f15669n;

    public q8c(boolean z, bh0 bh0Var, int i) {
        this.f15669n = z;
        this.f15668l = bh0Var;
        this.m = i;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        bh0 bh0Var;
        int i;
        float fP = rpjVar.p();
        if (fP != Float.POSITIVE_INFINITY) {
            if (this.m != 2) {
                tvk tvkVar = new tvk();
                gj0 gj0Var = this.f15668l.g.get(0).get(0);
                int i2 = this.m == 1 ? 2 : 0;
                int i3 = gj0Var.k;
                if (i3 != -1) {
                    i2 = i3;
                }
                tvkVar.b(new af9(gj0Var.c(rpjVar), fP, i2));
                t22 t22VarC = vsep_in.c(rpjVar);
                int i4 = 1;
                while (true) {
                    bh0Var = this.f15668l;
                    i = bh0Var.i;
                    if (i4 >= i - 1) {
                        break;
                    }
                    gj0 gj0Var2 = bh0Var.g.get(i4).get(0);
                    int i5 = gj0Var2.k;
                    if (i5 == -1) {
                        i5 = 2;
                    }
                    tvkVar.b(t22VarC);
                    tvkVar.b(new af9(gj0Var2.c(rpjVar), fP, i5));
                    i4++;
                }
                if (i > 1) {
                    gj0 gj0Var3 = bh0Var.g.get(i - 1).get(0);
                    int i6 = this.m != 1 ? 1 : 2;
                    int i7 = gj0Var3.k;
                    if (i7 != -1) {
                        i6 = i7;
                    }
                    tvkVar.b(t22VarC);
                    tvkVar.b(new af9(gj0Var3.c(rpjVar), fP, i6));
                }
                float fH = (tvkVar.h() + tvkVar.g()) / 2.0f;
                tvkVar.n(fH);
                tvkVar.m(fH);
                return tvkVar;
            }
        }
        return new snb(this.f15669n, this.f15668l, "").c(rpjVar);
    }
}
