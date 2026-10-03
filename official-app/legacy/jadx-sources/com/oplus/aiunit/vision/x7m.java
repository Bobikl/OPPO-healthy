package com.oplus.aiunit.vision;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p010kotlin.UShort;

/* JADX INFO: loaded from: classes4.dex */
public abstract class x7m {
    public static final int ZIP_EOCD_REC_MIN_SIZE = 22;

    public static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static int b(ByteBuffer byteBuffer) {
        a(byteBuffer);
        int iCapacity = byteBuffer.capacity();
        if (iCapacity < 22) {
            return -1;
        }
        int i = iCapacity - 22;
        int iMin = Math.min(i, 65535);
        for (int i2 = 0; i2 < iMin; i2++) {
            int i3 = i - i2;
            if (byteBuffer.getInt(i3) == 101010256 && e(byteBuffer, i3 + 20) == i2) {
                return i3;
            }
        }
        return -1;
    }

    public static t5e<ByteBuffer, Long> c(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        t5e<ByteBuffer, Long> t5eVarD = d(randomAccessFile, 0);
        return t5eVarD != null ? t5eVarD : d(randomAccessFile, 65535);
    }

    public static t5e<ByteBuffer, Long> d(RandomAccessFile randomAccessFile, int i) throws IOException {
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException("maxCommentSize: " + i);
        }
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i, length - 22)) + 22);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferAllocate.order(byteOrder);
        long jCapacity = length - ((long) byteBufferAllocate.capacity());
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        int iB = b(byteBufferAllocate);
        if (iB == -1) {
            return null;
        }
        byteBufferAllocate.position(iB);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(byteOrder);
        return t5e.a(byteBufferSlice, Long.valueOf(jCapacity + ((long) iB)));
    }

    public static int e(ByteBuffer byteBuffer, int i) {
        return byteBuffer.getShort(i) & UShort.MAX_VALUE;
    }

    public static long f(ByteBuffer byteBuffer, int i) {
        return ((long) byteBuffer.getInt(i)) & 4294967295L;
    }

    public static long g(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return f(byteBuffer, byteBuffer.position() + 16);
    }

    public static long h(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return f(byteBuffer, byteBuffer.position() + 12);
    }

    public static final boolean i(RandomAccessFile randomAccessFile, long j2) throws IOException {
        long j3 = j2 - 20;
        if (j3 < 0) {
            return false;
        }
        randomAccessFile.seek(j3);
        return randomAccessFile.readInt() == 1347094023;
    }
}
