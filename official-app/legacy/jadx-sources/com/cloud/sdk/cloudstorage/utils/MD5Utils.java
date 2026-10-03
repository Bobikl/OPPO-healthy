package com.cloud.sdk.cloudstorage.utils;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¨\u0006\f"}, d2 = {"Lcom/cloud/sdk/cloudstorage/utils/MD5Utils;", "", "()V", "computeMd5", "", "content", "", "text", "encoding", "Ljava/nio/charset/Charset;", "convertToHexString", "data", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public final class MD5Utils {

    @NotNull
    public static final MD5Utils INSTANCE = new MD5Utils();

    private MD5Utils() {
    }

    public static /* synthetic */ String computeMd5$default(MD5Utils mD5Utils, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(charset, "StandardCharsets.UTF_8");
        }
        return mD5Utils.computeMd5(str, charset);
    }

    private final String convertToHexString(byte[] data) {
        StringBuffer stringBuffer = new StringBuffer("");
        int length = data.length;
        for (int i = 0; i < length; i++) {
            int i2 = data[i];
            if (i2 < 0) {
                i2 += 256;
            }
            if (i2 < 16) {
                stringBuffer.append("0");
            }
            stringBuffer.append(Integer.toHexString(i2));
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "buf.toString()");
        return string;
    }

    @NotNull
    public final String computeMd5(@Nullable String text, @NotNull Charset encoding) {
        Intrinsics.checkNotNullParameter(encoding, "encoding");
        if (text == null || StringsKt__StringsJVMKt.isBlank(text)) {
            return "";
        }
        try {
            if (text == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = text.getBytes(encoding);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            String strComputeMd5 = computeMd5(bytes);
            return strComputeMd5 != null ? strComputeMd5 : "";
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    private final String computeMd5(byte[] content) {
        if (content == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(content);
            byte[] bArrDigest = messageDigest.digest();
            Intrinsics.checkNotNullExpressionValue(bArrDigest, "messageDigest.digest()");
            return convertToHexString(bArrDigest);
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            Charset charset = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(charset, "StandardCharsets.UTF_8");
            return String.valueOf(new String(content, charset).hashCode());
        }
    }
}
