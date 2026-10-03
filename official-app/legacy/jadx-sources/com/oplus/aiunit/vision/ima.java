package com.oplus.aiunit.vision;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class ima {
    public static boolean a(JSONObject jSONObject, String str) throws JSONException {
        return jSONObject == null || TextUtils.isEmpty(str) || jSONObject.isNull(str) || jSONObject.get(str) == JSONObject.NULL;
    }

    public static String b(JSONObject jSONObject, String str) throws JSONException {
        return a(jSONObject, str) ? "" : jSONObject.getString(str);
    }
}
