package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.wearable.linkservice.sdk.Node;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u001c\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007J\u001e\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/i80;", "", "Landroid/content/Context;", "context", "", "packageName", "", "d", TraceConstants.KEY_PKG_NAME, "", "a", "Landroid/os/Bundle;", "b", Node.I_KEY, "c", "<init>", "()V", "paysdk_deeplink_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nApkInfoHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApkInfoHelper.kt\ncom/oplus/pay/opensdk/deeplink/router/link/util/ApkInfoHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"})
public final class i80 {

    @NotNull
    public static final i80 INSTANCE = new i80();

    /* JADX WARN: Code duplicated, block: B:10:0x0014  */
    /* JADX WARN: Code duplicated, block: B:12:0x0017 A[Catch: Exception -> 0x0012, TryCatch #0 {Exception -> 0x0012, blocks: (B:5:0x0005, B:7:0x000b, B:12:0x0017, B:14:0x001b), top: B:20:0x0005 }] */
    @JvmStatic
    public static final boolean a(@Nullable Context context, @Nullable String pkgName) {
        PackageInfo packageInfo;
        if (pkgName == null || context == null) {
            packageInfo = null;
            if ((packageInfo != null ? packageInfo.applicationInfo : null) == null && packageInfo.applicationInfo.enabled) {
                return true;
            }
        } else {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageInfo = packageManager.getPackageInfo(pkgName, 8192);
                } else {
                    packageInfo = null;
                }
                if ((packageInfo != null ? packageInfo.applicationInfo : null) == null) {
                }
            } catch (Exception e) {
                ace.INSTANCE.d("appExistByPkgName = " + e.getMessage());
            }
        }
        return false;
    }

    @JvmStatic
    @Nullable
    public static final Bundle b(@Nullable Context context, @Nullable String packageName) {
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        if (context != null) {
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException e) {
                ace.INSTANCE.d("getMetaData = " + e);
                return null;
            }
        } else {
            packageManager = null;
        }
        if (packageName == null || packageManager == null || (applicationInfo = packageManager.getApplicationInfo(packageName, 128)) == null) {
            return null;
        }
        return applicationInfo.metaData;
    }

    @JvmStatic
    public static final int d(@Nullable Context context, @Nullable String packageName) {
        if (context == null || packageName == null) {
            ace.INSTANCE.d("Context or packageName is null");
            return 0;
        }
        try {
            return context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
        } catch (Exception e) {
            ace.INSTANCE.d(e.toString());
            return 0;
        }
    }

    @Nullable
    public final String c(@NotNull Context context, @NotNull String key) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, Node.I_KEY);
        try {
            Bundle bundle = context.getPackageManager().getPackageInfo(context.getPackageName(), 128).applicationInfo.metaData;
            String string = bundle.getString(key);
            if (string != null) {
                return string;
            }
            Integer numValueOf = Integer.valueOf(bundle.getInt(key));
            if (!(numValueOf.intValue() != 0)) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return numValueOf.toString();
            }
            return null;
        } catch (Exception e) {
            ace.INSTANCE.d("getMetaDataValue failed: " + e);
            return null;
        }
    }
}
