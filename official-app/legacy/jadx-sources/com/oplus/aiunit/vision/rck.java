package com.oplus.aiunit.vision;

import com.heytap.voiceassistant.sdk.tts.callback.TtsLifeCycleListener;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J$\u0010\u000b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J$\u0010\u000e\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u000f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0010\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0011\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/rck;", "Lcom/heytap/voiceassistant/sdk/tts/callback/TtsLifeCycleListener;", "", "p0", "", "p1", "", "onConnectStart", "onConnectionSuccess", "onSendTtsText", "p2", "onFirstAudioFrame", "onLastAudioFrame", "", "onError", "notifyAudioSize", "notifyTtsProvider", "notifyTtsSid", "<init>", "()V", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0})
public final class rck implements TtsLifeCycleListener {
    @Override // com.heytap.voiceassistant.sdk.tts.callback.TtsLifeCycleListener
    public void notifyAudioSize(@Nullable String p0, @Nullable String p1) {
    }

    @Override // com.heytap.voiceassistant.sdk.tts.callback.TtsLifeCycleListener
    public void notifyTtsProvider(@Nullable String p0, @Nullable String p1) {
    }

    @Override // com.heytap.voiceassistant.sdk.tts.callback.TtsLifeCycleListener
    public void notifyTtsSid(@Nullable String p0, @Nullable String p1) {
    }

    @Override // com.heytap.voiceassistant.sdk.tts.callback.TtsLifeCycleListener
    public void onConnectStart(@Nullable String p0, long p1) {
    }

    @Override // com.heytap.voiceassistant.sdk.tts.callback.TtsLifeCycleListener
    public void onConnectionSuccess(@Nullable String p0, long p1) {
    }

    @Override // com.heytap.voiceassistant.sdk.tts.callback.TtsLifeCycleListener
    public void onError(@Nullable String p0, int p1, @Nullable String p2) {
    }

    @Override // com.heytap.voiceassistant.sdk.tts.callback.TtsLifeCycleListener
    public void onFirstAudioFrame(@Nullable String p0, long p1, @Nullable String p2) {
    }

    @Override // com.heytap.voiceassistant.sdk.tts.callback.TtsLifeCycleListener
    public void onLastAudioFrame(@Nullable String p0, long p1) {
    }

    @Override // com.heytap.voiceassistant.sdk.tts.callback.TtsLifeCycleListener
    public void onSendTtsText(@Nullable String p0, long p1) {
    }
}
