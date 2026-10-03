package com.leon.channel.common.verify;

import com.oplus.aiunit.vision.t5e;
import com.oplus.aiunit.vision.x7m;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public class ApkSignatureSchemeV2Verifier {
    public static final int ANDROID_COMMON_PAGE_ALIGNMENT_BYTES = 4096;
    public static final int APK_SIGNATURE_SCHEME_V2_BLOCK_ID = 1896449818;
    public static final long APK_SIG_BLOCK_MAGIC_HI = 3617552046287187010L;
    public static final long APK_SIG_BLOCK_MAGIC_LO = 2334950737559900225L;
    public static final int SF_ATTRIBUTE_ANDROID_APK_SIGNED_ID = 2;
    public static final String SF_ATTRIBUTE_ANDROID_APK_SIGNED_NAME = "X-Android-APK-Signed";
    public static final int VERITY_PADDING_BLOCK_ID = 1114793335;

    public static class SignatureNotFoundException extends Exception {
        private static final long serialVersionUID = 1;

        public SignatureNotFoundException(String str) {
            super(str);
        }

        public SignatureNotFoundException(String str, Throwable th) {
            super(str, th);
        }
    }

    public static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static t5e<ByteBuffer, Long> b(RandomAccessFile randomAccessFile, long j2) throws SignatureNotFoundException, IOException {
        if (j2 < 32) {
            throw new SignatureNotFoundException("APK too small for APK Signing Block. ZIP Central Directory offset: " + j2);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferAllocate.order(byteOrder);
        randomAccessFile.seek(j2 - ((long) byteBufferAllocate.capacity()));
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        if (byteBufferAllocate.getLong(8) != APK_SIG_BLOCK_MAGIC_LO || byteBufferAllocate.getLong(16) != APK_SIG_BLOCK_MAGIC_HI) {
            throw new SignatureNotFoundException("No APK Signing Block before ZIP Central Directory");
        }
        long j3 = byteBufferAllocate.getLong(0);
        if (j3 < byteBufferAllocate.capacity() || j3 > 2147483639) {
            throw new SignatureNotFoundException("APK Signing Block size out of range: " + j3);
        }
        int i = (int) (8 + j3);
        long j4 = j2 - ((long) i);
        if (j4 < 0) {
            throw new SignatureNotFoundException("APK Signing Block offset out of range: " + j4);
        }
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i);
        byteBufferAllocate2.order(byteOrder);
        randomAccessFile.seek(j4);
        randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
        long j5 = byteBufferAllocate2.getLong(0);
        if (j5 == j3) {
            return t5e.a(byteBufferAllocate2, Long.valueOf(j4));
        }
        throw new SignatureNotFoundException("APK Signing Block sizes in header and footer do not match: " + j5 + " vs " + j3);
    }

    public static ByteBuffer c(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        if (i < 0) {
            throw new IllegalArgumentException("size: " + i);
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (i2 < iPosition || i2 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static long d(ByteBuffer byteBuffer, long j2) throws SignatureNotFoundException {
        long jG = x7m.g(byteBuffer);
        if (jG < j2) {
            if (x7m.h(byteBuffer) + jG == j2) {
                return jG;
            }
            throw new SignatureNotFoundException("ZIP Central Directory is not immediately followed by End of Central Directory");
        }
        throw new SignatureNotFoundException("ZIP Central Directory offset out of range: " + jG + ". ZIP End of Central Directory offset: " + j2);
    }

    public static t5e<ByteBuffer, Long> e(RandomAccessFile randomAccessFile) throws SignatureNotFoundException, IOException {
        t5e<ByteBuffer, Long> t5eVarC = x7m.c(randomAccessFile);
        if (t5eVarC != null) {
            return t5eVarC;
        }
        throw new SignatureNotFoundException("Not an APK file: ZIP End of Central Directory record not found");
    }

    public static ByteBuffer f(ByteBuffer byteBuffer, int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("start: " + i);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("end < start: " + i2 + " < " + i);
        }
        int iCapacity = byteBuffer.capacity();
        if (i2 > byteBuffer.capacity()) {
            throw new IllegalArgumentException("end > capacity: " + i2 + " > " + iCapacity);
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(i2);
            byteBuffer.position(i);
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            return byteBufferSlice;
        } finally {
            byteBuffer.position(0);
            byteBuffer.limit(iLimit);
            byteBuffer.position(iPosition);
        }
    }
}
