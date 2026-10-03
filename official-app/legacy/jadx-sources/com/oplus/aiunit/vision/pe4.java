package com.oplus.aiunit.vision;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public class pe4 {
    public static final ThreadLocal<Cipher> a = new a();
    public static final SecureRandom b = new SecureRandom();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ThreadLocal<byte[]> f15334c = new b();

    public class a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return Cipher.getInstance(e7.AES_TRANSFORMATION);
            } catch (Exception e2) {
                throw new RuntimeException("Failed to create Cipher", e2);
            }
        }
    }

    public class b extends ThreadLocal<byte[]> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public byte[] initialValue() {
            return new byte[16];
        }
    }

    public static byte[] a(byte[] bArr, String str) throws Exception {
        if (bArr == null || bArr.length <= 16) {
            throw new IllegalArgumentException("CryptoHelper: encrypted blob is null or too short");
        }
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("CryptoHelper: key must not be null or empty");
        }
        byte[] bArr2 = f15334c.get();
        System.arraycopy(bArr, 0, bArr2, 0, 16);
        int length = bArr.length - 16;
        Cipher cipher = a.get();
        cipher.init(2, c(str), new IvParameterSpec(bArr2));
        byte[] bArr3 = new byte[length];
        cipher.doFinal(bArr, 16, length, bArr3, 0);
        return bArr3;
    }

    public static byte[] b(byte[] bArr, String str) throws Exception {
        if (bArr == null) {
            return null;
        }
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("CryptoHelper: key must not be null or empty");
        }
        byte[] bArr2 = f15334c.get();
        b.nextBytes(bArr2);
        Cipher cipher = a.get();
        cipher.init(1, c(str), new IvParameterSpec(bArr2));
        byte[] bArr3 = new byte[bArr.length + 16];
        System.arraycopy(bArr2, 0, bArr3, 0, 16);
        cipher.doFinal(bArr, 0, bArr.length, bArr3, 16);
        return bArr3;
    }

    public static Key c(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        byte[] bArr = new byte[16];
        for (int i = 0; i < bytes.length && i < 16; i++) {
            bArr[i] = bytes[i];
        }
        return new SecretKeySpec(bArr, "AES");
    }
}
