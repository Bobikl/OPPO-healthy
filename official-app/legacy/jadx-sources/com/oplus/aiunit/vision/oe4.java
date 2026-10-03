package com.oplus.aiunit.vision;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0006"}, d2 = {"", "input", "a", "", "data", "b", "com.heytap.nearx.common"}, k = 2, mv = {1, 4, 0})
public final class oe4 {
    @NotNull
    public static final String a(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        Charset charsetDefaultCharset = Charset.defaultCharset();
        Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "Charset.defaultCharset()");
        byte[] bytes = input.getBytes(charsetDefaultCharset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return b(bytes);
    }

    @NotNull
    public static final String b(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            Intrinsics.checkNotNullExpressionValue(messageDigest, "MessageDigest.getInstance(\"MD5\")");
            messageDigest.update(data);
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                int i = b & 255;
                if (i < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toString(i, 16));
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "sbRet.toString()");
            return string;
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
