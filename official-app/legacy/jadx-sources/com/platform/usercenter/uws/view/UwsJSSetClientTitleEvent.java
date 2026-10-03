package com.platform.usercenter.uws.view;

import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.Keep;
import com.platform.usercenter.bizuws.R;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class UwsJSSetClientTitleEvent {
    public static final String COMMADN_HOME_INDICATOR_TOBLUE = "toBlue";
    public static final String COMMADN_HOME_INDICATOR_TODARK = "toDark";
    public static final String COMMADN_HOME_INDICATOR_TOLIGHT = "toLight";
    public static final String COMMADN_STATUSBAR_TINT_TODARK = "toDark";
    public static final String COMMADN_STATUSBAR_TINT_TOLIGHT = "toLight";
    private static final int ICON_ACTIONBAR_RIGHT_MENU_DETAIL_GREEN = 1118482;
    public static final int TOOLBAR_TYPE_BLANK = 1;
    public static final String TOOLBAR_TYPE_BLANK_STR = "1";
    public static final int TOOLBAR_TYPE_FIXED = 2;
    public static final String TOOLBAR_TYPE_FIXED_STR = "2";
    public static final int TOOLBAR_TYPE_SCROLL = 3;
    public static final String TOOLBAR_TYPE_SCROLL_STR = "3";
    public static final int TOOLBAR_TYPE_TRANSLUCENT = 4;
    public String backColor;
    public String backText;
    public String homeAsUpIndicator;
    public boolean isCloseIcon;
    public boolean isDisplayHomeAsUpEnabled;
    public boolean isHideStatusBarHeight;
    public boolean isImmerseNavigation;
    public boolean isNeedBackIcon;
    public boolean isNeedRightIcon;
    public boolean isTitleCenter;
    public String menuTextColor;
    public String navigationBarColor;
    public String nextText;
    public String nextTextColor;
    public String rightIconColor;
    public String rightIconID;
    public String statusBarBackColor;
    public String statusBarModel;
    public String statusbarTint;
    public int subscribeHash;
    public String title;
    public String titleColor;
    public String titleSize;
    public String toolBarBackColor;
    public int toolbarType;

    public UwsJSSetClientTitleEvent(int i, String str, boolean z, String str2, String str3, boolean z2, String str4, String str5, String str6, String str7, boolean z3, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i2, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.subscribeHash = i;
        this.title = str;
        this.isNeedBackIcon = z;
        this.backText = str2;
        this.nextText = str3;
        this.isNeedRightIcon = z2;
        this.titleColor = str4;
        this.statusbarTint = str5;
        this.homeAsUpIndicator = str6;
        this.menuTextColor = str7;
        this.isCloseIcon = z3;
        this.rightIconID = str8;
        this.backColor = str9;
        this.titleSize = str10;
        this.toolBarBackColor = str11;
        this.nextTextColor = str12;
        this.rightIconColor = str13;
        this.statusBarModel = str14;
        this.navigationBarColor = str15;
        this.statusBarBackColor = str16;
        this.toolbarType = i2;
        this.isImmerseNavigation = z4;
        this.isHideStatusBarHeight = z6;
        this.isTitleCenter = z5;
        this.isDisplayHomeAsUpEnabled = z7;
    }

    public static int getHomeAsUpIndicator(String str) {
        return R.drawable.color_actionbar_back_black;
    }

    public static int getRigitIconResId(String str) {
        if ("icon_actionbar_right_menu_detail_green".equals(str)) {
            return R.drawable.icon_actionbar_right_menu_detail_green;
        }
        if ("icon_actionbar_right_menu_detail_white".equals(str)) {
            return R.drawable.icon_actionbar_right_menu_detail_white;
        }
        if ("icon_actionbar_right_menu_detail_record".equals(str)) {
            return R.drawable.icon_actionbar_right_menu_detail_record;
        }
        return "icon_actionbar_right_menu_detail_credit".equals(str) ? R.drawable.icon_action_bar_detail_credit : R.drawable.icon_actionbar_right_menu_detail_green;
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

    public static UwsJSSetClientTitleEvent parseJSONObject2Entity(WebView webView, JSONObject jSONObject) {
        if (jSONObject == null) {
            throw new IllegalArgumentException();
        }
        String strOptString = jSONObject.optString("title", "");
        boolean zOptBoolean = jSONObject.optBoolean("isNeedBackIcon", true);
        boolean zOptBoolean2 = jSONObject.optBoolean("isNeedRightIcon", false);
        String strOptString2 = jSONObject.optString("nextText", "");
        String strOptString3 = jSONObject.optString("backText", "");
        String strOptString4 = jSONObject.optString("titleColor");
        String strOptString5 = jSONObject.optString("statusbarTint");
        String strOptString6 = jSONObject.optString("homeAsUpIndicator");
        String strOptString7 = jSONObject.optString("menuTextColor");
        boolean zOptBoolean3 = jSONObject.optBoolean("isCloseIcon", false);
        String strOptString8 = jSONObject.optString("rightIconID", "");
        String strOptString9 = jSONObject.optString("backColor", "");
        String strOptString10 = jSONObject.optString("titleSize", "");
        String strOptString11 = jSONObject.optString("toolBarBackColor", "");
        String strOptString12 = jSONObject.optString("nextTextColor", "");
        String strOptString13 = jSONObject.optString("rightIconColor", "");
        String strOptString14 = jSONObject.optString("statusBarModel", "");
        String strOptString15 = jSONObject.optString("navigationBarColor", "");
        String strOptString16 = jSONObject.optString("statusBarBackColor", "");
        int iOptInt = jSONObject.optInt("toolbarType", 0);
        boolean zOptBoolean4 = jSONObject.optBoolean("isImmerseNavigation", true);
        boolean zOptBoolean5 = jSONObject.optBoolean("isHideStatusBarHeight", false);
        return new UwsJSSetClientTitleEvent(webView.hashCode(), strOptString, zOptBoolean, strOptString3, strOptString2, zOptBoolean2, strOptString4, strOptString5, strOptString6, strOptString7, zOptBoolean3, strOptString8, strOptString9, strOptString10, strOptString11, strOptString12, strOptString13, strOptString14, strOptString15, strOptString16, iOptInt, zOptBoolean4, jSONObject.optBoolean("isTitleCenter", false), zOptBoolean5, jSONObject.optBoolean("isDisplayHomeAsUpEnabled", true));
    }

    public static boolean statusbarToDark(String str) {
        return "toDark".equalsIgnoreCase(str);
    }

    public static boolean statusbarToLight(String str) {
        return "toLight".equalsIgnoreCase(str);
    }

    public String toString() {
        return "JSClientTitleEvent{title='" + this.title + "', isNeedBackIcon=" + this.isNeedBackIcon + ", nextText='" + this.nextText + "', backText='" + this.backText + "', isNeedRightIcon=" + this.isNeedRightIcon + ", titleColor='" + this.titleColor + "', statusbarTint='" + this.statusbarTint + "', homeAsUpIndicator='" + this.homeAsUpIndicator + "'}";
    }
}
