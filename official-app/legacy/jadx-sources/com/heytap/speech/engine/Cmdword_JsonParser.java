package com.heytap.speech.engine;

import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Cmdword_JsonParser implements Serializable {
    public static Cmdword parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new Cmdword();
    }
}
