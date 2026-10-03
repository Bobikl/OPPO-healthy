package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class edm {
    public final String a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10894c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10895e;
    public final int f;
    public final String g;

    public edm(String str, String str2, String str3, long j2, boolean z, int i, String str4) {
        this.a = str;
        this.b = str2;
        this.f10894c = str3;
        this.d = j2;
        this.f10895e = z;
        this.f = i;
        this.g = str4;
    }

    public static edm a(@NonNull String str) {
        JSONObject jSONObject = new JSONObject(str);
        return new edm(jSONObject.optString(SpeechConstant.KEY_APP_VERSION), jSONObject.optString("appPackage"), jSONObject.optString(Fields.SDK_VERSION), jSONObject.getLong(SpeechConstant.KEY_TTS_TIMESTAMP), jSONObject.getBoolean("valid"), jSONObject.getInt("errorCode"), jSONObject.optString("errorMessage"));
    }

    public final JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(SpeechConstant.KEY_APP_VERSION, this.a);
        jSONObject.putOpt("appPackage", this.b);
        jSONObject.putOpt(Fields.SDK_VERSION, this.f10894c);
        jSONObject.putOpt(SpeechConstant.KEY_TTS_TIMESTAMP, Long.valueOf(this.d));
        jSONObject.putOpt("valid", Boolean.valueOf(this.f10895e));
        jSONObject.putOpt("errorCode", Integer.valueOf(this.f));
        jSONObject.putOpt("errorMessage", this.g);
        return jSONObject;
    }
}
