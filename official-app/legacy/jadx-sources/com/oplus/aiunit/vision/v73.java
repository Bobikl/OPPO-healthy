package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class v73 extends y73 {
    public final char m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f17741n;
    public boolean o;

    public v73(char c2, String str, boolean z) {
        this.m = c2;
        this.f17741n = str;
        this.o = z;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        String strO;
        if (this.f17741n == null && (strO = rpjVar.o()) != null) {
            this.f17741n = strO;
        }
        boolean zK = rpjVar.k();
        w73 w73Var = new w73(m(rpjVar.n(), rpjVar.m(), zK));
        return (zK && Character.isLowerCase(this.m)) ? new qdg(w73Var, 0.800000011920929d, 0.800000011920929d) : w73Var;
    }

    @Override // com.oplus.aiunit.vision.y73
    public x73 f(spj spjVar) {
        return m(spjVar, 0, false).b();
    }

    public final u73 m(spj spjVar, int i, boolean z) {
        char upperCase = this.m;
        if (z && Character.isLowerCase(upperCase)) {
            upperCase = Character.toUpperCase(this.m);
        }
        String str = this.f17741n;
        return str == null ? spjVar.h(upperCase, i) : spjVar.G(upperCase, str, i);
    }

    public char q() {
        return this.m;
    }

    public boolean r() {
        return this.o;
    }

    public String toString() {
        return "CharAtom: '" + this.m + "'";
    }

    public v73(char c2, String str) {
        this(c2, str, false);
    }
}
