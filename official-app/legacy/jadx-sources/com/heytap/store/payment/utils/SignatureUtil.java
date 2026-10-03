package com.heytap.store.payment.utils;

import com.heytap.store.base.core.util.encryption.Base64;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;

/* JADX INFO: loaded from: classes5.dex */
public class SignatureUtil {
    private static final String CHARSETTING = "UTF-8";
    private static final String SIGN_ALGORITHMS = "SHA1WithRSA";
    private static final String SIGN_TYPE_RSA = "RSA";

    public static String sign(String str, String str2) throws Exception {
        PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str2)));
        Signature signature = Signature.getInstance("SHA1WithRSA");
        signature.initSign(privateKeyGeneratePrivate);
        signature.update(str.getBytes());
        return Base64.encode(signature.sign());
    }
}
