package com.heytap.speech.engine.protocol.directive.template;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/template/TextItem;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "link", "getLink", "setLink", "title", "getTitle", "setTitle", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class TextItem extends DirectivePayload {

    @JsonProperty("content")
    @Nullable
    private String content;

    @JsonProperty("link")
    @Nullable
    private String link;

    @JsonProperty("title")
    @Nullable
    private String title;

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
