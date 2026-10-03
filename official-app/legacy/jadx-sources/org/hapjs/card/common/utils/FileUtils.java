package org.hapjs.card.common.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes11.dex */
public class FileUtils {
    private static final String TAG = "FileUtils";

    public static byte[] readStreamAsBytes(InputStream inputStream, int i, boolean z) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = i > 0 ? new ByteArrayOutputStream(i) : new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (inputStream != null) {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (z) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            }
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            if (z && inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            return byteArray2;
        } catch (Throwable th) {
            if (z && inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    public static String readStreamAsString(InputStream inputStream, boolean z) throws IOException {
        return readStreamAsString(inputStream, "UTF-8", z);
    }

    public static String readStreamAsString(InputStream inputStream, String str, boolean z) throws IOException {
        return new String(readStreamAsBytes(inputStream, 0, z), Charset.forName(str));
    }
}
