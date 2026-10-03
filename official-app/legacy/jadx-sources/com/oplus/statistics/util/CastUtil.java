package com.oplus.statistics.util;

import com.oplus.aiunit.vision.lqd;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class CastUtil {
    public static JSONObject map2JsonObject(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null && !map.isEmpty()) {
            try {
                for (String str : map.keySet()) {
                    jSONObject.put(str, map.get(str));
                }
            } catch (Exception e2) {
                LogUtil.e("CastUtil", new lqd(e2));
            }
        }
        return jSONObject;
    }
}
