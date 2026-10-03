package com.heytap.speech.engine.internal.data;

import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Param_JsonParser implements Serializable {
    public static Param parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Param param = new Param();
        if (jSONObject.optString("intentName") != null && !jSONObject.optString("intentName").toString().equalsIgnoreCase("null")) {
            param.setIntentName(jSONObject.optString("intentName"));
        }
        if (jSONObject.optString("nlu") != null && !jSONObject.optString("nlu").toString().equalsIgnoreCase("null")) {
            param.setNlu(jSONObject.optString("nlu"));
        }
        if (jSONObject.optString("skillId") != null && !jSONObject.optString("skillId").toString().equalsIgnoreCase("null")) {
            param.setSkillId(jSONObject.optString("skillId"));
        }
        if (jSONObject.optString("pinyin") != null && !jSONObject.optString("pinyin").toString().equalsIgnoreCase("null")) {
            param.setPinyin(jSONObject.optString("pinyin"));
        }
        if (jSONObject.optString("duiWidget") != null && !jSONObject.optString("duiWidget").toString().equalsIgnoreCase("null")) {
            param.setDuiWidget(jSONObject.optString("duiWidget"));
        }
        if (jSONObject.optString("channel") != null && !jSONObject.optString("channel").toString().equalsIgnoreCase("null")) {
            param.setChannel(jSONObject.optString("channel"));
        }
        if (jSONObject.optString("data") != null && !jSONObject.optString("data").toString().equalsIgnoreCase("null")) {
            param.setData(jSONObject.optString("data"));
        }
        if (jSONObject.optString("script") != null && !jSONObject.optString("script").toString().equalsIgnoreCase("null")) {
            param.setScript(jSONObject.optString("script"));
        }
        return param;
    }
}
