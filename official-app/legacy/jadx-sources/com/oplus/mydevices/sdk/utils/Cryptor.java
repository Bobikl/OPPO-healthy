package com.oplus.mydevices.sdk.utils;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import com.heytap.omas.a.b.a;
import com.oplus.aiunit.vision.f04;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.LazyThreadSafetyMode;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/oplus/mydevices/sdk/utils/Cryptor;", "", "()V", "_iv", "", "iv", "", "getIv", "()Ljava/lang/String;", "decryptData", "encrypted", "encryptionIv", "decryptText", "encryptData", "textToEncrypt", "encryptText", "string_to_encrypt", "Companion", "EncryptedContainer", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final class Cryptor {
    private static final String ANDROID_KEY_STORE = "AndroidKeyStore";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String DATA_IV_SEPARATOR = "|IV|";
    public static final int DECRYPT_CACHE_MAX_SIZE = 20;
    private static final String SAMPLE_ALIAS = "device-crypt";
    private static final String TAG = "Cryptor";
    private static final String TRANSFORMATION = "AES/GCM/NoPadding";

    @NotNull
    private static final LinkedHashMap<String, String> decryptResCacheMap;
    private static final Lazy keyStore$delegate;
    private static final Lazy secretKey$delegate;
    private byte[] _iv = new byte[0];

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0007J\u001c\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020#2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0004H\u0007J\u001e\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010&\u001a\u00020\u0013H\u0002J\b\u0010'\u001a\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R8\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\rj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u000e8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, d2 = {"Lcom/oplus/mydevices/sdk/utils/Cryptor$Companion;", "", "()V", "ANDROID_KEY_STORE", "", "DATA_IV_SEPARATOR", "DECRYPT_CACHE_MAX_SIZE", "", "getDECRYPT_CACHE_MAX_SIZE$sdk_domesticRelease$annotations", "SAMPLE_ALIAS", "TAG", "TRANSFORMATION", "decryptResCacheMap", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "getDecryptResCacheMap$sdk_domesticRelease$annotations", "getDecryptResCacheMap$sdk_domesticRelease", "()Ljava/util/LinkedHashMap;", "keyStore", "Ljava/security/KeyStore;", "getKeyStore", "()Ljava/security/KeyStore;", "keyStore$delegate", "Lkotlin/Lazy;", "secretKey", "Ljavax/crypto/SecretKey;", "getSecretKey", "()Ljavax/crypto/SecretKey;", "secretKey$delegate", "addToCache", "", "plainText", "cacheId", "decrypt", "encryptedContainer", "Lcom/oplus/mydevices/sdk/utils/Cryptor$EncryptedContainer;", f04.JSON_KEY_RKE_IS_ENCRYPT, "stringToEncrypt", "initKeyStore", "initSecretKey", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String decrypt$default(Companion companion, EncryptedContainer encryptedContainer, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return companion.decrypt(encryptedContainer, str);
        }

        public static /* synthetic */ EncryptedContainer encrypt$default(Companion companion, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            return companion.encrypt(str, str2);
        }

        @VisibleForTesting
        public static /* synthetic */ void getDECRYPT_CACHE_MAX_SIZE$sdk_domesticRelease$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getDecryptResCacheMap$sdk_domesticRelease$annotations() {
        }

        private final KeyStore getKeyStore() {
            return (KeyStore) Cryptor.keyStore$delegate.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final SecretKey getSecretKey() {
            return (SecretKey) Cryptor.secretKey$delegate.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final KeyStore initKeyStore() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            if (keyStore != null) {
                keyStore.load(null);
            }
            Intrinsics.checkNotNullExpressionValue(keyStore, "keyStore");
            return keyStore;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final SecretKey initSecretKey() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException, UnrecoverableEntryException, InvalidAlgorithmParameterException {
            if (getKeyStore().containsAlias(Cryptor.SAMPLE_ALIAS)) {
                KeyStore.Entry entry = getKeyStore().getEntry(Cryptor.SAMPLE_ALIAS, null);
                if (entry == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.KeyStore.SecretKeyEntry");
                }
                SecretKey secretKey = ((KeyStore.SecretKeyEntry) entry).getSecretKey();
                Intrinsics.checkNotNullExpressionValue(secretKey, "(keyStore.getEntry(SAMPL…SecretKeyEntry).secretKey");
                return secretKey;
            }
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            Intrinsics.checkNotNullExpressionValue(keyGenerator, "KeyGenerator.getInstance…M_AES, ANDROID_KEY_STORE)");
            keyGenerator.init(new KeyGenParameterSpec.Builder(Cryptor.SAMPLE_ALIAS, 3).setBlockModes("GCM").setEncryptionPaddings(a.k).build());
            SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
            Intrinsics.checkNotNullExpressionValue(secretKeyGenerateKey, "keyGenerator.generateKey()");
            return secretKeyGenerateKey;
        }

        @JvmStatic
        public final void addToCache(@NotNull String plainText, @NotNull String cacheId) {
            Intrinsics.checkNotNullParameter(plainText, "plainText");
            Intrinsics.checkNotNullParameter(cacheId, "cacheId");
            synchronized (getDecryptResCacheMap$sdk_domesticRelease()) {
                Cryptor.INSTANCE.getDecryptResCacheMap$sdk_domesticRelease().put(cacheId, plainText);
                Unit unit = Unit.INSTANCE;
            }
        }

        @JvmStatic
        @NotNull
        public final String decrypt(@NotNull EncryptedContainer encryptedContainer, @Nullable String cacheId) {
            Intrinsics.checkNotNullParameter(encryptedContainer, "encryptedContainer");
            if (cacheId == null || StringsKt__StringsJVMKt.isBlank(cacheId)) {
                cacheId = String.valueOf(encryptedContainer.hashCode());
            }
            String str = getDecryptResCacheMap$sdk_domesticRelease().get(cacheId);
            if (str == null) {
                synchronized (getDecryptResCacheMap$sdk_domesticRelease()) {
                    Companion companion = Cryptor.INSTANCE;
                    String strDecryptText = companion.getDecryptResCacheMap$sdk_domesticRelease().get(cacheId);
                    if (strDecryptText == null) {
                        strDecryptText = new Cryptor().decryptText(encryptedContainer.getEncryptedText(), encryptedContainer.getIv());
                        companion.getDecryptResCacheMap$sdk_domesticRelease().put(cacheId, strDecryptText);
                    }
                    str = strDecryptText;
                    Unit unit = Unit.INSTANCE;
                }
            }
            return str != null ? str : new Cryptor().decryptText(encryptedContainer.getEncryptedText(), encryptedContainer.getIv());
        }

        @JvmStatic
        @NotNull
        public final EncryptedContainer encrypt(@Nullable String stringToEncrypt, @Nullable String cacheId) {
            Cryptor cryptor = new Cryptor();
            EncryptedContainer encryptedContainer = new EncryptedContainer(cryptor.encryptText(stringToEncrypt), cryptor.getIv());
            if (!(stringToEncrypt == null || StringsKt__StringsJVMKt.isBlank(stringToEncrypt))) {
                if (cacheId == null || StringsKt__StringsJVMKt.isBlank(cacheId)) {
                    addToCache(stringToEncrypt, String.valueOf(encryptedContainer.hashCode()));
                } else {
                    addToCache(stringToEncrypt, cacheId);
                }
            }
            return encryptedContainer;
        }

        @NotNull
        public final LinkedHashMap<String, String> getDecryptResCacheMap$sdk_domesticRelease() {
            return Cryptor.decryptResCacheMap;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0006\u0010\u0011\u001a\u00020\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/oplus/mydevices/sdk/utils/Cryptor$EncryptedContainer;", "", "encryptedText", "", "iv", "(Ljava/lang/String;Ljava/lang/String;)V", "getEncryptedText", "()Ljava/lang/String;", "getIv", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "text", "toString", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
    public static final /* data */ class EncryptedContainer {

        @NotNull
        private final String encryptedText;

        @NotNull
        private final String iv;

        public EncryptedContainer(@NotNull String encryptedText, @NotNull String iv) {
            Intrinsics.checkNotNullParameter(encryptedText, "encryptedText");
            Intrinsics.checkNotNullParameter(iv, "iv");
            this.encryptedText = encryptedText;
            this.iv = iv;
        }

        public static /* synthetic */ EncryptedContainer copy$default(EncryptedContainer encryptedContainer, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = encryptedContainer.encryptedText;
            }
            if ((i & 2) != 0) {
                str2 = encryptedContainer.iv;
            }
            return encryptedContainer.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getEncryptedText() {
            return this.encryptedText;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getIv() {
            return this.iv;
        }

        @NotNull
        public final EncryptedContainer copy(@NotNull String encryptedText, @NotNull String iv) {
            Intrinsics.checkNotNullParameter(encryptedText, "encryptedText");
            Intrinsics.checkNotNullParameter(iv, "iv");
            return new EncryptedContainer(encryptedText, iv);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EncryptedContainer)) {
                return false;
            }
            EncryptedContainer encryptedContainer = (EncryptedContainer) other;
            return Intrinsics.areEqual(this.encryptedText, encryptedContainer.encryptedText) && Intrinsics.areEqual(this.iv, encryptedContainer.iv);
        }

        @NotNull
        public final String getEncryptedText() {
            return this.encryptedText;
        }

        @NotNull
        public final String getIv() {
            return this.iv;
        }

        public int hashCode() {
            String str = this.encryptedText;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.iv;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public final String text() {
            return this.encryptedText + Cryptor.DATA_IV_SEPARATOR + this.iv;
        }

        @NotNull
        public String toString() {
            return "EncryptedContainer(encryptedText=" + this.encryptedText + ", iv=" + this.iv + ")";
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        keyStore$delegate = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<KeyStore>() { // from class: com.oplus.mydevices.sdk.utils.Cryptor$Companion$keyStore$2
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final KeyStore invoke() {
                return Cryptor.INSTANCE.initKeyStore();
            }
        });
        secretKey$delegate = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SecretKey>() { // from class: com.oplus.mydevices.sdk.utils.Cryptor$Companion$secretKey$2
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final SecretKey invoke() {
                return Cryptor.INSTANCE.initSecretKey();
            }
        });
        decryptResCacheMap = new LinkedHashMap<String, String>() { // from class: com.oplus.mydevices.sdk.utils.Cryptor$Companion$decryptResCacheMap$1
            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (obj instanceof String) {
                    return containsKey((String) obj);
                }
                return false;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (obj instanceof String) {
                    return containsValue((String) obj);
                }
                return false;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<String, String>> entrySet() {
                return getEntries();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Object get(Object obj) {
                if (obj instanceof String) {
                    return get((String) obj);
                }
                return null;
            }

            public /* bridge */ Set getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set getKeys() {
                return super.keySet();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
                return obj instanceof String ? getOrDefault((String) obj, (String) obj2) : obj2;
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<String> keySet() {
                return getKeys();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Object remove(Object obj) {
                if (obj instanceof String) {
                    return remove((String) obj);
                }
                return null;
            }

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(@Nullable Map.Entry<String, String> eldest) {
                return size() > 20;
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<String> values() {
                return getValues();
            }

            public /* bridge */ boolean containsKey(String str) {
                return super.containsKey((Object) str);
            }

            public /* bridge */ boolean containsValue(String str) {
                return super.containsValue((Object) str);
            }

            public /* bridge */ String get(String str) {
                return (String) super.get((Object) str);
            }

            public /* bridge */ String getOrDefault(String str, String str2) {
                return (String) super.getOrDefault((Object) str, str2);
            }

            public /* bridge */ String remove(String str) {
                return (String) super.remove((Object) str);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if ((obj instanceof String) && (obj2 instanceof String)) {
                    return remove((String) obj, (String) obj2);
                }
                return false;
            }

            public /* bridge */ boolean remove(String str, String str2) {
                return super.remove((Object) str, (Object) str2);
            }
        };
    }

    @JvmStatic
    public static final void addToCache(@NotNull String str, @NotNull String str2) {
        INSTANCE.addToCache(str, str2);
    }

    @JvmStatic
    @NotNull
    public static final String decrypt(@NotNull EncryptedContainer encryptedContainer, @Nullable String str) {
        return INSTANCE.decrypt(encryptedContainer, str);
    }

    private final String decryptData(String encrypted, byte[] encryptionIv) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, KeyStoreException, NoSuchProviderException, InvalidAlgorithmParameterException, UnrecoverableEntryException {
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(2, INSTANCE.getSecretKey(), new GCMParameterSpec(128, encryptionIv));
        byte[] bArrDoFinal = cipher.doFinal(Base64.decode(encrypted, 0));
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "cipher.doFinal(encryptedData)");
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(charset, "StandardCharsets.UTF_8");
        return new String(bArrDoFinal, charset);
    }

    @JvmStatic
    @NotNull
    public static final EncryptedContainer encrypt(@Nullable String str, @Nullable String str2) {
        return INSTANCE.encrypt(str, str2);
    }

    private final byte[] encryptData(String textToEncrypt) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, KeyStoreException, NoSuchProviderException, InvalidAlgorithmParameterException, UnrecoverableEntryException {
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(1, INSTANCE.getSecretKey());
        Intrinsics.checkNotNullExpressionValue(cipher, "cipher");
        byte[] iv = cipher.getIV();
        Intrinsics.checkNotNullExpressionValue(iv, "cipher.iv");
        this._iv = iv;
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(charset, "StandardCharsets.UTF_8");
        if (textToEncrypt == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = textToEncrypt.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        byte[] bArrDoFinal = cipher.doFinal(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "cipher.doFinal(textToEnc…(StandardCharsets.UTF_8))");
        return bArrDoFinal;
    }

    @NotNull
    public final String decryptText(@NotNull String encrypted, @Nullable String iv) {
        Intrinsics.checkNotNullParameter(encrypted, "encrypted");
        LogUtils.INSTANCE.d(TAG, "decrypt text");
        try {
            byte[] bArrDecode = Base64.decode(iv, 0);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "Base64.decode(iv, Base64.DEFAULT)");
            return decryptData(encrypted, bArrDecode);
        } catch (InvalidAlgorithmParameterException e2) {
            LogUtils.INSTANCE.e(TAG, "decryptText error! InvalidAlgorithmParameterException", e2);
            return "";
        } catch (InvalidKeyException e3) {
            LogUtils.INSTANCE.e(TAG, "decryptText error! InvalidKeyException", e3);
            return "";
        } catch (KeyStoreException e4) {
            LogUtils.INSTANCE.e(TAG, "decryptText error! KeyStoreException", e4);
            return "";
        } catch (NoSuchAlgorithmException e5) {
            LogUtils.INSTANCE.e(TAG, "decryptText error! NoSuchAlgorithmException", e5);
            return "";
        } catch (NoSuchProviderException e6) {
            LogUtils.INSTANCE.e(TAG, "decryptText error! NoSuchProviderException", e6);
            return "";
        } catch (UnrecoverableEntryException e7) {
            LogUtils.INSTANCE.e(TAG, "decryptText error! UnrecoverableEntryException", e7);
            return "";
        } catch (BadPaddingException e8) {
            LogUtils.INSTANCE.e(TAG, "decryptText error! BadPaddingException", e8);
            return "";
        } catch (IllegalBlockSizeException e9) {
            LogUtils.INSTANCE.e(TAG, "decryptText error! IllegalBlockSizeException", e9);
            return "";
        } catch (NoSuchPaddingException e10) {
            LogUtils.INSTANCE.e(TAG, "decryptText error! NoSuchPaddingException", e10);
            return "";
        } catch (Exception e11) {
            LogUtils.INSTANCE.e(TAG, "other error!", e11);
            return "";
        }
    }

    @NotNull
    public final String encryptText(@Nullable String string_to_encrypt) {
        if (string_to_encrypt == null || StringsKt__StringsJVMKt.isBlank(string_to_encrypt)) {
            return "";
        }
        try {
            String strEncodeToString = Base64.encodeToString(encryptData(string_to_encrypt), 0);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "Base64.encodeToString(en…ptedText, Base64.DEFAULT)");
            return strEncodeToString;
        } catch (InvalidAlgorithmParameterException e2) {
            LogUtils.INSTANCE.e(TAG, "encryptText error! InvalidAlgorithmParameterException", e2);
            return "";
        } catch (InvalidKeyException e3) {
            LogUtils.INSTANCE.e(TAG, "encryptText error! InvalidKeyException", e3);
            return "";
        } catch (KeyStoreException e4) {
            LogUtils.INSTANCE.e(TAG, "encryptText error! KeyStoreException", e4);
            return "";
        } catch (NoSuchAlgorithmException e5) {
            LogUtils.INSTANCE.e(TAG, "encryptText error! NoSuchAlgorithmException", e5);
            return "";
        } catch (NoSuchProviderException e6) {
            LogUtils.INSTANCE.e(TAG, "encryptText error! NoSuchProviderException", e6);
            return "";
        } catch (UnrecoverableEntryException e7) {
            LogUtils.INSTANCE.e(TAG, "encryptText error! UnrecoverableEntryException", e7);
            return "";
        } catch (BadPaddingException e8) {
            LogUtils.INSTANCE.e(TAG, "encryptText error! BadPaddingException", e8);
            return "";
        } catch (IllegalBlockSizeException e9) {
            LogUtils.INSTANCE.e(TAG, "encryptText error! IllegalBlockSizeException", e9);
            return "";
        } catch (NoSuchPaddingException e10) {
            LogUtils.INSTANCE.e(TAG, "encryptText error! NoSuchPaddingException", e10);
            return "";
        } catch (Exception e11) {
            LogUtils.INSTANCE.e(TAG, "other error! ", e11);
            return "";
        }
    }

    @NotNull
    public final String getIv() {
        String strEncodeToString = Base64.encodeToString(this._iv, 0);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "Base64.encodeToString(_iv, Base64.DEFAULT)");
        return strEncodeToString;
    }
}
