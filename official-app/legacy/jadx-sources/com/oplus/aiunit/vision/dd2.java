package com.oplus.aiunit.vision;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class dd2 extends OutputStream {
    public final ByteBuffer i;

    public dd2(ByteBuffer byteBuffer) {
        this.i = byteBuffer;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.i.put((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.i.put(bArr, i, i2);
    }
}
