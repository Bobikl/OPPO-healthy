package com.glyphix.mas.common;

import com.glyphix.mas.GxMas;
import com.glyphix.mas.callback.GlyphixResolver;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class b {
    private static String a = "com.glyphix.mas.common.b";
    private static boolean b = false;

    public static String a(String str, JSONObject jSONObject, String str2, GlyphixResolver glyphixResolver) {
        Objects.requireNonNull(glyphixResolver);
        try {
            if (!a()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1000);
                jSONObject2.put("msg", "mas is not initialized");
                jSONObject2.put("values", "");
                glyphixResolver.onFailed(jSONObject2);
                return "";
            }
            String str3 = str2 + "_" + System.identityHashCode(glyphixResolver);
            jSONObject.put("gx_mas_resolver_id", str3);
            jSONObject.put("gx_mas_rpc_timeout", glyphixResolver.timeout());
            jSONObject.put("gx_mas_rpc_retry", glyphixResolver.retry());
            com.glyphix.mas.callback.a.a(str2, glyphixResolver);
            GxMas.execLpc(str, jSONObject.toString());
            com.glyphix.mas.utils.b.c().a("exec lpc ", str, " args ", jSONObject.toString());
            return str3;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static synchronized boolean a() {
        return b;
    }

    public static synchronized void a(boolean z) {
        b = z;
    }
}
