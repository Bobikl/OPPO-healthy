package com.oplus.aiunit.vision;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\"\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/n;", "", "", "encryptedData", "key", "a", "", TypedValues.CycleType.S_WAVE_OFFSET, "len", "Ljava/security/spec/AlgorithmParameterSpec;", "b", "", "Ljava/lang/String;", "GCM", "<init>", "()V", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public final class n {
    public static final n INSTANCE = new n();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String GCM = "AES/GCM/NoPadding";

    @NotNull
    public final byte[] a(@NotNull byte[] encryptedData, @NotNull byte[] key) {
        Intrinsics.checkNotNullParameter(encryptedData, "encryptedData");
        Intrinsics.checkNotNullParameter(key, "key");
        if (encryptedData.length < 28) {
            throw new IllegalArgumentException();
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
            AlgorithmParameterSpec algorithmParameterSpecB = b(encryptedData, 0, 12);
            Cipher cipher = Cipher.getInstance(GCM);
            cipher.init(2, secretKeySpec, algorithmParameterSpecB);
            byte[] bArrDoFinal = cipher.doFinal(encryptedData, 12, encryptedData.length - 12);
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "cipher.doFinal(encrypted… encryptedData.size - 12)");
            return bArrDoFinal;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public final AlgorithmParameterSpec b(byte[] encryptedData, int offset, int len) {
        return new GCMParameterSpec(128, encryptedData, offset, len);
    }
}
