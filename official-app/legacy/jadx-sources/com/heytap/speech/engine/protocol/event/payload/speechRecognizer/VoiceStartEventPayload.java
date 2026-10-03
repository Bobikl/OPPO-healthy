package com.heytap.speech.engine.protocol.event.payload.speechRecognizer;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00010B/\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b-\u0010.J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J;\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\"\u0010\u001c\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010#\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010)\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0015\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010,¨\u00061"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/speechRecognizer/VoiceStartEventPayload;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "", "component1", "component2", "component3", "component4", "component5", "audioType", SpeechConstant.KEY_SAMPLE_RATE_TO_REMOTE, "channel", "sampleBytes", "aiType", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getAudioType", "()Ljava/lang/String;", "getSampleRate", "getChannel", "getSampleBytes", "getAiType", "frameSize", "I", "getFrameSize", "()I", "setFrameSize", "(I)V", "Lcom/heytap/speech/engine/protocol/event/payload/speechRecognizer/Wakeup;", "wakeup", "Lcom/heytap/speech/engine/protocol/event/payload/speechRecognizer/Wakeup;", "getWakeup", "()Lcom/heytap/speech/engine/protocol/event/payload/speechRecognizer/Wakeup;", "setWakeup", "(Lcom/heytap/speech/engine/protocol/event/payload/speechRecognizer/Wakeup;)V", "opusVersion", "getOpusVersion", "setOpusVersion", "(Ljava/lang/String;)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class VoiceStartEventPayload extends Payload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.2";

    @NotNull
    private final String aiType;

    @NotNull
    private final String audioType;

    @NotNull
    private final String channel;
    private int frameSize;

    @Nullable
    private String opusVersion;

    @NotNull
    private final String sampleBytes;

    @NotNull
    private final String sampleRate;

    @Nullable
    private Wakeup wakeup;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.event.payload.speechRecognizer.VoiceStartEventPayload$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/speechRecognizer/VoiceStartEventPayload$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return VoiceStartEventPayload.VERSION;
        }
    }

    public VoiceStartEventPayload(@NotNull String audioType, @NotNull String sampleRate, @NotNull String channel, @NotNull String sampleBytes, @NotNull String aiType) {
        Intrinsics.checkNotNullParameter(audioType, "audioType");
        Intrinsics.checkNotNullParameter(sampleRate, "sampleRate");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(sampleBytes, "sampleBytes");
        Intrinsics.checkNotNullParameter(aiType, "aiType");
        this.audioType = audioType;
        this.sampleRate = sampleRate;
        this.channel = channel;
        this.sampleBytes = sampleBytes;
        this.aiType = aiType;
        this.frameSize = 320;
    }

    public static /* synthetic */ VoiceStartEventPayload copy$default(VoiceStartEventPayload voiceStartEventPayload, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceStartEventPayload.audioType;
        }
        if ((i & 2) != 0) {
            str2 = voiceStartEventPayload.sampleRate;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = voiceStartEventPayload.channel;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = voiceStartEventPayload.sampleBytes;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = voiceStartEventPayload.aiType;
        }
        return voiceStartEventPayload.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAudioType() {
        return this.audioType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSampleRate() {
        return this.sampleRate;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSampleBytes() {
        return this.sampleBytes;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAiType() {
        return this.aiType;
    }

    @NotNull
    public final VoiceStartEventPayload copy(@NotNull String audioType, @NotNull String sampleRate, @NotNull String channel, @NotNull String sampleBytes, @NotNull String aiType) {
        Intrinsics.checkNotNullParameter(audioType, "audioType");
        Intrinsics.checkNotNullParameter(sampleRate, "sampleRate");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(sampleBytes, "sampleBytes");
        Intrinsics.checkNotNullParameter(aiType, "aiType");
        return new VoiceStartEventPayload(audioType, sampleRate, channel, sampleBytes, aiType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceStartEventPayload)) {
            return false;
        }
        VoiceStartEventPayload voiceStartEventPayload = (VoiceStartEventPayload) other;
        return Intrinsics.areEqual(this.audioType, voiceStartEventPayload.audioType) && Intrinsics.areEqual(this.sampleRate, voiceStartEventPayload.sampleRate) && Intrinsics.areEqual(this.channel, voiceStartEventPayload.channel) && Intrinsics.areEqual(this.sampleBytes, voiceStartEventPayload.sampleBytes) && Intrinsics.areEqual(this.aiType, voiceStartEventPayload.aiType);
    }

    @NotNull
    public final String getAiType() {
        return this.aiType;
    }

    @NotNull
    public final String getAudioType() {
        return this.audioType;
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    public final int getFrameSize() {
        return this.frameSize;
    }

    @Nullable
    public final String getOpusVersion() {
        return this.opusVersion;
    }

    @NotNull
    public final String getSampleBytes() {
        return this.sampleBytes;
    }

    @NotNull
    public final String getSampleRate() {
        return this.sampleRate;
    }

    @Nullable
    public final Wakeup getWakeup() {
        return this.wakeup;
    }

    public int hashCode() {
        return (((((((this.audioType.hashCode() * 31) + this.sampleRate.hashCode()) * 31) + this.channel.hashCode()) * 31) + this.sampleBytes.hashCode()) * 31) + this.aiType.hashCode();
    }

    public final void setFrameSize(int i) {
        this.frameSize = i;
    }

    public final void setOpusVersion(@Nullable String str) {
        this.opusVersion = str;
    }

    public final void setWakeup(@Nullable Wakeup wakeup) {
        this.wakeup = wakeup;
    }

    @NotNull
    public String toString() {
        return "VoiceStartEventPayload(audioType=" + this.audioType + ", sampleRate=" + this.sampleRate + ", channel=" + this.channel + ", sampleBytes=" + this.sampleBytes + ", aiType=" + this.aiType + ')';
    }
}
