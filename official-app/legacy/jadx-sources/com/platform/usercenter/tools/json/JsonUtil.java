package com.platform.usercenter.tools.json;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.platform.usercenter.tools.log.UCLogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class JsonUtil {
    private static final String TAG = "JsonUtil";

    private JsonUtil() {
    }

    private static boolean checkJsonUnAvail(JSONObject jSONObject, String str) throws JSONException {
        return jSONObject == null || TextUtils.isEmpty(str) || jSONObject.isNull(str) || jSONObject.get(str) == JSONObject.NULL;
    }

    public static boolean getjsonBoolean(JSONObject jSONObject, String str) throws JSONException {
        if (checkJsonUnAvail(jSONObject, str)) {
            return false;
        }
        return jSONObject.getBoolean(str);
    }

    public static int getjsonInt(JSONObject jSONObject, String str) throws JSONException {
        if (checkJsonUnAvail(jSONObject, str)) {
            return 0;
        }
        return jSONObject.getInt(str);
    }

    public static long getjsonLong(JSONObject jSONObject, String str) throws JSONException {
        if (checkJsonUnAvail(jSONObject, str)) {
            return 0L;
        }
        return jSONObject.getLong(str);
    }

    public static String getjsonString(JSONObject jSONObject, String str) throws JSONException {
        return checkJsonUnAvail(jSONObject, str) ? "" : jSONObject.getString(str);
    }

    public static <T> T stringToClass(String str, Class<T> cls) {
        try {
            return (T) new Gson().fromJson(str, (Class) cls);
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
            return null;
        }
    }

    public static String toJson(Object obj) {
        if (obj == null) {
            return "";
        }
        try {
            return new Gson().toJson(obj);
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
            return "";
        }
    }
}
