package com.oplus.aiunit.vision;

import com.heytap.voiceassistant.sdk.tts.SpeechException;
import com.heytap.voiceassistant.sdk.tts.audio.BufferParagraphInfo;
import com.heytap.voiceassistant.sdk.tts.callback.ITtsStreamListener;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/tck;", "Lcom/heytap/voiceassistant/sdk/tts/callback/ITtsStreamListener;", "", "onSpeakBegin", "Lcom/heytap/voiceassistant/sdk/tts/SpeechException;", MapSchema.FIELD_NAME_ENTRY, "onCompleted", "", "p0", "onSpeakPaused", "onSpeakResumed", "Lcom/heytap/voiceassistant/sdk/tts/audio/BufferParagraphInfo;", "onNextSliceStart", "<init>", "()V", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class tck implements ITtsStreamListener {
    @Override // com.heytap.voiceassistant.sdk.tts.callback.ITtsStreamListener
    public void onCompleted(@Nullable SpeechException e2) {
    }

    @Override // com.heytap.voiceassistant.sdk.tts.callback.ITtsStreamListener
    public void onNextSliceStart(@Nullable BufferParagraphInfo p0) {
    }

    @Override // com.heytap.voiceassistant.sdk.tts.callback.ITtsStreamListener
    public void onSpeakBegin() {
    }

    @Override // com.heytap.voiceassistant.sdk.tts.callback.ITtsStreamListener
    public void onSpeakPaused(int p0) {
    }

    @Override // com.heytap.voiceassistant.sdk.tts.callback.ITtsStreamListener
    public void onSpeakResumed(int p0) {
    }
}
