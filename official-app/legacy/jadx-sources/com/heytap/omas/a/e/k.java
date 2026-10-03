package com.heytap.omas.a.e;

import android.util.Base64;
import java.security.SecureRandom;
import java.util.UUID;

/* JADX INFO: loaded from: classes19.dex */
public class k {
    public static final String a = "SecRandomUtils";

    public static String a() {
        return UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
    }

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        new SecureRandom().nextBytes(bArr);
        Base64.encodeToString(bArr, 2);
        return bArr;
    }
}
