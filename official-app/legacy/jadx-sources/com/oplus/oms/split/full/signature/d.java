package com.oplus.oms.split.full.signature;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.c3h;
import com.oplus.aiunit.vision.gd2;
import com.oplus.aiunit.vision.id2;
import com.oplus.aiunit.vision.qw4;
import com.oplus.aiunit.vision.zs4;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes8.dex */
public abstract class d {
    public static final byte[] a = new byte[8];

    public static class b implements zs4 {
        public int a;
        public final ByteBuffer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MessageDigest f20009c;
        public final byte[] d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f20010e;

        @Override // com.oplus.aiunit.vision.zs4
        public void a(ByteBuffer byteBuffer) throws DigestException {
            byteBuffer.position();
            int iRemaining = byteBuffer.remaining();
            while (iRemaining > 0) {
                int iMin = Math.min(iRemaining, 4096 - this.a);
                byteBuffer.limit(byteBuffer.position() + iMin);
                this.f20009c.update(byteBuffer);
                iRemaining -= iMin;
                int i = this.a + iMin;
                this.a = i;
                if (i == 4096) {
                    MessageDigest messageDigest = this.f20009c;
                    byte[] bArr = this.d;
                    messageDigest.digest(bArr, 0, bArr.length);
                    this.b.put(this.d);
                    byte[] bArr2 = this.f20010e;
                    if (bArr2 != null) {
                        this.f20009c.update(bArr2);
                    }
                    this.a = 0;
                }
            }
        }

        public void c() throws DigestException {
            if (this.a == 0) {
                return;
            }
            throw new IllegalStateException("Buffer is not empty: " + this.a);
        }

        public final void d() {
            int iPosition = this.b.position() % 4096;
            if (iPosition == 0) {
                return;
            }
            this.b.put(ByteBuffer.allocate(4096 - iPosition));
        }

        public b(@Nullable byte[] bArr, @NonNull ByteBuffer byteBuffer) throws NoSuchAlgorithmException {
            this.d = new byte[32];
            this.f20010e = bArr;
            this.b = byteBuffer.slice();
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
            this.f20009c = messageDigest;
            if (bArr != null) {
                messageDigest.update(bArr);
            }
            this.a = 0;
        }
    }

    public static class c {
        public final ByteBuffer a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f20011c;

        public c(ByteBuffer byteBuffer, int i, byte[] bArr) {
            this.a = byteBuffer;
            this.b = i;
            this.f20011c = bArr;
        }
    }

    public static void a(@NonNull c3h c3hVar) {
        long j2 = c3hVar.b;
        if (j2 % 4096 != 0) {
            throw new IllegalArgumentException("APK Signing Block does not start at the page boundary: " + c3hVar.b);
        }
        if ((c3hVar.f9939c - j2) % 4096 == 0) {
            return;
        }
        throw new IllegalArgumentException("Size of APK Signing Block is not a multiple of 4096: " + (c3hVar.f9939c - c3hVar.b));
    }

    public static int[] b(long j2) {
        ArrayList arrayList = new ArrayList();
        do {
            j2 = d(j2, 4096L) * 32;
            arrayList.add(Long.valueOf(d(j2, 4096L) * 4096));
        } while (j2 > 4096);
        int[] iArr = new int[arrayList.size() + 1];
        int i = 0;
        iArr[0] = 0;
        while (i < arrayList.size()) {
            int i2 = i + 1;
            iArr[i2] = iArr[i] + Math.toIntExact(((Long) arrayList.get((arrayList.size() - i) - 1)).longValue());
            i = i2;
        }
        return iArr;
    }

    public static void c(zs4 zs4Var, qw4 qw4Var, int i) throws DigestException, IOException {
        long size = qw4Var.size();
        long j2 = 0;
        while (size > 0) {
            int iMin = (int) Math.min(size, i);
            qw4Var.b(zs4Var, j2, iMin);
            long j3 = iMin;
            j2 += j3;
            size -= j3;
        }
    }

    public static long d(long j2, long j3) {
        return ((j2 + j3) - 1) / j3;
    }

    public static void e(RandomAccessFile randomAccessFile, c3h c3hVar, byte[] bArr, ByteBuffer byteBuffer) throws NoSuchAlgorithmException, DigestException, IOException {
        b bVar = new b(bArr, byteBuffer);
        c(bVar, qw4.a(randomAccessFile.getFD(), 0L, c3hVar.b), 1048576);
        long j2 = c3hVar.d + 16;
        FileDescriptor fd = randomAccessFile.getFD();
        long j3 = c3hVar.f9939c;
        c(bVar, qw4.a(fd, j3, j2 - j3), 1048576);
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putInt(Math.toIntExact(c3hVar.b));
        byteBufferOrder.flip();
        bVar.a(byteBufferOrder);
        long j4 = j2 + 4;
        c(bVar, qw4.a(randomAccessFile.getFD(), j4, randomAccessFile.getChannel().size() - j4), 1048576);
        int size = (int) (randomAccessFile.getChannel().size() % 4096);
        if (size != 0) {
            bVar.a(ByteBuffer.allocate(4096 - size));
        }
        bVar.c();
        bVar.d();
    }

    @NonNull
    public static c f(@NonNull RandomAccessFile randomAccessFile, @Nullable c3h c3hVar, @NonNull id2 id2Var) throws NoSuchAlgorithmException, DigestException, IOException, SecurityException {
        return g(randomAccessFile, id2Var, c3hVar);
    }

    @NonNull
    public static c g(@NonNull RandomAccessFile randomAccessFile, @NonNull id2 id2Var, @Nullable c3h c3hVar) throws NoSuchAlgorithmException, DigestException, IOException, SecurityException {
        int[] iArrB = b(randomAccessFile.getChannel().size() - (c3hVar.f9939c - c3hVar.b));
        int i = iArrB[iArrB.length - 1];
        ByteBuffer byteBufferCreate = id2Var.create(i + 4096);
        byteBufferCreate.order(ByteOrder.LITTLE_ENDIAN);
        return new c(byteBufferCreate, i, h(randomAccessFile, c3hVar, a, iArrB, i(byteBufferCreate, 0, i)));
    }

    @NonNull
    public static byte[] h(@NonNull RandomAccessFile randomAccessFile, @Nullable c3h c3hVar, @Nullable byte[] bArr, @NonNull int[] iArr, @NonNull ByteBuffer byteBuffer) throws NoSuchAlgorithmException, DigestException, IOException {
        a(c3hVar);
        e(randomAccessFile, c3hVar, bArr, i(byteBuffer, iArr[iArr.length - 2], iArr[iArr.length - 1]));
        int length = iArr.length - 3;
        while (true) {
            if (length < 0) {
                byte[] bArr2 = new byte[32];
                b bVar = new b(bArr, ByteBuffer.wrap(bArr2));
                bVar.a(i(byteBuffer, 0, 4096));
                bVar.c();
                return bArr2;
            }
            int i = length + 1;
            ByteBuffer byteBufferI = i(byteBuffer, iArr[i], iArr[length + 2]);
            ByteBuffer byteBufferI2 = i(byteBuffer, iArr[length], iArr[i]);
            gd2 gd2Var = new gd2(byteBufferI);
            b bVar2 = new b(bArr, byteBufferI2);
            c(bVar2, gd2Var, 4096);
            bVar2.c();
            bVar2.d();
            length--;
        }
    }

    public static ByteBuffer i(ByteBuffer byteBuffer, int i, int i2) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(0);
        byteBufferDuplicate.limit(i2);
        byteBufferDuplicate.position(i);
        return byteBufferDuplicate.slice();
    }
}
