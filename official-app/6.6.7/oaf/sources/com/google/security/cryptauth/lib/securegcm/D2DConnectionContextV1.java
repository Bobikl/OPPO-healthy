package com.google.security.cryptauth.lib.securegcm;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class D2DConnectionContextV1 extends D2DConnectionContext {
    public static final int PROTOCOL_VERSION = 1;
    private final SecretKey mDecodeKey;
    private int mDecodeSequenceNumber;
    private final SecretKey mEncodeKey;
    private int mEncodeSequenceNumber;

    public D2DConnectionContextV1(SecretKey secretKey, SecretKey secretKey2, int i, int i2) {
        super(1);
        this.mEncodeKey = secretKey;
        this.mDecodeKey = secretKey2;
        this.mEncodeSequenceNumber = i;
        this.mDecodeSequenceNumber = i2;
    }

    @Override // com.google.security.cryptauth.lib.securegcm.D2DConnectionContext
    public SecretKey getDecodeKey() {
        return this.mDecodeKey;
    }

    @Override // com.google.security.cryptauth.lib.securegcm.D2DConnectionContext
    public SecretKey getEncodeKey() {
        return this.mEncodeKey;
    }

    @Override // com.google.security.cryptauth.lib.securegcm.D2DConnectionContext
    public int getSequenceNumberForDecoding() {
        return this.mDecodeSequenceNumber;
    }

    @Override // com.google.security.cryptauth.lib.securegcm.D2DConnectionContext
    public int getSequenceNumberForEncoding() {
        return this.mEncodeSequenceNumber;
    }

    @Override // com.google.security.cryptauth.lib.securegcm.D2DConnectionContext
    public byte[] getSessionUnique() throws NoSuchAlgorithmException {
        SecretKey secretKey = this.mEncodeKey;
        if (secretKey == null || this.mDecodeKey == null) {
            throw new IllegalStateException("Connection has not been correctly initialized; encode key or decode key is null");
        }
        byte[] encoded = secretKey.getEncoded();
        byte[] encoded2 = this.mDecodeKey.getEncoded();
        byte[] bArr = Arrays.hashCode(encoded) < Arrays.hashCode(encoded2) ? encoded : encoded2;
        if (bArr == encoded) {
            encoded = encoded2;
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(D2DCryptoOps.SALT);
        messageDigest.update(bArr);
        messageDigest.update(encoded);
        return messageDigest.digest();
    }

    @Override // com.google.security.cryptauth.lib.securegcm.D2DConnectionContext
    public void incrementSequenceNumberForDecoding() {
        this.mDecodeSequenceNumber++;
    }

    @Override // com.google.security.cryptauth.lib.securegcm.D2DConnectionContext
    public void incrementSequenceNumberForEncoding() {
        this.mEncodeSequenceNumber++;
    }

    @Override // com.google.security.cryptauth.lib.securegcm.D2DConnectionContext
    public byte[] saveSession() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(1);
            byteArrayOutputStream.write(D2DConnectionContext.signedIntToBytes(this.mEncodeSequenceNumber));
            byteArrayOutputStream.write(D2DConnectionContext.signedIntToBytes(this.mDecodeSequenceNumber));
            byteArrayOutputStream.write(this.mEncodeKey.getEncoded());
            byteArrayOutputStream.write(this.mDecodeKey.getEncoded());
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
