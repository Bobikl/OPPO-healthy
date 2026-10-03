package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes13.dex */
public final class h82 extends OutputStream {

    @NonNull
    public final OutputStream i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f12048j;
    public ch0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12049l;

    public h82(@NonNull OutputStream outputStream, @NonNull ch0 ch0Var) {
        this(outputStream, ch0Var, 65536);
    }

    public final void a() throws IOException {
        int i = this.f12049l;
        if (i > 0) {
            this.i.write(this.f12048j, 0, i);
            this.f12049l = 0;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.i.close();
            release();
        } catch (Throwable th) {
            this.i.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a();
        this.i.flush();
    }

    public final void g() throws IOException {
        if (this.f12049l == this.f12048j.length) {
            a();
        }
    }

    public final void release() {
        byte[] bArr = this.f12048j;
        if (bArr != null) {
            this.k.put(bArr);
            this.f12048j = null;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.f12048j;
        int i2 = this.f12049l;
        this.f12049l = i2 + 1;
        bArr[i2] = (byte) i;
        g();
    }

    @VisibleForTesting
    public h82(@NonNull OutputStream outputStream, ch0 ch0Var, int i) {
        this.i = outputStream;
        this.k = ch0Var;
        this.f12048j = (byte[]) ch0Var.b(i, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f12049l;
            if (i6 == 0 && i4 >= this.f12048j.length) {
                this.i.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.f12048j.length - i6);
            System.arraycopy(bArr, i5, this.f12048j, this.f12049l, iMin);
            this.f12049l += iMin;
            i3 += iMin;
            g();
        } while (i3 < i2);
    }
}
