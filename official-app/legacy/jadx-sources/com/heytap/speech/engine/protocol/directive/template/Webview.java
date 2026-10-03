package com.heytap.speech.engine.protocol.directive.template;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/template/Webview;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "url", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "openCardType", "getOpenCardType", "setOpenCardType", "Lcom/heytap/speech/engine/protocol/directive/template/Statement;", "statement", "Lcom/heytap/speech/engine/protocol/directive/template/Statement;", "getStatement", "()Lcom/heytap/speech/engine/protocol/directive/template/Statement;", "setStatement", "(Lcom/heytap/speech/engine/protocol/directive/template/Statement;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class Webview extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String openCardType;

    @Nullable
    private Statement statement;

    @Nullable
    private String url;

    @Nullable
    public final String getOpenCardType() {
        return this.openCardType;
    }

    @Nullable
    public final Statement getStatement() {
        return this.statement;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final void setOpenCardType(@Nullable String str) {
        this.openCardType = str;
    }

    public final void setStatement(@Nullable Statement statement) {
        this.statement = statement;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }
}
