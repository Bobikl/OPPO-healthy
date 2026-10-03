package io.netty.buffer;

import io.netty.util.internal.MathUtil;
import io.netty.util.internal.ObjectUtil;
import io.netty.util.internal.PlatformDependent;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import p010kotlin.UShort;

/* JADX INFO: loaded from: classes10.dex */
final class UnsafeByteBufUtil {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean UNALIGNED = PlatformDependent.isUnaligned();
    private static final byte ZERO = 0;

    private UnsafeByteBufUtil() {
    }

    public static ByteBuf copy(AbstractByteBuf abstractByteBuf, long j2, int i, int i2) {
        abstractByteBuf.checkIndex(i, i2);
        ByteBuf byteBufDirectBuffer = abstractByteBuf.alloc().directBuffer(i2, abstractByteBuf.maxCapacity());
        if (i2 != 0) {
            if (byteBufDirectBuffer.hasMemoryAddress()) {
                PlatformDependent.copyMemory(j2, byteBufDirectBuffer.memoryAddress(), i2);
                byteBufDirectBuffer.setIndex(0, i2);
            } else {
                byteBufDirectBuffer.writeBytes(abstractByteBuf, i, i2);
            }
        }
        return byteBufDirectBuffer;
    }

    public static byte getByte(long j2) {
        return PlatformDependent.getByte(j2);
    }

    public static void getBytes(AbstractByteBuf abstractByteBuf, long j2, int i, ByteBuf byteBuf, int i2, int i3) {
        abstractByteBuf.checkIndex(i, i3);
        ObjectUtil.checkNotNull(byteBuf, "dst");
        if (MathUtil.isOutOfBounds(i2, i3, byteBuf.capacity())) {
            throw new IndexOutOfBoundsException("dstIndex: " + i2);
        }
        if (byteBuf.hasMemoryAddress()) {
            PlatformDependent.copyMemory(j2, byteBuf.memoryAddress() + ((long) i2), i3);
        } else if (byteBuf.hasArray()) {
            PlatformDependent.copyMemory(j2, byteBuf.array(), byteBuf.arrayOffset() + i2, i3);
        } else {
            byteBuf.setBytes(i2, abstractByteBuf, i, i3);
        }
    }

    public static int getInt(long j2) {
        if (!UNALIGNED) {
            return (PlatformDependent.getByte(j2 + 3) & 255) | (PlatformDependent.getByte(j2) << 24) | ((PlatformDependent.getByte(1 + j2) & 255) << 16) | ((PlatformDependent.getByte(2 + j2) & 255) << 8);
        }
        int i = PlatformDependent.getInt(j2);
        return PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? i : Integer.reverseBytes(i);
    }

    public static int getIntLE(long j2) {
        if (!UNALIGNED) {
            return (PlatformDependent.getByte(j2 + 3) << 24) | (PlatformDependent.getByte(j2) & 255) | ((PlatformDependent.getByte(1 + j2) & 255) << 8) | ((PlatformDependent.getByte(2 + j2) & 255) << 16);
        }
        int i = PlatformDependent.getInt(j2);
        return PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? Integer.reverseBytes(i) : i;
    }

    public static long getLong(long j2) {
        if (!UNALIGNED) {
            return (((long) PlatformDependent.getByte(j2 + 7)) & 255) | (((long) PlatformDependent.getByte(j2)) << 56) | ((((long) PlatformDependent.getByte(1 + j2)) & 255) << 48) | ((((long) PlatformDependent.getByte(2 + j2)) & 255) << 40) | ((((long) PlatformDependent.getByte(3 + j2)) & 255) << 32) | ((((long) PlatformDependent.getByte(4 + j2)) & 255) << 24) | ((((long) PlatformDependent.getByte(5 + j2)) & 255) << 16) | ((((long) PlatformDependent.getByte(6 + j2)) & 255) << 8);
        }
        long j3 = PlatformDependent.getLong(j2);
        return PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? j3 : Long.reverseBytes(j3);
    }

