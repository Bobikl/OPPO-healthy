package com.heytap.msp.push.encrypt;

import com.oplus.aiunit.vision.e7;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes19.dex */
public class a {
    public static final String SDK_APP_SECRET = "isvrbeT7qUywVEZ1Ia0/aUVA/TcFaeV0wC8qFLc8rg4=";

    public static String a(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        String[] strArrSplit = str2.split("%IV1%");
        byte[] bArrL = b.l(strArrSplit[0]);
        byte[] bArrL2 = b.l(strArrSplit[1]);
        SecretKeySpec secretKeySpec = new SecretKeySpec(b.l(str), "AES");
        Cipher cipher = Cipher.getInstance(e7.AES_TRANSFORMATION);
        cipher.init(2, secretKeySpec, new IvParameterSpec(bArrL2));
        return new String(cipher.doFinal(bArrL));
    }
}
