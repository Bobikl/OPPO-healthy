package com.oplus.aiunit.vision;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public class fol {

    public class a implements Comparator<File> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return Long.compare(file.lastModified(), file2.lastModified());
        }
    }

    public static long b(File file) {
        long length = 0;
        if (file != null && file.exists()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return 0L;
            }
            for (File file2 : fileArrListFiles) {
                length += file2.isFile() ? file2.length() : b(file2);
            }
        }
        return length;
    }

    public static long c(Context context) {
        long jB = 0;
        for (File file : j(context)) {
            if (file != null && file.exists()) {
                jB += b(file);
            }
        }
        return jB;
    }

    public static void d(Context context) {
        e(context, 104857600L);
    }

    public static void e(final Context context, final long j2) {
        if (context == null) {
            return;
        }
        mwj.i(new Runnable() { // from class: com.oplus.aiunit.vision.eol
            @Override // java.lang.Runnable
            public final void run() {
                fol.l(context, j2);
            }
        });
    }

    public static void f(Context context, long j2) {
        long j3 = (long) (j2 * 0.8f);
        try {
            File[] fileArrI = i(context);
            Arrays.sort(fileArrI, new a());
            long jC = c(context);
            int i = 0;
            for (File file : fileArrI) {
                if (jC <= j3) {
                    break;
                }
                long length = file.length();
                if (file.delete()) {
                    jC -= length;
                    i++;
                }
            }
            m7b.a("WebViewCacheManager", "Cache cleaning completed. Deleted " + i + " files");
            m7b.a("WebViewCacheManager", "New cache size: " + ((jC / 1024) / 1024) + "MB");
        } catch (Exception e2) {
            m7b.d("WebViewCacheManager", "Error during cache cleaning: " + e2.getMessage());
        }
    }

    public static int g(File file, File[] fileArr, int i) {
        if (file != null && file.exists() && i < fileArr.length) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return i;
            }
            for (File file2 : fileArrListFiles) {
                if (!file2.isFile()) {
                    i = g(file2, fileArr, i);
                } else if (i < fileArr.length) {
                    fileArr[i] = file2;
                    i++;
                }
            }
        }
        return i;
    }

    public static int h(File file) {
        File[] fileArrListFiles;
        if (file == null || !file.exists() || (fileArrListFiles = file.listFiles()) == null) {
            return 0;
        }
        int iH = 0;
        for (File file2 : fileArrListFiles) {
            iH = file2.isFile() ? iH + 1 : iH + h(file2);
        }
        return iH;
    }

    public static File[] i(Context context) {
        File[] fileArrJ = j(context);
        int iH = 0;
        for (File file : fileArrJ) {
            if (file != null && file.exists()) {
                iH += h(file);
            }
        }
        File[] fileArr = new File[iH];
        int iG = 0;
        for (File file2 : fileArrJ) {
            if (file2 != null && file2.exists()) {
                iG = g(file2, fileArr, iG);
            }
        }
        return fileArr;
    }

    public static File[] j(Context context) {
        String strK = k(context);
        File file = context.getApplicationInfo().dataDir != null ? new File(context.getApplicationInfo().dataDir) : null;
        File cacheDir = context.getCacheDir();
        if (TextUtils.isEmpty(strK)) {
            return new File[]{cacheDir, new File(file, "app_webview"), new File(file, "databases")};
        }
        return new File[]{cacheDir, new File(file, "app_webview"), new File(file, "app_webview_" + strK)};
    }

    public static String k(Context context) {
        return Application.getProcessName();
    }

    public static /* synthetic */ void l(Context context, long j2) {
        try {
            long jC = c(context);
            m7b.a("WebViewCacheManager", "Current WebView cache size: " + ((jC / 1024) / 1024) + "MB");
            if (jC > j2) {
                m7b.a("WebViewCacheManager", "Cache size exceeds limit, cleaning...");
                f(context, j2);
            }
        } catch (Throwable th) {
            m7b.d("WebViewCacheManager", "Error while checking cache: " + th.getMessage());
        }
    }
}
