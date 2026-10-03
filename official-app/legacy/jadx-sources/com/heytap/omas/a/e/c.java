package com.heytap.omas.a.e;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class c {
    public static final String a = "ArraySplicing";

    public static byte[] a(byte[]... bArr) {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    public static String[] a(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(str);
        }
        return (String[]) arrayList.toArray();
    }
}
