package com.andes.crypto.engine;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.e7;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes12.dex */
@Keep
public final class EngineTransCipher extends InputStream {
    public static final String TAG = "EngineTransCipher";
    private Cipher mCipher;
    private final ByteArrayInputStream mCipherMaterialInputStream;
    private final int mCipherMaterialLength;
    private final int mCipherMode;
    private final boolean mHmac;
    private final InputStream mInputStream;
    private final byte[] mIv;
    private final byte[] mKey;
    private byte[] mResult;
    private Mac mMac = null;
    private int mStart = 0;

    public EngineTransCipher(int i, @NonNull byte[] bArr, @NonNull byte[] bArr2, @NonNull byte[] bArr3, InputStream inputStream, boolean z) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (i != 1 && i != 2) {
            throw new UnsupportedOperationException("cipherMode must be Cipher.ENCRYPT_MODE or Cipher.DECRYPT_MODE");
        }
        this.mCipherMaterialLength = bArr.length;
        this.mCipherMode = i;
        this.mKey = bArr2;
        this.mIv = bArr3;
        this.mHmac = z;
        this.mInputStream = inputStream;
        init();
        this.mCipherMaterialInputStream = new ByteArrayInputStream(bArr);
    }

    private byte[] decrypt(@NonNull byte[] bArr, int i, int i2) {
        Mac mac = this.mMac;
        if (mac != null) {
            mac.update(bArr, i, i2);
        }
        return this.mCipher.update(bArr, i, i2);
    }

    private byte[] encrypt(@NonNull byte[] bArr, int i, int i2) {
        byte[] bArrUpdate = this.mCipher.update(bArr, i, i2);
        Mac mac = this.mMac;
        if (mac != null) {
            mac.update(bArrUpdate);
        }
        return bArrUpdate;
    }

    private void init() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        this.mStart = 0;
        this.mResult = null;
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.mKey, "AES");
        if (this.mHmac) {
            Mac mac = Mac.getInstance("HmacSHA256");
            this.mMac = mac;
            mac.init(secretKeySpec);
        }
        Cipher cipher = Cipher.getInstance(e7.AES_TRANSFORMATION);
        this.mCipher = cipher;
        cipher.init(this.mCipherMode, secretKeySpec, new IvParameterSpec(this.mIv));
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.mInputStream;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public byte[] getCipherMaterial() throws IOException {
        byte[] bArr = new byte[this.mCipherMaterialLength];
        if (this.mCipherMaterialInputStream.read(bArr) == -1) {
            return null;
        }
        return bArr;
    }

    public byte[] getHashMac() {
        Mac mac = this.mMac;
        if (mac == null) {
            return null;
        }
        return mac.doFinal();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        ByteArrayInputStream byteArrayInputStream;
        int i;
        if (this.mCipherMode == 1 && (byteArrayInputStream = this.mCipherMaterialInputStream) != null && byteArrayInputStream.available() > 0 && (i = this.mCipherMaterialInputStream.read()) != -1) {
            return i;
        }
        byte[] bArr = this.mResult;
        if (bArr == null || this.mStart >= bArr.length) {
            byte[] bArr2 = new byte[512];
            int i2 = this.mInputStream.read(bArr2);
            if (i2 == -1) {
                return -1;
            }
            this.mStart = 0;
            if (this.mCipherMode == 1) {
                this.mResult = encrypt(bArr2, 0, i2);
            } else {
                this.mResult = decrypt(bArr2, 0, i2);
            }
        }
        byte[] bArr3 = this.mResult;
        int i3 = this.mStart;
        this.mStart = i3 + 1;
        return bArr3[i3] & 255;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        InputStream inputStream = this.mInputStream;
        if (inputStream != null) {
            inputStream.reset();
        }
        ByteArrayInputStream byteArrayInputStream = this.mCipherMaterialInputStream;
        if (byteArrayInputStream != null) {
            byteArrayInputStream.reset();
        }
        try {
            init();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public boolean verify(@NonNull byte[] bArr) {
        Mac mac = this.mMac;
        if (mac == null) {
            return false;
        }
        return Arrays.equals(mac.doFinal(), bArr);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        byte[] bArrDecrypt;
        int i;
        if (this.mCipherMode == 1 && this.mCipherMaterialInputStream.available() > 0 && (i = this.mCipherMaterialInputStream.read(bArr)) != -1) {
            return i;
        }
        int i2 = this.mInputStream.read(bArr);
        if (i2 == -1) {
            return -1;
        }
        if (this.mCipherMode == 1) {
            bArrDecrypt = encrypt(bArr, 0, i2);
        } else {
            bArrDecrypt = decrypt(bArr, 0, i2);
        }
        System.arraycopy(bArrDecrypt, 0, bArr, 0, bArrDecrypt.length);
        return i2;
    }
}
