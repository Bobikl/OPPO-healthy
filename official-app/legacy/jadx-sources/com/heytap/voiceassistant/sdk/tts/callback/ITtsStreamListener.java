package com.heytap.voiceassistant.sdk.tts.callback;

import android.os.Bundle;
import com.heytap.voiceassistant.sdk.tts.SpeechException;
import com.heytap.voiceassistant.sdk.tts.audio.BufferParagraphInfo;

/* JADX INFO: loaded from: classes19.dex */
public interface ITtsStreamListener {
    void onCompleted(SpeechException speechException);

    void onEnd();

    void onEvent(int i, int i2, int i3, Bundle bundle);

    void onNextSliceStart(BufferParagraphInfo bufferParagraphInfo);

    void onSpeakBegin();

    void onSpeakPaused(int i);

    void onSpeakResumed(int i);
}
