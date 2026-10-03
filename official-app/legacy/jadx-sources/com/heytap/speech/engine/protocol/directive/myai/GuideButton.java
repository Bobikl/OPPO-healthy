package com.heytap.speech.engine.protocol.directive.myai;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.conditional.RouteInfo;
import com.oplus.aiunit.vision.f04;
import java.util.HashMap;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR(\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020!\u0018\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\r\"\u0004\b(\u0010\u000fR\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/myai/GuideButton;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", f04.JSON_KEY_RKE_ACTION_TYPE, "", "getActionType", "()Ljava/lang/Integer;", "setActionType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "agreeBtnName", "", "getAgreeBtnName", "()Ljava/lang/String;", "setAgreeBtnName", "(Ljava/lang/String;)V", "bgUrl", "getBgUrl", "setBgUrl", "content", "getContent", "setContent", "darkBgUrl", "getDarkBgUrl", "setDarkBgUrl", "darkIconUrl", "getDarkIconUrl", "setDarkIconUrl", "dp", "getDp", "setDp", "extend", "Ljava/util/HashMap;", "", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", "iconUrl", "getIconUrl", "setIconUrl", "routeInfo", "Lcom/heytap/speech/engine/protocol/directive/conditional/RouteInfo;", "getRouteInfo", "()Lcom/heytap/speech/engine/protocol/directive/conditional/RouteInfo;", "setRouteInfo", "(Lcom/heytap/speech/engine/protocol/directive/conditional/RouteInfo;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class GuideButton extends DirectivePayload {

    @Nullable
    private Integer actionType;

    @Nullable
    private String agreeBtnName;

    @Nullable
    private String bgUrl;

    @Nullable
    private String content;

    @Nullable
    private String darkBgUrl;

    @Nullable
    private String darkIconUrl;

    @Nullable
    private String dp;

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    private String iconUrl;

    @Nullable
    private RouteInfo routeInfo;

    @Nullable
    public final Integer getActionType() {
        return this.actionType;
    }

    @Nullable
    public final String getAgreeBtnName() {
        return this.agreeBtnName;
    }

    @Nullable
    public final String getBgUrl() {
        return this.bgUrl;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getDarkBgUrl() {
        return this.darkBgUrl;
    }

    @Nullable
    public final String getDarkIconUrl() {
        return this.darkIconUrl;
    }

    @Nullable
    public final String getDp() {
        return this.dp;
    }

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final RouteInfo getRouteInfo() {
        return this.routeInfo;
    }

    public final void setActionType(@Nullable Integer num) {
        this.actionType = num;
    }

    public final void setAgreeBtnName(@Nullable String str) {
        this.agreeBtnName = str;
    }

    public final void setBgUrl(@Nullable String str) {
        this.bgUrl = str;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setDarkBgUrl(@Nullable String str) {
        this.darkBgUrl = str;
    }

    public final void setDarkIconUrl(@Nullable String str) {
        this.darkIconUrl = str;
    }

    public final void setDp(@Nullable String str) {
        this.dp = str;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setIconUrl(@Nullable String str) {
        this.iconUrl = str;
    }

    public final void setRouteInfo(@Nullable RouteInfo routeInfo) {
        this.routeInfo = routeInfo;
    }
}
