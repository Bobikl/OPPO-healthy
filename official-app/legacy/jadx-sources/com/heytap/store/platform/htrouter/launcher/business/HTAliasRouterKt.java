package com.heytap.store.platform.htrouter.launcher.business;

import com.heytap.store.platform.htrouter.facade.PostCard;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"getOriginalUrl", "", "Lcom/heytap/store/platform/htrouter/facade/Postcard;", "withOriginalUrl", "url", "htrouter-api_release"}, k = 2, mv = {1, 4, 0})
public final class HTAliasRouterKt {
    @Nullable
    public static final String getOriginalUrl(@NotNull PostCard getOriginalUrl) {
        Intrinsics.checkNotNullParameter(getOriginalUrl, "$this$getOriginalUrl");
        return getOriginalUrl.getBundle().getString(HTAliasRouter.ORIGIN_URL);
    }

    @NotNull
    public static final PostCard withOriginalUrl(@NotNull PostCard withOriginalUrl, @NotNull String url) {
        Intrinsics.checkNotNullParameter(withOriginalUrl, "$this$withOriginalUrl");
        Intrinsics.checkNotNullParameter(url, "url");
        return withOriginalUrl.withString(HTAliasRouter.ORIGIN_URL, url);
    }
}
