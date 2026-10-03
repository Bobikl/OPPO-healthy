package com.heytap.speech.engine.protocol.directive.aicall;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001b\u0010\u001cR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/aicall/CallSummary;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "summary", "Ljava/lang/String;", "getSummary", "()Ljava/lang/String;", "setSummary", "(Ljava/lang/String;)V", "callId", "getCallId", "setCallId", "", "display", "Ljava/lang/Boolean;", "getDisplay", "()Ljava/lang/Boolean;", "setDisplay", "(Ljava/lang/Boolean;)V", "", "Lcom/heytap/speech/engine/protocol/directive/aicall/HighlightEntity;", "highlightEntities", "Ljava/util/List;", "getHighlightEntities", "()Ljava/util/List;", "setHighlightEntities", "(Ljava/util/List;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class CallSummary extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.1";

    @Nullable
    private String callId;

    @Nullable
    private Boolean display;

    @Nullable
    private List<HighlightEntity> highlightEntities;

    @Nullable
    private String summary;

    @Nullable
    public final String getCallId() {
        return this.callId;
    }

    @Nullable
    public final Boolean getDisplay() {
        return this.display;
    }

    @Nullable
    public final List<HighlightEntity> getHighlightEntities() {
        return this.highlightEntities;
    }

    @Nullable
    public final String getSummary() {
        return this.summary;
    }

    public final void setCallId(@Nullable String str) {
        this.callId = str;
    }

    public final void setDisplay(@Nullable Boolean bool) {
        this.display = bool;
    }

    public final void setHighlightEntities(@Nullable List<HighlightEntity> list) {
        this.highlightEntities = list;
    }

    public final void setSummary(@Nullable String str) {
        this.summary = str;
    }
}
