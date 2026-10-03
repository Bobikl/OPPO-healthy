package com.sensorsdata.analytics.android.sdk.core.event;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Event {
    protected JSONObject mExtras;
    private JSONObject mLib;
    private String mProject;
    private JSONObject mProperties;
    private long mTime;
    private String mToken;
    private long mTrackId;
    private String mType;

    public JSONObject getExtras() {
        return this.mExtras;
    }

    public JSONObject getLib() {
        return this.mLib;
    }

    public String getProject() {
        return this.mProject;
    }

    public JSONObject getProperties() {
        return this.mProperties;
    }

    public long getTime() {
        long j2 = this.mTime;
        return j2 == 0 ? System.currentTimeMillis() : j2;
    }

    public String getToken() {
        return this.mToken;
    }

    public long getTrackId() {
        return this.mTrackId;
    }

    public String getType() {
        return this.mType;
    }

    public void setExtras(JSONObject jSONObject) {
        this.mExtras = jSONObject;
    }

    public void setLib(JSONObject jSONObject) {
        this.mLib = jSONObject;
    }

    public void setProject(String str) {
        this.mProject = str;
    }

    public void setProperties(JSONObject jSONObject) {
        this.mProperties = jSONObject;
    }

    public void setTime(long j2) {
        if (j2 > 0) {
            this.mTime = j2;
        } else {
            this.mTime = System.currentTimeMillis();
        }
    }

    public void setToken(String str) {
        this.mToken = str;
    }

    public void setTrackId(long j2) {
        this.mTrackId = j2;
    }

    public void setType(String str) {
        this.mType = str;
    }

    public abstract JSONObject toJSONObject();
}
