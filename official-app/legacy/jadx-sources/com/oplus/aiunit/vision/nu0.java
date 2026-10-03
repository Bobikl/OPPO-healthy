package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.health.settings.band.utils.Bandsp;
import java.io.File;

/* JADX INFO: loaded from: classes17.dex */
public class nu0 {
    public static final float COMPLETE = 1.0f;
    public static final float DOWNLOAD_CANCEL = -300.0f;
    public static final float DOWNLOAD_ERROR = -600.0f;
    public static final float DOWNLOAD_NULL = -500.0f;
    public static final float DOWNLOAD_PENDING = -400.0f;
    public static final float DOWNLOAD_PROGRESS_COMPLETE = 1.0f;
    public static final float DOWNLOAD_RETRY_FINISH = -700.0f;
    public static final float DOWNLOAD_START = -200.0f;
    public static final String ROOTDIR = ld7.BAND_OTA_FILE;
    public static String OTAFILENAME = ".lzo.lsf";

    public static File a(String str) {
        if (!TextUtils.isEmpty(str) && 1.0f == Bandsp.c(Bandsp.SpName.OTA).u(b(str))) {
            File file = new File(ROOTDIR, b(str));
            if (file.exists()) {
                return file;
            }
        }
        return null;
    }

    public static String b(String str) {
        return wbb.a(str) + OTAFILENAME;
    }

    public static void c(String str, Float f) {
        Bandsp.c(Bandsp.SpName.OTA).R(str, f.floatValue());
    }
}
