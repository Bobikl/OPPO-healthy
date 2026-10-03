package com.heytap.store.base.core.util.ccp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.heytap.store.base.core.util.deeplink.DeeplinkHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, d2 = {"Lcom/heytap/store/base/core/util/ccp/RouterUtil;", "", "()V", NotificationCompat.CATEGORY_NAVIGATION, "", "context", "Landroid/content/Context;", "url", "", "bundle", "Landroid/os/Bundle;", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class RouterUtil {

    @NotNull
    public static final RouterUtil INSTANCE = new RouterUtil();

    private RouterUtil() {
    }

    public static /* synthetic */ void navigation$default(RouterUtil routerUtil, Context context, String str, Bundle bundle, int i, Object obj) throws InterruptedException {
        if ((i & 4) != 0) {
            bundle = null;
        }
        routerUtil.navigation(context, str, bundle);
    }

    public final void navigation(@Nullable Context context, @Nullable String url, @Nullable Bundle bundle) throws InterruptedException {
        if (context == null || TextUtils.isEmpty(url)) {
            return;
        }
        DeeplinkHelper.INSTANCE.navigation((Activity) context, url, (252 & 4) != 0 ? null : null, (252 & 8) != 0 ? false : false, (252 & 16) != 0 ? 3 : 0, (252 & 32) != 0 ? null : bundle, (252 & 64) != 0 ? null : null, (252 & 128) != 0 ? null : null);
    }
}
