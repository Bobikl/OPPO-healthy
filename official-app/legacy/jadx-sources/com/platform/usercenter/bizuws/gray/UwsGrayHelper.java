package com.platform.usercenter.bizuws.gray;

import android.net.Uri;
import android.webkit.URLUtil;
import com.heytap.webpro.score.WebProScoreManager;
import com.oplus.aiunit.vision.zmk;
import com.platform.usercenter.BaseApp;
import com.platform.usercenter.tools.datastructure.StringUtil;
import com.platform.usercenter.tools.storage.SPreferenceCommonHelper;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class UwsGrayHelper {
    public static String GRAY_CONFIG_VALUE = "";
    public static String GRAY_LINK_KEY = "UCGRAYLINK";
    public static String GRAY_LINK_VALUE = "true";
    public static final String KEY_GARY_ENV_HEADER = "X-Env";
    public static final String KEY_GRAY_DOMAIN_SET = "key_gray_domain_set";
    private static Set<String> grayWhiteSet = null;
    private static boolean mGrayEnv = false;

    public static String getGrayUrl(String str) {
        if (str == null || !mGrayEnv || !URLUtil.isNetworkUrl(str) || str.contains(GRAY_LINK_KEY)) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        builderBuildUpon.appendQueryParameter(GRAY_LINK_KEY, GRAY_LINK_VALUE);
        return builderBuildUpon.build().toString();
    }

    public static boolean isAvailableDomain(String str) {
        return WebProScoreManager.d().f(str) >= 100;
    }

    public static boolean isGray() {
        return mGrayEnv;
    }

    public static boolean isGrayWhiteDomain(String str) {
        if (StringUtil.isEmpty(str)) {
            return false;
        }
        if (URLUtil.isNetworkUrl(str)) {
            str = zmk.a(str);
        }
        if (grayWhiteSet == null) {
            grayWhiteSet = SPreferenceCommonHelper.getStringSet(BaseApp.mContext, KEY_GRAY_DOMAIN_SET, new HashSet(0));
        }
        Set<String> set = grayWhiteSet;
        return (set == null || set.isEmpty() || !grayWhiteSet.contains(str)) ? false : true;
    }

    public static void setGrayConfigValue(String str) {
        GRAY_CONFIG_VALUE = str;
        if ("GRAY".equals(str)) {
            mGrayEnv = true;
        }
    }

    public static void setGrayWhiteListString(Set<String> set) {
        grayWhiteSet = set;
        if (set != null) {
            SPreferenceCommonHelper.setStringSet(BaseApp.mContext, KEY_GRAY_DOMAIN_SET, set);
        }
    }
}
