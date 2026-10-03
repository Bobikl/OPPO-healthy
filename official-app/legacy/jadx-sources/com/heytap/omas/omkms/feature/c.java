package com.heytap.omas.omkms.feature;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.omas.a.e.i;
import com.heytap.omas.proto.Omkms3;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: loaded from: classes19.dex */
@TargetApi(23)
public class c implements com.heytap.omas.omkms.feature.a {
    private static final String d = "KeyStoreHigherApiISessionTicketCache";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f7631e = "AndroidKeyStore";
    private static final String f = "session_key_encrypt_keystore_aes_alias";
    private static KeyStore g;
    private static Map<String, Omkms3.ServiceSessionInfo> h = new ConcurrentHashMap();
    private static Map<String, Omkms3.KmsSessionInfo> i = new ConcurrentHashMap();
    private String a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f7632c;

    public static final class b {
        private static final String a = "KMS-";
        private static final String b = "SERVICE-";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f7633c = "en_session_key_info";

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Nullable
        public static Omkms3.EnKmsSessionInfo b(Context context, String str) {
            try {
                if (context == null) {
                    throw new IllegalArgumentException("loadEnKmsSessionFromFile: context cannot be null.");
                }
                String string = context.getSharedPreferences(f7633c, 0).getString(a + str, null);
                if (!TextUtils.isEmpty(string)) {
                    return (Omkms3.EnKmsSessionInfo) com.heytap.omas.a.e.h.a(string, Omkms3.EnKmsSessionInfo.class);
                }
                i.b(c.d, "loadEnKmsSessionFromFile: no record.");
                return null;
            } catch (Exception e2) {
                i.b(c.d, "loadEnKmsSessionFromFile: " + e2);
                return null;
            }
        }

        @Nullable
        public static Omkms3.EnServiceSessionInfo c(Context context, String str) {
            try {
                if (context == null) {
                    throw new IllegalArgumentException("loadEnServiceSessionFromFile: context cannot be null.");
                }
                String string = context.getSharedPreferences(f7633c, 0).getString(b + str, null);
                if (!TextUtils.isEmpty(string)) {
                    return (Omkms3.EnServiceSessionInfo) com.heytap.omas.a.e.h.a(string, Omkms3.EnServiceSessionInfo.class);
                }
                i.b(c.d, "loadEnServiceSessionFromFile: fail.");
                return null;
            } catch (Exception e2) {
                i.b(c.d, "loadEnServiceSessionFromFile:" + e2);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context, Omkms3.EnKmsSessionInfo enKmsSessionInfo) {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(f7633c, 0).edit();
            editorEdit.putString(a + enKmsSessionInfo.getUserInitInfo(), com.heytap.omas.a.e.h.a(enKmsSessionInfo, (Class<Omkms3.EnKmsSessionInfo>) Omkms3.EnKmsSessionInfo.class));
            editorEdit.commit();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context, Omkms3.EnServiceSessionInfo enServiceSessionInfo) {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(f7633c, 0).edit();
            editorEdit.putString(b + enServiceSessionInfo.getUserInitInfo(), com.heytap.omas.a.e.h.a(enServiceSessionInfo, (Class<Omkms3.EnServiceSessionInfo>) Omkms3.EnServiceSessionInfo.class));
            editorEdit.commit();
        }
    }

    /* JADX INFO: renamed from: com.heytap.omas.omkms.feature.c$c, reason: collision with other inner class name */
    public static class C0734c {
        private static final c a = new c();

        private C0734c() {
        }
    }

    private c() {
        this.a = "KMS-";
        this.b = "SERVICE-";
        this.f7632c = "en_session_key_info";
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            g = keyStore;
            keyStore.load(null);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static c a() {
        return C0734c.a;
    }

    @Override // com.heytap.omas.omkms.feature.a
    @TargetApi(23)
    public Omkms3.ServiceSessionInfo b(Context context, com.heytap.omas.omkms.data.h hVar) {
        try {
            String strA = a(hVar);
            if (h.containsKey(strA)) {
                i.c(d, "loadServiceSessionTicketInfo: load service ticket from memory.");
                return h.get(strA);
            }
            if (!g.containsAlias(f)) {
                i.b(d, "loadServiceSessionTicketInfo: Uninitialized,cannot load session info.");
                return null;
            }
            Omkms3.EnServiceSessionInfo enServiceSessionInfoC = b.c(context, strA);
            if (enServiceSessionInfoC == null) {
                i.b(d, "loadServiceSessionTicketInfo: return null.");
                return null;
            }
            SecretKey secretKey = (SecretKey) g.getKey(f, null);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKey, new GCMParameterSpec(128, Base64.decode(enServiceSessionInfoC.getIv(), 2)));
            Omkms3.ServiceSessionInfo serviceSessionInfo = (Omkms3.ServiceSessionInfo) com.heytap.omas.a.e.h.a(new String(cipher.doFinal(Base64.decode(enServiceSessionInfoC.getEnSessionInfo(), 2))), Omkms3.ServiceSessionInfo.class);
            h.put(strA, serviceSessionInfo);
            return serviceSessionInfo;
        } catch (Exception e2) {
            i.b(d, "loadServiceSessionTicketInfo: KeyStore exception:" + e2);
            return null;
        }
    }

