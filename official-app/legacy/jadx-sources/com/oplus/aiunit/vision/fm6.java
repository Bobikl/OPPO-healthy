package com.oplus.aiunit.vision;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.heytap.health.base.encrypt.AesGcmAndroidKeyStore;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0001\u001a\u00020\u0000*\u0004\u0018\u00010\u0000\u001a\f\u0010\u0002\u001a\u00020\u0000*\u0004\u0018\u00010\u0000\u001a\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002\u001a\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0000¨\u0006\b"}, d2 = {"", "b", "a", "Ljava/security/Key;", "d", "alias", "Ljavax/crypto/SecretKey;", "c", "commonlib_release"}, k = 2, mv = {1, 8, 0})
public final class fm6 {
    @NotNull
    public static final String a(@Nullable String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        t6b.b("EnSpUtil", "decrypt enter");
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str2 = "";
        if (str == null || str.length() == 0) {
            return "";
        }
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrDecode, 0, 12);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOfRange, "copyOfRange(encrypted, 0, IV_LENGTH)");
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, d(), new GCMParameterSpec(128, bArrCopyOfRange));
        try {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            byte[] plainText = cipher.doFinal(Arrays.copyOfRange(bArrDecode, 12, bArrDecode.length));
            t6b.b("EnSpUtil", "decrypt cipher doFinal time cost " + (System.currentTimeMillis() - jCurrentTimeMillis2));
            Intrinsics.checkNotNullExpressionValue(plainText, "plainText");
            str2 = new String(plainText, Charsets.UTF_8);
        } catch (Exception e2) {
            t6b.c(e2.getMessage());
        }
        t6b.b("EnSpUtil", "decrypt time cost " + (System.currentTimeMillis() - jCurrentTimeMillis));
        return str2;
    }

    @NotNull
    public static final String b(@Nullable String str) {
        t6b.b("EnSpUtil", "encrypt enter");
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str2 = "";
        if (str == null || str.length() == 0) {
            return "";
        }
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes = str.getBytes(UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, d());
        try {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            byte[] bArrDoFinal = cipher.doFinal(bytes);
            t6b.b("EnSpUtil", "encrypt cipher doFinal time cost " + (System.currentTimeMillis() - jCurrentTimeMillis2));
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrDoFinal.length + 12);
            byteBufferAllocate.put(cipher.getIV());
            byteBufferAllocate.put(bArrDoFinal);
            String strEncodeToString = Base64.encodeToString(byteBufferAllocate.array(), 0);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(buffer.array(), Base64.DEFAULT)");
            str2 = strEncodeToString;
        } catch (Exception e2) {
            t6b.c(e2.getMessage());
        }
        t6b.b("EnSpUtil", "encrypt time cost " + (System.currentTimeMillis() - jCurrentTimeMillis));
        return str2;
    }

    @Nullable
    public static final SecretKey c(@NotNull String alias) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        Intrinsics.checkNotNullParameter(alias, "alias");
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", AesGcmAndroidKeyStore.KEY_STORE_MODULE);
        KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(alias, 3).setBlockModes("GCM").setEncryptionPaddings(com.heytap.omas.a.b.a.k).setKeySize(256);
        Intrinsics.checkNotNullExpressionValue(keySize, "Builder(alias, purpose)\n…    .setKeySize(KEY_SIZE)");
        keyGenerator.init(keySize.build());
        return keyGenerator.generateKey();
    }

    public static final synchronized Key d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        KeyStore keyStore = KeyStore.getInstance(AesGcmAndroidKeyStore.KEY_STORE_MODULE);
        keyStore.load(null);
        String strO = aec.o();
        Intrinsics.checkNotNullExpressionValue(strO, "getcplc()");
        String strSubstring = strO.substring(20, 36);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        if (!keyStore.containsAlias(strSubstring)) {
            return c(strSubstring);
        }
        KeyStore.Entry entry = keyStore.getEntry(strSubstring, new KeyStore.PasswordProtection(null));
        Intrinsics.checkNotNull(entry, "null cannot be cast to non-null type java.security.KeyStore.SecretKeyEntry");
        SecretKey secretKey = ((KeyStore.SecretKeyEntry) entry).getSecretKey();
        t6b.b("EnSpUtil", "getSecretKey time cost " + (System.currentTimeMillis() - jCurrentTimeMillis));
        return secretKey;
    }
}
