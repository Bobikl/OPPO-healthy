package com.heytap.accessory.security.wms;

import androidx.annotation.NonNull;
import com.heytap.accessory.logging.SensitiveLogUtils;
import com.heytap.accessory.utils.ByteUtils;
import com.heytap.accessory.utils.SystemUtils;
import com.heytap.accessory.utils.buffer.Buffer;
import com.heytap.accessory.utils.buffer.BufferPool;
import java.security.Key;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes14.dex */
public class a {

    @NonNull
    public final C0259a a;

    @NonNull
    public final C0259a b;

    /* JADX INFO: renamed from: com.heytap.accessory.security.wms.a$a, reason: collision with other inner class name */
    public static class C0259a {
        public long a;

        @NonNull
        public byte[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public Cipher f2687c;

        @NonNull
        public Mac d;

        public C0259a(@NonNull byte[] bArr, @NonNull Key key) throws Exception {
            Mac mac = Mac.getInstance("HmacSHA512");
            this.d = mac;
            mac.init(key);
            byte[] bArr2 = new byte[bArr.length + 8];
            this.b = bArr2;
            SystemUtils.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f2687c = Cipher.getInstance("AES/GCM/NoPadding");
        }
    }

    public a(d dVar) throws e {
        byte[] bArrB = dVar.b();
        if (bArrB == null || bArrB.length == 0) {
            throw new e("cipher qcqs invalid");
        }
        SecretKey secretKeyA = dVar.a();
        if (secretKeyA == null) {
            throw new e("cipher ksc invalid");
        }
        com.heytap.accessory.base.logging.a.a("AppCipher", "init: qcqs: " + SensitiveLogUtils.toHiddenIfNeed(bArrB) + ", ksc_algo: " + secretKeyA.getAlgorithm() + ", ksc_format: " + secretKeyA.getFormat());
        try {
            this.a = new C0259a(bArrB, secretKeyA);
            this.b = new C0259a(bArrB, secretKeyA);
        } catch (Exception e2) {
            throw new e("cipher initialize failed:" + e2.toString());
        }
    }

    public void a() throws e {
    }

