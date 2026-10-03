package com.client.platform.opensdk.pay.download.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes13.dex */
public class PrefUtil {
    public static final String U_DOWNLOAD_FILE_SIZE = ".download.file.size";
    public static final String U_DOWNLOAD_PROGRESS = ".download.progress";
    public static final String U_DOWNLOAD_SIZE = ".download.size";
    public static final String U_DOWNLOAD_STATUS = ".download.status";
    private static Context sContext;
    public static SharedPreferences sPref;

    public static String getDownloadFileSize(Context context) {
        if (sPref == null) {
            init(context);
        }
        return sPref.getString(Util.getPackageName(context) + U_DOWNLOAD_FILE_SIZE, "0");
    }

    public static String getDownloadProgress(Context context) {
        if (sPref == null) {
            init(context);
        }
        return sPref.getString(Util.getPackageName(context) + U_DOWNLOAD_PROGRESS, "0");
    }

    public static String getDownloadSize(Context context) {
        if (sPref == null) {
            init(context);
        }
        return sPref.getString(Util.getPackageName(context) + U_DOWNLOAD_SIZE, "0");
    }

    public static String getDownloadStatus(Context context) {
        if (sPref == null) {
            init(context);
        }
        return sPref.getString(Util.getPackageName(context) + U_DOWNLOAD_STATUS, "-1");
    }

    public static void init(Context context) {
        if (sPref == null && sContext == null) {
            sContext = context;
            sPref = PreferenceManager.getDefaultSharedPreferences(context);
        }
        ((WindowManager) sContext.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(new DisplayMetrics());
    }

    public static void removeDownloadFileSize(Context context) {
        if (sPref == null) {
            init(context);
        }
        sPref.edit().remove(Util.getPackageName(context) + U_DOWNLOAD_FILE_SIZE).commit();
    }

    public static void removeDownloadProgress(Context context) {
        if (sPref == null) {
            init(context);
        }
        sPref.edit().remove(Util.getPackageName(context) + U_DOWNLOAD_PROGRESS).commit();
    }

    public static void removeDownloadStatus(Context context) {
        if (sPref == null) {
            init(context);
        }
        sPref.edit().remove(Util.getPackageName(context) + U_DOWNLOAD_STATUS).commit();
    }

    public static void setDownloadFileSize(Context context, String str) {
        if (sPref == null) {
            init(context);
        }
        sPref.edit().putString(Util.getPackageName(context) + U_DOWNLOAD_FILE_SIZE, str).commit();
    }

    public static void setDownloadProgress(Context context, String str) {
        if (sPref == null) {
            init(context);
        }
        sPref.edit().putString(Util.getPackageName(context) + U_DOWNLOAD_PROGRESS, str).commit();
    }

    public static void setDownloadSize(Context context, String str) {
        if (sPref == null) {
            init(context);
        }
        sPref.edit().putString(Util.getPackageName(context) + U_DOWNLOAD_SIZE, str).commit();
    }

    public static void setDownloadStatus(Context context, String str) {
        if (sPref == null) {
            init(context);
        }
        sPref.edit().putString(Util.getPackageName(context) + U_DOWNLOAD_STATUS, str).commit();
    }
}
