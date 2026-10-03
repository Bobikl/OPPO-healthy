package com.lifesense.plugin.ble.c;

import android.content.Context;
import android.os.Environment;
import com.oplus.aiunit.vision.b78;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes5.dex */
public class e {
    public static Object a(File file) {
        Object object = null;
        if (file == null || !file.isFile() || !file.exists()) {
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            object = objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            return object;
        } catch (IOException | ClassNotFoundException e2) {
            e2.printStackTrace();
            return object;
        }
    }

    public static String a(Context context, String str) {
        String str2;
        try {
            boolean zEquals = Environment.getExternalStorageState().equals("mounted");
            StringBuffer stringBuffer = new StringBuffer();
            if (zEquals) {
                str2 = b78.a().getExternalCacheDir().getPath() + File.separator;
            } else {
                str2 = context.getFilesDir().getAbsolutePath() + File.separator;
            }
            stringBuffer.append(str2);
            stringBuffer.append(str + File.separator);
            File file = new File(stringBuffer.toString());
            if (!file.exists()) {
                file.mkdirs();
                System.err.println("sky-test,create file path >>" + stringBuffer.toString());
            }
            return stringBuffer.toString();
        } catch (Exception unused) {
            return "";
        }
    }
}
