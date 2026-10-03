package com.heytap.store.platform.tools;

import com.heytap.connect.config.connectid.ConnectIdLogic;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.d9f;
import com.sensorsdata.analytics.android.sdk.core.mediator.Modules;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.DigestInputStream;
import java.security.Key;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004J0\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004J,\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bJ,\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bJ0\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004J0\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004J0\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\bJ\u0012\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\bJ\u0012\u0010\u0019\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u001c\u0010\u0019\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\bJ\u001c\u0010\u0019\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\bJ,\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bJ,\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bJ,\u0010\u001e\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010 \u001a\u00020\bJ\u0018\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004H\u0002J6\u0010$\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010%\u001a\u00020&H\u0002JB\u0010'\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010 \u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010%\u001a\u00020&H\u0002¨\u0006("}, d2 = {"Lcom/heytap/store/platform/tools/EncryptUtils;", "", "()V", Modules.Encrypt.METHOD_DECRYPT_AES, "", "data", "key", "transformation", "", "iv", "decryptBase64AES", "decryptBase64RSA", d9f.PRIVATE_KEY, "keySize", "", "decryptRSA", Modules.Encrypt.METHOD_ENCRYPT_AES, "encryptAES2Base64", "encryptAES2HexString", "encryptMD5", "encryptMD5File", Const.Scheme.SCHEME_FILE, "Ljava/io/File;", "filePath", "encryptMD5File2String", "encryptMD5ToString", "salt", "encryptRSA", d9f.PUBLIC_KEY, "encryptRSA2Base64", "encryptRSA2HexString", "hashTemplate", ConnectIdLogic.PARAM_ALGORITHM, "joins", "prefix", "suffix", "rsaTemplate", "isEncrypt", "", "symmetricTemplate", "utils_release"}, k = 1, mv = {1, 4, 0})
public final class EncryptUtils {
    public static final EncryptUtils INSTANCE = new EncryptUtils();

    private EncryptUtils() {
    }

    private final byte[] joins(byte[] prefix, byte[] suffix) {
        byte[] bArr = new byte[prefix.length + suffix.length];
        System.arraycopy(prefix, 0, bArr, 0, prefix.length);
        System.arraycopy(suffix, 0, bArr, prefix.length, suffix.length);
        return bArr;
    }

