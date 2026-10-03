package com.oplus.aiunit.vision;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p010kotlin.UShort;

/* JADX INFO: loaded from: classes13.dex */
public class dj6 implements Closeable {
    public final int i = 1179403647;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final FileChannel f10587j;

    public dj6(File file) throws FileNotFoundException {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f10587j = new FileInputStream(file).getChannel();
    }

    public final long a(yi6 yi6Var, long j2, long j3) throws IOException {
        for (long j4 = 0; j4 < j2; j4++) {
            zi6 zi6VarB = yi6Var.b(j4);
            if (zi6VarB.a == 1) {
                long j5 = zi6VarB.f19428c;
                if (j5 <= j3 && j3 <= zi6VarB.d + j5) {
                    return (j3 - j5) + zi6VarB.b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f10587j.close();
    }

    public yi6 g() throws IOException {
        this.f10587j.position(0L);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        if (p(byteBufferAllocate, 0L) != 1179403647) {
            throw new IllegalArgumentException("Invalid ELF Magic!");
        }
        short sL = l(byteBufferAllocate, 4L);
        boolean z = l(byteBufferAllocate, 5L) == 2;
        if (sL == 1) {
            return new bj6(z, this);
        }
        if (sL == 2) {
            return new cj6(z, this);
        }
        throw new IllegalStateException("Invalid class type!");
    }

    public List<String> h() throws IOException {
        long j2;
        xi6 xi6VarA;
        this.f10587j.position(0L);
        ArrayList arrayList = new ArrayList();
        yi6 yi6VarG = g();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(yi6VarG.a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j3 = yi6VarG.f;
        int i = 0;
        if (j3 == xnl.PAYLOAD_SHORT_MAX) {
            j3 = yi6VarG.c(0).a;
        }
        long j4 = 0;
        while (true) {
            if (j4 >= j3) {
                j2 = 0;
                break;
            }
            zi6 zi6VarB = yi6VarG.b(j4);
            if (zi6VarB.a == 2) {
                j2 = zi6VarB.b;
                break;
            }
            j4++;
        }
        if (j2 == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        long j5 = 0;
        do {
            xi6VarA = yi6VarG.a(j2, i);
            long j6 = xi6VarA.a;
            if (j6 == 1) {
                arrayList2.add(Long.valueOf(xi6VarA.b));
            } else if (j6 == 5) {
                j5 = xi6VarA.b;
            }
            i++;
        } while (xi6VarA.a != 0);
        if (j5 == 0) {
            throw new IllegalStateException("String table offset not found!");
        }
        long jA = a(yi6VarG, j3, j5);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(o(byteBufferAllocate, ((Long) it.next()).longValue() + jA));
        }
        return arrayList;
    }

    public void i(ByteBuffer byteBuffer, long j2, int i) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        long j3 = 0;
        while (j3 < i) {
            int i2 = this.f10587j.read(byteBuffer, j2 + j3);
            if (i2 == -1) {
                throw new EOFException();
            }
            j3 += (long) i2;
        }
        byteBuffer.position(0);
    }

    public short l(ByteBuffer byteBuffer, long j2) throws IOException {
        i(byteBuffer, j2, 1);
        return (short) (byteBuffer.get() & 255);
    }

    public int m(ByteBuffer byteBuffer, long j2) throws IOException {
        i(byteBuffer, j2, 2);
        return byteBuffer.getShort() & UShort.MAX_VALUE;
    }

    public long n(ByteBuffer byteBuffer, long j2) throws IOException {
        i(byteBuffer, j2, 8);
        return byteBuffer.getLong();
    }

    public String o(ByteBuffer byteBuffer, long j2) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j3 = 1 + j2;
            short sL = l(byteBuffer, j2);
            if (sL == 0) {
                return sb.toString();
            }
            sb.append((char) sL);
            j2 = j3;
        }
    }

    public long p(ByteBuffer byteBuffer, long j2) throws IOException {
        i(byteBuffer, j2, 4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }
}
