package com.heytap.speech.engine.protocol.event.payload.speechRecognizer;

import androidx.annotation.Keep;
import com.heytap.speech.engine.constant.EngineConstant;
import com.heytap.speech.engine.protocol.event.Payload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/speechRecognizer/VoiceCompleteEventPayload;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "", "component1", EngineConstant.REASON, "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class VoiceCompleteEventPayload extends Payload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private final String reason;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.event.payload.speechRecognizer.VoiceCompleteEventPayload$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/speechRecognizer/VoiceCompleteEventPayload$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return VoiceCompleteEventPayload.VERSION;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VoiceCompleteEventPayload() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ VoiceCompleteEventPayload copy$default(VoiceCompleteEventPayload voiceCompleteEventPayload, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceCompleteEventPayload.reason;
        }
        return voiceCompleteEventPayload.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    public final VoiceCompleteEventPayload copy(@Nullable String reason) {
        return new VoiceCompleteEventPayload(reason);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VoiceCompleteEventPayload) && Intrinsics.areEqual(this.reason, ((VoiceCompleteEventPayload) other).reason);
    }

    @Nullable
    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        String str = this.reason;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return "VoiceCompleteEventPayload(reason=" + ((Object) this.reason) + ')';
    }

    public VoiceCompleteEventPayload(@Nullable String str) {
        this.reason = str;
    }

    public /* synthetic */ VoiceCompleteEventPayload(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
