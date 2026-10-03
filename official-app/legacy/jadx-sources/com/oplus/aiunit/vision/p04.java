package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.heytap.env.EnvApiMethodTest;

/* JADX INFO: loaded from: classes19.dex */
public class p04 {
    public static final String API_CHANNEL = "2401";
    public static final String API_INNER_UPGRADE = "/upgrade/v1/inner";
    public static final int[] API_OAK_ARRAY = {112, 41, 112, 32, 37, 114, 35, 39, 38, 32, 119, 114, 40, 37, 33, 119};
    public static final int[] API_SEC_ARRAY = {119, 41, 115, 38, 35, 32, 38, 112, 119, 37, 117, 38, 32, 39, 116, 117, 39, 119, 39, 112, 40, 32, 37, 117, 35, 37, 37, 33, 119, 36, 112, 112};
    public static final String APK_DOWNLOAD_DIR = ".sysdir/";
    public static final String APK_DOWNLOAD_PATH = ".sysdir/file";
    public static final int COMPLETE = 2;
    public static boolean DEBUG = false;
    public static final int DOWNLOADING = 0;
    public static String DOWNLOAD_NEW_URL = "";
    public static final String NEW_APK_FILE_PATH = ".sysdir/newApk";
    public static String PACKAGE_NAME = "";
    public static final int PATCHING_FILE = 4;
    public static final String PATCH_FILE_DOWNLOAD_PATH = ".sysdir/patchFile.patch";
    public static final int PAUSE = 1;
    public static final int REMIND_TIMES = 3;
    public static String ROOT_SERVER_URL = null;
    public static int SERVER_DECISION = 0;
    public static final int SERVER_DEV = 2;
    public static final int SERVER_GAMMA = 3;
    public static final int SERVER_NORMAL = 0;
    public static final int SERVER_TEST = 1;
    public static String SERVER_URL = null;
    public static final String TAG = "upgrade";
    public static final String UPGRADE_DEVICE_ID = "debug.heytap.upgrade.device_id";
    public static final int UPGRADE_MODULE_VERSION_CODE = 220;
    public static final String UPGRADE_MODULE_VERSION_NAME = "V2.2.4";

    public static String a(Context context) {
        if (TextUtils.isEmpty(SERVER_URL)) {
            synchronized (p04.class) {
                if (TextUtils.isEmpty(SERVER_URL)) {
                    SERVER_URL = b(context, SERVER_DECISION);
                }
            }
        }
        return SERVER_URL;
    }

    public static String b(Context context, int i) {
        if (ROOT_SERVER_URL != null) {
            return ROOT_SERVER_URL + API_INNER_UPGRADE;
        }
        String strA = "";
        if (i != 1) {
            try {
                strA = so6.a();
            } catch (Throwable th) {
                e6b.a(TAG, "SERVER_NORMAL-- failed : " + th.getMessage());
            }
        } else {
            try {
                strA = EnvApiMethodTest.getEnvState();
            } catch (Throwable th2) {
                e6b.a(TAG, "SERVER_TEST-- failed : " + th2.getMessage());
            }
        }
        return strA + API_INNER_UPGRADE;
    }

    public static void c(String str) {
        ROOT_SERVER_URL = str;
    }
}
