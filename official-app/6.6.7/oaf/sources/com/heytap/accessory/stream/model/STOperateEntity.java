package com.heytap.accessory.stream.model;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class STOperateEntity {
    private int mOpCode;
    private JSONObject mParams;

    public STOperateEntity() {
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

    public STOperateEntity(int i, JSONObject jSONObject) {
        this.mOpCode = i;
        this.mParams = jSONObject;
    }
}
