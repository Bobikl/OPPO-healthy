package com.heytap.speech.engine.protocol.directive.conditional;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fRB\u0010\u0014\u001a\"\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/conditional/GeneralCondition;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "stateType", "Ljava/lang/Integer;", "getStateType", "()Ljava/lang/Integer;", "setStateType", "(Ljava/lang/Integer;)V", "Lcom/heytap/speech/engine/protocol/directive/conditional/RouteInfo;", "routeInfo", "Lcom/heytap/speech/engine/protocol/directive/conditional/RouteInfo;", "getRouteInfo", "()Lcom/heytap/speech/engine/protocol/directive/conditional/RouteInfo;", "setRouteInfo", "(Lcom/heytap/speech/engine/protocol/directive/conditional/RouteInfo;)V", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "params", "Ljava/util/HashMap;", "getParams", "()Ljava/util/HashMap;", "setParams", "(Ljava/util/HashMap;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class GeneralCondition extends DirectivePayload {
    public static final int TYPE_RECEIVE_SKILL = 2;
    public static final int TYPE_SKILL_END = 1;
    public static final int TYPE_STREAM_END = 0;

    @NotNull
    public static final String VERSION = "2.0";

    @Nullable
    private HashMap<String, Object> params;

    @Nullable
    private RouteInfo routeInfo;

    @Nullable
    private Integer stateType;

    @Nullable
    public final HashMap<String, Object> getParams() {
        return this.params;
    }

    @Nullable
    public final RouteInfo getRouteInfo() {
        return this.routeInfo;
    }

    @Nullable
    public final Integer getStateType() {
        return this.stateType;
    }

    public final void setParams(@Nullable HashMap<String, Object> map) {
        this.params = map;
    }

    public final void setRouteInfo(@Nullable RouteInfo routeInfo) {
        this.routeInfo = routeInfo;
    }

    public final void setStateType(@Nullable Integer num) {
        this.stateType = num;
    }
}
