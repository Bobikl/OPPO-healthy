package com.platform.account.oauth.web.util;

import android.content.Context;
import android.os.Build;
import androidx.annotation.Keep;
import com.platform.usercenter.oauth.util.AcOauthAppUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class WebUaHelper {
    public static String getUserAgent(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" DayNight/");
        sb.append(AcOauthDarkUtil.isNightMode(context) ? "0" : "1");
        sb.append(" language/");
        sb.append(AcDeviceUtil.getLanguage());
        sb.append(" languageTag/");
        sb.append(AcDeviceUtil.getLanguageTag(context));
        sb.append(" locale/");
        sb.append(Locale.getDefault());
        sb.append(" regionCode/");
        sb.append(AcDeviceUtil.getRegionMark());
        sb.append(" isGesture/true bizVersion/");
        sb.append(AcOauthAppUtil.getVersionName(context, context.getPackageName()));
        sb.append(" bizName/");
        sb.append(context.getPackageName());
        sb.append(" brand/");
        sb.append(Build.BRAND);
        sb.append(" sdkVersion/");
        sb.append("2.0.0");
        sb.append(" sdkType/webOAuth");
        return sb.toString();
    }
}
