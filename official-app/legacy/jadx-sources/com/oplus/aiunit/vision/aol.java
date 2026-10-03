package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class aol {
    public static final String AC_LANGUAGE_TAG = " AcLanguageTag/";
    public static final String AC_LEGACY_LANGUAGE_TAG = " AcLegacyLanguageTag/";
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
    public static final String JS_BRIDGE = " JSBridge/";
    public static final String JS_WEB_EXT = " JSExt/";
    public static final String LANGUAGE = " language/";
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

    public aol(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        this.a = sb;
        this.b = context;
        sb.append(str);
    }

    public static aol p(Context context, String str) {
        if (context != null) {
            return new aol(context, str);
        }
        throw new RuntimeException("UwsUaBuilder context should not be null!");
    }

    public aol a(String str) {
        this.a.append(str);
        return this;
    }

    public aol b(String str, String str2) {
        StringBuilder sb = this.a;
        sb.append(" ");
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        return this;
    }

    public aol c(String str) {
        StringBuilder sb = this.a;
        sb.append(" X-BusinessSystem/");
        sb.append(str);
        return this;
    }

    public aol d(String str) {
        StringBuilder sb = this.a;
        sb.append(" Business/");
        sb.append(str);
        return this;
    }

    public aol e(String str) {
        StringBuilder sb = this.a;
        sb.append(" ClientType/");
        sb.append(str);
        return this;
    }

    public aol f(String str, String str2) {
        StringBuilder sb = this.a;
        sb.append(" deepThemeColor/");
        sb.append(str);
        sb.append(" themeColor/");
        sb.append(str2);
        return this;
    }

    public aol g() {
        StringBuilder sb = this.a;
        sb.append(" DayNight/");
        sb.append(vu5.a(this.b) ? "0" : "1");
        sb.append(" ColorOSVersion/");
        sb.append(jek.b());
        sb.append(" language/");
        sb.append(Locale.getDefault().getLanguage());
        sb.append(AC_LANGUAGE_TAG);
        sb.append(n());
        sb.append(AC_LEGACY_LANGUAGE_TAG);
        sb.append(o());
        sb.append(" locale/");
        sb.append(Locale.getDefault());
        sb.append(" timeZone/");
        sb.append(Calendar.getInstance().getTimeZone().getID());
        sb.append(" model/");
        sb.append(Build.MODEL);
        sb.append(" appPackageName/");
        sb.append(this.b.getPackageName());
        sb.append(" appVersion/");
        Context context = this.b;
        sb.append(a80.b(context, context.getPackageName()));
        sb.append(" foldMode/");
        sb.append(vu5.b(this.b));
        sb.append(" largeScreen/");
        sb.append(vu5.g(this.b));
        sb.append(" displayWidth/");
        sb.append(vu5.f(this.b));
        sb.append(" displayHeight/");
        sb.append(vu5.e(this.b));
        sb.append(" realScreenWidth/");
        sb.append(vu5.d(this.b));
        sb.append(" realScreenHeight/");
        sb.append(vu5.c(this.b));
        if (Build.VERSION.SDK_INT >= 31) {
            StringBuilder sb2 = this.a;
            sb2.append(" navHeight/");
            sb2.append(tfc.b(this.b));
        }
        return this;
    }

    public aol h(String str) {
        StringBuilder sb = this.a;
        sb.append(" localstorageEncrypt/");
        sb.append(str);
        return this;
    }

    public aol i(String str) {
        StringBuilder sb = this.a;
        sb.append(" JSBridge/");
        sb.append(str);
        return this;
    }

    public aol j(String str) {
        StringBuilder sb = this.a;
        sb.append(" switchHost/");
        sb.append(str);
        return this;
    }

    public aol k(String str) {
        StringBuilder sb = this.a;
        sb.append(" usercenter/");
        sb.append(str);
        return this;
    }

    public aol l(String str) {
        StringBuilder sb = this.a;
        sb.append(" WebFitMethod/");
        sb.append(str);
        return this;
    }

    public String m() {
        return this.a.toString();
    }

    public final String n() {
        return Locale.getDefault().toLanguageTag();
    }

    public final String o() {
        String strN = n();
        if (bvk.c()) {
            if (jek.a() >= 24) {
                try {
                    int identifier = this.b.getResources().getIdentifier("language_values_exam", TypedValues.Custom.S_STRING, "oplus");
                    if (identifier != -1) {
                        strN = this.b.getResources().getString(identifier);
                    }
                } catch (Exception e2) {
                    bn.c("WebUaBuilder", "getAcLegacyLanguageTag fail default : " + strN + " e:" + e2.getMessage());
                }
            } else {
                String languageTag = Locale.getDefault().toLanguageTag();
                if ("id-ID".equalsIgnoreCase(languageTag)) {
                    strN = "in-ID";
                } else {
                    Locale localeForLanguageTag = Locale.forLanguageTag(languageTag);
                    strN = localeForLanguageTag.getLanguage() + "-" + localeForLanguageTag.getCountry();
                }
            }
        }
        bn.c("WebUaBuilder", "getAcLegacyLanguageTag:" + strN);
        return strN;
    }
}
