package com.heytap.accessory.file.model;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class TransferProgress {
    private long mConnectionId;
    private long mProgress;
    private int mTransactionId;

    public TransferProgress() {
        this.mConnectionId = -1L;
        this.mTransactionId = -1;
        this.mProgress = 0L;
    }

    public void fromJSON(Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject((String) obj);
        this.mConnectionId = jSONObject.getLong("connectionId");
        this.mTransactionId = jSONObject.getInt("transactionId");
        this.mProgress = jSONObject.getLong("progress");
    }

    public long getConnectionId() {
        return this.mConnectionId;
    }

    public long getProgress() {
        return this.mProgress;
    }

    public int getTransactionId() {
        return this.mTransactionId;
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("connectionId", this.mConnectionId);
        jSONObject.put("transactionId", this.mTransactionId);
        jSONObject.put("progress", this.mProgress);
        return jSONObject;
    }

    public TransferProgress(long j2, int i, long j3) {
        this.mConnectionId = j2;
        this.mTransactionId = i;
        this.mProgress = j3;
    }
}
