package com.google.security.cryptauth.lib.securegcm;

import androidx.annotation.VisibleForTesting;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.security.cryptauth.utils.SystemUtils;
import com.heytap.accessory.constant.FastPairConstants;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class D2DSpakeEd25519Handshake implements D2DHandshakeContext {

    @VisibleForTesting
    public static final BigInteger[] B;

    @VisibleForTesting
    public static final BigInteger[] KM;

    @VisibleForTesting
    public static final BigInteger[] KN;
    public static final int MIN_PASSWORD_LENGTH = 4;
    private static final int POINT_SIZE_BITS = 256;
    private static final String SHA256 = "SHA-256";
    private State mHandshakeState;
    private BigInteger[] mOurCommitmentPointAffine;
    private BigInteger[] mOurCommitmentPointExtended;
    private BigInteger mPasswordHash;
    private BigInteger[] mPointX;
    private byte[] mSharedKey;
    private BigInteger[] mTheirCommitmentPointAffine;
    private BigInteger[] mTheirCommitmentPointExtended;
    private BigInteger mValueX;

    public static /* synthetic */ class 1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$security$cryptauth$lib$securegcm$D2DSpakeEd25519Handshake$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$com$google$security$cryptauth$lib$securegcm$D2DSpakeEd25519Handshake$State = iArr;
            try {
                iArr[State.HANDSHAKE_FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$D2DSpakeEd25519Handshake$State[State.HANDSHAKE_ALREADY_USED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$D2DSpakeEd25519Handshake$State[State.INITIATOR_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$D2DSpakeEd25519Handshake$State[State.RESPONDER_AFTER_INITIATOR_COMMITMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$D2DSpakeEd25519Handshake$State[State.INITIATOR_AFTER_RESPONDER_COMMITMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$D2DSpakeEd25519Handshake$State[State.RESPONDER_AFTER_INITIATOR_HASH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$D2DSpakeEd25519Handshake$State[State.RESPONDER_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$D2DSpakeEd25519Handshake$State[State.INITIATOR_WAITING_FOR_RESPONDER_COMMITMENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$D2DSpakeEd25519Handshake$State[State.RESPONDER_WAITING_FOR_INITIATOR_HASH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securegcm$D2DSpakeEd25519Handshake$State[State.INITIATOR_WAITING_FOR_RESPONDER_HASH.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public enum State {
        INITIATOR_START,
        INITIATOR_WAITING_FOR_RESPONDER_COMMITMENT,
        INITIATOR_AFTER_RESPONDER_COMMITMENT,
        INITIATOR_WAITING_FOR_RESPONDER_HASH,
        RESPONDER_START,
        RESPONDER_AFTER_INITIATOR_COMMITMENT,
        RESPONDER_WAITING_FOR_INITIATOR_HASH,
        RESPONDER_AFTER_INITIATOR_HASH,
        HANDSHAKE_FINISHED,
        HANDSHAKE_ALREADY_USED
    }

    static {
        BigInteger bigInteger = BigInteger.ONE;
        KM = new BigInteger[]{new BigInteger(new byte[]{25, -127, -5, 67, -15, 3, 41, 14, -49, -105, 114, 2, 45, -72, -79, -101, -6, -13, -119, 5, 126, -39, 30, -124, -122, -21, 54, -121, 99, 67, 89, 37}), new BigInteger(new byte[]{10, 113, 76, 52, -13, -75, -120, -86, -55, 47, -46, 88, 120, -124, -94, 9, 100, -3, 53, 26, 31, 20, 125, 92, 75, -65, 92, 47, 55, -89, 124, 54}), bigInteger, new BigInteger(new byte[]{4, -113, -63, -50, -27, -125, -103, 37, -27, -101, -128, -22, -83, -126, -84, 10, 60, -2, -59, 96, -109, 89, -117, 72, 68, -35, 42, 62, FastPairConstants.MESSAGE_TYPE_NETWORK_CONNECT_PROVIDER, 93, -120, 51})};
        KN = new BigInteger[]{new BigInteger(new byte[]{32, 26, 24, 79, 71, -39, -89, -105, 56, -111, -47, 72, -29, -47, -56, 100, -40, 8, 69, 71, 19, 28, 44, 28, -17, -73, -18, -67, 38, -58, 53, 103}), new BigInteger(new byte[]{109, -94, -45, -79, -114, -60, -7, -86, 59, 8, -29, -100, -103, 124, -40, -65, 110, -103, 72, -1, -44, -2, -1, -20, -81, -115, -48, -77, -42, 72, -73, -24}), bigInteger, new BigInteger(new byte[]{22, 64, -19, 90, 84, -6, 11, 7, 34, -122, -23, -46, 47, 70, 71, 99, -5, -10, 13, 121, 29, 55, -71, 9, 59, 88, 77, -12, -55, -107, -9, -127})};
        B = new BigInteger[]{new BigInteger(new byte[]{33, 105, 54, -45, -51, 110, 83, -2, -64, -92, -30, 49, -3, -42, -36, 92, 105, 44, -57, 96, -107, 37, -89, -78, -55, 86, 45, 96, -113, 37, -43, 26}), new BigInteger(new byte[]{102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 88}), bigInteger, new BigInteger(new byte[]{103, -121, 95, 15, -41, -117, 118, 101, 102, -22, 78, -114, 100, -85, -29, 125, 32, -16, -97, -128, 119, 81, 82, -11, 109, -34, -118, -77, -91, -73, -35, -93})};
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        throw new com.google.security.cryptauth.lib.securegcm.HandshakeException("Could not make public key point", r2);
     */
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public D2DSpakeEd25519Handshake(com.google.security.cryptauth.lib.securegcm.D2DSpakeEd25519Handshake.State r3, byte[] r4) throws com.google.security.cryptauth.lib.securegcm.HandshakeException {
        /*
            r2 = this;
            r2.<init>()
            if (r4 == 0) goto L41
            int r0 = r4.length
            r1 = 4
            if (r0 < r1) goto L41
            r2.mHandshakeState = r3
            java.math.BigInteger r3 = new java.math.BigInteger
            byte[] r4 = hash(r4)
            r0 = 1
            r3.<init>(r0, r4)
            r2.mPasswordHash = r3
        L17:
            java.math.BigInteger r3 = new java.math.BigInteger
            java.security.SecureRandom r4 = new java.security.SecureRandom
            r4.<init>()
            r0 = 256(0x100, float:3.59E-43)
            r3.<init>(r0, r4)
            r2.mValueX = r3
            java.math.BigInteger r4 = java.math.BigInteger.ZERO
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L17
            java.math.BigInteger[] r3 = com.google.security.cryptauth.lib.securegcm.D2DSpakeEd25519Handshake.B     // Catch: com.google.security.cryptauth.lib.securegcm.Ed25519.Ed25519Exception -> L38
            java.math.BigInteger r4 = r2.mValueX     // Catch: com.google.security.cryptauth.lib.securegcm.Ed25519.Ed25519Exception -> L38
            java.math.BigInteger[] r3 = com.google.security.cryptauth.lib.securegcm.Ed25519.scalarMultiplyExtendedPoint(r3, r4)     // Catch: com.google.security.cryptauth.lib.securegcm.Ed25519.Ed25519Exception -> L38
            r2.mPointX = r3     // Catch: com.google.security.cryptauth.lib.securegcm.Ed25519.Ed25519Exception -> L38
            return
        L38:
            r2 = move-exception
            com.google.security.cryptauth.lib.securegcm.HandshakeException r3 = new com.google.security.cryptauth.lib.securegcm.HandshakeException
            java.lang.String r4 = "Could not make public key point"
            r3.<init>(r4, r2)
            throw r3
        L41:
            com.google.security.cryptauth.lib.securegcm.HandshakeException r2 = new com.google.security.cryptauth.lib.securegcm.HandshakeException
            java.lang.String r3 = "Passwords must be at least 4 bytes"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.security.cryptauth.lib.securegcm.D2DSpakeEd25519Handshake.<init>(com.google.security.cryptauth.lib.securegcm.D2DSpakeEd25519Handshake$State, byte[]):void");
    }

    private byte[] computeOurKeyHash(boolean z) throws HandshakeException {
        return hash(concat(new byte[]{(byte) (!z ? 1 : 0)}, pointToByteArray(this.mTheirCommitmentPointAffine), pointToByteArray(this.mOurCommitmentPointAffine), this.mSharedKey));
    }

    private byte[] computeTheirKeyHash(boolean z) throws HandshakeException {
        return hash(concat(new byte[]{z ? (byte) 1 : (byte) 0}, pointToByteArray(this.mOurCommitmentPointAffine), pointToByteArray(this.mTheirCommitmentPointAffine), this.mSharedKey));
    }

    private static byte[] concat(byte[]... bArr) {
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

    private static boolean constantTimeArrayEquals(byte[] bArr, byte[] bArr2) {
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

    public static D2DSpakeEd25519Handshake forInitiator(byte[] bArr) throws HandshakeException {
        return new D2DSpakeEd25519Handshake(State.INITIATOR_START, bArr);
    }

    public static D2DSpakeEd25519Handshake forResponder(byte[] bArr) throws HandshakeException {
        return new D2DSpakeEd25519Handshake(State.RESPONDER_START, bArr);
    }

    private static byte[] hash(byte[] bArr) throws HandshakeException {
        try {
            return MessageDigest.getInstance(SHA256).digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new HandshakeException("Error performing hash", e);
        }
    }

    private byte[] makeCommitmentPointMessage(boolean z) throws HandshakeException {
        try {
            BigInteger[] bigIntegerArrScalarMultiplyExtendedPoint = Ed25519.scalarMultiplyExtendedPoint(z ? KM : KN, this.mPasswordHash);
            this.mOurCommitmentPointExtended = bigIntegerArrScalarMultiplyExtendedPoint;
            BigInteger[] bigIntegerArrAddExtendedPoints = Ed25519.addExtendedPoints(bigIntegerArrScalarMultiplyExtendedPoint, this.mPointX);
            this.mOurCommitmentPointExtended = bigIntegerArrAddExtendedPoints;
            this.mOurCommitmentPointAffine = Ed25519.toAffine(bigIntegerArrAddExtendedPoints);
            int i = 1;
            DeviceToDeviceMessagesProto.SpakeHandshakeMessage.Builder ecPoint = DeviceToDeviceMessagesProto.SpakeHandshakeMessage.newBuilder().setEcPoint(DeviceToDeviceMessagesProto.EcPoint.newBuilder().setCurve(DeviceToDeviceMessagesProto.Curve.ED_25519).setX(ByteString.copyFrom(this.mOurCommitmentPointAffine[0].toByteArray())).setY(ByteString.copyFrom(this.mOurCommitmentPointAffine[1].toByteArray())).build());
            if (!z) {
                i = 2;
            }
            return ecPoint.setFlowNumber(i).build().toByteArray();
        } catch (Ed25519.Ed25519Exception e) {
            throw new HandshakeException("Could not make commitment point message", e);
        }
    }

    private void makeSharedKey(boolean z) throws HandshakeException {
        State state = this.mHandshakeState;
        if (state == State.RESPONDER_START || state == State.INITIATOR_WAITING_FOR_RESPONDER_COMMITMENT) {
            try {
                this.mSharedKey = hash(pointToByteArray(Ed25519.toAffine(Ed25519.scalarMultiplyExtendedPoint(Ed25519.subtractExtendedPoints(this.mTheirCommitmentPointExtended, Ed25519.scalarMultiplyExtendedPoint(z ? KN : KM, this.mPasswordHash)), this.mValueX))));
            } catch (Ed25519.Ed25519Exception e) {
                throw new HandshakeException("Error computing shared key", e);
            }
        } else {
            throw new HandshakeException("Cannot make shared key in state: " + this.mHandshakeState);
        }
    }

    private byte[] makeSharedKeyHashMessage(boolean z, byte[] bArr) throws HandshakeException {
        DeviceToDeviceMessagesProto.SpakeHandshakeMessage.Builder flowNumber = DeviceToDeviceMessagesProto.SpakeHandshakeMessage.newBuilder().setHashValue(ByteString.copyFrom(computeOurKeyHash(z))).setFlowNumber(z ? 3 : 4);
        if (canSendPayloadInHandshakeMessage() && bArr != null) {
            try {
                flowNumber.setPayload(ByteString.copyFrom(D2DCryptoOps.signcryptPayload(new TransportCryptoOps.Payload(TransportCryptoOps.PayloadType.DEVICE_TO_DEVICE_RESPONDER_HELLO_PAYLOAD, D2DConnectionContext.createDeviceToDeviceMessage(bArr, 1).toByteArray()), new SecretKeySpec(this.mSharedKey, "AES"))));
            } catch (InvalidKeyException | NoSuchAlgorithmException e) {
                throw new HandshakeException("Cannot set payload", e);
            }
        }
        return flowNumber.build().toByteArray();
    }

    private void parseCommitmentMessage(byte[] bArr, boolean z) throws HandshakeException {
        try {
            DeviceToDeviceMessagesProto.SpakeHandshakeMessage from = DeviceToDeviceMessagesProto.SpakeHandshakeMessage.parseFrom(bArr);
            if (!from.hasFlowNumber()) {
                throw new HandshakeException("Commitment message missing flow number");
            }
            if (from.getFlowNumber() != (z ? 2 : 1)) {
                throw new HandshakeException("Commitment message has wrong flow number");
            }
            if (!from.hasEcPoint()) {
                throw new HandshakeException("Commitment message missing point");
            }
            DeviceToDeviceMessagesProto.EcPoint ecPoint = from.getEcPoint();
            if (!ecPoint.hasCurve() || ecPoint.getCurve() != DeviceToDeviceMessagesProto.Curve.ED_25519) {
                throw new HandshakeException("Commitment message has wrong curve");
            }
            if (!ecPoint.hasX()) {
                throw new HandshakeException("Commitment point missing x coordinate");
            }
            if (!ecPoint.hasY()) {
                throw new HandshakeException("Commitment point missing y coordinate");
            }
            BigInteger[] bigIntegerArr = {new BigInteger(ecPoint.getX().toByteArray()), new BigInteger(ecPoint.getY().toByteArray())};
            this.mTheirCommitmentPointAffine = bigIntegerArr;
            try {
                Ed25519.validateAffinePoint(bigIntegerArr);
                this.mTheirCommitmentPointExtended = Ed25519.toExtended(this.mTheirCommitmentPointAffine);
            } catch (Ed25519.Ed25519Exception e) {
                throw new HandshakeException("Error validating their commitment point", e);
            }
        } catch (InvalidProtocolBufferException e2) {
            throw new HandshakeException("Could not parse commitment message", e2);
        }
    }

    private byte[] parseHashMessage(byte[] bArr, boolean z) throws HandshakeException {
        try {
            DeviceToDeviceMessagesProto.SpakeHandshakeMessage from = DeviceToDeviceMessagesProto.SpakeHandshakeMessage.parseFrom(bArr);
            if (!from.hasFlowNumber()) {
                throw new HandshakeException("Hash message missing flow number");
            }
            int i = z ? 4 : 3;
            int flowNumber = from.getFlowNumber();
            if (flowNumber != i) {
                throw new HandshakeException("Hash message has flow number " + flowNumber + ", but expected flow number " + i);
            }
            if (!from.hasHashValue()) {
                throw new HandshakeException("Hash message missing hash value");
            }
            if (!constantTimeArrayEquals(computeTheirKeyHash(z), from.getHashValue().toByteArray())) {
                throw new HandshakeException("Hash message had incorrect hash value");
            }
            if (!z || !from.hasPayload()) {
                return new byte[0];
            }
            try {
                DeviceToDeviceMessagesProto.DeviceToDeviceMessage deviceToDeviceMessageDecryptResponderHelloMessage = D2DCryptoOps.decryptResponderHelloMessage(new SecretKeySpec(this.mSharedKey, "AES"), from.getPayload().toByteArray());
                if (deviceToDeviceMessageDecryptResponderHelloMessage.getSequenceNumber() == 1) {
                    return deviceToDeviceMessageDecryptResponderHelloMessage.getMessage().toByteArray();
                }
                throw new HandshakeException("Incorrect sequence number in responder hello");
            } catch (SignatureException e) {
                throw new HandshakeException("Error recovering payload from hash message", e);
            }
        } catch (InvalidProtocolBufferException e2) {
            throw new HandshakeException("Could not parse hash message", e2);
        }
    }

    private byte[] pointToByteArray(BigInteger[] bigIntegerArr) {
        return concat(bigIntegerArr[0].toByteArray(), bigIntegerArr[1].toByteArray());
    }

    @Override // com.google.security.cryptauth.lib.securegcm.D2DHandshakeContext
    public boolean canSendPayloadInHandshakeMessage() {
        return this.mHandshakeState == State.RESPONDER_AFTER_INITIATOR_HASH;
    }

    @Override // com.google.security.cryptauth.lib.securegcm.D2DHandshakeContext
    public byte[] getNextHandshakeMessage() throws HandshakeException {
        int i = 1.$SwitchMap$com$google$security$cryptauth$lib$securegcm$D2DSpakeEd25519Handshake$State[this.mHandshakeState.ordinal()];
        if (i == 3) {
            byte[] bArrMakeCommitmentPointMessage = makeCommitmentPointMessage(true);
            this.mHandshakeState = State.INITIATOR_WAITING_FOR_RESPONDER_COMMITMENT;
            return bArrMakeCommitmentPointMessage;
        }
        if (i == 4) {
            byte[] bArrMakeCommitmentPointMessage2 = makeCommitmentPointMessage(false);
            this.mHandshakeState = State.RESPONDER_WAITING_FOR_INITIATOR_HASH;
            return bArrMakeCommitmentPointMessage2;
        }
        if (i == 5) {
            byte[] bArrMakeSharedKeyHashMessage = makeSharedKeyHashMessage(true, null);
            this.mHandshakeState = State.INITIATOR_WAITING_FOR_RESPONDER_HASH;
            return bArrMakeSharedKeyHashMessage;
        }
        if (i == 6) {
            byte[] bArrMakeSharedKeyHashMessage2 = makeSharedKeyHashMessage(false, null);
            this.mHandshakeState = State.HANDSHAKE_FINISHED;
            return bArrMakeSharedKeyHashMessage2;
        }
        throw new HandshakeException("Cannot get next message in state: " + this.mHandshakeState);
    }

    @Override // com.google.security.cryptauth.lib.securegcm.D2DHandshakeContext
    public boolean isHandshakeComplete() {
        int i = 1.$SwitchMap$com$google$security$cryptauth$lib$securegcm$D2DSpakeEd25519Handshake$State[this.mHandshakeState.ordinal()];
        return i == 1 || i == 2;
    }

    @Override // com.google.security.cryptauth.lib.securegcm.D2DHandshakeContext
    public byte[] parseHandshakeMessage(byte[] bArr) throws HandshakeException {
        if (bArr == null || bArr.length == 0) {
            throw new HandshakeException("Handshake message too short");
        }
        byte[] bArr2 = new byte[0];
        switch (1.$SwitchMap$com$google$security$cryptauth$lib$securegcm$D2DSpakeEd25519Handshake$State[this.mHandshakeState.ordinal()]) {
            case 7:
                parseCommitmentMessage(bArr, false);
                makeSharedKey(false);
                this.mHandshakeState = State.RESPONDER_AFTER_INITIATOR_COMMITMENT;
                return bArr2;
            case 8:
                parseCommitmentMessage(bArr, true);
                makeSharedKey(true);
                this.mHandshakeState = State.INITIATOR_AFTER_RESPONDER_COMMITMENT;
                return bArr2;
            case 9:
                parseHashMessage(bArr, false);
                this.mHandshakeState = State.RESPONDER_AFTER_INITIATOR_HASH;
                return bArr2;
            case 10:
                byte[] hashMessage = parseHashMessage(bArr, true);
                this.mHandshakeState = State.HANDSHAKE_FINISHED;
                return hashMessage;
            default:
                throw new HandshakeException("Cannot parse message in state: " + this.mHandshakeState);
        }
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
        return new D2DConnectionContextV0(new SecretKeySpec(this.mSharedKey, "AES"), 1);
    }

    @Override // com.google.security.cryptauth.lib.securegcm.D2DHandshakeContext
    public byte[] getNextHandshakeMessage(byte[] bArr) throws HandshakeException {
        if (1.$SwitchMap$com$google$security$cryptauth$lib$securegcm$D2DSpakeEd25519Handshake$State[this.mHandshakeState.ordinal()] == 6) {
            byte[] bArrMakeSharedKeyHashMessage = makeSharedKeyHashMessage(false, bArr);
            this.mHandshakeState = State.HANDSHAKE_FINISHED;
            return bArrMakeSharedKeyHashMessage;
        }
        throw new HandshakeException("Cannot send handshake message with payload in state: " + this.mHandshakeState);
    }
}
