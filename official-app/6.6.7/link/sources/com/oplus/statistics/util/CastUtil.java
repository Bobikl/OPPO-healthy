package com.oplus.statistics.util;

import com.oplus.aiunit.vision.fsd;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class CastUtil {
    public static JSONObject map2JsonObject(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null && !map.isEmpty()) {
            try {
                for (String str : map.keySet()) {
                    jSONObject.put(str, map.get(str));
                }
            } catch (Exception e) {
                LogUtil.e("CastUtil", new fsd(e));
            }
        }
        return jSONObject;
    }
}
