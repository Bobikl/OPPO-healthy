package com.google.security.cryptauth.lib.securegcm;

import androidx.annotation.Nullable;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.security.cryptauth.lib.securemessage.CryptoOps;
import com.google.security.cryptauth.lib.securemessage.PublicKeyProtoUtil;
import com.google.security.cryptauth.lib.securemessage.SecureMessageProto;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.hapjs.card.api.debug.CardDebugController;

/* JADX INFO: loaded from: classes14.dex */
public class Ukey2Handshake {
    private static final String NEXT_PROTOCOL = "AES_256_CBC-HMAC_SHA256";
    private static final int NONCE_LENGTH_IN_BYTES = 32;
    private static final String UTF_8 = "UTF-8";
    public static final int VERSION = 1;
    private SecretKey mDerivedSecretKey;
    private final HandshakeCipher mHandshakeCipher;
    private final HandshakeRole mHandshakeRole;
    private InternalState mHandshakeState;
    private byte[] mIvSpec;
    private final KeyPair mOurKeyPair;
    private byte[] mRawMessage1;
    private byte[] mRawMessage2;
    private final HashMap<HandshakeCipher, byte[]> mRawMessage3Map = new HashMap<>();
    private byte[] mTheirCommitment;
    private PublicKey mTheirPublicKey;

    /* JADX INFO: renamed from: com.google.security.cryptauth.lib.securegcm.Ukey2Handshake$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$security$cryptauth$lib$securegcm$Ukey2Handshake$HandshakeCipher;
        public static final /* synthetic */ int[] $SwitchMap$com$google$security$cryptauth$lib$securegcm$Ukey2Handshake$InternalState;
        public static final /* synthetic */ int[] $SwitchMap$com$google$security$cryptauth$lib$securegcm$UkeyProto$Ukey2Alert$AlertType;
        public static final /* synthetic */ int[] $SwitchMap$com$google$security$cryptauth$lib$securegcm$UkeyProto$Ukey2Message$Type;

