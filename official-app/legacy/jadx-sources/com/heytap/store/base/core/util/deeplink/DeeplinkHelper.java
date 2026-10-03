package com.heytap.store.base.core.util.deeplink;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.heytap.store.base.core.util.deeplink.interceptor.IInterceptor;
import com.heytap.store.base.core.util.statistics.StatisticsUtil;
import com.heytap.store.platform.htrouter.facade.PostCard;
import com.heytap.store.platform.htrouter.facade.callback.NavigationCallback;
import com.heytap.store.platform.htrouter.launcher.business.HTAliasRouter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\\\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ2\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u001d"}, d2 = {"Lcom/heytap/store/base/core/util/deeplink/DeeplinkHelper;", "", "()V", "onRnGlobalInterceptorListener", "Lcom/heytap/store/base/core/util/deeplink/DeeplinkHelper$RnGlobalInterceptorListener;", "getOnRnGlobalInterceptorListener", "()Lcom/heytap/store/base/core/util/deeplink/DeeplinkHelper$RnGlobalInterceptorListener;", "setOnRnGlobalInterceptorListener", "(Lcom/heytap/store/base/core/util/deeplink/DeeplinkHelper$RnGlobalInterceptorListener;)V", NotificationCompat.CATEGORY_NAVIGATION, "", "activity", "Landroid/app/Activity;", "jumpUrl", "", "iInterceptor", "Lcom/heytap/store/base/core/util/deeplink/interceptor/IInterceptor;", "isOutSidePull", "", StatisticsUtil.LOG_ENTER_ID, "", "bundle", "Landroid/os/Bundle;", "callback", "Lcom/heytap/store/base/core/util/deeplink/navigationcallback/NavigationCallback;", "newRouterCallback", "Lcom/heytap/store/platform/htrouter/facade/callback/NavigationCallback;", "useHTAilasRouter", "RnGlobalInterceptorListener", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DeeplinkHelper {

    @NotNull
    public static final DeeplinkHelper INSTANCE = new DeeplinkHelper();

    @Nullable
    private static RnGlobalInterceptorListener onRnGlobalInterceptorListener;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/heytap/store/base/core/util/deeplink/DeeplinkHelper$RnGlobalInterceptorListener;", "", "onInterceptor", "", "contextParma", "Landroid/content/Context;", "postcard", "Lcom/heytap/store/platform/htrouter/facade/Postcard;", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface RnGlobalInterceptorListener {
        boolean onInterceptor(@NotNull Context contextParma, @NotNull PostCard postcard);
    }

    private DeeplinkHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void useHTAilasRouter(Activity activity, String jumpUrl, Bundle bundle, NavigationCallback newRouterCallback) throws InterruptedException {
        HTAliasRouter companion = HTAliasRouter.INSTANCE.getInstance();
        String strAddSchemeForUrl = DeepLinekUtilKt.addSchemeForUrl(jumpUrl);
        if (strAddSchemeForUrl == null) {
            strAddSchemeForUrl = "";
        }
        HTAliasRouter.navigation$default(companion, strAddSchemeForUrl, activity, null, bundle, newRouterCallback, 0, false, 96, null);
    }

    public static /* synthetic */ void useHTAilasRouter$default(DeeplinkHelper deeplinkHelper, Activity activity, String str, Bundle bundle, NavigationCallback navigationCallback, int i, Object obj) throws InterruptedException {
        if ((i & 4) != 0) {
            bundle = null;
        }
        if ((i & 8) != 0) {
            navigationCallback = null;
        }
        deeplinkHelper.useHTAilasRouter(activity, str, bundle, navigationCallback);
    }

    @Nullable
    public final RnGlobalInterceptorListener getOnRnGlobalInterceptorListener() {
        return onRnGlobalInterceptorListener;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x001a  */
    public final void navigation(@NotNull final Activity activity, @Nullable final String jumpUrl, @Nullable IInterceptor iInterceptor, boolean isOutSidePull, int enter_id, @Nullable final Bundle bundle, @Nullable final com.heytap.store.base.core.util.deeplink.navigationcallback.NavigationCallback callback, @Nullable final NavigationCallback newRouterCallback) throws InterruptedException {
        boolean z;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Log.d("DeeplinkHelper", Intrinsics.stringPlus("router ", jumpUrl));
        DeepLinkInterpreter deepLinkInterpreter = new DeepLinkInterpreter(jumpUrl, iInterceptor, isOutSidePull, enter_id);
        if (jumpUrl != null) {
            z = StringsKt__StringsKt.contains$default((CharSequence) jumpUrl, (CharSequence) "&deeplink=true", false, 2, (Object) null);
        }
        if (z) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(StringsKt__StringsJVMKt.replace$default(jumpUrl, "&deeplink=true", "", false, 4, (Object) null)));
            activity.startActivity(intent);
            return;
        }
        if ((jumpUrl != null && StringsKt__StringsJVMKt.startsWith$default(jumpUrl, "http", false, 2, null)) || deepLinkInterpreter.findCommand()) {
            deepLinkInterpreter.operate(activity, new com.heytap.store.base.core.util.deeplink.navigationcallback.NavigationCallback() { // from class: com.heytap.store.base.core.util.deeplink.DeeplinkHelper.navigation.1
                @Override // com.heytap.store.base.core.util.deeplink.navigationcallback.NavigationCallback
                public void onArrival(@Nullable DeepLinkInterpreter urlInterpreter) {
                    com.heytap.store.base.core.util.deeplink.navigationcallback.NavigationCallback navigationCallback = callback;
                    if (navigationCallback == null) {
                        return;
                    }
                    navigationCallback.onArrival(urlInterpreter);
                }

                @Override // com.heytap.store.base.core.util.deeplink.navigationcallback.NavigationCallback
                public void onInterrupt(@Nullable DeepLinkInterpreter urlInterpreter) {
                    com.heytap.store.base.core.util.deeplink.navigationcallback.NavigationCallback navigationCallback = callback;
                    if (navigationCallback == null) {
                        return;
                    }
                    navigationCallback.onInterrupt(urlInterpreter);
                }

                @Override // com.heytap.store.base.core.util.deeplink.navigationcallback.NavigationCallback
                public void onUnArrival(@Nullable DeepLinkInterpreter urlInterpreter, @Nullable String msg) throws InterruptedException {
                    com.heytap.store.base.core.util.deeplink.navigationcallback.NavigationCallback navigationCallback = callback;
                    if (navigationCallback != null) {
                        navigationCallback.onUnArrival(urlInterpreter, msg);
                    }
                    DeeplinkHelper deeplinkHelper = DeeplinkHelper.INSTANCE;
                    Activity activity2 = activity;
                    String str = jumpUrl;
                    if (str == null) {
                        str = "";
                    }
                    deeplinkHelper.useHTAilasRouter(activity2, str, bundle, newRouterCallback);
                }
            });
            return;
        }
        deepLinkInterpreter.deepLinkStatistics("");
        if (jumpUrl == null) {
            jumpUrl = "";
        }
        useHTAilasRouter(activity, jumpUrl, bundle, newRouterCallback);
    }

    public final void setOnRnGlobalInterceptorListener(@Nullable RnGlobalInterceptorListener rnGlobalInterceptorListener) {
        onRnGlobalInterceptorListener = rnGlobalInterceptorListener;
    }
}
