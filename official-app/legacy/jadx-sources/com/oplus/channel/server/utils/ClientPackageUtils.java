package com.oplus.channel.server.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/oplus/channel/server/utils/ClientPackageUtils;", "", "()V", "CLIENT_SDK_VERSION", "", "TAG", "getClientSdkVersionCode", "context", "Landroid/content/Context;", "packageName", "getClientVersionCode", "server_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ClientPackageUtils {

    @NotNull
    private static final String CLIENT_SDK_VERSION = "cardwidget.support.client.version.code";

    @NotNull
    public static final ClientPackageUtils INSTANCE = new ClientPackageUtils();

    @NotNull
    public static final String TAG = "ClientPackageUtils";

    private ClientPackageUtils() {
    }

    @JvmStatic
    @NotNull
    public static final String getClientSdkVersionCode(@NotNull Context context, @NotNull String packageName) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        String strValueOf = "0";
        try {
            Result.Companion companion = Result.INSTANCE;
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(packageName, 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "packageManager.getApplic…ageManager.GET_META_DATA)");
            strValueOf = String.valueOf(applicationInfo.metaData.getInt(CLIENT_SDK_VERSION));
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            LogUtil.e(TAG, Intrinsics.stringPlus("getClientSdkVersionCode error : ", thM5290exceptionOrNullimpl.getMessage()));
        }
        return strValueOf;
    }

    @JvmStatic
    @NotNull
    public static final String getClientVersionCode(@NotNull Context context, @NotNull String packageName) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        String strValueOf = "0";
        try {
            Result.Companion companion = Result.INSTANCE;
            strValueOf = String.valueOf(context.getPackageManager().getPackageInfo(packageName, 0).versionCode);
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            LogUtil.e(TAG, Intrinsics.stringPlus("getClientVersionCode error : ", thM5290exceptionOrNullimpl.getMessage()));
        }
        return strValueOf;
    }
}
