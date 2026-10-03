package com.heytap.speech.engine.protocol.directive.speechsynthesizer;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.constant.EngineConstant;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\"\u0010#R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/speechsynthesizer/OutputSpeech;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "text", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", ClickApiEntity.SET_TEXT, "(Ljava/lang/String;)V", "type", "getType", "setType", EngineConstant.TTS_TYPE_SSML, "getSsml", "setSsml", "emotion", "getEmotion", "setEmotion", EngineConstant.TTS_TIMBRE, "getTimbre", "setTimbre", "language", "getLanguage", "setLanguage", "userTimbre", "getUserTimbre", "setUserTimbre", "", "newAi", "Z", "getNewAi", "()Z", "setNewAi", "(Z)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class OutputSpeech extends DirectivePayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.0";

    @JsonProperty("emotion")
    @Nullable
    private String emotion;

    @JsonProperty("language")
    @Nullable
    private String language;
    private boolean newAi;

    @JsonProperty(EngineConstant.TTS_TYPE_SSML)
    @Nullable
    private String ssml;

    @JsonProperty("text")
    @Nullable
    private String text;

    @JsonProperty(EngineConstant.TTS_TIMBRE)
    @Nullable
    private String timbre;

    @JsonProperty("type")
    @Nullable
    private String type;

    @JsonProperty("userTimbre")
    @Nullable
    private String userTimbre;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.directive.speechsynthesizer.OutputSpeech$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/speechsynthesizer/OutputSpeech$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return OutputSpeech.VERSION;
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

    public final boolean getNewAi() {
        return this.newAi;
    }

    @Nullable
    public final String getSsml() {
        return this.ssml;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final String getTimbre() {
        return this.timbre;
    }

    @Nullable
    public final String getType() {
        return this.type;
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

    public final void setNewAi(boolean z) {
        this.newAi = z;
    }

    public final void setSsml(@Nullable String str) {
        this.ssml = str;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    public final void setTimbre(@Nullable String str) {
        this.timbre = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setUserTimbre(@Nullable String str) {
        this.userTimbre = str;
    }
}
