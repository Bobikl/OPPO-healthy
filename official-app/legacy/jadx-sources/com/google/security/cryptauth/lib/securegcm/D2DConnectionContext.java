package com.google.security.cryptauth.lib.securegcm;

import androidx.annotation.VisibleForTesting;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.Arrays;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes14.dex */
public abstract class D2DConnectionContext {
    private static final int SAVED_SESSION_INFO_LENGTH_37 = 37;
    private static final int SAVED_SESSION_INFO_LENGTH_73 = 73;
    private static final String UTF8 = "UTF-8";
    private final int mProtocolVersion;

    public D2DConnectionContext(int i) {
        this.mProtocolVersion = i;
    }

    public static int bytesToSignedInt(byte[] bArr) {
        if (bArr.length == 4) {
            return (bArr[3] & 255) | ((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280);
        }
        throw new IllegalArgumentException("Expected 4 bytes to encode int, but got: " + bArr.length + " bytes");
    }

    public static DeviceToDeviceMessagesProto.DeviceToDeviceMessage createDeviceToDeviceMessage(byte[] bArr, int i) {
        DeviceToDeviceMessagesProto.DeviceToDeviceMessage.Builder builderNewBuilder = DeviceToDeviceMessagesProto.DeviceToDeviceMessage.newBuilder();
        builderNewBuilder.setSequenceNumber(i);
        builderNewBuilder.setMessage(ByteString.copyFrom(bArr));
        return builderNewBuilder.build();
    }

    public static D2DConnectionContext fromSavedSession(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("savedSessionInfo null or too short");
        }
        int i = bArr[0] & 255;
        if (i == 0) {
            if (bArr.length == 37) {
                return new D2DConnectionContextV0(new SecretKeySpec(Arrays.copyOfRange(bArr, 5, 37), "AES"), bytesToSignedInt(Arrays.copyOfRange(bArr, 1, 5)));
            }
            throw new IllegalArgumentException("Incorrect data length (" + bArr.length + ") for v0 protocol");
        }
        if (i != 1) {
            throw new IllegalArgumentException("Cannot rebuild context, unkown protocol version: " + i);
        }
        if (bArr.length != 73) {
            throw new IllegalArgumentException("Incorrect data length for v1 protocol");
        }
        return new D2DConnectionContextV1(new SecretKeySpec(Arrays.copyOfRange(bArr, 9, 41), "AES"), new SecretKeySpec(Arrays.copyOfRange(bArr, 41, 73), "AES"), bytesToSignedInt(Arrays.copyOfRange(bArr, 1, 5)), bytesToSignedInt(Arrays.copyOfRange(bArr, 5, 9)));
    }

    public static byte[] signedIntToBytes(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public byte[] decodeMessageFromPeer(byte[] bArr) throws SignatureException {
        try {
            TransportCryptoOps.Payload payloadVerifydecryptPayload = D2DCryptoOps.verifydecryptPayload(bArr, getDecodeKey());
            if (!TransportCryptoOps.PayloadType.DEVICE_TO_DEVICE_MESSAGE.equals(payloadVerifydecryptPayload.getPayloadType())) {
                throw new SignatureException("wrong message type in device-to-device message");
            }
            DeviceToDeviceMessagesProto.DeviceToDeviceMessage from = DeviceToDeviceMessagesProto.DeviceToDeviceMessage.parseFrom(payloadVerifydecryptPayload.getMessage());
            incrementSequenceNumberForDecoding();
            if (from.getSequenceNumber() == getSequenceNumberForDecoding()) {
                return from.getMessage().toByteArray();
            }
            throw new SignatureException("Incorrect sequence number");
        } catch (InvalidProtocolBufferException e2) {
            throw new SignatureException(e2);
        } catch (InvalidKeyException e3) {
            throw new SignatureException(e3);
        } catch (NoSuchAlgorithmException e4) {
            throw new RuntimeException(e4);
        }
    }

    public String decodeMessageFromPeerAsString(byte[] bArr) throws SignatureException {
        try {
            return new String(decodeMessageFromPeer(bArr), "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public byte[] encodeMessageToPeer(byte[] bArr) {
        incrementSequenceNumberForEncoding();
        try {
            return D2DCryptoOps.signcryptPayload(new TransportCryptoOps.Payload(TransportCryptoOps.PayloadType.DEVICE_TO_DEVICE_MESSAGE, createDeviceToDeviceMessage(bArr, getSequenceNumberForEncoding()).toByteArray()), getEncodeKey());
        } catch (InvalidKeyException e2) {
            throw new RuntimeException(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new RuntimeException(e3);
        }
    }

    @VisibleForTesting
    public abstract SecretKey getDecodeKey();

    @VisibleForTesting
    public abstract SecretKey getEncodeKey();

    @VisibleForTesting
    public abstract int getSequenceNumberForDecoding();

    @VisibleForTesting
    public abstract int getSequenceNumberForEncoding();

    public abstract byte[] getSessionUnique() throws NoSuchAlgorithmException;

    public int getmProtocolVersion() {
        return this.mProtocolVersion;
    }

    public abstract void incrementSequenceNumberForDecoding();

    public abstract void incrementSequenceNumberForEncoding();

    public abstract byte[] saveSession();

    public byte[] encodeMessageToPeer(String str) {
        try {
            return encodeMessageToPeer(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }
}
