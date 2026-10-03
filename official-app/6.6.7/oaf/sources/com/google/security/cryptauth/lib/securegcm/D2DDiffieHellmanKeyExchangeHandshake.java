package com.google.security.cryptauth.lib.securegcm;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.security.cryptauth.lib.securemessage.PublicKeyProtoUtil;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class D2DDiffieHellmanKeyExchangeHandshake implements D2DHandshakeContext {
    private static final String INITIATOR_PURPOSE = "initiator";
    private static final String RESPONDER_PURPOSE = "responder";
    private State mHandshakeState;
    private boolean mIsInitiator;
    private int mProtocolVersionToUse;
    private KeyPair mOurKeyPair = PublicKeyProtoUtil.generateEcP256KeyPair();
    private PublicKey mTheirPublicKey = null;
    private SecretKey mInitiatorEncodeKey = null;
    private SecretKey mResponderEncodeKey = null;

    public static /* synthetic */ class 1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$security$cryptauth$lib$securegcm$D2DDiffieHellmanKeyExchangeHandshake$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$com$google$security$cryptauth$lib$securegcm$D2DDiffieHellmanKeyExchangeHandshake$State = iArr;
            try {
                iArr[State.INITIATOR_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$D2DDiffieHellmanKeyExchangeHandshake$State[State.RESPONDER_AFTER_INITIATOR_HELLO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$D2DDiffieHellmanKeyExchangeHandshake$State[State.INITIATOR_WAITING_FOR_RESPONDER_HELLO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$D2DDiffieHellmanKeyExchangeHandshake$State[State.RESPONDER_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum State {
        INITIATOR_START,
        INITIATOR_WAITING_FOR_RESPONDER_HELLO,
        RESPONDER_START,
        RESPONDER_AFTER_INITIATOR_HELLO,
        HANDSHAKE_FINISHED,
        HANDSHAKE_ALREADY_USED
    }

    private D2DDiffieHellmanKeyExchangeHandshake(State state) {
        this.mHandshakeState = state;
        this.mIsInitiator = state == State.INITIATOR_START;
        this.mProtocolVersionToUse = 1;
    }

    public static D2DDiffieHellmanKeyExchangeHandshake forInitiator() {
        return new D2DDiffieHellmanKeyExchangeHandshake(State.INITIATOR_START);
    }

    public static D2DDiffieHellmanKeyExchangeHandshake forResponder() {
        return new D2DDiffieHellmanKeyExchangeHandshake(State.RESPONDER_START);
    }

    private byte[] makeResponderHelloWithPayload(byte[] bArr) throws HandshakeException {
        if (bArr == null) {
            throw new HandshakeException("Not expecting null payload");
        }
        try {
            SecretKey secretKeyDoKeyAgreement = EnrollmentCryptoOps.doKeyAgreement(this.mOurKeyPair.getPrivate(), this.mTheirPublicKey);
            int i = this.mProtocolVersionToUse;
            if (i == 0) {
                this.mInitiatorEncodeKey = secretKeyDoKeyAgreement;
                this.mResponderEncodeKey = secretKeyDoKeyAgreement;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("Unexpected protocol version: " + this.mProtocolVersionToUse);
                }
                this.mInitiatorEncodeKey = D2DCryptoOps.deriveNewKeyForPurpose(secretKeyDoKeyAgreement, INITIATOR_PURPOSE);
                this.mResponderEncodeKey = D2DCryptoOps.deriveNewKeyForPurpose(secretKeyDoKeyAgreement, RESPONDER_PURPOSE);
            }
            return D2DCryptoOps.signcryptMessageAndResponderHello(new TransportCryptoOps.Payload(TransportCryptoOps.PayloadType.DEVICE_TO_DEVICE_RESPONDER_HELLO_PAYLOAD, D2DConnectionContext.createDeviceToDeviceMessage(bArr, 1).toByteArray()), this.mResponderEncodeKey, this.mOurKeyPair.getPublic(), this.mProtocolVersionToUse);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new HandshakeException(e);
        }
    }

    private void parseInitiatorHello(byte[] bArr) throws HandshakeException {
        try {
            DeviceToDeviceMessagesProto.InitiatorHello from = DeviceToDeviceMessagesProto.InitiatorHello.parseFrom(bArr);
            if (!from.hasPublicDhKey()) {
                throw new HandshakeException("Missing public key in initiator hello");
            }
            this.mTheirPublicKey = PublicKeyProtoUtil.parsePublicKey(from.getPublicDhKey());
            if (from.getProtocolVersion() == 0) {
                this.mProtocolVersionToUse = 0;
            }
        } catch (InvalidProtocolBufferException | InvalidKeySpecException e) {
            throw new HandshakeException(e);
        }
    }

    private byte[] parseResponderHello(byte[] bArr) throws HandshakeException {
        try {
            DeviceToDeviceMessagesProto.ResponderHello andValidateResponderHello = D2DCryptoOps.parseAndValidateResponderHello(bArr);
            if (andValidateResponderHello.getProtocolVersion() == 0) {
                this.mProtocolVersionToUse = 0;
            }
            SecretKey secretKeyDeriveSharedKeyFromGenericPublicKey = D2DCryptoOps.deriveSharedKeyFromGenericPublicKey(this.mOurKeyPair.getPrivate(), andValidateResponderHello.getPublicDhKey());
            if (this.mProtocolVersionToUse == 0) {
                this.mInitiatorEncodeKey = secretKeyDeriveSharedKeyFromGenericPublicKey;
                this.mResponderEncodeKey = secretKeyDeriveSharedKeyFromGenericPublicKey;
            } else {
                this.mInitiatorEncodeKey = D2DCryptoOps.deriveNewKeyForPurpose(secretKeyDeriveSharedKeyFromGenericPublicKey, INITIATOR_PURPOSE);
                this.mResponderEncodeKey = D2DCryptoOps.deriveNewKeyForPurpose(secretKeyDeriveSharedKeyFromGenericPublicKey, RESPONDER_PURPOSE);
            }
            DeviceToDeviceMessagesProto.DeviceToDeviceMessage deviceToDeviceMessageDecryptResponderHelloMessage = D2DCryptoOps.decryptResponderHelloMessage(this.mResponderEncodeKey, bArr);
            if (deviceToDeviceMessageDecryptResponderHelloMessage.getSequenceNumber() == 1) {
                return deviceToDeviceMessageDecryptResponderHelloMessage.getMessage().toByteArray();
            }
            throw new HandshakeException("Incorrect sequence number in responder hello");
        } catch (InvalidProtocolBufferException | InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
            throw new HandshakeException(e);
        }
    }

    @Override // com.google.security.cryptauth.lib.securegcm.D2DHandshakeContext
    public boolean canSendPayloadInHandshakeMessage() {
        return this.mHandshakeState == State.RESPONDER_AFTER_INITIATOR_HELLO;
    }

    @Override // com.google.security.cryptauth.lib.securegcm.D2DHandshakeContext
    public byte[] getNextHandshakeMessage() throws HandshakeException {
        int i = 1.$SwitchMap$com$google$security$cryptauth$lib$securegcm$D2DDiffieHellmanKeyExchangeHandshake$State[this.mHandshakeState.ordinal()];
        if (i == 1) {
            this.mHandshakeState = State.INITIATOR_WAITING_FOR_RESPONDER_HELLO;
            return DeviceToDeviceMessagesProto.InitiatorHello.newBuilder().setPublicDhKey(PublicKeyProtoUtil.encodePublicKey(this.mOurKeyPair.getPublic())).setProtocolVersion(this.mProtocolVersionToUse).build().toByteArray();
        }
        if (i == 2) {
            byte[] bArrMakeResponderHelloWithPayload = makeResponderHelloWithPayload(new byte[0]);
            this.mHandshakeState = State.HANDSHAKE_FINISHED;
            return bArrMakeResponderHelloWithPayload;
        }
        throw new HandshakeException("Cannot get next message in state: " + this.mHandshakeState);
    }

    @Override // com.google.security.cryptauth.lib.securegcm.D2DHandshakeContext
    public boolean isHandshakeComplete() {
        State state = this.mHandshakeState;
        return state == State.HANDSHAKE_FINISHED || state == State.HANDSHAKE_ALREADY_USED;
    }

    @Override // com.google.security.cryptauth.lib.securegcm.D2DHandshakeContext
    public byte[] parseHandshakeMessage(byte[] bArr) throws HandshakeException {
        if (bArr == null || bArr.length == 0) {
            throw new HandshakeException("Handshake message too short");
        }
        int i = 1.$SwitchMap$com$google$security$cryptauth$lib$securegcm$D2DDiffieHellmanKeyExchangeHandshake$State[this.mHandshakeState.ordinal()];
        if (i == 3) {
            byte[] responderHello = parseResponderHello(bArr);
            this.mHandshakeState = State.HANDSHAKE_FINISHED;
            return responderHello;
        }
        if (i == 4) {
            parseInitiatorHello(bArr);
            this.mHandshakeState = State.RESPONDER_AFTER_INITIATOR_HELLO;
            return new byte[0];
        }
        throw new HandshakeException("Cannot parse message in state: " + this.mHandshakeState);
    }

    @Override // com.google.security.cryptauth.lib.securegcm.D2DHandshakeContext
    public D2DConnectionContext toConnectionContext() throws HandshakeException {
        State state = this.mHandshakeState;
        State state2 = State.HANDSHAKE_ALREADY_USED;
        if (state == state2) {
            throw new HandshakeException("Cannot reuse handshake context; is has already been used");
        }
        if (!isHandshakeComplete()) {
            throw new HandshakeException("Handshake is not complete; cannot create connection context");
        }
        this.mHandshakeState = state2;
        if (this.mProtocolVersionToUse == 0) {
            return new D2DConnectionContextV0(this.mInitiatorEncodeKey, 1);
        }
        boolean z = this.mIsInitiator;
        return new D2DConnectionContextV1(z ? this.mInitiatorEncodeKey : this.mResponderEncodeKey, z ? this.mResponderEncodeKey : this.mInitiatorEncodeKey, !z ? 1 : 0, z ? 1 : 0);
    }

    @Override // com.google.security.cryptauth.lib.securegcm.D2DHandshakeContext
    public byte[] getNextHandshakeMessage(byte[] bArr) throws HandshakeException {
        if (this.mHandshakeState == State.RESPONDER_AFTER_INITIATOR_HELLO) {
            byte[] bArrMakeResponderHelloWithPayload = makeResponderHelloWithPayload(bArr);
            this.mHandshakeState = State.HANDSHAKE_FINISHED;
            return bArrMakeResponderHelloWithPayload;
        }
        throw new HandshakeException("Cannot get next message with payload in state: " + this.mHandshakeState);
    }
}
