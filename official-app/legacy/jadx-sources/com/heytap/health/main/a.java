package com.heytap.health.main;

import android.content.Context;
import com.heytap.health.R;

/* JADX INFO: loaded from: classes16.dex */
public class a {
    public static final int INDEX_HOME = 0;
    public static final int INDEX_MANAGER = 3;
    public static final int INDEX_ME = 4;
    public static final int INDEX_SERVICE = 1;
    public static final int INDEX_SPORT = 2;
    public static final C0471a[] a = {new C0471a(R.raw.app_tab_health, R.raw.app_tab_health_dark, R.string.lib_base_main_health_tab, "com.heytap.health.home.HomeFragment"), new C0471a(R.raw.app_tab_sport, R.raw.app_tab_sport_dark, R.string.lib_base_main_sport_tab, "com.heytap.sports.home.SportsHomeFragment"), new C0471a(R.raw.app_tab_manager, R.raw.app_tab_manager_dark, R.string.lib_base_main_device_tab, "com.heytap.health.device.tab.NewDeviceFragment"), new C0471a(R.raw.app_tab_me, R.raw.app_tab_me_dark, R.string.lib_base_main_manage_tab, "com.heytap.health.settings.me.settings2.PersonalCenterFragment")};
    public static final String[] MAIN_MAPPING_ARRAY = {"com.heytap.health.home.HomeFragment", "com.heytap.health.home.HomeFragment", "com.heytap.sports.home.SportsHomeFragment", "com.heytap.health.device.tab.NewDeviceFragment", "com.heytap.health.settings.me.settings2.PersonalCenterFragment", "com.heytap.health.operation.service.ServiceFragment"};

    /* JADX INFO: renamed from: com.heytap.health.main.a$a, reason: collision with other inner class name */
    public static class C0471a {
        public int a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4940c;
        public String d;

        public C0471a(int i, int i2, int i3, String str) {
            this.a = i;
            this.b = i2;
            this.f4940c = i3;
            this.d = str;
        }
    }

    public static String[] b(Context context) {
        return new String[]{context.getString(R.string.lib_base_code_health), context.getString(R.string.lib_base_code_movement), context.getString(R.string.lib_base_code_manager), context.getString(R.string.lib_base_code_personal)};
    }

    public static int c() {
        return 0;
    }

    public C0471a[] a() {
        return a;
    }
}
