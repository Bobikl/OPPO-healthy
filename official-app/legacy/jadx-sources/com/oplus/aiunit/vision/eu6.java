package com.oplus.aiunit.vision;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: loaded from: classes13.dex */
public final class eu6 extends InputStream {

    @GuardedBy("POOL")
    public static final Queue<eu6> k = uqk.g(0);
    public InputStream i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public IOException f11083j;

    @NonNull
    public static eu6 g(@NonNull InputStream inputStream) {
        eu6 eu6VarPoll;
        Queue<eu6> queue = k;
        synchronized (queue) {
            eu6VarPoll = queue.poll();
        }
        if (eu6VarPoll == null) {
            eu6VarPoll = new eu6();
        }
        eu6VarPoll.h(inputStream);
        return eu6VarPoll;
    }

    @Nullable
    public IOException a() {
        return this.f11083j;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.i.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.i.close();
    }

    public void h(@NonNull InputStream inputStream) {
        this.i = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.i.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.i.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.i.read();
        } catch (IOException e2) {
            this.f11083j = e2;
            throw e2;
        }
    }

    public void release() {
        this.f11083j = null;
        this.i = null;
        Queue<eu6> queue = k;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.i.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j2) throws IOException {
        try {
            return this.i.skip(j2);
        } catch (IOException e2) {
            this.f11083j = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.i.read(bArr);
        } catch (IOException e2) {
            this.f11083j = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.i.read(bArr, i, i2);
        } catch (IOException e2) {
            this.f11083j = e2;
            throw e2;
        }
    }
}
