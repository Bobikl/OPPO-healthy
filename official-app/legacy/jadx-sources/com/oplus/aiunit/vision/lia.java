package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class lia extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f13711l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public tpj.a f13712n;

    public lia(String str, int i) {
        this.f13711l = str;
        this.m = i;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        bw7 bw7Var;
        bw7 bw7Var2;
        bw7 bw7Var3;
        if (this.f13712n == null) {
            return new mia(this.f13711l, this.m, w65.V(rpjVar.m()));
        }
        w65 w65Var = (w65) rpjVar.n();
        int i = (w65Var.f ? 2 : 0) | (w65Var.b ? 1 : 0);
        boolean z = w65Var.f18139c;
        if (w65Var.d) {
            tpj.a aVar = this.f13712n;
            String str = aVar.a;
            if (str == null) {
                bw7Var2 = new bw7(aVar.b, 0, 10);
                bw7Var3 = bw7Var2;
            } else {
                bw7Var = new bw7(str, 0, 10);
                bw7Var3 = bw7Var;
            }
        } else {
            tpj.a aVar2 = this.f13712n;
            String str2 = aVar2.b;
            if (str2 == null) {
                bw7Var2 = new bw7(aVar2.a, 0, 10);
                bw7Var3 = bw7Var2;
            } else {
                bw7Var = new bw7(str2, 0, 10);
                bw7Var3 = bw7Var;
            }
        }
        return new mia(this.f13711l, i, w65.V(rpjVar.m()), bw7Var3, z);
    }

    public lia(String str, tpj.a aVar) {
        this(str, 0);
        this.f13712n = aVar;
    }
}
