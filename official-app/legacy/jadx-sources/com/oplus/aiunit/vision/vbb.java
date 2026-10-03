package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public class vbb {
    public static final String MD_5 = "MD5";
    public static final String UTF_8 = "UTF-8";

    public static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            stringBuffer.append(String.format("%02x", Byte.valueOf(b)));
        }
        return stringBuffer.toString();
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            a7b.b("MD5Util", "string is null!");
            return "";
        }
        try {
            return a(MessageDigest.getInstance("MD5").digest(str.getBytes()));
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static String c(File file) {
        String string = "";
        if (!file.exists()) {
            return "";
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                int iCeil = (int) Math.ceil(size / 2.147483647E9d);
                MappedByteBuffer[] mappedByteBufferArr = new MappedByteBuffer[iCeil];
                long j2 = 0;
                long j3 = 2147483647L;
                int i = 0;
                while (i < iCeil) {
                    long j4 = size - j2;
                    long j5 = j4 < 2147483647L ? j4 : j3;
                    int i2 = i;
                    mappedByteBufferArr[i2] = channel.map(FileChannel.MapMode.READ_ONLY, j2, j5);
                    j2 += j5;
                    i = i2 + 1;
                    j3 = j5;
                }
                channel.close();
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                for (int i3 = 0; i3 < iCeil; i3++) {
                    messageDigest.update(mappedByteBufferArr[i3]);
                }
                byte[] bArrDigest = messageDigest.digest();
                StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
                for (byte b : bArrDigest) {
                    char c2 = cArr[(b & 240) >> 4];
                    char c3 = cArr[b & 15];
                    sb.append(c2);
                    sb.append(c3);
                }
                string = sb.toString();
                fileInputStream.close();
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
        return string;
    }

    @NotNull
    public static String d(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
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
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NoSuchAlgorithmException ");
            sb2.append(e2.getMessage());
            return "";
        } catch (Exception e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Exception ");
            sb3.append(e3.getMessage());
            return "";
        }
    }
}
