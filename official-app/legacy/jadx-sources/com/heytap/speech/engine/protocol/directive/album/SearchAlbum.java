package com.heytap.speech.engine.protocol.directive.album;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.store.base.core.util.deeplink.DeepLinkUrlPath;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/album/SearchAlbum;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "Lcom/heytap/speech/engine/protocol/directive/album/Search;", DeepLinkUrlPath.URL_SEARCH, "Lcom/heytap/speech/engine/protocol/directive/album/Search;", "getSearch", "()Lcom/heytap/speech/engine/protocol/directive/album/Search;", "setSearch", "(Lcom/heytap/speech/engine/protocol/directive/album/Search;)V", "Lcom/heytap/speech/engine/protocol/directive/album/Link;", "link", "Lcom/heytap/speech/engine/protocol/directive/album/Link;", "getLink", "()Lcom/heytap/speech/engine/protocol/directive/album/Link;", "setLink", "(Lcom/heytap/speech/engine/protocol/directive/album/Link;)V", "", "reply", "Ljava/lang/String;", "getReply", "()Ljava/lang/String;", "setReply", "(Ljava/lang/String;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class SearchAlbum extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private Link link;

    @Nullable
    private String reply;

    @Nullable
    private Search search;

    @Nullable
    public final Link getLink() {
        return this.link;
    }

    @Nullable
    public final String getReply() {
        return this.reply;
    }

    @Nullable
    public final Search getSearch() {
        return this.search;
    }

    public final void setLink(@Nullable Link link) {
        this.link = link;
    }

    public final void setReply(@Nullable String str) {
        this.reply = str;
    }

    public final void setSearch(@Nullable Search search) {
        this.search = search;
    }
}
