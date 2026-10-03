package com.heytap.speech.engine.protocol.directive.navigation;

import androidx.annotation.Keep;
import com.google.android.gms.actions.SearchIntents;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/navigation/ExitNavigation;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "exitReply", "Ljava/lang/String;", "getExitReply", "()Ljava/lang/String;", "setExitReply", "(Ljava/lang/String;)V", "alreadyReply", "getAlreadyReply", "setAlreadyReply", SearchIntents.EXTRA_QUERY, "getQuery", "setQuery", "baiduDp", "getBaiduDp", "setBaiduDp", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class ExitNavigation extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String alreadyReply;

    @Nullable
    private String baiduDp;

    @Nullable
    private String exitReply;

    @Nullable
    private String query;

    @Nullable
    public final String getAlreadyReply() {
        return this.alreadyReply;
    }

    @Nullable
    public final String getBaiduDp() {
        return this.baiduDp;
    }

    @Nullable
    public final String getExitReply() {
        return this.exitReply;
    }

    @Nullable
    public final String getQuery() {
        return this.query;
    }

    public final void setAlreadyReply(@Nullable String str) {
        this.alreadyReply = str;
    }

    public final void setBaiduDp(@Nullable String str) {
        this.baiduDp = str;
    }

    public final void setExitReply(@Nullable String str) {
        this.exitReply = str;
    }

    public final void setQuery(@Nullable String str) {
        this.query = str;
    }
}
