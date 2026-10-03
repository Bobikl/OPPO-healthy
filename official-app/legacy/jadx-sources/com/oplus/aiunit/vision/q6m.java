package com.oplus.aiunit.vision;

import java.io.IOException;
import org.spongycastle.pqc.crypto.xmss.BDSStateMap;

/* JADX INFO: loaded from: classes11.dex */
public final class q6m extends pi0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o6m f15648j;
    public final long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final byte[] f15649l;
    public final byte[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final byte[] f15650n;
    public final byte[] o;
    public final BDSStateMap p;

    public static class b {
        public final o6m a;
        public long b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f15651c = null;
        public byte[] d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f15652e = null;
        public byte[] f = null;
        public BDSStateMap g = null;
        public byte[] h = null;
        public t6m i = null;

        public b(o6m o6mVar) {
            this.a = o6mVar;
        }

        public q6m j() {
            return new q6m(this);
        }

        public b k(BDSStateMap bDSStateMap) {
            this.g = bDSStateMap;
            return this;
        }

        public b l(long j2) {
            this.b = j2;
            return this;
        }

        public b m(byte[] bArr) {
            this.f15652e = x6m.c(bArr);
            return this;
        }

        public b n(byte[] bArr) {
            this.f = x6m.c(bArr);
            return this;
        }

        public b o(byte[] bArr) {
            this.d = x6m.c(bArr);
            return this;
        }

        public b p(byte[] bArr) {
            this.f15651c = x6m.c(bArr);
            return this;
        }
    }

    public o6m b() {
        return this.f15648j;
    }

    public byte[] c() {
        int iB = this.f15648j.b();
        int iC = (this.f15648j.c() + 7) / 8;
        byte[] bArr = new byte[iC + iB + iB + iB + iB];
        x6m.e(bArr, x6m.p(this.k, iC), 0);
        int i = iC + 0;
        x6m.e(bArr, this.f15649l, i);
        int i2 = i + iB;
        x6m.e(bArr, this.m, i2);
        int i3 = i2 + iB;
        x6m.e(bArr, this.f15650n, i3);
        x6m.e(bArr, this.o, i3 + iB);
        try {
            return eh0.j(bArr, x6m.o(this.p));
        } catch (IOException e2) {
            e2.printStackTrace();
            throw new RuntimeException("error serializing bds state");
        }
    }

    public q6m(b bVar) {
        BDSStateMap bDSStateMap;
        super(true);
        o6m o6mVar = bVar.a;
        this.f15648j = o6mVar;
        if (o6mVar == null) {
            throw new NullPointerException("params == null");
        }
        int iB = o6mVar.b();
        byte[] bArr = bVar.h;
        if (bArr != null) {
            if (bVar.i == null) {
                throw new NullPointerException("xmss == null");
            }
            int iC = o6mVar.c();
            int i = (iC + 7) / 8;
            long jA = x6m.a(bArr, 0, i);
            this.k = jA;
            if (!x6m.l(iC, jA)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            int i2 = i + 0;
            this.f15649l = x6m.g(bArr, i2, iB);
            int i3 = i2 + iB;
            this.m = x6m.g(bArr, i3, iB);
            int i4 = i3 + iB;
            this.f15650n = x6m.g(bArr, i4, iB);
            int i5 = i4 + iB;
            this.o = x6m.g(bArr, i5, iB);
            int i6 = i5 + iB;
            try {
                bDSStateMap = (BDSStateMap) x6m.f(x6m.g(bArr, i6, bArr.length - i6));
            } catch (IOException e2) {
                e2.printStackTrace();
                bDSStateMap = null;
            } catch (ClassNotFoundException e3) {
                e3.printStackTrace();
                bDSStateMap = null;
            }
            bDSStateMap.setXMSS(bVar.i);
            this.p = bDSStateMap;
            return;
        }
        this.k = bVar.b;
        byte[] bArr2 = bVar.f15651c;
        if (bArr2 == null) {
            this.f15649l = new byte[iB];
        } else {
            if (bArr2.length != iB) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.f15649l = bArr2;
        }
        byte[] bArr3 = bVar.d;
        if (bArr3 == null) {
            this.m = new byte[iB];
        } else {
            if (bArr3.length != iB) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.m = bArr3;
        }
        byte[] bArr4 = bVar.f15652e;
        if (bArr4 == null) {
            this.f15650n = new byte[iB];
        } else {
            if (bArr4.length != iB) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.f15650n = bArr4;
        }
        byte[] bArr5 = bVar.f;
        if (bArr5 == null) {
            this.o = new byte[iB];
        } else {
            if (bArr5.length != iB) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.o = bArr5;
        }
        BDSStateMap bDSStateMap2 = bVar.g;
        if (bDSStateMap2 != null) {
            this.p = bDSStateMap2;
            return;
        }
        if (!x6m.l(o6mVar.c(), bVar.b) || bArr4 == null || bArr2 == null) {
            this.p = new BDSStateMap();
        } else {
            this.p = new BDSStateMap(o6mVar, bVar.b, bArr4, bArr2);
        }
    }
}
