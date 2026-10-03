package com.heytap.accessory.stream.model;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class CancelAllRequest {
    private String mAgentId;
    private long mConnectionId;

    public CancelAllRequest() {
    }

    public void fromJSON(Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject((String) obj);
        this.mAgentId = jSONObject.getString("AgentId");
        this.mConnectionId = jSONObject.getLong("ConnectionId");
    }

    public String getAgentId() {
        return this.mAgentId;
    }

    public long getConnectionId() {
        return this.mConnectionId;
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("AgentId", this.mAgentId);
        jSONObject.put("ConnectionId", this.mConnectionId);
        return jSONObject;
    }

    public CancelAllRequest(String str) {
        this.mAgentId = str;
    }

    public CancelAllRequest(String str, long j) {
        this.mAgentId = str;
        this.mConnectionId = j;
    }
}
