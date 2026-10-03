package com.oplus.aiunit.vision;

import java.util.Hashtable;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes11.dex */
public class irk {
    public static final Hashtable a;

    static {
        Hashtable hashtable = new Hashtable();
        a = hashtable;
        hashtable.put(MessageDigestAlgorithms.SHA_1, kca.b(128));
        hashtable.put(MessageDigestAlgorithms.SHA_224, kca.b(192));
        hashtable.put(MessageDigestAlgorithms.SHA_256, kca.b(256));
        hashtable.put(MessageDigestAlgorithms.SHA_384, kca.b(256));
        hashtable.put(MessageDigestAlgorithms.SHA_512, kca.b(256));
        hashtable.put(MessageDigestAlgorithms.SHA_512_224, kca.b(192));
        hashtable.put(MessageDigestAlgorithms.SHA_512_256, kca.b(256));
    }

    public static int a(ns5 ns5Var) {
        return ((Integer) a.get(ns5Var.c())).intValue();
    }

    public static int b(edb edbVar) {
        String strC = edbVar.c();
        return ((Integer) a.get(strC.substring(0, strC.indexOf("/")))).intValue();
    }

    public static byte[] c(ns5 ns5Var, byte[] bArr, int i) {
        int i2 = (i + 7) / 8;
        byte[] bArr2 = new byte[i2];
        int iF = i2 / ns5Var.f();
        int iF2 = ns5Var.f();
        byte[] bArr3 = new byte[iF2];
        int i3 = 1;
        int i4 = 0;
        for (int i5 = 0; i5 <= iF; i5++) {
            ns5Var.b((byte) i3);
            ns5Var.b((byte) (i >> 24));
            ns5Var.b((byte) (i >> 16));
            ns5Var.b((byte) (i >> 8));
            ns5Var.b((byte) i);
            ns5Var.update(bArr, 0, bArr.length);
            ns5Var.a(bArr3, 0);
            int i6 = i5 * iF2;
            int i7 = i2 - i6;
            if (i7 > iF2) {
                i7 = iF2;
            }
            System.arraycopy(bArr3, 0, bArr2, i6, i7);
            i3++;
        }
        int i8 = i % 8;
        if (i8 != 0) {
            int i9 = 8 - i8;
            int i10 = 0;
            while (i4 != i2) {
                int i11 = bArr2[i4] & 255;
                bArr2[i4] = (byte) ((i10 << (8 - i9)) | (i11 >>> i9));
                i4++;
                i10 = i11;
            }
        }
        return bArr2;
    }
}
