package com.oplus.aiunit.vision;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.utrace.utils.SystemSettingsUtilsKt;
import com.platform.account.webview.util.AccountLogLevel;

/* JADX INFO: loaded from: classes9.dex */
public class bn {
    public static AccountLogLevel a = AccountLogLevel.LEVEL_NONE;
    public static boolean b;

    public class a extends ContentObserver {
        public a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            bn.j();
        }
    }

    static {
        j();
    }

    public static void b(String str, String str2) {
        if (h(AccountLogLevel.LEVEL_DEBUG)) {
            Log.d(d(str), e(str2));
        }
    }

    public static void c(String str, String str2) {
        if (h(AccountLogLevel.LEVEL_ERROR)) {
            Log.e(d(str), e(str2));
        }
    }

    public static String d(String str) {
        return "AccountLogUtil." + str;
    }

    public static String e(String str) {
        return str == null ? "" : str;
    }

    public static void f(String str, String str2) {
        if (h(AccountLogLevel.LEVEL_INFO)) {
            Log.i(d(str), e(str2));
        }
    }

    public static void g(Context context) {
        i(context);
    }

    public static boolean h(AccountLogLevel accountLogLevel) {
        if (b) {
            return accountLogLevel.logLevel >= AccountLogLevel.LEVEL_VERBOSE.logLevel;
        }
        AccountLogLevel accountLogLevel2 = a;
        return accountLogLevel2 != null && accountLogLevel.logLevel >= accountLogLevel2.logLevel;
    }

    public static void i(Context context) {
        context.getContentResolver().registerContentObserver(Settings.System.getUriFor(SystemSettingsUtilsKt.LOG_SWITCH_TYPE), false, new a(new Handler(Looper.getMainLooper())));
    }

    public static void j() {
        b = SpeechConstant.TRUE_STR.equalsIgnoreCase(blj.a("persist.sys.assert.panic", SpeechConstant.FALSE_STR)) || SpeechConstant.TRUE_STR.equalsIgnoreCase(blj.a(SystemSettingsUtilsKt.LOG_ON_MKT, SpeechConstant.FALSE_STR));
        Log.d("AccountLogUtil", "systemLogOpen:" + b);
    }

    public static void k(String str, String str2) {
        if (h(AccountLogLevel.LEVEL_WARNING)) {
            Log.w(d(str), e(str2));
        }
    }
}
