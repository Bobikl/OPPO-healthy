package com.heytap.omas.omkms.feature;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.security.KeyPairGeneratorSpec;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.heytap.omas.a.e.i;
import com.heytap.omas.proto.Omkms3;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes19.dex */
@TargetApi(19)
public class d implements com.heytap.omas.omkms.feature.a {
    private static final String d = "KeyStoreLowerApiISessionTicketCache";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f7634e = "AndroidKeyStore";
    private static final String f = "OMAS";
    private static final String g = "session_key_encrypt_keystore_rsa_alias";
    private static final String h = "RSA/None/PKCS1Padding";
    private static final String i = "AES/GCM/NoPadding";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static KeyStore f7635j;
    private static volatile byte[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Map<String, Omkms3.ServiceSessionInfo> f7636l = new ConcurrentHashMap();
    private static Map<String, Omkms3.KmsSessionInfo> m = new ConcurrentHashMap();
    private String a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f7637c;

    @TargetApi(19)
    public static class b {
        private static final String a = "EnAesSpUtils";
        private static final String b = "en_aes_key_file";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f7638c = "aes_encrypted_key_of_android_key_store_rsa_key";
        private static volatile byte[] d;

        public static class a extends TypeToken<byte[]> {
        }

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @TargetApi(19)
        public static synchronized void b(Context context, byte[] bArr) {
            if (d != null) {
                i.b(a, "saveEnAesKey: should not take place always,in this case that would be bug ,not ensure a singleton object to call this method.");
            }
            i.c(a, "saveEnAesKey: encryptedAesKey:" + bArr);
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(b, 0).edit();
            editorEdit.putString(f7638c, new Gson().toJson(bArr));
            i.c(a, "saveEnAesKey: result:" + editorEdit.commit());
            d = bArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Nullable
        @TargetApi(19)
        public static byte[] b(Context context) {
            try {
                if (d == null || d.length == 0) {
                    String string = context.getSharedPreferences(b, 0).getString(f7638c, null);
                    if (string == null) {
                        i.b(a, "loadEnAesKey: null,not en aes key info.");
                        return null;
                    }
                    byte[] bArr = (byte[]) new Gson().fromJson(string, new a().getType());
                    i.c(a, "loadEnAesKey: load enAesKey from sp file, enAesKey:" + bArr);
                    d = bArr;
                } else {
                    i.c(a, "loadEnAesKey: load enAesKey from memory cache.enAesKey:" + d);
                }
                return d;
            } catch (Exception e2) {
                i.b(a, "loadEnAesKey: exception,detail:" + e2);
                return null;
            }
        }
    }

    public static final class c {
        private static final String a = "kms_";
        private static final String b = "service_";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f7639c = "encrypted_session_key_info";

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Nullable
        public static Omkms3.EnKmsSessionInfo b(Context context, String str) {
            try {
                if (context == null) {
                    throw new IllegalArgumentException("loadEnKmsSessionFromFile: context cannot be null.");
                }
                String string = context.getSharedPreferences(f7639c, 0).getString(a + str, null);
                if (!TextUtils.isEmpty(string)) {
                    return (Omkms3.EnKmsSessionInfo) com.heytap.omas.a.e.h.a(string, Omkms3.EnKmsSessionInfo.class);
                }
                i.b(d.d, "loadEnKmsSessionFromFile: fail.");
                return null;
            } catch (JsonSyntaxException e2) {
                i.b(d.d, "loadEnKmsSessionFromFile: " + e2);
                return null;
            }
        }

        @Nullable
        public static Omkms3.EnServiceSessionInfo c(Context context, String str) {
            try {
                if (context == null) {
                    throw new IllegalArgumentException("loadEnServiceSessionFromFile: context cannot be null.");
                }
                String string = context.getSharedPreferences(f7639c, 0).getString(b + str, null);
                if (!TextUtils.isEmpty(string)) {
                    return (Omkms3.EnServiceSessionInfo) com.heytap.omas.a.e.h.a(string, Omkms3.EnServiceSessionInfo.class);
                }
                i.b(d.d, "loadEnServiceSessionFromFile: fail.");
                return null;
            } catch (JsonSyntaxException e2) {
                i.b(d.d, "loadEnServiceSessionFromFile: " + e2);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context, Omkms3.EnKmsSessionInfo enKmsSessionInfo) {
            try {
                SharedPreferences.Editor editorEdit = context.getSharedPreferences(f7639c, 0).edit();
                editorEdit.putString(a + enKmsSessionInfo.getUserInitInfo(), com.heytap.omas.a.e.h.a(enKmsSessionInfo, (Class<Omkms3.EnKmsSessionInfo>) Omkms3.EnKmsSessionInfo.class));
                editorEdit.commit();
            } catch (JsonIOException e2) {
                i.b(d.d, "saveEnKmsSessionToFile: " + e2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context, Omkms3.EnServiceSessionInfo enServiceSessionInfo) {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(f7639c, 0).edit();
            editorEdit.putString(b + enServiceSessionInfo.getUserInitInfo(), com.heytap.omas.a.e.h.a(enServiceSessionInfo, (Class<Omkms3.EnServiceSessionInfo>) Omkms3.EnServiceSessionInfo.class));
            editorEdit.commit();
        }
    }

    /* JADX INFO: renamed from: com.heytap.omas.omkms.feature.d$d, reason: collision with other inner class name */
    public static class C0735d {
        private static final d a = new d();

        private C0735d() {
        }
    }

    private d() {
        this.a = "KMS-";
        this.b = "SERVICE-";
        this.f7637c = "en_session_key_info";
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            f7635j = keyStore;
            keyStore.load(null);
        } catch (Exception e2) {
            i.b(d, "KeyStoreRsaCache: exception:" + e2);
        }
    }

    public static d a() {
        return C0735d.a;
    }

    @Override // com.heytap.omas.omkms.feature.a
    @TargetApi(19)
    public Omkms3.ServiceSessionInfo b(Context context, com.heytap.omas.omkms.data.h hVar) {
        try {
            String strA = a(hVar);
            if (f7636l.containsKey(strA)) {
                i.c(d, "loadServiceSessionTicketInfo: load service ticket from memory.");
                return f7636l.get(strA);
            }
            if (!f7635j.containsAlias(g)) {
                i.b(d, "loadServiceSessionTicketInfo: uninitialized,cannot load service session info.");
                return null;
            }
            i.c(d, "loadServiceSessionTicketInfo: load service ticket from share preference.");
            Omkms3.EnServiceSessionInfo enServiceSessionInfoC = c.c(context, strA);
            if (enServiceSessionInfoC == null) {
                i.b(d, "loadServiceSessionTicketInfo: enServiceSessionInfo == null.");
                return null;
            }
            if (k == null) {
                synchronized (this) {
                    if (k == null) {
                        k = b.b(context);
                    }
                    if (k != null && k.length != 0) {
                    }
                    i.b(d, "saveServiceSessionTicketInfo: fail,not found enKeystoreAesKey info,must save kms session ticket info first.");
                    return null;
                }
            }
            PrivateKey privateKey = (PrivateKey) f7635j.getKey(g, null);
            Cipher cipher = Cipher.getInstance(h);
            cipher.init(2, privateKey);
            byte[] bArrB = b.b(context);
            if (bArrB != null && bArrB.length != 0) {
                byte[] bArrA = a(hVar, new SecretKeySpec(cipher.doFinal(bArrB), "AES"), 128, Base64.decode(enServiceSessionInfoC.getIv(), 2), Base64.decode(enServiceSessionInfoC.getEnSessionInfo().getBytes(), 2), 2);
                if (bArrA != null && bArrA.length != 0) {
                    Omkms3.ServiceSessionInfo serviceSessionInfo = (Omkms3.ServiceSessionInfo) com.heytap.omas.a.e.h.a(new String(bArrA), Omkms3.ServiceSessionInfo.class);
                    f7636l.put(strA, serviceSessionInfo);
                    return serviceSessionInfo;
                }
                i.b(d, "loadServiceSessionTicketInfo: serviceSessionInfoBytes is null or empty,always should not take place.");
                return null;
            }
            i.b(d, "loadServiceSessionTicketInfo: fail,not found enAesKey info,must save kms session ticket info first.");
            return null;
        } catch (Exception e2) {
            i.b(d, "loadServiceSessionKey: KeyStore exception:" + e2);
            return null;
        }
    }

    @Override // com.heytap.omas.omkms.feature.a
    @TargetApi(19)
    public Omkms3.EnKmsSessionInfo a(Context context, com.heytap.omas.omkms.data.h hVar, Omkms3.KmsSessionInfo kmsSessionInfo) {
        boolean zA;
        SecretKey secretKeySpec;
        SecretKey secretKeySpec2;
        if (context == null || hVar == null || kmsSessionInfo == null) {
            i.b(d, "saveKmsSessionTicketInfo: fail,parameters cannot be null.");
            return null;
        }
        try {
            String strA = a(hVar);
            if (f7635j.containsAlias(g)) {
                zA = true;
            } else {
                synchronized (d.class) {
                    if (f7635j.containsAlias(g)) {
                        zA = true;
                    } else {
                        i.c(d, "saveKmsSessionTicketInfo: keyStore not contains alias:session_key_encrypt_keystore_rsa_alias,generate it now.");
                        zA = a(context, g);
                    }
                }
            }
            if (!zA) {
                return null;
            }
            PublicKey publicKey = f7635j.getCertificate(g).getPublicKey();
            PrivateKey privateKey = (PrivateKey) f7635j.getKey(g, null);
            byte[] bArr = new byte[12];
            SecureRandom secureRandom = new SecureRandom();
            secureRandom.nextBytes(bArr);
            if (k == null) {
                synchronized (this) {
                    if (k == null) {
                        k = b.b(context);
                    }
                    if (k == null || k.length == 0) {
                        i.c(d, "saveKmsSessionTicketInfo:not found enAesKey info,generate and save it.");
                        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
                        keyGenerator.init(256);
                        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
                        byte[] encoded = secretKeyGenerateKey.getEncoded();
                        secureRandom.nextBytes(bArr);
                        Cipher cipher = Cipher.getInstance(h);
                        cipher.init(1, publicKey);
                        k = cipher.doFinal(encoded);
                        b.b(context, k);
                        secretKeySpec2 = secretKeyGenerateKey;
                    } else {
                        secureRandom.nextBytes(bArr);
                        Cipher cipher2 = Cipher.getInstance(h);
                        cipher2.init(2, privateKey);
                        secretKeySpec2 = new SecretKeySpec(cipher2.doFinal(k), "AES");
                    }
                }
                secretKeySpec = secretKeySpec2;
            } else {
                secureRandom.nextBytes(bArr);
                Cipher cipher3 = Cipher.getInstance(h);
                cipher3.init(2, privateKey);
                secretKeySpec = new SecretKeySpec(cipher3.doFinal(k), "AES");
            }
            String strA2 = com.heytap.omas.a.e.h.a(kmsSessionInfo, (Class<Omkms3.KmsSessionInfo>) Omkms3.KmsSessionInfo.class);
            secureRandom.nextBytes(bArr);
            byte[] bArrA = a(hVar, secretKeySpec, 128, bArr, strA2.getBytes(), 1);
            if (bArrA != null && bArrA.length != 0) {
                Omkms3.EnKmsSessionInfo enKmsSessionInfoBuild = Omkms3.EnKmsSessionInfo.newBuilder().setUserInitInfo(strA).setIv(Base64.encodeToString(bArr, 2)).setBeginTime(kmsSessionInfo.getBeginTime()).setEndTime(kmsSessionInfo.getEndTime()).setEnSessionInfo(Base64.encodeToString(bArrA, 2)).build();
                kmsSessionInfo.getBeginTime();
                kmsSessionInfo.getEndTime();
                c.b(context, enKmsSessionInfoBuild);
                m.put(strA, kmsSessionInfo);
                return enKmsSessionInfoBuild;
            }
            i.b(d, "saveKmsSessionTicketInfo: enKmsSessionBytes is null,encrypt fail,always should not take place.");
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            i.b(d, "saveKmsSessionKey: exception,detail:" + e2);
            return null;
        }
    }

    @Override // com.heytap.omas.omkms.feature.a
    @Nullable
    @TargetApi(19)
    public Omkms3.EnServiceSessionInfo a(Context context, com.heytap.omas.omkms.data.h hVar, Omkms3.ServiceSessionInfo serviceSessionInfo) {
        try {
            if (!f7635j.containsAlias(g)) {
                i.b(d, "saveServiceSessionTicketInfo: keyStore not contains alias:session_key_encrypt_keystore_rsa_alias,should not take place always.");
                return null;
            }
            PrivateKey privateKey = (PrivateKey) f7635j.getKey(g, null);
            if (k == null) {
                synchronized (this) {
                    if (k == null) {
                        k = b.b(context);
                    }
                    if (k != null && k.length != 0) {
                    }
                    i.b(d, "saveServiceSessionTicketInfo: fail,not found enAesKey info,must save kms session ticket info first.");
                    return null;
                }
            }
            String strA = a(hVar);
            byte[] bArr = new byte[12];
            SecureRandom secureRandom = new SecureRandom();
            secureRandom.nextBytes(bArr);
            Cipher cipher = Cipher.getInstance(h);
            cipher.init(2, privateKey);
            byte[] bArrDoFinal = cipher.doFinal(k);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArrDoFinal, "AES");
            i.b(d, "saveServiceSessionTicketInfo: dAesKey:" + Arrays.toString(bArrDoFinal));
            String strA2 = com.heytap.omas.a.e.h.a(serviceSessionInfo, (Class<Omkms3.ServiceSessionInfo>) Omkms3.ServiceSessionInfo.class);
            secureRandom.nextBytes(bArr);
            byte[] bArrA = a(hVar, secretKeySpec, 128, bArr, strA2.getBytes(), 1);
            if (bArrA != null && bArrA.length != 0) {
                Omkms3.EnServiceSessionInfo enServiceSessionInfoBuild = Omkms3.EnServiceSessionInfo.newBuilder().setUserInitInfo(strA).setIv(Base64.encodeToString(bArr, 2)).setBeginTime(serviceSessionInfo.getBeginTime()).setEndTime(serviceSessionInfo.getEndTime()).setEnSessionInfo(Base64.encodeToString(bArrA, 2)).build();
                c.b(context, enServiceSessionInfoBuild);
                f7636l.put(strA, serviceSessionInfo);
                return enServiceSessionInfoBuild;
            }
            i.b(d, "saveServiceSessionTicketInfo: enServiceSessionBytes is null,encrypt fail,always should not take place.");
            return null;
        } catch (Exception e2) {
            i.b(d, "saveServiceSessionTicketInfo: exception:" + e2);
            return null;
        }
    }

    @Override // com.heytap.omas.omkms.feature.a
    @TargetApi(19)
    public Omkms3.KmsSessionInfo a(Context context, com.heytap.omas.omkms.data.h hVar) {
        try {
            String strA = a(hVar);
            if (m.containsKey(strA)) {
                i.c(d, "loadKmsSessionTicketInfo: try load kms ticket from memory.");
                return m.get(strA);
            }
            if (f7635j.containsAlias(g)) {
                i.c(d, "loadKmsSessionTicketInfo: try load encrypted service ticket from share preference.");
                Omkms3.EnKmsSessionInfo enKmsSessionInfoB = c.b(context, strA);
                if (enKmsSessionInfoB == null) {
                    i.b(d, "loadKmsSessionTicketInfo: enKmsSessionInfo == null.");
                    return null;
                }
                PrivateKey privateKey = (PrivateKey) f7635j.getKey(g, null);
                if (k == null) {
                    synchronized (this) {
                        if (k == null) {
                            k = b.b(context);
                        }
                        if (k != null && k.length != 0) {
                        }
                        i.b(d, "saveServiceSessionTicketInfo: fail,not found enKeystoreAesKey info,must save kms session ticket info first.");
                        return null;
                    }
                }
                Cipher cipher = Cipher.getInstance(h);
                cipher.init(2, privateKey);
                byte[] bArrDoFinal = cipher.doFinal(k);
                i.b(d, "loadKmsSessionTicketInfo: deEnKeystoreAesKey:" + Arrays.toString(bArrDoFinal));
                Omkms3.KmsSessionInfo kmsSessionInfo = (Omkms3.KmsSessionInfo) com.heytap.omas.a.e.h.a(new String(a(hVar, new SecretKeySpec(bArrDoFinal, "AES"), 128, Base64.decode(enKmsSessionInfoB.getIv(), 2), Base64.decode(enKmsSessionInfoB.getEnSessionInfo().getBytes(), 2), 2)), Omkms3.KmsSessionInfo.class);
                m.put(strA, kmsSessionInfo);
                i.b(d, "loadKmsSessionTicketInfo: kmsSessionTicketInfo:\nbegin time:" + kmsSessionInfo.getBeginTime() + "\nendTime:" + kmsSessionInfo.getEndTime());
                return kmsSessionInfo;
            }
            i.b(d, "loadKmsSessionTicketInfo: Uninitialized,cannot load kms session info.");
            return null;
        } catch (Exception e2) {
            i.b(d, "loadKmsSessionTicketInfo: KeyStore exception:" + e2);
            return null;
        }
    }

    private String a(@NonNull com.heytap.omas.omkms.data.h hVar) {
        if (hVar == null) {
            throw new IllegalArgumentException("InitParamSpec cannot be null");
        }
        return "lower-api_" + com.heytap.omas.a.e.g.a(hVar);
    }

    private static AlgorithmParameterSpec a(int i2, byte[] bArr) {
        return a(i2, bArr, 0, bArr.length);
    }

    private static AlgorithmParameterSpec a(int i2, byte[] bArr, int i3, int i4) {
        return new GCMParameterSpec(i2, bArr, i3, i4);
    }

    @TargetApi(19)
    private static boolean a(Context context, String str) {
        try {
            i.b(d, "generateRsaKeyPair: alias:" + str);
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 100);
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            keyPairGenerator.initialize(new KeyPairGeneratorSpec.Builder(context).setKeyType("RSA").setKeySize(2048).setAlias(str).setSubject(new X500Principal("CN=cn,O=OPLUS,OU=OSEC")).setSerialNumber(BigInteger.valueOf(1337L)).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build());
            keyPairGenerator.generateKeyPair();
            return true;
        } catch (Exception e2) {
            e2.toString();
            return false;
        }
    }

    private static byte[] a(com.heytap.omas.omkms.data.h hVar, SecretKey secretKey, int i2, byte[] bArr, byte[] bArr2, int i3) {
        Cipher cipher;
        try {
            if (!TextUtils.isEmpty(hVar.getCipherProvider())) {
                if (f.equals(hVar.getCipherProvider())) {
                    com.heytap.omas.a.c.a.b();
                    cipher = Cipher.getInstance(i, f);
                    cipher.init(i3, secretKey, new GCMParameterSpec(i2, bArr));
                } else {
                    cipher = Cipher.getInstance(i, hVar.getCipherProvider());
                }
                return cipher.doFinal(bArr2);
            }
            cipher = Cipher.getInstance(i);
            cipher.init(i3, secretKey, a(i2, bArr));
            return cipher.doFinal(bArr2);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
