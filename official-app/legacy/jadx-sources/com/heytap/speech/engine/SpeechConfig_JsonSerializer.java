package com.heytap.speech.engine;

import com.heytap.nearx.tangramconfig.strategy.Fields;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class SpeechConfig_JsonSerializer implements Serializable {
    public static JSONObject serialize(SpeechConfig speechConfig) throws JSONException {
        if (speechConfig == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("globalConfig", GlobalConfig_JsonSerializer.serialize(speechConfig.getGlobalConfig()));
        jSONObject.put("platform", speechConfig.getPlatform());
        jSONObject.put(Fields.PRODUCT_ID, speechConfig.getProductId());
        jSONObject.put("resTime", speechConfig.getResTime());
        jSONObject.put("ui", Ui_JsonSerializer.serialize(speechConfig.getUi()));
        jSONObject.put("version", speechConfig.getVersion());
        return jSONObject;
    }
}
