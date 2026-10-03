package com.heytap.accessory.logging;

import android.util.Log;
import com.google.security.cryptauth.lib.securegcm.SecureGcmProto;
import java.util.Arrays;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class CommonLog {
    public static final int ASSERT = 7;
    public static final String COMMON_TAG = "AF";
    public static final int DEBUG = 3;
    public static final int DEFAULT_LEVEL_DEVELOP_MODE = 4;
    private static final LogProxy DEF_LOG_PROXY;
    private static final String DOT = ".";
    public static final int ERROR = 6;
    public static final int INFO = 4;
    private static final String LOGGING_STATUS_KEY = "log_switch_type";
    private static final int TRACE_LEVEL = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    private static boolean sDevelopMode = false;
    private static LogProxy sLogProxy = null;
    private static String sTAG = "AF";
    private static boolean sTraceFunc = false;

    public interface LogProxy {
        void println(int i, String str, String str2);

        void println(int i, String str, String str2, Throwable th);
    }

    static {
        LogProxy logProxy = new LogProxy() { // from class: com.heytap.accessory.logging.CommonLog.1
            @Override // com.heytap.accessory.logging.CommonLog.LogProxy
            public void println(int i, String str, String str2) {
                Log.println(i, str, str2);
            }

            @Override // com.heytap.accessory.logging.CommonLog.LogProxy
            public void println(int i, String str, String str2, Throwable th) {
                Log.println(i, str, str2 + Log.getStackTraceString(th));
            }
        };
        DEF_LOG_PROXY = logProxy;
        sLogProxy = logProxy;
    }

    public static String cutStr(byte[] bArr, int i) {
        if (bArr == null || i < 1) {
            return null;
        }
        if (i >= bArr.length) {
            return new String(bArr);
        }
        String str = new String(Arrays.copyOf(bArr, i));
        return str.substring(0, str.length() - 1);
    }

    private static String cutTagIfNeed(String str) {
        return str;
    }

    public static void d(String str, String str2) {
        if (sDevelopMode) {
            String strCutTagIfNeed = cutTagIfNeed(sTAG + DOT + str);
            LogProxy logProxy = sLogProxy;
            if (logProxy != null) {
                logProxy.println(3, strCutTagIfNeed, str2);
            }
        }
    }

    public static void e(String str, String str2) {
        String strCutTagIfNeed = cutTagIfNeed(sTAG + DOT + str);
        LogProxy logProxy = sLogProxy;
        if (logProxy != null) {
            logProxy.println(6, strCutTagIfNeed, str2);
        }
    }

    public static void enableDevelopMode(boolean z) {
        sDevelopMode = z;
    }

    public static void enableTrackFunction(boolean z) {
        sTraceFunc = z;
    }

    public static void funcIn() {
        if (sTraceFunc) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
            String className = stackTraceElement.getClassName();
            int iLastIndexOf = className.lastIndexOf(DOT) + 1;
            funcIn(className.length() > iLastIndexOf ? className.substring(iLastIndexOf) : sTAG, stackTraceElement.getMethodName());
        }
    }

    public static void funcOut() {
        if (sTraceFunc) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
            String className = stackTraceElement.getClassName();
            int iLastIndexOf = className.lastIndexOf(DOT) + 1;
            funcOut(className.length() > iLastIndexOf ? className.substring(iLastIndexOf) : sTAG, stackTraceElement.getMethodName());
        }
    }

    public static void i(String str, String str2) {
        String strCutTagIfNeed = cutTagIfNeed(sTAG + DOT + str);
        LogProxy logProxy = sLogProxy;
        if (logProxy != null) {
            logProxy.println(4, strCutTagIfNeed, str2);
        }
    }

    public static boolean isDevelopMode() {
        return sDevelopMode;
    }

    public static boolean isTraceFunctionEnable() {
        return sTraceFunc;
    }

    public static void printLarge(int i, String str, String str2) {
        if (str2.length() < 1000) {
            Log.println(i, str, str2);
            return;
        }
        byte[] bytes = str2.getBytes();
        if (4000 >= bytes.length) {
            Log.println(i, str, str2);
            return;
        }
        int i2 = 1;
        while (4000 < bytes.length) {
            String strCutStr = cutStr(bytes, SecureGcmProto.AppleDeviceDiagonalMils.APPLE_PHONE_VALUE);
            Log.println(i, str, String.format("分段打印(%s):%s", Integer.valueOf(i2), strCutStr));
            bytes = Arrays.copyOfRange(bytes, strCutStr.getBytes().length, bytes.length);
            i2++;
        }
        Log.println(i, str, String.format("分段打印(%s):%s", Integer.valueOf(i2), new String(bytes)));
    }

    public static void setLogProxy(String str, LogProxy logProxy) {
        sTAG = "AF." + str;
        sLogProxy = logProxy;
    }

    public static void setTagSymbol(char c) {
        if (sLogProxy.equals(DEF_LOG_PROXY)) {
            sTAG = c + COMMON_TAG;
        }
    }

    public static void v(String str, String str2) {
        if (sDevelopMode) {
            String strCutTagIfNeed = cutTagIfNeed(sTAG + DOT + str);
            LogProxy logProxy = sLogProxy;
            if (logProxy != null) {
                logProxy.println(2, strCutTagIfNeed, str2);
            }
        }
    }

    public static void w(String str, String str2) {
        String strCutTagIfNeed = cutTagIfNeed(sTAG + DOT + str);
        LogProxy logProxy = sLogProxy;
        if (logProxy != null) {
            logProxy.println(5, strCutTagIfNeed, str2);
        }
    }

    public static void e(String str) {
        LogProxy logProxy = sLogProxy;
        if (logProxy != null) {
            logProxy.println(6, sTAG, str);
        }
    }

    public static void i(String str) {
        LogProxy logProxy = sLogProxy;
        if (logProxy != null) {
            logProxy.println(4, sTAG, str);
        }
    }

    public static void w(String str) {
        LogProxy logProxy = sLogProxy;
        if (logProxy != null) {
            logProxy.println(5, sTAG, str);
        }
    }

    public static void d(String str) {
        LogProxy logProxy;
        if (!sDevelopMode || (logProxy = sLogProxy) == null) {
            return;
        }
        logProxy.println(3, sTAG, str);
    }

    public static void v(String str) {
        LogProxy logProxy;
        if (!sDevelopMode || (logProxy = sLogProxy) == null) {
            return;
        }
        logProxy.println(2, sTAG, str);
    }

    public static void e(String str, String str2, Throwable th) {
        String strCutTagIfNeed = cutTagIfNeed(sTAG + DOT + str);
        LogProxy logProxy = sLogProxy;
        if (logProxy != null) {
            logProxy.println(6, strCutTagIfNeed, str2, th);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        String strCutTagIfNeed = cutTagIfNeed(sTAG + DOT + str);
        LogProxy logProxy = sLogProxy;
        if (logProxy != null) {
            logProxy.println(5, strCutTagIfNeed, str2, th);
        }
    }

    public static void e(String str, Throwable th) {
        LogProxy logProxy = sLogProxy;
        if (logProxy != null) {
            logProxy.println(6, sTAG, str, th);
        }
    }

    public static void w(String str, Throwable th) {
        LogProxy logProxy = sLogProxy;
        if (logProxy != null) {
            logProxy.println(5, sTAG, str, th);
        }
    }

    private static void funcIn(String str, String str2) {
        i(str, str2 + " In");
    }

    private static void funcOut(String str, String str2) {
        i(str, str2 + " Out");
    }
}
