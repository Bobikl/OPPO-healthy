package com.heytap.speech.engine.protocol.directive.recommend;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.common.commercial.ActionInfo;
import com.heytap.speech.engine.protocol.directive.common.commercial.CommercialInfo;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/recommend/EasterEggInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "actionInfos", "", "Lcom/heytap/speech/engine/protocol/directive/common/commercial/ActionInfo;", "getActionInfos", "()Ljava/util/List;", "setActionInfos", "(Ljava/util/List;)V", "commercialInfo", "Lcom/heytap/speech/engine/protocol/directive/common/commercial/CommercialInfo;", "getCommercialInfo", "()Lcom/heytap/speech/engine/protocol/directive/common/commercial/CommercialInfo;", "setCommercialInfo", "(Lcom/heytap/speech/engine/protocol/directive/common/commercial/CommercialInfo;)V", "displayCard", "Lcom/heytap/speech/engine/protocol/directive/recommend/DisplayCard;", "getDisplayCard", "()Lcom/heytap/speech/engine/protocol/directive/recommend/DisplayCard;", "setDisplayCard", "(Lcom/heytap/speech/engine/protocol/directive/recommend/DisplayCard;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class EasterEggInfo extends DirectivePayload {

    @JsonProperty("actionInfos")
    @Nullable
    private List<ActionInfo> actionInfos;

    @JsonProperty("commercialInfo")
    @Nullable
    private CommercialInfo commercialInfo;

    @JsonProperty("displayCard")
    @Nullable
    private DisplayCard displayCard;

    @Nullable
    public final List<ActionInfo> getActionInfos() {
        return this.actionInfos;
    }

    @Nullable
    public final CommercialInfo getCommercialInfo() {
        return this.commercialInfo;
    }

    @Nullable
    public final DisplayCard getDisplayCard() {
        return this.displayCard;
    }

    public final void setActionInfos(@Nullable List<ActionInfo> list) {
        this.actionInfos = list;
    }

    public final void setCommercialInfo(@Nullable CommercialInfo commercialInfo) {
        this.commercialInfo = commercialInfo;
    }

    public final void setDisplayCard(@Nullable DisplayCard displayCard) {
        this.displayCard = displayCard;
    }
}
