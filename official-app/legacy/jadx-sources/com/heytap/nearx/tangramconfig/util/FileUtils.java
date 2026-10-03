package com.heytap.nearx.tangramconfig.util;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import com.heytap.mspsdk.log.MspLog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes17.dex */
public class FileUtils {
    private static final String TAG = "FileUtils";

    private FileUtils() {
    }

    public static File copyFile(@NonNull Context context, Uri uri, File file) throws IOException {
        Log.d(TAG, "copyFile:" + uri + " to " + file);
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        if (!file.exists()) {
            file.createNewFile();
        }
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStreamOpenInputStream.read(bArr);
                        if (i == -1) {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            inputStreamOpenInputStream.close();
                            return file;
                        }
                        fileOutputStream.write(bArr, 0, i);
                    }
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e2) {
                throw e2;
            }
        } catch (Throwable th3) {
            inputStreamOpenInputStream.close();
            throw th3;
        }
    }

    public static void createDirs(String str) {
        MspLog.d(TAG, "createDirs:" + str);
        String[] strArrSplit = str.split("/");
        if (strArrSplit == null || strArrSplit.length == 0) {
            return;
        }
        String str2 = "";
        for (String str3 : strArrSplit) {
            str2 = str2 + str3 + "/";
            File file = new File(str2);
            if (!file.exists()) {
                file.mkdir();
            }
        }
        MspLog.d(TAG, "str:" + str2);
    }

    public static long getFileSize(String str) {
        File file = new File(str);
        if (file.exists()) {
            return file.length();
        }
        return -1L;
    }

    public static long getFileSize(File file) {
        if (file.exists()) {
            return file.length();
        }
        return -1L;
    }
}
