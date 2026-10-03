package com.cloud.sdk.cloudstorage.utils;

import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.f04;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.io.CloseableKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.CharsKt__CharJVMKt;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ,\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006J\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J,\u0010\u0011\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u0006J\u0006\u0010\u0015\u001a\u00020\u0004J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/cloud/sdk/cloudstorage/utils/AESUtil;", "", "()V", "AES", "", "HEXADECIMAL_CONST", "", "KEY_LENGTH_128", "TAG", "binToHex", "buf", "", "decrypt", "key", "data", "inputOffset", "inputLen", f04.JSON_KEY_RKE_IS_ENCRYPT, Const.Scheme.SCHEME_FILE, "Ljava/io/File;", "input", "generateKey", "hexToBin", "src", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public final class AESUtil {
    private static final String AES = "AES";
    private static final int HEXADECIMAL_CONST = 16;

    @NotNull
    public static final AESUtil INSTANCE = new AESUtil();
    private static final int KEY_LENGTH_128 = 128;
    private static final String TAG = "ASEUtil";

    private AESUtil() {
    }

    public static /* synthetic */ byte[] encrypt$default(AESUtil aESUtil, String str, byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = bArr.length;
        }
        return aESUtil.encrypt(str, bArr, i, i2);
    }

    @NotNull
    public final String binToHex(@NotNull byte[] buf) {
        Intrinsics.checkNotNullParameter(buf, "buf");
        StringBuffer stringBuffer = new StringBuffer(buf.length * 2);
        int length = buf.length;
        for (int i = 0; i < length; i++) {
            if ((buf[i] & 255) < 16) {
                stringBuffer.append("0");
            }
            String string = Long.toString(buf[i] & 255, CharsKt__CharJVMKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string, "java.lang.Long.toString(this, checkRadix(radix))");
            stringBuffer.append(string);
        }
        String string2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "strbuf.toString()");
        return string2;
    }

    @Nullable
    public final synchronized byte[] decrypt(@Nullable String key, @Nullable byte[] data, int inputOffset, int inputLen) {
        byte[] bArrDoFinal;
        try {
            try {
                try {
                    try {
                        try {
                            Cipher cipher = Cipher.getInstance("AES/CFB/NoPadding");
                            cipher.init(2, new SecretKeySpec(hexToBin(key), "AES"), new IvParameterSpec(new byte[cipher.getBlockSize()]));
                            bArrDoFinal = cipher.doFinal(data, inputOffset, inputLen);
                        } catch (NoSuchAlgorithmException e2) {
                            OcsLog.INSTANCE.w(TAG, new Function0<String>() { // from class: com.cloud.sdk.cloudstorage.utils.AESUtil.decrypt.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // p010kotlin.jvm.functions.Function0
                                @NotNull
                                public final String invoke() {
                                    return "decrypt failure : " + e2;
                                }
                            });
                            bArrDoFinal = new byte[0];
                        }
                    } catch (BadPaddingException e3) {
                        OcsLog.INSTANCE.w(TAG, new Function0<String>() { // from class: com.cloud.sdk.cloudstorage.utils.AESUtil.decrypt.5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // p010kotlin.jvm.functions.Function0
                            @NotNull
                            public final String invoke() {
                                return "decrypt failure : " + e3;
                            }
                        });
                        bArrDoFinal = new byte[0];
                    }
                } catch (IllegalBlockSizeException e4) {
                    OcsLog.INSTANCE.w(TAG, new Function0<String>() { // from class: com.cloud.sdk.cloudstorage.utils.AESUtil.decrypt.6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p010kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            return "decrypt failure : " + e4;
                        }
                    });
                    bArrDoFinal = new byte[0];
                }
            } catch (InvalidAlgorithmParameterException e5) {
                OcsLog.INSTANCE.w(TAG, new Function0<String>() { // from class: com.cloud.sdk.cloudstorage.utils.AESUtil.decrypt.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p010kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "decrypt failure : " + e5;
                    }
                });
                bArrDoFinal = new byte[0];
            }
        } catch (InvalidKeyException e6) {
            OcsLog.INSTANCE.w(TAG, new Function0<String>() { // from class: com.cloud.sdk.cloudstorage.utils.AESUtil.decrypt.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p010kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "decrypt failure : " + e6;
                }
            });
            bArrDoFinal = new byte[0];
        } catch (NoSuchPaddingException e7) {
            OcsLog.INSTANCE.w(TAG, new Function0<String>() { // from class: com.cloud.sdk.cloudstorage.utils.AESUtil.decrypt.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p010kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "decrypt failure : " + e7;
                }
            });
            bArrDoFinal = new byte[0];
        }
        return bArrDoFinal;
    }

    @Nullable
    public final synchronized byte[] encrypt(@Nullable String key, @Nullable File file) {
        byte[] bArrEncrypt$default;
        if (file == null) {
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                bArrEncrypt$default = encrypt$default(INSTANCE, key, bArr, 0, 0, 12, null);
                CloseableKt.closeFinally(fileInputStream, null);
                return bArrEncrypt$default;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(fileInputStream, th);
                    throw th2;
                }
            }
        } catch (Exception e2) {
            OcsLog.INSTANCE.w(TAG, new Function0<String>() { // from class: com.cloud.sdk.cloudstorage.utils.AESUtil.encrypt.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p010kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "encrypt data failure : " + e2;
                }
            });
            bArrEncrypt$default = new byte[0];
        }
    }

    @NotNull
    public final String generateKey() {
        try {
            SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128, secureRandom);
            SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
            Intrinsics.checkNotNullExpressionValue(secretKeyGenerateKey, "keyGen.generateKey()");
            byte[] encoded = secretKeyGenerateKey.getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "keyGen.generateKey().encoded");
            return binToHex(encoded);
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            String strValueOf = String.valueOf(new SecureRandom().nextInt());
            Charset charset = Charsets.UTF_8;
            if (strValueOf == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = strValueOf.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            return binToHex(bytes);
        }
    }

    @Nullable
    public final byte[] hexToBin(@Nullable String src) {
        if (src == null || src.length() == 0) {
            return null;
        }
        byte[] bArr = new byte[src.length() / 2];
        int length = src.length() / 2;
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int i3 = i2 + 1;
            String strSubstring = src.substring(i2, i3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            int i4 = Integer.parseInt(strSubstring, CharsKt__CharJVMKt.checkRadix(16));
            String strSubstring2 = src.substring(i3, i2 + 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            bArr[i] = (byte) ((i4 * 16) + Integer.parseInt(strSubstring2, CharsKt__CharJVMKt.checkRadix(16)));
        }
        return bArr;
    }

    @NotNull
    public final synchronized byte[] encrypt(@Nullable String key, @NotNull byte[] input, int inputOffset, int inputLen) {
        byte[] bArrDoFinal;
        try {
            Intrinsics.checkNotNullParameter(input, "input");
            try {
                try {
                    try {
                        try {
                            try {
                                Cipher cipher = Cipher.getInstance("AES/CFB/NoPadding");
                                cipher.init(1, new SecretKeySpec(hexToBin(key), "AES"), new IvParameterSpec(new byte[cipher.getBlockSize()]));
                                bArrDoFinal = cipher.doFinal(input, inputOffset, inputLen);
                                Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "cipher.doFinal(input, inputOffset, inputLen)");
                            } catch (IllegalBlockSizeException e2) {
                                OcsLog.INSTANCE.w(TAG, new Function0<String>() { // from class: com.cloud.sdk.cloudstorage.utils.AESUtil.encrypt.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // p010kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final String invoke() {
                                        return "encrypt Error : " + e2;
                                    }
                                });
                                bArrDoFinal = new byte[0];
                            }
                        } catch (InvalidAlgorithmParameterException e3) {
                            OcsLog.INSTANCE.w(TAG, new Function0<String>() { // from class: com.cloud.sdk.cloudstorage.utils.AESUtil.encrypt.5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // p010kotlin.jvm.functions.Function0
                                @NotNull
                                public final String invoke() {
                                    return "encrypt Error : " + e3;
                                }
                            });
                            bArrDoFinal = new byte[0];
                        }
                    } catch (InvalidKeyException e4) {
                        OcsLog.INSTANCE.w(TAG, new Function0<String>() { // from class: com.cloud.sdk.cloudstorage.utils.AESUtil.encrypt.6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // p010kotlin.jvm.functions.Function0
                            @NotNull
                            public final String invoke() {
                                return "encrypt Error : " + e4;
                            }
                        });
                        bArrDoFinal = new byte[0];
                    }
                } catch (NoSuchPaddingException e5) {
                    OcsLog.INSTANCE.w(TAG, new Function0<String>() { // from class: com.cloud.sdk.cloudstorage.utils.AESUtil.encrypt.7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p010kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            return "encrypt Error : " + e5;
                        }
                    });
                    bArrDoFinal = new byte[0];
                }
            } catch (NoSuchAlgorithmException e6) {
                OcsLog.INSTANCE.w(TAG, new Function0<String>() { // from class: com.cloud.sdk.cloudstorage.utils.AESUtil.encrypt.8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p010kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "encrypt Error : " + e6;
                    }
                });
                bArrDoFinal = new byte[0];
            } catch (BadPaddingException e7) {
                OcsLog.INSTANCE.w(TAG, new Function0<String>() { // from class: com.cloud.sdk.cloudstorage.utils.AESUtil.encrypt.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p010kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "encrypt Error : " + e7;
                    }
                });
                bArrDoFinal = new byte[0];
            }
        } catch (Throwable th) {
            throw th;
        }
        return bArrDoFinal;
    }
}
