package com.oplus.aiunit.vision;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes13.dex */
public final class nwi {
    public static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final byte[] EMPTY_BYTES = new byte[0];

    public static class a extends ByteArrayOutputStream {
        public a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public synchronized byte[] toByteArray() {
            int i = ((ByteArrayOutputStream) this).count;
            byte[] bArr = ((ByteArrayOutputStream) this).buf;
            if (i == bArr.length) {
                return bArr;
            }
            return super.toByteArray();
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void b(InputStream inputStream, OutputStream outputStream) throws IOException {
        c(inputStream, outputStream, new byte[4096]);
    }

    public static void c(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    public static byte[] d(InputStream inputStream, int i) throws IOException {
        a aVar = new a(Math.max(0, i));
        b(inputStream, aVar);
        return aVar.toByteArray();
    }
}
