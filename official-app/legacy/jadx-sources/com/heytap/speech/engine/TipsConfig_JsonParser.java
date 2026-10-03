package com.heytap.speech.engine;

import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class TipsConfig_JsonParser implements Serializable {
    public static TipsConfig parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new TipsConfig();
    }
}
