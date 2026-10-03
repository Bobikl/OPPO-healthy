package com.heytap.store.util;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.heytap.store.protobuf.IconDetails;
import com.oplus.aiunit.vision.vhc;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public class ThemeInfo {
    public static final String THEME_ICON_STYLE_NORMAL = "1";
    public static final String THEME_ICON_STYLE_SPECIAL = "2";
    public static final String THEME_ICON_STYLE_UNDEFINED = "0";
    private static final String THEME_KEY_ICONS_BG_COLOR = "icon_bgcolor";
    private static final String THEME_KEY_ICONS_STYLE = "page_icon";
    private static final String THEME_KEY_ICONS_TEXT_COLOR = "icon_textcolor";
    private static final String THEME_KEY_PAGE_BG_COLOR = "page_bgcolor";
    private static final String THEME_KEY_PAGE_TEXT_COLOR = "page_textcolor";
    private static final String THEME_KEY_TAB_SELECTED_COLOR = "column_color";
    private static final String THEME_KEY_TAB_UNSELECTED_COLOR = "column_uncolor";
    private static final String THEME_KEY_TOPBAR_COLOR = "topbar_color";
    public String THEME_DEFAULT_TAB_SELECTED_COLOR = "#FF0000";
    public String THEME_DEFAULT_TAB_UNSELECTED_COLOR = "#000000";
    public String THEME_DEFAULT_TAB_UNSELECTED_COLOR_DARK = "#FFFFFF";
    public String THEME_DEFAULT_TOPBAR_COLOR = "";
    public String THEME_DEFAULT_TOPBAR_IMG_URL = "";
    private Map<String, String> infoMap;
    private static final String THEME_KEY_TOPBAR_IMG_URL = "topbar_bgpic";
    private static final String THEME_KEY_SERVICE_BG_IMG = "service_bgpic";
    private static final String THEME_KEY_ICONS_BG_IMG = "icon_bgpic";
    private static final String THEME_KEY_BANNER_BG_IMG = "banner_bgpic";
    private static String[] IMG_KEYS = {THEME_KEY_TOPBAR_IMG_URL, THEME_KEY_SERVICE_BG_IMG, THEME_KEY_ICONS_BG_IMG, THEME_KEY_BANNER_BG_IMG};

    public ThemeInfo() {
        HashMap map = new HashMap();
        this.infoMap = map;
        map.put("column_color", this.THEME_DEFAULT_TAB_SELECTED_COLOR);
        if (vhc.a(ContextGetterUtils.INSTANCE.getApp())) {
            this.infoMap.put(THEME_KEY_TAB_UNSELECTED_COLOR, this.THEME_DEFAULT_TAB_UNSELECTED_COLOR_DARK);
        } else {
            this.infoMap.put(THEME_KEY_TAB_UNSELECTED_COLOR, this.THEME_DEFAULT_TAB_UNSELECTED_COLOR);
        }
        this.infoMap.put(THEME_KEY_TOPBAR_COLOR, this.THEME_DEFAULT_TOPBAR_COLOR);
        this.infoMap.put(THEME_KEY_TOPBAR_IMG_URL, this.THEME_DEFAULT_TOPBAR_IMG_URL);
        this.infoMap.put(THEME_KEY_BANNER_BG_IMG, "");
        this.infoMap.put(THEME_KEY_ICONS_BG_IMG, "");
        this.infoMap.put(THEME_KEY_ICONS_BG_COLOR, "");
        this.infoMap.put(THEME_KEY_ICONS_TEXT_COLOR, "");
        this.infoMap.put(THEME_KEY_ICONS_STYLE, "0");
        this.infoMap.put(THEME_KEY_SERVICE_BG_IMG, "");
        this.infoMap.put(THEME_KEY_PAGE_TEXT_COLOR, "");
        this.infoMap.put(THEME_KEY_PAGE_BG_COLOR, "");
    }

    public static ThemeInfo fromIconDetails(List<IconDetails> list) {
        ThemeInfo themeInfo = new ThemeInfo();
        if (list != null && !list.isEmpty()) {
            for (IconDetails iconDetails : list) {
                String str = iconDetails.title;
                if (!TextUtils.isEmpty(str)) {
                    if (isImageResourceKey(str)) {
                        if (themeInfo.infoMap.containsKey(str) && !TextUtils.isEmpty(iconDetails.url)) {
                            themeInfo.infoMap.put(str, iconDetails.url);
                        }
                    } else if (themeInfo.infoMap.containsKey(str) && !TextUtils.isEmpty(iconDetails.link)) {
                        themeInfo.infoMap.put(str, iconDetails.link);
                    }
                }
            }
        }
        return themeInfo;
    }

    public static ThemeInfo fromInfoMap(Map<String, String> map) {
        ThemeInfo themeInfo = new ThemeInfo();
        if (map != null && !map.isEmpty()) {
            themeInfo.infoMap = map;
        }
        return themeInfo;
    }

    public static ThemeInfo fromJsonString(String str) {
        return fromInfoMap((Map) new Gson().fromJson(str, new TypeToken<HashMap<String, String>>() { // from class: com.heytap.store.util.ThemeInfo.1
        }.getType()));
    }

    public static boolean isImageResourceKey(String str) {
        for (String str2 : IMG_KEYS) {
            if (TextUtils.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public String getBannerBgImgUrl() {
        return this.infoMap.get(THEME_KEY_BANNER_BG_IMG);
    }

    public String getIconStyle() {
        return this.infoMap.get(THEME_KEY_ICONS_STYLE);
    }

    public String getIconsBgColor() {
        return this.infoMap.get(THEME_KEY_ICONS_BG_COLOR);
    }

    public String getIconsBgImgUrl() {
        return this.infoMap.get(THEME_KEY_ICONS_BG_IMG);
    }

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

    public String getServiceBgImgUrl() {
        return this.infoMap.get(THEME_KEY_SERVICE_BG_IMG);
    }

    public String getTabSelectedColor() {
        return this.infoMap.get("column_color");
    }

    public String getTabUnSelectedColor() {
        return this.infoMap.get(THEME_KEY_TAB_UNSELECTED_COLOR);
    }

    public String getTopBarColor() {
        return this.infoMap.get(THEME_KEY_TOPBAR_COLOR);
    }

    public String getTopBarImgUrl() {
        return this.infoMap.get(THEME_KEY_TOPBAR_IMG_URL);
    }

    public boolean isCustomizedTopBarBackground() {
        return (TextUtils.equals(this.THEME_DEFAULT_TOPBAR_COLOR, getTopBarColor()) && TextUtils.equals(this.THEME_DEFAULT_TOPBAR_IMG_URL, getTopBarImgUrl())) ? false : true;
    }

    @NotNull
    public String toString() {
        return "ThemeInfo{infoMap=" + this.infoMap + '}';
    }
}
