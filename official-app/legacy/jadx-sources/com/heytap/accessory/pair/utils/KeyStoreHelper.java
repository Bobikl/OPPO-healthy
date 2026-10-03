package com.heytap.accessory.pair.utils;

import android.security.keystore.KeyProtection;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.accessory.pair.logging.PairLog;
import com.heytap.accessory.pair.logging.SensitiveLogUtils;
import com.heytap.omas.a.b.a;
import com.oplus.aiunit.vision.wil;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes14.dex */
public class KeyStoreHelper {
    private static final String KEY_FORMAT_RAW = "RAW";
    private static final String KEY_STORE_TYPE = "AndroidKeyStore";
    private static final String TAG = "KeyStoreHelper";
    private static volatile KeyStoreHelper sInstance;
    private static KeyStore sKeyStore;

    public static class MasterSecretKey implements SecretKey {
        String mAlgorithm;
        byte[] mToEncode;

        public MasterSecretKey(byte[] bArr, String str) {
            this.mToEncode = bArr;
            this.mAlgorithm = str;
        }

        @Override // java.security.Key
        public String getAlgorithm() {
            return this.mAlgorithm;
        }

        @Override // java.security.Key
        public byte[] getEncoded() {
            return this.mToEncode;
        }

        @Override // java.security.Key
        public String getFormat() {
            return KeyStoreHelper.KEY_FORMAT_RAW;
        }
    }

    private KeyStoreHelper() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        sKeyStore = keyStore;
        keyStore.load(null);
    }

    public static KeyStoreHelper getInstance() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        if (sInstance == null) {
            synchronized (KeyStoreHelper.class) {
                if (sInstance == null) {
                    sInstance = new KeyStoreHelper();
                }
            }
        }
        return sInstance;
    }

    public SecretKey getAESKeyForce(String str) {
        SecretKey key = getKey(str);
        if (key == null) {
            synchronized (KeyStoreHelper.class) {
                SecretKey key2 = getKey(str);
                if (key2 == null) {
                    try {
                        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
                        keyGenerator.init(256);
                        key2 = keyGenerator.generateKey();
                        PairLog.i(TAG, "generateKey alias: " + str + ", secret: " + SensitiveLogUtils.toMd5IfNeed(key2.getEncoded(), 4));
                        sKeyStore.setEntry(str, new KeyStore.SecretKeyEntry(key2), new KeyProtection.Builder(3).setBlockModes("CBC").setEncryptionPaddings(a.k).build());
                    } catch (Exception e2) {
                        wil.b(TAG, "getAESKeyForce: ex " + e2);
                    }
                }
                key = key2;
            }
        }
        return key;
    }

    @Nullable
    public SecretKey getKey(String str) {
        try {
            return (SecretKey) sKeyStore.getKey(str, null);
        } catch (Exception e2) {
            wil.b(TAG, "getKey: ex " + e2);
            return null;
        }
    }

    public Mac getMac() throws SecurityException {
        try {
            return Mac.getInstance("HmacSHA512");
        } catch (Exception e2) {
            throw new SecurityException(e2);
        }
    }

    public byte[] hmac(@NonNull SecretKey secretKey, byte[] bArr, int i) throws SecurityException {
        Mac mac = getMac();
        try {
            mac.init(secretKey);
            return hmac(mac, bArr, i);
        } catch (InvalidKeyException e2) {
            throw new SecurityException(e2);
        }
    }

    public void setAESEntry(String str, byte[] bArr) throws KeyStoreException {
        sKeyStore.setEntry(str, new KeyStore.SecretKeyEntry(new MasterSecretKey(bArr, SecurityUtils.AES_CBC_NOPADDING)), new KeyProtection.Builder(2).build());
    }

    public void setHmacEntry(String str, byte[] bArr) throws KeyStoreException {
        sKeyStore.setEntry(str, new KeyStore.SecretKeyEntry(new MasterSecretKey(bArr, "HmacSHA512")), new KeyProtection.Builder(4).build());
    }

    public byte[] hmac(Mac mac, byte[] bArr, int i) {
        byte[] bArrDoFinal = mac.doFinal(bArr);
        byte[] bArr2 = new byte[i];
        SystemUtils.arraycopy(bArrDoFinal, 0, bArr2, 0, i);
        return bArr2;
    }
}
