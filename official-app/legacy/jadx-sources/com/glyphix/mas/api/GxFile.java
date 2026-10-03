package com.glyphix.mas.api;

import com.glyphix.mas.callback.GlyphixResolver;
import com.glyphix.mas.common.b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class GxFile {
    private static String moduleName = "com.glyphix.mas.api.GxFile";

    public static void checkSha1(String str, String str2, GlyphixResolver glyphixResolver) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("local", str);
            jSONObject.put("remote", str2);
            b.a("check_file_sha1_test", jSONObject, moduleName, glyphixResolver);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static void delete(String str, GlyphixResolver glyphixResolver) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("remote", str);
            b.a("delete_file_svc", jSONObject, moduleName, glyphixResolver);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static String pull(String str, String str2, GlyphixResolver glyphixResolver) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("local", str);
            jSONObject.put("remote", str2);
            return b.a("pull_file_svc", jSONObject, moduleName, glyphixResolver);
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String push(String str, String str2, GlyphixResolver glyphixResolver) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("local", str);
            jSONObject.put("remote", str2);
            return b.a("push_file_svc", jSONObject, moduleName, glyphixResolver);
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String readDir(String str, GlyphixResolver glyphixResolver) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("remote", str);
            return b.a("read_dir", jSONObject, moduleName, glyphixResolver);
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
