package com.heytap.voiceassistant.sdk.tts.closure.b;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class c {
    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return "INIT";
        }
        if (i == 2) {
            return "BUFFERING";
        }
        if (i == 3) {
            return "PLAYING";
        }
        if (i == 4) {
            return "PAUSED";
        }
        return i == 5 ? "STOPPED" : "null";
    }
}
