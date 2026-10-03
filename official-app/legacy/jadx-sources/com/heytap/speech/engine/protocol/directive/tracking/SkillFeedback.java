package com.heytap.speech.engine.protocol.directive.tracking;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/tracking/SkillFeedback;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "trackingInfo", "Ljava/lang/String;", "getTrackingInfo", "()Ljava/lang/String;", "setTrackingInfo", "(Ljava/lang/String;)V", "Lcom/heytap/speech/engine/protocol/directive/tracking/RenderInfo;", "renderInfo", "Lcom/heytap/speech/engine/protocol/directive/tracking/RenderInfo;", "getRenderInfo", "()Lcom/heytap/speech/engine/protocol/directive/tracking/RenderInfo;", "setRenderInfo", "(Lcom/heytap/speech/engine/protocol/directive/tracking/RenderInfo;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class SkillFeedback extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @JsonProperty("renderInfo")
    @Nullable
    private RenderInfo renderInfo;

    @JsonProperty("trackingInfo")
    @Nullable
    private String trackingInfo;

    @Nullable
    public final RenderInfo getRenderInfo() {
        return this.renderInfo;
    }

    @Nullable
    public final String getTrackingInfo() {
        return this.trackingInfo;
    }

    public final void setRenderInfo(@Nullable RenderInfo renderInfo) {
        this.renderInfo = renderInfo;
    }

    public final void setTrackingInfo(@Nullable String str) {
        this.trackingInfo = str;
    }
}
