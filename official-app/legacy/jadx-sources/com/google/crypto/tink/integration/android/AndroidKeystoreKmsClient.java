package com.google.crypto.tink.integration.android;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.KmsClient;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import com.heytap.health.base.encrypt.AesGcmAndroidKeyStore;
import com.heytap.omas.a.b.a;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes14.dex */
public final class AndroidKeystoreKmsClient implements KmsClient {
    public static final String PREFIX = "android-keystore://";
    private static final String TAG = "AndroidKeystoreKmsClient";
    private static final int WAIT_TIME_MILLISECONDS_BEFORE_RETRY = 20;

    @GuardedBy("this")
    private KeyStore keyStore;
    private final String keyUri;

    public static final class Builder {
        KeyStore keyStore;
        String keyUri = null;

        public Builder() {
            this.keyStore = null;
            if (!AndroidKeystoreKmsClient.isAtLeastM()) {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
            try {
                KeyStore keyStore = KeyStore.getInstance(AesGcmAndroidKeyStore.KEY_STORE_MODULE);
                this.keyStore = keyStore;
                keyStore.load(null);
            } catch (IOException | GeneralSecurityException e2) {
                throw new IllegalStateException(e2);
            }
        }

        public AndroidKeystoreKmsClient build() {
            return new AndroidKeystoreKmsClient(this);
        }

        public Builder setKeyStore(KeyStore keyStore) {
            if (keyStore == null) {
                throw new IllegalArgumentException("val cannot be null");
            }
            this.keyStore = keyStore;
            return this;
        }

        public Builder setKeyUri(String str) {
            if (str == null || !str.toLowerCase(Locale.US).startsWith(AndroidKeystoreKmsClient.PREFIX)) {
                throw new IllegalArgumentException("val must start with android-keystore://");
            }
            this.keyUri = str;
            return this;
        }
    }

    public static void generateNewAeadKey(String str) throws GeneralSecurityException {
        if (new AndroidKeystoreKmsClient().hasKey(str)) {
            throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", str));
        }
        String strValidateKmsKeyUriAndRemovePrefix = Validators.validateKmsKeyUriAndRemovePrefix(PREFIX, str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", AesGcmAndroidKeyStore.KEY_STORE_MODULE);
        keyGenerator.init(new KeyGenParameterSpec.Builder(strValidateKmsKeyUriAndRemovePrefix, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings(a.k).build());
        keyGenerator.generateKey();
    }

    public static Aead getOrGenerateNewAeadKey(String str) throws GeneralSecurityException, IOException {
        AndroidKeystoreKmsClient androidKeystoreKmsClient = new AndroidKeystoreKmsClient();
        if (!androidKeystoreKmsClient.hasKey(str)) {
            Log.w(TAG, String.format("key URI %s doesn't exist, generating a new one", str));
            generateNewAeadKey(str);
        }
        return androidKeystoreKmsClient.getAead(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isAtLeastM() {
        return true;
    }

    private static Aead validateAead(Aead aead) throws GeneralSecurityException {
        byte[] bArrRandBytes = Random.randBytes(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(bArrRandBytes, aead.decrypt(aead.encrypt(bArrRandBytes, bArr), bArr))) {
            return aead;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    public synchronized void deleteKey(String str) throws GeneralSecurityException {
        this.keyStore.deleteEntry(Validators.validateKmsKeyUriAndRemovePrefix(PREFIX, str));
    }

    @Override // com.google.crypto.tink.KmsClient
    public synchronized boolean doesSupport(String str) {
        String str2 = this.keyUri;
        if (str2 == null || !str2.equals(str)) {
            return this.keyUri == null && str.toLowerCase(Locale.US).startsWith(PREFIX);
        }
        return true;
    }

    @Override // com.google.crypto.tink.KmsClient
    public synchronized Aead getAead(String str) throws GeneralSecurityException {
        String str2 = this.keyUri;
        if (str2 != null && !str2.equals(str)) {
            throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.keyUri, str));
        }
        return validateAead(new AndroidKeystoreAesGcm(Validators.validateKmsKeyUriAndRemovePrefix(PREFIX, str), this.keyStore));
    }

    public synchronized boolean hasKey(String str) throws GeneralSecurityException {
        String strValidateKmsKeyUriAndRemovePrefix;
        strValidateKmsKeyUriAndRemovePrefix = Validators.validateKmsKeyUriAndRemovePrefix(PREFIX, str);
        try {
        } catch (NullPointerException unused) {
            Log.w(TAG, "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again.");
            try {
                Thread.sleep(20L);
                KeyStore keyStore = KeyStore.getInstance(AesGcmAndroidKeyStore.KEY_STORE_MODULE);
                this.keyStore = keyStore;
                keyStore.load(null);
            } catch (IOException e2) {
                throw new GeneralSecurityException(e2);
            } catch (InterruptedException unused2) {
            }
            return this.keyStore.containsAlias(strValidateKmsKeyUriAndRemovePrefix);
        }
        return this.keyStore.containsAlias(strValidateKmsKeyUriAndRemovePrefix);
    }

    @Override // com.google.crypto.tink.KmsClient
    public KmsClient withCredentials(String str) throws GeneralSecurityException {
        return new AndroidKeystoreKmsClient();
    }

    @Override // com.google.crypto.tink.KmsClient
    public KmsClient withDefaultCredentials() throws GeneralSecurityException {
        return new AndroidKeystoreKmsClient();
    }

    public AndroidKeystoreKmsClient() throws GeneralSecurityException {
        this(new Builder());
    }

    @Deprecated
    public AndroidKeystoreKmsClient(String str) {
        this(new Builder().setKeyUri(str));
    }

    private AndroidKeystoreKmsClient(Builder builder) {
        this.keyUri = builder.keyUri;
        this.keyStore = builder.keyStore;
    }
}
