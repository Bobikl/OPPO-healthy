package com.heytap.voiceassistant.sdk.tts.monitor;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.voiceassistant.sdk.tts.closure.d.c;
import com.oplus.weatherservicesdk.data.Weather;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public class Logger {
    private static final String TAG = "Logger";
    private static final Set<a> sListenerSet = new HashSet();
    private static LogHook logHook = new com.heytap.voiceassistant.sdk.tts.closure.d.a();
    private static int sLevel = 8;

    public interface a {
        void a(int i);
    }

    public static void addLogLevelChangedListener(a aVar) {
        Set<a> set = sListenerSet;
        synchronized (set) {
            set.add(aVar);
        }
    }

    public static void debug(String str, String str2) {
        if (sLevel <= 3) {
            logHook.d(str, str2);
            if (c.d) {
                c.b(str, str2, "D");
            }
        }
    }

    public static void error(String str, String str2) {
        if (sLevel <= 6) {
            logHook.e(str, str2);
            if (c.d) {
                c.b(str, str2, ExifInterface.LONGITUDE_EAST);
            }
        }
    }

    public static int getLogLevel() {
        return sLevel;
    }

    public static void info(String str, String str2) {
        if (sLevel <= 4) {
            logHook.i(str, str2);
            if (c.d) {
                c.b(str, str2, "I");
            }
        }
    }

    public static void print(String str, String str2) {
        logHook.print(str, str2);
        if (c.d) {
            c.b(str, str2, "I");
        }
    }

    public static void setLogHook(LogHook logHook2) {
        logHook = logHook2;
    }

    public static void setLogLevel(int i) {
        Log.i(TAG, "setLogLevel | logLevel = " + i);
        int i2 = sLevel;
        sLevel = i;
        c.d = false;
        c.b();
        if (i2 != i) {
            Set<a> set = sListenerSet;
            synchronized (set) {
                Iterator<a> it = set.iterator();
                while (it.hasNext()) {
                    it.next().a(i);
                }
            }
        }
    }

    public static void warn(String str, String str2) {
        if (sLevel <= 5) {
            logHook.w(str, str2);
            if (c.d) {
                c.b(str, str2, ExifInterface.LONGITUDE_WEST);
            }
        }
    }

    public static void error(String str, String str2, Throwable th) {
        if (sLevel <= 6) {
            logHook.e(str, str2, th);
            if (c.d) {
                c.b(str, str2 + Weather.SEPARATOR + Log.getStackTraceString(th), ExifInterface.LONGITUDE_EAST);
            }
        }
    }

    public static void setLogLevel(int i, boolean z) {
        Log.i(TAG, String.format("setLogLevel | logLevel =%s , saveLog =%s ", Integer.valueOf(i), Boolean.valueOf(z)));
        int i2 = sLevel;
        sLevel = i;
        c.d = z;
        c.b();
        if (i2 != i) {
            Set<a> set = sListenerSet;
            synchronized (set) {
                Iterator<a> it = set.iterator();
                while (it.hasNext()) {
                    it.next().a(i);
                }
            }
        }
    }

    public static void warn(String str, String str2, Throwable th) {
        if (sLevel <= 5) {
            logHook.w(str, str2, th);
            if (c.d) {
                c.b(str, str2 + Weather.SEPARATOR + Log.getStackTraceString(th), ExifInterface.LONGITUDE_WEST);
            }
        }
    }

    public static void warn(String str, Throwable th) {
        if (sLevel <= 5) {
            logHook.w(str, "", th);
            if (c.d) {
                c.b(str, Log.getStackTraceString(th), ExifInterface.LONGITUDE_WEST);
            }
        }
    }
}
