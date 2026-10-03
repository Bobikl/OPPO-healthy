package com.google.security.cryptauth.lib.securemessage;

import androidx.annotation.Nullable;
import com.google.security.cryptauth.utils.SystemUtils;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes14.dex */
public class CryptoOps {
    private static final String AES_CBC_PKCS5_PADDING = "AES/CBC/PKCS5Padding";
    private static final String ALGORITHM_AES = "AES";
    public static final int DIGEST_LENGTH = 20;
    private static final String INVALID_DO_NOT_USE_FOR_JCA = "InvalidDoNotUseForJCA";
    private static final String SHA_256_WITH_ECDSA = "SHA256withECDSA";
    private static final String SHA_256_WITH_RSA = "SHA256withECDSA";
    private static final String SYMBOL_ENC = "ENC:";
    private static final String SYMBOL_SIG = "SIG:";
    private static final byte[] SALT = sha256("SecureMessage");
    private static final byte[] CONSTANT_01 = {1};

    public enum EncType {
        NONE(SecureMessageProto.EncScheme.NONE, CryptoOps.INVALID_DO_NOT_USE_FOR_JCA),
        AES_256_CBC(SecureMessageProto.EncScheme.AES_256_CBC, "AES/CBC/PKCS5Padding");

        private final SecureMessageProto.EncScheme mEncScheme;
        private final String mJcaName;

        EncType(SecureMessageProto.EncScheme encScheme, String str) {
            this.mEncScheme = encScheme;
            this.mJcaName = str;
        }

        public SecureMessageProto.EncScheme getEncScheme() {
            return this.mEncScheme;
        }

        public String getJcaName() {
            return this.mJcaName;
        }

        public static EncType valueOf(SecureMessageProto.EncScheme encScheme) {
            for (EncType encType : values()) {
                if (encType.mEncScheme.equals(encScheme)) {
                    return encType;
                }
            }
            throw new IllegalArgumentException("Unsupported EncType: " + encScheme);
        }
    }

    public enum SigType {
        HMAC_SHA256(SecureMessageProto.SigScheme.HMAC_SHA256, "HmacSHA256", false),
        ECDSA_P256_SHA256(SecureMessageProto.SigScheme.ECDSA_P256_SHA256, "SHA256withECDSA", true),
        RSA2048_SHA256(SecureMessageProto.SigScheme.RSA2048_SHA256, "SHA256withECDSA", true);

        private final String mJcaName;
        private final boolean mPublicKeyScheme;
        private final SecureMessageProto.SigScheme mSigScheme;

        SigType(SecureMessageProto.SigScheme sigScheme, String str, boolean z) {
            this.mSigScheme = sigScheme;
            this.mJcaName = str;
            this.mPublicKeyScheme = z;
        }

        public String getJcaName() {
            return this.mJcaName;
        }

        public SecureMessageProto.SigScheme getSigScheme() {
            return this.mSigScheme;
        }

        public boolean isPublicKeyScheme() {
            return this.mPublicKeyScheme;
        }

        public static SigType valueOf(SecureMessageProto.SigScheme sigScheme) {
            for (SigType sigType : values()) {
                if (sigType.mSigScheme.equals(sigScheme)) {
                    return sigType;
                }
            }
            throw new IllegalArgumentException("Unsupported SigType: " + sigScheme);
        }
    }

    private CryptoOps() {
    }

    public static byte[] concat(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        if (bArr == null && bArr2 == null) {
            return new byte[0];
        }
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null) {
            return bArr;
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        SystemUtils.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        SystemUtils.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static boolean constantTimeArrayEquals(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return bArr == bArr2;
        }
        if (bArr.length != bArr2.length) {
            return false;
        }
        byte b = 0;
        for (int i = 0; i < bArr2.length; i++) {
            b = (byte) (b | (bArr[i] ^ bArr2[i]));
        }
        return b == 0;
    }