        static {
            int[] iArr = new int[UkeyProto.Ukey2Alert.AlertType.values().length];
            $SwitchMap$com$google$security$cryptauth$lib$securegcm$UkeyProto$Ukey2Alert$AlertType = iArr;
            try {
                iArr[UkeyProto.Ukey2Alert.AlertType.BAD_MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$UkeyProto$Ukey2Alert$AlertType[UkeyProto.Ukey2Alert.AlertType.BAD_MESSAGE_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$UkeyProto$Ukey2Alert$AlertType[UkeyProto.Ukey2Alert.AlertType.INCORRECT_MESSAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$UkeyProto$Ukey2Alert$AlertType[UkeyProto.Ukey2Alert.AlertType.BAD_MESSAGE_DATA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$UkeyProto$Ukey2Alert$AlertType[UkeyProto.Ukey2Alert.AlertType.BAD_VERSION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$UkeyProto$Ukey2Alert$AlertType[UkeyProto.Ukey2Alert.AlertType.BAD_RANDOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$UkeyProto$Ukey2Alert$AlertType[UkeyProto.Ukey2Alert.AlertType.BAD_HANDSHAKE_CIPHER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$UkeyProto$Ukey2Alert$AlertType[UkeyProto.Ukey2Alert.AlertType.BAD_NEXT_PROTOCOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$UkeyProto$Ukey2Alert$AlertType[UkeyProto.Ukey2Alert.AlertType.BAD_PUBLIC_KEY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$UkeyProto$Ukey2Alert$AlertType[UkeyProto.Ukey2Alert.AlertType.INTERNAL_ERROR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr2 = new int[UkeyProto.Ukey2Message.Type.values().length];
            $SwitchMap$com$google$security$cryptauth$lib$securegcm$UkeyProto$Ukey2Message$Type = iArr2;
            try {
                iArr2[UkeyProto.Ukey2Message.Type.ALERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$UkeyProto$Ukey2Message$Type[UkeyProto.Ukey2Message.Type.CLIENT_INIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$UkeyProto$Ukey2Message$Type[UkeyProto.Ukey2Message.Type.SERVER_INIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$UkeyProto$Ukey2Message$Type[UkeyProto.Ukey2Message.Type.CLIENT_FINISH.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr3 = new int[HandshakeCipher.values().length];
            $SwitchMap$com$google$security$cryptauth$lib$securegcm$Ukey2Handshake$HandshakeCipher = iArr3;
            try {
                iArr3[HandshakeCipher.P256_SHA512.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr4 = new int[InternalState.values().length];
            $SwitchMap$com$google$security$cryptauth$lib$securegcm$Ukey2Handshake$InternalState = iArr4;
            try {
                iArr4[InternalState.CLIENT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$Ukey2Handshake$InternalState[InternalState.SERVER_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$Ukey2Handshake$InternalState[InternalState.SERVER_AFTER_CLIENT_INIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$Ukey2Handshake$InternalState[InternalState.CLIENT_AFTER_SERVER_INIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$Ukey2Handshake$InternalState[InternalState.CLIENT_WAITING_FOR_SERVER_INIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$Ukey2Handshake$InternalState[InternalState.SERVER_WAITING_FOR_CLIENT_FINISHED.ordinal()] = 6;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$Ukey2Handshake$InternalState[InternalState.HANDSHAKE_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$Ukey2Handshake$InternalState[InternalState.HANDSHAKE_VERIFICATION_NEEDED.ordinal()] = 8;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$Ukey2Handshake$InternalState[InternalState.HANDSHAKE_VERIFICATION_IN_PROGRESS.ordinal()] = 9;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$Ukey2Handshake$InternalState[InternalState.HANDSHAKE_FINISHED.ordinal()] = 10;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$Ukey2Handshake$InternalState[InternalState.HANDSHAKE_ALREADY_USED.ordinal()] = 11;
            } catch (NoSuchFieldError unused26) {
            }
        }
    }

    public static class AlertException extends Exception {
        private final UkeyProto.Ukey2Alert mAlertMessageToSend;

        public AlertException(String str, UkeyProto.Ukey2Alert ukey2Alert) {
            super(str);
            this.mAlertMessageToSend = ukey2Alert;
        }

        public byte[] getAlertMessageToSend() {
            return this.mAlertMessageToSend.toByteArray();
        }
    }

    public enum HandshakeCipher {
        P256_SHA512(UkeyProto.Ukey2HandshakeCipher.P256_SHA512);

        private final UkeyProto.Ukey2HandshakeCipher mValue;

        HandshakeCipher(UkeyProto.Ukey2HandshakeCipher ukey2HandshakeCipher) {
            if (ukey2HandshakeCipher == UkeyProto.Ukey2HandshakeCipher.P256_SHA512) {
                this.mValue = ukey2HandshakeCipher;
                return;
            }
            throw new IllegalArgumentException("Unknown cipher value: " + ukey2HandshakeCipher);
        }

        public UkeyProto.Ukey2HandshakeCipher getValue() {
            return this.mValue;
        }
    }

    public enum HandshakeRole {
        CLIENT,
        SERVER
    }

    public enum InternalState {
        CLIENT_START,
        CLIENT_WAITING_FOR_SERVER_INIT,
        CLIENT_AFTER_SERVER_INIT,
        SERVER_START,
        SERVER_AFTER_CLIENT_INIT,
        SERVER_WAITING_FOR_CLIENT_FINISHED,
        HANDSHAKE_VERIFICATION_NEEDED,
        HANDSHAKE_VERIFICATION_IN_PROGRESS,
        HANDSHAKE_FINISHED,
        HANDSHAKE_ALREADY_USED,
        HANDSHAKE_ERROR
    }

    public enum State {
        IN_PROGRESS,
        VERIFICATION_NEEDED,
        VERIFICATION_IN_PROGRESS,
        FINISHED,
        ALREADY_USED,
        ERROR
    }

    private Ukey2Handshake(InternalState internalState, HandshakeCipher handshakeCipher) throws HandshakeException {
        if (handshakeCipher == null) {
            throwIllegalArgumentException("Invalid handshake cipher");
        }
        this.mHandshakeCipher = handshakeCipher;
        int i = AnonymousClass1.$SwitchMap$com$google$security$cryptauth$lib$securegcm$Ukey2Handshake$InternalState[internalState.ordinal()];
        if (i == 1) {
            this.mHandshakeRole = HandshakeRole.CLIENT;
        } else if (i != 2) {
            throwIllegalStateException("Invalid handshake state");
            this.mHandshakeRole = null;
        } else {
            this.mHandshakeRole = HandshakeRole.SERVER;
        }
        this.mHandshakeState = internalState;
        this.mOurKeyPair = genKeyPair(handshakeCipher);
    }

    public static Ukey2Handshake forInitiator(HandshakeCipher handshakeCipher) throws HandshakeException {
        return new Ukey2Handshake(InternalState.CLIENT_START, handshakeCipher);
    }

    public static Ukey2Handshake forResponder(HandshakeCipher handshakeCipher) throws HandshakeException {
        return new Ukey2Handshake(InternalState.SERVER_START, handshakeCipher);
    }

    private KeyPair genKeyPair(HandshakeCipher handshakeCipher) throws HandshakeException {
        if (AnonymousClass1.$SwitchMap$com$google$security$cryptauth$lib$securegcm$Ukey2Handshake$HandshakeCipher[handshakeCipher.ordinal()] == 1) {
            return PublicKeyProtoUtil.generateEcP256KeyPair();
        }
        throwHandshakeException("unknown cipher: " + handshakeCipher);
        return null;
    }

    private UkeyProto.Ukey2ClientFinished generateP256SHA512ClientFinished(KeyPair keyPair) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[16];
        this.mIvSpec = bArr;
        secureRandom.nextBytes(bArr);
        byte[] byteArray = PublicKeyProtoUtil.encodePublicKey(keyPair.getPublic()).toByteArray();
        UkeyProto.Ukey2ClientFinished.Builder builderNewBuilder = UkeyProto.Ukey2ClientFinished.newBuilder();
        builderNewBuilder.setPublicKey(ByteString.copyFrom(byteArray));
        builderNewBuilder.setIvSpec(ByteString.copyFrom(this.mIvSpec));
        this.mRawMessage3Map.put(HandshakeCipher.P256_SHA512, makeUkey2Message(UkeyProto.Ukey2Message.Type.CLIENT_FINISH, builderNewBuilder.build().toByteArray()));
        return builderNewBuilder.build();
    }

    private UkeyProto.Ukey2ClientInit.CipherCommitment generateP256SHA512Commitment() throws HandshakeException {
        HashMap<HandshakeCipher, byte[]> map = this.mRawMessage3Map;
        HandshakeCipher handshakeCipher = HandshakeCipher.P256_SHA512;
        if (!map.containsKey(handshakeCipher)) {
            generateP256SHA512ClientFinished(this.mOurKeyPair);
        }
        UkeyProto.Ukey2ClientInit.CipherCommitment.Builder builderNewBuilder = UkeyProto.Ukey2ClientInit.CipherCommitment.newBuilder();
        builderNewBuilder.setHandshakeCipher(UkeyProto.Ukey2HandshakeCipher.P256_SHA512);
        builderNewBuilder.setCommitment(ByteString.copyFrom(sha512(this.mRawMessage3Map.get(handshakeCipher))));
        return builderNewBuilder.build();
    }

    private static byte[] generateRandomNonce() {
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    private UkeyProto.Ukey2Alert makeAlertMessage(UkeyProto.Ukey2Alert.AlertType alertType, @Nullable String str) throws HandshakeException {
        switch (AnonymousClass1.$SwitchMap$com$google$security$cryptauth$lib$securegcm$UkeyProto$Ukey2Alert$AlertType[alertType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                throwHandshakeException("Unknown alert type: " + alertType);
                break;
        }
        UkeyProto.Ukey2Alert.Builder builderNewBuilder = UkeyProto.Ukey2Alert.newBuilder();
        builderNewBuilder.setType(alertType);
        if (str != null) {
            builderNewBuilder.setErrorMessage(str);
        }
        return builderNewBuilder.build();
    }

    private byte[] makeClientInitMessage() throws HandshakeException {
        UkeyProto.Ukey2ClientInit.Builder builderNewBuilder = UkeyProto.Ukey2ClientInit.newBuilder();
        builderNewBuilder.setVersion(1);
        builderNewBuilder.setRandom(ByteString.copyFrom(generateRandomNonce()));
        builderNewBuilder.setNextProtocol(NEXT_PROTOCOL);
        builderNewBuilder.addCipherCommitments(generateP256SHA512Commitment());
        return builderNewBuilder.build().toByteArray();
    }

    private byte[] makeServerInitMessage() {
        UkeyProto.Ukey2ServerInit.Builder builderNewBuilder = UkeyProto.Ukey2ServerInit.newBuilder();
        builderNewBuilder.setVersion(1);
        builderNewBuilder.setRandom(ByteString.copyFrom(generateRandomNonce()));
        builderNewBuilder.setHandshakeCipher(this.mHandshakeCipher.getValue());
        builderNewBuilder.setPublicKey(PublicKeyProtoUtil.encodePublicKey(this.mOurKeyPair.getPublic()).toByteString());
        return builderNewBuilder.build().toByteArray();
    }

    private byte[] makeUkey2Message(UkeyProto.Ukey2Message.Type type, byte[] bArr) {
        UkeyProto.Ukey2Message.Builder builderNewBuilder = UkeyProto.Ukey2Message.newBuilder();
        int i = AnonymousClass1.$SwitchMap$com$google$security$cryptauth$lib$securegcm$UkeyProto$Ukey2Message$Type[type.ordinal()];
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throwIllegalArgumentException("Invalid message type: " + type);
        }
        builderNewBuilder.setMessageType(type);
        if (type != UkeyProto.Ukey2Message.Type.ALERT) {
            if (bArr == null || bArr.length == 0) {
                throwIllegalArgumentException("Cannot send empty message data for non-alert messages");
            }
            builderNewBuilder.setMessageData(ByteString.copyFrom(bArr));
        }
        return builderNewBuilder.build().toByteArray();
    }

    private void parseMessage1(byte[] bArr) throws HandshakeException, AlertException {
        UkeyProto.Ukey2Message from;
        UkeyProto.Ukey2ClientInit from2 = null;
        try {
            from = UkeyProto.Ukey2Message.parseFrom(bArr);
        } catch (InvalidProtocolBufferException e2) {
            throwAlertException(UkeyProto.Ukey2Alert.AlertType.BAD_MESSAGE, "Can't parse message 1 " + e2.getMessage());
            from = null;
        }
        if (!from.hasMessageType() || from.getMessageType() != UkeyProto.Ukey2Message.Type.CLIENT_INIT) {
            throwAlertException(UkeyProto.Ukey2Alert.AlertType.BAD_MESSAGE_TYPE, "Expected, but did not find ClientInit message type");
        }
        if (!from.hasMessageData()) {
            throwAlertException(UkeyProto.Ukey2Alert.AlertType.BAD_MESSAGE_DATA, "Expected message data, but didn't find it");
        }
        try {
            from2 = UkeyProto.Ukey2ClientInit.parseFrom(from.getMessageData());
        } catch (InvalidProtocolBufferException unused) {
            throwAlertException(UkeyProto.Ukey2Alert.AlertType.BAD_MESSAGE_DATA, "Can't parse message data into ClientInit");
        }
        if (!from2.hasVersion()) {
            throwAlertException(UkeyProto.Ukey2Alert.AlertType.BAD_VERSION, "ClientInit missing version");
        }
        if (from2.getVersion() != 1) {
            throwAlertException(UkeyProto.Ukey2Alert.AlertType.BAD_VERSION, "ClientInit version mismatch");
        }
        if (!from2.hasRandom()) {
            throwAlertException(UkeyProto.Ukey2Alert.AlertType.BAD_RANDOM, "ClientInit missing random");
        }
        if (from2.getRandom().toByteArray().length != 32) {
            throwAlertException(UkeyProto.Ukey2Alert.AlertType.BAD_RANDOM, "ClientInit has incorrect nonce length");
        }
        List<UkeyProto.Ukey2ClientInit.CipherCommitment> cipherCommitmentsList = from2.getCipherCommitmentsList();
        if (cipherCommitmentsList.isEmpty()) {
            throwAlertException(UkeyProto.Ukey2Alert.AlertType.BAD_HANDSHAKE_CIPHER, "ClientInit is missing cipher commitments");
        }
        for (UkeyProto.Ukey2ClientInit.CipherCommitment cipherCommitment : cipherCommitmentsList) {
            if (!cipherCommitment.hasHandshakeCipher() || !cipherCommitment.hasCommitment()) {
                throwAlertException(UkeyProto.Ukey2Alert.AlertType.BAD_HANDSHAKE_CIPHER, "ClientInit has improperly formatted cipher commitment");
            }
            if (cipherCommitment.getHandshakeCipher() == this.mHandshakeCipher.getValue()) {
                this.mTheirCommitment = cipherCommitment.getCommitment().toByteArray();
            }
        }
        if (this.mTheirCommitment == null) {
            throwAlertException(UkeyProto.Ukey2Alert.AlertType.BAD_HANDSHAKE_CIPHER, "No acceptable commitments found");
        }
        if (!from2.hasNextProtocol() || !NEXT_PROTOCOL.equals(from2.getNextProtocol())) {
            throwAlertException(UkeyProto.Ukey2Alert.AlertType.BAD_NEXT_PROTOCOL, "Incorrect next protocol");
        }
        this.mRawMessage1 = bArr;
    }

    private void parseMessage2(byte[] bArr) throws HandshakeException, AlertException {
        UkeyProto.Ukey2Message from;
        UkeyProto.Ukey2ServerInit from2;
        HandshakeCipher handshakeCipher = null;
        try {
            from = UkeyProto.Ukey2Message.parseFrom(bArr);
        } catch (InvalidProtocolBufferException e2) {
            throwAlertException(UkeyProto.Ukey2Alert.AlertType.BAD_MESSAGE, "Can't parse message 2 " + e2.getMessage());
            from = null;
        }
        if (!from.hasMessageType()) {
            throwAlertException(UkeyProto.Ukey2Alert.AlertType.BAD_MESSAGE_TYPE, "Expected, but did not find message type");
        }
        if (from.getMessageType() == UkeyProto.Ukey2Message.Type.ALERT) {
            this.mHandshakeState = InternalState.HANDSHAKE_ERROR;
            throwHandshakeMessageFromAlertMessage(from);
        }
        if (from.getMessageType() != UkeyProto.Ukey2Message.Type.SERVER_INIT) {
            throwAlertException(UkeyProto.Ukey2Alert.AlertType.BAD_MESSAGE_TYPE, "Expected, but did not find SERVER_INIT message type");
        }
        if (!from.hasMessageData()) {
            throwAlertException(UkeyProto.Ukey2Alert.AlertType.BAD_MESSAGE_DATA, "Expected message data, but didn't find it");
        }
        try {
            from2 = UkeyProto.Ukey2ServerInit.parseFrom(from.getMessageData());
        } catch (InvalidProtocolBufferException unused) {
            throwAlertException(UkeyProto.Ukey2Alert.AlertType.BAD_MESSAGE_DATA, "Can't parse message data into ServerInit");
            from2 = null;
        }
        if (!from2.hasVersion()) {
            throwAlertException(UkeyProto.Ukey2Alert.AlertType.BAD_VERSION, "ServerInit missing version");
        }
        if (from2.getVersion() != 1) {
            throwAlertException(UkeyProto.Ukey2Alert.AlertType.BAD_VERSION, "ServerInit version mismatch");
        }
        if (!from2.hasRandom()) {
            throwAlertException(UkeyProto.Ukey2Alert.AlertType.BAD_RANDOM, "ServerInit missing random");
        }
        if (from2.getRandom().toByteArray().length != 32) {
            throwAlertException(UkeyProto.Ukey2Alert.AlertType.BAD_RANDOM, "ServerInit has incorrect nonce length");
        }
        if (!from2.hasHandshakeCipher()) {
            throwAlertException(UkeyProto.Ukey2Alert.AlertType.BAD_HANDSHAKE_CIPHER, "No handshake cipher found");
        }
        for (HandshakeCipher handshakeCipher2 : HandshakeCipher.values()) {
            if (handshakeCipher2.getValue() == from2.getHandshakeCipher()) {
                handshakeCipher = handshakeCipher2;
                break;
            }
        }
        if (handshakeCipher == null || handshakeCipher != this.mHandshakeCipher) {
            throwAlertException(UkeyProto.Ukey2Alert.AlertType.BAD_HANDSHAKE_CIPHER, "No acceptable handshake cipher found");
        }
        if (!from2.hasPublicKey()) {
            throwAlertException(UkeyProto.Ukey2Alert.AlertType.BAD_PUBLIC_KEY, "No public key found in ServerInit");
        }
        this.mTheirPublicKey = parseP256PublicKey(from2.getPublicKey().toByteArray());
        this.mRawMessage2 = bArr;
    }

    private void parseMessage3(byte[] bArr) throws HandshakeException {
        UkeyProto.Ukey2Message from;
        UkeyProto.Ukey2ClientFinished from2 = null;
        try {
            from = UkeyProto.Ukey2Message.parseFrom(bArr);
        } catch (InvalidProtocolBufferException e2) {
            throwHandshakeException("Can't parse message 3", e2);
            from = null;
        }
        if (!from.hasMessageType()) {
            throw new HandshakeException("Expected, but did not find message type");
        }
        if (from.getMessageType() == UkeyProto.Ukey2Message.Type.ALERT) {
            throwHandshakeMessageFromAlertMessage(from);
        }
        if (from.getMessageType() != UkeyProto.Ukey2Message.Type.CLIENT_FINISH) {
            throwHandshakeException("Expected, but did not find CLIENT_FINISH message type");
        }
        verifyCommitment(bArr);
        if (!from.hasMessageData()) {
            throwHandshakeException("Expected message data, but didn't find it");
        }
        try {
            from2 = UkeyProto.Ukey2ClientFinished.parseFrom(from.getMessageData());
        } catch (InvalidProtocolBufferException e3) {
            throwHandshakeException(e3);
        }
        if (!from2.hasPublicKey()) {
            throwHandshakeException("No public key found in ClientFinished");
        }
        try {
            this.mTheirPublicKey = parseP256PublicKey(from2.getPublicKey().toByteArray());
            this.mIvSpec = from2.getIvSpec().toByteArray();
        } catch (AlertException e4) {
            throwHandshakeException(e4);
        }
    }

    private PublicKey parseP256PublicKey(byte[] bArr) throws HandshakeException, AlertException {
        try {
            return PublicKeyProtoUtil.parsePublicKey(SecureMessageProto.GenericPublicKey.parseFrom(bArr));
        } catch (InvalidProtocolBufferException | InvalidKeySpecException e2) {
            throwAlertException(UkeyProto.Ukey2Alert.AlertType.BAD_PUBLIC_KEY, "Cannot parse public key: " + e2.getMessage());
            return null;
        }
    }

    private byte[] sha512(byte[] bArr) throws HandshakeException {
        try {
            return MessageDigest.getInstance(MessageDigestAlgorithms.SHA_512).digest(bArr);
        } catch (NoSuchAlgorithmException e2) {
            throwHandshakeException("No security provider initialized yet?", e2);
            return null;
        }
    }

    private void throwAlertException(UkeyProto.Ukey2Alert.AlertType alertType, String str) throws HandshakeException, AlertException {
        this.mHandshakeState = InternalState.HANDSHAKE_ERROR;
        throw new AlertException(str, makeAlertMessage(alertType, str));
    }

    private void throwHandshakeException(String str) throws HandshakeException {
        this.mHandshakeState = InternalState.HANDSHAKE_ERROR;
        throw new HandshakeException(str);
    }

    private void throwHandshakeMessageFromAlertMessage(UkeyProto.Ukey2Message ukey2Message) throws HandshakeException {
        UkeyProto.Ukey2Alert from;
        if (ukey2Message.hasMessageData()) {
            try {
                from = UkeyProto.Ukey2Alert.parseFrom(ukey2Message.getMessageData());
            } catch (InvalidProtocolBufferException e2) {
                throwHandshakeException("Cannot parse alert message", e2);
                from = null;
            }
            if (from.hasType() && from.hasErrorMessage()) {
                throwHandshakeException("Received Alert message. Type: " + from.getType() + " Error Message: " + from.getErrorMessage());
            } else if (from.hasType()) {
                throwHandshakeException("Received Alert message. Type: " + from.getType());
            }
        }
        throwHandshakeException("Received empty Alert Message");
    }

    private void throwIllegalArgumentException(String str) {
        this.mHandshakeState = InternalState.HANDSHAKE_ERROR;
        throw new IllegalArgumentException(str);
    }

    private void throwIllegalStateException(String str) {
        this.mHandshakeState = InternalState.HANDSHAKE_ERROR;
        throw new IllegalStateException(str);
    }

    private void verifyCommitment(byte[] bArr) throws HandshakeException {
        byte[] bArrSha512;
        if (AnonymousClass1.$SwitchMap$com$google$security$cryptauth$lib$securegcm$Ukey2Handshake$HandshakeCipher[this.mHandshakeCipher.ordinal()] != 1) {
            throwIllegalStateException("Unexpected handshakeCipher");
            bArrSha512 = null;
        } else {
            bArrSha512 = sha512(bArr);
        }
        if (MessageDigest.isEqual(bArrSha512, this.mTheirCommitment)) {
            return;
        }
        throwHandshakeException("Commitment does not match");
    }

    public State getHandshakeState() {
        switch (AnonymousClass1.$SwitchMap$com$google$security$cryptauth$lib$securegcm$Ukey2Handshake$InternalState[this.mHandshakeState.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return State.IN_PROGRESS;
            case 7:
                return State.ERROR;
            case 8:
                return State.VERIFICATION_NEEDED;
            case 9:
                return State.VERIFICATION_IN_PROGRESS;
            case 10:
                return State.FINISHED;
            case 11:
                return State.ALREADY_USED;
            default:
                throwIllegalStateException("Unknown state");
                return null;
        }
    }

    public byte[] getIvSpec() {
        return this.mIvSpec;
    }

    public byte[] getNextHandshakeMessage() throws HandshakeException {
        int i = AnonymousClass1.$SwitchMap$com$google$security$cryptauth$lib$securegcm$Ukey2Handshake$InternalState[this.mHandshakeState.ordinal()];
        if (i == 1) {
            byte[] bArrMakeUkey2Message = makeUkey2Message(UkeyProto.Ukey2Message.Type.CLIENT_INIT, makeClientInitMessage());
            this.mRawMessage1 = bArrMakeUkey2Message;
            this.mHandshakeState = InternalState.CLIENT_WAITING_FOR_SERVER_INIT;
            return bArrMakeUkey2Message;
        }
        if (i == 3) {
            byte[] bArrMakeUkey2Message2 = makeUkey2Message(UkeyProto.Ukey2Message.Type.SERVER_INIT, makeServerInitMessage());
            this.mRawMessage2 = bArrMakeUkey2Message2;
            this.mHandshakeState = InternalState.SERVER_WAITING_FOR_CLIENT_FINISHED;
            return bArrMakeUkey2Message2;
        }
        if (i != 4) {
            throwIllegalStateException("Cannot get next message in state: " + this.mHandshakeState);
            return null;
        }
        if (!this.mRawMessage3Map.containsKey(this.mHandshakeCipher)) {
            throwIllegalStateException("Client state is CLIENT_AFTER_SERVER_INIT, and cipher is " + this.mHandshakeCipher + ", but no corresponding raw client finished message has been generated");
        }
        this.mHandshakeState = InternalState.HANDSHAKE_VERIFICATION_NEEDED;
        return this.mRawMessage3Map.get(this.mHandshakeCipher);
    }

    public byte[] getVerificationString(int i) throws HandshakeException {
        byte[] bytes;
        if (i < 1 || i > 32) {
            throwIllegalArgumentException("Minimum length is 1 byte, max is 32 bytes");
        }
        if (this.mHandshakeState != InternalState.HANDSHAKE_VERIFICATION_NEEDED) {
            throwIllegalStateException("Unexpected state: " + this.mHandshakeState);
        }
        try {
            this.mDerivedSecretKey = EnrollmentCryptoOps.doKeyAgreement(this.mOurKeyPair.getPrivate(), this.mTheirPublicKey);
        } catch (InvalidKeyException e2) {
            throwHandshakeException(e2);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(this.mRawMessage1);
            byteArrayOutputStream.write(this.mRawMessage2);
        } catch (IOException e3) {
            throwHandshakeException(e3);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byte[] bArrHkdf = null;
        try {
            bytes = "UKEY2 v1 auth".getBytes("UTF-8");
        } catch (UnsupportedEncodingException e4) {
            throwHandshakeException(e4);
            bytes = null;
        }
        try {
            bArrHkdf = CryptoOps.hkdf(this.mDerivedSecretKey, bytes, byteArray);
        } catch (InvalidKeyException | NoSuchAlgorithmException e5) {
            throwHandshakeException(e5);
        }
        this.mHandshakeState = InternalState.HANDSHAKE_VERIFICATION_IN_PROGRESS;
        return Arrays.copyOf(bArrHkdf, i);
    }

    public void parseHandshakeMessage(byte[] bArr) throws HandshakeException, AlertException {
        int i = AnonymousClass1.$SwitchMap$com$google$security$cryptauth$lib$securegcm$Ukey2Handshake$InternalState[this.mHandshakeState.ordinal()];
        if (i == 2) {
            parseMessage1(bArr);
            this.mHandshakeState = InternalState.SERVER_AFTER_CLIENT_INIT;
            return;
        }
        if (i == 5) {
            parseMessage2(bArr);
            this.mHandshakeState = InternalState.CLIENT_AFTER_SERVER_INIT;
        } else if (i == 6) {
            parseMessage3(bArr);
            this.mHandshakeState = InternalState.HANDSHAKE_VERIFICATION_NEEDED;
        } else {
            throwIllegalStateException("Cannot parse message in state " + this.mHandshakeState);
        }
    }

    public D2DConnectionContext toConnectionContext() throws HandshakeException {
        byte[] bytes;
        SecretKeySpec secretKeySpec;
        SecretKey secretKeyDeriveNewKeyForPurpose;
        int i = AnonymousClass1.$SwitchMap$com$google$security$cryptauth$lib$securegcm$Ukey2Handshake$InternalState[this.mHandshakeState.ordinal()];
        SecretKey secretKeyDeriveNewKeyForPurpose2 = null;
        if (i == 7) {
            throwIllegalStateException("Cannot make context; handshake had error");
            return null;
        }
        if (i == 8) {
            throwIllegalStateException("Handshake not verified, cannot create context");
            return null;
        }
        if (i != 10) {
            if (i == 11) {
                throwIllegalStateException("Cannot reuse handshake context; is has already been used");
                return null;
            }
            throwIllegalStateException("Handshake is not complete; cannot create connection context");
        }
        if (this.mDerivedSecretKey == null) {
            throwIllegalStateException("Unexpected state error: derived key is null");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(this.mRawMessage1);
            byteArrayOutputStream.write(this.mRawMessage2);
        } catch (IOException e2) {
            throwHandshakeException(e2);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            bytes = "UKEY2 v1 next".getBytes("UTF-8");
        } catch (UnsupportedEncodingException e3) {
            throwHandshakeException(e3);
            bytes = null;
        }
        try {
            secretKeySpec = new SecretKeySpec(CryptoOps.hkdf(this.mDerivedSecretKey, bytes, byteArray), "AES");
        } catch (InvalidKeyException | NoSuchAlgorithmException e4) {
            throwHandshakeException(e4);
            secretKeySpec = null;
        }
        try {
            secretKeyDeriveNewKeyForPurpose = D2DCryptoOps.deriveNewKeyForPurpose(secretKeySpec, "client");
            try {
                secretKeyDeriveNewKeyForPurpose2 = D2DCryptoOps.deriveNewKeyForPurpose(secretKeySpec, CardDebugController.EXTRA_SERVER);
            } catch (InvalidKeyException | NoSuchAlgorithmException e5) {
                e = e5;
                throwHandshakeException(e);
            }
        } catch (InvalidKeyException | NoSuchAlgorithmException e6) {
            e = e6;
            secretKeyDeriveNewKeyForPurpose = null;
        }
        this.mHandshakeState = InternalState.HANDSHAKE_ALREADY_USED;
        HandshakeRole handshakeRole = this.mHandshakeRole;
        HandshakeRole handshakeRole2 = HandshakeRole.CLIENT;
        SecretKey secretKey = handshakeRole == handshakeRole2 ? secretKeyDeriveNewKeyForPurpose : secretKeyDeriveNewKeyForPurpose2;
        if (handshakeRole == handshakeRole2) {
            secretKeyDeriveNewKeyForPurpose = secretKeyDeriveNewKeyForPurpose2;
        }
        return new D2DConnectionContextV1(secretKey, secretKeyDeriveNewKeyForPurpose, 0, 0);
    }

    public void verifyHandshake() {
        if (this.mHandshakeState != InternalState.HANDSHAKE_VERIFICATION_IN_PROGRESS) {
            throwIllegalStateException("Unexpected state: " + this.mHandshakeState);
        }
        this.mHandshakeState = InternalState.HANDSHAKE_FINISHED;
    }

    private void throwHandshakeException(Exception exc) throws HandshakeException {
        this.mHandshakeState = InternalState.HANDSHAKE_ERROR;
        throw new HandshakeException(exc);
    }

    private void throwHandshakeException(String str, Exception exc) throws HandshakeException {
        this.mHandshakeState = InternalState.HANDSHAKE_ERROR;
        throw new HandshakeException(str, exc);
    }
}
