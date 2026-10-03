package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.e.h;
import com.oplus.aiunit.vision.vam;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class b {
    public static synchronized Map<String, String> a(Context context, Map<String, String> map) {
        HashMap map2;
        map2 = new HashMap();
        String strB = vam.b(map, "tid", "");
        String strB2 = vam.b(map, "utdid", "");
        String strB3 = vam.b(map, "userId", "");
        String strB4 = vam.b(map, "appName", "");
        String strB5 = vam.b(map, "appKeyClient", "");
        String strB6 = vam.b(map, "tmxSessionId", "");
        String strF = h.f(context);
        String strB7 = vam.b(map, "sessionId", "");
        map2.put("AC1", strB);
        map2.put("AC2", strB2);
        map2.put("AC3", "");
        map2.put("AC4", strF);
        map2.put("AC5", strB3);
        map2.put("AC6", strB6);
        map2.put("AC7", "");
        map2.put("AC8", strB4);
        map2.put("AC9", strB5);
        if (vam.f(strB7)) {
            map2.put("AC10", strB7);
        }
        return map2;
    }
}
