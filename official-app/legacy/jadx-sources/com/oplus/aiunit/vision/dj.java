package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes6.dex */
public class dj {
    public static final String RSA = "RSA";
    public static final String RSA_TRANSFORMATION = "RSA/NONE/OAEPPadding";
    public static volatile String a = "30819f300d06092a864886f70d010101050003818d0030818902818100e98125b956467aff1be1fb03177b3acea2435d8aea6ebee323e11549cb8e1bc960eea65e07dfbcfdd3b036e9155d17331ec8b510078aec0c869777108e0e5963596fbf2bdeae17932c0ed385501c3b56539c9488dc613bff603404ba5f09a17a0ebb2d587f76f9b1b4e94ee553725f7bb40b8b27c3e819ed8aecddc1d5e510a90203010001";
    public static volatile boolean b = false;

    public static byte[] a(String str, byte[] bArr, byte[] bArr2) throws Exception {
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr2));
        Cipher cipher = Cipher.getInstance(str);
        cipher.init(1, publicKeyGeneratePublic);
        return cipher.doFinal(bArr);
    }

    public static synchronized String b(Context context) {
        if (b) {
            mb.b("AcIntercept.Rsa", "getNetRequestRsaPublicKey from memory:" + Thread.currentThread());
            return a;
        }
        String strE = ob.b(context).e();
        if (!TextUtils.isEmpty(strE)) {
            mb.b("AcIntercept.Rsa", "refresh rsa public key:" + Thread.currentThread());
            a = strE;
        }
        b = true;
        mb.b("AcIntercept.Rsa", "getNetRequestRsaPublicKey at last  " + Thread.currentThread());
        return a;
    }

    public static synchronized void c(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        mb.b("AcIntercept.Rsa", "setNetRequestRsaPublicKey success:" + Thread.currentThread());
        ob.b(context).j(str);
        b = false;
    }
}
