package com.oplus.aiunit.vision;

import android.provider.MediaStore;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public class oa7 {
    public static <T extends MediaStore.MediaColumns> orb a(Class<T> cls, srb srbVar) {
        return new orb(cls, srbVar);
    }

    public static boolean b(String str, String str2) {
        if (!new File(str).exists()) {
            a7b.f("FileCompatUtils", "copyFile failed: src file is not exist !!!");
            return false;
        }
        String str3 = str2 + str.substring(str.lastIndexOf(File.separator));
        if (str3.equals(str)) {
            a7b.f("FileCompatUtils", "copyFile failed: dest file is same as src file.");
            return false;
        }
        File file = new File(str3);
        if (file.exists() && file.isFile()) {
            a7b.f("FileCompatUtils", "copyFile failed: the same file exist already in dest dir.");
            return false;
        }
        new File(str2).mkdirs();
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i == -1) {
                    fileInputStream.close();
                    fileOutputStream.close();
                    return true;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean c(File file) {
        File[] fileArrListFiles;
        if (file == null || !file.exists() || file.isFile() || (fileArrListFiles = file.listFiles()) == null) {
            return false;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isFile()) {
                file2.delete();
            } else if (file2.isDirectory()) {
                c(file2);
            }
        }
        file.delete();
        return true;
    }
}
