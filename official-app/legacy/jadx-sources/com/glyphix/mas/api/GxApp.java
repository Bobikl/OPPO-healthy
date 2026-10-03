package com.glyphix.mas.api;

import com.glyphix.mas.callback.GlyphixResolver;
import com.glyphix.mas.common.b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class GxApp {
    private static String moduleName = "com.glyphix.mas.api.GxApp";

    public static void exit(String str, GlyphixResolver glyphixResolver) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", str);
            b.a("app_exit_svc", jSONObject, moduleName, glyphixResolver);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static String install(String str, String str2, GlyphixResolver glyphixResolver) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("local", str);
            jSONObject.put("remote", str2);
            return b.a("app_install_svc", jSONObject, moduleName, glyphixResolver);
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static void isWearAppInstalled(String str, GlyphixResolver glyphixResolver) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", str);
            b.a("app_ping_svc", jSONObject, moduleName, glyphixResolver);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static void launch(String str, GlyphixResolver glyphixResolver) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", str);
            b.a("app_launch_svc", jSONObject, moduleName, glyphixResolver);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static void list(GlyphixResolver glyphixResolver) {
        b.a("app_list_svc", new JSONObject(), moduleName, glyphixResolver);
    }

    public static void startAutoTest(String str, String str2, GlyphixResolver glyphixResolver) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", str);
            jSONObject.put("testcase", str2);
            b.a("auto_test_start", jSONObject, moduleName, glyphixResolver);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static void stopAutoTest(String str, GlyphixResolver glyphixResolver) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", str);
            b.a("auto_test_stop", jSONObject, moduleName, glyphixResolver);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static void uninstall(String str, GlyphixResolver glyphixResolver) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", str);
            b.a("app_uninstall_svc", jSONObject, moduleName, glyphixResolver);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
