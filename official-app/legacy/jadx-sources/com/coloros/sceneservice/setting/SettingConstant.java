package com.coloros.sceneservice.setting;

import androidx.annotation.Keep;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes13.dex */
@Keep
public final class SettingConstant {
    public static final String KEY_COMPANY_ADDRESS = "pref_key_company_address";
    public static final String KEY_COMPANY_WLAN = "pref_key_company_wlan";
    public static final String KEY_HOME_ADDRESS = "pref_key_home_address";
    public static final String KEY_HOME_WLAN = "pref_key_home_wlan";
    public static final int REQUEST_CODE_COMPANY = 102;
    public static final int REQUEST_CODE_HOME = 101;
    public static final String RESULT_EXTRA_ADDRESS = "address";
    public static final String RESULT_EXTRA_COMPANY_ADDRESS = "company_address";
    public static final String RESULT_EXTRA_COMPANY_WIFI = "company_wifi";
    public static final String RESULT_EXTRA_HOME_ADDRESS = "home_address";
    public static final String RESULT_EXTRA_HOME_WIFI = "home_wifi";
    public static final String RESULT_EXTRA_TAG = "tag";
    public static final String RESULT_EXTRA_WIFI_NAME = "wifi_name";
    public static final int UPDATE_MODE_NOTIFICATION = 2;
    public static final int UPDATE_MODE_POPUP_WINDOW = 1;

    @Keep
    public enum Scene {
        Home(SettingConstant.KEY_HOME_ADDRESS, SettingConstant.KEY_HOME_WLAN),
        Company(SettingConstant.KEY_COMPANY_ADDRESS, SettingConstant.KEY_COMPANY_WLAN);

        public String mAddressKey;
        public String mWlanKey;

        Scene(String str, String str2) {
            this.mAddressKey = str;
            this.mWlanKey = str2;
        }
    }

    @Keep
    @Retention(RetentionPolicy.SOURCE)
    public @interface ThemeType {
        public static final int THEME_TYPE_BLUE = 1;
    }
}
