package com.heytap.store.deeplink;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.heytap.store.base.core.util.deeplink.DeepLinkUrlPath;
import com.heytap.store.base.core.util.deeplink.DeeplinkHelper;
import com.heytap.store.base.core.util.deeplink.IDeeplinkHandler;
import com.heytap.store.platform.htrouter.facade.callback.NavigationCallback;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016¨\u0006\""}, d2 = {"Lcom/heytap/store/deeplink/DeeplinkHandlerImpl;", "Lcom/heytap/store/base/core/util/deeplink/IDeeplinkHandler;", "()V", NotificationCompat.CATEGORY_NAVIGATION, "", "context", "Landroid/content/Context;", "jumpUrl", "", "bundle", "Landroid/os/Bundle;", "navigationCallback", "Lcom/heytap/store/platform/htrouter/facade/callback/NavigationCallback;", "openHeytapPage", "activity", "Landroid/app/Activity;", "deeplink", "startAccountActivity", "startCreditHistoryActivity", "startCreditInstructionsActivity", "startCreditMarketActivity", "startCreditSignActivity", "startFeedbackActivity", "redirect", "", "startOaps", "startOppoBrowser", "startReserveFillInActivity", "startVipActivity", ParserTag.TAG_URI, "Landroid/net/Uri;", DeepLinkUrlPath.URL_VIP_MAI_PAGE_PAGE, "startWxMiniProgram", "weixinId", "businessbase_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DeeplinkHandlerImpl implements IDeeplinkHandler {
    @Override // com.heytap.store.base.core.util.deeplink.IDeeplinkHandler
    public void navigation(@NotNull Context context, @Nullable String jumpUrl, @Nullable Bundle bundle) throws InterruptedException {
        Intrinsics.checkNotNullParameter(context, "context");
        DeeplinkHelper.INSTANCE.navigation((Activity) context, jumpUrl, (252 & 4) != 0 ? null : null, (252 & 8) != 0 ? false : false, (252 & 16) != 0 ? 3 : 0, (252 & 32) != 0 ? null : bundle, (252 & 64) != 0 ? null : null, (252 & 128) != 0 ? null : null);
    }

    @Override // com.heytap.store.base.core.util.deeplink.IDeeplinkHandler
    public void openHeytapPage(@NotNull Activity activity, @NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
    }

    @Override // com.heytap.store.base.core.util.deeplink.IDeeplinkHandler
    public void startAccountActivity() {
    }

    @Override // com.heytap.store.base.core.util.deeplink.IDeeplinkHandler
    public void startCreditHistoryActivity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.heytap.store.base.core.util.deeplink.IDeeplinkHandler
    public void startCreditInstructionsActivity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.heytap.store.base.core.util.deeplink.IDeeplinkHandler
    public void startCreditMarketActivity(@NotNull Context context, @NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
    }

    @Override // com.heytap.store.base.core.util.deeplink.IDeeplinkHandler
    public void startCreditSignActivity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.heytap.store.base.core.util.deeplink.IDeeplinkHandler
    public void startFeedbackActivity(@NotNull Activity activity, boolean redirect) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // com.heytap.store.base.core.util.deeplink.IDeeplinkHandler
    public void startOaps(@NotNull Context context, @NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
    }

    @Override // com.heytap.store.base.core.util.deeplink.IDeeplinkHandler
    public void startOppoBrowser(@NotNull Activity activity, @NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
    }

    @Override // com.heytap.store.base.core.util.deeplink.IDeeplinkHandler
    public void startReserveFillInActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // com.heytap.store.base.core.util.deeplink.IDeeplinkHandler
    public void startVipActivity(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
    }

    @Override // com.heytap.store.base.core.util.deeplink.IDeeplinkHandler
    public void startVipMainPage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.heytap.store.base.core.util.deeplink.IDeeplinkHandler
    public void startWxMiniProgram(@NotNull String weixinId, @NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(weixinId, "weixinId");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
    }

    public final void navigation(@NotNull Context context, @Nullable String jumpUrl, @Nullable Bundle bundle, @Nullable NavigationCallback navigationCallback) throws InterruptedException {
        Intrinsics.checkNotNullParameter(context, "context");
        DeeplinkHelper.INSTANCE.navigation((Activity) context, jumpUrl, (252 & 4) != 0 ? null : null, (252 & 8) != 0 ? false : false, (252 & 16) != 0 ? 3 : 0, (252 & 32) != 0 ? null : bundle, (252 & 64) != 0 ? null : null, (252 & 128) != 0 ? null : navigationCallback);
    }
}
