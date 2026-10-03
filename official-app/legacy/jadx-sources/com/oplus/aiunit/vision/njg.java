package com.oplus.aiunit.vision;

import java.io.IOException;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes9.dex */
public class njg extends DigestInputStream {
    public njg(InputStream inputStream, MessageDigest messageDigest) {
        super(inputStream, messageDigest);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j2) throws IOException {
        if (j2 <= 0) {
            return j2;
        }
        int iMin = (int) Math.min(2048L, j2);
        byte[] bArr = new byte[iMin];
        long j3 = j2;
        while (j3 > 0) {
            int i = read(bArr, 0, (int) Math.min(j3, iMin));
            if (i == -1) {
                return j2 - j3;
            }
            j3 -= (long) i;
        }
        return j2;
    }
}
