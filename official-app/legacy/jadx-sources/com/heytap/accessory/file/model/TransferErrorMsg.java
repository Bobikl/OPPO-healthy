package com.heytap.accessory.file.model;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class TransferErrorMsg {
    private long mConnectionId;
    private int mErrorCode;
    private String mErrorMsg;
    private int mTransactionId;

    public TransferErrorMsg() {
        this.mConnectionId = -1L;
        this.mTransactionId = -1;
        this.mErrorCode = -1;
        this.mErrorMsg = "";
    }

    public void fromJSON(Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject((String) obj);
        this.mConnectionId = jSONObject.getLong("connectionId");
        this.mTransactionId = jSONObject.getInt("transactionId");
        this.mErrorCode = jSONObject.getInt("errorCode");
        this.mErrorMsg = jSONObject.getString("errorMsg");
    }

    public long getConnectionId() {
        return this.mConnectionId;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public String getErrorMsg() {
        return this.mErrorMsg;
    }

    public int getTransactionId() {
        return this.mTransactionId;
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("connectionId", this.mConnectionId);
        jSONObject.put("transactionId", this.mTransactionId);
        jSONObject.put("errorCode", this.mErrorCode);
        jSONObject.put("errorMsg", this.mErrorMsg);
        return jSONObject;
    }

    public TransferErrorMsg(long j2, int i, int i2, String str) {
        this.mConnectionId = j2;
        this.mTransactionId = i;
        this.mErrorCode = i2;
        this.mErrorMsg = str;
    }
}
