package com.heytap.accessory.stream.model;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class TransferCompleteMsg {
    private long mConnectionId;
    private int mTransactionId;

    public TransferCompleteMsg() {
        this.mConnectionId = 0L;
        this.mTransactionId = 0;
    }

    public void fromJSON(Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject((String) obj);
        this.mConnectionId = jSONObject.getLong("connectionId");
        this.mTransactionId = jSONObject.getInt("transactionId");
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
        jSONObject.put("transactionId", this.mTransactionId);
        return jSONObject;
    }

    public TransferCompleteMsg(long j, int i) {
        this.mConnectionId = j;
        this.mTransactionId = i;
    }
}
