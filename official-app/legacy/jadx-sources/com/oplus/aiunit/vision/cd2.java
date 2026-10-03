package com.oplus.aiunit.vision;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class cd2 extends InputStream {
    public final ByteBuffer i;

    public cd2(ByteBuffer byteBuffer) {
        this.i = byteBuffer;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.i.remaining();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.i.hasRemaining()) {
            return this.i.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.i.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i2, this.i.remaining());
        this.i.get(bArr, i, iMin);
        return iMin;
    }
}
