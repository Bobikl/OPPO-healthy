package io.netty.handler.codec.compression;

import io.netty.buffer.ByteBuf;

/* JADX INFO: loaded from: classes10.dex */
final class Bzip2BitWriter {
    private long bitBuffer;
    private int bitCount;

    public void flush(ByteBuf byteBuf) {
        int i = this.bitCount;
        if (i > 0) {
            long j2 = this.bitBuffer;
            int i2 = 64 - i;
            if (i <= 8) {
                byteBuf.writeByte((int) ((j2 >>> i2) << (8 - i)));
                return;
            }
            if (i <= 16) {
                byteBuf.writeShort((int) ((j2 >>> i2) << (16 - i)));
            } else if (i <= 24) {
                byteBuf.writeMedium((int) ((j2 >>> i2) << (24 - i)));
            } else {
                byteBuf.writeInt((int) ((j2 >>> i2) << (32 - i)));
            }
        }
    }

    public void writeBits(ByteBuf byteBuf, int i, long j2) {
        if (i < 0 || i > 32) {
            throw new IllegalArgumentException("count: " + i + " (expected: 0-32)");
        }
        int i2 = this.bitCount;
        long j3 = ((j2 << (64 - i)) >>> i2) | this.bitBuffer;
        int i3 = i2 + i;
        if (i3 >= 32) {
            byteBuf.writeInt((int) (j3 >>> 32));
            j3 <<= 32;
            i3 -= 32;
        }
        this.bitBuffer = j3;
        this.bitCount = i3;
    }

    public void writeBoolean(ByteBuf byteBuf, boolean z) {
        int i = this.bitCount + 1;
        long j2 = 0;
        long j3 = this.bitBuffer | (z ? 1 << (64 - i) : 0L);
        if (i == 32) {
            byteBuf.writeInt((int) (j3 >>> 32));
            i = 0;
        } else {
            j2 = j3;
        }
        this.bitBuffer = j2;
        this.bitCount = i;
    }

    public void writeInt(ByteBuf byteBuf, int i) {
        writeBits(byteBuf, 32, i);
    }

    public void writeUnary(ByteBuf byteBuf, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("value: " + i + " (expected 0 or more)");
        }
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                writeBoolean(byteBuf, false);
                return;
            } else {
                writeBoolean(byteBuf, true);
                i = i2;
            }
        }
    }
}
