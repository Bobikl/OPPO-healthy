package com.oplus.aiunit.vision;

import com.leon.channel.common.verify.ApkSignatureSchemeV2Verifier;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class lsk {
    public static Map<Integer, ByteBuffer> a(ByteBuffer byteBuffer) throws ApkSignatureSchemeV2Verifier.SignatureNotFoundException {
        ApkSignatureSchemeV2Verifier.a(byteBuffer);
        ByteBuffer byteBufferF = ApkSignatureSchemeV2Verifier.f(byteBuffer, 8, byteBuffer.capacity() - 24);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        while (byteBufferF.hasRemaining()) {
            i++;
            if (byteBufferF.remaining() < 8) {
                throw new ApkSignatureSchemeV2Verifier.SignatureNotFoundException("Insufficient data to read size of APK Signing Block entry #" + i);
            }
            long j2 = byteBufferF.getLong();
            if (j2 < 4 || j2 > 2147483647L) {
                throw new ApkSignatureSchemeV2Verifier.SignatureNotFoundException("APK Signing Block entry #" + i + " size out of range: " + j2);
            }
            int i2 = (int) j2;
            int iPosition = byteBufferF.position() + i2;
            if (i2 > byteBufferF.remaining()) {
                throw new ApkSignatureSchemeV2Verifier.SignatureNotFoundException("APK Signing Block entry #" + i + " size out of range: " + i2 + ", available: " + byteBufferF.remaining());
            }
            int i3 = byteBufferF.getInt();
            linkedHashMap.put(Integer.valueOf(i3), ApkSignatureSchemeV2Verifier.c(byteBufferF, i2 - 4));
            if (i3 == 1896449818) {
                System.out.println("find V2 signature block Id : 1896449818");
            }
            byteBufferF.position(iPosition);
        }
        if (!linkedHashMap.isEmpty()) {
            return linkedHashMap;
        }
        throw new ApkSignatureSchemeV2Verifier.SignatureNotFoundException("not have Id-Value Pair in APK Signing Block entry #" + i);
    }

    public static ByteBuffer b(File file) throws Throwable {
        RandomAccessFile randomAccessFile = null;
        if (file == null || !file.exists() || !file.isFile()) {
            return null;
        }
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                t5e<ByteBuffer, Long> t5eVarE = ApkSignatureSchemeV2Verifier.e(randomAccessFile2);
                ByteBuffer byteBufferB = t5eVarE.b();
                long jLongValue = t5eVarE.c().longValue();
                if (x7m.i(randomAccessFile2, jLongValue)) {
                    throw new ApkSignatureSchemeV2Verifier.SignatureNotFoundException("ZIP64 APK not supported");
                }
                ByteBuffer byteBufferB2 = ApkSignatureSchemeV2Verifier.b(randomAccessFile2, ApkSignatureSchemeV2Verifier.d(byteBufferB, jLongValue)).b();
                randomAccessFile2.close();
                return byteBufferB2;
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
