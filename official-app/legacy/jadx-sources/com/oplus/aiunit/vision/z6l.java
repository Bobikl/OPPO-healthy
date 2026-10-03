package com.oplus.aiunit.vision;

import com.heytap.webview.extension.activity.FragmentStyle;
import java.util.HashMap;

/* JADX INFO: loaded from: classes18.dex */
public class z6l {
    public static final String WALLET_DEBUG_HOST = "https://cwallet-test3.wanyol.com";
    public static final String WALLET_RELEASE_HOST = "https://cwallet.finzfin.com";
    public static final String WALLET_TEST_HOST = "https://cwallet-test.wanyol.com";
    public static final HashMap<String, String> a;
    public static String b;

    static {
        HashMap<String, String> map = new HashMap<>();
        a = map;
        map.put(FragmentStyle.DEBUG, WALLET_DEBUG_HOST);
        map.put("prerelease", WALLET_TEST_HOST);
        b = "prerelease";
    }

    public static String a() {
        t6b.e("chanelValue: " + com.heytap.health.base.track.a.channelValue);
        if (qe0.E() || "nfctest".equals(com.heytap.health.base.track.a.channelValue) || "nfcPutKey".equals(com.heytap.health.base.track.a.channelValue)) {
            return WALLET_RELEASE_HOST;
        }
        t6b.a("env_str" + b);
        return a.get(b);
    }
}
