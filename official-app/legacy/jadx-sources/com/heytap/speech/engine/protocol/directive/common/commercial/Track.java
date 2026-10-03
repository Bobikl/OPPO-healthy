package com.heytap.speech.engine.protocol.directive.common.commercial;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR&\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/common/commercial/Track;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "event", "", "getEvent", "()Ljava/lang/String;", "setEvent", "(Ljava/lang/String;)V", "url", "getUrl", "setUrl", "urls", "", "getUrls", "()Ljava/util/List;", "setUrls", "(Ljava/util/List;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Track extends DirectivePayload {

    @JsonProperty("event")
    @Nullable
    private String event;

    @JsonProperty("url")
    @Nullable
    private String url;

    @JsonProperty("urls")
    @Nullable
    private List<String> urls;

    @Nullable
    public final String getEvent() {
        return this.event;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final List<String> getUrls() {
        return this.urls;
    }

    public final void setEvent(@Nullable String str) {
        this.event = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    public final void setUrls(@Nullable List<String> list) {
        this.urls = list;
    }
}
