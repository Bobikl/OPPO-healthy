package org.spongycastle.pqc.crypto.xmss;

import com.oplus.aiunit.vision.g5l;
import com.oplus.aiunit.vision.h5l;
import com.oplus.aiunit.vision.voa;
import com.oplus.aiunit.vision.x6m;

/* JADX INFO: loaded from: classes11.dex */
public final class d {
    public final g5l a;
    public final voa b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f20770c;
    public byte[] d;

    public d(g5l g5lVar) {
        if (g5lVar == null) {
            throw new NullPointerException("params == null");
        }
        this.a = g5lVar;
        int iB = g5lVar.b();
        this.b = new voa(g5lVar.a(), iB);
        this.f20770c = new byte[iB];
        this.d = new byte[iB];
    }

    public final byte[] a(byte[] bArr, int i, int i2, c cVar) {
        int iB = this.a.b();
        if (bArr == null) {
            throw new NullPointerException("startHash == null");
        }
        if (bArr.length != iB) {
            throw new IllegalArgumentException("startHash needs to be " + iB + "bytes");
        }
        if (cVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (cVar.d() == null) {
            throw new NullPointerException("otsHashAddress byte array == null");
        }
        int i3 = i + i2;
        if (i3 > this.a.d() - 1) {
            throw new IllegalArgumentException("max chain length must not be greater than w");
        }
        if (i2 == 0) {
            return bArr;
        }
        byte[] bArrA = a(bArr, i, i2 - 1, cVar);
        c cVar2 = (c) new c.b().g(cVar.b()).h(cVar.c()).p(cVar.g()).n(cVar.e()).o(i3 - 1).f(0).l();
        byte[] bArrC = this.b.c(this.d, cVar2.d());
        byte[] bArrC2 = this.b.c(this.d, ((c) new c.b().g(cVar2.b()).h(cVar2.c()).p(cVar2.g()).n(cVar2.e()).o(cVar2.f()).f(1).l()).d());
        byte[] bArr2 = new byte[iB];
        for (int i4 = 0; i4 < iB; i4++) {
            bArr2[i4] = (byte) (bArrA[i4] ^ bArrC2[i4]);
        }
        return this.b.a(bArrC, bArr2);
    }

    public final byte[] b(int i) {
        if (i < 0 || i >= this.a.c()) {
            throw new IllegalArgumentException("index out of bounds");
        }
        return this.b.c(this.f20770c, x6m.p(i, 32));
    }

    public voa c() {
        return this.b;
    }

    public g5l d() {
        return this.a;
    }

    public h5l e(c cVar) {
        if (cVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        byte[][] bArr = new byte[this.a.c()][];
        for (int i = 0; i < this.a.c(); i++) {
            cVar = (c) new c.b().g(cVar.b()).h(cVar.c()).p(cVar.g()).n(i).o(cVar.f()).f(cVar.a()).l();
            bArr[i] = a(b(i), 0, this.a.d() - 1, cVar);
        }
        return new h5l(this.a, bArr);
    }

    public byte[] f() {
        return x6m.c(this.d);
    }

    public byte[] g(byte[] bArr, c cVar) {
        return this.b.c(bArr, ((c) new c.b().g(cVar.b()).h(cVar.c()).p(cVar.g()).l()).d());
    }

    public void h(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("secretKeySeed == null");
        }
        if (bArr.length != this.a.b()) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
        }
        if (bArr2 == null) {
            throw new NullPointerException("publicSeed == null");
        }
        if (bArr2.length != this.a.b()) {
            throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
        }
        this.f20770c = bArr;
        this.d = bArr2;
    }
}
