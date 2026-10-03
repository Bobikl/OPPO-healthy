package com.heytap.accessory.file.model;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class FTOperateEntity {
    private int mOpCode;
    private JSONObject mParams;

    public FTOperateEntity() {
    }

    public void fromJSON(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        this.mOpCode = jSONObject.getInt("OpCode");
        this.mParams = jSONObject.getJSONObject("Parameters");
    }

    public int getOpCode() {
        return this.mOpCode;
    }

    public JSONObject getParams() {
        return this.mParams;
    }

    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("OpCode", this.mOpCode);
        jSONObject.put("Parameters", this.mParams);
        return jSONObject;
    }

    public FTOperateEntity(int i, JSONObject jSONObject) {
        this.mOpCode = i;
        this.mParams = jSONObject;
    }
}
