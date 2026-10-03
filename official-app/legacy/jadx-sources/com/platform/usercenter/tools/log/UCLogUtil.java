package com.platform.usercenter.tools.log;

import android.util.Log;
import com.platform.usercenter.tools.env.EnvConstantManager;
import com.platform.usercenter.tools.os.SystemPropertyUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class UCLogUtil {
    private static final String COLON = ":";
    private static final String ERROR_OCCURRED_WITH = "Error occurred with ";
    private static final String INFO = "info:";
    private static final String PERSIST_SYS_ASSERT_ENABLE = "persist.sys.assert.enable";
    private static final String PERSIST_SYS_ASSERT_PANIC = "persist.sys.assert.panic";
    private static final String POINT = ".";
    private static String TAG = "UserCenter";
    private static final String VALUE_FALSE = "false";
    private static final String VALUE_TRUE = "true";
    private static final boolean LOGGABLE = Log.isLoggable("UserCenter", 2);
    private static boolean mLogButton = true;
    private static ILog sLogImpl = null;
    private static boolean IS_OPEN_SYS_LOG = isOpenSysLog();

    private UCLogUtil() {
    }

    public static void d(String str, int i) {
        ILog iLog = sLogImpl;
        if (iLog != null) {
            iLog.d(TAG + ":" + str, String.valueOf(i));
            return;
        }
        if (getDecideResult()) {
            Log.d(TAG + ":" + str, String.valueOf(i));
        }
    }

    public static void dAll(String str, String str2) {
        if (sLogImpl != null) {
            if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
                return;
            }
            if (str2.length() <= 3072) {
                sLogImpl.d(str, str2);
                return;
            }
            while (str2.length() > 3072) {
                String strSubstring = str2.substring(0, 3072);
                str2 = str2.replace(strSubstring, "");
                sLogImpl.d(str, strSubstring);
            }
            sLogImpl.d(str, str2);
            return;
        }
        if (!getDecideResult() || str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return;
        }
        if (str2.length() <= 3072) {
            Log.d(str, str2);
            return;
        }
        while (str2.length() > 3072) {
            String strSubstring2 = str2.substring(0, 3072);
            str2 = str2.replace(strSubstring2, "");
            Log.d(str, strSubstring2);
        }
        Log.d(str, str2);
    }

    public static void detailE(String str) {
        if (sLogImpl != null) {
            sLogImpl.e(TAG, getDetailString(str).toString());
        } else if (getDecideResult()) {
            Log.e(TAG, getDetailString(str).toString());
        }
    }

    public static void detailI(String str) {
        int i = 0;
        if (sLogImpl != null) {
            while (i <= str.length() / 1000) {
                int i2 = i * 1000;
                i++;
                int length = i * 1000;
                if (length > str.length()) {
                    length = str.length();
                }
                sLogImpl.i(TAG, INFO + str.substring(i2, length));
            }
            return;
        }
        if (getDecideResult()) {
            while (i <= str.length() / 1000) {
                int i3 = i * 1000;
                i++;
                int length2 = i * 1000;
                if (length2 > str.length()) {
                    length2 = str.length();
                }
                Log.i(TAG, INFO + str.substring(i3, length2));
            }
        }
    }

    public static boolean devMode() {
        return IS_OPEN_SYS_LOG;
    }

    public static void e(String str, String str2) {
        ILog iLog = sLogImpl;
        if (iLog != null) {
            iLog.e(TAG + ":" + str, str2);
            return;
        }
        if (getDecideResult()) {
            Log.e(TAG + ":" + str, str2);
        }
    }

    public static boolean getDecideResult() {
        return mLogButton && (EnvConstantManager.getInstance().DEBUG() || LOGGABLE || IS_OPEN_SYS_LOG);
    }

    @NotNull
    private static StringBuilder getDetailString(String str) {
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        sb.append(str);
        sb.append(" --> ");
        sb.append(stackTrace[1].getClassName());
        sb.append(" ( ");
        sb.append(stackTrace[1].getLineNumber());
        sb.append(" )");
        return sb;
    }

    public static ILog getLogImp() {
        return sLogImpl;
    }

    public static void i(String str, String str2) {
        ILog iLog = sLogImpl;
        if (iLog != null) {
            iLog.i(TAG + "." + str, str2);
            return;
        }
        if (getDecideResult()) {
            Log.i(TAG + "." + str, str2);
        }
    }

    public static void init(String str) {
        TAG = str;
    }

    private static boolean isOpenSysLog() {
        return "true".equalsIgnoreCase(SystemPropertyUtils.get("persist.sys.assert.panic", "false")) || "true".equalsIgnoreCase(SystemPropertyUtils.get("persist.sys.assert.enable", "false"));
    }

    public static void setLogImpl(@NotNull ILog iLog) {
        sLogImpl = iLog;
    }

    public static void switchLogButton(boolean z) {
        mLogButton = z;
    }

    public static void synSysLogStatus() {
        if (devMode() || !isOpenSysLog()) {
            return;
        }
        IS_OPEN_SYS_LOG = true;
    }

    public static void traceE(String str) {
        if (getDecideResult()) {
            Log.e(TAG, str, new Exception(str));
        }
    }

    public static void w(String str, String str2) {
        ILog iLog = sLogImpl;
        if (iLog != null) {
            iLog.w(TAG + ":" + str, str2);
            return;
        }
        if (getDecideResult()) {
            Log.w(TAG + ":" + str, str2);
        }
    }

    public static void d(String str, String str2) {
        ILog iLog = sLogImpl;
        if (iLog != null) {
            iLog.d(TAG + ":" + str, str2);
            return;
        }
        if (getDecideResult()) {
            Log.d(TAG + ":" + str, str2);
        }
    }

    public static void e(String str) {
        ILog iLog = sLogImpl;
        if (iLog != null) {
            iLog.e(TAG, str);
        } else if (getDecideResult()) {
            Log.e(TAG, str);
        }
    }

    public static void i(String str, int i) {
        ILog iLog = sLogImpl;
        if (iLog != null) {
            iLog.i(TAG + ":" + str, String.valueOf(i));
            return;
        }
        if (getDecideResult()) {
            Log.i(TAG + ":" + str, String.valueOf(i));
        }
    }

    public static void d(String str) {
        ILog iLog = sLogImpl;
        if (iLog != null) {
            iLog.d(TAG, str);
        } else if (getDecideResult()) {
            Log.d(TAG, str);
        }
    }

    public static void e(String str, Exception exc) {
        ILog iLog = sLogImpl;
        if (iLog != null) {
            iLog.e(TAG + ":" + str, ERROR_OCCURRED_WITH + exc.getClass());
            return;
        }
        if (getDecideResult()) {
            Log.e(TAG + ":" + str, ERROR_OCCURRED_WITH + exc.getClass());
        }
    }

    public static void i(String str) {
        ILog iLog = sLogImpl;
        if (iLog != null) {
            iLog.i(TAG, str);
        } else if (getDecideResult()) {
            Log.i(TAG, str);
        }
    }

    public static void e(Exception exc) {
        ILog iLog = sLogImpl;
        if (iLog != null) {
            iLog.e(TAG, ERROR_OCCURRED_WITH + exc.getClass());
            return;
        }
        if (getDecideResult()) {
            Log.e(TAG, ERROR_OCCURRED_WITH + exc.getClass());
        }
    }

    public static void i(String str, double d) {
        ILog iLog = sLogImpl;
        if (iLog != null) {
            iLog.i(TAG + ":" + str, String.valueOf(d));
            return;
        }
        if (getDecideResult()) {
            Log.i(TAG + ":" + str, String.valueOf(d));
        }
    }

    public static void i(String str, long j2) {
        ILog iLog = sLogImpl;
        if (iLog != null) {
            iLog.i(TAG + ":" + str, String.valueOf(j2));
            return;
        }
        if (getDecideResult()) {
            Log.i(TAG + ":" + str, String.valueOf(j2));
        }
    }

    public static void i(String str, float f) {
        ILog iLog = sLogImpl;
        if (iLog != null) {
            iLog.i(TAG + ":" + str, String.valueOf(f));
            return;
        }
        if (getDecideResult()) {
            Log.i(TAG + ":" + str, String.valueOf(f));
        }
    }
}
