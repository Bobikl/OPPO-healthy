package com.glyphix.mas.api;

import com.glyphix.mas.callback.GlyphixResolver;
import com.glyphix.mas.common.b;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class GxSpeed {
    private static String moduleName = "GxSpeed";

    public static void speed(Integer num, GlyphixResolver glyphixResolver) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ClickApiEntity.TIME, num);
            b.a("speed_test_svc", jSONObject, moduleName, glyphixResolver);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
