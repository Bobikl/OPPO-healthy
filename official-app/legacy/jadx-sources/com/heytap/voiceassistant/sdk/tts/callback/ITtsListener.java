package com.heytap.voiceassistant.sdk.tts.callback;

import android.os.Bundle;
import com.heytap.voiceassistant.sdk.tts.SpeechException;

/* JADX INFO: loaded from: classes19.dex */
public interface ITtsListener {
    void onBufferProgress(int i, int i2, int i3, String str);

    void onCompleted(SpeechException speechException);

    void onEnd();

    void onEvent(int i, int i2, int i3, Bundle bundle);

    void onSpeakBegin();

    void onSpeakPaused();

    void onSpeakProgress(int i, int i2, int i3);

    void onSpeakResumed();
}
