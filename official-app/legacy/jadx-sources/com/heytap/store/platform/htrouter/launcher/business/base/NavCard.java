package com.heytap.store.platform.htrouter.launcher.business.base;

import android.os.Bundle;
import com.heytap.store.platform.htrouter.exception.InitException;
import com.heytap.store.platform.htrouter.facade.PostCard;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001e\b\u0002\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\fR0\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/heytap/store/platform/htrouter/launcher/business/base/NavCard;", "", "type", "Lcom/heytap/store/platform/htrouter/launcher/business/base/RouteMatchType;", "postcard", "Lcom/heytap/store/platform/htrouter/facade/Postcard;", "method", "Lkotlin/Function2;", "", "Landroid/os/Bundle;", "", "navError", "(Lcom/heytap/store/platform/htrouter/launcher/business/base/RouteMatchType;Lcom/heytap/store/platform/htrouter/facade/Postcard;Lkotlin/jvm/functions/Function2;Ljava/lang/Object;)V", "getMethod", "()Lkotlin/jvm/functions/Function2;", "setMethod", "(Lkotlin/jvm/functions/Function2;)V", "getNavError", "()Ljava/lang/Object;", "setNavError", "(Ljava/lang/Object;)V", "getPostcard", "()Lcom/heytap/store/platform/htrouter/facade/Postcard;", "setPostcard", "(Lcom/heytap/store/platform/htrouter/facade/Postcard;)V", "getType", "()Lcom/heytap/store/platform/htrouter/launcher/business/base/RouteMatchType;", "setType", "(Lcom/heytap/store/platform/htrouter/launcher/business/base/RouteMatchType;)V", "htrouter-api_release"}, k = 1, mv = {1, 4, 0})
public final class NavCard {

    @Nullable
    private Function2<? super String, ? super Bundle, Unit> method;

    @Nullable
    private Object navError;

    @NotNull
    private PostCard postcard;

    @NotNull
    private RouteMatchType type;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RouteMatchType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[RouteMatchType.CUSTOM_METHOD.ordinal()] = 1;
        }
    }

    public NavCard(@NotNull RouteMatchType type, @NotNull PostCard postcard, @Nullable Function2<? super String, ? super Bundle, Unit> function2, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(postcard, "postcard");
        this.type = type;
        this.postcard = postcard;
        this.method = function2;
        this.navError = obj;
        if (WhenMappings.$EnumSwitchMapping$0[type.ordinal()] == 1 && this.method == null) {
            throw new InitException("HTRouter::Init NavCard error, method can be null when type point to CUSTOM_METHOD");
        }
    }

    @Nullable
    public final Function2<String, Bundle, Unit> getMethod() {
        return this.method;
    }

    @Nullable
    public final Object getNavError() {
        return this.navError;
    }

    @NotNull
    public final PostCard getPostcard() {
        return this.postcard;
    }

    @NotNull
    public final RouteMatchType getType() {
        return this.type;
    }

    public final void setMethod(@Nullable Function2<? super String, ? super Bundle, Unit> function2) {
        this.method = function2;
    }

    public final void setNavError(@Nullable Object obj) {
        this.navError = obj;
    }

    public final void setPostcard(@NotNull PostCard postCard) {
        Intrinsics.checkNotNullParameter(postCard, "<set-?>");
        this.postcard = postCard;
    }

    public final void setType(@NotNull RouteMatchType routeMatchType) {
        Intrinsics.checkNotNullParameter(routeMatchType, "<set-?>");
        this.type = routeMatchType;
    }

    public /* synthetic */ NavCard(RouteMatchType routeMatchType, PostCard postCard, Function2 function2, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(routeMatchType, postCard, (i & 4) != 0 ? null : function2, (i & 8) != 0 ? null : obj);
    }
}
