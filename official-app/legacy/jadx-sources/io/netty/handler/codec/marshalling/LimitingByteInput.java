package io.netty.handler.codec.marshalling;

import io.netty.util.internal.ObjectUtil;
import java.io.IOException;
import org.jboss.marshalling.ByteInput;

/* JADX INFO: loaded from: classes10.dex */
class LimitingByteInput implements ByteInput {
    private static final TooBigObjectException EXCEPTION = new TooBigObjectException();
    private final ByteInput input;
    private final long limit;
    private long read;

    public static final class TooBigObjectException extends IOException {
        private static final long serialVersionUID = 1;
    }

    public LimitingByteInput(ByteInput byteInput, long j2) {
        this.input = byteInput;
        this.limit = ObjectUtil.checkPositive(j2, "limit");
    }

    private int readable(int i) {
        return (int) Math.min(i, this.limit - this.read);
    }

    public int available() throws IOException {
        return readable(this.input.available());
    }

    public void close() throws IOException {
    }

    public int read() throws IOException {
        if (readable(1) <= 0) {
            throw EXCEPTION;
        }
        int i = this.input.read();
        this.read++;
        return i;
    }

    public long skip(long j2) throws IOException {
        int i = readable((int) j2);
        if (i <= 0) {
            throw EXCEPTION;
        }
        long jSkip = this.input.skip(i);
        this.read += jSkip;
        return jSkip;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = readable(i2);
        if (i3 > 0) {
            int i4 = this.input.read(bArr, i, i3);
            this.read += (long) i4;
            return i4;
        }
        throw EXCEPTION;
    }
}
