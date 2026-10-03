package org.oconscrypt;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyAgreementSpi;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes11.dex */
public abstract class OpenSSLBaseDHKeyAgreement<T> extends KeyAgreementSpi {
    private int mExpectedResultLength;
    private T mPrivateKey;
    private byte[] mResult;

    private void checkCompleted() {
        if (this.mResult == null) {
            throw new IllegalStateException("Key agreement not completed");
        }
    }

    public abstract int computeKey(byte[] bArr, T t, T t2) throws InvalidKeyException;

    public abstract T convertPrivateKey(PrivateKey privateKey) throws InvalidKeyException;

    public abstract T convertPublicKey(PublicKey publicKey) throws InvalidKeyException;

    @Override // javax.crypto.KeyAgreementSpi
    public Key engineDoPhase(Key key, boolean z) throws InvalidKeyException {
        if (this.mPrivateKey == null) {
            throw new IllegalStateException("Not initialized");
        }
        if (!z) {
            throw new IllegalStateException("DH only has one phase");
        }
        if (key == null) {
            throw new InvalidKeyException("key == null");
        }
        if (!(key instanceof PublicKey)) {
            throw new InvalidKeyException("Not a public key: " + key.getClass());
        }
        T tConvertPublicKey = convertPublicKey((PublicKey) key);
        byte[] bArr = new byte[this.mExpectedResultLength];
        int iComputeKey = computeKey(bArr, tConvertPublicKey, this.mPrivateKey);
        if (iComputeKey == -1) {
            throw new RuntimeException("Engine returned -1");
        }
        int i = this.mExpectedResultLength;
        if (iComputeKey != i) {
            if (iComputeKey >= i) {
                throw new RuntimeException("Engine produced a longer than expected result. Expected: " + this.mExpectedResultLength + ", actual: " + iComputeKey);
            }
            byte[] bArr2 = this.mResult;
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            bArr = new byte[iComputeKey];
        }
        this.mResult = bArr;
        return null;
    }

    @Override // javax.crypto.KeyAgreementSpi
    public int engineGenerateSecret(byte[] bArr, int i) throws ShortBufferException {
        checkCompleted();
        int length = bArr.length - i;
        byte[] bArr2 = this.mResult;
        if (bArr2.length <= length) {
            System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
            return this.mResult.length;
        }
        throw new ShortBufferWithoutStackTraceException("Needed: " + this.mResult.length + ", available: " + length);
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        if (key == null) {
            throw new InvalidKeyException("key == null");
        }
        if (key instanceof PrivateKey) {
            T tConvertPrivateKey = convertPrivateKey((PrivateKey) key);
            this.mExpectedResultLength = getOutputSize(tConvertPrivateKey);
            this.mPrivateKey = tConvertPrivateKey;
        } else {
            throw new InvalidKeyException("Not a private key: " + key.getClass());
        }
    }

    public abstract int getOutputSize(T t);

    @Override // javax.crypto.KeyAgreementSpi
    public byte[] engineGenerateSecret() {
        checkCompleted();
        return this.mResult;
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameterSpec == null) {
            engineInit(key, secureRandom);
            return;
        }
        throw new InvalidAlgorithmParameterException("No algorithm parameters supported");
    }

    @Override // javax.crypto.KeyAgreementSpi
    public SecretKey engineGenerateSecret(String str) {
        checkCompleted();
        return new SecretKeySpec(engineGenerateSecret(), str);
    }
}
