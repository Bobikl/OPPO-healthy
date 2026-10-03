package com.heytap.nearx.tangramconfig.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.SystemClock;
import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.nearx.tangramconfig.device.SystemPropertyReflect;
import com.heytap.nearx.tangramconfig.kit.client.MspKitConstants;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.utrace.utils.SystemSettingsUtilsKt;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\u0013\u001a\u00020\u000eJ\u0006\u0010\u0014\u001a\u00020\u000eJ\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/heytap/nearx/tangramconfig/util/AppInfoUtil;", "", "()V", "FBE", "", "RO_CRYPTO_TYPE", "TAG", "getAppName", "context", "Landroid/content/Context;", "getAppPkgInfo", "Landroid/content/pm/PackageInfo;", "packageName", "getLogEnable", "", "getMspAppInfo", "getMspAppVersionCode", "", "getPackageName", "inBootTime", "isFBEVersion", "isMcsKitAvailable", "isServiceAvailable", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AppInfoUtil {

    @NotNull
    private static final String FBE = "file";

    @NotNull
    private static final String RO_CRYPTO_TYPE = "ro.crypto.type";

    @NotNull
    public static final AppInfoUtil INSTANCE = new AppInfoUtil();

    @NotNull
    private static final String TAG = "AppInfoUtil";

    private AppInfoUtil() {
    }

    @NotNull
    public final String getAppName(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            CharSequence applicationLabel = context.getPackageManager().getApplicationLabel(context.getApplicationInfo());
            Intrinsics.checkNotNull(applicationLabel, "null cannot be cast to non-null type kotlin.String");
            return (String) applicationLabel;
        } catch (Throwable th) {
            LogUtils logUtils = LogUtils.INSTANCE;
            String str = TAG;
            String message = th.getMessage();
            if (message == null) {
                message = "getPackageNameError";
            }
            logUtils.w(str, message, th, new Object[0]);
            return "0";
        }
    }

    @Nullable
    public final PackageInfo getAppPkgInfo(@NotNull Context context, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            return context.getPackageManager().getPackageInfo(packageName, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            LogUtils logUtils = LogUtils.INSTANCE;
            String str = TAG;
            String message = e2.getMessage();
            if (message == null) {
                message = "getAppPkgInfo";
            }
            logUtils.w(str, message, e2, new Object[0]);
            return null;
        }
    }

    public final boolean getLogEnable() {
        SystemPropertyReflect systemPropertyReflect = SystemPropertyReflect.INSTANCE;
        return Boolean.parseBoolean(systemPropertyReflect.get("persist.sys.assert.panic", SpeechConstant.FALSE_STR)) || Boolean.parseBoolean(systemPropertyReflect.get(SystemSettingsUtilsKt.LOG_ON_MKT, SpeechConstant.FALSE_STR));
    }

    @Nullable
    public final PackageInfo getMspAppInfo(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return isMcsKitAvailable(context) ? getAppPkgInfo(context, "com.heytap.mcs") : getAppPkgInfo(context, "com.heytap.htms");
    }

    public final int getMspAppVersionCode(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        PackageInfo mspAppInfo = getMspAppInfo(context);
        if (mspAppInfo != null) {
            return mspAppInfo.versionCode;
        }
        return 0;
    }

    @NotNull
    public final String getPackageName(@NotNull Context context) {
        String packageName;
        Throwable th;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            try {
                LogUtils.w$default(LogUtils.INSTANCE, TAG, "------ packageName : " + packageName, null, new Object[0], 4, null);
            } catch (Throwable th2) {
                th = th2;
                LogUtils logUtils = LogUtils.INSTANCE;
                String str = TAG;
                String message = th.getMessage();
                if (message == null) {
                    message = "getPackageNameError";
                }
                logUtils.w(str, message, th, new Object[0]);
            }
        } catch (Throwable th3) {
            packageName = "0";
            th = th3;
        }
        return packageName;
    }

    public final boolean inBootTime() {
        return SystemClock.elapsedRealtime() < 600000;
    }

    public final boolean isFBEVersion() {
        return Intrinsics.areEqual("file", SystemProperty.INSTANCE.get(RO_CRYPTO_TYPE));
    }

    public final boolean isMcsKitAvailable(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return !isServiceAvailable(context, "com.heytap.htms") && isServiceAvailable(context, "com.heytap.mcs");
    }

    public final boolean isServiceAvailable(@NotNull Context context, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(packageName, MspKitConstants.TARGET_SERVICE_CLASS));
            List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
            Intrinsics.checkNotNullExpressionValue(listQueryIntentServices, "context.packageManager.q…IntentServices(intent, 0)");
            return listQueryIntentServices.isEmpty() ^ true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