    public static long getLongLE(long j2) {
        if (!UNALIGNED) {
            return (((long) PlatformDependent.getByte(j2 + 7)) << 56) | (((long) PlatformDependent.getByte(j2)) & 255) | ((((long) PlatformDependent.getByte(1 + j2)) & 255) << 8) | ((((long) PlatformDependent.getByte(2 + j2)) & 255) << 16) | ((((long) PlatformDependent.getByte(3 + j2)) & 255) << 24) | ((((long) PlatformDependent.getByte(4 + j2)) & 255) << 32) | ((((long) PlatformDependent.getByte(5 + j2)) & 255) << 40) | ((255 & ((long) PlatformDependent.getByte(6 + j2))) << 48);
        }
        long j3 = PlatformDependent.getLong(j2);
        return PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? Long.reverseBytes(j3) : j3;
    }

    public static short getShort(long j2) {
        if (!UNALIGNED) {
            return (short) ((PlatformDependent.getByte(j2 + 1) & 255) | (PlatformDependent.getByte(j2) << 8));
        }
        short s = PlatformDependent.getShort(j2);
        return PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? s : Short.reverseBytes(s);
    }

    public static short getShortLE(long j2) {
        if (!UNALIGNED) {
            return (short) ((PlatformDependent.getByte(j2 + 1) << 8) | (PlatformDependent.getByte(j2) & 255));
        }
        short s = PlatformDependent.getShort(j2);
        return PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? Short.reverseBytes(s) : s;
    }

    public static int getUnsignedMedium(long j2) {
        int i;
        int i2;
        if (UNALIGNED) {
            i = (PlatformDependent.getByte(j2) & 255) << 16;
            i2 = (PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? PlatformDependent.getShort(j2 + 1) : Short.reverseBytes(PlatformDependent.getShort(j2 + 1))) & UShort.MAX_VALUE;
        } else {
            i = ((PlatformDependent.getByte(j2) & 255) << 16) | ((PlatformDependent.getByte(1 + j2) & 255) << 8);
            i2 = PlatformDependent.getByte(j2 + 2) & 255;
        }
        return i2 | i;
    }

    public static int getUnsignedMediumLE(long j2) {
        int i;
        int iReverseBytes;
        if (UNALIGNED) {
            i = PlatformDependent.getByte(j2) & 255;
            iReverseBytes = ((PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? Short.reverseBytes(PlatformDependent.getShort(j2 + 1)) : PlatformDependent.getShort(j2 + 1)) & UShort.MAX_VALUE) << 8;
        } else {
            i = (PlatformDependent.getByte(j2) & 255) | ((PlatformDependent.getByte(1 + j2) & 255) << 8);
            iReverseBytes = (PlatformDependent.getByte(j2 + 2) & 255) << 16;
        }
        return iReverseBytes | i;
    }

    public static UnpooledUnsafeDirectByteBuf newUnsafeDirectByteBuf(ByteBufAllocator byteBufAllocator, int i, int i2) {
        return PlatformDependent.useDirectBufferNoCleaner() ? new UnpooledUnsafeNoCleanerDirectByteBuf(byteBufAllocator, i, i2) : new UnpooledUnsafeDirectByteBuf(byteBufAllocator, i, i2);
    }

    public static void setByte(long j2, int i) {
        PlatformDependent.putByte(j2, (byte) i);
    }

    public static int setBytes(AbstractByteBuf abstractByteBuf, long j2, int i, InputStream inputStream, int i2) throws IOException {
        abstractByteBuf.checkIndex(i, i2);
        ByteBuf byteBufHeapBuffer = abstractByteBuf.alloc().heapBuffer(i2);
        try {
            byte[] bArrArray = byteBufHeapBuffer.array();
            int iArrayOffset = byteBufHeapBuffer.arrayOffset();
            int i3 = inputStream.read(bArrArray, iArrayOffset, i2);
            if (i3 > 0) {
                PlatformDependent.copyMemory(bArrArray, iArrayOffset, j2, i3);
            }
            return i3;
        } finally {
            byteBufHeapBuffer.release();
        }
    }

    public static void setInt(long j2, int i) {
        if (UNALIGNED) {
            if (!PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
                i = Integer.reverseBytes(i);
            }
            PlatformDependent.putInt(j2, i);
        } else {
            PlatformDependent.putByte(j2, (byte) (i >>> 24));
            PlatformDependent.putByte(1 + j2, (byte) (i >>> 16));
            PlatformDependent.putByte(2 + j2, (byte) (i >>> 8));
            PlatformDependent.putByte(j2 + 3, (byte) i);
        }
    }

