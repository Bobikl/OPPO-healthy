package com.heytap.store.homemodule.data;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.heytap.store.apm.util.DataReportUtilKt;
import com.heytap.store.base.core.state.UrlConfig;
import com.heytap.store.platform.tools.GsonUtils;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public class ThemeInfo {
    public static final String THEME_ICON_STYLE_DARK = "2";
    public static final String THEME_ICON_STYLE_LIGHT = "1";
    public static final String THEME_ICON_STYLE_UNDEFINED = "0";
    private static final String THEME_KEY_ICONS_BG_COLOR = "icon_bgcolor";
    private static final String THEME_KEY_ICONS_STYLE = "page_icon";
    private static final String THEME_KEY_ICONS_TEXT_COLOR = "icon_textcolor";
    private static final String THEME_KEY_PAGE_BG_COLOR = "page_bgcolor";
    private static final String THEME_KEY_PAGE_TEXT_COLOR = "page_textcolor";
    private static final String THEME_KEY_REFRESH_BG_COLOR = "refresh_bg_color";
    private static final String THEME_KEY_TAB_SELECTED_COLOR = "column_color";
    private static final String THEME_KEY_TAB_UNSELECTED_COLOR = "column_uncolor";
    private static final String THEME_KEY_TOPBAR_COLOR = "topbar_color";
    public String THEME_DEFAULT_TAB_SELECTED_COLOR = "#FFFFFF";
    public String THEME_DEFAULT_TAB_UNSELECTED_COLOR = "#8CFFFFFF";
    public String THEME_DEFAULT_TAB_UNSELECTED_COLOR_DARK = "#FFFFFF";
    public String THEME_DEFAULT_TOPBAR_COLOR = "#FFFFFF";
    public String THEME_DEFAULT_TOPBAR_IMG_URL = "";
    private Map<String, String> infoMap;
    private static final String THEME_KEY_TOPBAR_IMG_URL = "topbar_bgpic";
    private static final String THEME_KEY_SERVICE_BG_IMG = "service_bgpic";
    private static final String THEME_KEY_ICONS_BG_IMG = "icon_bgpic";
    private static final String THEME_KEY_BANNER_BG_IMG = "banner_bgpic";
    private static final String THEME_KEY_REFRESH_BG_IMG = "refresh_bg_img";
    private static String[] IMG_KEYS = {THEME_KEY_TOPBAR_IMG_URL, THEME_KEY_SERVICE_BG_IMG, THEME_KEY_ICONS_BG_IMG, THEME_KEY_BANNER_BG_IMG, THEME_KEY_REFRESH_BG_IMG};

    public ThemeInfo() {
        HashMap map = new HashMap();
        this.infoMap = map;
        map.put(THEME_KEY_TOPBAR_COLOR, this.THEME_DEFAULT_TOPBAR_COLOR);
        this.infoMap.put(THEME_KEY_TOPBAR_IMG_URL, this.THEME_DEFAULT_TOPBAR_IMG_URL);
        this.infoMap.put(THEME_KEY_BANNER_BG_IMG, "");
        this.infoMap.put(THEME_KEY_ICONS_BG_IMG, "");
        this.infoMap.put(THEME_KEY_ICONS_BG_COLOR, "");
        this.infoMap.put(THEME_KEY_ICONS_TEXT_COLOR, "");
        this.infoMap.put(THEME_KEY_ICONS_STYLE, "0");
        this.infoMap.put(THEME_KEY_SERVICE_BG_IMG, "");
        this.infoMap.put(THEME_KEY_PAGE_TEXT_COLOR, "");
        this.infoMap.put(THEME_KEY_PAGE_BG_COLOR, "");
        this.infoMap.put(THEME_KEY_REFRESH_BG_COLOR, "");
        this.infoMap.put(THEME_KEY_REFRESH_BG_IMG, "");
    }

    public static ThemeInfo fromHomeResponseData(HomeResponseData homeResponseData) {
        HomeDataBean homeDataBean;
        if (UrlConfig.DEBUG) {
            Log.d("ThemeInfo", "fromHomeResponseData:" + GsonUtils.INSTANCE.toJson(homeResponseData));
        }
        ThemeInfo themeInfo = new ThemeInfo();
        if (homeResponseData == null || homeResponseData.getData() == null || homeResponseData.getData().isEmpty() || (homeDataBean = homeResponseData.getData().get(0)) == null || homeDataBean.getDetails() == null || homeDataBean.getDetails().isEmpty()) {
            return themeInfo;
        }
        HomeItemDetail homeItemDetail = homeDataBean.getDetails().get(0);
        return TextUtils.isEmpty(homeItemDetail.getJsonValue()) ? themeInfo : fromJsonString(homeItemDetail.getJsonValue());
    }

    public static ThemeInfo fromInfoMap(Map<String, String> map) {
        ThemeInfo themeInfo = new ThemeInfo();
        if (map != null && !map.isEmpty()) {
            for (String str : map.keySet()) {
                String str2 = map.get(str);
                if (str2 != null) {
                    themeInfo.infoMap.put(str, str2);
                }
            }
        }
        return themeInfo;
    }

    public static ThemeInfo fromJsonString(String str) {
        try {
            return fromInfoMap((Map) new Gson().fromJson(str, new TypeToken<HashMap<String, String>>() { // from class: com.heytap.store.homemodule.data.ThemeInfo.1
            }.getType()));
        } catch (JsonParseException e2) {
            DataReportUtilKt.reportExceptionEvent(e2);
            return new ThemeInfo();
        }
    }

    @Deprecated
    public String getBannerBgImgUrl() {
        return this.infoMap.get(THEME_KEY_BANNER_BG_IMG);
    }

    public String getIconStyle() {
        return this.infoMap.get(THEME_KEY_ICONS_STYLE);
    }

    @Deprecated
    public String getIconsBgColor() {
        return this.infoMap.get(THEME_KEY_ICONS_BG_COLOR);
    }

    @Deprecated
    public String getIconsBgImgUrl() {
        return this.infoMap.get(THEME_KEY_ICONS_BG_IMG);
    }

    @Deprecated
    public String getIconsTextColor() {
        return this.infoMap.get(THEME_KEY_ICONS_TEXT_COLOR);
    }

    public Map<String, String> getInfoMap() {
        return this.infoMap;
    }

    public String getPageBgColor() {
        return this.infoMap.get(THEME_KEY_PAGE_BG_COLOR);
    }

    public String getPageTextColor() {
        return this.infoMap.get(THEME_KEY_PAGE_TEXT_COLOR);
    }

    public String getRefreshBgColor() {
        return this.infoMap.get(THEME_KEY_REFRESH_BG_COLOR);
    }

    public String getRefreshBgUrl() {
        return this.infoMap.get(THEME_KEY_REFRESH_BG_IMG);
    }

    @Deprecated
    public String getServiceBgImgUrl() {
        return this.infoMap.get(THEME_KEY_SERVICE_BG_IMG);
    }

    @Nullable
    public String[] getTabColorArray(boolean z) {
        if (!TextUtils.isEmpty(getTabSelectedColor()) && !TextUtils.isEmpty(getTabUnSelectedColor())) {
            return new String[]{getTabUnSelectedColor(), getTabSelectedColor()};
        }
        String[] strArr = new String[2];
        strArr[0] = z ? this.THEME_DEFAULT_TAB_UNSELECTED_COLOR_DARK : this.THEME_DEFAULT_TAB_SELECTED_COLOR;
        strArr[1] = this.THEME_DEFAULT_TAB_SELECTED_COLOR;
        return strArr;
    }

    public String getTabSelectedColor() {
        return this.infoMap.get("column_color");
    }

    public String getTabUnSelectedColor() {
        return this.infoMap.get(THEME_KEY_TAB_UNSELECTED_COLOR);
    }

    @Deprecated
    public String getTopBarColor() {
        return this.infoMap.get(THEME_KEY_TOPBAR_COLOR);
    }

    @Deprecated
    public String getTopBarImgUrl() {
        return this.infoMap.get(THEME_KEY_TOPBAR_IMG_URL);
    }

    public boolean hasRefreshBgTheme() {
        return (TextUtils.isEmpty(getRefreshBgColor()) ^ true) || (TextUtils.isEmpty(getRefreshBgUrl()) ^ true);
    }

    @Deprecated
    public boolean isCustomizedTopBarBackground() {
        return (TextUtils.equals(this.THEME_DEFAULT_TOPBAR_COLOR, getTopBarColor()) && TextUtils.equals(this.THEME_DEFAULT_TOPBAR_IMG_URL, getTopBarImgUrl())) ? false : true;
    }

    @NotNull
    public String toString() {
        return "ThemeInfo{infoMap=" + this.infoMap + '}';
    }

    public boolean useLightIcon() {
        String iconStyle = getIconStyle();
        return "1".equals(iconStyle) || !"2".equals(iconStyle);
    }
}
