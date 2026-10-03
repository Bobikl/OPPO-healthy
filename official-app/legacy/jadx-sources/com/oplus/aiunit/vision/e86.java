package com.oplus.aiunit.vision;

import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/e86;", "", "", "data", "sign", "", d9f.PUBLIC_KEY, "", "a", "Ljava/lang/String;", "KEY_ALGORITHM", "<init>", "()V", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public final class e86 {
    public static final e86 INSTANCE = new e86();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String KEY_ALGORITHM = apj.Thread_Type_Executor_Cached;

    public final boolean a(@NotNull byte[] data, @NotNull byte[] sign, @NotNull String publicKey) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(sign, "sign");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(KEY_ALGORITHM).generatePublic(new X509EncodedKeySpec(rd2.b(publicKey)));
            Signature signature = Signature.getInstance("SHA1withECDSA");
            signature.initVerify(publicKeyGeneratePublic);
            signature.update(data);
            return signature.verify(sign);
        } catch (Exception e2) {
            throw new RuntimeException("verify sign with ecdsa error", e2);
        }
    }
}