    public static void setIntLE(long j2, int i) {
        if (UNALIGNED) {
            if (PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
                i = Integer.reverseBytes(i);
            }
            PlatformDependent.putInt(j2, i);
        } else {
            PlatformDependent.putByte(j2, (byte) i);
            PlatformDependent.putByte(1 + j2, (byte) (i >>> 8));
            PlatformDependent.putByte(2 + j2, (byte) (i >>> 16));
            PlatformDependent.putByte(j2 + 3, (byte) (i >>> 24));
        }
    }

    public static void setLong(long j2, long j3) {
        if (UNALIGNED) {
            if (!PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
                j3 = Long.reverseBytes(j3);
            }
            PlatformDependent.putLong(j2, j3);
            return;
        }
        PlatformDependent.putByte(j2, (byte) (j3 >>> 56));
        PlatformDependent.putByte(1 + j2, (byte) (j3 >>> 48));
        PlatformDependent.putByte(2 + j2, (byte) (j3 >>> 40));
        PlatformDependent.putByte(3 + j2, (byte) (j3 >>> 32));
        PlatformDependent.putByte(4 + j2, (byte) (j3 >>> 24));
        PlatformDependent.putByte(5 + j2, (byte) (j3 >>> 16));
        PlatformDependent.putByte(6 + j2, (byte) (j3 >>> 8));
        PlatformDependent.putByte(j2 + 7, (byte) j3);
    }

    public static void setLongLE(long j2, long j3) {
        if (UNALIGNED) {
            if (PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
                j3 = Long.reverseBytes(j3);
            }
            PlatformDependent.putLong(j2, j3);
            return;
        }
        PlatformDependent.putByte(j2, (byte) j3);
        PlatformDependent.putByte(1 + j2, (byte) (j3 >>> 8));
        PlatformDependent.putByte(2 + j2, (byte) (j3 >>> 16));
        PlatformDependent.putByte(3 + j2, (byte) (j3 >>> 24));
        PlatformDependent.putByte(4 + j2, (byte) (j3 >>> 32));
        PlatformDependent.putByte(5 + j2, (byte) (j3 >>> 40));
        PlatformDependent.putByte(6 + j2, (byte) (j3 >>> 48));
        PlatformDependent.putByte(j2 + 7, (byte) (j3 >>> 56));
    }

    public static void setMedium(long j2, int i) {
        PlatformDependent.putByte(j2, (byte) (i >>> 16));
        if (!UNALIGNED) {
            PlatformDependent.putByte(1 + j2, (byte) (i >>> 8));
            PlatformDependent.putByte(j2 + 2, (byte) i);
            return;
        }
        long j3 = j2 + 1;
        short sReverseBytes = (short) i;
        if (!PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
            sReverseBytes = Short.reverseBytes(sReverseBytes);
        }
        PlatformDependent.putShort(j3, sReverseBytes);
    }

    public static void setMediumLE(long j2, int i) {
        PlatformDependent.putByte(j2, (byte) i);
        if (!UNALIGNED) {
            PlatformDependent.putByte(1 + j2, (byte) (i >>> 8));
            PlatformDependent.putByte(j2 + 2, (byte) (i >>> 16));
            return;
        }
        long j3 = j2 + 1;
        short sReverseBytes = (short) (i >>> 8);
        if (PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
            sReverseBytes = Short.reverseBytes(sReverseBytes);
        }
        PlatformDependent.putShort(j3, sReverseBytes);
    }

    public static void setShort(long j2, int i) {
        if (!UNALIGNED) {
            PlatformDependent.putByte(j2, (byte) (i >>> 8));
            PlatformDependent.putByte(j2 + 1, (byte) i);
        } else {
            short sReverseBytes = (short) i;
            if (!PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
                sReverseBytes = Short.reverseBytes(sReverseBytes);
            }
            PlatformDependent.putShort(j2, sReverseBytes);
        }
    }

