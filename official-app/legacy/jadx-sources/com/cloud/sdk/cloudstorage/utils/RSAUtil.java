package com.cloud.sdk.cloudstorage.utils;

import com.oplus.aiunit.vision.d9f;
import com.oplus.aiunit.vision.dj;
import com.oplus.aiunit.vision.f04;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\u0003\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¨\u0006\n"}, d2 = {"Lcom/cloud/sdk/cloudstorage/utils/RSAUtil;", "", "()V", f04.JSON_KEY_RKE_IS_ENCRYPT, "", "data", "key", "", "plainText", d9f.PUBLIC_KEY, "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public final class RSAUtil {

    @NotNull
    public static final RSAUtil INSTANCE = new RSAUtil();

    private RSAUtil() {
    }

    @NotNull
    public final byte[] encrypt(@Nullable byte[] data, @Nullable byte[] key) {
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(key));
            Cipher cipher = Cipher.getInstance(dj.RSA_TRANSFORMATION);
            cipher.init(1, publicKeyGeneratePublic);
            byte[] bArrDoFinal = cipher.doFinal(data);
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "cipher.doFinal(data)");
            return bArrDoFinal;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    @NotNull
    public final String encrypt(@NotNull String plainText, @NotNull String publicKey) {
        Intrinsics.checkNotNullParameter(plainText, "plainText");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        AESUtil aESUtil = AESUtil.INSTANCE;
        return aESUtil.binToHex(encrypt(aESUtil.hexToBin(plainText), aESUtil.hexToBin(publicKey)));
    }
}
