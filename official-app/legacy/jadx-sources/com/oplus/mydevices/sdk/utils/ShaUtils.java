package com.oplus.mydevices.sdk.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/oplus/mydevices/sdk/utils/ShaUtils;", "", "()V", "RADIX", "", "SIGN_NUM", "TAG", "", "sha256", "input", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final class ShaUtils {
    public static final ShaUtils INSTANCE = new ShaUtils();
    private static final int RADIX = 16;
    private static final int SIGN_NUM = 1;
    private static final String TAG = "ShaUtils";

    private ShaUtils() {
    }

    @JvmStatic
    @NotNull
    public static final String sha256(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
            Intrinsics.checkNotNullExpressionValue(messageDigest, "MessageDigest.getInstance(\"SHA-256\")");
            byte[] bytes = input.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            byte[] bArrDigest = messageDigest.digest(bytes);
            Intrinsics.checkNotNullExpressionValue(bArrDigest, "messageDigest.digest(input.toByteArray())");
            String string = new BigInteger(1, bArrDigest).toString(16);
            Intrinsics.checkNotNullExpressionValue(string, "BigInteger(SIGN_NUM, digest).toString(RADIX)");
            return string;
        } catch (Exception unused) {
            LogUtils.INSTANCE.e(TAG, TAG);
            return "";
        }
    }
}
