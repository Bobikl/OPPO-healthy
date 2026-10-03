package com.heytap.speech.engine.internal.data;

import com.heytap.store.business.rn.service.RnConstant;
import com.oplus.aiunit.vision.oea;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Command_JsonSerializer implements Serializable {
    public static JSONObject serialize(Command command) throws JSONException {
        if (command == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(oea.FEATURE_API_REQUEST, command.getApi());
        jSONObject.put(RnConstant.KEY_INIT_OPTIONS, Param_JsonSerializer.serialize(command.getParam()));
        return jSONObject;
    }
}
