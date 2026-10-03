package com.heytap.speech.engine;

import com.heytap.nearx.tangramconfig.strategy.Fields;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class SpeechConfig_JsonParser implements Serializable {
    public static SpeechConfig parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        SpeechConfig speechConfig = new SpeechConfig();
        speechConfig.setGlobalConfig(GlobalConfig_JsonParser.parse(jSONObject.optJSONObject("globalConfig")));
        if (jSONObject.optString("platform") != null && !jSONObject.optString("platform").toString().equalsIgnoreCase("null")) {
            speechConfig.setPlatform(jSONObject.optString("platform"));
        }
        if (jSONObject.optString(Fields.PRODUCT_ID) != null && !jSONObject.optString(Fields.PRODUCT_ID).toString().equalsIgnoreCase("null")) {
            speechConfig.setProductId(jSONObject.optString(Fields.PRODUCT_ID));
        }
        try {
            if (!jSONObject.has("resTime") || jSONObject.get("resTime") == null || jSONObject.get("resTime").toString().equalsIgnoreCase("null")) {
                speechConfig.setResTime(null);
            } else {
                speechConfig.setResTime(Integer.valueOf(jSONObject.optInt("resTime")));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        speechConfig.setUi(Ui_JsonParser.parse(jSONObject.optJSONObject("ui")));
        if (jSONObject.optString("version") != null && !jSONObject.optString("version").toString().equalsIgnoreCase("null")) {
            speechConfig.setVersion(jSONObject.optString("version"));
        }
        return speechConfig;
    }
}
