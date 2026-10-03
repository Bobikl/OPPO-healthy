package com.heytap.store.platform.tools;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Process;
import com.coloros.sceneservice.m.a;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\f\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\r¨\u0006\u0014"}, d2 = {"Lcom/heytap/store/platform/tools/AppUtils;", "", "()V", "getActivityByContext", "Landroid/app/Activity;", "context", "Landroid/content/Context;", "getActivityByContextInner", "getActivityFromDecorContext", "getLauncherActivity", "", "pkg", "isActivityAlive", "", "activity", "isAppInstalled", TraceConstants.KEY_PKG_NAME, "relaunchApp", "", "isKillProcess", "utils_release"}, k = 1, mv = {1, 4, 0})
public final class AppUtils {
    public static final AppUtils INSTANCE = new AppUtils();

    private AppUtils() {
    }

    private final Activity getActivityByContextInner(Context context) {
        if (context == null) {
            return null;
        }
        new ArrayList();
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            Activity activityFromDecorContext = getActivityFromDecorContext(context);
            if (activityFromDecorContext != null) {
                return activityFromDecorContext;
            }
        }
        return null;
    }

    private final Activity getActivityFromDecorContext(Context context) {
        if (context != null && Intrinsics.areEqual(context.getClass().getName(), "com.android.internal.policy.DecorContext")) {
            try {
                Field declaredField = context.getClass().getDeclaredField("mActivityContext");
                Intrinsics.checkNotNullExpressionValue(declaredField, "context.javaClass.getDec…Field(\"mActivityContext\")");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(context);
                if (obj != null) {
                    return (Activity) ((WeakReference) obj).get();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.ref.WeakReference<*>");
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Nullable
    public final Activity getActivityByContext(@Nullable Context context) {
        Activity activityByContextInner = getActivityByContextInner(context);
        if (isActivityAlive(activityByContextInner)) {
            return activityByContextInner;
        }
        return null;
    }

    @NotNull
    public final String getLauncherActivity(@Nullable String pkg) {
        if (pkg == null || StringsKt__StringsJVMKt.isBlank(pkg)) {
            return "";
        }
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(pkg);
        PackageManager packageManager = ContextGetterUtils.INSTANCE.getApp().getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "ContextGetterUtils.getApp().packageManager");
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        if (listQueryIntentActivities == null || listQueryIntentActivities.isEmpty()) {
            return "";
        }
        String str = listQueryIntentActivities.get(0).activityInfo.name;
        Intrinsics.checkNotNullExpressionValue(str, "info[0].activityInfo.name");
        return str;
    }

    public final boolean isActivityAlive(@Nullable Context context) {
        return isActivityAlive(getActivityByContext(context));
    }

    public final boolean isAppInstalled(@Nullable String pkgName) {
        if (pkgName == null || StringsKt__StringsJVMKt.isBlank(pkgName)) {
            return false;
        }
        PackageManager packageManager = ContextGetterUtils.INSTANCE.getApp().getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "ContextGetterUtils.getApp().packageManager");
        try {
            return packageManager.getApplicationInfo(pkgName, 0).enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final void relaunchApp() {
        relaunchApp(false);
    }

    public final boolean isActivityAlive(@Nullable Activity activity) {
        return (activity == null || activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    public final void relaunchApp(boolean isKillProcess) {
        IntentUtils intentUtils = IntentUtils.INSTANCE;
        ContextGetterUtils contextGetterUtils = ContextGetterUtils.INSTANCE;
        String packageName = contextGetterUtils.getApp().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "ContextGetterUtils.getApp().packageName");
        Intent launchAppIntent = intentUtils.getLaunchAppIntent(packageName);
        if (launchAppIntent == null) {
            LogUtils.INSTANCE.e(a.TAG, "Didn't exist launcher activity.");
            return;
        }
        launchAppIntent.addFlags(335577088);
        contextGetterUtils.getApp().startActivity(launchAppIntent);
        if (isKillProcess) {
            Process.killProcess(Process.myPid());
            System.exit(0);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
    }
}
