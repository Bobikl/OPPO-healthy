package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class gnl {
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

    public gnl(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        this.a = sb;
        this.b = context;
        sb.append(str);
    }

    public static gnl d(Context context, String str) {
        if (context != null) {
            return new gnl(context, str);
        }
        throw new RuntimeException("WebContainerUaBuilder context should not be null!");
    }

    public gnl a(String str, String str2) {
        StringBuilder sb = this.a;
        sb.append(" ");
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        return this;
    }

    public gnl b() {
        StringBuilder sb = this.a;
        sb.append(" DayNight/");
        sb.append(od8.c(this.b) ? "0" : "1");
        sb.append(" ColorOSVersion/");
        sb.append(e4d.a());
        sb.append(" language/");
        sb.append(wi5.b());
        sb.append(" languageTag/");
        sb.append(wi5.c());
        sb.append(" locale/");
        sb.append(Locale.getDefault());
        sb.append(" timeZone/");
        sb.append(Calendar.getInstance().getTimeZone().getID());
        sb.append(" model/");
        sb.append(Build.MODEL);
        sb.append(" appPackageName/");
        sb.append(this.b.getPackageName());
        sb.append(" appVersion/");
        sb.append(z70.a(this.b));
        sb.append(" foldMode/");
        sb.append(wi5.a(this.b));
        sb.append(" largeScreen/");
        sb.append(wi5.h(this.b));
        sb.append(" displayWidth/");
        sb.append(zu5.d(this.b));
        sb.append(" displayHeight/");
        sb.append(zu5.c(this.b));
        sb.append(" realScreenWidth/");
        sb.append(zu5.b(this.b));
        sb.append(" realScreenHeight/");
        sb.append(zu5.a(this.b));
        if (avk.b()) {
            StringBuilder sb2 = this.a;
            sb2.append(" navHeight/");
            sb2.append(qfc.c(this.b));
        }
        return this;
    }

    public String c() {
        return this.a.toString();
    }
}
