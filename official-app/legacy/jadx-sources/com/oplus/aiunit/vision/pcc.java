package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class pcc {
    public static final String MAC_DIVIDER = "/";

    public static long a() {
        return v9g.x("sp_music_transfer").B("key_timestamp_request_server", 0L);
    }

    public static String b() {
        return v9g.x("sp_music_transfer").D("key_server_config");
    }

    public static boolean c() {
        return v9g.x("sp_music_transfer").r("key_shown_battery_low_dialog", false);
    }

    public static boolean d() {
        return v9g.x("sp_music_transfer").r("key_shown_new_user_guide", false);
    }

    public static boolean e(String str) {
        return v9g.w().E("key_music_control_rx_macs", "").contains(str);
    }

    public static void f() {
        v9g.x("sp_music_transfer").W("key_shown_battery_low_dialog", true);
    }

    public static void g(boolean z, String str) {
        String strE = v9g.w().E("key_music_control_rx_macs", "");
        v9g.w().U("key_music_control_rx_macs", z ? strE.concat(str).concat("/") : strE.replace(str.concat("/"), ""));
    }

    public static void h(long j2) {
        v9g.x("sp_music_transfer").T("key_timestamp_request_server", j2);
    }

    public static void i(String str) {
        v9g.x("sp_music_transfer").U("key_server_config", str);
    }

    public static void j() {
        v9g.x("sp_music_transfer").W("key_shown_new_user_guide", true);
    }
}
