package com.heytap.accessory.security;

import android.security.keystore.KeyProtection;
import androidx.annotation.Nullable;
import com.heytap.accessory.logging.SensitiveLogUtils;
import com.heytap.health.base.encrypt.AesGcmAndroidKeyStore;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes14.dex */
public class h {
    public static final String a = "h";
    public static volatile h b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static KeyStore f2670c;

    public static class a implements SecretKey {
        public byte[] a;
        public String b;

        public a(byte[] bArr, String str) {
            this.a = bArr;
            this.b = str;
        }

        @Override // java.security.Key
        public String getAlgorithm() {
            return this.b;
        }

        @Override // java.security.Key
        public byte[] getEncoded() {
            return this.a;
        }

        @Override // java.security.Key
        public String getFormat() {
            return "RAW";
        }
    }

    public h() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance(AesGcmAndroidKeyStore.KEY_STORE_MODULE);
        f2670c = keyStore;
        keyStore.load(null);
    }

    public static h a() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        if (b == null) {
            synchronized (h.class) {
                if (b == null) {
                    b = new h();
                }
            }
        }
        return b;
    }

    @Nullable
    public SecretKey b(String str) {
        try {
            return (SecretKey) f2670c.getKey(str, null);
        } catch (Exception e2) {
            com.heytap.accessory.base.logging.a.b(a, "getKey error," + e2);
            return null;
        }
    }

    public SecretKey a(String str) {
        SecretKey secretKeyB = b(str);
        if (secretKeyB == null) {
            synchronized (h.class) {
                SecretKey secretKeyB2 = b(str);
                if (secretKeyB2 == null) {
                    try {
                        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
                        keyGenerator.init(256);
                        secretKeyB2 = keyGenerator.generateKey();
                        com.heytap.accessory.base.logging.a.c(a, "generateKey alias: " + str + ", secret: " + SensitiveLogUtils.toMd5IfNeed(secretKeyB2.getEncoded(), 4));
                        f2670c.setEntry(str, new KeyStore.SecretKeyEntry(secretKeyB2), new KeyProtection.Builder(3).setBlockModes("CBC").setEncryptionPaddings(com.heytap.omas.a.b.a.k).build());
                    } catch (Exception e2) {
                        com.heytap.accessory.base.logging.a.e(a, "getAESKeyForce error," + e2);
                    }
                }
                secretKeyB = secretKeyB2;
            }
        }
        return secretKeyB;
    }
}
