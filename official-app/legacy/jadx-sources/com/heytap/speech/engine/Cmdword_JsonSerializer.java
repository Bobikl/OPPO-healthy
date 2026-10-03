package com.heytap.speech.engine;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Cmdword_JsonSerializer implements Serializable {
    public static JSONObject serialize(Cmdword cmdword) throws JSONException {
        if (cmdword == null) {
            return null;
        }
        return new JSONObject();
    }
}
