package com.oplus.aiunit.vision;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class m28 {
    public static byte[] a(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            byte[] bArr2 = new byte[1024];
            while (true) {
                int i = byteArrayInputStream.read(bArr2, 0, 1024);
                if (i == -1) {
                    gZIPOutputStream.finish();
                    gZIPOutputStream.flush();
                    gZIPOutputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                gZIPOutputStream.write(bArr2, 0, i);
            }
        } catch (IOException e2) {
            throw new IOException("gzip to inputStream failure", e2);
        }
    }

    public static String b(byte[] bArr, String str) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                try {
                    byte[] bArr2 = new byte[256];
                    while (true) {
                        int i = gZIPInputStream.read(bArr2);
                        if (i < 0) {
                            String string = byteArrayOutputStream.toString(str);
                            gZIPInputStream.close();
                            byteArrayInputStream.close();
                            byteArrayOutputStream.close();
                            return string;
                        }
                        byteArrayOutputStream.write(bArr2, 0, i);
                        try {
                            byteArrayInputStream.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        gZIPInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                byteArrayInputStream.close();
                throw th4;
            }
        } catch (Throwable th5) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }
}
