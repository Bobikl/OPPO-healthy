package com.heytap.health.base.encrypt;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.omas.a.b.a;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.dx4;
import com.oplus.aiunit.vision.gxe;
import com.oplus.aiunit.vision.ooa;
import com.oplus.aiunit.vision.vbb;
import com.tencent.mmkv.MMKV;
import io.protostuff.MapSchema;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b$\u0010%J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\"\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u000e\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\fJ\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\fH\u0002J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0002J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0002J\u001a\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\"¨\u0006'"}, d2 = {"Lcom/heytap/health/base/encrypt/AesGcmAndroidKeyStore;", "", "", "keyAlias", "ssoid", "", "i", "aliasKey", "contentToEncrypt", "c", "b", "alias", "", LogFieldKey.LEVEL_KEY, MapSchema.FIELD_NAME_KEY, "n", "Ljavax/crypto/SecretKey;", "d", "j", "message", LogFieldKey.MESSAGE_KEY, "spKey", "f", MapSchema.FIELD_NAME_ENTRY, b2n.g, "Ljava/security/KeyStore;", "a", "Ljava/security/KeyStore;", "mStore", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "pCache", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "Landroidx/datastore/core/DataStore;", "dataStore", "<init>", "()V", "Companion", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class AesGcmAndroidKeyStore {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String DATA_STORE_DATABASE_PLATFORM = "dataStore_databasePlatform";

    @NotNull
    public static final String KEY_STORE_MODULE = "AndroidKeyStore";

    @Nullable
    public static volatile MMKV d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public volatile KeyStore mStore;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public volatile ConcurrentHashMap<String, String> pCache;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public volatile DataStore<Preferences> dataStore;

    /* JADX INFO: renamed from: com.heytap.health.base.encrypt.AesGcmAndroidKeyStore$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/base/encrypt/AesGcmAndroidKeyStore$a;", "", "Lcom/heytap/health/base/encrypt/AesGcmAndroidKeyStore;", "a", "", "ANDROID_KEY_STORE", "Ljava/lang/String;", "DATA_STORE_DATABASE_PLATFORM", "IV_KEY_NAME", "KEY_STORE_MODULE", "TAG", "TRANSFORMATION", "Lcom/tencent/mmkv/MMKV;", "keyStoreSp", "Lcom/tencent/mmkv/MMKV;", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: com.heytap.health.base.encrypt.AesGcmAndroidKeyStore$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/heytap/health/base/encrypt/AesGcmAndroidKeyStore$a$a;", "", "Lcom/heytap/health/base/encrypt/AesGcmAndroidKeyStore;", "a", "Lcom/heytap/health/base/encrypt/AesGcmAndroidKeyStore;", "()Lcom/heytap/health/base/encrypt/AesGcmAndroidKeyStore;", "instance", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
        public static final class C0287a {

            @NotNull
            public static final C0287a INSTANCE = new C0287a();

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public static final AesGcmAndroidKeyStore instance = new AesGcmAndroidKeyStore(null);

            @NotNull
            public final AesGcmAndroidKeyStore a() {
                return instance;
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final AesGcmAndroidKeyStore a() {
            return C0287a.INSTANCE.a();
        }
    }

    public /* synthetic */ AesGcmAndroidKeyStore(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public static final AesGcmAndroidKeyStore g() {
        return INSTANCE.a();
    }

    @Nullable
    public final synchronized String b(@NotNull String aliasKey, @Nullable String ssoid) {
        Intrinsics.checkNotNullParameter(aliasKey, "aliasKey");
        String strH = h(aliasKey, ssoid);
        ConcurrentHashMap<String, String> concurrentHashMap = this.pCache;
        Intrinsics.checkNotNull(concurrentHashMap);
        String str = concurrentHashMap.get(strH);
        if (!(str == null || str.length() == 0)) {
            a7b.f("AesGcmAndroidKeyStore", "from cache");
            return str;
        }
        try {
            KeyStore keyStore = this.mStore;
            Intrinsics.checkNotNull(keyStore);
            keyStore.load(null);
            KeyStore keyStore2 = this.mStore;
            Intrinsics.checkNotNull(keyStore2);
            SecretKey secretKey = (SecretKey) keyStore2.getKey(strH, null);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            if (secretKey == null) {
                a7b.f("AesGcmAndroidKeyStore", "deCryptData key is null");
                StringBuilder sb = new StringBuilder();
                sb.append("deCryptData() key is null, alias:");
                sb.append(strH);
                return null;
            }
            String strF = f(strH);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("de encrypted iv:");
            sb2.append(strF);
            sb2.append(", alias:");
            sb2.append(strH);
            String strE = e(strH);
            a7b.f("AesGcmAndroidKeyStore", "de encrypted data:" + strE);
            if (!(strF == null || strF.length() == 0)) {
                if (!(strE == null || strE.length() == 0)) {
                    cipher.init(2, secretKey, new GCMParameterSpec(128, Base64.decode(strF, 2)));
                    byte[] decrypted = cipher.doFinal(Base64.decode(strE, 2));
                    Intrinsics.checkNotNullExpressionValue(decrypted, "decrypted");
                    String str2 = new String(decrypted, Charsets.UTF_8);
                    ConcurrentHashMap<String, String> concurrentHashMap2 = this.pCache;
                    Intrinsics.checkNotNull(concurrentHashMap2);
                    concurrentHashMap2.put(strH, str2);
                    a7b.f("AesGcmAndroidKeyStore", "deCryptData end");
                    return str2;
                }
            }
            a7b.f("AesGcmAndroidKeyStore", "deCryptData data is null");
            m("data_platform decrypt iv or data is null", aliasKey);
            return null;
        } catch (Exception e2) {
            a7b.b("AesGcmAndroidKeyStore", "deCryptData e:" + e2);
            m("data_platform decrypt fail e:" + e2, aliasKey);
            return null;
        }
    }

    @Nullable
    public final synchronized String c(@NotNull String aliasKey, @NotNull String contentToEncrypt, @Nullable String ssoid) {
        String strEncodeToString;
        Intrinsics.checkNotNullParameter(aliasKey, "aliasKey");
        Intrinsics.checkNotNullParameter(contentToEncrypt, "contentToEncrypt");
        String strH = h(aliasKey, ssoid);
        try {
            KeyStore keyStore = this.mStore;
            Intrinsics.checkNotNull(keyStore);
            keyStore.load(null);
            KeyStore keyStore2 = this.mStore;
            Intrinsics.checkNotNull(keyStore2);
            SecretKey secretKeyD = (SecretKey) keyStore2.getKey(strH, null);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            if (secretKeyD == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("key is null generate new key encrypt, alias:");
                sb.append(strH);
                secretKeyD = d(strH);
            }
            cipher.init(1, secretKeyD);
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = contentToEncrypt.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            byte[] bArrDoFinal = cipher.doFinal(bytes);
            a7b.f("AesGcmAndroidKeyStore", "enCryptData saved to keystore");
            byte[] iv = cipher.getIV();
            strEncodeToString = Base64.encodeToString(bArrDoFinal, 2);
            String strEncodeToString2 = Base64.encodeToString(iv, 2);
            if (this.dataStore != null) {
                BuildersKt__BuildersKt.runBlocking$default(null, new AesGcmAndroidKeyStore$enCryptData$1(this, strH, strEncodeToString, strEncodeToString2, null), 1, null);
            }
            MMKV mmkv = d;
            Intrinsics.checkNotNull(mmkv);
            mmkv.putString(strH, strEncodeToString);
            MMKV mmkv2 = d;
            Intrinsics.checkNotNull(mmkv2);
            mmkv2.putString(strH + "IV", strEncodeToString2);
            ConcurrentHashMap<String, String> concurrentHashMap = this.pCache;
            Intrinsics.checkNotNull(concurrentHashMap);
            concurrentHashMap.put(strH, contentToEncrypt);
            a7b.f("AesGcmAndroidKeyStore", "enCryptData end");
        } catch (Exception e2) {
            a7b.b("AesGcmAndroidKeyStore", "enCryptData e:" + e2);
            m("data_platform encrypt fail e:" + e2, aliasKey);
            return null;
        }
        return strEncodeToString;
    }

    public final SecretKey d(String keyAlias) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", KEY_STORE_MODULE);
        KeyGenParameterSpec.Builder invalidatedByBiometricEnrollment = new KeyGenParameterSpec.Builder(keyAlias, 3).setBlockModes("GCM").setEncryptionPaddings(a.k).setIsStrongBoxBacked(false).setUserAuthenticationRequired(false).setInvalidatedByBiometricEnrollment(false);
        Intrinsics.checkNotNullExpressionValue(invalidatedByBiometricEnrollment, "Builder(keyAlias, purpos…iometricEnrollment(false)");
        keyGenerator.init(invalidatedByBiometricEnrollment.build());
        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
        Intrinsics.checkNotNullExpressionValue(secretKeyGenerateKey, "generator.generateKey()");
        return secretKeyGenerateKey;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final String e(String spKey) throws InterruptedException {
        if (this.dataStore == null) {
            MMKV mmkv = d;
            Intrinsics.checkNotNull(mmkv);
            return mmkv.getString(spKey, "");
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        BuildersKt__BuildersKt.runBlocking$default(null, new AesGcmAndroidKeyStore$getData$1(this, objectRef, spKey, null), 1, null);
        CharSequence charSequence = (CharSequence) objectRef.element;
        if (charSequence == null || charSequence.length() == 0) {
            a7b.f("AesGcmAndroidKeyStore", "esp get data empty");
            MMKV mmkv2 = d;
            Intrinsics.checkNotNull(mmkv2);
            ?? string = mmkv2.getString(spKey, "");
            objectRef.element = string;
            if (string != 0) {
            }
        }
        return (String) objectRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final String f(String spKey) throws InterruptedException {
        if (this.dataStore == null) {
            MMKV mmkv = d;
            Intrinsics.checkNotNull(mmkv);
            return mmkv.getString(spKey + "IV", "");
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        BuildersKt__BuildersKt.runBlocking$default(null, new AesGcmAndroidKeyStore$getIV$1(this, objectRef, spKey, null), 1, null);
        CharSequence charSequence = (CharSequence) objectRef.element;
        if (charSequence == null || charSequence.length() == 0) {
            a7b.f("AesGcmAndroidKeyStore", "esp get iv empty");
            MMKV mmkv2 = d;
            Intrinsics.checkNotNull(mmkv2);
            ?? string = mmkv2.getString(spKey + "IV", "");
            objectRef.element = string;
            if (string != 0) {
            }
        }
        return (String) objectRef.element;
    }

    public final String h(String aliasKey, String ssoid) {
        String[] ONLY_ONE_SECRET_FOR_APP = ooa.ONLY_ONE_SECRET_FOR_APP;
        Intrinsics.checkNotNullExpressionValue(ONLY_ONE_SECRET_FOR_APP, "ONLY_ONE_SECRET_FOR_APP");
        if (CollectionsKt__CollectionsKt.listOf(Arrays.copyOf(ONLY_ONE_SECRET_FOR_APP, ONLY_ONE_SECRET_FOR_APP.length)).contains(aliasKey)) {
            return aliasKey;
        }
        if (ssoid == null || ssoid.length() == 0) {
            return aliasKey;
        }
        return vbb.d(ssoid) + aliasKey;
    }

    public final synchronized boolean i(@NotNull String keyAlias, @Nullable String ssoid) {
        Intrinsics.checkNotNullParameter(keyAlias, "keyAlias");
        String strH = h(keyAlias, ssoid);
        try {
            try {
                try {
                    KeyStore keyStore = this.mStore;
                    Intrinsics.checkNotNull(keyStore);
                    keyStore.load(null);
                    KeyStore keyStore2 = this.mStore;
                    Intrinsics.checkNotNull(keyStore2);
                    boolean zContainsAlias = keyStore2.containsAlias(strH);
                    if (!zContainsAlias) {
                        a7b.f("AesGcmAndroidKeyStore", "hasKey is false");
                        m("data_platform has key from keystore is false", keyAlias);
                    }
                    return zContainsAlias;
                } catch (NoSuchAlgorithmException e2) {
                    a7b.b("AesGcmAndroidKeyStore", "hasKey e: " + e2.getMessage());
                    a7b.f("AesGcmAndroidKeyStore", "hasKey false");
                    return false;
                }
            } catch (CertificateException e3) {
                a7b.b("AesGcmAndroidKeyStore", "hasKey e: " + e3.getMessage());
                a7b.f("AesGcmAndroidKeyStore", "hasKey false");
                return false;
            }
        } catch (IOException e4) {
            a7b.b("AesGcmAndroidKeyStore", "hasKey e: " + e4.getMessage());
            a7b.f("AesGcmAndroidKeyStore", "hasKey false");
            return false;
        } catch (KeyStoreException e5) {
            a7b.b("AesGcmAndroidKeyStore", "hasKey e: " + e5.getMessage());
            a7b.f("AesGcmAndroidKeyStore", "hasKey false");
            return false;
        }
    }

    public final void j() {
        Context contextA = b78.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        if (gxe.k(contextA)) {
            Context contextA2 = b78.a();
            Intrinsics.checkNotNullExpressionValue(contextA2, "getAppContext()");
            this.dataStore = dx4.a(contextA2);
        }
    }

    public final void k() {
        if (d != null) {
            MMKV mmkv = d;
            Intrinsics.checkNotNull(mmkv);
            mmkv.lock();
        }
    }

    public final void l(@Nullable String alias) throws KeyStoreException {
        KeyStore keyStore = this.mStore;
        Intrinsics.checkNotNull(keyStore);
        keyStore.deleteEntry(alias);
    }

    public final void m(String message, String keyAlias) {
        if (Intrinsics.areEqual(keyAlias, ooa.DB_PLATFORM_DB_KEY)) {
            com.heytap.health.base.track.a.p().a("DATA_PLATFORM_KEY", message).b();
        }
    }

    public final void n() {
        if (d != null) {
            MMKV mmkv = d;
            Intrinsics.checkNotNull(mmkv);
            mmkv.unlock();
        }
    }

    public AesGcmAndroidKeyStore() {
        synchronized (AesGcmAndroidKeyStore.class) {
            try {
                this.pCache = new ConcurrentHashMap<>();
                this.mStore = KeyStore.getInstance(KEY_STORE_MODULE);
                synchronized (this) {
                    try {
                        d = MMKV.I(KEY_STORE_MODULE, 2);
                    } catch (Exception e2) {
                        a7b.b("AesGcmAndroidKeyStore", e2.getMessage());
                    }
                    j();
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Exception e3) {
                a7b.b("AesGcmAndroidKeyStore", e3.getMessage());
            }
            Unit unit2 = Unit.INSTANCE;
        }
    }
}
