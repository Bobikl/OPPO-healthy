package com.oplus.aiunit.vision;

import com.danikula.videocache.ProxyCacheException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes13.dex */
public class la7 implements uo2 {
    public final du5 a;
    public File b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RandomAccessFile f13608c;

    public la7(File file, du5 du5Var) throws ProxyCacheException {
        File file2;
        try {
            if (du5Var == null) {
                throw new NullPointerException();
            }
            this.a = du5Var;
            xd7.b(file.getParentFile());
            boolean zExists = file.exists();
            if (zExists) {
                file2 = file;
            } else {
                file2 = new File(file.getParentFile(), file.getName() + ".download");
            }
            this.b = file2;
            this.f13608c = new RandomAccessFile(this.b, zExists ? "r" : "rw");
        } catch (IOException e2) {
            throw new ProxyCacheException("Error using file " + file + " as disc cache", e2);
        }
    }

    @Override // com.oplus.aiunit.vision.uo2
    public synchronized void a(byte[] bArr, int i) throws ProxyCacheException {
        try {
            if (isCompleted()) {
                throw new ProxyCacheException("Error append cache: cache file " + this.b + " is completed!");
            }
            this.f13608c.seek(available());
            this.f13608c.write(bArr, 0, i);
        } catch (IOException e2) {
            throw new ProxyCacheException(String.format("Error writing %d bytes to %s from buffer with size %d", Integer.valueOf(i), this.f13608c, Integer.valueOf(bArr.length)), e2);
        }
    }

    @Override // com.oplus.aiunit.vision.uo2
    public synchronized long available() throws ProxyCacheException {
        try {
        } catch (IOException e2) {
            throw new ProxyCacheException("Error reading length of file " + this.b, e2);
        }
        return (int) this.f13608c.length();
    }

    @Override // com.oplus.aiunit.vision.uo2
    public synchronized int b(byte[] bArr, long j2, int i) throws ProxyCacheException {
        try {
            this.f13608c.seek(j2);
        } catch (IOException e2) {
            throw new ProxyCacheException(String.format("Error reading %d bytes with offset %d from file[%d bytes] to buffer[%d bytes]", Integer.valueOf(i), Long.valueOf(j2), Long.valueOf(available()), Integer.valueOf(bArr.length)), e2);
        }
        return this.f13608c.read(bArr, 0, i);
    }

    public final boolean c(File file) {
        return file.getName().endsWith(".download");
    }

    @Override // com.oplus.aiunit.vision.uo2
    public synchronized void close() throws ProxyCacheException {
        try {
            this.f13608c.close();
            this.a.a(this.b);
        } catch (IOException e2) {
            throw new ProxyCacheException("Error closing file " + this.b, e2);
        }
    }

    @Override // com.oplus.aiunit.vision.uo2
    public synchronized void complete() throws ProxyCacheException {
        if (isCompleted()) {
            return;
        }
        close();
        File file = new File(this.b.getParentFile(), this.b.getName().substring(0, this.b.getName().length() - 9));
        if (!this.b.renameTo(file)) {
            throw new ProxyCacheException("Error renaming file " + this.b + " to " + file + " for completion!");
        }
        this.b = file;
        try {
            this.f13608c = new RandomAccessFile(this.b, "r");
            this.a.a(this.b);
        } catch (IOException e2) {
            throw new ProxyCacheException("Error opening " + this.b + " as disc cache", e2);
        }
    }

    @Override // com.oplus.aiunit.vision.uo2
    public synchronized boolean isCompleted() {
        return !c(this.b);
    }
}
