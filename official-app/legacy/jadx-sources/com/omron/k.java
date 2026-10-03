package com.omron;

import com.oplus.aiunit.vision.ld7;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes5.dex */
public class k {
    public static String a(String str) {
        File file = new File(str);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return str;
    }

    public static byte[] b(String str) {
        try {
            a(str);
            FileInputStream fileInputStream = new FileInputStream(str);
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            fileInputStream.close();
            return bArr;
        } catch (Exception e2) {
            e2.printStackTrace();
            ay.a(ld7.TAG, "readBytes exception:" + str, e2);
            return null;
        }
    }

    public static String a(String str, String str2) {
        try {
            return new String(b(str), str2);
        } catch (Exception e2) {
            e2.printStackTrace();
            ay.a(ld7.TAG, "readString exception:" + str, e2);
            return "";
        }
    }

    public static void a(String str, String str2, String str3, boolean z) {
        try {
            a(str, str2.getBytes(str3), z);
        } catch (Exception e2) {
            e2.printStackTrace();
            ay.a(ld7.TAG, "向文件中写入字符串String类型的内容异常:" + str, e2);
        }
    }

    public static boolean a(String str, byte[] bArr, boolean z) {
        try {
            a(str);
            FileOutputStream fileOutputStream = new FileOutputStream(str, z);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            ay.a(ld7.TAG, "向文件中写入数据异常:" + str, e2);
            return false;
        }
    }
}
