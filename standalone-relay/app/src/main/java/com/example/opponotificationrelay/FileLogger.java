package com.example.opponotificationrelay;

import android.content.Context;
import android.util.Log;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 双通道日志：同时写入 android.util.Log 和本地文件。
 * 文件最多两份各 2 MiB；普通日志按大小/一次性延迟批量刷新，错误立即刷新。
 */
public final class FileLogger {
    private static volatile File sLogFile;
    private static RollingLogSink sWriter;
    private static final Object sLock = new Object();
    private static final SimpleDateFormat SDF =
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);

    private static volatile long wireTraceUntil;
    public static boolean wireTraceEnabled() {return android.os.SystemClock.elapsedRealtime()<wireTraceUntil;}
    public static void setWireTrace(boolean enabled) {
        wireTraceUntil=enabled?android.os.SystemClock.elapsedRealtime()+15*60*1000:0;
        i("Diagnostics",enabled?"临时详细日志已开启，15分钟后自动结束":"临时详细日志已关闭");
    }
    private FileLogger() {}

    /** 初始化日志文件路径，应在 Application/Activity/Service 启动时调用。 */
    public static void init(Context context) {
        synchronized(sLock) {
            if (sWriter != null) return;
            File dir = context.getExternalFilesDir(null);
            if (dir == null) dir = context.getFilesDir();
            File target=new File(dir,"oppo-relay.log");
            try {sWriter=new RollingLogSink(target,2*1024*1024,4096,5000);sLogFile=target;}
            catch(java.io.IOException e) {Log.w("FileLogger","文件日志不可用，保留系统日志");return;}
        }
        i("FileLogger", "===== 日志系统初始化 =====");
        i("FileLogger", "日志文件路径: " + sLogFile.getAbsolutePath());
    }

    /** 获取日志文件绝对路径 */
    public static String getLogFilePath() {
        return sLogFile != null ? sLogFile.getAbsolutePath() : "未初始化";
    }

    /** 获取日志文件对象 */
    public static File getLogFile() {
        return sLogFile;
    }

    public static void i(String tag, String msg) {
        Log.i(tag, msg);
        write("I", tag, msg, false);
    }

    public static void w(String tag, String msg) {
        Log.w(tag, msg);
        write("W", tag, msg, true);
    }

    public static void e(String tag, String msg) {
        Log.e(tag, msg);
        write("E", tag, msg, true);
    }

    public static void e(String tag, String msg, Throwable t) {
        Log.e(tag, msg, t);
        write("E", tag, msg + "\n" + Log.getStackTraceString(t), true);
    }

    private static void write(String level, String tag, String msg, boolean flush) {
        synchronized (sLock) {
            if (sWriter == null) return;
            try {
                sWriter.write(SDF.format(new Date())+" "+level+"/"+tag+": "+msg,flush);
            } catch (java.io.IOException ignored) {}
        }
    }
}
