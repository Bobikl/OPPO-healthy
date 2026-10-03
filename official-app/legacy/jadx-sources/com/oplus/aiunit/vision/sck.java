package com.oplus.aiunit.vision;

import com.heytap.voiceassistant.sdk.tts.SpeechException;
import com.heytap.voiceassistant.sdk.tts.callback.ITtsListener;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\u0012\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0016J \u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/sck;", "Lcom/heytap/voiceassistant/sdk/tts/callback/ITtsListener;", "", "p0", "p1", "p2", "", "p3", "", "onBufferProgress", "onSpeakBegin", "Lcom/heytap/voiceassistant/sdk/tts/SpeechException;", "onCompleted", "onSpeakProgress", "onSpeakPaused", "onSpeakResumed", "<init>", "()V", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class sck implements ITtsListener {
    @Override // com.heytap.voiceassistant.sdk.tts.callback.ITtsListener
    public void onBufferProgress(int p0, int p1, int p2, @Nullable String p3) {
    }

    @Override // com.heytap.voiceassistant.sdk.tts.callback.ITtsListener
    public void onCompleted(@Nullable SpeechException p0) {
    }

    @Override // com.heytap.voiceassistant.sdk.tts.callback.ITtsListener
    public void onSpeakBegin() {
    }

    @Override // com.heytap.voiceassistant.sdk.tts.callback.ITtsListener
    public void onSpeakPaused() {
    }

    @Override // com.heytap.voiceassistant.sdk.tts.callback.ITtsListener
    public void onSpeakProgress(int p0, int p1, int p2) {
    }

    @Override // com.heytap.voiceassistant.sdk.tts.callback.ITtsListener
    public void onSpeakResumed() {
    }
}
