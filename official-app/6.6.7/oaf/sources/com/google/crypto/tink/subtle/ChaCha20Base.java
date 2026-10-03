package com.google.crypto.tink.subtle;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
abstract class ChaCha20Base implements IndCpaCipher {
    public static final int BLOCK_SIZE_IN_BYTES = 64;
    public static final int BLOCK_SIZE_IN_INTS = 16;
    public static final int KEY_SIZE_IN_BYTES = 32;
    public static final int KEY_SIZE_IN_INTS = 8;
    private static final int[] SIGMA = toIntArray(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});
    private final int initialCounter;
    int[] key;

    public ChaCha20Base(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.key = toIntArray(bArr);
        this.initialCounter = i;
    }

    private void process(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        int iRemaining = byteBuffer2.remaining();
        int i = (iRemaining / 64) + 1;
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer byteBufferChacha20Block = chacha20Block(bArr, this.initialCounter + i2);
            if (i2 == i - 1) {
                Bytes.xor(byteBuffer, byteBuffer2, byteBufferChacha20Block, iRemaining % 64);
            } else {
                Bytes.xor(byteBuffer, byteBuffer2, byteBufferChacha20Block, 64);
            }
        }
    }

    public static void quarterRound(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int iRotateLeft = rotateLeft(i5 ^ iArr[i4], 16);
        iArr[i4] = iRotateLeft;
        int i6 = iArr[i3] + iRotateLeft;
        iArr[i3] = i6;
        int iRotateLeft2 = rotateLeft(iArr[i2] ^ i6, 12);
        iArr[i2] = iRotateLeft2;
        int i7 = iArr[i] + iRotateLeft2;
        iArr[i] = i7;
        int iRotateLeft3 = rotateLeft(iArr[i4] ^ i7, 8);
        iArr[i4] = iRotateLeft3;
        int i8 = iArr[i3] + iRotateLeft3;
        iArr[i3] = i8;
        iArr[i2] = rotateLeft(iArr[i2] ^ i8, 7);
    }

    private static int rotateLeft(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    public static void setSigmaAndKey(int[] iArr, int[] iArr2) {
        int[] iArr3 = SIGMA;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    public static void shuffleState(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            quarterRound(iArr, 0, 4, 8, 12);
            quarterRound(iArr, 1, 5, 9, 13);
            quarterRound(iArr, 2, 6, 10, 14);
            quarterRound(iArr, 3, 7, 11, 15);
            quarterRound(iArr, 0, 5, 10, 15);
            quarterRound(iArr, 1, 6, 11, 12);
            quarterRound(iArr, 2, 7, 8, 13);
            quarterRound(iArr, 3, 4, 9, 14);
        }
    }

    public static int[] toIntArray(byte[] bArr) {
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }

    public ByteBuffer chacha20Block(byte[] bArr, int i) {
        int[] iArrCreateInitialState = createInitialState(toIntArray(bArr), i);
        int[] iArr = (int[]) iArrCreateInitialState.clone();
        shuffleState(iArr);
        for (int i2 = 0; i2 < iArrCreateInitialState.length; i2++) {
            iArrCreateInitialState[i2] = iArrCreateInitialState[i2] + iArr[i2];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrCreateInitialState, 0, 16);
        return byteBufferOrder;
    }

    public abstract int[] createInitialState(int[] iArr, int i);

    @Override // com.google.crypto.tink.subtle.IndCpaCipher
    public byte[] decrypt(byte[] bArr) throws GeneralSecurityException {
        return decrypt(ByteBuffer.wrap(bArr));
    }

    @Override // com.google.crypto.tink.subtle.IndCpaCipher
    public byte[] encrypt(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length > Integer.MAX_VALUE - nonceSizeInBytes()) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(nonceSizeInBytes() + bArr.length);
        encrypt(byteBufferAllocate, bArr);
        return byteBufferAllocate.array();
    }

    public abstract int nonceSizeInBytes();

    public byte[] decrypt(ByteBuffer byteBuffer) throws GeneralSecurityException {
        if (byteBuffer.remaining() < nonceSizeInBytes()) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr = new byte[nonceSizeInBytes()];
        byteBuffer.get(bArr);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        process(bArr, byteBufferAllocate, byteBuffer);
        return byteBufferAllocate.array();
    }

    public void encrypt(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
        if (byteBuffer.remaining() - nonceSizeInBytes() >= bArr.length) {
            byte[] bArrRandBytes = Random.randBytes(nonceSizeInBytes());
            byteBuffer.put(bArrRandBytes);
            process(bArrRandBytes, byteBuffer, ByteBuffer.wrap(bArr));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }
}
