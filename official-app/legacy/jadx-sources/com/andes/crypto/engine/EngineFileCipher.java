package com.andes.crypto.engine;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.e7;
import com.oplus.aiunit.vision.f7m;
import com.oplus.aiunit.vision.w9k;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes12.dex */
@Keep
public class EngineFileCipher extends InputStream {
    private byte[] dataReserved;
    private byte[] lastBlockReserved;
    private final int mBlockSize;
    private final ByteArrayInputStream mCipherMaterialInputStream;
    private final int mCipherMaterialLength;
    private final int mCipherMode;
    private final f7m mCipherXTS;
    private final InputStream mDataInputStream;
    private InputStream mFinalInputStream;
    private final byte[] mKey;
    private int sectorNum = 0;

    public EngineFileCipher(int i, @NonNull byte[] bArr, @NonNull byte[] bArr2, InputStream inputStream, int i2) {
        if (bArr2.length != 32) {
            throw new IllegalArgumentException("file cipher param key length(must 32 or 64 bytes) error.");
        }
        if (i2 == 0 || i2 % 16 != 0) {
            throw new IllegalArgumentException("the blockSize is not an integer multiple of 16!");
        }
        if (i != 1 && i != 2) {
            throw new UnsupportedOperationException("cipherMode must be Cipher.ENCRYPT_MODE or Cipher.DECRYPT_MODE");
        }
        this.mCipherMaterialLength = bArr.length;
        this.mCipherMaterialInputStream = new ByteArrayInputStream(bArr);
        this.mKey = bArr2;
        this.mBlockSize = i2;
        this.mCipherMode = i;
        this.mCipherXTS = new f7m(bArr2);
        this.mDataInputStream = inputStream;
    }

