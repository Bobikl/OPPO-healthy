package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.heytap.health.base.encrypt.AesGcmAndroidKeyStore;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes10.dex */
public class ncm {
    public KeyStore a;
    public SharedPreferences b;

    public ncm(Context context) {
        try {
            this.b = context.getSharedPreferences("KEYSTORE_SETTING", 0);
            KeyStore keyStore = KeyStore.getInstance(AesGcmAndroidKeyStore.KEY_STORE_MODULE);
            this.a = keyStore;
            keyStore.load(null);
            if (this.a.containsAlias("KEYSTORE_AES")) {
                return;
            }
            g("");
            c(context);
            b();
        } catch (Exception e2) {
            q8g.e("KEYSTORE", "Exception", e2);
        }
    }

    public String a(String str) {
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, f(), new IvParameterSpec(e()));
            return Base64.encodeToString(cipher.doFinal(str.getBytes()), 0);
        } catch (Exception e2) {
            q8g.g("KEYSTORE", "Exception", e2);
            return "";
        }
    }

    public final void b() throws Exception {
        byte[] bArr = new byte[16];
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextBytes(bArr);
        g(Base64.encodeToString(secureRandom.generateSeed(12), 0));
        PublicKey publicKey = this.a.getCertificate("KEYSTORE_AES").getPublicKey();
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, publicKey);
        h(Base64.encodeToString(cipher.doFinal(bArr), 0));
    }

    public final void c(Context context) throws Exception {
        q8g.d("KEYSTORE", "Build.VERSION.SDK_INT=" + Build.VERSION.SDK_INT);
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", AesGcmAndroidKeyStore.KEY_STORE_MODULE);
        keyPairGenerator.initialize(new KeyGenParameterSpec.Builder("KEYSTORE_AES", 3).setDigests(MessageDigestAlgorithms.SHA_256, MessageDigestAlgorithms.SHA_512).setEncryptionPaddings("PKCS1Padding").build());
        keyPairGenerator.generateKeyPair();
    }

    public String d(String str) {
        try {
            byte[] bArrDecode = Base64.decode(str.getBytes(), 0);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, f(), new IvParameterSpec(e()));
            return new String(cipher.doFinal(bArrDecode));
        } catch (Exception e2) {
            q8g.g("KEYSTORE", "Exception", e2);
            return "";
        }
    }

    public final byte[] e() {
        return Base64.decode(this.b.getString("PREF_KEY_IV", ""), 0);
    }

    public final SecretKeySpec f() throws Exception {
        String string = this.b.getString("PREF_KEY_AES", "");
        PrivateKey privateKey = (PrivateKey) this.a.getKey("KEYSTORE_AES", null);
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(2, privateKey);
        return new SecretKeySpec(cipher.doFinal(Base64.decode(string, 0)), "AES/GCM/NoPadding");
    }

    public final void g(String str) {
        this.b.edit().putString("PREF_KEY_IV", str).apply();
    }

    public final void h(String str) {
        this.b.edit().putString("PREF_KEY_AES", str).apply();
    }
}
