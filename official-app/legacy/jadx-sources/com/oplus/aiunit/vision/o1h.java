package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes16.dex */
public class o1h {
    public static final String DEVICE_SECOND_STATUS = "device_second_status";
    public static final String INTERCEPT_MAC_LIST = "intercept_mac_list";
    public static final String KEY_ENTER_OOBE = "enter_oobe";
    public static final String MIGRATE_DEVICE_CHOOSE_MAC = "migrate_device_choose_mac";
    public static final String MIGRATE_DEVICE_CHOOSE_MODEL = "migrate_device_choose_model";
    public static final String MIGRATE_DEVICE_CLEAR_DATA_DONE = "migrate_clear_data_done";
    public static final String MIGRATE_DEVICE_MAC = "migrate_device_mac";
    public static final String MIGRATE_DEVICE_MODEL = "migrate_devcie_model";
    public static final String OOBE_CURRENT_STATE = "oobe_current_state";
    public static final String OOBE_DEVICE_MODEL = "oobe_devcie_model";
    public static final int OOBE_ENTERED = 1;
    public static final String OOBE_FAMILY_NIKE_NAME = "oobe_family_nike_name";
    public static final String OOBE_MAC = "oobe_current_mac";
    public static final String OOBE_NAME = "oobe_current_name";
    public static final int OOBE_OUTED = 0;
    public static final String PREVIOUS_CONNECT_MAC = "previous_connect_device_mac";
    public static final String SECOND_PHONE_NAME = "second_phone_name";
    public static final String SLEEP_SETTING_BED_TIME_SWITCH = "sleep_setting_bed_time_switch";
    public static final String SLEEP_SETTING_BED_TIME_VALUE = "sleep_setting_bed_time_value";
    public static final int SP_DEFAULT_INT = -1;
    public static final String THIRDPARTY_SELECT_MAC = "THIRDPARTY_SELECT_MAC";

    public static int a(Context context, @NonNull String str) {
        return v9g.x("com.heytap.health_preference").y(str);
    }

    public static long b(Context context, @NonNull String str, long j2) {
        return v9g.x("com.heytap.health_preference").B(str, j2);
    }

    @Nullable
    public static String c(Context context, @NonNull String str) {
        return v9g.x("com.heytap.health_preference").E(str, null);
    }

    public static String d(Context context, @NonNull String str, String str2) {
        return v9g.x("com.heytap.health_preference").E(str, str2);
    }

    public static void e(Context context, @NonNull String str, int i) {
        v9g.x("com.heytap.health_preference").S(str, i);
    }

    public static void f(Context context, @NonNull String str, long j2) {
        v9g.x("com.heytap.health_preference").T(str, j2);
    }

    public static void g(Context context, @NonNull String str, String str2) {
        v9g.x("com.heytap.health_preference").U(str, str2);
    }
}
