package com.heytap.accessory.file.model;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class CancelFileRequest {
    private long mConnectionId;
    private int mTransactionId;

    public CancelFileRequest() {
    }

    public void fromJSON(Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject((String) obj);
        this.mConnectionId = jSONObject.getLong("connectionId");
        this.mTransactionId = jSONObject.getInt("TransactionId");
    }

    public long getConnectionId() {
        return this.mConnectionId;
    }

    public int getTransactionId() {
        return this.mTransactionId;
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("connectionId", this.mConnectionId);
        jSONObject.put("TransactionId", this.mTransactionId);
        return jSONObject;
    }

    public CancelFileRequest(long j2, int i) {
        this.mConnectionId = j2;
        this.mTransactionId = i;
    }
}
