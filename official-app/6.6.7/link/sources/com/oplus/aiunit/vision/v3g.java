package com.oplus.aiunit.vision;

import com.oplus.pay.opensdk.statistic.helper.DigestHelper;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0007J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/v3g;", "", "", "content", "secretKey", "c", "sign", hcf.PUBLIC_KEY, "", "b", "bysKey", "Ljava/security/PublicKey;", "d", "", "input", "Ljavax/crypto/Cipher;", "cipher", "a", "KEY_PAY", "Ljava/lang/String;", "<init>", "()V", "paysdk_statistic_release"}, k = 1, mv = {1, 8, 0})
public final class v3g {

    @NotNull
    public static final v3g INSTANCE = new v3g();

    @NotNull
    public static final String KEY_PAY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCBCb4pIVIxkxH+ECOYjAfB6bYdpqryP/govT6LXekJpqFZvoidvMg86JkWUdnf46d03VFZnDbB+R2awVPegRkooKMfu/psxuyTUNUy/NwTtZv6SoZajByaO0euzmT2Z8fO6Fzxha5VJon8+QxgNRcFzfCFwZ/P/ZByhop7MM9f5QIDAQAB";

    @JvmStatic
    public static final boolean b(@NotNull String content, @NotNull String sign, @NotNull String publicKey) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(sign, "sign");
        Intrinsics.checkNotNullParameter(publicKey, hcf.PUBLIC_KEY);
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(DigestHelper.b(publicKey, 0, 2, null)));
            Signature signature = Signature.getInstance("SHA1WithRSA");
            signature.initVerify(publicKeyGeneratePublic);
            byte[] bytes = content.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            signature.update(bytes);
            return signature.verify(DigestHelper.b(sign, 0, 2, null));
        } catch (Throwable th) {
            pce.c(th.getMessage());
            return false;
        }
    }

    @JvmStatic
    @NotNull
    public static final String c(@NotNull String content, @NotNull String secretKey) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(secretKey, "secretKey");
        try {
            Cipher cipher = Cipher.getInstance("RSA/NONE/PKCS1Padding");
            v3g v3gVar = INSTANCE;
            cipher.init(1, v3gVar.d(secretKey));
            byte[] bytes = content.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            Intrinsics.checkNotNullExpressionValue(cipher, "cipher");
            return DigestHelper.d(v3gVar.a(bytes, cipher), 0, 2, null);
        } catch (Throwable th) {
            pce.c(th.getMessage());
            return "";
        }
    }

    public final byte[] a(byte[] input, Cipher cipher) throws GeneralSecurityException {
        int blockSize = cipher.getBlockSize();
        int outputSize = cipher.getOutputSize(blockSize);
        int length = input.length;
        byte[] bArr = new byte[(length % blockSize == 0 ? length / blockSize : (length / blockSize) + 1) * outputSize];
        int i = length;
        int i2 = 0;
        while (i >= blockSize) {
            cipher.doFinal(input, i2 * blockSize, blockSize, bArr, i2 * outputSize);
            i -= blockSize;
            i2++;
        }
        if (i > 0) {
            cipher.doFinal(input, i2 * blockSize, i, bArr, i2 * outputSize);
        }
        return bArr;
    }

    public final PublicKey d(String bysKey) throws InvalidKeySpecException, NoSuchAlgorithmException {
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(DigestHelper.b(bysKey, 0, 2, null)));
        Intrinsics.checkNotNullExpressionValue(publicKeyGeneratePublic, "keyFactory.generatePublic(x509)");
        return publicKeyGeneratePublic;
    }
}
