package com.oplus.aiunit.vision;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class axm {
    public static String a(String str, boolean z) throws IOException {
        File file = new File(str);
        String str2 = file.getPath() + ".gz";
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(str2);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(fileOutputStream);
        byte[] bArr = new byte[k18.GL_BYTE];
        while (true) {
            int i = fileInputStream.read(bArr, 0, k18.GL_BYTE);
            if (i == -1) {
                break;
            }
            gZIPOutputStream.write(bArr, 0, i);
        }
        gZIPOutputStream.close();
        fileInputStream.close();
        fileOutputStream.flush();
        fileOutputStream.close();
        if (z) {
            file.delete();
        }
        return str2;
    }
}
