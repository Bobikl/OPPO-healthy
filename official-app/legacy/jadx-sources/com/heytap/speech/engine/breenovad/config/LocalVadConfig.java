package com.heytap.speech.engine.breenovad.config;

import android.text.TextUtils;
import com.heytap.speech.engine.breenovad.closure.b.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LocalVadConfig extends a {
    public static final String KEY_PAUSETIME = "pauseTime";
    public static final String KEY_RES_BIN_PATH = "resBinPath";
    public JSONObject jsonObject;
    private String resBinFile;
    private int pauseTime = 500;
    private boolean fullMode = false;
    private boolean isOpenLog = false;
    private int logLevel = 0;

    public int getLogLevel() {
        return this.logLevel;
    }

    public String getResBinPath() {
        return this.resBinFile;
    }

    public boolean isFullMode() {
        return this.fullMode;
    }

    public boolean isOpenLog() {
        return this.isOpenLog;
    }

    public void setFullMode(boolean z) {
        this.fullMode = z;
    }

    public void setLogLevel(int i) {
        this.logLevel = i;
    }

    public void setOpenLog(boolean z) {
        this.isOpenLog = z;
    }

    public void setPauseTime(int i) {
        this.pauseTime = i;
    }

    public void setResBinPath(String str) {
        this.resBinFile = str;
    }

    public JSONObject toJSON() {
        this.jsonObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.resBinFile)) {
                this.jsonObject.put(KEY_RES_BIN_PATH, this.resBinFile);
            }
            this.jsonObject.put(KEY_PAUSETIME, this.pauseTime);
            this.jsonObject.put("fullMode", this.fullMode ? 1 : 0);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return this.jsonObject;
    }

    public String toString() {
        return toJSON().toString();
    }
}
