package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class h5m extends m1 implements n5m {
    public static final BigInteger o = BigInteger.valueOf(1);
    public l5m i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a86 f12019j;
    public j5m k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public BigInteger f12020l;
    public BigInteger m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f12021n;

    public h5m(s1 s1Var) {
        if (!(s1Var.p(0) instanceof k1) || !((k1) s1Var.p(0)).o().equals(o)) {
            throw new IllegalArgumentException("bad version in X9ECParameters");
        }
        g5m g5mVar = new g5m(l5m.g(s1Var.p(1)), s1.n(s1Var.p(2)));
        this.f12019j = g5mVar.f();
        f1 f1VarP = s1Var.p(3);
        if (f1VarP instanceof j5m) {
            this.k = (j5m) f1VarP;
        } else {
            this.k = new j5m(this.f12019j, (o1) f1VarP);
        }
        this.f12020l = ((k1) s1Var.p(4)).o();
        this.f12021n = g5mVar.g();
        if (s1Var.size() == 6) {
            this.m = ((k1) s1Var.p(5)).o();
        }
    }

    public static h5m i(Object obj) {
        if (obj instanceof h5m) {
            return (h5m) obj;
        }
        if (obj != null) {
            return new h5m(s1.n(obj));
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        g1Var.a(new k1(o));
        g1Var.a(this.i);
        g1Var.a(new g5m(this.f12019j, this.f12021n));
        g1Var.a(this.k);
        g1Var.a(new k1(this.f12020l));
        BigInteger bigInteger = this.m;
        if (bigInteger != null) {
            g1Var.a(new k1(bigInteger));
        }
        return new xj4(g1Var);
    }

    public a86 f() {
        return this.f12019j;
    }

    public rb6 g() {
        return this.k.f();
    }

    public BigInteger h() {
        return this.m;
    }

    public BigInteger j() {
        return this.f12020l;
    }

    public byte[] k() {
        return this.f12021n;
    }

    public h5m(a86 a86Var, j5m j5mVar, BigInteger bigInteger, BigInteger bigInteger2) {
        this(a86Var, j5mVar, bigInteger, bigInteger2, (byte[]) null);
    }

    public h5m(a86 a86Var, rb6 rb6Var, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this(a86Var, new j5m(rb6Var), bigInteger, bigInteger2, bArr);
    }

    public h5m(a86 a86Var, j5m j5mVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f12019j = a86Var;
        this.k = j5mVar;
        this.f12020l = bigInteger;
        this.m = bigInteger2;
        this.f12021n = bArr;
        if (y76.f(a86Var)) {
            this.i = new l5m(a86Var.r().b());
            return;
        }
        if (y76.d(a86Var)) {
            int[] iArrA = ((ene) a86Var.r()).c().a();
            if (iArrA.length == 3) {
                this.i = new l5m(iArrA[2], iArrA[1]);
                return;
            } else {
                if (iArrA.length == 5) {
                    this.i = new l5m(iArrA[4], iArrA[1], iArrA[2], iArrA[3]);
                    return;
                }
                throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
            }
        }
        throw new IllegalArgumentException("'curve' is of an unsupported type");
    }
}
