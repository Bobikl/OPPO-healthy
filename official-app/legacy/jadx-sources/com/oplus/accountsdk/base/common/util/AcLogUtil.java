package com.oplus.accountsdk.base.common.util;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import androidx.annotation.Keep;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.yj;
import com.oplus.utrace.utils.SystemSettingsUtilsKt;
import com.oplus.weatherservicesdk.data.Weather;
import com.platform.usercenter.ac.env.AccountUrlManager;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcLogUtil {
    private static final String PERSIST_SYS_ASSERT_ENABLE = "persist.sys.assert.enable";
    private static final String PERSIST_SYS_ASSERT_PANIC = "persist.sys.assert.panic";
    private static final String PREFIX = "AC_SDK";
    private static boolean SYSTEM_LOG_OPEN = false;
    private static final String TAG = "AcLogUtil";
    private static boolean debugSwitch = false;
    private static IAcLogImpl logImpl;
    private static b logUploader;

    @Keep
    public interface IAcLogImpl {
        void d(String str, String str2);

        void e(String str, String str2);

        void i(String str, String str2);

        void w(String str, String str2);
    }

    public class a extends ContentObserver {
        public a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            AcLogUtil.syncOpenSysLog();
        }
    }

    public interface b {
        void d(String str, String str2);

        void e(String str, String str2);

        void i(String str, String str2);

        void w(String str, String str2);
    }

    static {
        syncOpenSysLog();
    }

    public static void d(String str, String str2) {
        d(str, str2, getDebugSwitch());
    }

    public static void e(String str, String str2) {
        e(str, str2, getDebugSwitch());
    }

    public static boolean enableDebug() {
        return AccountUrlManager.isDebugMode();
    }

    public static boolean getDebugSwitch() {
        return AccountUrlManager.isDebugMode() || debugSwitch || SYSTEM_LOG_OPEN;
    }

    private static String getTag(String str) {
        return "AC_SDK_" + str;
    }

    public static void i(String str, String str2) {
        i(str, str2, getDebugSwitch());
    }

    public static void init(Context context) {
        context.getContentResolver().registerContentObserver(Settings.System.getUriFor(SystemSettingsUtilsKt.LOG_SWITCH_TYPE), true, new a(new Handler(Looper.getMainLooper())));
    }

    public static void setLogImpl(IAcLogImpl iAcLogImpl) {
        logImpl = iAcLogImpl;
    }

    public static void setLogUploader(b bVar) {
        logUploader = bVar;
    }

    public static void switchDebug(boolean z) {
        debugSwitch = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void syncOpenSysLog() {
        SYSTEM_LOG_OPEN = SpeechConstant.TRUE_STR.equalsIgnoreCase(yj.a("persist.sys.assert.panic", SpeechConstant.FALSE_STR)) || SpeechConstant.TRUE_STR.equalsIgnoreCase(yj.a("persist.sys.assert.enable", SpeechConstant.FALSE_STR));
        Log.d(getTag(TAG), "systemLogOpen :" + SYSTEM_LOG_OPEN);
    }

    public static void w(String str, String str2) {
        w(str, str2, getDebugSwitch());
    }

    public static void d(String str, String str2, String str3) {
        d(str, str2 + " traceId:" + str3);
    }

    public static void e(String str, String str2, String str3) {
        e(str, str2 + " traceId:" + str3);
    }

    public static void i(String str, String str2, String str3) {
        i(str, str2 + " traceId:" + str3);
    }

    public static void w(String str, String str2, String str3) {
        w(str, str2 + " traceId:" + str3);
    }

    public static void d(String str, String str2, boolean z) {
        String tag = getTag(str);
        if (z) {
            IAcLogImpl iAcLogImpl = logImpl;
            if (iAcLogImpl != null) {
                iAcLogImpl.d(tag, str2);
            } else {
                Log.d(tag, str2);
            }
        }
        b bVar = logUploader;
        if (bVar != null) {
            bVar.d(tag, str2);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        e(str, str2 + Weather.SEPARATOR + Log.getStackTraceString(th), getDebugSwitch());
    }

    public static void i(String str, String str2, boolean z) {
        String tag = getTag(str);
        if (z) {
            IAcLogImpl iAcLogImpl = logImpl;
            if (iAcLogImpl != null) {
                iAcLogImpl.i(tag, str2);
            } else {
                Log.i(tag, str2);
            }
        }
        b bVar = logUploader;
        if (bVar != null) {
            bVar.i(tag, str2);
        }
    }

    public static void w(String str, String str2, boolean z) {
        String tag = getTag(str);
        if (z) {
            IAcLogImpl iAcLogImpl = logImpl;
            if (iAcLogImpl != null) {
                iAcLogImpl.w(tag, str2);
            } else {
                Log.w(tag, str2);
            }
        }
        b bVar = logUploader;
        if (bVar != null) {
            bVar.w(tag, str2);
        }
    }

    public static void e(String str, String str2, Throwable th, String str3) {
        e(str, str2 + " traceId:" + str3, th);
    }

    public static void e(String str, String str2, boolean z) {
        String tag = getTag(str);
        if (z) {
            IAcLogImpl iAcLogImpl = logImpl;
            if (iAcLogImpl != null) {
                iAcLogImpl.e(tag, str2);
            } else {
                Log.e(tag, str2);
            }
        }
        b bVar = logUploader;
        if (bVar != null) {
            bVar.e(tag, str2);
        }
    }
}
