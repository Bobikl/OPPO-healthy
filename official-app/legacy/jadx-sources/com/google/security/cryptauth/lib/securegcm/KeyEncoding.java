package com.google.security.cryptauth.lib.securegcm;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.security.cryptauth.lib.securemessage.PublicKeyProtoUtil;
import com.google.security.cryptauth.lib.securemessage.SecureMessageProto;
import com.oplus.aiunit.vision.apj;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes14.dex */
public class KeyEncoding {
    private static final String SYMMETRIC_KEY_ENCODING_ALG = "AES";
    private static boolean simulateLegacyCryptoRequired = false;

    private KeyEncoding() {
    }

    public static byte[] encodeKeyAgreementPrivateKey(PrivateKey privateKey) {
        return isLegacyPrivateKey(privateKey) ? PublicKeyProtoUtil.encodeDh2048PrivateKey((DHPrivateKey) privateKey) : privateKey.getEncoded();
    }

    public static byte[] encodeKeyAgreementPublicKey(PublicKey publicKey) {
        return encodePublicKey(publicKey);
    }

    public static byte[] encodeMasterKey(SecretKey secretKey) {
        return secretKey.getEncoded();
    }

    private static byte[] encodePublicKey(PublicKey publicKey) {
        return PublicKeyProtoUtil.encodePublicKey(publicKey).toByteArray();
    }

    public static byte[] encodeSigningPrivateKey(PrivateKey privateKey) {
        return privateKey.getEncoded();
    }

    public static byte[] encodeSigningPublicKey(PublicKey publicKey) {
        return encodePublicKey(publicKey);
    }

    public static byte[] encodeUserPrivateKey(PrivateKey privateKey) {
        return privateKey.getEncoded();
    }

    public static byte[] encodeUserPublicKey(PublicKey publicKey) {
        return encodePublicKey(publicKey);
    }

    public static KeyFactory getEcKeyFactory() {
        try {
            return KeyFactory.getInstance(apj.Thread_Type_Executor_Cached);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static KeyFactory getRsaKeyFactory() {
        try {
            return KeyFactory.getInstance("RSA");
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static boolean isLegacyCryptoRequired() {
        return PublicKeyProtoUtil.isLegacyCryptoRequired() || simulateLegacyCryptoRequired;
    }

    public static boolean isLegacyPrivateKey(PrivateKey privateKey) {
        return !(privateKey instanceof ECPrivateKey);
    }

    public static boolean isLegacyPublicKey(PublicKey publicKey) {
        return !(publicKey instanceof ECPublicKey);
    }

    public static PrivateKey parseKeyAgreementPrivateKey(byte[] bArr, boolean z) throws InvalidKeySpecException {
        if (z) {
            return PublicKeyProtoUtil.parseDh2048PrivateKey(bArr);
        }
        return getEcKeyFactory().generatePrivate(new PKCS8EncodedKeySpec(bArr));
    }

    public static PublicKey parseKeyAgreementPublicKey(byte[] bArr) throws InvalidKeySpecException {
        return parsePublicKey(bArr);
    }

    public static SecretKey parseMasterKey(byte[] bArr) {
        return new SecretKeySpec(bArr, "AES");
    }

    private static PublicKey parsePublicKey(byte[] bArr) throws InvalidKeySpecException {
        try {
            return PublicKeyProtoUtil.parsePublicKey(SecureMessageProto.GenericPublicKey.parseFrom(bArr));
        } catch (InvalidProtocolBufferException e2) {
            throw new InvalidKeySpecException("Unable to parse GenericPublicKey", e2);
        } catch (IllegalArgumentException e3) {
            throw new InvalidKeySpecException("Unable to parse GenericPublicKey", e3);
        }
    }

    public static PrivateKey parseSigningPrivateKey(byte[] bArr) throws InvalidKeySpecException {
        return getEcKeyFactory().generatePrivate(new PKCS8EncodedKeySpec(bArr));
    }

    public static PublicKey parseSigningPublicKey(byte[] bArr) throws InvalidKeySpecException {
        return parsePublicKey(bArr);
    }

    public static PrivateKey parseUserPrivateKey(byte[] bArr, boolean z) throws InvalidKeySpecException {
        PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(bArr);
        return z ? getRsaKeyFactory().generatePrivate(pKCS8EncodedKeySpec) : getEcKeyFactory().generatePrivate(pKCS8EncodedKeySpec);
    }

    public static PublicKey parseUserPublicKey(byte[] bArr) throws InvalidKeySpecException {
        return parsePublicKey(bArr);
    }

    public static void setSimulateLegacyCrypto(boolean z) {
        simulateLegacyCryptoRequired = z;
    }
}
