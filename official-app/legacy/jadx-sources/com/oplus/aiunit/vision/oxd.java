package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/oxd;", "", "Landroid/content/Context;", "context", "", "packageName", "", "a", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getB_NULL", "()Ljava/lang/Boolean;", "B_NULL", "<init>", "()V", "paysdk_deeplink_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOutsideApk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutsideApk.kt\ncom/oplus/pay/opensdk/deeplink/router/link/util/OutsideApk\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1#2:45\n*E\n"})
public final class oxd {

    @NotNull
    public static final oxd INSTANCE = new oxd();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static final Boolean B_NULL = null;

    @JvmStatic
    @Nullable
    public static final Boolean a(@Nullable Context context, @Nullable String packageName) {
        PackageManager packageManager;
        if (Build.VERSION.SDK_INT < 30) {
            return Boolean.TRUE;
        }
        ApplicationInfo applicationInfo = null;
        if (context != null) {
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException e2) {
                String message = e2.getMessage();
                if (message != null) {
                    bae.INSTANCE.d(message);
                }
            }
        } else {
            packageManager = null;
        }
        if (packageName != null && packageManager != null) {
            applicationInfo = packageManager.getApplicationInfo(packageName, 128);
        }
        if (applicationInfo != null) {
            return Boolean.valueOf(applicationInfo.enabled);
        }
        return B_NULL;
    }
}
