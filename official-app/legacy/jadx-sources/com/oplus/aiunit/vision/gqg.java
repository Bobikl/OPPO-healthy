package com.oplus.aiunit.vision;

import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/gqg;", "", "", "src", "", "a", "<init>", "()V", "lib_utils_release"}, k = 1, mv = {1, 4, 0})
public final class gqg {
    public static final gqg INSTANCE = new gqg();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/gqg$a;", "", "", "data", "sign", "", d9f.PUBLIC_KEY, "", "a", "Ljava/lang/String;", "KEY_ALGORITHM", "<init>", "()V", "lib_utils_release"}, k = 1, mv = {1, 4, 0})
    public static final class a {
        public static final a INSTANCE = new a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public static final String KEY_ALGORITHM = apj.Thread_Type_Executor_Cached;

        public final boolean a(@NotNull byte[] data, @NotNull byte[] sign, @NotNull String publicKey) {
            Intrinsics.checkParameterIsNotNull(data, "data");
            Intrinsics.checkParameterIsNotNull(sign, "sign");
            Intrinsics.checkParameterIsNotNull(publicKey, "publicKey");
            try {
                PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(KEY_ALGORITHM).generatePublic(new X509EncodedKeySpec(gqg.INSTANCE.a(publicKey)));
                Signature signature = Signature.getInstance("SHA1withECDSA");
                signature.initVerify(publicKeyGeneratePublic);
                signature.update(data);
                return signature.verify(sign);
            } catch (Exception e2) {
                throw new RuntimeException("verify sign with ecdsa error", e2);
            }
        }
    }

    @Nullable
    public final byte[] a(@NotNull String src) {
        Intrinsics.checkParameterIsNotNull(src, "src");
        if (src.length() < 1) {
            return null;
        }
        byte[] bArr = new byte[src.length() / 2];
        int length = src.length() / 2;
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int i3 = i2 + 1;
            String strSubstring = src.substring(i2, i3);
            Intrinsics.checkExpressionValueIsNotNull(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            int i4 = Integer.parseInt(strSubstring, 16);
            String strSubstring2 = src.substring(i3, i2 + 2);
            Intrinsics.checkExpressionValueIsNotNull(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            bArr[i] = (byte) ((i4 * 16) + Integer.parseInt(strSubstring2, 16));
        }
        return bArr;
    }
}
