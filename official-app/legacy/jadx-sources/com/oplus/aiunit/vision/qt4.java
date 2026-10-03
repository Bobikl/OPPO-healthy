package com.oplus.aiunit.vision;

import java.io.DataOutput;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes13.dex */
public class qt4 extends OutputStream {
    public final DataOutput i;

    public qt4(DataOutput dataOutput) {
        this.i = dataOutput;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.i.write(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.i.write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.i.write(bArr, i, i2);
    }
}
