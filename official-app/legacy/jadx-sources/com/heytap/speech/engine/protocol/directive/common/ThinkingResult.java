package com.heytap.speech.engine.protocol.directive.common;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.myai.LinkInfo;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/common/ThinkingResult;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "icon", "", "getIcon", "()Ljava/lang/String;", "setIcon", "(Ljava/lang/String;)V", "linkInfo", "Lcom/heytap/speech/engine/protocol/directive/myai/LinkInfo;", "getLinkInfo", "()Lcom/heytap/speech/engine/protocol/directive/myai/LinkInfo;", "setLinkInfo", "(Lcom/heytap/speech/engine/protocol/directive/myai/LinkInfo;)V", "searchingEngine", "", "getSearchingEngine", "()Ljava/lang/Boolean;", "setSearchingEngine", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "title", "getTitle", "setTitle", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ThinkingResult extends DirectivePayload {

    @Nullable
    private String icon;

    @Nullable
    private LinkInfo linkInfo;

    @Nullable
    private Boolean searchingEngine;

    @Nullable
    private String title;

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final LinkInfo getLinkInfo() {
        return this.linkInfo;
    }

    @Nullable
    public final Boolean getSearchingEngine() {
        return this.searchingEngine;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setLinkInfo(@Nullable LinkInfo linkInfo) {
        this.linkInfo = linkInfo;
    }

    public final void setSearchingEngine(@Nullable Boolean bool) {
        this.searchingEngine = bool;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