    private int decrypt(byte[] bArr, byte[] bArr2) {
        byte[] bArrPrepareBlockSizeData = prepareBlockSizeData(bArr);
        int i = 0;
        if (bArrPrepareBlockSizeData != null && bArrPrepareBlockSizeData.length != 0) {
            byte[] bArr3 = this.lastBlockReserved;
            if (bArr3 != null && bArr3.length > 0) {
                try {
                    this.mCipherXTS.a(bArr3, this.sectorNum, bArr2);
                    this.sectorNum++;
                    i = this.mBlockSize;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            this.lastBlockReserved = bArrPrepareBlockSizeData;
        }
        return i;
    }

    private byte[] decryptCTR(byte[] bArr) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.mKey, "AES");
        try {
            Cipher cipher = Cipher.getInstance(e7.AES_TRANSFORMATION);
            cipher.init(2, secretKeySpec, new IvParameterSpec(Arrays.copyOf(this.mKey, cipher.getBlockSize())));
            return cipher.doFinal(bArr);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private int encrypt(byte[] bArr, byte[] bArr2) {
        byte[] bArrPrepareBlockSizeData = prepareBlockSizeData(bArr);
        int i = 0;
        if (bArrPrepareBlockSizeData != null && bArrPrepareBlockSizeData.length != 0) {
            byte[] bArr3 = new byte[bArrPrepareBlockSizeData.length];
            try {
                this.mCipherXTS.b(bArrPrepareBlockSizeData, this.sectorNum, bArr3);
                this.sectorNum++;
                byte[] bArr4 = this.lastBlockReserved;
                if (bArr4 != null) {
                    System.arraycopy(bArr4, 0, bArr2, 0, bArr4.length);
                    i = this.mBlockSize;
                }
                this.lastBlockReserved = bArr3;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return i;
    }

    private byte[] encryptCTR(byte[] bArr) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.mKey, "AES");
        try {
            Cipher cipher = Cipher.getInstance(e7.AES_TRANSFORMATION);
            cipher.init(1, secretKeySpec, new IvParameterSpec(Arrays.copyOf(this.mKey, cipher.getBlockSize())));
            return cipher.doFinal(bArr);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private byte[] finalDecryptFile() {
        byte[] bArr;
        byte[] bArr2 = this.dataReserved;
        if (bArr2 == null) {
            return new byte[0];
        }
        int length = bArr2.length;
        byte[] bArr3 = this.lastBlockReserved;
        if (bArr3 == null) {
            return decryptCTR(bArr2);
        }
        if (bArr2.length == 0) {
            byte[] bArr4 = new byte[bArr3.length];
            try {
                this.mCipherXTS.a(bArr3, this.sectorNum, bArr4);
                return bArr4;
            } catch (Exception e2) {
                e2.printStackTrace();
                return bArr4;
            }
        }
        int length2 = bArr3.length;
        byte[] bArr5 = new byte[length2];
        try {
            this.mCipherXTS.a(bArr3, this.sectorNum + 1, bArr5);
            byte[] bArr6 = this.dataReserved;
            byte[] bArrA = w9k.a(bArr6, Arrays.copyOfRange(bArr5, bArr6.length, length2));
            this.dataReserved = bArrA;
            byte[] bArr7 = new byte[bArrA.length];
            try {
                this.mCipherXTS.a(bArrA, this.sectorNum, bArr7);
                return w9k.a(bArr7, Arrays.copyOf(bArr5, length));
            } catch (Exception e3) {
                e = e3;
                bArr = bArr7;
                e.printStackTrace();
                return bArr;
            }
        } catch (Exception e4) {
            e = e4;
            bArr = null;
        }
    }

    private byte[] finalEncryptFile() {
        byte[] bArr = this.dataReserved;
        if (bArr == null) {
            return new byte[0];
        }
        int length = bArr.length;
        byte[] bArr2 = this.lastBlockReserved;
        if (bArr2 == null) {
            return encryptCTR(bArr);
        }
        if (bArr.length == 0) {
            return bArr2;
        }
        byte[] bArrA = w9k.a(bArr, Arrays.copyOfRange(bArr2, length, bArr2.length));
        this.dataReserved = bArrA;
        byte[] bArr3 = new byte[bArrA.length];
        try {
            this.mCipherXTS.b(bArrA, this.sectorNum, bArr3);
            this.sectorNum++;
            return w9k.a(bArr3, Arrays.copyOf(this.lastBlockReserved, length));
        } catch (Exception e2) {
            e2.printStackTrace();
            return bArr3;
        }
    }

    private byte[] prepareBlockSizeData(byte[] bArr) {
        if (bArr.length > this.mBlockSize) {
            return null;
        }
        byte[] bArr2 = this.dataReserved;
        if (bArr2 == null || bArr2.length == 0) {
            this.dataReserved = bArr;
        } else {
            this.dataReserved = w9k.a(bArr2, bArr);
        }
        byte[] bArr3 = this.dataReserved;
        int length = bArr3.length;
        int i = this.mBlockSize;
        if (length < i) {
            return null;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, i);
        byte[] bArr4 = this.dataReserved;
        this.dataReserved = Arrays.copyOfRange(bArr4, this.mBlockSize, bArr4.length);
        return bArrCopyOf;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.mDataInputStream;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public void decryptBlock(@NonNull byte[] bArr, int i, @NonNull byte[] bArr2) {
        if (i < 0) {
            throw new IllegalArgumentException("file cipher block mode sector number error.");
        }
        int length = bArr.length;
        if (bArr2.length < length) {
            throw new IllegalArgumentException("file cipher block mode plaintext length is little than ciphertext error.");
        }
        int i2 = this.mBlockSize;
        if (length == i2) {
            try {
                this.mCipherXTS.a(bArr, i, bArr2);
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        if (length < i2) {
            byte[] bArrDecryptCTR = decryptCTR(bArr);
            if (bArrDecryptCTR == null) {
                return;
            }
            System.arraycopy(bArrDecryptCTR, 0, bArr2, 0, bArrDecryptCTR.length);
            return;
        }
        int i3 = 0;
        while (i3 < length) {
            int i4 = this.mBlockSize;
            int i5 = i3 + i4;
            if (i5 <= length) {
                try {
                    byte[] bArr3 = new byte[i4];
                    this.mCipherXTS.a(Arrays.copyOfRange(bArr, i3, i5), i, bArr3);
                    System.arraycopy(bArr3, 0, bArr2, i3, i4);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            } else {
                int i6 = length - i3;
                int i7 = i4 - i6;
                int i8 = i3 - i4;
                byte[] bArr4 = new byte[i4];
                try {
                    this.mCipherXTS.a(Arrays.copyOfRange(bArr, i8, i3), i, bArr4);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                byte[] bArrA = w9k.a(Arrays.copyOfRange(bArr, i3, length), Arrays.copyOfRange(bArr4, i4 - i7, i4));
                int i9 = this.mBlockSize;
                byte[] bArr5 = new byte[i9];
                try {
                    this.mCipherXTS.a(bArrA, i - 1, bArr5);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                System.arraycopy(bArr5, 0, bArr2, i8, i9);
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr4, 0, i6);
                System.arraycopy(bArrCopyOfRange, 0, bArr2, i3, bArrCopyOfRange.length);
            }
            i3 += this.mBlockSize;
            i++;
        }
    }

    public void encryptBlock(@NonNull byte[] bArr, int i, @NonNull byte[] bArr2) {
        if (i < 0) {
            throw new IllegalArgumentException("file cipher block mode sector number error.");
        }
        int length = bArr.length;
        if (bArr2.length < length) {
            throw new IllegalArgumentException("file cipher block mode plaintext length is little than ciphertext error.");
        }
        int i2 = this.mBlockSize;
        if (length == i2) {
            try {
                this.mCipherXTS.b(bArr, i, bArr2);
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        if (length < i2) {
            byte[] bArrEncryptCTR = encryptCTR(bArr);
            if (bArrEncryptCTR == null) {
                return;
            }
            System.arraycopy(bArrEncryptCTR, 0, bArr2, 0, bArrEncryptCTR.length);
            return;
        }
        int i3 = 0;
        while (i3 < bArr.length) {
            int i4 = this.mBlockSize;
            int i5 = i3 + i4;
            if (i5 <= length) {
                try {
                    byte[] bArr3 = new byte[i4];
                    this.mCipherXTS.b(Arrays.copyOfRange(bArr, i3, i5), i, bArr3);
                    System.arraycopy(bArr3, 0, bArr2, i3, i4);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            } else {
                int i6 = length - i3;
                byte[] bArrA = w9k.a(Arrays.copyOfRange(bArr, i3, length), Arrays.copyOfRange(bArr2, i3 - (i4 - i6), i3));
                int i7 = this.mBlockSize;
                byte[] bArr4 = new byte[i7];
                try {
                    this.mCipherXTS.b(bArrA, i, bArr4);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                int i8 = i3 - this.mBlockSize;
                System.arraycopy(bArr2, i8, bArr2, i3, i6);
                System.arraycopy(bArr4, 0, bArr2, i8, i7);
            }
            i3 += this.mBlockSize;
            i++;
        }
    }

    public byte[] getCipherMaterial() throws IOException {
        byte[] bArr = new byte[this.mCipherMaterialLength];
        if (this.mCipherMaterialInputStream.read(bArr) == -1) {
            return null;
        }
        return bArr;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        return 0;
    }

    @Override // java.io.InputStream
    public int read(@NonNull byte[] bArr) throws IOException {
        int i;
        if (bArr.length < this.mBlockSize) {
            throw new IllegalArgumentException("b.length must larger than blockSize");
        }
        if (this.mDataInputStream == null) {
            throw new IllegalArgumentException("mDataInputStream must not be null");
        }
        if (this.mCipherMode == 1 && this.mCipherMaterialInputStream.available() > 0 && (i = this.mCipherMaterialInputStream.read(bArr)) != -1) {
            return i;
        }
        InputStream inputStream = this.mFinalInputStream;
        if (inputStream != null) {
            return inputStream.read(bArr);
        }
        byte[] bArr2 = new byte[this.mBlockSize];
        int i2 = this.mDataInputStream.read(bArr2);
        if (i2 != -1) {
            int i3 = this.mCipherMode;
            if (i3 == 1) {
                return encrypt(Arrays.copyOf(bArr2, i2), bArr);
            }
            if (i3 != 2) {
                return 0;
            }
            return decrypt(Arrays.copyOf(bArr2, i2), bArr);
        }
        int i4 = this.mCipherMode;
        if (i4 == 1) {
            byte[] bArrFinalEncryptFile = finalEncryptFile();
            if (bArrFinalEncryptFile != null) {
                this.mFinalInputStream = new ByteArrayInputStream(bArrFinalEncryptFile);
            }
        } else {
            if (i4 != 2) {
                return 0;
            }
            byte[] bArrFinalDecryptFile = finalDecryptFile();
            if (bArrFinalDecryptFile != null) {
                this.mFinalInputStream = new ByteArrayInputStream(bArrFinalDecryptFile);
            }
        }
        return this.mFinalInputStream.read(bArr);
    }
}
