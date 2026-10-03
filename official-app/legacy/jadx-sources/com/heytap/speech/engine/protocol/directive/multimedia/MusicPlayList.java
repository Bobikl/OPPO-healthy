package com.heytap.speech.engine.protocol.directive.multimedia;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.oplus.aiunit.vision.n28;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/multimedia/MusicPlayList;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "listId", "Ljava/lang/String;", "getListId", "()Ljava/lang/String;", "setListId", "(Ljava/lang/String;)V", "listType", "getListType", "setListType", n28.KEYWORD, "getKeyword", "setKeyword", "reply", "getReply", "setReply", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class MusicPlayList extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String keyword;

    @Nullable
    private String listId;

    @Nullable
    private String listType;

    @Nullable
    private String reply;

    @Nullable
    public final String getKeyword() {
        return this.keyword;
    }

    @Nullable
    public final String getListId() {
        return this.listId;
    }

    @Nullable
    public final String getListType() {
        return this.listType;
    }

    @Nullable
    public final String getReply() {
        return this.reply;
    }

    public final void setKeyword(@Nullable String str) {
        this.keyword = str;
    }

    public final void setListId(@Nullable String str) {
        this.listId = str;
    }

    public final void setListType(@Nullable String str) {
        this.listType = str;
    }

    public final void setReply(@Nullable String str) {
        this.reply = str;
    }
}