    @Override // com.heytap.omas.omkms.feature.a
    @TargetApi(23)
    public Omkms3.EnKmsSessionInfo a(Context context, com.heytap.omas.omkms.data.h hVar, Omkms3.KmsSessionInfo kmsSessionInfo) {
        SecretKey secretKeyA;
        try {
            String strA = a(hVar);
            if (g.containsAlias(f)) {
                secretKeyA = (SecretKey) g.getKey(f, null);
            } else {
                synchronized (c.class) {
                    secretKeyA = !g.containsAlias(f) ? a(f) : (SecretKey) g.getKey(f, null);
                }
            }
            byte[] bArr = new byte[12];
            new SecureRandom().nextBytes(bArr);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKeyA, new GCMParameterSpec(128, bArr));
            Omkms3.EnKmsSessionInfo enKmsSessionInfoBuild = Omkms3.EnKmsSessionInfo.newBuilder().setUserInitInfo(strA).setIv(Base64.encodeToString(bArr, 2)).setBeginTime(kmsSessionInfo.getBeginTime()).setEndTime(kmsSessionInfo.getEndTime()).setEnSessionInfo(Base64.encodeToString(cipher.doFinal(com.heytap.omas.a.e.h.a(kmsSessionInfo, (Class<Omkms3.KmsSessionInfo>) Omkms3.KmsSessionInfo.class).getBytes()), 2)).build();
            b.b(context, enKmsSessionInfoBuild);
            i.put(strA, kmsSessionInfo);
            return enKmsSessionInfoBuild;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.heytap.omas.omkms.feature.a
    @TargetApi(23)
    public Omkms3.EnServiceSessionInfo a(Context context, com.heytap.omas.omkms.data.h hVar, Omkms3.ServiceSessionInfo serviceSessionInfo) {
        try {
            String strA = a(hVar);
            if (!g.containsAlias(f)) {
                i.b(d, "saveServiceSessionTicketInfo,keyStore not contains alias:session_key_encrypt_keystore_aes_alias,should not take place always.");
                return null;
            }
            SecretKey secretKey = (SecretKey) g.getKey(f, null);
            byte[] bArr = new byte[12];
            new SecureRandom().nextBytes(bArr);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKey, new GCMParameterSpec(128, bArr));
            Omkms3.EnServiceSessionInfo enServiceSessionInfoBuild = Omkms3.EnServiceSessionInfo.newBuilder().setUserInitInfo(strA).setBeginTime(serviceSessionInfo.getBeginTime()).setIv(Base64.encodeToString(bArr, 2)).setEndTime(serviceSessionInfo.getEndTime()).setEnSessionInfo(Base64.encodeToString(cipher.doFinal(com.heytap.omas.a.e.h.a(serviceSessionInfo, (Class<Omkms3.ServiceSessionInfo>) Omkms3.ServiceSessionInfo.class).getBytes()), 2)).build();
            enServiceSessionInfoBuild.toString();
            b.b(context, enServiceSessionInfoBuild);
            h.put(strA, serviceSessionInfo);
            return enServiceSessionInfoBuild;
        } catch (Exception e2) {
            i.b(d, "saveServiceSessionTicketInfo: Exception=" + e2.getMessage());
            return null;
        }
    }

    @Override // com.heytap.omas.omkms.feature.a
    @TargetApi(23)
    public Omkms3.KmsSessionInfo a(Context context, com.heytap.omas.omkms.data.h hVar) {
        try {
            String strA = a(hVar);
            if (i.containsKey(strA)) {
                return i.get(strA);
            }
            if (!g.containsAlias(f)) {
                i.b(d, "loadKmsSessionTicketInfo: Uninitialized,cannot load session info.");
                return null;
            }
            i.c(d, "loadKmsSessionTicketInfo: try load encrypted kms ticket from share preference.");
            Omkms3.EnKmsSessionInfo enKmsSessionInfoB = b.b(context, strA);
            if (enKmsSessionInfoB == null) {
                i.b(d, "loadKmsSessionTicketInfo", "enKmsSessionInfo=null.");
                return null;
            }
            SecretKey secretKey = (SecretKey) g.getKey(f, null);
            byte[] bArrDecode = Base64.decode(enKmsSessionInfoB.getIv(), 2);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKey, new GCMParameterSpec(128, bArrDecode));
            Omkms3.KmsSessionInfo kmsSessionInfo = (Omkms3.KmsSessionInfo) com.heytap.omas.a.e.h.a(new String(cipher.doFinal(Base64.decode(enKmsSessionInfoB.getEnSessionInfo(), 2))), Omkms3.KmsSessionInfo.class);
            i.put(strA, kmsSessionInfo);
            return kmsSessionInfo;
        } catch (Exception e2) {
            i.b(d, "loadKmsSessionTicketInfo: exception:" + e2.getMessage());
            return null;
        }
    }

    @TargetApi(23)
    private String a(@NonNull com.heytap.omas.omkms.data.h hVar) {
        if (hVar == null) {
            throw new IllegalArgumentException("InitParamSpec cannot be null.");
        }
        return "higher-api_" + com.heytap.omas.a.e.g.a(hVar);
    }

    @TargetApi(23)
    private SecretKey a(String str) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes("GCM").setEncryptionPaddings(com.heytap.omas.a.b.a.k).setRandomizedEncryptionRequired(false).build());
            return keyGenerator.generateKey();
        } catch (Exception e2) {
            i.b(d, "generateSecretKey fail:" + e2.getCause().toString());
            return null;
        }
    }
}
