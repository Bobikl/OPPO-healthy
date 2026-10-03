package org.spongycastle.pqc.crypto.xmss;

import com.oplus.aiunit.vision.eh0;
import com.oplus.aiunit.vision.h2e;
import com.oplus.aiunit.vision.pi0;
import com.oplus.aiunit.vision.t6m;
import com.oplus.aiunit.vision.x6m;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends pi0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t6m f20773j;
    public final byte[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final byte[] f20774l;
    public final byte[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final byte[] f20775n;
    public final BDS o;

    public static class b {
        public final t6m a;
        public int b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f20776c = null;
        public byte[] d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f20777e = null;
        public byte[] f = null;
        public BDS g = null;
        public byte[] h = null;
        public t6m i = null;

        public b(t6m t6mVar) {
            this.a = t6mVar;
        }

        public g j() {
            return new g(this);
        }

        public b k(BDS bds) {
            this.g = bds;
            return this;
        }

        public b l(int i) {
            this.b = i;
            return this;
        }

        public b m(byte[] bArr) {
            this.f20777e = x6m.c(bArr);
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
            this.f20776c = x6m.c(bArr);
            return this;
        }
    }

    public t6m b() {
        return this.f20773j;
    }

    public byte[] c() {
        int iC = this.f20773j.c();
        byte[] bArr = new byte[iC + 4 + iC + iC + iC];
        h2e.c(this.o.getIndex(), bArr, 0);
        x6m.e(bArr, this.k, 4);
        int i = 4 + iC;
        x6m.e(bArr, this.f20774l, i);
        int i2 = i + iC;
        x6m.e(bArr, this.m, i2);
        x6m.e(bArr, this.f20775n, i2 + iC);
        try {
            return eh0.j(bArr, x6m.o(this.o));
        } catch (IOException e2) {
            throw new RuntimeException("error serializing bds state: " + e2.getMessage());
        }
    }

    public g(b bVar) {
        BDS bds;
        super(true);
        t6m t6mVar = bVar.a;
        this.f20773j = t6mVar;
        if (t6mVar == null) {
            throw new NullPointerException("params == null");
        }
        int iC = t6mVar.c();
        byte[] bArr = bVar.h;
        if (bArr != null) {
            if (bVar.i == null) {
                throw new NullPointerException("xmss == null");
            }
            int iD = t6mVar.d();
            int iA = h2e.a(bArr, 0);
            if (!x6m.l(iD, iA)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            this.k = x6m.g(bArr, 4, iC);
            int i = 4 + iC;
            this.f20774l = x6m.g(bArr, i, iC);
            int i2 = i + iC;
            this.m = x6m.g(bArr, i2, iC);
            int i3 = i2 + iC;
            this.f20775n = x6m.g(bArr, i3, iC);
            int i4 = i3 + iC;
            try {
                bds = (BDS) x6m.f(x6m.g(bArr, i4, bArr.length - i4));
            } catch (IOException e2) {
                e2.printStackTrace();
                bds = null;
            } catch (ClassNotFoundException e3) {
                e3.printStackTrace();
                bds = null;
            }
            bds.setXMSS(bVar.i);
            bds.validate();
            if (bds.getIndex() != iA) {
                throw new IllegalStateException("serialized BDS has wrong index");
            }
            this.o = bds;
            return;
        }
        byte[] bArr2 = bVar.f20776c;
        if (bArr2 == null) {
            this.k = new byte[iC];
        } else {
            if (bArr2.length != iC) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.k = bArr2;
        }
        byte[] bArr3 = bVar.d;
        if (bArr3 == null) {
            this.f20774l = new byte[iC];
        } else {
            if (bArr3.length != iC) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.f20774l = bArr3;
        }
        byte[] bArr4 = bVar.f20777e;
        if (bArr4 == null) {
            this.m = new byte[iC];
        } else {
            if (bArr4.length != iC) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.m = bArr4;
        }
        byte[] bArr5 = bVar.f;
        if (bArr5 == null) {
            this.f20775n = new byte[iC];
        } else {
            if (bArr5.length != iC) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.f20775n = bArr5;
        }
        BDS bds2 = bVar.g;
        if (bds2 != null) {
            this.o = bds2;
        } else if (bVar.b >= (1 << t6mVar.d()) - 2 || bArr4 == null || bArr2 == null) {
            this.o = new BDS(t6mVar, bVar.b);
        } else {
            this.o = new BDS(t6mVar, bArr4, bArr2, (c) new c.b().l(), bVar.b);
        }
    }
}
