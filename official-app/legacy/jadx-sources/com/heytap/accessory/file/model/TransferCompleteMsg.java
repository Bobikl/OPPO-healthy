package com.heytap.accessory.file.model;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class TransferCompleteMsg {
    private long mConnectionId;
    private String mDestPath;
    private long mFileSize;
    private String mSrcPath;
    private int mTransactionId;

    public TransferCompleteMsg() {
        this.mConnectionId = 0L;
        this.mTransactionId = 0;
        this.mSrcPath = "";
        this.mDestPath = "";
        this.mFileSize = 0L;
    }

    public void fromJSON(Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject((String) obj);
        this.mConnectionId = jSONObject.getLong("connectionId");
        this.mTransactionId = jSONObject.getInt("transactionId");
        this.mSrcPath = jSONObject.getString(Constant.SOURCE_PATH);
        this.mDestPath = jSONObject.getString(Constant.DEST_PATH);
        if (jSONObject.has(Constant.FILE_SIZE)) {
            this.mFileSize = jSONObject.getLong(Constant.FILE_SIZE);
        }
    }

    public long getConnectionId() {
        return this.mConnectionId;
    }

    public String getDestPath() {
        return this.mDestPath;
    }

    public long getFileSize() {
        return this.mFileSize;
    }

    public String getSourcePath() {
        return this.mSrcPath;
    }

    public int getTransactionId() {
        return this.mTransactionId;
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("connectionId", this.mConnectionId);
        jSONObject.put("transactionId", this.mTransactionId);
        jSONObject.put(Constant.SOURCE_PATH, this.mSrcPath);
        jSONObject.put(Constant.DEST_PATH, this.mDestPath);
        jSONObject.put(Constant.FILE_SIZE, this.mFileSize);
        return jSONObject;
    }

    public TransferCompleteMsg(long j2, int i, String str, String str2, long j3) {
        this.mConnectionId = j2;
        this.mTransactionId = i;
        this.mSrcPath = str;
        this.mDestPath = str2;
        this.mFileSize = j3;
    }
}
