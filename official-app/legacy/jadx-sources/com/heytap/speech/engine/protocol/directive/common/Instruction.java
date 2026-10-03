package com.heytap.speech.engine.protocol.directive.common;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR&\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\tR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/common/Instruction;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "clientEventData", "", "Lcom/heytap/speech/engine/protocol/directive/common/MessageInfo;", "getClientEventData", "()Ljava/util/List;", "setClientEventData", "(Ljava/util/List;)V", "eventData", "", "getEventData", "setEventData", "serverData", "getServerData", "setServerData", "showUI", "", "getShowUI", "()Ljava/lang/Boolean;", "setShowUI", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "type", "", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Instruction extends DirectivePayload {

    @JsonProperty("clientEventData")
    @Nullable
    private List<MessageInfo> clientEventData;

    @JsonProperty("eventData")
    @Nullable
    private List<? extends Object> eventData;

    @JsonProperty("serverData")
    @Nullable
    private List<? extends Object> serverData;

    @JsonProperty("showUI")
    @Nullable
    private Boolean showUI;

    @JsonProperty("type")
    @Nullable
    private String type;

    @Nullable
    public final List<MessageInfo> getClientEventData() {
        return this.clientEventData;
    }

    @Nullable
    public final List<Object> getEventData() {
        return this.eventData;
    }

    @Nullable
    public final List<Object> getServerData() {
        return this.serverData;
    }

    @Nullable
    public final Boolean getShowUI() {
        return this.showUI;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setClientEventData(@Nullable List<MessageInfo> list) {
        this.clientEventData = list;
    }

    public final void setEventData(@Nullable List<? extends Object> list) {
        this.eventData = list;
    }

    public final void setServerData(@Nullable List<? extends Object> list) {
        this.serverData = list;
    }

    public final void setShowUI(@Nullable Boolean bool) {
        this.showUI = bool;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }
}
