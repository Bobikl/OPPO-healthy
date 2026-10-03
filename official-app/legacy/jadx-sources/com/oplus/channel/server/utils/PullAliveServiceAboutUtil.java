package com.oplus.channel.server.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/oplus/channel/server/utils/PullAliveServiceAboutUtil;", "", "()V", "PULL_ALIVE_SERVICE_ACTION", "", "PULL_ALIVE_SERVICE_NAME", "SDK_VERSION_Q", "", "TAG", "isLessThanVersionQ", "", "isPullAliveServiceInstalled", "context", "Landroid/content/Context;", "packageName", "server_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PullAliveServiceAboutUtil {

    @NotNull
    public static final PullAliveServiceAboutUtil INSTANCE = new PullAliveServiceAboutUtil();

    @NotNull
    private static final String PULL_ALIVE_SERVICE_ACTION = "oplus.cardwidget.action.PULL_ALIVE_SERVICE";

    @NotNull
    private static final String PULL_ALIVE_SERVICE_NAME = "com.oplus.channel.client.service.PullAliveService";
    private static final int SDK_VERSION_Q = 29;

    @NotNull
    public static final String TAG = "PullAliveServiceAboutUtil";

    private PullAliveServiceAboutUtil() {
    }

    @JvmStatic
    public static final boolean isLessThanVersionQ() {
        return false;
    }

    @JvmStatic
    public static final boolean isPullAliveServiceInstalled(@NotNull Context context, @NotNull String packageName) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            Result.Companion companion = Result.INSTANCE;
            Intent intent = new Intent(PULL_ALIVE_SERVICE_ACTION);
            ComponentName componentName = new ComponentName(packageName, "com.oplus.channel.client.service.PullAliveService");
            List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
            Intrinsics.checkNotNullExpressionValue(listQueryIntentServices, "context.packageManager.q…IntentServices(intent, 0)");
            Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null && Intrinsics.areEqual(componentName, new ComponentName(serviceInfo.packageName, serviceInfo.name))) {
                    return true;
                }
            }
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            LogUtil.w(TAG, "isPullAliveServiceInstalled e = [" + ((Object) thM5290exceptionOrNullimpl.getMessage()) + ']');
        }
        return false;
    }
}
