package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/noc;", "", "Landroid/content/Context;", "context", "", "a", "<init>", "()V", "paysdk_web_release"}, k = 1, mv = {1, 8, 0})
public final class noc {

    @NotNull
    public static final noc INSTANCE = new noc();

    @JvmStatic
    @SuppressLint({"MissingPermission"})
    public static final boolean a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return ((ConnectivityManager) systemService).getActiveNetworkInfo() != null;
    }
}
