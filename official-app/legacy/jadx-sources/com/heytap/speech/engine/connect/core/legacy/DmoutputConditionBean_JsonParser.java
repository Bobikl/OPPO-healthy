package com.heytap.speech.engine.connect.core.legacy;

import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class DmoutputConditionBean_JsonParser implements Serializable {
    public static DmoutputEntity.DmoutputConditionalBean.DmoutputConditionBean parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        DmoutputEntity.DmoutputConditionalBean.DmoutputConditionBean dmoutputConditionBean = new DmoutputEntity.DmoutputConditionalBean.DmoutputConditionBean();
        if (jSONObject.optString("name") != null && !jSONObject.optString("name").toString().equalsIgnoreCase("null")) {
            dmoutputConditionBean.setName(jSONObject.optString("name"));
        }
        return dmoutputConditionBean;
    }
}
