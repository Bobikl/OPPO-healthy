package com.heytap.speech.engine.protocol.directive.tone;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/tone/SwitchTone;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "tone", "Ljava/lang/String;", "getTone", "()Ljava/lang/String;", "setTone", "(Ljava/lang/String;)V", "type", "getType", "setType", "content", "getContent", "setContent", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class SwitchTone extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String content;

    @Nullable
    private String tone;

    @Nullable
    private String type;

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getTone() {
        return this.tone;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setTone(@Nullable String str) {
        this.tone = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }
}
