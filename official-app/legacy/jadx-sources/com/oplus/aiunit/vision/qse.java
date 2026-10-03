package com.oplus.aiunit.vision;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class qse {
    public static Map<String, String> a(String str) {
        String strTrim = str.trim();
        HashMap map = new HashMap();
        try {
            if (strTrim.charAt(0) != '{') {
                return map;
            }
            JSONObject jSONObject = new JSONObject(strTrim);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            return map;
        } catch (JSONException e2) {
            q7b.d("PreloadUtils", e2.getMessage());
            return null;
        }
    }

    public static String b(String str) {
        try {
            URL url = new URL(str);
            return url.getProtocol() + "://" + url.getHost() + url.getPath();
        } catch (MalformedURLException e2) {
            q7b.f("PreloadUtils", "unifiedUrl failed!", e2);
            return str;
        }
    }
}
