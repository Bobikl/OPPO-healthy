package com.customer.feedback.sdk.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/customer/feedback/sdk/util/NetworkUtil;", "", "()V", "TAG", "", "hasNetworkConnect", "", "context", "Landroid/content/Context;", "isEthernetConnected", "isMobileDataConnected", "isWifiConnected", "Feedback_sdkRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NetworkUtil {

    @NotNull
    public static final NetworkUtil INSTANCE = new NetworkUtil();

    @NotNull
    public static final String TAG = "NoNetworkUtil";

    private NetworkUtil() {
    }

    @JvmStatic
    public static final boolean hasNetworkConnect(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return isMobileDataConnected(context) || isWifiConnected(context) || isEthernetConnected(context);
    }

    @JvmStatic
    public static final boolean isEthernetConnected(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo networkInfo = ((ConnectivityManager) systemService).getNetworkInfo(9);
        return (networkInfo != null ? networkInfo.getState() : null) == NetworkInfo.State.CONNECTED;
    }

    @JvmStatic
    public static final boolean isMobileDataConnected(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo networkInfo = ((ConnectivityManager) systemService).getNetworkInfo(0);
        return (networkInfo != null ? networkInfo.getState() : null) == NetworkInfo.State.CONNECTED;
    }

    @JvmStatic
    public static final boolean isWifiConnected(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo networkInfo = ((ConnectivityManager) systemService).getNetworkInfo(1);
        return (networkInfo != null ? networkInfo.getState() : null) == NetworkInfo.State.CONNECTED;
    }
}
