package com.oplus.aiunit.vision;

import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0000\u001a\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0000\"\u0014\u0010\b\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u0014\u0010\n\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t\"\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "message", "Ljava/security/PublicKey;", d9f.PUBLIC_KEY, "rsaTransformation", "b", "keyString", "a", "RSA_PK_PADDING", "Ljava/lang/String;", "RSA_OAEP_PADDING", "", "RSA_KEY_LEN", "I", "OLog_release"}, k = 2, mv = {1, 8, 0})
public final class e9f {
    public static final int RSA_KEY_LEN = 2048;

    @NotNull
    public static final String RSA_OAEP_PADDING = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";

    @NotNull
    public static final String RSA_PK_PADDING = "RSA/ECB/OAEPPadding";

    @NotNull
    public static final PublicKey a(@NotNull String keyString) throws InvalidKeySpecException {
        Intrinsics.checkNotNullParameter(keyString, "keyString");
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.getDecoder().decode(keyString)));
        Intrinsics.checkNotNullExpressionValue(publicKeyGeneratePublic, "keyFactory.generatePublic(keySpec)");
        return publicKeyGeneratePublic;
    }

    @NotNull
    public static final String b(@NotNull String message, @NotNull PublicKey publicKey, @NotNull String rsaTransformation) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(rsaTransformation, "rsaTransformation");
        Cipher cipher = Cipher.getInstance(rsaTransformation);
        cipher.init(1, publicKey);
        byte[] bytes = message.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        String strEncodeToString = Base64.getEncoder().encodeToString(cipher.doFinal(bytes));
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "getEncoder().encodeToString(encryptedBytes)");
        return strEncodeToString;
    }
}