    public int b(byte[] bArr, int i, int i2) throws e {
        int i3;
        synchronized (this.b) {
            this.b.a++;
            com.heytap.accessory.base.logging.a.a("AppCipher", "before encrypt: plain data, encrypt t: " + this.b.a + ", offset: " + i + ", length: " + i2 + ", rawData: " + SensitiveLogUtils.toHiddenIfNeed(bArr));
            try {
                C0259a c0259a = this.b;
                byte[] bArr2 = c0259a.b;
                SystemUtils.arraycopy(a(c0259a.a), 0, bArr2, bArr2.length - 8, 8);
                byte[] bArrDoFinal = this.b.d.doFinal(bArr2);
                if (bArrDoFinal == null || bArrDoFinal.length == 0) {
                    throw new e("sha512 encrypt error");
                }
                GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArrDoFinal, 16, 12);
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArrDoFinal, 0, 16, "AES");
                Cipher cipher = this.b.f2687c;
                cipher.init(1, secretKeySpec, gCMParameterSpec);
                cipher.updateAAD(bArrDoFinal, 28, 20);
                int iB = b(cipher, bArr, i, i2);
                if (iB <= 0) {
                    throw new e("cipher encrypt error");
                }
                SystemUtils.arraycopy(a(this.b.a), 0, bArr, i, 8);
                i3 = iB + 8;
                com.heytap.accessory.base.logging.a.a("AppCipher", "after encrypt: cipher data, t: " + this.b.a + ", offset: " + i + ", length: " + i3 + ", mEncryptParams.mT: " + this.b.a + ", aesGcmParams: " + SensitiveLogUtils.toHiddenIfNeed(bArrDoFinal) + ", IV: " + SensitiveLogUtils.toHiddenIfNeed(gCMParameterSpec.getIV()) + ", KEY: " + SensitiveLogUtils.toHiddenIfNeed(secretKeySpec.getEncoded()) + ", AAD: " + SensitiveLogUtils.toHiddenIfNeed(ByteUtils.getBytes(bArrDoFinal, 28, 47)));
                StringBuilder sb = new StringBuilder();
                sb.append("len:");
                sb.append(bArr.length);
                sb.append(", encryptedData ");
                sb.append(SensitiveLogUtils.toHiddenIfNeed(bArr));
                com.heytap.accessory.base.logging.a.a("AppCipher", sb.toString());
            } catch (Exception e2) {
                com.heytap.accessory.base.logging.a.b("AppCipher", "encrypt failed.", e2);
                throw new e("cipher encrypt failed", e2);
            }
        }
        return i3;
    }

    public int a(byte[] bArr, int i, int i2) throws e {
        synchronized (this.a) {
            try {
                long jA = a(bArr, i);
                C0259a c0259a = this.a;
                if (jA <= c0259a.a) {
                    com.heytap.accessory.base.logging.a.b("AppCipherAFSecurityUtils", "t error. t: " + this.a.a + ", income t:" + jA);
                    return -1;
                }
                c0259a.a = jA;
                com.heytap.accessory.base.logging.a.a("AppCipher", "before decrypt: cipher data, decrypt t: " + this.a.a + ", offset: " + i + ", length: " + i2 + ", data: " + SensitiveLogUtils.toHiddenIfNeed(bArr));
                byte[] bArr2 = this.a.b;
                SystemUtils.arraycopy(bArr, i, bArr2, bArr2.length - 8, 8);
                byte[] bArrDoFinal = this.a.d.doFinal(bArr2);
                GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArrDoFinal, 16, 12);
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArrDoFinal, 0, 16, "AES");
                Cipher cipher = this.a.f2687c;
                cipher.init(2, secretKeySpec, gCMParameterSpec);
                cipher.updateAAD(bArrDoFinal, 28, 20);
                try {
                    return a(cipher, bArr, i, i2);
                } catch (Exception e2) {
                    com.heytap.accessory.base.logging.a.b("AppCipher", "after decrypt: plain data, t: " + this.a.a + ", offset: " + i + ", length: 0, aesGcmParams: " + SensitiveLogUtils.toHiddenIfNeed(bArrDoFinal), e2);
                    throw e2;
                }
            } catch (Exception e3) {
                com.heytap.accessory.base.logging.a.a("AppCipher", "decrypt failed,data:" + SensitiveLogUtils.toHiddenIfNeed(ByteUtils.getBytes(bArr, i, i2)));
                throw new e("cipher decrypt failed: " + e3);
            }
        }
    }

    public static byte[] a(long j2) {
        byte[] bArr = new byte[8];
        int i = 0;
        while (i < 8) {
            int i2 = i + 1;
            bArr[i] = (byte) ((j2 >> (64 - (i2 << 3))) & 255);
            i = i2;
        }
        return bArr;
    }

    public static long a(byte[] bArr, int i) {
        long j2 = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = (7 - i2) << 3;
            j2 |= (255 << i3) & (((long) bArr[i + i2]) << i3);
        }
        return j2;
    }

    public static int a(Cipher cipher, byte[] bArr, int i, int i2) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        if (bArr.length > 9000) {
            int i3 = i2 - 8;
            Buffer bufferWrapPayload = BufferPool.wrapPayload(i + 8, i3, bArr, 0);
            int iDoFinal = cipher.doFinal(bufferWrapPayload.getBuffer(), 0, i3, bArr, i);
            bufferWrapPayload.recycle();
            return iDoFinal;
        }
        return cipher.doFinal(bArr, i + 8, i2 - 8, bArr, i);
    }

    public static int b(Cipher cipher, byte[] bArr, int i, int i2) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        if (bArr.length >= 9000) {
            Buffer bufferWrapPayload = BufferPool.wrapPayload(i, i2, bArr, 0);
            int iDoFinal = cipher.doFinal(bufferWrapPayload.getBuffer(), 0, i2, bArr, i + 8);
            bufferWrapPayload.recycle();
            return iDoFinal;
        }
        return cipher.doFinal(bArr, i, i2, bArr, i + 8);
    }
}
