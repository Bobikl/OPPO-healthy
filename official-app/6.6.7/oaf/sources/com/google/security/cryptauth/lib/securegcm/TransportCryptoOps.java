package com.google.security.cryptauth.lib.securegcm;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.security.cryptauth.lib.securemessage.CryptoOps;
import com.google.security.cryptauth.lib.securemessage.SecureMessageBuilder;
import com.google.security.cryptauth.lib.securemessage.SecureMessageParser;
import com.google.security.cryptauth.lib.securemessage.SecureMessageProto;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class TransportCryptoOps {

    public static class Payload {
        private final byte[] mMessage;
        private final PayloadType mPayloadType;

        public Payload(PayloadType payloadType, byte[] bArr) {
            if (payloadType == null || bArr == null) {
                throw null;
            }
            this.mPayloadType = payloadType;
            this.mMessage = bArr;
        }

        public byte[] getMessage() {
            return this.mMessage;
        }

        public PayloadType getPayloadType() {
            return this.mPayloadType;
        }
    }

    public enum PayloadType {
        ENROLLMENT(SecureGcmProto.Type.ENROLLMENT),
        TICKLE(SecureGcmProto.Type.TICKLE),
        TX_REQUEST(SecureGcmProto.Type.TX_REQUEST),
        TX_REPLY(SecureGcmProto.Type.TX_REPLY),
        TX_SYNC_REQUEST(SecureGcmProto.Type.TX_SYNC_REQUEST),
        TX_SYNC_RESPONSE(SecureGcmProto.Type.TX_SYNC_RESPONSE),
        TX_PING(SecureGcmProto.Type.TX_PING),
        DEVICE_INFO_UPDATE(SecureGcmProto.Type.DEVICE_INFO_UPDATE),
        TX_CANCEL_REQUEST(SecureGcmProto.Type.TX_CANCEL_REQUEST),
        LOGIN_NOTIFICATION(SecureGcmProto.Type.LOGIN_NOTIFICATION),
        PROXIMITYAUTH_PAIRING(SecureGcmProto.Type.PROXIMITYAUTH_PAIRING),
        GCMV1_IDENTITY_ASSERTION(SecureGcmProto.Type.GCMV1_IDENTITY_ASSERTION),
        DEVICE_TO_DEVICE_RESPONDER_HELLO_PAYLOAD(SecureGcmProto.Type.DEVICE_TO_DEVICE_RESPONDER_HELLO_PAYLOAD),
        DEVICE_TO_DEVICE_MESSAGE(SecureGcmProto.Type.DEVICE_TO_DEVICE_MESSAGE),
        DEVICE_PROXIMITY_CALLBACK(SecureGcmProto.Type.DEVICE_PROXIMITY_CALLBACK),
        UNLOCK_KEY_SIGNED_CHALLENGE(SecureGcmProto.Type.UNLOCK_KEY_SIGNED_CHALLENGE);

        private final SecureGcmProto.Type mType;

        PayloadType(SecureGcmProto.Type type) {
            this.mType = type;
        }

        public SecureGcmProto.Type getType() {
            return this.mType;
        }

        public static PayloadType valueOf(SecureGcmProto.Type type) {
            return valueOf(type.getNumber());
        }

        public static PayloadType valueOf(int i) {
            for (PayloadType payloadType : values()) {
                if (payloadType.getType().getNumber() == i) {
                    return payloadType;
                }
            }
            throw new IllegalArgumentException("Unsupported payload type: " + i);
        }
    }

    private TransportCryptoOps() {
    }

    public static byte[] getEncodedUserPublicKeyFor(byte[] bArr) throws InvalidProtocolBufferException {
        bArr.getClass();
        return SecureMessageParser.getUnverifiedHeader(SecureMessageProto.SecureMessage.parseFrom(bArr)).getVerificationKeyId().toByteArray();
    }

    public static byte[] getKeyHandleFor(byte[] bArr) throws InvalidProtocolBufferException {
        bArr.getClass();
        return SecureMessageParser.getUnverifiedHeader(SecureMessageProto.SecureMessage.parseFrom(bArr)).getVerificationKeyId().toByteArray();
    }

    private static CryptoOps.SigType getSigTypeFor(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof ECPublicKey) {
            return CryptoOps.SigType.ECDSA_P256_SHA256;
        }
        if (publicKey instanceof RSAPublicKey) {
            return CryptoOps.SigType.RSA2048_SHA256;
        }
        throw new InvalidKeyException("Unsupported key type");
    }

    public static byte[] signcryptClientMessage(Payload payload, KeyPair keyPair, SecretKey secretKey) throws NoSuchAlgorithmException, InvalidKeyException {
        if (payload == null || secretKey == null) {
            throw null;
        }
        PublicKey publicKey = keyPair.getPublic();
        return new SecureMessageBuilder().setVerificationKeyId(KeyEncoding.encodeUserPublicKey(publicKey)).setPublicMetadata(SecureGcmProto.GcmMetadata.newBuilder().setType(payload.getPayloadType().getType()).setVersion(1).build().toByteArray()).buildSignCryptedMessage(keyPair.getPrivate(), getSigTypeFor(publicKey), secretKey, CryptoOps.EncType.AES_256_CBC, payload.getMessage()).toByteArray();
    }

    public static byte[] signcryptServerMessage(Payload payload, SecretKey secretKey, byte[] bArr) throws NoSuchAlgorithmException, InvalidKeyException {
        if (payload == null || secretKey == null || bArr == null) {
            throw null;
        }
        return new SecureMessageBuilder().setVerificationKeyId(bArr).setPublicMetadata(SecureGcmProto.GcmMetadata.newBuilder().setType(payload.getPayloadType().getType()).setVersion(1).build().toByteArray()).buildSignCryptedMessage(secretKey, CryptoOps.SigType.HMAC_SHA256, secretKey, CryptoOps.EncType.AES_256_CBC, payload.getMessage()).toByteArray();
    }

    public static Payload verifydecryptClientMessage(byte[] bArr, PublicKey publicKey, SecretKey secretKey) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException {
        if (bArr == null || secretKey == null) {
            throw null;
        }
        try {
            SecureMessageProto.HeaderAndBody signCryptedMessage = SecureMessageParser.parseSignCryptedMessage(SecureMessageProto.SecureMessage.parseFrom(bArr), publicKey, getSigTypeFor(publicKey), secretKey, CryptoOps.EncType.AES_256_CBC);
            SecureGcmProto.GcmMetadata from = SecureGcmProto.GcmMetadata.parseFrom(signCryptedMessage.getHeader().getPublicMetadata());
            if (from.getVersion() <= 1) {
                return new Payload(PayloadType.valueOf(from.getType()), signCryptedMessage.getBody().toByteArray());
            }
            throw new SignatureException("Unsupported protocol version");
        } catch (InvalidProtocolBufferException | IllegalArgumentException e) {
            throw new SignatureException(e);
        }
    }

    public static Payload verifydecryptServerMessage(byte[] bArr, SecretKey secretKey) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException {
        if (bArr == null || secretKey == null) {
            throw null;
        }
        try {
            SecureMessageProto.HeaderAndBody signCryptedMessage = SecureMessageParser.parseSignCryptedMessage(SecureMessageProto.SecureMessage.parseFrom(bArr), secretKey, CryptoOps.SigType.HMAC_SHA256, secretKey, CryptoOps.EncType.AES_256_CBC);
            SecureGcmProto.GcmMetadata from = SecureGcmProto.GcmMetadata.parseFrom(signCryptedMessage.getHeader().getPublicMetadata());
            if (from.getVersion() <= 1) {
                return new Payload(PayloadType.valueOf(from.getType()), signCryptedMessage.getBody().toByteArray());
            }
            throw new SignatureException("Unsupported protocol version");
        } catch (InvalidProtocolBufferException | IllegalArgumentException e) {
            throw new SignatureException(e);
        }
    }
}
