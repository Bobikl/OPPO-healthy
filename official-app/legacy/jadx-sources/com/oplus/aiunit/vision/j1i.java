package com.oplus.aiunit.vision;

import android.os.Build;
import java.io.File;

/* JADX INFO: loaded from: classes15.dex */
public class j1i {
    public static final String SO_DIR;
    public static final String TAG = "SoLoader";

    static {
        String str = b78.a().getFilesDir().getAbsolutePath() + "/so/";
        SO_DIR = str;
        File file = new File(str);
        if (file.exists()) {
            return;
        }
        a7b.f(TAG, "[static mkdir] --> mkdir=" + file.mkdir());
    }

    public static boolean a() {
        try {
            for (String str : Build.SUPPORTED_64_BIT_ABIS) {
                if ("arm64-v8a".equals(str)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
