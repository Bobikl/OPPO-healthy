package com.google.security.cryptauth.lib.securegcm;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class D2DConnectionContextV0 extends D2DConnectionContext {
    public static final int PROTOCOL_VERSION = 0;
    private int mSequenceNumber;
    private final SecretKey mSharedKey;

    public D2DConnectionContextV0(SecretKey secretKey, int i) {
        super(0);
        this.mSharedKey = secretKey;
        this.mSequenceNumber = i;
    }

    @Override // com.google.security.cryptauth.lib.securegcm.D2DConnectionContext
    public SecretKey getDecodeKey() {
        return this.mSharedKey;
    }

    @Override // com.google.security.cryptauth.lib.securegcm.D2DConnectionContext
    public SecretKey getEncodeKey() {
        return this.mSharedKey;
    }

    @Override // com.google.security.cryptauth.lib.securegcm.D2DConnectionContext
    public int getSequenceNumberForDecoding() {
        return this.mSequenceNumber;
    }

    @Override // com.google.security.cryptauth.lib.securegcm.D2DConnectionContext
    public int getSequenceNumberForEncoding() {
        return this.mSequenceNumber;
    }

    @Override // com.google.security.cryptauth.lib.securegcm.D2DConnectionContext
    public byte[] getSessionUnique() throws NoSuchAlgorithmException {
        if (this.mSharedKey == null) {
            throw new IllegalStateException("Connection has not been correctly initialized; shared key is null");
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(D2DCryptoOps.SALT);
        return messageDigest.digest(this.mSharedKey.getEncoded());
    }

    @Override // com.google.security.cryptauth.lib.securegcm.D2DConnectionContext
    public void incrementSequenceNumberForDecoding() {
        this.mSequenceNumber++;
    }

    @Override // com.google.security.cryptauth.lib.securegcm.D2DConnectionContext
    public void incrementSequenceNumberForEncoding() {
        this.mSequenceNumber++;
    }

    @Override // com.google.security.cryptauth.lib.securegcm.D2DConnectionContext
    public byte[] saveSession() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(D2DConnectionContext.signedIntToBytes(this.mSequenceNumber));
            byteArrayOutputStream.write(this.mSharedKey.getEncoded());
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
