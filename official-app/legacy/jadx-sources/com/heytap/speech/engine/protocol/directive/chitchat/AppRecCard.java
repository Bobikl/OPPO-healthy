package com.heytap.speech.engine.protocol.directive.chitchat;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR0\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/chitchat/AppRecCard;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "content", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "Lcom/heytap/speech/engine/protocol/directive/chitchat/RecAppInfo;", "recAppInfo", "Lcom/heytap/speech/engine/protocol/directive/chitchat/RecAppInfo;", "getRecAppInfo", "()Lcom/heytap/speech/engine/protocol/directive/chitchat/RecAppInfo;", "setRecAppInfo", "(Lcom/heytap/speech/engine/protocol/directive/chitchat/RecAppInfo;)V", "", "", "trackingInfo", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "setTrackingInfo", "(Ljava/util/Map;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class AppRecCard extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.3";

    @JsonProperty("content")
    @Nullable
    private String content;

    @JsonProperty("recAppInfo")
    @Nullable
    private RecAppInfo recAppInfo;

    @Nullable
    private Map<String, ? extends Object> trackingInfo;

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final RecAppInfo getRecAppInfo() {
        return this.recAppInfo;
    }

    @Nullable
    public final Map<String, Object> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setRecAppInfo(@Nullable RecAppInfo recAppInfo) {
        this.recAppInfo = recAppInfo;
    }

    public final void setTrackingInfo(@Nullable Map<String, ? extends Object> map) {
        this.trackingInfo = map;
    }
}
