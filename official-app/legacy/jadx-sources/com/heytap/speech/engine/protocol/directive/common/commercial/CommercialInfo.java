package com.heytap.speech.engine.protocol.directive.common.commercial;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR \u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR \u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR \u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR \u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR \u0010!\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\b¨\u0006$"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/common/commercial/CommercialInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "adContentType", "", "getAdContentType", "()Ljava/lang/String;", "setAdContentType", "(Ljava/lang/String;)V", "adStrategy", "getAdStrategy", "setAdStrategy", "commercialDetail", "Lcom/heytap/speech/engine/protocol/directive/common/commercial/CommercialDetail;", "getCommercialDetail", "()Lcom/heytap/speech/engine/protocol/directive/common/commercial/CommercialDetail;", "setCommercialDetail", "(Lcom/heytap/speech/engine/protocol/directive/common/commercial/CommercialDetail;)V", "commercialType", "getCommercialType", "setCommercialType", "mediaReqId", "getMediaReqId", "setMediaReqId", "module", "getModule", "setModule", "positionId", "getPositionId", "setPositionId", "rateRule", "getRateRule", "setRateRule", "strategyId", "getStrategyId", "setStrategyId", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CommercialInfo extends DirectivePayload {

    @JsonProperty("adContentType")
    @Nullable
    private String adContentType;

    @JsonProperty("adStrategy")
    @Nullable
    private String adStrategy;

    @JsonProperty("commercialDetail")
    @Nullable
    private CommercialDetail commercialDetail;

    @JsonProperty("commercialType")
    @Nullable
    private String commercialType;

    @JsonProperty("mediaReqId")
    @Nullable
    private String mediaReqId;

    @JsonProperty("module")
    @Nullable
    private String module;

    @JsonProperty("positionId")
    @Nullable
    private String positionId;

    @JsonProperty("rateRule")
    @Nullable
    private String rateRule;

    @JsonProperty("strategyId")
    @Nullable
    private String strategyId;

    @Nullable
    public final String getAdContentType() {
        return this.adContentType;
    }

    @Nullable
    public final String getAdStrategy() {
        return this.adStrategy;
    }

    @Nullable
    public final CommercialDetail getCommercialDetail() {
        return this.commercialDetail;
    }

    @Nullable
    public final String getCommercialType() {
        return this.commercialType;
    }

    @Nullable
    public final String getMediaReqId() {
        return this.mediaReqId;
    }

    @Nullable
    public final String getModule() {
        return this.module;
    }

    @Nullable
    public final String getPositionId() {
        return this.positionId;
    }

    @Nullable
    public final String getRateRule() {
        return this.rateRule;
    }

    @Nullable
    public final String getStrategyId() {
        return this.strategyId;
    }

    public final void setAdContentType(@Nullable String str) {
        this.adContentType = str;
    }

    public final void setAdStrategy(@Nullable String str) {
        this.adStrategy = str;
    }

    public final void setCommercialDetail(@Nullable CommercialDetail commercialDetail) {
        this.commercialDetail = commercialDetail;
    }

    public final void setCommercialType(@Nullable String str) {
        this.commercialType = str;
    }

    public final void setMediaReqId(@Nullable String str) {
        this.mediaReqId = str;
    }

    public final void setModule(@Nullable String str) {
        this.module = str;
    }

    public final void setPositionId(@Nullable String str) {
        this.positionId = str;
    }

    public final void setRateRule(@Nullable String str) {
        this.rateRule = str;
    }

    public final void setStrategyId(@Nullable String str) {
        this.strategyId = str;
    }
}
