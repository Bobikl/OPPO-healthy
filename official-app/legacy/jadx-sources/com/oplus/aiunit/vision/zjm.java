package com.oplus.aiunit.vision;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes12.dex */
public final class zjm {
    public RandomAccessFile a;

    public zjm(String str, long j2) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
            } catch (IOException e2) {
                c2n.r(e2, "FileAccessI", "create");
                e2.printStackTrace();
            }
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rw");
        this.a = randomAccessFile;
        randomAccessFile.seek(j2);
    }

    public final synchronized int a(byte[] bArr) throws IOException {
        this.a.write(bArr);
        return bArr.length;
    }

    public final void b() {
        RandomAccessFile randomAccessFile = this.a;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            this.a = null;
        }
    }
}
