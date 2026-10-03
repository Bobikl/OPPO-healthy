package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import com.oplus.aiunit.vision.ubm;
import com.oplus.aiunit.vision.vam;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class a {
    public static synchronized Map<String, String> a(Context context, Map<String, String> map) {
        HashMap map2;
        String strB = vam.b(map, "appchannel", "");
        map2 = new HashMap();
        map2.put("AA1", context.getPackageName());
        ubm.a();
        map2.put("AA2", ubm.b(context));
        map2.put("AA3", "APPSecuritySDK-ALIPAYSDK");
        map2.put("AA4", "3.4.0.202311031119");
        map2.put("AA6", strB);
        return map2;
    }
}
