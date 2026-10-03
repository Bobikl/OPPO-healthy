package com.heytap.store.base.core.util.deeplink;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007H&J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H&¨\u0006\u001f"}, d2 = {"Lcom/heytap/store/base/core/util/deeplink/IDeeplinkHandler;", "", NotificationCompat.CATEGORY_NAVIGATION, "", "context", "Landroid/content/Context;", "jumpUrl", "", "bundle", "Landroid/os/Bundle;", "openHeytapPage", "activity", "Landroid/app/Activity;", "deeplink", "startAccountActivity", "startCreditHistoryActivity", "startCreditInstructionsActivity", "startCreditMarketActivity", "startCreditSignActivity", "startFeedbackActivity", "redirect", "", "startOaps", "startOppoBrowser", "startReserveFillInActivity", "startVipActivity", ParserTag.TAG_URI, "Landroid/net/Uri;", DeepLinkUrlPath.URL_VIP_MAI_PAGE_PAGE, "startWxMiniProgram", "weixinId", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface IDeeplinkHandler {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void navigation$default(IDeeplinkHandler iDeeplinkHandler, Context context, String str, Bundle bundle, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigation");
            }
            if ((i & 4) != 0) {
                bundle = null;
            }
            iDeeplinkHandler.navigation(context, str, bundle);
        }
    }

    void navigation(@NotNull Context context, @Nullable String jumpUrl, @Nullable Bundle bundle);

    void openHeytapPage(@NotNull Activity activity, @NotNull String deeplink);

    void startAccountActivity();

    void startCreditHistoryActivity(@NotNull Context context);

    void startCreditInstructionsActivity(@NotNull Context context);

    void startCreditMarketActivity(@NotNull Context context, @NotNull String deeplink);

    void startCreditSignActivity(@NotNull Context context);

    void startFeedbackActivity(@NotNull Activity activity, boolean redirect);

    void startOaps(@NotNull Context context, @NotNull String deeplink);

    void startOppoBrowser(@NotNull Activity activity, @NotNull String deeplink);

    void startReserveFillInActivity(@NotNull Activity activity);

    void startVipActivity(@NotNull Context context, @NotNull Uri uri);

    void startVipMainPage(@NotNull Context context);

    void startWxMiniProgram(@NotNull String weixinId, @NotNull String deeplink);
}
