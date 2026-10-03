package com.glyphix.mas.api;

import com.glyphix.mas.callback.GlyphixResolver;
import com.glyphix.mas.common.b;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class GxTime {
    private static String moduleName = "GxTime";

    public static void sync(Long l2, Integer num, GlyphixResolver glyphixResolver) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timestamp", l2);
            jSONObject.put("timezone", num.intValue() / 60);
            jSONObject.put("minute_offset", num.intValue() % 60);
            b.a("time_sync_svc", jSONObject, moduleName, glyphixResolver);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
