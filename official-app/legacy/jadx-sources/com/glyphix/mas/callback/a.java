package com.glyphix.mas.callback;

import com.glyphix.mas.utils.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class a {
    private static String a = "MasCallbackManager";
    private static Map<String, GlyphixResolver> b = new HashMap();

    public static void a(String str, String str2, String str3) {
        if (!b.containsKey(str)) {
            b.c().e(a, "not find callback by resolver_id: " + str);
            return;
        }
        GlyphixResolver glyphixResolver = b.get(str);
        try {
            JSONObject jSONObject = new JSONObject(str3);
            if (jSONObject.getInt("code") != 200) {
                glyphixResolver.onFailed(jSONObject);
            } else if (str2.equals("onComplete")) {
                glyphixResolver.onSuccess(jSONObject);
            } else if (str2.equals("onProgress")) {
                glyphixResolver.onProgress(jSONObject);
            }
        } catch (NullPointerException | JSONException e2) {
            e2.printStackTrace();
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 500);
                jSONObject2.put("msg", e2.getMessage() + " " + str3);
                glyphixResolver.onFailed(jSONObject2);
            } catch (NullPointerException | JSONException unused) {
                e2.printStackTrace();
            }
        }
    }

    public static void b(String str, GlyphixResolver glyphixResolver) {
        int iIdentityHashCode = System.identityHashCode(glyphixResolver);
        b.remove(str + "_" + iIdentityHashCode);
    }

    public static void a(String str, GlyphixResolver glyphixResolver) {
        a(str, Integer.toString(System.identityHashCode(glyphixResolver)), glyphixResolver);
    }

    public static void a(String str, String str2, GlyphixResolver glyphixResolver) {
        b.put(str + "_" + str2, glyphixResolver);
    }
}
