package com.heytap.accessory.stream.model;

import com.heytap.speech.engine.constant.EngineConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class StreamReceiveEntity {
    private boolean mAccept;
    private long mConnectionId;
    private int mReason;
    private int mTransId;

    public StreamReceiveEntity() {
    }

    public void fromJSON(Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject((String) obj);
        this.mTransId = jSONObject.getInt("id");
        this.mAccept = jSONObject.getBoolean("accepted");
        this.mConnectionId = jSONObject.getLong("connectionId");
        if (jSONObject.has(EngineConstant.REASON)) {
            this.mReason = jSONObject.getInt(EngineConstant.REASON);
        }
    }

    public long getConnectionId() {
        return this.mConnectionId;
    }

    public int getTransId() {
        return this.mTransId;
    }

    public boolean isAccept() {
        return this.mAccept;
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.mTransId);
        jSONObject.put("connectionId", this.mConnectionId);
        jSONObject.put("accepted", this.mAccept);
        jSONObject.put(EngineConstant.REASON, this.mReason);
        return jSONObject;
    }

    public StreamReceiveEntity(long j2, int i, boolean z, int i2) {
        this.mConnectionId = j2;
        this.mTransId = i;
        this.mAccept = z;
        this.mReason = i2;
    }
}
