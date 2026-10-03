package com.oplus.aiunit.vision;

import android.os.Build;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;

/* JADX INFO: loaded from: classes18.dex */
public class dj8 {
    public static final String CHANNEL = "ch";
    public static final int CURRENT_CHANNEL = 2001;
    public static final String ID = "id";
    public static final String KEY = "oak";
    public static final String KEY_APP_VERSION = "apv";
    public static final String KEY_PACKAGE_NAME = "pkg";
    public static final String KEY_PRODUCT_ID = "pid";
    public static final String KEY_SN = "sn";
    public static final String OAK_VALUE = "81def10b4c27927c";
    public static final String PRODUCT_ID = "000";
    public static final String SIGN = "sign";
    public static final int STAT_APPCODE = 0;
    public static final String TAG = "HeaderUtils";
    public static final String TIMESTAMP = "t";
    public static final String UA = "User-Agent";

    public static String a(WalletDevInfo walletDevInfo) {
        StringBuilder sb = new StringBuilder(lkj.b() + "/" + walletDevInfo.g() + "/" + Build.VERSION.SDK_INT + "/" + lkj.a() + "/" + v3d.b() + "/0");
        sb.append("/");
        sb.append(2001);
        sb.append("/");
        sb.append(x70.e(b78.a()));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("uaBuild =");
        sb2.append((Object) sb);
        try {
            return URLEncoder.encode(sb.toString(), "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return sb.toString();
        }
    }

    public static HashMap<String, String> b() {
        HashMap<String, String> map = new HashMap<>();
        WalletDevInfo walletDevInfoB = yj5.c().b();
        map.put("pid", PRODUCT_ID);
        map.put("User-Agent", a(walletDevInfoB));
        map.put("id", walletDevInfoB.d());
        map.put(CHANNEL, "2001");
        map.put("pkg", x70.c(b78.a()));
        map.put(KEY_APP_VERSION, y80.VERSION_NAME_SHORT);
        map.put(KEY_SN, walletDevInfoB.d());
        map.put("X-NfcSupport", String.valueOf(true));
        map.put(KEY, OAK_VALUE);
        return map;
    }
}