    private final byte[] rsaTemplate(byte[] data, byte[] key, int keySize, String transformation, boolean isEncrypt) {
        Key keyGeneratePrivate;
        if (data != null) {
            int i = 1;
            if (!(data.length == 0) && key != null) {
                if (!(key.length == 0)) {
                    try {
                        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
                        Intrinsics.checkNotNullExpressionValue(keyFactory, "KeyFactory.getInstance(\"RSA\")");
                        if (isEncrypt) {
                            keyGeneratePrivate = keyFactory.generatePublic(new X509EncodedKeySpec(key));
                            Intrinsics.checkNotNullExpressionValue(keyGeneratePrivate, "keyFactory.generatePublic(keySpec)");
                        } else {
                            keyGeneratePrivate = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(key));
                            Intrinsics.checkNotNullExpressionValue(keyGeneratePrivate, "keyFactory.generatePrivate(keySpec)");
                        }
                        if (keyGeneratePrivate == null) {
                            return null;
                        }
                        Cipher cipher = Cipher.getInstance(transformation);
                        Intrinsics.checkNotNullExpressionValue(cipher, "Cipher.getInstance(transformation)");
                        if (!isEncrypt) {
                            i = 2;
                        }
                        cipher.init(i, keyGeneratePrivate);
                        int length = data.length;
                        int i2 = keySize / 8;
                        if (isEncrypt) {
                            if (transformation == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                            String lowerCase = transformation.toLowerCase();
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                            if (StringsKt__StringsJVMKt.endsWith$default(lowerCase, "pkcs1padding", false, 2, null)) {
                                i2 -= 11;
                            }
                        }
                        int i3 = length / i2;
                        if (i3 <= 0) {
                            return cipher.doFinal(data);
                        }
                        byte[] bArrJoins = new byte[0];
                        byte[] bArr = new byte[i2];
                        int i4 = 0;
                        for (int i5 = 0; i5 < i3; i5++) {
                            System.arraycopy(data, i4, bArr, 0, i2);
                            byte[] bArrDoFinal = cipher.doFinal(bArr);
                            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "cipher.doFinal(buff)");
                            bArrJoins = joins(bArrJoins, bArrDoFinal);
                            i4 += i2;
                        }
                        if (i4 == length) {
                            return bArrJoins;
                        }
                        int i6 = length - i4;
                        byte[] bArr2 = new byte[i6];
                        System.arraycopy(data, i4, bArr2, 0, i6);
                        byte[] bArrDoFinal2 = cipher.doFinal(bArr2);
                        Intrinsics.checkNotNullExpressionValue(bArrDoFinal2, "cipher.doFinal(buff)");
                        return joins(bArrJoins, bArrDoFinal2);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    private final byte[] symmetricTemplate(byte[] data, byte[] key, String algorithm, String transformation, byte[] iv, boolean isEncrypt) {
        SecretKey secretKeySpec;
        if (data == null) {
            return null;
        }
        int i = 1;
        if ((data.length == 0) || key == null) {
            return null;
        }
        if (key.length == 0) {
            return null;
        }
        try {
            if (Intrinsics.areEqual("DES", algorithm)) {
                DESKeySpec dESKeySpec = new DESKeySpec(key);
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(algorithm);
                Intrinsics.checkNotNullExpressionValue(secretKeyFactory, "SecretKeyFactory.getInstance(algorithm)");
                secretKeySpec = secretKeyFactory.generateSecret(dESKeySpec);
                Intrinsics.checkNotNullExpressionValue(secretKeySpec, "keyFactory.generateSecret(desKey)");
            } else {
                secretKeySpec = new SecretKeySpec(key, algorithm);
            }
            Cipher cipher = Cipher.getInstance(transformation);
            Intrinsics.checkNotNullExpressionValue(cipher, "Cipher.getInstance(transformation)");
            if (iv == null) {
                if (isEncrypt) {
                    i = 2;
                }
                cipher.init(i, secretKeySpec);
            } else {
                if (iv.length == 0) {
                    if (isEncrypt) {
                        i = 2;
                    }
                    cipher.init(i, secretKeySpec);
                } else {
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
                    if (!isEncrypt) {
                        i = 2;
                    }
                    cipher.init(i, secretKeySpec, ivParameterSpec);
                }
            }
            return cipher.doFinal(data);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Nullable
    public final byte[] decryptAES(@Nullable byte[] data, @Nullable byte[] key, @Nullable String transformation, @Nullable byte[] iv) {
        return symmetricTemplate(data, key, "AES", transformation, iv, false);
    }

    @Nullable
    public final byte[] decryptBase64AES(@Nullable byte[] data, @Nullable byte[] key, @Nullable String transformation, @Nullable byte[] iv) {
        return decryptAES(EncodeUtils.INSTANCE.base64Decode(data), key, transformation, iv);
    }

    @Nullable
    public final byte[] decryptBase64RSA(@Nullable byte[] data, @Nullable byte[] privateKey, int keySize, @NotNull String transformation) {
        Intrinsics.checkNotNullParameter(transformation, "transformation");
        return decryptRSA(EncodeUtils.INSTANCE.base64Decode(data), privateKey, keySize, transformation);
    }

    @Nullable
    public final byte[] decryptRSA(@Nullable byte[] data, @Nullable byte[] privateKey, int keySize, @NotNull String transformation) {
        Intrinsics.checkNotNullParameter(transformation, "transformation");
        return rsaTemplate(data, privateKey, keySize, transformation, false);
    }

    @Nullable
    public final byte[] encryptAES(@Nullable byte[] data, @Nullable byte[] key, @Nullable String transformation, @Nullable byte[] iv) {
        return symmetricTemplate(data, key, "AES", transformation, iv, true);
    }

    @Nullable
    public final byte[] encryptAES2Base64(@Nullable byte[] data, @Nullable byte[] key, @Nullable String transformation, @Nullable byte[] iv) {
        return EncodeUtils.INSTANCE.base64Encode(encryptAES(data, key, transformation, iv));
    }

    @Nullable
    public final String encryptAES2HexString(@Nullable byte[] data, @Nullable byte[] key, @Nullable String transformation, @Nullable byte[] iv) {
        return ConvertUtils.INSTANCE.bytes2HexString(encryptAES(data, key, transformation, iv));
    }

    @Nullable
    public final byte[] encryptMD5(@Nullable byte[] data) {
        return hashTemplate(data, "MD5");
    }

    @Nullable
    public final byte[] encryptMD5File(@Nullable String filePath) {
        return encryptMD5File(filePath == null || filePath.length() == 0 ? null : new File(filePath));
    }

    @Nullable
    public final String encryptMD5File2String(@Nullable String filePath) {
        return encryptMD5File2String(filePath == null || filePath.length() == 0 ? null : new File(filePath));
    }

    @Nullable
    public final String encryptMD5ToString(@Nullable String data) {
        if (data != null) {
            if (!(data.length() == 0)) {
                byte[] bytes = data.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                return encryptMD5ToString(bytes);
            }
        }
        return "";
    }

    @Nullable
    public final byte[] encryptRSA(@Nullable byte[] data, @Nullable byte[] publicKey, int keySize, @NotNull String transformation) {
        Intrinsics.checkNotNullParameter(transformation, "transformation");
        return rsaTemplate(data, publicKey, keySize, transformation, true);
    }

    @Nullable
    public final byte[] encryptRSA2Base64(@Nullable byte[] data, @Nullable byte[] publicKey, int keySize, @NotNull String transformation) {
        Intrinsics.checkNotNullParameter(transformation, "transformation");
        return EncodeUtils.INSTANCE.base64Encode(encryptRSA(data, publicKey, keySize, transformation));
    }

    @Nullable
    public final String encryptRSA2HexString(@Nullable byte[] data, @Nullable byte[] publicKey, int keySize, @NotNull String transformation) {
        Intrinsics.checkNotNullParameter(transformation, "transformation");
        return ConvertUtils.INSTANCE.bytes2HexString(encryptRSA(data, publicKey, keySize, transformation));
    }

    @Nullable
    public final byte[] hashTemplate(@Nullable byte[] data, @NotNull String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        if (data == null) {
            return null;
        }
        if (data.length == 0) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
            Intrinsics.checkNotNullExpressionValue(messageDigest, "MessageDigest.getInstance(algorithm)");
            messageDigest.update(data);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Nullable
    public final String encryptMD5ToString(@Nullable String data, @Nullable String salt) {
        if (data == null && salt == null) {
            return "";
        }
        if (salt == null) {
            ConvertUtils convertUtils = ConvertUtils.INSTANCE;
            Intrinsics.checkNotNull(data);
            Charset charset = Charsets.UTF_8;
            if (data == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = data.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            return convertUtils.bytes2HexString(encryptMD5(bytes));
        }
        if (data == null) {
            ConvertUtils convertUtils2 = ConvertUtils.INSTANCE;
            byte[] bytes2 = salt.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes2, "(this as java.lang.String).getBytes(charset)");
            return convertUtils2.bytes2HexString(encryptMD5(bytes2));
        }
        ConvertUtils convertUtils3 = ConvertUtils.INSTANCE;
        String str = data + salt;
        Charset charset2 = Charsets.UTF_8;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes3 = str.getBytes(charset2);
        Intrinsics.checkNotNullExpressionValue(bytes3, "(this as java.lang.String).getBytes(charset)");
        return convertUtils3.bytes2HexString(encryptMD5(bytes3));
    }

    @Nullable
    public final byte[] encryptMD5File(@Nullable File file) throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArrDigest = null;
        try {
            try {
                if (file == null) {
                    return null;
                }
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                        Intrinsics.checkNotNullExpressionValue(messageDigest, "MessageDigest.getInstance(\"MD5\")");
                        DigestInputStream digestInputStream = new DigestInputStream(fileInputStream, messageDigest);
                        while (digestInputStream.read(new byte[262144]) > 0) {
                        }
                        MessageDigest messageDigest2 = digestInputStream.getMessageDigest();
                        Intrinsics.checkNotNullExpressionValue(messageDigest2, "digestInputStream.getMessageDigest()");
                        bArrDigest = messageDigest2.digest();
                        fileInputStream.close();
                    } catch (IOException e2) {
                        e = e2;
                        e.printStackTrace();
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return bArrDigest;
                    } catch (NoSuchAlgorithmException e3) {
                        e = e3;
                        e.printStackTrace();
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return bArrDigest;
                    }
                } catch (IOException e4) {
                    e = e4;
                    fileInputStream = null;
                } catch (NoSuchAlgorithmException e5) {
                    e = e5;
                    fileInputStream = null;
                } catch (Throwable th) {
                    fileInputStream = null;
                    th = th;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e7) {
                e7.printStackTrace();
            }
            return bArrDigest;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Nullable
    public final String encryptMD5File2String(@Nullable File file) {
        return ConvertUtils.INSTANCE.bytes2HexString(encryptMD5File(file));
    }

    @Nullable
    public final String encryptMD5ToString(@Nullable byte[] data) {
        return ConvertUtils.INSTANCE.bytes2HexString(encryptMD5(data));
    }

    @Nullable
    public final String encryptMD5ToString(@Nullable byte[] data, @Nullable byte[] salt) {
        if (data == null && salt == null) {
            return "";
        }
        if (salt == null) {
            return ConvertUtils.INSTANCE.bytes2HexString(encryptMD5(data));
        }
        if (data == null) {
            return ConvertUtils.INSTANCE.bytes2HexString(encryptMD5(salt));
        }
        byte[] bArr = new byte[data.length + salt.length];
        System.arraycopy(data, 0, bArr, 0, data.length);
        System.arraycopy(salt, 0, bArr, data.length, salt.length);
        return ConvertUtils.INSTANCE.bytes2HexString(encryptMD5(bArr));
    }
}
