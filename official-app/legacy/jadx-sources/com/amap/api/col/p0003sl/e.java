package com.amap.api.col.p0003sl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    public interface a {
        void a();

        void a(float f);

        void b();
    }

    public static float a(long j2, long j3) {
        return (j2 / j3) * 100.0f;
    }

    public final long b(File file, File file2, long j2, long j3, a aVar) {
        long jB;
        if (j2 == 0) {
            if (aVar != null) {
                aVar.b();
            }
            return 0L;
        }
        file.getAbsolutePath();
        file2.getAbsolutePath();
        try {
            if (file.isDirectory()) {
                if (!file2.exists() && !file2.mkdirs()) {
                    throw new IOException("Cannot create dir " + file2.getAbsolutePath());
                }
                String[] list = file.list();
                jB = j2;
                if (list == null) {
                    return jB;
                }
                int i = 0;
                while (i < list.length) {
                    try {
                        int i2 = i;
                        jB = b(new File(file, list[i]), new File(new File(file2, file.getName()), list[i]), jB, j3, aVar);
                        i = i2 + 1;
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
                return jB;
            }
            File parentFile = file2.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                throw new IOException("Cannot create dir " + parentFile.getAbsolutePath());
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[1024];
            long j4 = j2;
            while (true) {
                try {
                    int i3 = fileInputStream.read(bArr);
                    if (i3 <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i3);
                    j4 += (long) i3;
                    if (aVar != null) {
                        aVar.a(a(j4, j3));
                    }
                } catch (Exception e3) {
                    e = e3;
                    jB = j4;
                }
            }
            fileInputStream.close();
            fileOutputStream.flush();
            fileOutputStream.close();
            if (aVar != null && j4 >= j3 - 1) {
                aVar.a();
            }
            return j4;
        } catch (Exception e4) {
            e = e4;
            jB = j2;
        }
        e.printStackTrace();
        if (aVar == null) {
            return jB;
        }
        aVar.b();
        return jB;
    }
}
