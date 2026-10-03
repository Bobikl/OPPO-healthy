package com.oplus.aiunit.vision;

import android.os.Environment;
import java.io.File;

/* JADX INFO: loaded from: classes12.dex */
public final class pmm {
    public static String a(String str) {
        try {
            if (!b()) {
                return null;
            }
            File file = new File(b78.a().getExternalCacheDir().getAbsolutePath(), str);
            if (!file.exists()) {
                return null;
            }
            file.delete();
            return "";
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean b() {
        String externalStorageState = Environment.getExternalStorageState();
        if (externalStorageState == null || externalStorageState.length() <= 0) {
            return false;
        }
        return (externalStorageState.equals("mounted") || externalStorageState.equals("mounted_ro")) && b78.a().getExternalCacheDir() != null;
    }
}
