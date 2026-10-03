package com.heytap.speech.engine.connect.core.legacy;

import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class DmoutputPayloadBean_JsonParser implements Serializable {
    public static DmoutputEntity.DmoutputPayloadBean parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        DmoutputEntity.DmoutputPayloadBean dmoutputPayloadBean = new DmoutputEntity.DmoutputPayloadBean();
        if (jSONObject.optString("dataFrom") != null && !jSONObject.optString("dataFrom").toString().equalsIgnoreCase("null")) {
            dmoutputPayloadBean.setDataFrom(jSONObject.optString("dataFrom"));
        }
        return dmoutputPayloadBean;
    }
}
