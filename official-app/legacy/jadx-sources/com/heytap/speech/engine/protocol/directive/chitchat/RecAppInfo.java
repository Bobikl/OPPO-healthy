package com.heytap.speech.engine.protocol.directive.chitchat;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.common.Action;
import com.heytap.speech.engine.protocol.directive.common.commercial.ActionInfo;
import com.heytap.speech.engine.protocol.directive.common.commercial.CommercialInfo;
import com.heytap.speech.engine.protocol.directive.common.commercial.DisplayInfo;
import com.heytap.speech.engine.protocol.directive.conditional.RouteInfo;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR&\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010!\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/chitchat/RecAppInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "action", "Lcom/heytap/speech/engine/protocol/directive/common/Action;", "getAction", "()Lcom/heytap/speech/engine/protocol/directive/common/Action;", "setAction", "(Lcom/heytap/speech/engine/protocol/directive/common/Action;)V", "actionInfo", "Lcom/heytap/speech/engine/protocol/directive/common/commercial/ActionInfo;", "getActionInfo", "()Lcom/heytap/speech/engine/protocol/directive/common/commercial/ActionInfo;", "setActionInfo", "(Lcom/heytap/speech/engine/protocol/directive/common/commercial/ActionInfo;)V", "actionInfos", "", "getActionInfos", "()Ljava/util/List;", "setActionInfos", "(Ljava/util/List;)V", "commercialInfo", "Lcom/heytap/speech/engine/protocol/directive/common/commercial/CommercialInfo;", "getCommercialInfo", "()Lcom/heytap/speech/engine/protocol/directive/common/commercial/CommercialInfo;", "setCommercialInfo", "(Lcom/heytap/speech/engine/protocol/directive/common/commercial/CommercialInfo;)V", "displayInfo", "Lcom/heytap/speech/engine/protocol/directive/common/commercial/DisplayInfo;", "getDisplayInfo", "()Lcom/heytap/speech/engine/protocol/directive/common/commercial/DisplayInfo;", "setDisplayInfo", "(Lcom/heytap/speech/engine/protocol/directive/common/commercial/DisplayInfo;)V", "guideContent", "", "getGuideContent", "()Ljava/lang/String;", "setGuideContent", "(Ljava/lang/String;)V", "routeInfo", "Lcom/heytap/speech/engine/protocol/directive/conditional/RouteInfo;", "getRouteInfo", "()Lcom/heytap/speech/engine/protocol/directive/conditional/RouteInfo;", "setRouteInfo", "(Lcom/heytap/speech/engine/protocol/directive/conditional/RouteInfo;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class RecAppInfo extends DirectivePayload {

    @JsonProperty("action")
    @Nullable
    private Action action;

    @JsonProperty("actionInfo")
    @Nullable
    private ActionInfo actionInfo;

    @JsonProperty("actionInfos")
    @Nullable
    private List<ActionInfo> actionInfos;

    @JsonProperty("commercialInfo")
    @Nullable
    private CommercialInfo commercialInfo;

    @JsonProperty("displayInfo")
    @Nullable
    private DisplayInfo displayInfo;

    @JsonProperty("guideContent")
    @Nullable
    private String guideContent;

    @Nullable
    private RouteInfo routeInfo;

    @Nullable
    public final Action getAction() {
        return this.action;
    }

    @Nullable
    public final ActionInfo getActionInfo() {
        return this.actionInfo;
    }

    @Nullable
    public final List<ActionInfo> getActionInfos() {
        return this.actionInfos;
    }

    @Nullable
    public final CommercialInfo getCommercialInfo() {
        return this.commercialInfo;
    }

    @Nullable
    public final DisplayInfo getDisplayInfo() {
        return this.displayInfo;
    }

    @Nullable
    public final String getGuideContent() {
        return this.guideContent;
    }

    @Nullable
    public final RouteInfo getRouteInfo() {
        return this.routeInfo;
    }

    public final void setAction(@Nullable Action action) {
        this.action = action;
    }

    public final void setActionInfo(@Nullable ActionInfo actionInfo) {
        this.actionInfo = actionInfo;
    }

    public final void setActionInfos(@Nullable List<ActionInfo> list) {
        this.actionInfos = list;
    }

    public final void setCommercialInfo(@Nullable CommercialInfo commercialInfo) {
        this.commercialInfo = commercialInfo;
    }

    public final void setDisplayInfo(@Nullable DisplayInfo displayInfo) {
        this.displayInfo = displayInfo;
    }

    public final void setGuideContent(@Nullable String str) {
        this.guideContent = str;
    }

    public final void setRouteInfo(@Nullable RouteInfo routeInfo) {
        this.routeInfo = routeInfo;
    }
}
