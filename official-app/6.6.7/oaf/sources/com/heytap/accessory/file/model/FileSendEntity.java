package com.heytap.accessory.file.model;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class FileSendEntity {
    private long mAccessoryID;
    private String mAgentClassName;
    private String mContainerID;
    private String mDestFilePath;
    private String mFileInfo;
    private String mFileName;
    private long mFileSize;
    private String mFileURI;
    private String mPackageName;
    private String mPeerID;
    private String mSrcFilePath;

    public FileSendEntity() {
    }

    public void fromJSON(Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject((String) obj);
        this.mSrcFilePath = jSONObject.getString("SourcePath");
        this.mDestFilePath = jSONObject.getString("DestinationPath");
        this.mPeerID = jSONObject.getString("PeerId");
        this.mContainerID = jSONObject.getString("ContainerId");
        this.mAccessoryID = jSONObject.getLong("AccessoryId");
        this.mFileSize = jSONObject.getLong("FileSize");
        this.mFileName = jSONObject.getString("FileName");
        this.mFileURI = jSONObject.getString("FileURI");
        if (jSONObject.has("PackageName")) {
            this.mPackageName = jSONObject.getString("PackageName");
            this.mAgentClassName = jSONObject.getString("AgentClassName");
        }
        if (jSONObject.has("FileInfo")) {
            this.mFileInfo = jSONObject.getString("FileInfo");
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

    public String getDestFilePath() {
        return this.mDestFilePath;
    }

    public String getFileInfo() {
        return this.mFileInfo;
    }

    public String getFileName() {
        return this.mFileName;
    }

    public long getFileSize() {
        return this.mFileSize;
    }

    public String getFileURI() {
        return this.mFileURI;
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    public String getPeerID() {
        return this.mPeerID;
    }

    public String getSrcFilePath() {
        return this.mSrcFilePath;
    }

    public void setFileInfo(String str) {
        this.mFileInfo = str;
    }

    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("SourcePath", this.mSrcFilePath);
        jSONObject.put("DestinationPath", this.mDestFilePath);
        jSONObject.put("PeerId", this.mPeerID);
        jSONObject.put("ContainerId", this.mContainerID);
        jSONObject.put("AccessoryId", this.mAccessoryID);
        jSONObject.put("FileSize", this.mFileSize);
        jSONObject.put("FileName", this.mFileName);
        jSONObject.put("FileURI", this.mFileURI);
        jSONObject.put("PackageName", this.mPackageName);
        jSONObject.put("AgentClassName", this.mAgentClassName);
        jSONObject.put("FileInfo", this.mFileInfo);
        return jSONObject;
    }

    public FileSendEntity(String str, String str2, String str3, String str4, String str5, long j, long j2, String str6, String str7, String str8, String str9) {
        this.mSrcFilePath = str;
        this.mDestFilePath = str2;
        this.mFileInfo = str3;
        this.mPeerID = str4;
        this.mContainerID = str5;
        this.mAccessoryID = j;
        this.mFileSize = j2;
        this.mFileName = str6;
        this.mFileURI = str7;
        this.mPackageName = str8;
        this.mAgentClassName = str9;
    }
}
