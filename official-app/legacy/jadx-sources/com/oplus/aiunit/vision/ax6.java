package com.oplus.aiunit.vision;

import java.io.IOException;
import java.io.InputStream;
import kotlinx.coroutines.DebugKt;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002R\u0014\u0010\u0012\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/ax6;", "Ljava/io/InputStream;", "", "read", "", "b", DebugKt.DEBUG_PROPERTY_VALUE_OFF, "len", "", "n", "skip", "available", "", "close", "bytesRead", "a", "i", "Ljava/io/InputStream;", "delegate", "j", "I", "availableBytes", "<init>", "(Ljava/io/InputStream;)V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public final class ax6 extends InputStream {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final InputStream delegate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int availableBytes = 1073741824;

    public ax6(@NotNull InputStream inputStream) {
        this.delegate = inputStream;
    }

    public final int a(int bytesRead) {
        if (bytesRead == -1) {
            this.availableBytes = 0;
        }
        return bytesRead;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.availableBytes;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override // java.io.InputStream
    public int read() {
        return a(this.delegate.read());
    }

    @Override // java.io.InputStream
    public long skip(long n2) {
        return this.delegate.skip(n2);
    }

    @Override // java.io.InputStream
    public int read(@NotNull byte[] b) {
        return a(this.delegate.read(b));
    }

    @Override // java.io.InputStream
    public int read(@NotNull byte[] b, int off, int len) {
        return a(this.delegate.read(b, off, len));
    }
}
