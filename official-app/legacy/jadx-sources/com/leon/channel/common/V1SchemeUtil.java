package com.leon.channel.common;

import com.oplus.aiunit.vision.d73;
import java.io.DataInput;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public class V1SchemeUtil {

    public static class ChannelExistException extends Exception {
        static final long serialVersionUID = -3387516993124229949L;

        public ChannelExistException() {
        }

        public ChannelExistException(String str) {
            super(str);
        }
    }

    public static boolean a(byte[] bArr) {
        if (bArr.length != d73.a.length) {
            return false;
        }
        int i = 0;
        while (true) {
            byte[] bArr2 = d73.a;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    public static String b(File file) throws Exception {
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                long length = randomAccessFile2.length();
                byte[] bArr = d73.a;
                byte[] bArr2 = new byte[bArr.length];
                long length2 = length - ((long) bArr.length);
                randomAccessFile2.seek(length2);
                randomAccessFile2.readFully(bArr2);
                if (!a(bArr2)) {
                    throw new Exception("zip v1 magic not found");
                }
                long j2 = length2 - 2;
                randomAccessFile2.seek(j2);
                int iC = c(randomAccessFile2);
                if (iC <= 0) {
                    throw new Exception("zip channel info not found");
                }
                randomAccessFile2.seek(j2 - ((long) iC));
                byte[] bArr3 = new byte[iC];
                randomAccessFile2.readFully(bArr3);
                String str = new String(bArr3, "UTF-8");
                randomAccessFile2.close();
                return str;
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

    public static short c(DataInput dataInput) throws IOException {
        byte[] bArr = new byte[2];
        dataInput.readFully(bArr);
        return ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getShort(0);
    }
}
