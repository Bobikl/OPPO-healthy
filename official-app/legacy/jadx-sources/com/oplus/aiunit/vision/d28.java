package com.oplus.aiunit.vision;

import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes11.dex */
public class d28 implements AlgorithmParameterSpec, e28 {
    public i28 a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10344c;
    public String d;

    public d28(String str, String str2, String str3) {
        c28 c28VarA;
        try {
            c28VarA = b28.a(new n1(str));
        } catch (IllegalArgumentException unused) {
            n1 n1VarB = b28.b(str);
            if (n1VarB != null) {
                str = n1VarB.q();
                c28VarA = b28.a(n1VarB);
            } else {
                c28VarA = null;
            }
        }
        if (c28VarA == null) {
            throw new IllegalArgumentException("no key parameter set for passed in name/OID.");
        }
        this.a = new i28(c28VarA.g(), c28VarA.h(), c28VarA.f());
        this.b = str;
        this.f10344c = str2;
        this.d = str3;
    }

    public static d28 e(h28 h28Var) {
        return h28Var.g() != null ? new d28(h28Var.i().q(), h28Var.f().q(), h28Var.g().q()) : new d28(h28Var.i().q(), h28Var.f().q());
    }

    @Override // com.oplus.aiunit.vision.e28
    public i28 a() {
        return this.a;
    }

    @Override // com.oplus.aiunit.vision.e28
    public String b() {
        return this.b;
    }

    @Override // com.oplus.aiunit.vision.e28
    public String c() {
        return this.d;
    }

    @Override // com.oplus.aiunit.vision.e28
    public String d() {
        return this.f10344c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d28)) {
            return false;
        }
        d28 d28Var = (d28) obj;
        if (!this.a.equals(d28Var.a) || !this.f10344c.equals(d28Var.f10344c)) {
            return false;
        }
        String str = this.d;
        String str2 = d28Var.d;
        return str == str2 || (str != null && str.equals(str2));
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() ^ this.f10344c.hashCode();
        String str = this.d;
        return (str != null ? str.hashCode() : 0) ^ iHashCode;
    }

    public d28(String str, String str2) {
        this(str, str2, null);
    }

    public d28(i28 i28Var) {
        this.a = i28Var;
        this.f10344c = qe4.gostR3411_94_CryptoProParamSet.q();
        this.d = null;
    }
}
