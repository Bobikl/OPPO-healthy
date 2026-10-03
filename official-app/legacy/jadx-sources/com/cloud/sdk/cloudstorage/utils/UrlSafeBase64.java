package com.cloud.sdk.cloudstorage.utils;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\b"}, d2 = {"Lcom/cloud/sdk/cloudstorage/utils/UrlSafeBase64;", "", "()V", "decode", "", "data", "", "encodeToString", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public final class UrlSafeBase64 {

    @NotNull
    public static final UrlSafeBase64 INSTANCE = new UrlSafeBase64();

    private UrlSafeBase64() {
    }

    @Nullable
    public final byte[] decode(@Nullable String data) {
        return Base64.INSTANCE.decode(data, 10);
    }

    @NotNull
    public final String encodeToString(@Nullable String data) {
        if (data == null || data.length() == 0) {
            return "";
        }
        try {
            Charset charset = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(charset, "StandardCharsets.UTF_8");
            if (data == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = data.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            String strEncodeToString = encodeToString(bytes);
            return strEncodeToString != null ? strEncodeToString : "";
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    @Nullable
    public final String encodeToString(@Nullable byte[] data) {
        return Base64.INSTANCE.encodeToString(data, 10);
    }
}
