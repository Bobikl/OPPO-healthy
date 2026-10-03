package com.heytap.omas.omkms.network;

import com.heytap.omas.BuildConfig;
import com.heytap.omas.omkms.data.AreaCode;

/* JADX INFO: loaded from: classes19.dex */
public class a {
    private static final String a = "CloudUrl";

    public static String a() {
        return BuildConfig.API_HOST;
    }

    public static boolean a(AreaCode areaCode) {
        return areaCode != AreaCode.SEA;
    }
}
