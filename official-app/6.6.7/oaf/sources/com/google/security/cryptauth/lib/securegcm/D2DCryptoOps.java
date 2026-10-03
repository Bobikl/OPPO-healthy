package com.google.security.cryptauth.lib.securegcm;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.security.cryptauth.lib.securemessage.CryptoOps;
import com.google.security.cryptauth.lib.securemessage.PublicKeyProtoUtil;
import com.google.security.cryptauth.lib.securemessage.SecureMessageBuilder;
import com.google.security.cryptauth.lib.securemessage.SecureMessageParser;
import com.google.security.cryptauth.lib.securemessage.SecureMessageProto;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
class D2DCryptoOps {
    public static final byte[] SALT = {-126, -86, 85, -96, -45, -105, -8, -125, 70, -54, 28, -18, -115, 57, 9, -71, 95, 19, -6, 125, -21, 29, 74, -77, -125, 118, -72, 37, 109, -88, 85, 16};

    private D2DCryptoOps() {
    }

    public static DeviceToDeviceMessagesProto.DeviceToDeviceMessage decryptResponderHelloMessage(SecretKey secretKey, byte[] bArr) throws SignatureException {
        try {
            TransportCryptoOps.Payload payloadVerifydecryptPayload = verifydecryptPayload(bArr, secretKey);
            if (TransportCryptoOps.PayloadType.DEVICE_TO_DEVICE_RESPONDER_HELLO_PAYLOAD.equals(payloadVerifydecryptPayload.getPayloadType())) {
                return DeviceToDeviceMessagesProto.DeviceToDeviceMessage.parseFrom(payloadVerifydecryptPayload.getMessage());
            }
            throw new SignatureException("wrong message type in responder hello");
        } catch (InvalidProtocolBufferException e) {
            throw new SignatureException(e);
        } catch (InvalidKeyException e2) {
            throw new SignatureException(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new SignatureException(e3);
        }
    }

    public static SecretKey deriveNewKeyForPurpose(SecretKey secretKey, String str) throws NoSuchAlgorithmException, InvalidKeyException {
        return KeyEncoding.parseMasterKey(CryptoOps.hkdf(secretKey, SALT, str.getBytes()));
    }

    public static SecretKey deriveSharedKeyFromGenericPublicKey(PrivateKey privateKey, SecureMessageProto.GenericPublicKey genericPublicKey) throws SignatureException {
        try {
            return EnrollmentCryptoOps.doKeyAgreement(privateKey, PublicKeyProtoUtil.parsePublicKey(genericPublicKey));
        } catch (InvalidKeyException e) {
            throw new SignatureException(e);
        } catch (InvalidKeySpecException e2) {
            throw new SignatureException(e2);
        }
    }

    public static DeviceToDeviceMessagesProto.ResponderHello parseAndValidateResponderHello(byte[] bArr) throws InvalidProtocolBufferException {
        bArr.getClass();
        SecureMessageProto.Header unverifiedHeader = SecureMessageParser.getUnverifiedHeader(SecureMessageProto.SecureMessage.parseFrom(bArr));
        if (!unverifiedHeader.hasDecryptionKeyId()) {
            throw new InvalidProtocolBufferException("Missing decryption key id");
        }
        DeviceToDeviceMessagesProto.ResponderHello from = DeviceToDeviceMessagesProto.ResponderHello.parseFrom(unverifiedHeader.getDecryptionKeyId().toByteArray());
        if (from.hasPublicDhKey()) {
            return from;
        }
        throw new InvalidProtocolBufferException("Missing public key in responder hello");
    }

    public static byte[] signcryptMessageAndResponderHello(TransportCryptoOps.Payload payload, SecretKey secretKey, PublicKey publicKey, int i) throws NoSuchAlgorithmException, InvalidKeyException {
        DeviceToDeviceMessagesProto.ResponderHello.Builder builderNewBuilder = DeviceToDeviceMessagesProto.ResponderHello.newBuilder();
        builderNewBuilder.setPublicDhKey(PublicKeyProtoUtil.encodePublicKey(publicKey));
        builderNewBuilder.setProtocolVersion(i);
        return signcryptPayload(payload, secretKey, builderNewBuilder.build().toByteArray());
    }

    public static byte[] signcryptPayload(TransportCryptoOps.Payload payload, SecretKey secretKey) throws NoSuchAlgorithmException, InvalidKeyException {
        return signcryptPayload(payload, secretKey, null);
    }

    public static TransportCryptoOps.Payload verifydecryptPayload(byte[] bArr, SecretKey secretKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        if (bArr == null || secretKey == null) {
            throw null;
        }
        try {
            SecureMessageProto.HeaderAndBody signCryptedMessage = SecureMessageParser.parseSignCryptedMessage(SecureMessageProto.SecureMessage.parseFrom(bArr), secretKey, CryptoOps.SigType.HMAC_SHA256, secretKey, CryptoOps.EncType.AES_256_CBC);
            if (!signCryptedMessage.getHeader().hasPublicMetadata()) {
                throw new SignatureException("missing metadata");
            }
            SecureGcmProto.GcmMetadata from = SecureGcmProto.GcmMetadata.parseFrom(signCryptedMessage.getHeader().getPublicMetadata());
            if (from.getVersion() <= 1) {
                return new TransportCryptoOps.Payload(TransportCryptoOps.PayloadType.valueOf(from.getType()), signCryptedMessage.getBody().toByteArray());
            }
            throw new SignatureException("Unsupported protocol version");
        } catch (InvalidProtocolBufferException e) {
            throw new SignatureException(e);
        } catch (IllegalArgumentException e2) {
            throw new SignatureException(e2);
        }
    }

    @VisibleForTesting
    public static byte[] signcryptPayload(TransportCryptoOps.Payload payload, SecretKey secretKey, @Nullable byte[] bArr) throws NoSuchAlgorithmException, InvalidKeyException {
        if (payload == null || secretKey == null) {
            throw null;
        }
        SecureMessageBuilder publicMetadata = new SecureMessageBuilder().setPublicMetadata(SecureGcmProto.GcmMetadata.newBuilder().setType(payload.getPayloadType().getType()).setVersion(1).build().toByteArray());
        if (bArr != null) {
            publicMetadata.setDecryptionKeyId(bArr);
        }
        return publicMetadata.buildSignCryptedMessage(secretKey, CryptoOps.SigType.HMAC_SHA256, secretKey, CryptoOps.EncType.AES_256_CBC, payload.getMessage()).toByteArray();
    }
}
