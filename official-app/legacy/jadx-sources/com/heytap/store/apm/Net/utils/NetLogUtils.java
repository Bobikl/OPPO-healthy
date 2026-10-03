package com.heytap.store.apm.Net.utils;

import android.os.Environment;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.store.apm.ApmClient;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes19.dex */
public final class NetLogUtils {
    private static final int DEBUG = 2;
    private static final int ERROR = 5;
    private static final int INFO = 3;
    public static int LEVEL = 1;
    private static final int VERBOSE = 1;
    private static final int WARN = 4;
    public static String LOG_FOLDER = Environment.getExternalStorageDirectory().getAbsolutePath();
    public static boolean FILEABLE = getFILEABLE();

    private static boolean $(String str) {
        return !ApmClient.logEnable || str == null;
    }

    private static String FILE() {
        return "apmTest";
    }

    private static String FUNC() {
        return new Exception().getStackTrace()[1].getMethodName();
    }

    private static int LINE() {
        return new Exception().getStackTrace()[1].getLineNumber();
    }

    private static String TIME() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
    }

    public static void d(String str, String str2) throws Throwable {
        if ($(str2)) {
            return;
        }
        if (LEVEL <= 2) {
            Log.d(str, str2);
        } else if (FILEABLE) {
            logFile("D", str, str2);
        }
    }

    public static void e(String str, String str2) throws Throwable {
        if ($(str2)) {
            return;
        }
        if (LEVEL <= 5) {
            Log.e(str, str2);
        } else if (FILEABLE) {
            logFile(ExifInterface.LONGITUDE_EAST, str, str2);
        }
    }

    private static boolean getFILEABLE() {
        StringBuilder sb = new StringBuilder();
        sb.append(LOG_FOLDER);
        sb.append("/_FILEABLE");
        return new File(sb.toString()).exists();
    }

    private static String getFileLineMethod() {
        StackTraceElement stackTraceElement = new Exception().getStackTrace()[2];
        return "[" + stackTraceElement.getFileName() + " | " + stackTraceElement.getLineNumber() + " | " + stackTraceElement.getMethodName() + "]";
    }

    private static String getLineMethod() {
        StackTraceElement stackTraceElement = new Exception().getStackTrace()[2];
        return "[" + stackTraceElement.getLineNumber() + " | " + stackTraceElement.getMethodName() + "]";
    }

    public static String getLog(String str, String str2) {
        return "{Thread_:" + Thread.currentThread().getName() + "}[" + str + "_:]" + str2;
    }

    public static void i(String str, String str2) throws Throwable {
        if ($(str2)) {
            return;
        }
        if (LEVEL <= 3) {
            Log.i(str, str2);
        } else if (FILEABLE) {
            logFile("I", str, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.PrintWriter] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    private static void logFile(String str, String str2, String str3) throws Throwable {
        String str4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
        ?? r1 = 0;
        PrintWriter printWriter = null;
        try {
            try {
                PrintWriter printWriter2 = new PrintWriter(new BufferedWriter(new FileWriter(LOG_FOLDER + "/log.txt", true)));
                try {
                    String str5 = "[%s][%s][%s]%s";
                    printWriter2.println(String.format("[%s][%s][%s]%s", str4, str, str2, str3));
                    printWriter2.close();
                    r1 = str5;
                } catch (IOException e2) {
                    e = e2;
                    printWriter = printWriter2;
                    e.printStackTrace();
                    r1 = printWriter;
                    if (printWriter != null) {
                        printWriter.close();
                        r1 = printWriter;
                    }
                } catch (Throwable th) {
                    th = th;
                    r1 = printWriter2;
                    if (r1 != 0) {
                        r1.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    public static void v(String str, String str2) throws Throwable {
        if ($(str2)) {
            return;
        }
        if (LEVEL <= 1) {
            Log.v(str, str2);
        } else if (FILEABLE) {
            logFile(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, str, str2);
        }
    }

    public static void w(String str, String str2) throws Throwable {
        if ($(str2)) {
            return;
        }
        if (LEVEL <= 4) {
            Log.w(str, str2);
        } else if (FILEABLE) {
            logFile(ExifInterface.LONGITUDE_WEST, str, str2);
        }
    }

    public static void d(String str) throws Throwable {
        if ($(str)) {
            return;
        }
        if (LEVEL <= 2) {
            Log.d(FILE(), str);
        } else if (FILEABLE) {
            logFile("D", FILE(), str);
        }
    }

    public static void e(String str) throws Throwable {
        if ($(str)) {
            return;
        }
        if (LEVEL <= 5) {
            Log.e(FILE(), str);
        } else if (FILEABLE) {
            logFile(ExifInterface.LONGITUDE_EAST, FILE(), str);
        }
    }

    public static void i(String str) throws Throwable {
        if ($(str)) {
            return;
        }
        if (LEVEL <= 3) {
            Log.i(FILE(), str);
        } else if (FILEABLE) {
            logFile("I", FILE(), str);
        }
    }

    public static void v(String str) throws Throwable {
        if ($(str)) {
            return;
        }
        if (LEVEL <= 1) {
            Log.v(FILE(), str);
        } else if (FILEABLE) {
            logFile(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, FILE(), str);
        }
    }

    public static void w(String str) throws Throwable {
        if ($(str)) {
            return;
        }
        if (LEVEL <= 4) {
            Log.w(FILE(), str);
        } else if (FILEABLE) {
            logFile(ExifInterface.LONGITUDE_WEST, FILE(), str);
        }
    }
}
