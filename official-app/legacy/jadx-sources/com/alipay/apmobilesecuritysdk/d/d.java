package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.oplus.aiunit.vision.wrm;
import com.oplus.aiunit.vision.yhm;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class d {
    public static synchronized Map<String, String> a() {
        HashMap map;
        map = new HashMap();
        try {
            new com.alipay.apmobilesecuritysdk.c.b();
            map.put("AE16", "");
        } catch (Throwable unused) {
        }
        return map;
    }

    public static synchronized Map<String, String> a(Context context) {
        HashMap map;
        wrm.a();
        yhm.a(APSecuritySdk.getInstance(context));
        map = new HashMap();
        map.put("AE1", wrm.c());
        StringBuilder sb = new StringBuilder();
        sb.append(wrm.d() ? "1" : "0");
        map.put("AE2", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(wrm.e() ? "1" : "0");
        map.put("AE3", sb2.toString());
        map.put("AE4", wrm.f());
        map.put("AE5", wrm.g());
        map.put("AE6", wrm.h());
        map.put("AE7", wrm.i());
        map.put("AE8", wrm.j());
        map.put("AE9", wrm.k());
        map.put("AE10", wrm.l());
        map.put("AE11", wrm.m());
        map.put("AE12", wrm.n());
        map.put("AE13", wrm.o());
        map.put("AE14", wrm.p());
        map.put("AE15", wrm.q());
        map.put("AE21", yhm.m());
        return map;
    }
}
