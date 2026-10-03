package com.heytap.accessory.file.model;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class CancelAllRequest {
    private String mAgentId;

    public CancelAllRequest() {
    }

    public void fromJSON(Object obj) throws JSONException {
        this.mAgentId = new JSONObject((String) obj).getString("AgentId");
    }

    public String getAgentId() {
        return this.mAgentId;
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("AgentId", this.mAgentId);
        return jSONObject;
    }

    public CancelAllRequest(String str) {
        this.mAgentId = str;
    }
}
