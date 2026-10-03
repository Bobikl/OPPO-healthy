package com.google.security.cryptauth.lib.securegcm;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.security.cryptauth.lib.securemessage.CryptoOps;
import com.google.security.cryptauth.lib.securemessage.PublicKeyProtoUtil;
import com.google.security.cryptauth.lib.securemessage.SecureMessageBuilder;
import com.google.security.cryptauth.lib.securemessage.SecureMessageParser;
import com.google.security.cryptauth.lib.securemessage.SecureMessageProto;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class EnrollmentCryptoOps {
    private static final String KA_ALG = "ECDH";
    private static final String LEGACY_KA_ALG = "DH";
    private static final CryptoOps.SigType OUTER_SIG_TYPE = CryptoOps.SigType.HMAC_SHA256;
    private static final CryptoOps.EncType OUTER_ENC_TYPE = CryptoOps.EncType.AES_256_CBC;
    private static final CryptoOps.SigType INNER_SIG_TYPE = CryptoOps.SigType.ECDSA_P256_SHA256;
    private static final CryptoOps.SigType LEGACY_INNER_SIG_TYPE = CryptoOps.SigType.RSA2048_SHA256;

    private EnrollmentCryptoOps() {
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0097  */
    public static SecureGcmProto.GcmDeviceInfo decryptEnrollmentMessage(byte[] bArr, SecretKey secretKey, boolean z) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        boolean z2;
        if (bArr == null || secretKey == null) {
            throw null;
        }
        try {
            SecureMessageProto.HeaderAndBody signCryptedMessage = SecureMessageParser.parseSignCryptedMessage(SecureMessageProto.SecureMessage.parseFrom(bArr), secretKey, OUTER_SIG_TYPE, secretKey, OUTER_ENC_TYPE);
            SecureGcmProto.GcmMetadata from = SecureGcmProto.GcmMetadata.parseFrom(signCryptedMessage.getHeader().getPublicMetadata());
            SecureMessageProto.SecureMessage from2 = SecureMessageProto.SecureMessage.parseFrom(signCryptedMessage.getBody());
            byte[] byteArray = SecureMessageParser.getUnverifiedHeader(from2).getVerificationKeyId().toByteArray();
            SecureMessageProto.HeaderAndBody signedCleartextMessage = SecureMessageParser.parseSignedCleartextMessage(from2, KeyEncoding.parseUserPublicKey(byteArray), z ? LEGACY_INNER_SIG_TYPE : INNER_SIG_TYPE);
            SecureGcmProto.GcmDeviceInfo from3 = SecureGcmProto.GcmDeviceInfo.parseFrom(signedCleartextMessage.getBody());
            if (from.getType() == TransportCryptoOps.PayloadType.ENROLLMENT.getType()) {
                z2 = from.getVersion() <= 1 && signCryptedMessage.getHeader().getVerificationKeyId().isEmpty() && signedCleartextMessage.getHeader().getPublicMetadata().isEmpty() && Arrays.equals(byteArray, from3.getUserPublicKey().toByteArray()) && Arrays.equals(getMasterKeyHash(secretKey), from3.getDeviceMasterKeyHash().toByteArray());
            }
            if (z2) {
                return from3;
            }
            throw new SignatureException();
        } catch (InvalidProtocolBufferException e) {
            throw new SignatureException(e);
        } catch (InvalidKeySpecException e2) {
            throw new SignatureException(e2);
        }
    }

    public static SecretKey doKeyAgreement(PrivateKey privateKey, PublicKey publicKey) throws InvalidKeyException {
        try {
            KeyAgreement keyAgreement = KeyAgreement.getInstance(KeyEncoding.isLegacyPrivateKey(privateKey) ? LEGACY_KA_ALG : KA_ALG);
            keyAgreement.init(privateKey);
            keyAgreement.doPhase(publicKey, true);
            return KeyEncoding.parseMasterKey(sha256(keyAgreement.generateSecret()));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] encryptEnrollmentMessage(SecureGcmProto.GcmDeviceInfo gcmDeviceInfo, SecretKey secretKey, PrivateKey privateKey) throws NoSuchAlgorithmException, InvalidKeyException {
        if (gcmDeviceInfo == null || secretKey == null || privateKey == null) {
            throw null;
        }
        if (Arrays.equals(gcmDeviceInfo.getDeviceMasterKeyHash().toByteArray(), getMasterKeyHash(secretKey))) {
            return new SecureMessageBuilder().setVerificationKeyId(new byte[0]).setPublicMetadata(SecureGcmProto.GcmMetadata.newBuilder().setType(TransportCryptoOps.PayloadType.ENROLLMENT.getType()).setVersion(1).build().toByteArray()).buildSignCryptedMessage(secretKey, OUTER_SIG_TYPE, secretKey, OUTER_ENC_TYPE, new SecureMessageBuilder().setVerificationKeyId(gcmDeviceInfo.getUserPublicKey().toByteArray()).buildSignedCleartextMessage(privateKey, KeyEncoding.isLegacyPrivateKey(privateKey) ? LEGACY_INNER_SIG_TYPE : INNER_SIG_TYPE, gcmDeviceInfo.toByteArray()).toByteArray()).toByteArray();
        }
        throw new IllegalArgumentException("DeviceMasterKeyHash not set correctly");
    }

    public static KeyPair generateEnrollmentKeyAgreementKeyPair(boolean z) {
        return z ? PublicKeyProtoUtil.generateDh2048KeyPair() : PublicKeyProtoUtil.generateEcP256KeyPair();
    }

    public static byte[] getMasterKeyHash(SecretKey secretKey) {
        return sha256(secretKey.getEncoded());
    }

    public static byte[] sha256(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
