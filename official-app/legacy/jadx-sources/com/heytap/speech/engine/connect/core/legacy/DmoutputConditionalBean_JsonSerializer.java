package com.heytap.speech.engine.connect.core.legacy;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class DmoutputConditionalBean_JsonSerializer implements Serializable {
    public static JSONObject serialize(DmoutputEntity.DmoutputConditionalBean dmoutputConditionalBean) throws JSONException {
        if (dmoutputConditionalBean == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("condition", DmoutputConditionBean_JsonSerializer.serialize(dmoutputConditionalBean.getCondition()));
        jSONObject.put("directive", DirectiveBean_JsonSerializer.serialize(dmoutputConditionalBean.getDirective()));
        return jSONObject;
    }
}
