package com.oplus.aiunit.vision;

import android.util.Log;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: loaded from: classes8.dex */
public class urm {
    public static final String a = "urm";

    public static PublicKey a(byte[] bArr, String str) {
        try {
            return KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArr));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e2) {
            e2.printStackTrace();
            Log.e(a, String.format("convertPublicKey get exception %s" + e2.getMessage(), new Object[0]));
            return null;
        }
    }
}
