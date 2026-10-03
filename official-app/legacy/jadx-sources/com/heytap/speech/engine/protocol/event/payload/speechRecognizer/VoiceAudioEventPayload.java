package com.heytap.speech.engine.protocol.event.payload.speechRecognizer;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/speechRecognizer/VoiceAudioEventPayload;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "", "component1", "audioStream", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getAudioStream", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class VoiceAudioEventPayload extends Payload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.0";

    @NotNull
    private final String audioStream;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.event.payload.speechRecognizer.VoiceAudioEventPayload$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/speechRecognizer/VoiceAudioEventPayload$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return VoiceAudioEventPayload.VERSION;
        }
    }

    public VoiceAudioEventPayload(@NotNull String audioStream) {
        Intrinsics.checkNotNullParameter(audioStream, "audioStream");
        this.audioStream = audioStream;
    }

    public static /* synthetic */ VoiceAudioEventPayload copy$default(VoiceAudioEventPayload voiceAudioEventPayload, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceAudioEventPayload.audioStream;
        }
        return voiceAudioEventPayload.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAudioStream() {
        return this.audioStream;
    }

    @NotNull
    public final VoiceAudioEventPayload copy(@NotNull String audioStream) {
        Intrinsics.checkNotNullParameter(audioStream, "audioStream");
        return new VoiceAudioEventPayload(audioStream);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VoiceAudioEventPayload) && Intrinsics.areEqual(this.audioStream, ((VoiceAudioEventPayload) other).audioStream);
    }

    @NotNull
    public final String getAudioStream() {
        return this.audioStream;
    }

    public int hashCode() {
        return this.audioStream.hashCode();
    }

    @NotNull
    public String toString() {
        return "VoiceAudioEventPayload(audioStream=" + this.audioStream + ')';
    }
}
