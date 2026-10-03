package com.oplus.aiunit.vision;

import org.spongycastle.util.MemoableResetException;

/* JADX INFO: loaded from: classes11.dex */
public class e6g extends z8b {
    public int p;
    public long q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;

    public e6g(int i) {
        if (i >= 512) {
            throw new IllegalArgumentException("bitLength cannot be >= 512");
        }
        if (i % 8 != 0) {
            throw new IllegalArgumentException("bitLength needs to be a multiple of 8");
        }
        if (i == 384) {
            throw new IllegalArgumentException("bitLength cannot be 384 use SHA384 instead");
        }
        int i2 = i / 8;
        this.p = i2;
        v(i2 * 8);
        reset();
    }

    public static void t(int i, byte[] bArr, int i2, int i3) {
        int iMin = Math.min(4, i3);
        while (true) {
            iMin--;
            if (iMin < 0) {
                return;
            } else {
                bArr[i2 + iMin] = (byte) (i >>> ((3 - iMin) * 8));
            }
        }
    }

    public static void u(long j2, byte[] bArr, int i, int i2) {
        if (i2 > 0) {
            t((int) (j2 >>> 32), bArr, i, i2);
            if (i2 > 4) {
                t((int) (j2 & 4294967295L), bArr, i + 4, i2 - 4);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.ns5
    public int a(byte[] bArr, int i) {
        p();
        u(this.f19318e, bArr, i, this.p);
        u(this.f, bArr, i + 8, this.p - 8);
        u(this.g, bArr, i + 16, this.p - 16);
        u(this.h, bArr, i + 24, this.p - 24);
        u(this.i, bArr, i + 32, this.p - 32);
        u(this.f19319j, bArr, i + 40, this.p - 40);
        u(this.k, bArr, i + 48, this.p - 48);
        u(this.f19320l, bArr, i + 56, this.p - 56);
        reset();
        return this.p;
    }

    @Override // com.oplus.aiunit.vision.ns5
    public String c() {
        return "SHA-512/" + Integer.toString(this.p * 8);
    }

    @Override // com.oplus.aiunit.vision.gsb
    public gsb copy() {
        return new e6g(this);
    }

    @Override // com.oplus.aiunit.vision.gsb
    public void d(gsb gsbVar) {
        e6g e6gVar = (e6g) gsbVar;
        if (this.p != e6gVar.p) {
            throw new MemoableResetException("digestLength inappropriate in other");
        }
        super.o(e6gVar);
        this.q = e6gVar.q;
        this.r = e6gVar.r;
        this.s = e6gVar.s;
        this.t = e6gVar.t;
        this.u = e6gVar.u;
        this.v = e6gVar.v;
        this.w = e6gVar.w;
        this.x = e6gVar.x;
    }

    @Override // com.oplus.aiunit.vision.ns5
    public int f() {
        return this.p;
    }

    @Override // com.oplus.aiunit.vision.z8b, com.oplus.aiunit.vision.ns5
    public void reset() {
        super.reset();
        this.f19318e = this.q;
        this.f = this.r;
        this.g = this.s;
        this.h = this.t;
        this.i = this.u;
        this.f19319j = this.v;
        this.k = this.w;
        this.f19320l = this.x;
    }

    public final void v(int i) {
        this.f19318e = -3482333909917012819L;
        this.f = 2216346199247487646L;
        this.g = -7364697282686394994L;
        this.h = 65953792586715988L;
        this.i = -816286391624063116L;
        this.f19319j = 4512832404995164602L;
        this.k = -5033199132376557362L;
        this.f19320l = -124578254951840548L;
        b((byte) 83);
        b((byte) 72);
        b((byte) 65);
        b((byte) 45);
        b((byte) 53);
        b((byte) 49);
        b((byte) 50);
        b((byte) 47);
        if (i > 100) {
            b((byte) ((i / 100) + 48));
            int i2 = i % 100;
            b((byte) ((i2 / 10) + 48));
            b((byte) ((i2 % 10) + 48));
        } else if (i > 10) {
            b((byte) ((i / 10) + 48));
            b((byte) ((i % 10) + 48));
        } else {
            b((byte) (i + 48));
        }
        p();
        this.q = this.f19318e;
        this.r = this.f;
        this.s = this.g;
        this.t = this.h;
        this.u = this.i;
        this.v = this.f19319j;
        this.w = this.k;
        this.x = this.f19320l;
    }

    public e6g(e6g e6gVar) {
        super(e6gVar);
        this.p = e6gVar.p;
        d(e6gVar);
    }
}
