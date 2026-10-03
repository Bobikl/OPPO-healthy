package com.google.crypto.tink.subtle;

import com.google.crypto.tink.Aead;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.AEADBadTagException;

/* JADX INFO: loaded from: classes14.dex */
abstract class ChaCha20Poly1305Base implements Aead {
    private final ChaCha20Base chacha20;
    private final ChaCha20Base macKeyChaCha20;

    public ChaCha20Poly1305Base(byte[] bArr) throws InvalidKeyException {
        this.chacha20 = newChaCha20Instance(bArr, 1);
        this.macKeyChaCha20 = newChaCha20Instance(bArr, 0);
    }

    private byte[] getMacKey(byte[] bArr) throws GeneralSecurityException {
        ByteBuffer byteBufferChacha20Block = this.macKeyChaCha20.chacha20Block(bArr, 0);
        byte[] bArr2 = new byte[32];
        byteBufferChacha20Block.get(bArr2);
        return bArr2;
    }

    private static byte[] macDataRfc8439(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining % 16;
        int i2 = (i == 0 ? iRemaining : (iRemaining + 16) - i) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i2);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return decrypt(ByteBuffer.wrap(bArr), bArr2);
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > (Integer.MAX_VALUE - this.chacha20.nonceSizeInBytes()) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + this.chacha20.nonceSizeInBytes() + 16);
        encrypt(byteBufferAllocate, bArr, bArr2);
        return byteBufferAllocate.array();
    }

    public abstract ChaCha20Base newChaCha20Instance(byte[] bArr, int i) throws InvalidKeyException;

    private byte[] decrypt(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
        if (byteBuffer.remaining() < this.chacha20.nonceSizeInBytes() + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr2 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr2);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        byte[] bArr3 = new byte[this.chacha20.nonceSizeInBytes()];
        byteBuffer.get(bArr3);
        if (bArr == null) {
            bArr = new byte[0];
        }
        try {
            Poly1305.verifyMac(getMacKey(bArr3), macDataRfc8439(bArr, byteBuffer), bArr2);
            byteBuffer.position(iPosition);
            return this.chacha20.decrypt(byteBuffer);
        } catch (GeneralSecurityException e2) {
            throw new AEADBadTagException(e2.toString());
        }
    }

    private void encrypt(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= bArr.length + this.chacha20.nonceSizeInBytes() + 16) {
            int iPosition = byteBuffer.position();
            this.chacha20.encrypt(byteBuffer, bArr);
            byteBuffer.position(iPosition);
            byte[] bArr3 = new byte[this.chacha20.nonceSizeInBytes()];
            byteBuffer.get(bArr3);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] bArrComputeMac = Poly1305.computeMac(getMacKey(bArr3), macDataRfc8439(bArr2, byteBuffer));
            byteBuffer.limit(byteBuffer.limit() + 16);
            byteBuffer.put(bArrComputeMac);
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }
}
