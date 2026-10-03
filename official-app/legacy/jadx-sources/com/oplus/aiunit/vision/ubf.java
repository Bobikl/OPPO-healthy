package com.oplus.aiunit.vision;

import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.DigestException;

/* JADX INFO: loaded from: classes8.dex */
public class ubf implements qw4 {
    public final FileDescriptor a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17405c;

    public ubf(FileDescriptor fileDescriptor, long j2, long j3) {
        this.a = fileDescriptor;
        this.b = j2;
        this.f17405c = j3;
    }

    @Override // com.oplus.aiunit.vision.qw4
    public void b(zs4 zs4Var, long j2, int i) throws DigestException, IOException {
        try {
            byte[] bArr = new byte[Math.min(i, 1048576)];
            long j3 = this.b + j2;
            long j4 = ((long) i) + j3;
            long jMin = Math.min(i, 1048576);
            long j5 = j3;
            while (j5 < j4) {
                int iPread = Os.pread(this.a, bArr, 0, (int) jMin, j5);
                zs4Var.a(ByteBuffer.wrap(bArr, 0, iPread));
                j5 += (long) iPread;
                jMin = Math.min(j4 - j5, 1048576L);
            }
        } catch (ErrnoException e2) {
            throw new IOException(e2);
        }
    }

    @Override // com.oplus.aiunit.vision.qw4
    public long size() {
        return this.f17405c;
    }
}