    public static void setShortLE(long j2, int i) {
        if (UNALIGNED) {
            PlatformDependent.putShort(j2, PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? Short.reverseBytes((short) i) : (short) i);
        } else {
            PlatformDependent.putByte(j2, (byte) i);
            PlatformDependent.putByte(j2 + 1, (byte) (i >>> 8));
        }
    }

    private static void setSingleBytes(AbstractByteBuf abstractByteBuf, long j2, int i, ByteBuffer byteBuffer, int i2) {
        abstractByteBuf.checkIndex(i, i2);
        int iLimit = byteBuffer.limit();
        for (int iPosition = byteBuffer.position(); iPosition < iLimit; iPosition++) {
            PlatformDependent.putByte(j2, byteBuffer.get(iPosition));
            j2++;
        }
        byteBuffer.position(iLimit);
    }

    public static void setZero(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return;
        }
        PlatformDependent.setMemory(bArr, i, i2, (byte) 0);
    }

    public static byte getByte(byte[] bArr, int i) {
        return PlatformDependent.getByte(bArr, i);
    }

    public static void setByte(byte[] bArr, int i, int i2) {
        PlatformDependent.putByte(bArr, i, (byte) i2);
    }

    public static void setZero(long j2, int i) {
        if (i == 0) {
            return;
        }
        PlatformDependent.setMemory(j2, i, (byte) 0);
    }

    public static short getShort(byte[] bArr, int i) {
        if (UNALIGNED) {
            short s = PlatformDependent.getShort(bArr, i);
            return PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? s : Short.reverseBytes(s);
        }
        return (short) ((PlatformDependent.getByte(bArr, i + 1) & 255) | (PlatformDependent.getByte(bArr, i) << 8));
    }

    public static short getShortLE(byte[] bArr, int i) {
        if (UNALIGNED) {
            short s = PlatformDependent.getShort(bArr, i);
            return PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? Short.reverseBytes(s) : s;
        }
        return (short) ((PlatformDependent.getByte(bArr, i + 1) << 8) | (PlatformDependent.getByte(bArr, i) & 255));
    }

    public static void setMediumLE(byte[] bArr, int i, int i2) {
        PlatformDependent.putByte(bArr, i, (byte) i2);
        if (UNALIGNED) {
            PlatformDependent.putShort(bArr, i + 1, PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? Short.reverseBytes((short) (i2 >>> 8)) : (short) (i2 >>> 8));
        } else {
            PlatformDependent.putByte(bArr, i + 1, (byte) (i2 >>> 8));
            PlatformDependent.putByte(bArr, i + 2, (byte) (i2 >>> 16));
        }
    }

    public static void setInt(byte[] bArr, int i, int i2) {
        if (UNALIGNED) {
            if (!PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
                i2 = Integer.reverseBytes(i2);
            }
            PlatformDependent.putInt(bArr, i, i2);
        } else {
            PlatformDependent.putByte(bArr, i, (byte) (i2 >>> 24));
            PlatformDependent.putByte(bArr, i + 1, (byte) (i2 >>> 16));
            PlatformDependent.putByte(bArr, i + 2, (byte) (i2 >>> 8));
            PlatformDependent.putByte(bArr, i + 3, (byte) i2);
        }
    }

    public static void setIntLE(byte[] bArr, int i, int i2) {
        if (UNALIGNED) {
            if (PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
                i2 = Integer.reverseBytes(i2);
            }
            PlatformDependent.putInt(bArr, i, i2);
        } else {
            PlatformDependent.putByte(bArr, i, (byte) i2);
            PlatformDependent.putByte(bArr, i + 1, (byte) (i2 >>> 8));
            PlatformDependent.putByte(bArr, i + 2, (byte) (i2 >>> 16));
            PlatformDependent.putByte(bArr, i + 3, (byte) (i2 >>> 24));
        }
    }

    public static void setShort(byte[] bArr, int i, int i2) {
        if (UNALIGNED) {
            short sReverseBytes = (short) i2;
            if (!PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
                sReverseBytes = Short.reverseBytes(sReverseBytes);
            }
            PlatformDependent.putShort(bArr, i, sReverseBytes);
            return;
        }
        PlatformDependent.putByte(bArr, i, (byte) (i2 >>> 8));
        PlatformDependent.putByte(bArr, i + 1, (byte) i2);
    }

    public static void setShortLE(byte[] bArr, int i, int i2) {
        if (UNALIGNED) {
            PlatformDependent.putShort(bArr, i, PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? Short.reverseBytes((short) i2) : (short) i2);
        } else {
            PlatformDependent.putByte(bArr, i, (byte) i2);
            PlatformDependent.putByte(bArr, i + 1, (byte) (i2 >>> 8));
        }
    }

    public static int getInt(byte[] bArr, int i) {
        if (UNALIGNED) {
            int i2 = PlatformDependent.getInt(bArr, i);
            return PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? i2 : Integer.reverseBytes(i2);
        }
        return (PlatformDependent.getByte(bArr, i + 3) & 255) | (PlatformDependent.getByte(bArr, i) << 24) | ((PlatformDependent.getByte(bArr, i + 1) & 255) << 16) | ((PlatformDependent.getByte(bArr, i + 2) & 255) << 8);
    }

    public static int getIntLE(byte[] bArr, int i) {
        if (UNALIGNED) {
            int i2 = PlatformDependent.getInt(bArr, i);
            return PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? Integer.reverseBytes(i2) : i2;
        }
        return (PlatformDependent.getByte(bArr, i + 3) << 24) | (PlatformDependent.getByte(bArr, i) & 255) | ((PlatformDependent.getByte(bArr, i + 1) & 255) << 8) | ((PlatformDependent.getByte(bArr, i + 2) & 255) << 16);
    }

    public static int getUnsignedMedium(byte[] bArr, int i) {
        int i2;
        int i3;
        short sReverseBytes;
        if (UNALIGNED) {
            i2 = (PlatformDependent.getByte(bArr, i) & 255) << 16;
            if (PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
                sReverseBytes = PlatformDependent.getShort(bArr, i + 1);
            } else {
                sReverseBytes = Short.reverseBytes(PlatformDependent.getShort(bArr, i + 1));
            }
            i3 = sReverseBytes & UShort.MAX_VALUE;
        } else {
            i2 = ((PlatformDependent.getByte(bArr, i) & 255) << 16) | ((PlatformDependent.getByte(bArr, i + 1) & 255) << 8);
            i3 = PlatformDependent.getByte(bArr, i + 2) & 255;
        }
        return i3 | i2;
    }

    public static int getUnsignedMediumLE(byte[] bArr, int i) {
        int i2;
        int i3;
        short sReverseBytes;
        if (UNALIGNED) {
            i2 = PlatformDependent.getByte(bArr, i) & 255;
            if (PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
                sReverseBytes = Short.reverseBytes(PlatformDependent.getShort(bArr, i + 1));
            } else {
                sReverseBytes = PlatformDependent.getShort(bArr, i + 1);
            }
            i3 = (sReverseBytes & UShort.MAX_VALUE) << 8;
        } else {
            i2 = (PlatformDependent.getByte(bArr, i) & 255) | ((PlatformDependent.getByte(bArr, i + 1) & 255) << 8);
            i3 = (PlatformDependent.getByte(bArr, i + 2) & 255) << 16;
        }
        return i3 | i2;
    }

    public static void setMedium(byte[] bArr, int i, int i2) {
        PlatformDependent.putByte(bArr, i, (byte) (i2 >>> 16));
        if (UNALIGNED) {
            int i3 = i + 1;
            short sReverseBytes = (short) i2;
            if (!PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
                sReverseBytes = Short.reverseBytes(sReverseBytes);
            }
            PlatformDependent.putShort(bArr, i3, sReverseBytes);
            return;
        }
        PlatformDependent.putByte(bArr, i + 1, (byte) (i2 >>> 8));
        PlatformDependent.putByte(bArr, i + 2, (byte) i2);
    }

    public static void setBytes(AbstractByteBuf abstractByteBuf, long j2, int i, ByteBuf byteBuf, int i2, int i3) {
        abstractByteBuf.checkIndex(i, i3);
        ObjectUtil.checkNotNull(byteBuf, "src");
        if (MathUtil.isOutOfBounds(i2, i3, byteBuf.capacity())) {
            throw new IndexOutOfBoundsException("srcIndex: " + i2);
        }
        if (i3 != 0) {
            if (byteBuf.hasMemoryAddress()) {
                PlatformDependent.copyMemory(byteBuf.memoryAddress() + ((long) i2), j2, i3);
            } else if (byteBuf.hasArray()) {
                PlatformDependent.copyMemory(byteBuf.array(), byteBuf.arrayOffset() + i2, j2, i3);
            } else {
                byteBuf.getBytes(i2, abstractByteBuf, i, i3);
            }
        }
    }

    public static void getBytes(AbstractByteBuf abstractByteBuf, long j2, int i, byte[] bArr, int i2, int i3) {
        abstractByteBuf.checkIndex(i, i3);
        ObjectUtil.checkNotNull(bArr, "dst");
        if (MathUtil.isOutOfBounds(i2, i3, bArr.length)) {
            throw new IndexOutOfBoundsException("dstIndex: " + i2);
        }
        if (i3 != 0) {
            PlatformDependent.copyMemory(j2, bArr, i2, i3);
        }
    }

    public static void setLong(byte[] bArr, int i, long j2) {
        if (UNALIGNED) {
            if (!PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
                j2 = Long.reverseBytes(j2);
            }
            PlatformDependent.putLong(bArr, i, j2);
            return;
        }
        PlatformDependent.putByte(bArr, i, (byte) (j2 >>> 56));
        PlatformDependent.putByte(bArr, i + 1, (byte) (j2 >>> 48));
        PlatformDependent.putByte(bArr, i + 2, (byte) (j2 >>> 40));
        PlatformDependent.putByte(bArr, i + 3, (byte) (j2 >>> 32));
        PlatformDependent.putByte(bArr, i + 4, (byte) (j2 >>> 24));
        PlatformDependent.putByte(bArr, i + 5, (byte) (j2 >>> 16));
        PlatformDependent.putByte(bArr, i + 6, (byte) (j2 >>> 8));
        PlatformDependent.putByte(bArr, i + 7, (byte) j2);
    }

    public static void setLongLE(byte[] bArr, int i, long j2) {
        if (UNALIGNED) {
            if (PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
                j2 = Long.reverseBytes(j2);
            }
            PlatformDependent.putLong(bArr, i, j2);
            return;
        }
        PlatformDependent.putByte(bArr, i, (byte) j2);
        PlatformDependent.putByte(bArr, i + 1, (byte) (j2 >>> 8));
        PlatformDependent.putByte(bArr, i + 2, (byte) (j2 >>> 16));
        PlatformDependent.putByte(bArr, i + 3, (byte) (j2 >>> 24));
        PlatformDependent.putByte(bArr, i + 4, (byte) (j2 >>> 32));
        PlatformDependent.putByte(bArr, i + 5, (byte) (j2 >>> 40));
        PlatformDependent.putByte(bArr, i + 6, (byte) (j2 >>> 48));
        PlatformDependent.putByte(bArr, i + 7, (byte) (j2 >>> 56));
    }

    public static long getLong(byte[] bArr, int i) {
        if (UNALIGNED) {
            long j2 = PlatformDependent.getLong(bArr, i);
            return PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? j2 : Long.reverseBytes(j2);
        }
        return (((long) PlatformDependent.getByte(bArr, i + 7)) & 255) | (((long) PlatformDependent.getByte(bArr, i)) << 56) | ((((long) PlatformDependent.getByte(bArr, i + 1)) & 255) << 48) | ((((long) PlatformDependent.getByte(bArr, i + 2)) & 255) << 40) | ((((long) PlatformDependent.getByte(bArr, i + 3)) & 255) << 32) | ((((long) PlatformDependent.getByte(bArr, i + 4)) & 255) << 24) | ((((long) PlatformDependent.getByte(bArr, i + 5)) & 255) << 16) | ((((long) PlatformDependent.getByte(bArr, i + 6)) & 255) << 8);
    }

    public static long getLongLE(byte[] bArr, int i) {
        if (UNALIGNED) {
            long j2 = PlatformDependent.getLong(bArr, i);
            return PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? Long.reverseBytes(j2) : j2;
        }
        return (((long) PlatformDependent.getByte(bArr, i + 7)) << 56) | (((long) PlatformDependent.getByte(bArr, i)) & 255) | ((((long) PlatformDependent.getByte(bArr, i + 1)) & 255) << 8) | ((((long) PlatformDependent.getByte(bArr, i + 2)) & 255) << 16) | ((((long) PlatformDependent.getByte(bArr, i + 3)) & 255) << 24) | ((((long) PlatformDependent.getByte(bArr, i + 4)) & 255) << 32) | ((((long) PlatformDependent.getByte(bArr, i + 5)) & 255) << 40) | ((255 & ((long) PlatformDependent.getByte(bArr, i + 6))) << 48);
    }

    public static void getBytes(AbstractByteBuf abstractByteBuf, long j2, int i, ByteBuffer byteBuffer) {
        abstractByteBuf.checkIndex(i, byteBuffer.remaining());
        if (byteBuffer.remaining() == 0) {
            return;
        }
        if (byteBuffer.isDirect()) {
            if (!byteBuffer.isReadOnly()) {
                PlatformDependent.copyMemory(j2, PlatformDependent.directBufferAddress(byteBuffer) + ((long) byteBuffer.position()), byteBuffer.remaining());
                byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
                return;
            }
            throw new ReadOnlyBufferException();
        }
        if (byteBuffer.hasArray()) {
            PlatformDependent.copyMemory(j2, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
        } else {
            byteBuffer.put(abstractByteBuf.nioBuffer());
        }
    }

    public static void setBytes(AbstractByteBuf abstractByteBuf, long j2, int i, byte[] bArr, int i2, int i3) {
        abstractByteBuf.checkIndex(i, i3);
        ObjectUtil.checkNotNull(bArr, "src");
        if (MathUtil.isOutOfBounds(i2, i3, bArr.length)) {
            throw new IndexOutOfBoundsException("srcIndex: " + i2);
        }
        if (i3 != 0) {
            PlatformDependent.copyMemory(bArr, i2, j2, i3);
        }
    }

    public static void setBytes(AbstractByteBuf abstractByteBuf, long j2, int i, ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        if (iRemaining == 0) {
            return;
        }
        if (byteBuffer.isDirect()) {
            abstractByteBuf.checkIndex(i, iRemaining);
            PlatformDependent.copyMemory(PlatformDependent.directBufferAddress(byteBuffer) + ((long) byteBuffer.position()), j2, iRemaining);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        } else if (byteBuffer.hasArray()) {
            abstractByteBuf.checkIndex(i, iRemaining);
            PlatformDependent.copyMemory(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), j2, iRemaining);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        } else if (iRemaining < 8) {
            setSingleBytes(abstractByteBuf, j2, i, byteBuffer, iRemaining);
        } else {
            abstractByteBuf.internalNioBuffer(i, iRemaining).put(byteBuffer);
        }
    }

    public static void getBytes(AbstractByteBuf abstractByteBuf, long j2, int i, OutputStream outputStream, int i2) throws IOException {
        abstractByteBuf.checkIndex(i, i2);
        if (i2 != 0) {
            int iMin = Math.min(i2, 8192);
            if (iMin > 1024 && abstractByteBuf.alloc().isDirectBufferPooled()) {
                ByteBuf byteBufHeapBuffer = abstractByteBuf.alloc().heapBuffer(iMin);
                try {
                    getBytes(j2, byteBufHeapBuffer.array(), byteBufHeapBuffer.arrayOffset(), iMin, outputStream, i2);
                    return;
                } finally {
                    byteBufHeapBuffer.release();
                }
            }
            getBytes(j2, ByteBufUtil.threadLocalTempArray(iMin), 0, iMin, outputStream, i2);
        }
    }

    private static void getBytes(long j2, byte[] bArr, int i, int i2, OutputStream outputStream, int i3) throws IOException {
        do {
            int iMin = Math.min(i2, i3);
            long j3 = iMin;
            PlatformDependent.copyMemory(j2, bArr, i, j3);
            outputStream.write(bArr, i, iMin);
            i3 -= iMin;
            j2 += j3;
        } while (i3 > 0);
    }
}
