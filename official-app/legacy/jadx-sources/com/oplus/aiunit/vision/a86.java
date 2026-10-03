package com.oplus.aiunit.vision;

import java.math.BigInteger;
import java.util.Hashtable;
import java.util.Random;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a86 {
    public static final int COORD_AFFINE = 0;
    public static final int COORD_HOMOGENEOUS = 1;
    public static final int COORD_JACOBIAN = 2;
    public static final int COORD_JACOBIAN_CHUDNOVSKY = 3;
    public static final int COORD_JACOBIAN_MODIFIED = 4;
    public static final int COORD_LAMBDA_AFFINE = 5;
    public static final int COORD_LAMBDA_PROJECTIVE = 6;
    public static final int COORD_SKEWED = 7;
    public ig7 a;
    public h86 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h86 f9236c;
    public BigInteger d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BigInteger f9237e;
    public int f = 0;
    public g86 g = null;
    public lb6 h = null;

    public static abstract class a extends a86 {
        public BigInteger[] i;

        public a(int i, int i2, int i3, int i4) {
            super(E(i, i2, i3, i4));
            this.i = null;
        }

        public static ig7 E(int i, int i2, int i3, int i4) {
            if (i2 == 0) {
                throw new IllegalArgumentException("k1 must be > 0");
            }
            if (i3 == 0) {
                if (i4 == 0) {
                    return jg7.a(new int[]{0, i2, i});
                }
                throw new IllegalArgumentException("k3 must be 0 if k2 == 0");
            }
            if (i3 <= i2) {
                throw new IllegalArgumentException("k2 must be > k1");
            }
            if (i4 > i3) {
                return jg7.a(new int[]{0, i2, i3, i4, i});
            }
            throw new IllegalArgumentException("k3 must be > k2");
        }

        public synchronized BigInteger[] F() {
            if (this.i == null) {
                this.i = u0k.f(this);
            }
            return this.i;
        }

        public boolean G() {
            return this.d != null && this.f9237e != null && this.f9236c.h() && (this.b.i() || this.b.h());
        }

        public final h86 H(h86 h86Var) {
            h86 h86VarA;
            if (h86Var.i()) {
                return h86Var;
            }
            h86 h86VarM = m(z76.ZERO);
            int iS = s();
            Random random = new Random();
            do {
                h86 h86VarM2 = m(new BigInteger(iS, random));
                h86 h86VarA2 = h86Var;
                h86VarA = h86VarM;
                for (int i = 1; i < iS; i++) {
                    h86 h86VarO = h86VarA2.o();
                    h86VarA = h86VarA.o().a(h86VarO.j(h86VarM2));
                    h86VarA2 = h86VarO.a(h86Var);
                }
                if (!h86VarA2.i()) {
                    return null;
                }
            } while (h86VarA.o().a(h86VarA).i());
            return h86VarA;
        }

        @Override // com.oplus.aiunit.vision.a86
        public rb6 g(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
            h86 h86VarM = m(bigInteger);
            h86 h86VarM2 = m(bigInteger2);
            int iQ = q();
            if (iQ == 5 || iQ == 6) {
                if (!h86VarM.i()) {
                    h86VarM2 = h86VarM2.d(h86VarM).a(h86VarM);
                } else if (!h86VarM2.o().equals(o())) {
                    throw new IllegalArgumentException();
                }
            }
            return h(h86VarM, h86VarM2, z);
        }

        @Override // com.oplus.aiunit.vision.a86
        public rb6 k(int i, BigInteger bigInteger) {
            h86 h86VarA;
            h86 h86VarM = m(bigInteger);
            if (h86VarM.i()) {
                h86VarA = o().n();
            } else {
                h86 h86VarH = H(h86VarM.o().g().j(o()).a(n()).a(h86VarM));
                if (h86VarH != null) {
                    if (h86VarH.s() != (i == 1)) {
                        h86VarH = h86VarH.b();
                    }
                    int iQ = q();
                    h86VarA = (iQ == 5 || iQ == 6) ? h86VarH.a(h86VarM) : h86VarH.j(h86VarM);
                } else {
                    h86VarA = null;
                }
            }
            if (h86VarA != null) {
                return h(h86VarM, h86VarA, true);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }
    }

    public static abstract class b extends a86 {
        public b(BigInteger bigInteger) {
            super(jg7.b(bigInteger));
        }

        @Override // com.oplus.aiunit.vision.a86
        public rb6 k(int i, BigInteger bigInteger) {
            h86 h86VarM = m(bigInteger);
            h86 h86VarN = h86VarM.o().a(this.b).j(h86VarM).a(this.f9236c).n();
            if (h86VarN == null) {
                throw new IllegalArgumentException("Invalid point compression");
            }
            if (h86VarN.s() != (i == 1)) {
                h86VarN = h86VarN.m();
            }
            return h(h86VarM, h86VarN, true);
        }
    }

    public class c {
        public int a;
        public g86 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public lb6 f9238c;

        public c(int i, g86 g86Var, lb6 lb6Var) {
            this.a = i;
            this.b = g86Var;
            this.f9238c = lb6Var;
        }

        public a86 a() {
            if (!a86.this.B(this.a)) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            a86 a86VarC = a86.this.c();
            if (a86VarC == a86.this) {
                throw new IllegalStateException("implementation returned current curve");
            }
            synchronized (a86VarC) {
                a86VarC.f = this.a;
                a86VarC.g = this.b;
                a86VarC.h = this.f9238c;
            }
            return a86VarC;
        }

        public c b(g86 g86Var) {
            this.b = g86Var;
            return this;
        }
    }

    public static class d extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f9239j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f9240l;
        public int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public rb6.c f9241n;

        public d(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            this(i, i2, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
        }

        @Override // com.oplus.aiunit.vision.a86
        public boolean B(int i) {
            return i == 0 || i == 1 || i == 6;
        }

        @Override // com.oplus.aiunit.vision.a86
        public a86 c() {
            return new d(this.f9239j, this.k, this.f9240l, this.m, this.b, this.f9236c, this.d, this.f9237e);
        }

        @Override // com.oplus.aiunit.vision.a86
        public lb6 e() {
            return G() ? new p5l() : super.e();
        }

        @Override // com.oplus.aiunit.vision.a86
        public rb6 h(h86 h86Var, h86 h86Var2, boolean z) {
            return new rb6.c(this, h86Var, h86Var2, z);
        }

        @Override // com.oplus.aiunit.vision.a86
        public rb6 i(h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
            return new rb6.c(this, h86Var, h86Var2, h86VarArr, z);
        }

        @Override // com.oplus.aiunit.vision.a86
        public h86 m(BigInteger bigInteger) {
            return new h86.a(this.f9239j, this.k, this.f9240l, this.m, bigInteger);
        }

        @Override // com.oplus.aiunit.vision.a86
        public int s() {
            return this.f9239j;
        }

        @Override // com.oplus.aiunit.vision.a86
        public rb6 t() {
            return this.f9241n;
        }

        public d(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i, i2, i3, i4, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        public d(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(i, i2, i3, i4);
            this.f9239j = i;
            this.k = i2;
            this.f9240l = i3;
            this.m = i4;
            this.d = bigInteger3;
            this.f9237e = bigInteger4;
            this.f9241n = new rb6.c(this, null, null);
            this.b = m(bigInteger);
            this.f9236c = m(bigInteger2);
            this.f = 6;
        }

        public d(int i, int i2, int i3, int i4, h86 h86Var, h86 h86Var2, BigInteger bigInteger, BigInteger bigInteger2) {
            super(i, i2, i3, i4);
            this.f9239j = i;
            this.k = i2;
            this.f9240l = i3;
            this.m = i4;
            this.d = bigInteger;
            this.f9237e = bigInteger2;
            this.f9241n = new rb6.c(this, null, null);
            this.b = h86Var;
            this.f9236c = h86Var2;
            this.f = 6;
        }
    }

    public static class e extends b {
        public BigInteger i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public BigInteger f9242j;
        public rb6.d k;

        public e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            this(bigInteger, bigInteger2, bigInteger3, null, null);
        }

        @Override // com.oplus.aiunit.vision.a86
        public boolean B(int i) {
            return i == 0 || i == 1 || i == 2 || i == 4;
        }

        @Override // com.oplus.aiunit.vision.a86
        public a86 c() {
            return new e(this.i, this.f9242j, this.b, this.f9236c, this.d, this.f9237e);
        }

        @Override // com.oplus.aiunit.vision.a86
        public rb6 h(h86 h86Var, h86 h86Var2, boolean z) {
            return new rb6.d(this, h86Var, h86Var2, z);
        }

        @Override // com.oplus.aiunit.vision.a86
        public rb6 i(h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
            return new rb6.d(this, h86Var, h86Var2, h86VarArr, z);
        }

        @Override // com.oplus.aiunit.vision.a86
        public h86 m(BigInteger bigInteger) {
            return new h86.b(this.i, this.f9242j, bigInteger);
        }

        @Override // com.oplus.aiunit.vision.a86
        public int s() {
            return this.i.bitLength();
        }

        @Override // com.oplus.aiunit.vision.a86
        public rb6 t() {
            return this.k;
        }

        @Override // com.oplus.aiunit.vision.a86
        public rb6 x(rb6 rb6Var) {
            int iQ;
            return (this == rb6Var.i() || q() != 2 || rb6Var.t() || !((iQ = rb6Var.i().q()) == 2 || iQ == 3 || iQ == 4)) ? super.x(rb6Var) : new rb6.d(this, m(rb6Var.b.t()), m(rb6Var.f16149c.t()), new h86[]{m(rb6Var.d[0].t())}, rb6Var.f16150e);
        }

        public e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
            super(bigInteger);
            this.i = bigInteger;
            this.f9242j = h86.b.u(bigInteger);
            this.k = new rb6.d(this, null, null);
            this.b = m(bigInteger2);
            this.f9236c = m(bigInteger3);
            this.d = bigInteger4;
            this.f9237e = bigInteger5;
            this.f = 4;
        }

        public e(BigInteger bigInteger, BigInteger bigInteger2, h86 h86Var, h86 h86Var2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(bigInteger);
            this.i = bigInteger;
            this.f9242j = bigInteger2;
            this.k = new rb6.d(this, null, null);
            this.b = h86Var;
            this.f9236c = h86Var2;
            this.d = bigInteger3;
            this.f9237e = bigInteger4;
            this.f = 4;
        }
    }

    public a86(ig7 ig7Var) {
        this.a = ig7Var;
    }

    public void A(rb6 rb6Var, String str, qoe qoeVar) {
        a(rb6Var);
        synchronized (rb6Var) {
            Hashtable hashtable = rb6Var.f;
            if (hashtable == null) {
                hashtable = new Hashtable(4);
                rb6Var.f = hashtable;
            }
            hashtable.put(str, qoeVar);
        }
    }

    public boolean B(int i) {
        return i == 0;
    }

    public rb6 C(BigInteger bigInteger, BigInteger bigInteger2) {
        rb6 rb6VarF = f(bigInteger, bigInteger2);
        if (rb6VarF.v()) {
            return rb6VarF;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    public rb6 D(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
        rb6 rb6VarG = g(bigInteger, bigInteger2, z);
        if (rb6VarG.v()) {
            return rb6VarG;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    public void a(rb6 rb6Var) {
        if (rb6Var == null || this != rb6Var.i()) {
            throw new IllegalArgumentException("'point' must be non-null and on this curve");
        }
    }

    public void b(rb6[] rb6VarArr, int i, int i2) {
        if (rb6VarArr == null) {
            throw new IllegalArgumentException("'points' cannot be null");
        }
        if (i < 0 || i2 < 0 || i > rb6VarArr.length - i2) {
            throw new IllegalArgumentException("invalid range specified for 'points'");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            rb6 rb6Var = rb6VarArr[i + i3];
            if (rb6Var != null && this != rb6Var.i()) {
                throw new IllegalArgumentException("'points' entries must be null or on this curve");
            }
        }
    }

    public abstract a86 c();

    public synchronized c d() {
        return new c(this.f, this.g, this.h);
    }

    public lb6 e() {
        g86 g86Var = this.g;
        return g86Var instanceof q18 ? new r18(this, (q18) g86Var) : new c5l();
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof a86) && l((a86) obj));
    }

    public rb6 f(BigInteger bigInteger, BigInteger bigInteger2) {
        return g(bigInteger, bigInteger2, false);
    }

    public rb6 g(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
        return h(m(bigInteger), m(bigInteger2), z);
    }

    public abstract rb6 h(h86 h86Var, h86 h86Var2, boolean z);

    public int hashCode() {
        return kca.a(o().t().hashCode(), 16) ^ (r().hashCode() ^ kca.a(n().t().hashCode(), 8));
    }

    public abstract rb6 i(h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z);

    public rb6 j(byte[] bArr) {
        rb6 rb6VarT;
        int iS = (s() + 7) / 8;
        byte b2 = bArr[0];
        if (b2 != 0) {
            if (b2 == 2 || b2 == 3) {
                if (bArr.length != iS + 1) {
                    throw new IllegalArgumentException("Incorrect length for compressed encoding");
                }
                rb6VarT = k(b2 & 1, td1.c(bArr, 1, iS));
                if (!rb6VarT.A()) {
                    throw new IllegalArgumentException("Invalid point");
                }
            } else if (b2 != 4) {
                if (b2 != 6 && b2 != 7) {
                    throw new IllegalArgumentException("Invalid point encoding 0x" + Integer.toString(b2, 16));
                }
                if (bArr.length != (iS * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for hybrid encoding");
                }
                BigInteger bigIntegerC = td1.c(bArr, 1, iS);
                BigInteger bigIntegerC2 = td1.c(bArr, iS + 1, iS);
                if (bigIntegerC2.testBit(0) != (b2 == 7)) {
                    throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                }
                rb6VarT = C(bigIntegerC, bigIntegerC2);
            } else {
                if (bArr.length != (iS * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
                }
                rb6VarT = C(td1.c(bArr, 1, iS), td1.c(bArr, iS + 1, iS));
            }
        } else {
            if (bArr.length != 1) {
                throw new IllegalArgumentException("Incorrect length for infinity encoding");
            }
            rb6VarT = t();
        }
        if (b2 == 0 || !rb6VarT.t()) {
            return rb6VarT;
        }
        throw new IllegalArgumentException("Invalid infinity encoding");
    }

    public abstract rb6 k(int i, BigInteger bigInteger);

    public boolean l(a86 a86Var) {
        return this == a86Var || (a86Var != null && r().equals(a86Var.r()) && n().t().equals(a86Var.n().t()) && o().t().equals(a86Var.o().t()));
    }

    public abstract h86 m(BigInteger bigInteger);

    public h86 n() {
        return this.b;
    }

    public h86 o() {
        return this.f9236c;
    }

    public BigInteger p() {
        return this.f9237e;
    }

    public int q() {
        return this.f;
    }

    public ig7 r() {
        return this.a;
    }

    public abstract int s();

    public abstract rb6 t();

    public synchronized lb6 u() {
        if (this.h == null) {
            this.h = e();
        }
        return this.h;
    }

    public BigInteger v() {
        return this.d;
    }

    public qoe w(rb6 rb6Var, String str) {
        qoe qoeVar;
        a(rb6Var);
        synchronized (rb6Var) {
            Hashtable hashtable = rb6Var.f;
            qoeVar = hashtable == null ? null : (qoe) hashtable.get(str);
        }
        return qoeVar;
    }

    public rb6 x(rb6 rb6Var) {
        if (this == rb6Var.i()) {
            return rb6Var;
        }
        if (rb6Var.t()) {
            return t();
        }
        rb6 rb6VarY = rb6Var.y();
        return D(rb6VarY.q().t(), rb6VarY.r().t(), rb6VarY.f16150e);
    }

    public void y(rb6[] rb6VarArr) {
        z(rb6VarArr, 0, rb6VarArr.length, null);
    }

    public void z(rb6[] rb6VarArr, int i, int i2, h86 h86Var) {
        b(rb6VarArr, i, i2);
        int iQ = q();
        if (iQ == 0 || iQ == 5) {
            if (h86Var != null) {
                throw new IllegalArgumentException("'iso' not valid for affine coordinates");
            }
            return;
        }
        h86[] h86VarArr = new h86[i2];
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i + i4;
            rb6 rb6Var = rb6VarArr[i5];
            if (rb6Var != null && (h86Var != null || !rb6Var.u())) {
                h86VarArr[i3] = rb6Var.s(0);
                iArr[i3] = i5;
                i3++;
            }
        }
        if (i3 == 0) {
            return;
        }
        y76.h(h86VarArr, 0, i3, h86Var);
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = iArr[i6];
            rb6VarArr[i7] = rb6VarArr[i7].z(h86VarArr[i6]);
        }
    }
}
