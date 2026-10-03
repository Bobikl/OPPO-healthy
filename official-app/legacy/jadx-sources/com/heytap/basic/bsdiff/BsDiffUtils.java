package com.heytap.basic.bsdiff;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.q7b;
import java.io.File;

/* JADX INFO: loaded from: classes14.dex */
@Keep
public final class BsDiffUtils {
    private static final String TAG = "BsDiffUtils";

    static {
        System.loadLibrary("bsdiffutils");
    }

    @Keep
    private static native int doPatch(String str, String str2, String str3);

    @Keep
    public static boolean patch(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return false;
        }
        return patch(new File(str), new File(str2), new File(str3));
    }

    @Keep
    public static boolean patch(File file, File file2, File file3) {
        try {
            if (file.exists() && file2.exists()) {
                if (file3.exists()) {
                    file3.delete();
                }
                file3.createNewFile();
                int iDoPatch = doPatch(file.getAbsolutePath(), file2.getAbsolutePath(), file3.getAbsolutePath());
                q7b.j(TAG, "patch finished! result=%s", Integer.valueOf(iDoPatch));
                return iDoPatch == 0;
            }
        } catch (Exception e2) {
            q7b.f(TAG, "patch failed!", e2);
        }
        return false;
    }
}
