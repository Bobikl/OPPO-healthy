package com.heytap.speech.engine.protocol.event.payload.speechRecognizer;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.heytap.speech.engine.constant.EngineConstant;
import com.heytap.speech.engine.protocol.event.Payload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0013\u0010\b\"\u0004\b\u0014\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/speechRecognizer/Wakeup;", "Lcom/heytap/speech/engine/protocol/event/Payload;", EngineConstant.WORD, "", "(Ljava/lang/String;)V", "confidence", "", "getConfidence", "()Ljava/lang/Double;", "setConfidence", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", TypedValues.CycleType.S_WAVE_OFFSET, "Ljava/lang/Integer;", "getOffset", "()Ljava/lang/Integer;", "setOffset", "(Ljava/lang/Integer;)V", "voicePrints", "getVoicePrints", "setVoicePrints", "getWord", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Wakeup extends Payload {

    @Nullable
    private Double confidence;

    @Nullable
    private Integer offset;

    @Nullable
    private Double voicePrints;

    @Nullable
    private final String word;

    public Wakeup(@Nullable String str) {
        this.word = str;
    }

    public static /* synthetic */ Wakeup copy$default(Wakeup wakeup, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wakeup.word;
        }
        return wakeup.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWord() {
        return this.word;
    }

    @NotNull
    public final Wakeup copy(@Nullable String word) {
        return new Wakeup(word);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Wakeup) && Intrinsics.areEqual(this.word, ((Wakeup) other).word);
    }

    @Nullable
    public final Double getConfidence() {
        return this.confidence;
    }

    @Nullable
    public final Integer getOffset() {
        return this.offset;
    }

    @Nullable
    public final Double getVoicePrints() {
        return this.voicePrints;
    }

    @Nullable
    public final String getWord() {
        return this.word;
    }

    public int hashCode() {
        String str = this.word;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setConfidence(@Nullable Double d) {
        this.confidence = d;
    }

    public final void setOffset(@Nullable Integer num) {
        this.offset = num;
    }

    public final void setVoicePrints(@Nullable Double d) {
        this.voicePrints = d;
    }

    @NotNull
    public String toString() {
        return "Wakeup(word=" + ((Object) this.word) + ')';
    }
}
