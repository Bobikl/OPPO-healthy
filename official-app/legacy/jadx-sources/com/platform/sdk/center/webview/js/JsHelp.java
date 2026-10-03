package com.platform.sdk.center.webview.js;

import android.text.TextUtils;
import com.platform.sdk.center.R;
import com.platform.usercenter.basic.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class JsHelp {
    public static final String COMMADN_HOME_INDICATOR_TOBLUE = "toBlue";
    public static final String COMMADN_HOME_INDICATOR_TODARK = "toDark";
    public static final String COMMADN_HOME_INDICATOR_TOLIGHT = "toLight";
    public static final String COMMADN_STATUSBAR_TINT_TODARK = "toDark";
    public static final String COMMADN_STATUSBAR_TINT_TOLIGHT = "toLight";
    public static final String JS_H5_NEXT_BTN_PRESS = "next";
    public static final String JS_ON_RESUME = "onResume";
    public static final String JS_PREV_EXIT = "prevExit";
    public static final String KEY_ALL = "all";
    public static final String KEY_INTERUPT_BACK_KEY = "interruptbackkey";
    public static final String KEY_IS_BIGFONT_KEY = "isbigfont";
    public static final String KEY_IS_BK_TRANSPARENT = "isBkTransparent";
    public static final String KEY_IS_DARKMODE_KEY = "isHTSystemDarkMode";
    public static final String KEY_IS_GRADUAL_TOOLBAR = "isGradualToolbar";
    public static final String KEY_IS_HIDE_TOOLBAR = "isHideToolbar";
    public static final String KEY_IS_TRANSLUCENT_BACKGROUND = "isTranslucentBackground";
    public static final String KEY_IS_TRANSPARENT_BAR = "isTranslucentBar";
    public static final String KEY_JS_PAGE_RESUME = "javascript:if(window.resume){resume()}";
    public static final String KEY_MAIN = "main";
    public static final String KEY_NEW_INTERCEPT_BACK_KEY = "isInterceptBack";
    public static final String KEY_OLD_INTERCEPT_BACK_KEY = "interrupt_key";
    public static final String KEY_SET_BACK_COLOR = "setBackColor";
    public static final String KEY_TYPE = "type";
    public static final String K_IS_BIGFONT = "isbigfont";
    public static final String K_IS_BK_TRANSPARENT = "isBkTransparent";
    public static final String K_IS_DARKMODE = "isHTSystemDarkMode";
    public static final String K_IS_GRADUAL_TOOLBAR = "isGradualToolbar";
    public static final String K_IS_HIDE_TOOLBAR = "isHideToolbar";
    public static final String K_JS_PAGE_RESUME = "javascript:if(window.resume){resume()}";
    public static final String K_SET_BACK_COLOR = "setBackColor";

    public static int getRigitIconResId(String str) {
        if ("icon_actionbar_right_menu_detail_green".equals(str)) {
            return R.drawable.account_center_actionbar_right_menu_detail_green;
        }
        if ("icon_actionbar_right_menu_help_white".equals(str)) {
            return R.drawable.account_center_actionbar_right_menu_help_white;
        }
        return "icon_actionbar_right_menu_more_white".equals(str) ? R.drawable.account_center_actionbar_right_menu_more_white : R.drawable.account_center_actionbar_right_menu_detail_green;
    }

    public static boolean homeAsUpIndicatorToBlue(String str) {
        return "toBlue".equalsIgnoreCase(str);
    }

    public static boolean homeAsUpIndicatorToDark(String str) {
        return "toDark".equalsIgnoreCase(str);
    }

    public static boolean homeAsUpIndicatorToLight(String str) {
        return "toLight".equalsIgnoreCase(str);
    }

    public static boolean needResetHomeAsUpIndicator(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static boolean statusbarToDark(String str) {
        return "toDark".equalsIgnoreCase(str);
    }

    public static boolean statusbarToLight(String str) {
        return "toLight".equalsIgnoreCase(str);
    }
}
