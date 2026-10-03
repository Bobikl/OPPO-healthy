package com.heytap.speech.engine.connect.core.legacy;

import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class DmoutputConditionalBean_JsonParser implements Serializable {
    public static DmoutputEntity.DmoutputConditionalBean parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        DmoutputEntity.DmoutputConditionalBean dmoutputConditionalBean = new DmoutputEntity.DmoutputConditionalBean();
        dmoutputConditionalBean.setCondition(DmoutputConditionBean_JsonParser.parse(jSONObject.optJSONObject("condition")));
        dmoutputConditionalBean.setDirective(DirectiveBean_JsonParser.parse(jSONObject.optJSONObject("directive")));
        return dmoutputConditionalBean;
    }
}
