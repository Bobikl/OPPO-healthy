package com.oplus.aiunit.vision;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class f7m {
    public final rh1 a;
    public final rh1 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rh1 f11252c;

    public f7m(byte[] bArr) {
        q qVar = new q();
        this.a = qVar;
        q qVar2 = new q();
        this.f11252c = qVar2;
        q qVar3 = new q();
        this.b = qVar3;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        qVar.c(true, new foa(bArrCopyOfRange));
        qVar3.c(true, new foa(bArrCopyOfRange2));
        qVar2.c(false, new foa(bArrCopyOfRange));
        if (qVar.a() != 16 || qVar2.a() != 16) {
            throw new RuntimeException();
        }
    }

    public static byte[] c(long j2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putLong(0, j2);
        return byteBufferAllocate.array();
    }

    public void a(byte[] bArr, long j2, byte[] bArr2) throws IllegalArgumentException {
        if (bArr2.length < bArr.length) {
            throw new IllegalArgumentException("Check the length of plainText and plainText");
        }
        if (bArr.length % 16 != 0) {
            throw new IllegalArgumentException("cipherText length is not multiple of 16");
        }
        byte[] bArr3 = new byte[16];
        System.arraycopy(c(ByteBuffer.wrap(c(j2)).order(ByteOrder.LITTLE_ENDIAN).getLong()), 0, bArr3, 0, 8);
        this.b.b(bArr3, 0, bArr3, 0);
        int i = 0;
        int i2 = 0;
        while (i < bArr.length) {
            int i3 = i + 16;
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i3);
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr2, i, i3);
            for (int i4 = 0; i4 < 16; i4++) {
                bArrCopyOfRange2[i4] = (byte) (bArrCopyOfRange[i4] ^ bArr3[i4]);
            }
            this.f11252c.b(bArrCopyOfRange2, 0, bArrCopyOfRange2, 0);
            for (int i5 = 0; i5 < 16; i5++) {
                bArrCopyOfRange2[i5] = (byte) (bArrCopyOfRange2[i5] ^ bArr3[i5]);
            }
            int i6 = 0;
            while (i6 < bArrCopyOfRange2.length) {
                bArr2[i2] = bArrCopyOfRange2[i6];
                i6++;
                i2++;
            }
            d(bArr3);
            i = i3;
        }
    }

    public void b(byte[] bArr, long j2, byte[] bArr2) throws IllegalArgumentException {
        if (bArr2.length < bArr.length) {
            throw new IllegalArgumentException("Check the length of plainText and plainText");
        }
        if (bArr.length % 16 != 0) {
            throw new IllegalArgumentException("plainText length is not multiple of 16");
        }
        byte[] bArr3 = new byte[16];
        System.arraycopy(c(ByteBuffer.wrap(c(j2)).order(ByteOrder.LITTLE_ENDIAN).getLong()), 0, bArr3, 0, 8);
        this.b.b(bArr3, 0, bArr3, 0);
        byte[] bArr4 = new byte[16];
        byte[] bArr5 = new byte[16];
        int i = 0;
        int i2 = 0;
        while (i < bArr.length) {
            System.arraycopy(bArr2, i, bArr4, 0, 16);
            System.arraycopy(bArr, i, bArr5, 0, 16);
            i += 16;
            for (int i3 = 0; i3 < 16; i3++) {
                bArr4[i3] = (byte) (bArr5[i3] ^ bArr3[i3]);
            }
            this.a.b(bArr4, 0, bArr4, 0);
            for (int i4 = 0; i4 < 16; i4++) {
                bArr4[i4] = (byte) (bArr4[i4] ^ bArr3[i4]);
            }
            int i5 = 0;
            while (i5 < 16) {
                bArr2[i2] = bArr4[i5];
                i5++;
                i2++;
            }
            d(bArr3);
        }
    }

    public void d(byte[] bArr) {
        int i = 0;
        int i2 = 0;
        while (i < bArr.length) {
            byte b = bArr[i];
            int i3 = ((byte) (b >> 7)) < 0 ? 1 : 0;
            bArr[i] = (byte) ((b << 1) + i2);
            i++;
            i2 = i3;
        }
        if (i2 != 0) {
            bArr[0] = (byte) (bArr[0] ^ 135);
        }
    }
}
