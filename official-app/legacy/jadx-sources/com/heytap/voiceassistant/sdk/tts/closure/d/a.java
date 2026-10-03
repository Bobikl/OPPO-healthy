package com.heytap.voiceassistant.sdk.tts.closure.d;

import android.util.Log;
import com.heytap.voiceassistant.sdk.tts.monitor.LogHook;

/* JADX INFO: loaded from: classes19.dex */
public class a implements LogHook {
    @Override // com.heytap.voiceassistant.sdk.tts.monitor.LogHook
    public void d(String str, String str2) {
        Log.d(str, str2);
    }

    @Override // com.heytap.voiceassistant.sdk.tts.monitor.LogHook
    public void e(String str, String str2) {
        Log.e(str, str2);
    }

    @Override // com.heytap.voiceassistant.sdk.tts.monitor.LogHook
    public void i(String str, String str2) {
        Log.i(str, str2);
    }

    @Override // com.heytap.voiceassistant.sdk.tts.monitor.LogHook
    public void print(String str, String str2) {
        Log.i(str, str2);
    }

    @Override // com.heytap.voiceassistant.sdk.tts.monitor.LogHook
    public void v(String str, String str2) {
        Log.v(str, str2);
    }

    @Override // com.heytap.voiceassistant.sdk.tts.monitor.LogHook
    public void w(String str, String str2) {
        Log.i(str, str2);
    }

    @Override // com.heytap.voiceassistant.sdk.tts.monitor.LogHook
    public void e(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }

    @Override // com.heytap.voiceassistant.sdk.tts.monitor.LogHook
    public void w(String str, String str2, Throwable th) {
        Log.w(str, str2, th);
    }
}
