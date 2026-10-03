package com.heytap.accessory.pair.utils;

import com.heytap.accessory.pair.logging.PairLog;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class SecurityUtils {
    public static final String AES_CBC_NOPADDING = "AES/CBC/NoPadding";
    private static final int AES_CTR_HMAC_LENGTH = 8;
    private static final int AES_CTR_NONCE_LENGTH = 8;
    private static final String AES_CTR_NOPADDING = "AES/CTR/NoPadding";
    private static final int EC_PRIKEY_LENGTH = 32;
    private static final int EC_PUBKEY_LENGTH = 64;
    private static final int EC_PUBKEY_X_LENGTH = 32;
    private static final int EC_PUBKEY_Y_LENGTH = 32;
    private static final int HMAC_SHA_8_LENGTH = 8;
    private static final int IV_LENGTH = 16;
    public static final String SECP256R1 = "secp256r1";
    private static final int SECRET_KEY_LENGTH = 16;
    private static final String TAG = "SecurityUtils";
    private static final byte[] opad = {92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92};
    private static final byte[] ipad = {54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54};

    private static byte[] aesCTR(SecretKeySpec secretKeySpec, IvParameterSpec ivParameterSpec, byte[] bArr, byte[] bArr2) throws Exception {
        int i = 16;
        int length = bArr.length % 16;
        int length2 = bArr.length / 16;
        if (length != 0) {
            length2++;
        }
        byte[] bArr3 = new byte[16];
        byte[] bArr4 = new byte[16];
        byte[] bArr5 = new byte[bArr.length];
        SystemUtils.arraycopy(bArr2, 0, bArr3, 16 - bArr2.length, bArr2.length);
        for (int i2 = 0; i2 < length2; i2++) {
            if (i2 == length2 - 1 && length != 0) {
                bArr4 = new byte[length];
                i = length;
            }
            bArr3[0] = (byte) i2;
            Cipher cipher = Cipher.getInstance(AES_CTR_NOPADDING);
            cipher.init(1, secretKeySpec, ivParameterSpec);
            byte[] bArrDoFinal = cipher.doFinal(bArr3);
            int i3 = i2 * 16;
            SystemUtils.arraycopy(bArr, i3, bArr4, 0, i);
            SystemUtils.arraycopy(byteArrayXor(bArr4, bArrDoFinal), 0, bArr5, i3, i);
        }
        return bArr5;
    }

    private static byte[] arrayConcat(byte[]... bArr) {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            SystemUtils.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    private static byte[] byteArrayXor(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    public static PrivateKey convertPrivateKey(byte[] bArr, ECParameterSpec eCParameterSpec) {
        PrivateKey privateKeyGeneratePrivate = null;
        if (bArr.length != 32) {
            PairLog.e(TAG, "rawBytes.length wrong");
            return null;
        }
        try {
            privateKeyGeneratePrivate = KeyFactory.getInstance("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), eCParameterSpec));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            PairLog.e(TAG, "convertPrivateKey: ex " + e);
        }
        if (privateKeyGeneratePrivate == null) {
            PairLog.e(TAG, "convertPrivateKey failed");
        }
        return privateKeyGeneratePrivate;
    }

    public static PublicKey convertPublicKey(byte[] bArr, ECParameterSpec eCParameterSpec) {
        if (bArr.length != 64) {
            return null;
        }
        byte[] bArr2 = new byte[32];
        byte[] bArr3 = new byte[32];
        SystemUtils.arraycopy(bArr, 0, bArr2, 0, 32);
        SystemUtils.arraycopy(bArr, 32, bArr3, 0, 32);
        try {
            return KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, bArr2), new BigInteger(1, bArr3)), eCParameterSpec));
        } catch (Exception e) {
            PairLog.e(TAG, "convertPublicKey: ex " + e);
            return null;
        }
    }

    public static byte[] convertPublicKeyByte(ECPublicKey eCPublicKey) {
        byte[] bArr = new byte[64];
        byte[] byteArray = eCPublicKey.getW().getAffineX().toByteArray();
        byte[] byteArray2 = eCPublicKey.getW().getAffineY().toByteArray();
        byte[] bArrMake32Bytes = make32Bytes(byteArray);
        byte[] bArrMake32Bytes2 = make32Bytes(byteArray2);
        SystemUtils.arraycopy(bArrMake32Bytes, 0, bArr, 0, bArrMake32Bytes.length);
        SystemUtils.arraycopy(bArrMake32Bytes2, 0, bArr, bArrMake32Bytes.length, bArrMake32Bytes2.length);
        return bArr;
    }

    public static byte[] decryptAES(Key key, IvParameterSpec ivParameterSpec, byte[] bArr) {
        try {
            Cipher cipher = Cipher.getInstance(AES_CBC_NOPADDING);
            cipher.init(2, key, ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            PairLog.e(TAG, "decryptAES: ex " + e);
            return null;
        }
    }

    public static byte[] decryptAESCTR(SecretKeySpec secretKeySpec, IvParameterSpec ivParameterSpec, byte[] bArr) {
        try {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 8);
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 8, 16);
            byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArr, 16, bArr.length);
            if (Arrays.equals(bArrCopyOfRange, hmacSha8(secretKeySpec.getEncoded(), bArrCopyOfRange2, bArrCopyOfRange3))) {
                return aesCTR(secretKeySpec, ivParameterSpec, bArrCopyOfRange3, bArrCopyOfRange2);
            }
            PairLog.d(TAG, "hmac not match");
            return null;
        } catch (Exception e) {
            PairLog.e(TAG, "decryptAESCTR: ex " + e);
            return null;
        }
    }

    public static byte[] encryptAES(Key key, IvParameterSpec ivParameterSpec, byte[] bArr) {
        try {
            Cipher cipher = Cipher.getInstance(AES_CBC_NOPADDING);
            cipher.init(1, key, ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            PairLog.e(TAG, "encryptAES: ex " + e);
            return null;
        }
    }

    public static byte[] encryptAESCTR(SecretKeySpec secretKeySpec, IvParameterSpec ivParameterSpec, byte[] bArr, SecureRandom secureRandom) {
        try {
            byte[] bArrGenerateSalt = generateSalt(secureRandom, 8);
            byte[] bArrAesCTR = aesCTR(secretKeySpec, ivParameterSpec, bArr, bArrGenerateSalt);
            return arrayConcat(hmacSha8(secretKeySpec.getEncoded(), bArrGenerateSalt, bArrAesCTR), bArrGenerateSalt, bArrAesCTR);
        } catch (Exception e) {
            PairLog.e(TAG, "encryptAESCTR: ex " + e);
            return null;
        }
    }

    public static KeyPair generateECKeys(String str) {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
            keyPairGenerator.initialize(new ECGenParameterSpec(str));
            return keyPairGenerator.generateKeyPair();
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException e) {
            PairLog.e(TAG, "generateECKeys: ex " + e);
            return null;
        }
    }

    public static byte[] generateSalt(SecureRandom secureRandom, int i) {
        byte[] bArr = new byte[i];
        secureRandom.nextBytes(bArr);
        return bArr;
    }

    public static byte[] generateSharedSecret(PrivateKey privateKey, PublicKey publicKey) {
        try {
            if (privateKey == null) {
                PairLog.e(TAG, "prik is null");
                return null;
            }
            if (publicKey == null) {
                PairLog.e(TAG, "pubk is null");
                return null;
            }
            KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
            keyAgreement.init(privateKey);
            keyAgreement.doPhase(publicKey, true);
            return Arrays.copyOfRange(MessageDigest.getInstance("SHA-256").digest(keyAgreement.generateSecret()), 0, 16);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            PairLog.e(TAG, "generateSharedSecret: ex " + e);
            return null;
        }
    }

    public static SecretKeySpec getAESKeySpec(byte[] bArr) {
        return new SecretKeySpec(bArr, AES_CBC_NOPADDING);
    }

    public static IvParameterSpec getIVSpec(byte[] bArr) {
        if (bArr != null && bArr.length == 16) {
            return new IvParameterSpec(bArr);
        }
        PairLog.e(TAG, "seekerIvSpec size is wrong");
        return null;
    }

    private static byte[] hmacSha8(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            byte[] bArr4 = new byte[64];
            SystemUtils.arraycopy(bArr, 0, bArr4, 0, bArr.length);
            return Arrays.copyOfRange(MessageDigest.getInstance("SHA-256").digest(arrayConcat(byteArrayXor(bArr4, opad), MessageDigest.getInstance("SHA-256").digest(arrayConcat(byteArrayXor(bArr4, ipad), bArr2, bArr3)))), 0, 8);
        } catch (Exception e) {
            PairLog.e(TAG, "hmacSha8: ex " + e);
            return null;
        }
    }

    private static byte[] make32Bytes(byte[] bArr) {
        if (bArr.length == 32) {
            return bArr;
        }
        if (bArr.length > 32) {
            return Arrays.copyOfRange(bArr, bArr.length - 32, bArr.length);
        }
        byte[] bArr2 = new byte[32];
        SystemUtils.arraycopy(bArr, 0, bArr2, 32 - bArr.length, bArr.length);
        return bArr2;
    }

    public static byte[] hmacSha8(byte[] bArr) {
        try {
            return Arrays.copyOfRange(MessageDigest.getInstance("SHA-256").digest(bArr), 0, 8);
        } catch (NoSuchAlgorithmException e) {
            PairLog.e(TAG, "hmacSha8: ex " + e);
            return new byte[0];
        }
    }
}
