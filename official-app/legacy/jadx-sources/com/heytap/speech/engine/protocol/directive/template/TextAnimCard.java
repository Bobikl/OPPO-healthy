package com.heytap.speech.engine.protocol.directive.template;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/template/TextAnimCard;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "content", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "Lcom/heytap/speech/engine/protocol/directive/template/FloatAnimation;", "floatAnim", "Lcom/heytap/speech/engine/protocol/directive/template/FloatAnimation;", "getFloatAnim", "()Lcom/heytap/speech/engine/protocol/directive/template/FloatAnimation;", "setFloatAnim", "(Lcom/heytap/speech/engine/protocol/directive/template/FloatAnimation;)V", "", "combineWithLastRound", "Z", "getCombineWithLastRound", "()Z", "setCombineWithLastRound", "(Z)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class TextAnimCard extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @JsonProperty("content")
    private boolean combineWithLastRound;

    @JsonProperty("content")
    @Nullable
    private String content;

    @JsonProperty("floatAnim")
    @Nullable
    private FloatAnimation floatAnim;

    public final boolean getCombineWithLastRound() {
        return this.combineWithLastRound;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final FloatAnimation getFloatAnim() {
        return this.floatAnim;
    }

    public final void setCombineWithLastRound(boolean z) {
        this.combineWithLastRound = z;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setFloatAnim(@Nullable FloatAnimation floatAnimation) {
        this.floatAnim = floatAnimation;
    }
}