    public static byte[] decrypt(Key key, EncType encType, byte[] bArr, byte[] bArr2) throws BadPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (key == null || bArr == null || bArr2 == null) {
            throw null;
        }
        if (encType == EncType.NONE) {
            throw new NoSuchAlgorithmException("Cannot use NONE type here");
        }
        try {
            Cipher cipher = Cipher.getInstance(encType.getJcaName());
            cipher.init(2, deriveAes256KeyFor(getSecretKey(key), getPurpose(encType)), new IvParameterSpec(bArr));
            return cipher.doFinal(bArr2);
        } catch (NoSuchPaddingException e2) {
            throw new AssertionError(e2);
        }
    }

    public static SecretKey deriveAes256KeyFor(SecretKey secretKey, String str) throws NoSuchAlgorithmException, InvalidKeyException {
        return new SecretKeySpec(hkdf(secretKey, SALT, utf8StringToBytes(str)), "AES");
    }

    public static byte[] digest(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] bArr2 = new byte[20];
        SystemUtils.arraycopy(MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256).digest(bArr), 0, bArr2, 0, 20);
        return bArr2;
    }

    public static byte[] encrypt(Key key, EncType encType, @Nullable SecureRandom secureRandom, byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, InvalidKeyException {
        if (key == null || bArr == null || bArr2 == null) {
            throw null;
        }
        if (encType == EncType.NONE) {
            throw new NoSuchAlgorithmException("Cannot use NONE type here");
        }
        try {
            Cipher cipher = Cipher.getInstance(encType.getJcaName());
            cipher.init(1, deriveAes256KeyFor(getSecretKey(key), getPurpose(encType)), new IvParameterSpec(bArr), secureRandom);
            return cipher.doFinal(bArr2);
        } catch (InvalidAlgorithmParameterException | BadPaddingException | IllegalBlockSizeException e2) {
            throw new AssertionError(e2);
        } catch (NoSuchPaddingException e3) {
            throw new NoSuchAlgorithmException(e3);
        }
    }

    public static byte[] generateIv(EncType encType, SecureRandom secureRandom) throws NoSuchAlgorithmException {
        secureRandom.getClass();
        try {
            byte[] bArr = new byte[Cipher.getInstance(encType.getJcaName()).getBlockSize()];
            secureRandom.nextBytes(bArr);
            return bArr;
        } catch (NoSuchPaddingException e2) {
            throw new NoSuchAlgorithmException(e2);
        }
    }

    public static String getPurpose(SigType sigType) {
        return SYMBOL_SIG + sigType.getSigScheme().getNumber();
    }

    private static SecretKey getSecretKey(Key key) throws InvalidKeyException {
        if (key instanceof SecretKey) {
            return (SecretKey) key;
        }
        throw new InvalidKeyException("Expected a SecretKey");
    }

    public static byte[] hkdf(SecretKey secretKey, byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, InvalidKeyException {
        if (secretKey == null || bArr == null || bArr2 == null) {
            throw null;
        }
        return hkdfSha256Expand(hkdfSha256Extract(secretKey, bArr), bArr2);
    }

    private static byte[] hkdfSha256Expand(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException {
        Mac mac = Mac.getInstance("HmacSHA256");
        try {
            mac.init(new SecretKeySpec(bArr, "AES"));
            mac.update(bArr2);
            return mac.doFinal(CONSTANT_01);
        } catch (InvalidKeyException e2) {
            throw new AssertionError(e2);
        }
    }

    private static byte[] hkdfSha256Extract(SecretKey secretKey, byte[] bArr) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance("HmacSHA256");
        try {
            mac.init(new SecretKeySpec(bArr, "AES"));
            byte[] encoded = secretKey.getEncoded();
            if (encoded != null) {
                return mac.doFinal(encoded);
            }
            throw new InvalidKeyException("Cannot get encoded form of SecretKey");
        } catch (InvalidKeyException e2) {
            throw new AssertionError(e2);
        }
    }

    public static byte[] sha256(String str) {
        try {
            return MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256).digest(utf8StringToBytes(str));
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("No security provider initialized yet?", e2);
        }
    }

    public static byte[] sign(SigType sigType, Key key, @Nullable SecureRandom secureRandom, byte[] bArr) throws NoSuchAlgorithmException, InvalidKeyException {
        if (key == null || bArr == null) {
            throw null;
        }
        if (!sigType.isPublicKeyScheme()) {
            Mac mac = Mac.getInstance(sigType.getJcaName());
            mac.init(deriveAes256KeyFor(getSecretKey(key), getPurpose(sigType)));
            return mac.doFinal(bArr);
        }
        secureRandom.getClass();
        if (!(key instanceof PrivateKey)) {
            throw new InvalidKeyException("Expected a PrivateKey");
        }
        Signature signature = Signature.getInstance(sigType.getJcaName());
        signature.initSign((PrivateKey) key, secureRandom);
        try {
            signature.update(SALT);
            signature.update(bArr);
            return signature.sign();
        } catch (SignatureException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static byte[] subarray(byte[] bArr, int i, int i2) {
        bArr.getClass();
        int i3 = i2 - i;
        if (i3 < 0 || i < 0 || i2 < 0 || i >= bArr.length || i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        byte[] bArr2 = new byte[i3];
        if (i3 > 0) {
            SystemUtils.arraycopy(bArr, i, bArr2, 0, i3);
        }
        return bArr2;
    }

    public static byte[] utf8StringToBytes(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }

    public static boolean verify(Key key, SigType sigType, byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        if (key == null || bArr == null || bArr2 == null) {
            throw null;
        }
        if (!sigType.isPublicKeyScheme()) {
            Mac mac = Mac.getInstance(sigType.getJcaName());
            mac.init(deriveAes256KeyFor(getSecretKey(key), getPurpose(sigType)));
            return constantTimeArrayEquals(bArr, mac.doFinal(bArr2));
        }
        if (!(key instanceof PublicKey)) {
            throw new InvalidKeyException("Expected a PublicKey");
        }
        Signature signature = Signature.getInstance(sigType.getJcaName());
        signature.initVerify((PublicKey) key);
        signature.update(SALT);
        signature.update(bArr2);
        return signature.verify(bArr);
    }

    public static String getPurpose(EncType encType) {
        return SYMBOL_ENC + encType.getEncScheme().getNumber();
    }
}
