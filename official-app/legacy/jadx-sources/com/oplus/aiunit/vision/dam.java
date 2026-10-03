package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes12.dex */
public class dam extends bam {
    public static final /* synthetic */ boolean d = true;

    public dam(byte[] bArr) {
        super(bArr);
    }

    public static dam b(String str, long j2, ogm ogmVar, short s, qsm qsmVar) throws Exception {
        byte[] bArrC = rkm.c((byte) 1);
        boolean z = d;
        if (!z && bArrC.length != 1) {
            throw new AssertionError();
        }
        byte[] bArrD = rkm.d(str.charAt(0), str.charAt(1));
        if (!z && bArrD.length != 2) {
            throw new AssertionError();
        }
        byte[] bArrE = rkm.e(j2);
        if (!z && bArrE.length != 8) {
            throw new AssertionError();
        }
        byte[] bArrH = rkm.h();
        if (!z && bArrH.length != 2) {
            throw new AssertionError();
        }
        ogmVar.a();
        byte[] bArrC2 = rkm.c(ogmVar.a);
        if (!z && bArrC2.length != 1) {
            throw new AssertionError();
        }
        byte[] bArrC3 = rkm.c(ogmVar.b);
        if (!z && bArrC3.length != 1) {
            throw new AssertionError();
        }
        byte[] bArr = (byte[]) ogmVar.f14936c.clone();
        if (!z && bArr.length != (ogmVar.b & 255)) {
            throw new AssertionError();
        }
        byte[] bArrF = rkm.f(s);
        if (!z && bArrF.length != 2) {
            throw new AssertionError();
        }
        byte[] bArrH2 = rkm.h();
        if (!z && bArrH2.length != 2) {
            throw new AssertionError();
        }
        qsmVar.a();
        byte[] bArrC4 = rkm.c(qsmVar.a);
        if (!z && bArrC4.length != 1) {
            throw new AssertionError();
        }
        byte[] bArr2 = (byte[]) qsmVar.b.clone();
        if (!z && bArr2.length != (qsmVar.a & 255)) {
            throw new AssertionError();
        }
        byte[] bArrI = rkm.i();
        if (z || bArrI.length == 4) {
            return new dam(rkm.g(bArrC, bArrD, bArrE, bArrH, bArrC2, bArrC3, bArr, bArrF, bArrH2, bArrC4, bArr2, bArrI));
        }
        throw new AssertionError();
    }

    public static dam c() {
        try {
            return b(bam.f9661c, 0L, new skm(""), (short) 0, new evm());
        } catch (Exception unused) {
            return null;
        }
    }
}
