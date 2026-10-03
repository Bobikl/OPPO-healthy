package com.google.security.cryptauth.lib.securemessage;

import androidx.annotation.Nullable;
import com.google.protobuf.ByteString;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class SecureMessageBuilder {
    private byte[] mAssociatedData;
    private ByteString mDecryptionKeyId;
    private ByteString mPublicMetadata;
    private SecureRandom mRng;
    private ByteString mVerificationKeyId;

    public SecureMessageBuilder() {
        reset();
        this.mRng = new SecureRandom();
    }

    private SecureMessageProto.Header buildHeader(CryptoOps.SigType sigType, CryptoOps.EncType encType, byte[] bArr) {
        SecureMessageProto.Header.Builder encryptionScheme = SecureMessageProto.Header.newBuilder().setSignatureScheme(sigType.getSigScheme()).setEncryptionScheme(encType.getEncScheme());
        ByteString byteString = this.mVerificationKeyId;
        if (byteString != null) {
            encryptionScheme.setVerificationKeyId(byteString);
        }
        ByteString byteString2 = this.mDecryptionKeyId;
        if (byteString2 != null) {
            encryptionScheme.setDecryptionKeyId(byteString2);
        }
        ByteString byteString3 = this.mPublicMetadata;
        if (byteString3 != null) {
            encryptionScheme.setPublicMetadata(byteString3);
        }
        byte[] bArr2 = this.mAssociatedData;
        if (bArr2 != null) {
            encryptionScheme.setAssociatedDataLength(bArr2.length);
        }
        if (bArr != null) {
            encryptionScheme.setIv(ByteString.copyFrom(bArr));
        }
        return encryptionScheme.build();
    }

    private SecureMessageProto.SecureMessage createSignedResult(Key key, CryptoOps.SigType sigType, byte[] bArr, @Nullable byte[] bArr2) throws NoSuchAlgorithmException, InvalidKeyException {
        return SecureMessageProto.SecureMessage.newBuilder().setHeaderAndBody(ByteString.copyFrom(bArr)).setSignature(ByteString.copyFrom(CryptoOps.sign(sigType, key, this.mRng, CryptoOps.concat(bArr, bArr2)))).build();
    }

    private byte[] serializeHeaderAndBody(byte[] bArr, byte[] bArr2) {
        return SecureMessageProto.HeaderAndBodyInternal.newBuilder().setHeader(ByteString.copyFrom(bArr)).setBody(ByteString.copyFrom(bArr2)).build().toByteArray();
    }

    public static boolean taggedPlaintextRequired(Key key, CryptoOps.SigType sigType, Key key2) {
        return sigType.isPublicKeyScheme() || !Arrays.equals(key.getEncoded(), key2.getEncoded());
    }

    public SecureMessageProto.SecureMessage buildSignCryptedMessage(Key key, CryptoOps.SigType sigType, Key key2, CryptoOps.EncType encType, byte[] bArr) throws NoSuchAlgorithmException, InvalidKeyException {
        byte[] bArr2 = null;
        if (key == null || sigType == null || key2 == null || encType == null || bArr == null) {
            throw null;
        }
        if (encType == CryptoOps.EncType.NONE) {
            throw new IllegalArgumentException(encType + " not supported for encrypted messages");
        }
        if (sigType.isPublicKeyScheme() && this.mVerificationKeyId == null) {
            throw new IllegalStateException("Must set a verificationKeyId when using public key signature with encryption");
        }
        byte[] bArrGenerateIv = CryptoOps.generateIv(encType, this.mRng);
        byte[] byteArray = buildHeader(sigType, encType, bArrGenerateIv).toByteArray();
        if (taggedPlaintextRequired(key, sigType, key2)) {
            bArr = CryptoOps.concat(CryptoOps.digest(CryptoOps.concat(byteArray, this.mAssociatedData)), bArr);
        } else {
            bArr2 = this.mAssociatedData;
        }
        return createSignedResult(key, sigType, serializeHeaderAndBody(byteArray, CryptoOps.encrypt(key2, encType, this.mRng, bArrGenerateIv, bArr)), bArr2);
    }

    public SecureMessageProto.SecureMessage buildSignedCleartextMessage(Key key, CryptoOps.SigType sigType, byte[] bArr) throws NoSuchAlgorithmException, InvalidKeyException {
        if (key == null || sigType == null || bArr == null) {
            throw null;
        }
        if (this.mDecryptionKeyId == null) {
            return createSignedResult(key, sigType, serializeHeaderAndBody(buildHeader(sigType, CryptoOps.EncType.NONE, null).toByteArray(), bArr), this.mAssociatedData);
        }
        throw new IllegalStateException("Cannot set decryptionKeyId for a cleartext message");
    }

    public SecureMessageBuilder reset() {
        this.mPublicMetadata = null;
        this.mVerificationKeyId = null;
        this.mDecryptionKeyId = null;
        this.mAssociatedData = null;
        return this;
    }

    public SecureMessageBuilder setAssociatedData(@Nullable byte[] bArr) {
        this.mAssociatedData = bArr;
        return this;
    }

    public SecureMessageBuilder setDecryptionKeyId(byte[] bArr) {
        this.mDecryptionKeyId = ByteString.copyFrom(bArr);
        return this;
    }

    public SecureMessageBuilder setPublicMetadata(byte[] bArr) {
        this.mPublicMetadata = ByteString.copyFrom(bArr);
        return this;
    }

    public SecureMessageBuilder setRng(SecureRandom secureRandom) {
        this.mRng = secureRandom;
        return this;
    }

    public SecureMessageBuilder setVerificationKeyId(byte[] bArr) {
        this.mVerificationKeyId = ByteString.copyFrom(bArr);
        return this;
    }
}
