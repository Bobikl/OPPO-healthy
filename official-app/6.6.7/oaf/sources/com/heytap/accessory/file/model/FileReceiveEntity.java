package com.heytap.accessory.file.model;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class FileReceiveEntity {
    private boolean mAccept;
    private long mConnectionId;
    private String mFileURI;
    private int mId;
    private String mPath;

    public FileReceiveEntity() {
    }

    public void fromJSON(Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject((String) obj);
        this.mId = jSONObject.getInt("id");
        this.mPath = jSONObject.getString("path");
        this.mFileURI = jSONObject.getString("fileuri");
        this.mAccept = jSONObject.getBoolean("accepted");
        this.mConnectionId = jSONObject.getLong("connectionId");
    }

    public long getConnectionId() {
        return this.mConnectionId;
    }

    public String getFileUri() {
        return this.mFileURI;
    }

    public int getId() {
        return this.mId;
    }

    public String getPath() {
        return this.mPath;
    }

    public boolean isAccept() {
        return this.mAccept;
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.mId);
        jSONObject.put("path", this.mPath);
        jSONObject.put("fileuri", this.mFileURI);
        jSONObject.put("accepted", this.mAccept);
        jSONObject.put("connectionId", this.mConnectionId);
        return jSONObject;
    }

    public FileReceiveEntity(long j, int i, String str, String str2, boolean z) {
        this.mConnectionId = j;
        this.mId = i;
        this.mPath = str;
        this.mAccept = z;
        this.mFileURI = str2;
    }
}
