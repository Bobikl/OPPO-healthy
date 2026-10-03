package com.glyphix.mas.api;

import com.glyphix.mas.callback.GlyphixResolver;
import com.glyphix.mas.common.b;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class GxSys {
    private static String moduleName = "GxSys";

    public static void echo(Integer num, GlyphixResolver glyphixResolver) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ClickApiEntity.TIME, num);
            b.a("service_echo", jSONObject, moduleName, glyphixResolver);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static void exportLog(String str, GlyphixResolver glyphixResolver) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("local", str);
            b.a("export_log", jSONObject, moduleName, glyphixResolver);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static void getDeviceInfo(GlyphixResolver glyphixResolver) {
        b.a("device_info", new JSONObject(), moduleName, glyphixResolver);
    }

    public static void lostTest(Float f, Integer num, GlyphixResolver glyphixResolver) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ParserTag.TAG_PERCENT, f.toString());
            jSONObject.put(ClickApiEntity.TIME, num);
            b.a("lost_test", jSONObject, moduleName, glyphixResolver);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static void togglePerformance(boolean z, GlyphixResolver glyphixResolver) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", z ? "1" : "0");
            b.a("toggle_prof", jSONObject, moduleName, glyphixResolver);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
