package org.apache.commons.codec.binary;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class BaseNCodecInputStream extends FilterInputStream {
    private final BaseNCodec baseNCodec;
    private final BaseNCodec.Context context;
    private final boolean doEncode;
    private final byte[] singleByte;

    public BaseNCodecInputStream(InputStream inputStream, BaseNCodec baseNCodec, boolean z) {
        super(inputStream);
        this.singleByte = new byte[1];
        this.context = new BaseNCodec.Context();
        this.doEncode = z;
        this.baseNCodec = baseNCodec;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return !this.context.eof ? 1 : 0;
    }

    public boolean isStrictDecoding() {
        return this.baseNCodec.isStrictDecoding();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i = read(this.singleByte, 0, 1);
        while (i == 0) {
            i = read(this.singleByte, 0, 1);
        }
        if (i <= 0) {
            return -1;
        }
        byte b = this.singleByte[0];
        return b < 0 ? b + 256 : b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        throw new IOException("mark/reset not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) throws IOException {
        int i;
        if (j2 < 0) {
            throw new IllegalArgumentException("Negative skip length: " + j2);
        }
        byte[] bArr = new byte[512];
        long j3 = j2;
        while (j3 > 0 && (i = read(bArr, 0, (int) Math.min(512, j3))) != -1) {
            j3 -= (long) i;
        }
        return j2 - j3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        Objects.requireNonNull(bArr, "array");
        if (i >= 0 && i2 >= 0) {
            if (i > bArr.length || i + i2 > bArr.length) {
                throw new IndexOutOfBoundsException();
            }
            if (i2 == 0) {
                return 0;
            }
            int results = 0;
            while (results == 0) {
                if (!this.baseNCodec.hasData(this.context)) {
                    byte[] bArr2 = new byte[this.doEncode ? 4096 : 8192];
                    int i3 = ((FilterInputStream) this).in.read(bArr2);
                    if (this.doEncode) {
                        this.baseNCodec.encode(bArr2, 0, i3, this.context);
                    } else {
                        this.baseNCodec.decode(bArr2, 0, i3, this.context);
                    }
                }
                results = this.baseNCodec.readResults(bArr, i, i2, this.context);
            }
            return results;
        }
        throw new IndexOutOfBoundsException();
    }
}
