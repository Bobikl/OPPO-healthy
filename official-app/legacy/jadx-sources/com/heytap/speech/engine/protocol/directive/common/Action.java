package com.heytap.speech.engine.protocol.directive.common;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/common/Action;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "jumpInfo", "Lcom/heytap/speech/engine/protocol/directive/common/JumpInfo;", "getJumpInfo", "()Lcom/heytap/speech/engine/protocol/directive/common/JumpInfo;", "setJumpInfo", "(Lcom/heytap/speech/engine/protocol/directive/common/JumpInfo;)V", "tracking", "Lcom/heytap/speech/engine/protocol/directive/common/TrackingInfo;", "getTracking", "()Lcom/heytap/speech/engine/protocol/directive/common/TrackingInfo;", "setTracking", "(Lcom/heytap/speech/engine/protocol/directive/common/TrackingInfo;)V", "type", "", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Action extends DirectivePayload {

    @JsonProperty("jumpInfo")
    @Nullable
    private JumpInfo jumpInfo;

    @JsonProperty("tracking")
    @Nullable
    private TrackingInfo tracking;

    @JsonProperty("type")
    @Nullable
    private String type;

    @Nullable
    public final JumpInfo getJumpInfo() {
        return this.jumpInfo;
    }

    @Nullable
    public final TrackingInfo getTracking() {
        return this.tracking;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setJumpInfo(@Nullable JumpInfo jumpInfo) {
        this.jumpInfo = jumpInfo;
    }

    public final void setTracking(@Nullable TrackingInfo trackingInfo) {
        this.tracking = trackingInfo;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }
}
