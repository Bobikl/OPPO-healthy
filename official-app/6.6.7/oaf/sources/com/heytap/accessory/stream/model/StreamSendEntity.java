package com.heytap.accessory.stream.model;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class StreamSendEntity {
    private long mAccessoryID;
    private String mAgentClassName;
    private String mContainerID;
    private String mPackageName;
    private String mPeerID;

    public StreamSendEntity() {
    }

    public void fromJSON(Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject((String) obj);
        this.mPeerID = jSONObject.getString("PeerId");
        this.mContainerID = jSONObject.getString("ContainerId");
        this.mAccessoryID = jSONObject.getLong("AccessoryId");
        if (jSONObject.opt("PackageName") != null) {
            this.mPackageName = jSONObject.getString("PackageName");
            this.mAgentClassName = jSONObject.getString("AgentClassName");
        }
    }

    public long getAccessoryID() {
        return this.mAccessoryID;
    }

    public String getAgentClassName() {
        return this.mAgentClassName;
    }

    public String getContainerID() {
        return this.mContainerID;
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    public String getPeerID() {
        return this.mPeerID;
    }

    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("PeerId", this.mPeerID);
        jSONObject.put("ContainerId", this.mContainerID);
        jSONObject.put("AccessoryId", this.mAccessoryID);
        jSONObject.put("PackageName", this.mPackageName);
        jSONObject.put("AgentClassName", this.mAgentClassName);
        return jSONObject;
    }

    public StreamSendEntity(String str, String str2, long j, String str3, String str4) {
        this.mPeerID = str;
        this.mContainerID = str2;
        this.mAccessoryID = j;
        this.mPackageName = str3;
        this.mAgentClassName = str4;
    }
}
