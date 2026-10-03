package com.oplus.aiunit.vision;

import com.heytap.weather.interceptor.CryptoInterceptor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class oll {
    public static final String TEST_CRYPTO_BUSINESS_NAME = "common-ec";
    public static String d = "weather-location-service";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f14981e = "crypto-cipher-service";
    public static volatile oll f = null;
    public static boolean sDebugLog = false;
    public static boolean sEXP = true;
    public sqf a;
    public CryptoInterceptor b = new CryptoInterceptor();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14982c = "";

    public static String b() {
        return d;
    }

    public static oll f() {
        if (f == null) {
            synchronized (oll.class) {
                if (f == null) {
                    f = new oll();
                }
            }
        }
        return f;
    }

    public static String g() {
        return f14981e;
    }

    public String a() {
        return this.f14982c;
    }

    public CryptoInterceptor c() {
        return this.b;
    }

    public CryptoInterceptor.c d() {
        return null;
    }

    public Map<String, String> e(String str, String str2) {
        HashMap map = new HashMap();
        sqf sqfVar = this.a;
        if (sqfVar != null) {
            map.putAll(sqfVar.d(str, str2));
        }
        return map;
    }

    public void h(sqf sqfVar) {
        this.a = sqfVar;
    }
}
