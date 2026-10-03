package com.heytap.log.uploader;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class ResponseWrapper {
    private String TAG;
    private String message;
    private String reportId;
    private int statusCode;

    public ResponseWrapper(int i) {
        this.TAG = getClass().getSimpleName();
        this.statusCode = i;
    }

    public String getMessage() {
        return this.message;
    }

    public String getReportId() {
        String str = this.reportId;
        return str == null ? "" : str;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String parseReportId() {
        try {
            this.reportId = new JSONObject(this.message).getJSONObject("data").optString("reportId");
        } catch (JSONException e2) {
            Log.e(this.TAG, "json exception:" + e2.toString());
        }
        return this.reportId;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public ResponseWrapper(int i, String str) {
        this.TAG = getClass().getSimpleName();
        this.statusCode = i;
        this.message = str;
        this.reportId = parseReportId();
    }
}
