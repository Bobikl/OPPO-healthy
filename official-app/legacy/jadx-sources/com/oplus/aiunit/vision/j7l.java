package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes18.dex */
public class j7l extends z9g {
    public static final String KEY_CPLC = "cplc";
    public static final String KEY_DEVICE_BLUETOOTH_MAC = "key_device_bluetooth_mac";
    public static final String NFC_SP_KEY_LOCATION_CLOUD_UPDATE_TIME = "nfc_location_cloud_update_time";
    public static final String NFC_SP_KEY_LOCATION_NOTIFY_NFC_TIME = "nfc_location_notify_nfc_time";
    public static final String NO_MORE_OPEN_TIPS_SWIPE = "no_more_open_tips_swipe";
    public static final String NO_MORE_RETURN_TIPS_SWIPE = "no_more_return_tips_swipe";
    public static final String SWITCH_LOCATION_RANGE = "nfc.swipe.card.range";
    public static final String WALLET_COMBINATION_UPDATE_LAST = "wallet_combination_update_last";
    public static final String WALLET_PROTOCOL_PRIVACY_AGREE = "wallet_protocol_privacy_agree";
    public static final String WALLET_RF_FILE_UPDATE_LAST = "wallet_rf_file_update_last";
    public static final String WALLET_RF_FILE_UPDATE_VERSION = "wallet_rf_file_update_version";
    public static final String WALLET_WASM_FILE_UPDATE_VERSION = "wallet_wasm_file_update_version";
    public static final String WALLET_WATCH_APK_VERSION = "wallet_watch_apk_version";

    public static String A(String str) {
        return v9g.x("wallet_share").E(str, "");
    }

    public static Long B() {
        return Long.valueOf(z9g.f(qz0.mContext, "wallet_search_city_version", 0L));
    }

    public static String C() {
        return z9g.j(WALLET_WATCH_APK_VERSION, "0");
    }

    public static boolean D() {
        return z9g.b(qz0.mContext, "k_w_a_s", false);
    }

    public static void E(Context context, String str) {
        z9g.k(context, "KEY_CARD_TEL_" + str);
    }

    public static void F(String str) {
        v9g.x("wallet_share").U("wallet_jingjinji_card_no", str);
    }

    public static void G(String str, int i) {
        z9g.n(b78.a(), "s_l_r_m_p" + str, i);
    }

    public static void H(String str) {
        z9g.p(qz0.mContext, "wallet_login_auth_token", str);
    }

    public static void I(String str, String str2) {
        v9g.x("wallet_share").U(str, str2);
    }

    public static void J(String str) {
        yj5.c().a();
        n7a.INSTANCE.a(37, 6, v0j.a(str, 2, 2));
        v9g.x("wallet_share").U(KEY_DEVICE_BLUETOOTH_MAC, gl4.managerApi.getCurrActiveMac());
    }

    public static void K(String str) {
        z9g.p(qz0.mContext, "wallet_nfc_default_aid", str);
    }

    public static void L(String str, boolean z) {
        v9g.x("wallet_share").W(str, z);
    }

    public static void M(boolean z) {
        z9g.l(qz0.mContext, "k_w_a_s", z);
    }

    public static void N(String str, String str2) {
        v9g.x("wallet_share").U(str, str2);
    }

    public static void O(long j2) {
        z9g.o(qz0.mContext, "wallet_search_city_version", j2);
    }

    public static void P(String str) {
        z9g.q(WALLET_WATCH_APK_VERSION, str);
    }

    public static String r() {
        return z9g.h(qz0.mContext, "wallet_login_auth_token");
    }

    public static String s(String str) {
        return v9g.x("wallet_share").D(str);
    }

    public static synchronized String t() {
        Context context = qz0.mContext;
        if (!TextUtils.isEmpty(z9g.h(context, KEY_DEVICE_BLUETOOTH_MAC))) {
            z9g.k(context, KEY_DEVICE_BLUETOOTH_MAC);
            J(gl4.managerApi.getCurrActiveMac());
        }
        return v9g.x("wallet_share").D(KEY_DEVICE_BLUETOOTH_MAC);
    }

    public static String u() {
        return z9g.h(qz0.mContext, "wallet_nfc_default_aid");
    }

    public static boolean v() {
        return "1".equals(z9g.j("common_d_n_r_t_i_0704", "1"));
    }

    public static boolean w(String str) {
        return v9g.x("wallet_share").r(str, false);
    }

    public static String x() {
        Context context = qz0.mContext;
        String strH = z9g.h(context, "wallet_jingjinji_card_no");
        if (TextUtils.isEmpty(strH)) {
            return v9g.x("wallet_share").D("wallet_jingjinji_card_no");
        }
        z9g.k(context, "wallet_jingjinji_card_no");
        v9g.x("wallet_share").U("wallet_jingjinji_card_no", strH);
        return strH;
    }

    public static int y(String str) {
        return z9g.c(b78.a(), "s_l_r_m_p" + str);
    }

    public static String z() {
        return z9g.j(SWITCH_LOCATION_RANGE, "150");
    }
}
