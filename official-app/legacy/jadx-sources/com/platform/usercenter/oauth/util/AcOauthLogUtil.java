package com.platform.usercenter.oauth.util;

import android.util.Log;
import androidx.annotation.Keep;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.weatherservicesdk.data.Weather;
import com.platform.usercenter.ac.env.AccountUrlManager;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcOauthLogUtil {
    private static final String PERSIST_SYS_ASSERT_ENABLE = "persist.sys.assert.enable";
    private static final String PERSIST_SYS_ASSERT_PANIC = "persist.sys.assert.panic";
    private static final String PREFIX = "AC_OAUTH";
    private static boolean debugSwitch = false;
    private static volatile Method get = null;
    private static IAcLogImpl logImpl = null;
    private static String module = "AMS";

    @Keep
    public interface IAcLogImpl {
        void d(String str, String str2);

        void e(String str, String str2);

        void i(String str, String str2);

        void w(String str, String str2);
    }

    public static void d(String str, String str2) {
        if (getDebugSwitch()) {
            String tag = getTag(str);
            IAcLogImpl iAcLogImpl = logImpl;
            if (iAcLogImpl != null) {
                iAcLogImpl.d(tag, str2);
            } else {
                Log.d(tag, str2);
            }
        }
    }

    public static void e(String str, String str2) {
        if (getDebugSwitch()) {
            String tag = getTag(str);
            IAcLogImpl iAcLogImpl = logImpl;
            if (iAcLogImpl != null) {
                iAcLogImpl.e(tag, str2);
            } else {
                Log.e(tag, str2);
            }
        }
    }

    public static boolean getDebugSwitch() {
        return debugSwitch || isOpenSysLog() || AccountUrlManager.isDebugMode();
    }

    private static String getTag(String str) {
        return "AC_OAUTH_" + module + "_" + str;
    }

    public static void i(String str, String str2) {
        if (getDebugSwitch()) {
            String tag = getTag(str);
            IAcLogImpl iAcLogImpl = logImpl;
            if (iAcLogImpl != null) {
                iAcLogImpl.i(tag, str2);
            } else {
                Log.i(tag, str2);
            }
        }
    }

    public static void i_ignore(String str, String str2) {
        String tag = getTag(str);
        IAcLogImpl iAcLogImpl = logImpl;
        if (iAcLogImpl != null) {
            iAcLogImpl.i(tag, str2);
        } else {
            Log.i(tag, str2);
        }
    }

    public static void init(String str) {
        module = str;
    }

    private static boolean isOpenSysLog() {
        return SpeechConstant.TRUE_STR.equalsIgnoreCase(AcOauthSystemPropertyUtils.get("persist.sys.assert.panic", SpeechConstant.FALSE_STR)) || SpeechConstant.TRUE_STR.equalsIgnoreCase(AcOauthSystemPropertyUtils.get("persist.sys.assert.enable", SpeechConstant.FALSE_STR));
    }

    public static void s(String str, String str2) {
        if (AccountUrlManager.isDebugMode()) {
            String tag = getTag(str);
            IAcLogImpl iAcLogImpl = logImpl;
            if (iAcLogImpl != null) {
                iAcLogImpl.i(tag, str2);
            } else {
                Log.i(tag, str2);
            }
        }
    }

    public static void setLogImpl(IAcLogImpl iAcLogImpl) {
        logImpl = iAcLogImpl;
    }

    public static void switchDebug(boolean z) {
        debugSwitch = z;
    }

    public static void w(String str, String str2) {
        if (getDebugSwitch()) {
            String tag = getTag(str);
            IAcLogImpl iAcLogImpl = logImpl;
            if (iAcLogImpl != null) {
                iAcLogImpl.w(tag, str2);
            } else {
                Log.w(tag, str2);
            }
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (getDebugSwitch()) {
            String tag = getTag(str);
            IAcLogImpl iAcLogImpl = logImpl;
            String str3 = str2 + Weather.SEPARATOR + Log.getStackTraceString(th);
            if (iAcLogImpl != null) {
                iAcLogImpl.e(tag, str3);
            } else {
                Log.e(tag, str3);
            }
        }
    }
}
