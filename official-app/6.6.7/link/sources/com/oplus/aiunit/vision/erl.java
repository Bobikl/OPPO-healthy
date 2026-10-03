package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class erl {
    public static final String APP_PKG_NAME = " appPackageName/";
    public static final String APP_VERSION = " appVersion/";
    public static final String BUSINESS = " Business/";
    public static final String BUSINESS_SYSTEM = " X-BusinessSystem/";
    public static final String CLIENT_TYPE = " ClientType/";
    public static final String COLOR_OS_VERSION = " ColorOSVersion/";
    public static final String DAY_NIGHT = " DayNight/";
    public static final String DEEP_THEME_COLOR = " deepThemeColor/";
    public static final String DISPLAY_HEIGHT = " displayHeight/";
    public static final String DISPLAY_WIDTH = " displayWidth/";
    public static final String FOLD_MODE = " foldMode/";
    public static final String IDENTIFY = "PlatformIdentify";
    public static final String IDENTIFY_UNIFIED_WEB_CONTAINER_VALUE = "1";
    public static final String JS_BRIDGE = " JSBridge/";
    public static final String JS_WEB_EXT = " JSExt/";
    public static final String LANGUAGE = " language/";
    public static final String LANGUAGE_TAG = " languageTag/";
    public static final String LARGE_SCREEN = " largeScreen/";
    public static final String LOCALE = " locale/";
    public static final String LOCAL_STORAGE_ENCRYPT = " localstorageEncrypt/";
    public static final String MODEL = " model/";
    public static final String NAV_HEIGHT = " navHeight/";
    public static final String REAL_SCREEN_HEIGHT = " realScreenHeight/";
    public static final String REAL_SCREEN_WIDTH = " realScreenWidth/";
    public static final String SDK_VERSION = " sdkVersion/";
    public static final String SWITCH_HOST = " switchHost/";
    public static final String THEME_COLOR = " themeColor/";
    public static final String TIMEZONE = " timeZone/";
    public static final String VERSION_NAME = " usercenter/";
    public static final String WEB_FIT_METHOD = " WebFitMethod/";
    public final StringBuilder a;
    public final Context b;

    public erl(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        this.a = sb;
        this.b = context;
        sb.append(str);
    }

    public static erl d(Context context, String str) {
        if (context != null) {
            return new erl(context, str);
        }
        throw new RuntimeException("WebContainerUaBuilder context should not be null!");
    }

    public erl a(String str, String str2) {
        StringBuilder sb = this.a;
        sb.append(" ");
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        return this;
    }

    public erl b() {
        StringBuilder sb = this.a;
        sb.append(DAY_NIGHT);
        sb.append(re8.c(this.b) ? "0" : IDENTIFY_UNIFIED_WEB_CONTAINER_VALUE);
        sb.append(COLOR_OS_VERSION);
        sb.append(w5d.a());
        sb.append(LANGUAGE);
        sb.append(sj5.b());
        sb.append(LANGUAGE_TAG);
        sb.append(sj5.c());
        sb.append(LOCALE);
        sb.append(Locale.getDefault());
        sb.append(TIMEZONE);
        sb.append(Calendar.getInstance().getTimeZone().getID());
        sb.append(MODEL);
        sb.append(Build.MODEL);
        sb.append(APP_PKG_NAME);
        sb.append(this.b.getPackageName());
        sb.append(APP_VERSION);
        sb.append(j80.a(this.b));
        sb.append(FOLD_MODE);
        sb.append(sj5.a(this.b));
        sb.append(LARGE_SCREEN);
        sb.append(sj5.h(this.b));
        sb.append(DISPLAY_WIDTH);
        sb.append(xv5.d(this.b));
        sb.append(DISPLAY_HEIGHT);
        sb.append(xv5.c(this.b));
        sb.append(REAL_SCREEN_WIDTH);
        sb.append(xv5.b(this.b));
        sb.append(REAL_SCREEN_HEIGHT);
        sb.append(xv5.a(this.b));
        if (yyk.b()) {
            StringBuilder sb2 = this.a;
            sb2.append(NAV_HEIGHT);
            sb2.append(ihc.c(this.b));
        }
        return this;
    }

    public String c() {
        return this.a.toString();
    }
}
