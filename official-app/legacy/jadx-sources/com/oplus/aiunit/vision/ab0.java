package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/ab0;", "", "Landroid/content/Context;", "context", "", "a", "", "packageName", "b", "TAG", "Ljava/lang/String;", "APP_USAGE_PACKAGE", "REMOTE_GUARD_SERVICE_PACKAGE", "SUPPORT_PHONE_LIMIT", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class ab0 {
    public static final int $stable = 0;

    @NotNull
    public static final String APP_USAGE_PACKAGE = "com.coloros.digitalwellbeing";

    @NotNull
    public static final ab0 INSTANCE = new ab0();

    @NotNull
    public static final String REMOTE_GUARD_SERVICE_PACKAGE = "com.coloros.remoteguardservice";

    @NotNull
    public static final String SUPPORT_PHONE_LIMIT = "support_phone_limit";

    @NotNull
    public static final String TAG = "AppInfoUtils";

    public final boolean a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return b(context, "com.coloros.remoteguardservice") && b(context, "com.coloros.digitalwellbeing");
    }

    public final boolean b(Context context, String packageName) {
        Object objM5287constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(packageName, 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "context.packageManager.g…ageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle.keySet().contains("support_phone_limit")) {
                return bundle.getBoolean("support_phone_limit", false);
            }
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
            Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
            if (thM5290exceptionOrNullimpl != null) {
                a7b.b("AppInfoUtils", "isSupportLimitPhone error:" + thM5290exceptionOrNullimpl.getMessage());
            }
            return false;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
    }
}
