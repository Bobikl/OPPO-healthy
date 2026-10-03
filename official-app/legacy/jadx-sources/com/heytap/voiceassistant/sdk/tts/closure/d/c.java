package com.heytap.voiceassistant.sdk.tts.closure.d;

import android.os.Process;
import android.util.Log;
import com.heytap.voiceassistant.sdk.tts.Config;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes19.dex */
public class c {
    public static final Object a = new Object();
    public static String b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static RandomAccessFile f8393c = null;
    public static boolean d = false;

    public static void a() {
        RandomAccessFile randomAccessFile;
        Log.d("LogSave", "closeFile");
        synchronized (a) {
            if (d && (randomAccessFile = f8393c) != null) {
                try {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    f8393c = null;
                } catch (Throwable th) {
                    f8393c = null;
                    throw th;
                }
            }
        }
    }

    public static void b(String str, String str2, String str3) {
        if (f8393c != null) {
            synchronized (a) {
                RandomAccessFile randomAccessFile = f8393c;
                if (randomAccessFile != null) {
                    try {
                        if (10485760 <= randomAccessFile.length()) {
                            a();
                            StringBuilder sb = new StringBuilder();
                            sb.append("log file max, del ret = ");
                            sb.append(new File(b + "/tts_logcat.log").delete());
                            Log.i("LogSave", sb.toString());
                            b();
                        }
                        byte[] bytes = a(str, str2, str3).getBytes(StandardCharsets.UTF_8);
                        f8393c.write(bytes, 0, bytes.length);
                    } catch (Exception e2) {
                        Log.e("LogSave", "", e2);
                    }
                }
            }
        }
    }

    public static String a(String str, String str2, String str3) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()) + "\t" + Process.myPid() + "\t" + Process.myTid() + " " + str3 + " " + str + ": " + str2 + '\n';
    }

    public static void b() {
        Log.d("LogSave", "openFile");
        synchronized (a) {
            if (d && f8393c == null) {
                b = Config.getSdkParams().a.get(SpeechConstant.KEY_WORK_DIR_PATH) + "/HeytapTtsEngine/log";
                File file = new File(b);
                if (!file.exists()) {
                    file.mkdirs();
                }
                String str = b + "/tts_logcat.log";
                Log.d("LogSave", " file = " + str);
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rw");
                    f8393c = randomAccessFile;
                    randomAccessFile.seek(randomAccessFile.length());
                } catch (IOException e2) {
                    Log.e("LogSave", "", e2);
                }
            }
        }
    }
}
