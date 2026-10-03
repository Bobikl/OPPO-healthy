package com.heytap.speech.engine.internal.data;

import com.heytap.store.business.rn.service.RnConstant;
import com.oplus.aiunit.vision.oea;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Command_JsonParser implements Serializable {
    public static Command parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Command command = new Command();
        if (jSONObject.optString(oea.FEATURE_API_REQUEST) != null && !jSONObject.optString(oea.FEATURE_API_REQUEST).toString().equalsIgnoreCase("null")) {
            command.setApi(jSONObject.optString(oea.FEATURE_API_REQUEST));
        }
        command.setParam(Param_JsonParser.parse(jSONObject.optJSONObject(RnConstant.KEY_INIT_OPTIONS)));
        return command;
    }
}
