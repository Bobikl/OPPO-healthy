package com.heytap.voiceassistant.sdk.tts.callback;

/* JADX INFO: loaded from: classes19.dex */
public interface StreamTtsLifeCycleListener {
    public static final String TYPE_CACHE = "cache";
    public static final String TYPE_STREAM = "stream";

    void notifyAudioSize(String str, String str2);

    void notifyTtsProvider(String str, String str2);

    void notifyTtsSid(String str, String str2);

    void onConnectStart(String str, long j2);

    void onConnectionSuccess(String str, long j2);

    void onError(String str, int i, String str2);

    void onFinalFrame(String str, long j2);

    void onFirstAudioFrame(String str, long j2, String str2);

    void onSendStartFrame(String str, long j2);
}
