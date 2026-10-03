package com.heytap.speech.engine.protocol.directive.common;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR,\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/common/TrackingInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "business", "", "getBusiness", "()Ljava/lang/String;", "setBusiness", "(Ljava/lang/String;)V", "extra", "", "getExtra", "()Ljava/util/Map;", "setExtra", "(Ljava/util/Map;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class TrackingInfo extends DirectivePayload {

    @JsonProperty("business")
    @Nullable
    private String business;

    @JsonProperty("extra")
    @Nullable
    private Map<String, String> extra;

    @Nullable
    public final String getBusiness() {
        return this.business;
    }

    @Nullable
    public final Map<String, String> getExtra() {
        return this.extra;
    }

    public final void setBusiness(@Nullable String str) {
        this.business = str;
    }

    public final void setExtra(@Nullable Map<String, String> map) {
        this.extra = map;
    }
}
