package com.oplus.aiunit.vision;

import com.heytap.store.base.core.http.HttpUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class olm {
    public static Map<String, String> a(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        for (String str : map.keySet()) {
            String str2 = map.get(str);
            sb.append(str);
            sb.append(HttpUtils.EQUAL_SIGN);
            sb.append(str2);
            sb.append("&");
        }
        sb.append("key=ae10a145e7f74479a412c01bf37de6f2");
        map.put("sign", qhm.a(sb.toString()).toLowerCase());
        return map;
    }
}
