package com.heytap.speech.engine.protocol.event.payload.aicall;

import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/aicall/CallDialogInfo;", "", "()V", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", TypedValues.CycleType.S_WAVE_OFFSET, "", "getOffset", "()Ljava/lang/Double;", "setOffset", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", SpeechConstant.KEY_RECORD_ID, "getRecordId", "setRecordId", "type", "", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CallDialogInfo {

    @Nullable
    private String content;

    @Nullable
    private Double offset;

    @Nullable
    private String recordId;

    @Nullable
    private Integer type;

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final Double getOffset() {
        return this.offset;
    }

    @Nullable
    public final String getRecordId() {
        return this.recordId;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setOffset(@Nullable Double d) {
        this.offset = d;
    }

    public final void setRecordId(@Nullable String str) {
        this.recordId = str;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }
}
