package com.oppo.store.web.util;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes9.dex */
public class DirUtil {
    public static File getAppExternalFile(Context context) {
        String externalStorageState;
        try {
            externalStorageState = Environment.getExternalStorageState();
        } catch (NullPointerException unused) {
            externalStorageState = "";
        }
        File externalFilesDir = "mounted".equals(externalStorageState) ? context.getApplicationContext().getExternalFilesDir(null) : null;
        if (externalFilesDir == null) {
            externalFilesDir = context.getApplicationContext().getFilesDir();
        }
        if (externalFilesDir == null) {
            externalFilesDir = new File("/data/data/" + context.getApplicationContext().getPackageName() + "/files");
        }
        Log.i("Wallet", "external file dir:" + externalFilesDir.getAbsolutePath());
        return externalFilesDir;
    }

    public static String getTempImagesPath(Context context) {
        return new File(getAppExternalFile(context), "Images").getAbsolutePath();
    }
}
