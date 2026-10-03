package com.heytap.speech.engine.protocol.directive.chitchat;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.oplus.smartenginehelper.entity.TextEntity;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR \u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/chitchat/LinkInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", TextEntity.ELLIPSIZE_END, "", "getEnd", "()Ljava/lang/Integer;", "setEnd", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "link", "", "getLink", "()Ljava/lang/String;", "setLink", "(Ljava/lang/String;)V", "start", "getStart", "setStart", "type", "getType", "setType", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class LinkInfo extends DirectivePayload {

    @JsonProperty(TextEntity.ELLIPSIZE_END)
    @Nullable
    private Integer end;

    @JsonProperty("link")
    @Nullable
    private String link;

    @JsonProperty("start")
    @Nullable
    private Integer start;

    @JsonProperty("type")
    @Nullable
    private String type;

    @Nullable
    public final Integer getEnd() {
        return this.end;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final Integer getStart() {
        return this.start;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setEnd(@Nullable Integer num) {
        this.end = num;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setStart(@Nullable Integer num) {
        this.start = num;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }
}
