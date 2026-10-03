package com.oplus.aiunit.vision;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes16.dex */
public class yuk {
    public static final String MD_5 = "MD5";

    public static long a(RandomAccessFile randomAccessFile) {
        try {
            randomAccessFile.seek(0L);
            byte[] bArr = new byte[2048];
            int i = randomAccessFile.read(bArr, 0, 2048);
            CRC32 crc32 = new CRC32();
            while (i > -1) {
                crc32.update(bArr, 0, i);
                i = randomAccessFile.read(bArr, 0, 2048);
            }
            return crc32.getValue();
        } catch (IOException e2) {
            a7b.b("VerifyUtil", "fileToCrc32 " + e2.getMessage());
            return 0L;
        }
    }

    public static String b(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (byte b : bArrDigest) {
                int i = b & 255;
                if (i < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e2) {
            a7b.f("VerifyUtil", "NoSuchAlgorithmException " + e2.getMessage());
            return null;
        }
    }
}
