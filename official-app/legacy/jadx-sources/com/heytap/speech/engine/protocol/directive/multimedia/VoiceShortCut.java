package com.heytap.speech.engine.protocol.directive.multimedia;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/multimedia/VoiceShortCut;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "musicType", "Ljava/lang/String;", "getMusicType", "()Ljava/lang/String;", "setMusicType", "(Ljava/lang/String;)V", "intent", "getIntent", "setIntent", "speak", "getSpeak", "setSpeak", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class VoiceShortCut extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String intent;

    @Nullable
    private String musicType;

    @Nullable
    private String speak;

    @Nullable
    public final String getIntent() {
        return this.intent;
    }

    @Nullable
    public final String getMusicType() {
        return this.musicType;
    }

    @Nullable
    public final String getSpeak() {
        return this.speak;
    }

    public final void setIntent(@Nullable String str) {
        this.intent = str;
    }

    public final void setMusicType(@Nullable String str) {
        this.musicType = str;
    }

    public final void setSpeak(@Nullable String str) {
        this.speak = str;
    }
}
