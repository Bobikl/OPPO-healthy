package com.oplus.pay.opensdk.statistic.network;

import android.text.TextUtils;
import android.util.Base64;
import com.oplus.pay.opensdk.statistic.helper.DigestHelper;
import io.protostuff.MapSchema;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J \u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u0014\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0007J \u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J \u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¨\u0006\u0013"}, d2 = {"Lcom/oplus/pay/opensdk/statistic/network/AesHelper;", "", "", "encryptStr", "decryptKey", "", "iv", "b", "content", "encryptKey", "d", "bytes", MapSchema.FIELD_NAME_ENTRY, "encryptBytes", "a", "c", "<init>", "()V", "SecretKeyNullPointException", "paysdk_statistic_release"}, k = 1, mv = {1, 8, 0})
public final class AesHelper {

    @NotNull
    public static final AesHelper INSTANCE = new AesHelper();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/pay/opensdk/statistic/network/AesHelper$SecretKeyNullPointException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "message", "", "(Ljava/lang/String;)V", "paysdk_statistic_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SecretKeyNullPointException extends RuntimeException {
        public SecretKeyNullPointException() {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SecretKeyNullPointException(@NotNull String message) {
            super(message);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    @JvmStatic
    @NotNull
    public static final String b(@NotNull String encryptStr, @NotNull String decryptKey, @NotNull byte[] iv) throws SecretKeyNullPointException {
        Intrinsics.checkNotNullParameter(encryptStr, "encryptStr");
        Intrinsics.checkNotNullParameter(decryptKey, "decryptKey");
        Intrinsics.checkNotNullParameter(iv, "iv");
        return INSTANCE.a(DigestHelper.b(encryptStr, 0, 2, null), decryptKey, iv);
    }

    @JvmStatic
    @NotNull
    public static final String d(@NotNull String content, @NotNull String encryptKey, @NotNull byte[] iv) throws SecretKeyNullPointException {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(encryptKey, "encryptKey");
        Intrinsics.checkNotNullParameter(iv, "iv");
        return DigestHelper.d(INSTANCE.c(content, encryptKey, iv), 0, 2, null);
    }

    @JvmStatic
    @Nullable
    public static final String e(@Nullable byte[] bytes) {
        return Base64.encodeToString(bytes, 10);
    }

    public final String a(byte[] encryptBytes, String decryptKey, byte[] iv) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (encryptBytes.length == 0) {
            return "";
        }
        if (TextUtils.isEmpty(decryptKey)) {
            throw new SecretKeyNullPointException("Secret Key is null");
        }
        Cipher cipher = Cipher.getInstance("AES/CTR/Nopadding");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
        Charset charset = Charsets.UTF_8;
        byte[] bytes = decryptKey.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        cipher.init(2, new SecretKeySpec(bytes, "AES"), ivParameterSpec);
        byte[] decryptBytes = cipher.doFinal(encryptBytes);
        Intrinsics.checkNotNullExpressionValue(decryptBytes, "decryptBytes");
        return new String(decryptBytes, charset);
    }

    public final byte[] c(String content, String encryptKey, byte[] iv) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (content.length() == 0) {
            return new byte[0];
        }
        if (encryptKey.length() == 0) {
            throw new SecretKeyNullPointException("Secret Key is null");
        }
        Cipher cipher = Cipher.getInstance("AES/CTR/Nopadding");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
        Charset charset = Charsets.UTF_8;
        byte[] bytes = encryptKey.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        cipher.init(1, new SecretKeySpec(bytes, "AES"), ivParameterSpec);
        byte[] bytes2 = content.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
        byte[] bArrDoFinal = cipher.doFinal(bytes2);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "cipher.doFinal(content.toByteArray())");
        return bArrDoFinal;
    }
}
