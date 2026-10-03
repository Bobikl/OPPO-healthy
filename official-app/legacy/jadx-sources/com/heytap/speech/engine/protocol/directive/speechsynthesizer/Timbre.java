package com.heytap.speech.engine.protocol.directive.speechsynthesizer;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.constant.EngineConstant;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/speechsynthesizer/Timbre;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "emotion", "Ljava/lang/String;", "getEmotion", "()Ljava/lang/String;", "setEmotion", "(Ljava/lang/String;)V", EngineConstant.TTS_TIMBRE, "getTimbre", "setTimbre", "language", "getLanguage", "setLanguage", "userTimbre", "getUserTimbre", "setUserTimbre", SpeechConstant.KEY_TTS_SPOKEN, "getSpoken", "setSpoken", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class Timbre extends DirectivePayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.1";

    @JsonProperty("emotion")
    @Nullable
    private String emotion;

    @JsonProperty("language")
    @Nullable
    private String language;

    @Nullable
    private String spoken;

    @JsonProperty(EngineConstant.TTS_TIMBRE)
    @Nullable
    private String timbre;

    @JsonProperty("userTimbre")
    @Nullable
    private String userTimbre;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.directive.speechsynthesizer.Timbre$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/speechsynthesizer/Timbre$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return Timbre.VERSION;
        }
    }

    @Nullable
    public final String getEmotion() {
        return this.emotion;
    }

    @Nullable
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    public final String getSpoken() {
        return this.spoken;
    }

    @Nullable
    public final String getTimbre() {
        return this.timbre;
    }

    @Nullable
    public final String getUserTimbre() {
        return this.userTimbre;
    }

    public final void setEmotion(@Nullable String str) {
        this.emotion = str;
    }

    public final void setLanguage(@Nullable String str) {
        this.language = str;
    }

    public final void setSpoken(@Nullable String str) {
        this.spoken = str;
    }

    public final void setTimbre(@Nullable String str) {
        this.timbre = str;
    }

    public final void setUserTimbre(@Nullable String str) {
        this.userTimbre = str;
    }
}
