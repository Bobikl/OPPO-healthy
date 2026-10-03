package com.oplus.aiunit.vision;

import android.util.Base64;
import com.customer.feedback.sdk.util.LogUtil;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes10.dex */
public final class awm {

    @NotNull
    public static final awm feedbacka = new awm();

    @Nullable
    public static SecretKeySpec feedbackb;

    @NotNull
    public static String a() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(iv, Base64.NO_WRAP)");
        return strEncodeToString;
    }

    @Nullable
    public static String b(@Nullable String str, @Nullable String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        try {
            Cipher cipher = Cipher.getInstance(e7.AES_TRANSFORMATION);
            cipher.init(2, feedbackb, new IvParameterSpec(Base64.decode(str2, 0)));
            byte[] bArrDoFinal = cipher.doFinal(Base64.decode(str, 0));
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "it.doFinal(decodedBytes)");
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            return new String(bArrDoFinal, UTF_8);
        } catch (Exception e2) {
            LogUtil.e("AESCounter", "AES-CTR decrypt error", e2);
            return null;
        }
    }

    @Nullable
    public static String d(@Nullable String str, @Nullable String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        try {
            Cipher cipher = Cipher.getInstance(e7.AES_TRANSFORMATION);
            cipher.init(1, feedbackb, new IvParameterSpec(Base64.decode(str2, 0)));
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return Base64.encodeToString(cipher.doFinal(bytes), 2);
        } catch (Exception e2) {
            LogUtil.e("AESCounter", "AES-CTR encrypt error", e2);
            return null;
        }
    }

    @NotNull
    public final synchronized String c() {
        String strEncodeToString;
        if (feedbackb == null) {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128);
            feedbackb = new SecretKeySpec(keyGenerator.generateKey().getEncoded(), "AES");
        }
        SecretKeySpec secretKeySpec = feedbackb;
        strEncodeToString = Base64.encodeToString(secretKeySpec != null ? secretKeySpec.getEncoded() : null, 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(mSecretKe….encoded, Base64.NO_WRAP)");
        return strEncodeToString;
    }
}
