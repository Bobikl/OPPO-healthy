package com.heytap.store.platform.htrouter.launcher.business.base;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u001e\b\u0002\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0018R0\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/heytap/store/platform/htrouter/launcher/business/base/RouteMatchResult;", "", "routePathForAlias", "", "routePathForPattern", "customRoute", "Lkotlin/Function2;", "Landroid/os/Bundle;", "", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "getCustomRoute", "()Lkotlin/jvm/functions/Function2;", "setCustomRoute", "(Lkotlin/jvm/functions/Function2;)V", "getRoutePathForAlias", "()Ljava/lang/String;", "setRoutePathForAlias", "(Ljava/lang/String;)V", "getRoutePathForPattern", "setRoutePathForPattern", "getRoutePath", "getType", "Lcom/heytap/store/platform/htrouter/launcher/business/base/RouteMatchType;", "isEmptyMatch", "", "htrouter-api_release"}, k = 1, mv = {1, 4, 0})
public final class RouteMatchResult {

    @Nullable
    private Function2<? super String, ? super Bundle, Unit> customRoute;

    @Nullable
    private String routePathForAlias;

    @Nullable
    private String routePathForPattern;

    public RouteMatchResult() {
        this(null, null, null, 7, null);
    }

    @Nullable
    public final Function2<String, Bundle, Unit> getCustomRoute() {
        return this.customRoute;
    }

    @Nullable
    public final String getRoutePath() {
        String str = this.routePathForAlias;
        return str != null ? str : this.routePathForPattern;
    }

    @Nullable
    public final String getRoutePathForAlias() {
        return this.routePathForAlias;
    }

    @Nullable
    public final String getRoutePathForPattern() {
        return this.routePathForPattern;
    }

    @NotNull
    public final RouteMatchType getType() {
        return this.customRoute != null ? RouteMatchType.CUSTOM_METHOD : RouteMatchType.ROUTE_PATH;
    }

    public final boolean isEmptyMatch() {
        return this.routePathForAlias == null && this.routePathForPattern == null && this.customRoute == null;
    }

    public final void setCustomRoute(@Nullable Function2<? super String, ? super Bundle, Unit> function2) {
        this.customRoute = function2;
    }

    public final void setRoutePathForAlias(@Nullable String str) {
        this.routePathForAlias = str;
    }

    public final void setRoutePathForPattern(@Nullable String str) {
        this.routePathForPattern = str;
    }

    public RouteMatchResult(@Nullable String str, @Nullable String str2, @Nullable Function2<? super String, ? super Bundle, Unit> function2) {
        this.routePathForAlias = str;
        this.routePathForPattern = str2;
        this.customRoute = function2;
    }

    public /* synthetic */ RouteMatchResult(String str, String str2, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : function2);
    }
}
