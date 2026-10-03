package com.google.security.cryptauth.lib.securemessage;

import androidx.annotation.Nullable;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

/* JADX INFO: loaded from: classes14.dex */
public class SecureMessageParser {
    private SecureMessageParser() {
    }

    public static SecureMessageProto.Header getUnverifiedHeader(SecureMessageProto.SecureMessage secureMessage) throws InvalidProtocolBufferException {
        if (!secureMessage.hasHeaderAndBody()) {
            throw new InvalidProtocolBufferException("Missing header and body");
        }
        if (!SecureMessageProto.HeaderAndBody.parseFrom(secureMessage.getHeaderAndBody()).hasHeader()) {
            throw new InvalidProtocolBufferException("Missing header");
        }
        SecureMessageProto.Header header = SecureMessageProto.HeaderAndBody.parseFrom(secureMessage.getHeaderAndBody()).getHeader();
        if (!header.hasSignatureScheme()) {
            throw new InvalidProtocolBufferException("Missing header field(s)");
        }
        try {
            CryptoOps.SigType.valueOf(header.getSignatureScheme());
            if (header.hasEncryptionScheme()) {
                try {
                    CryptoOps.EncType.valueOf(header.getEncryptionScheme());
                } catch (IllegalArgumentException unused) {
                    throw new InvalidProtocolBufferException("Corrupt/unsupported EncryptionScheme");
                }
            }
            return header;
        } catch (IllegalArgumentException unused2) {
            throw new InvalidProtocolBufferException("Corrupt/unsupported SignatureScheme");
        }
    }

    public static SecureMessageProto.HeaderAndBody parseSignCryptedMessage(SecureMessageProto.SecureMessage secureMessage, Key key, CryptoOps.SigType sigType, Key key2, CryptoOps.EncType encType) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        return parseSignCryptedMessage(secureMessage, key, sigType, key2, encType, null);
    }

    public static SecureMessageProto.HeaderAndBody parseSignedCleartextMessage(SecureMessageProto.SecureMessage secureMessage, Key key, CryptoOps.SigType sigType) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        return parseSignedCleartextMessage(secureMessage, key, sigType, null);
    }

    private static SecureMessageProto.HeaderAndBody verifyHeaderAndBody(SecureMessageProto.SecureMessage secureMessage, Key key, CryptoOps.SigType sigType, CryptoOps.EncType encType, @Nullable byte[] bArr, boolean z) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        SecureMessageProto.HeaderAndBody from;
        if (!secureMessage.hasHeaderAndBody() || !secureMessage.hasSignature()) {
            throw new SignatureException("Signature failed verification");
        }
        byte[] byteArray = secureMessage.getSignature().toByteArray();
        byte[] byteArray2 = secureMessage.getHeaderAndBody().toByteArray();
        if (!z) {
            byteArray2 = CryptoOps.concat(byteArray2, bArr);
        }
        boolean zVerify = CryptoOps.verify(key, sigType, byteArray, byteArray2);
        boolean z2 = false;
        try {
            from = SecureMessageProto.HeaderAndBody.parseFrom(secureMessage.getHeaderAndBody());
            try {
                if (!from.hasHeader() || !from.hasBody()) {
                    throw new SignatureException("Signature failed verification");
                }
                boolean z3 = zVerify & (from.getHeader().getSignatureScheme() == sigType.getSigScheme()) & (from.getHeader().getEncryptionScheme() == encType.getEncScheme());
                CryptoOps.EncType encType2 = CryptoOps.EncType.NONE;
                z2 = (from.getHeader().getAssociatedDataLength() == (bArr == null ? 0 : bArr.length)) & z3 & ((encType == encType2 && from.getHeader().hasDecryptionKeyId()) ? false : true) & (encType == encType2 || !sigType.isPublicKeyScheme() || from.getHeader().hasVerificationKeyId());
                if (z2) {
                    return from;
                }
                throw new SignatureException("Signature failed verification");
            } catch (InvalidProtocolBufferException unused) {
            }
        } catch (InvalidProtocolBufferException unused2) {
            from = null;
        }
    }

    public static SecureMessageProto.HeaderAndBody parseSignCryptedMessage(SecureMessageProto.SecureMessage secureMessage, Key key, CryptoOps.SigType sigType, Key key2, CryptoOps.EncType encType, @Nullable byte[] bArr) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        if (secureMessage == null || key == null || sigType == null || key2 == null || encType == null) {
            throw null;
        }
        if (encType == CryptoOps.EncType.NONE) {
            throw new SignatureException("Not a signcrypted message");
        }
        boolean zTaggedPlaintextRequired = SecureMessageBuilder.taggedPlaintextRequired(key, sigType, key2);
        SecureMessageProto.HeaderAndBody headerAndBodyVerifyHeaderAndBody = verifyHeaderAndBody(secureMessage, key, sigType, encType, bArr, zTaggedPlaintextRequired);
        SecureMessageProto.Header header = headerAndBodyVerifyHeaderAndBody.getHeader();
        if (!header.hasIv()) {
            throw new SignatureException();
        }
        try {
            byte[] bArrDecrypt = CryptoOps.decrypt(key2, encType, header.getIv().toByteArray(), headerAndBodyVerifyHeaderAndBody.getBody().toByteArray());
            if (!zTaggedPlaintextRequired) {
                return SecureMessageProto.HeaderAndBody.newBuilder(headerAndBodyVerifyHeaderAndBody).setBody(ByteString.copyFrom(bArrDecrypt)).build();
            }
            try {
                byte[] bArrDigest = CryptoOps.digest(CryptoOps.concat(SecureMessageProto.HeaderAndBodyInternal.parseFrom(secureMessage.getHeaderAndBody()).getHeader().toByteArray(), bArr));
                boolean z = false;
                if (bArrDecrypt.length >= 20 && CryptoOps.constantTimeArrayEquals(CryptoOps.subarray(bArrDecrypt, 0, 20), bArrDigest)) {
                    z = true;
                }
                if (!z) {
                    throw new SignatureException();
                }
                return SecureMessageProto.HeaderAndBody.newBuilder(headerAndBodyVerifyHeaderAndBody).setBody(ByteString.copyFrom(bArrDecrypt, 20, bArrDecrypt.length - 20)).build();
            } catch (InvalidProtocolBufferException e2) {
                throw new SignatureException(e2);
            }
        } catch (InvalidAlgorithmParameterException unused) {
            throw new SignatureException();
        } catch (BadPaddingException unused2) {
            throw new SignatureException();
        } catch (IllegalBlockSizeException unused3) {
            throw new SignatureException();
        }
    }

    public static SecureMessageProto.HeaderAndBody parseSignedCleartextMessage(SecureMessageProto.SecureMessage secureMessage, Key key, CryptoOps.SigType sigType, @Nullable byte[] bArr) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        if (secureMessage == null || key == null || sigType == null) {
            throw null;
        }
        return verifyHeaderAndBody(secureMessage, key, sigType, CryptoOps.EncType.NONE, bArr, false);
    }
}
