package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import com.heytap.webpro.theme.H5ThemeHelper;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class rnl {
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
    protected final Context mContext;
    protected final StringBuilder mStringBuilder;

    public rnl(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        this.mStringBuilder = sb;
        this.mContext = context;
        sb.append(str);
    }

    public static rnl with(Context context, String str) {
        if (context != null) {
            return new rnl(context, str);
        }
        throw new RuntimeException("UwsUaBuilder context should not be null!");
    }

    public rnl append(String str, String str2) {
        StringBuilder sb = this.mStringBuilder;
        sb.append(" ");
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        return this;
    }

    public rnl appendBrand(String str) {
        StringBuilder sb = this.mStringBuilder;
        sb.append(" X-BusinessSystem/");
        sb.append(str);
        return this;
    }

    public rnl appendBusiness(String str) {
        StringBuilder sb = this.mStringBuilder;
        sb.append(" Business/");
        sb.append(str);
        return this;
    }

    public rnl appendClientType(String str) {
        StringBuilder sb = this.mStringBuilder;
        sb.append(" ClientType/");
        sb.append(str);
        return this;
    }

    public rnl appendColor(String str, String str2) {
        StringBuilder sb = this.mStringBuilder;
        sb.append(" deepThemeColor/");
        sb.append(str);
        sb.append(" themeColor/");
        sb.append(str2);
        return this;
    }

    public rnl appendCommon() {
        StringBuilder sb = this.mStringBuilder;
        sb.append(" DayNight/");
        sb.append(H5ThemeHelper.c(this.mContext) ? "0" : "1");
        sb.append(" ColorOSVersion/");
        sb.append(f4d.a());
        sb.append(" language/");
        sb.append(xi5.b());
        sb.append(" languageTag/");
        sb.append(xi5.c());
        sb.append(" locale/");
        sb.append(Locale.getDefault());
        sb.append(" timeZone/");
        sb.append(Calendar.getInstance().getTimeZone().getID());
        sb.append(" model/");
        sb.append(Build.MODEL);
        sb.append(" appPackageName/");
        sb.append(this.mContext.getPackageName());
        sb.append(" appVersion/");
        sb.append(b80.a(this.mContext));
        sb.append(" foldMode/");
        sb.append(xi5.a(this.mContext));
        sb.append(" largeScreen/");
        sb.append(xi5.g(this.mContext));
        sb.append(" displayWidth/");
        sb.append(av5.d(this.mContext));
        sb.append(" displayHeight/");
        sb.append(av5.c(this.mContext));
        sb.append(" realScreenWidth/");
        sb.append(av5.b(this.mContext));
        sb.append(" realScreenHeight/");
        sb.append(av5.a(this.mContext));
        if (cvk.e()) {
            StringBuilder sb2 = this.mStringBuilder;
            sb2.append(" navHeight/");
            sb2.append(rfc.c(this.mContext));
        }
        return this;
    }

    public rnl appendEncrypt(String str) {
        StringBuilder sb = this.mStringBuilder;
        sb.append(" localstorageEncrypt/");
        sb.append(str);
        return this;
    }

    public rnl appendJsBridge(String str) {
        StringBuilder sb = this.mStringBuilder;
        sb.append(" JSBridge/");
        sb.append(str);
        return this;
    }

    public rnl appendJsExt(String str) {
        StringBuilder sb = this.mStringBuilder;
        sb.append(" JSExt/");
        sb.append(str);
        return this;
    }

    public rnl appendSdkVersion(String str) {
        StringBuilder sb = this.mStringBuilder;
        sb.append(" sdkVersion/");
        sb.append(str);
        return this;
    }

    public rnl appendSwitchHost(String str) {
        StringBuilder sb = this.mStringBuilder;
        sb.append(" switchHost/");
        sb.append(str);
        return this;
    }

    public rnl appendVersionName(String str) {
        StringBuilder sb = this.mStringBuilder;
        sb.append(" usercenter/");
        sb.append(str);
        return this;
    }

    public rnl appendWebFitVersion(String str) {
        StringBuilder sb = this.mStringBuilder;
        sb.append(" WebFitMethod/");
        sb.append(str);
        return this;
    }

    public StringBuilder build() {
        return this.mStringBuilder;
    }

    public String buildString() {
        return this.mStringBuilder.toString();
    }

    public rnl append(String str) {
        this.mStringBuilder.append(str);
        return this;
    }
}
