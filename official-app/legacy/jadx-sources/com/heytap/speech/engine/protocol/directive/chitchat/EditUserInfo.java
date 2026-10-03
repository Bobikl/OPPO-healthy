package com.heytap.speech.engine.protocol.directive.chitchat;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.commoninfo.RouteInfo;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/chitchat/EditUserInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "key", "", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "name", "getName", "setName", "routeInfo", "Lcom/heytap/speech/engine/protocol/directive/commoninfo/RouteInfo;", "getRouteInfo", "()Lcom/heytap/speech/engine/protocol/directive/commoninfo/RouteInfo;", "setRouteInfo", "(Lcom/heytap/speech/engine/protocol/directive/commoninfo/RouteInfo;)V", "value", "getValue", "setValue", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class EditUserInfo extends DirectivePayload {

    @JsonProperty("key")
    @Nullable
    private String key;

    @JsonProperty("name")
    @Nullable
    private String name;

    @JsonProperty("routeInfo")
    @Nullable
    private RouteInfo routeInfo;

    @JsonProperty("value")
    @Nullable
    private String value;

    @Nullable
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final RouteInfo getRouteInfo() {
        return this.routeInfo;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public final void setKey(@Nullable String str) {
        this.key = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setRouteInfo(@Nullable RouteInfo routeInfo) {
        this.routeInfo = routeInfo;
    }

    public final void setValue(@Nullable String str) {
        this.value = str;
    }
}
