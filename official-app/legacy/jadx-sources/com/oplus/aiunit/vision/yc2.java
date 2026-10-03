package com.oplus.aiunit.vision;

import com.heytap.connect.cipher.AESUtil;
import com.oplus.nearx.track.internal.utils.Logger;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\"\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a*\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\u0016\u0010\b\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¨\u0006\t"}, d2 = {"", "", "key", "Lkotlin/Pair;", "c", "transformation", "b", "byte", "a", "core-statistics_release"}, k = 2, mv = {1, 7, 1})
public final class yc2 {
    @Nullable
    public static final byte[] a(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(bArr2, "byte");
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    @Nullable
    public static final Pair<byte[], String> b(@NotNull byte[] bArr, @NotNull String key, @NotNull String transformation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(transformation, "transformation");
        if (!(key.length() == 0)) {
            if (!(bArr.length == 0)) {
                try {
                    Cipher cipher = Cipher.getInstance(transformation);
                    byte[] bytes = key.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                    byte[] bArr2 = new byte[16];
                    for (int i = 0; i < bytes.length && i < 16; i++) {
                        bArr2[i] = bytes[i];
                    }
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
                    byte[] bArr3 = new byte[16];
                    new SecureRandom().nextBytes(bArr3);
                    cipher.init(1, secretKeySpec, new IvParameterSpec(bArr3));
                    return new Pair<>(cipher.doFinal(bArr), u0j.c(bArr3));
                } catch (Exception e2) {
                    Logger.d(k6k.e(), k6k.TAG, "getAES， " + k6k.f(e2), null, null, 12, null);
                    return null;
                }
            }
        }
        return new Pair<>(new byte[0], "");
    }

    @Nullable
    public static final Pair<byte[], String> c(@NotNull byte[] bArr, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return b(bArr, key, AESUtil.AES_PADDING);
    }
}
