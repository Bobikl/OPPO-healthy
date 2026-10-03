package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class mi8 {
    public static String a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (next != null) {
                jSONObject2.put("$" + next, objOpt);
            }
        }
        return jSONObject2.toString();
    }
}
