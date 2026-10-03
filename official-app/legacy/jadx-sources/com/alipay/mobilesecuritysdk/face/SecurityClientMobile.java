package com.alipay.mobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.a.a;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.oplus.aiunit.vision.vam;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class SecurityClientMobile {
    public static synchronized String GetApdid(Context context, Map<String, String> map) {
        HashMap map2 = new HashMap();
        map2.put("utdid", vam.b(map, "utdid", ""));
        map2.put("tid", vam.b(map, "tid", ""));
        map2.put("userId", vam.b(map, "userId", ""));
        APSecuritySdk.getInstance(context).initToken(0, map2, null);
        return a.a(context);
    }
}
