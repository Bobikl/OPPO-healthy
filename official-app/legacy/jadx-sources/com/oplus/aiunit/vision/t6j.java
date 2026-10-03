package com.oplus.aiunit.vision;

import java.io.InputStream;
import java.util.BitSet;
import java.util.Map;
import org.scilab.forge.jlatexmath.SymbolMappingNotFoundException;
import org.scilab.forge.jlatexmath.SymbolNotFoundException;

/* JADX INFO: loaded from: classes11.dex */
public class t6j extends y73 {
    public static BitSet p;
    public static Map<String, t6j> symbols = new xpj().b();
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f16909n;
    public char o;

    static {
        BitSet bitSet = new BitSet(16);
        p = bitSet;
        bitSet.set(0);
        p.set(1);
        p.set(2);
        p.set(3);
        p.set(4);
        p.set(5);
        p.set(6);
        p.set(10);
    }

    public t6j(String str, int i, boolean z) {
        this.f16909n = str;
        this.i = i;
        if (i == 1) {
            this.f11780j = 0;
        }
        this.m = z;
    }

    public static void m(InputStream inputStream, String str) {
        symbols.putAll(new xpj(inputStream, str).b());
    }

    public static t6j q(String str) throws SymbolNotFoundException {
        t6j t6jVar = symbols.get(str);
        if (t6jVar != null) {
            return t6jVar;
        }
        throw new SymbolNotFoundException(str);
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        char c2;
        spj spjVarN = rpjVar.n();
        int iM = rpjVar.m();
        u73 u73VarS = spjVarN.s(this.f16909n, iM);
        t22 w73Var = new w73(u73VarS);
        if (rpjVar.k() && (c2 = this.o) != 0 && Character.isLowerCase(c2)) {
            try {
                w73Var = new qdg(new w73(spjVarN.s(tpj.symbolTextMappings[Character.toUpperCase(this.o)], iM)), 0.8d, 0.8d);
            } catch (SymbolMappingNotFoundException unused) {
            }
        }
        if (this.i != 1) {
            return w73Var;
        }
        if (iM < 2 && spjVarN.K(u73VarS)) {
            u73VarS = spjVarN.f(u73VarS, iM);
        }
        w73 w73Var2 = new w73(u73VarS);
        w73Var2.o(((-(w73Var2.h() + w73Var2.g())) / 2.0f) - rpjVar.n().d(rpjVar.m()));
        float fG = u73VarS.g();
        af9 af9Var = new af9(w73Var2);
        if (fG > 1.0E-7f) {
            af9Var.b(new s1j(fG, 0.0f, 0.0f, 0.0f));
        }
        return af9Var;
    }

    @Override // com.oplus.aiunit.vision.y73
    public x73 f(spj spjVar) {
        return spjVar.s(this.f16909n, 0).b();
    }

    public String r() {
        return this.f16909n;
    }

    public t6j s(char c2) {
        this.o = c2;
        return this;
    }
}
