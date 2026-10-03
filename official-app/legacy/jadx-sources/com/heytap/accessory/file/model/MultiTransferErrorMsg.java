package com.heytap.accessory.file.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class MultiTransferErrorMsg {
    private int mErrorCode;
    private String mErrorMsg;
    private int[] mTransactionIds;

    public MultiTransferErrorMsg() {
        this.mTransactionIds = null;
        this.mErrorCode = -1;
        this.mErrorMsg = "";
    }

    public void fromJSON(Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject((String) obj);
        JSONArray jSONArray = jSONObject.getJSONArray("id");
        this.mErrorCode = jSONObject.getInt("errorCode");
        this.mErrorMsg = jSONObject.getString("errorMsg");
        this.mTransactionIds = new int[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            this.mTransactionIds[i] = jSONArray.getInt(i);
        }
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public String getErrorMsg() {
        return this.mErrorMsg;
    }

    public int[] getTransactionIds() {
        return this.mTransactionIds;
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (int i : this.mTransactionIds) {
            jSONArray.put(i);
        }
        jSONObject.put("id", jSONArray);
        jSONObject.put("errorCode", this.mErrorCode);
        jSONObject.put("errorMsg", this.mErrorMsg);
        return jSONObject;
    }

    public MultiTransferErrorMsg(int[] iArr, int i, String str) {
        this.mTransactionIds = iArr;
        this.mErrorCode = i;
        this.mErrorMsg = str;
    }
}
