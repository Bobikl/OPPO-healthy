package com.heytap.speech.engine.breenovad.params;

import com.heytap.speech.engine.breenovad.closure.c.a;
import com.oplus.aiunit.vision.t7b;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class VadParams extends a {
    public static int BEGIN_AND_END = 0;
    public static int DETECT_END = 1;
    public static final String KEY_PAUSE_TIME = "pause_time";
    private static final String TAG = "VadParams";
    public JSONObject jsonObject;
    private String paramsObject;
    private boolean isVadEnable = true;
    private int mode = BEGIN_AND_END;

    public static int getPauseTime(String str) {
        try {
            return new JSONObject(str).optInt(KEY_PAUSE_TIME);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public void changeParamsPauseTime(int i) {
        try {
            JSONObject jSONObject = new JSONObject(this.paramsObject);
            jSONObject.put(KEY_PAUSE_TIME, i);
            this.paramsObject = jSONObject.toString();
            t7b.INSTANCE.b(TAG, "params=" + this.paramsObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public int getMode() {
        return this.mode;
    }

    public String getParamsObject() {
        return this.paramsObject;
    }

    public boolean isVadEnable() {
        return this.isVadEnable;
    }

    public void setMode(int i) {
        this.mode = i;
    }

    public void setParamsObject(String str) {
        this.paramsObject = str;
    }

    public void setVadEnable(boolean z) {
        this.isVadEnable = z;
    }
}
