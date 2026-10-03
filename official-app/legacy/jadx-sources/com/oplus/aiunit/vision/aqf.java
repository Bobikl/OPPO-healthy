package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;

/* JADX INFO: loaded from: classes18.dex */
public class aqf {

    @SerializedName("appPackage")
    String a;

    @SerializedName(SpeechConstant.KEY_APP_VERSION)
    int b;

    public String a() {
        return this.a;
    }

    public void b(String str) {
        this.a = str;
    }

    public void c(int i) {
        this.b = i;
    }

    public String toString() {
        return "ReqAppOpenSourceStatement{appPackage='" + this.a + "', appVersion=" + this.b + '}';
    }
}
