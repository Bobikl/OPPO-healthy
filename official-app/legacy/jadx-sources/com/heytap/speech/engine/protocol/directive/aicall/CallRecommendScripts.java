package com.heytap.speech.engine.protocol.directive.aicall;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u000b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/aicall/CallRecommendScripts;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "scene", "Ljava/lang/String;", "getScene", "()Ljava/lang/String;", "setScene", "(Ljava/lang/String;)V", "callId", "getCallId", "setCallId", "", "scripts", "Ljava/util/List;", "getScripts", "()Ljava/util/List;", "setScripts", "(Ljava/util/List;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class CallRecommendScripts extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String callId;

    @Nullable
    private String scene;

    @Nullable
    private List<String> scripts;

    @Nullable
    public final String getCallId() {
        return this.callId;
    }

    @Nullable
    public final String getScene() {
        return this.scene;
    }

    @Nullable
    public final List<String> getScripts() {
        return this.scripts;
    }

    public final void setCallId(@Nullable String str) {
        this.callId = str;
    }

    public final void setScene(@Nullable String str) {
        this.scene = str;
    }

    public final void setScripts(@Nullable List<String> list) {
        this.scripts = list;
    }
}
