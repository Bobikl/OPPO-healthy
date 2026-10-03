package com.heytap.store.product_support.util;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.heytap.store.base.core.util.deeplink.DeeplinkHelper;
import com.heytap.store.base.core.util.deeplink.navigationcallback.NavigationCallback;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {NotificationCompat.CATEGORY_NAVIGATION, "", "url", "", "context", "Landroid/content/Context;", "callback", "Lcom/heytap/store/base/core/util/deeplink/navigationcallback/NavigationCallback;", "product-support_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ProductSupportNavigationUtilKt {
    public static final void navigation(@NotNull String url, @NotNull Context context, @Nullable NavigationCallback navigationCallback) throws InterruptedException {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(context, "context");
        if (context instanceof Activity) {
            DeeplinkHelper.INSTANCE.navigation((Activity) context, url, (252 & 4) != 0 ? null : null, (252 & 8) != 0 ? false : false, (252 & 16) != 0 ? 3 : 0, (252 & 32) != 0 ? null : null, (252 & 64) != 0 ? null : navigationCallback, (252 & 128) != 0 ? null : null);
        }
    }

    public static /* synthetic */ void navigation$default(String str, Context context, NavigationCallback navigationCallback, int i, Object obj) throws InterruptedException {
        if ((i & 4) != 0) {
            navigationCallback = null;
        }
        navigation(str, context, navigationCallback);
    }
}
