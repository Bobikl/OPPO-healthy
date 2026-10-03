package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import io.protostuff.MapSchema;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringNumberConversionsKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b$\u0010%J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J \u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001dR,\u0010#\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001c0 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\"¨\u0006&"}, d2 = {"Lcom/oplus/aiunit/vision/p0;", "", "Landroid/content/Context;", "context", "", "key", "d", TraceConstants.KEY_PKG_NAME, MapSchema.FIELD_NAME_ENTRY, "", "i", "", b2n.f, "f", b2n.g, "b", "a", "c", "META_KEY_DOWNLOAD_ENABLE", "Ljava/lang/String;", "META_KEY_DOWNLOAD_GROUP", "I", SpeechConstant.KEY_APP_VERSION, "Ljava/lang/Boolean;", "metaDownloadEnable", "metaDownloadGroup", "Ljava/lang/Integer;", "coreSdkVersion", "Landroid/os/Bundle;", "Landroid/os/Bundle;", "packageMetaData", "Ljava/util/concurrent/ConcurrentMap;", "Lkotlin/Pair;", "", "Ljava/util/concurrent/ConcurrentMap;", "cacheMetaDataMap", "<init>", "()V", "aiunit.sdk.toolkits_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAIUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIUtil.kt\ncom/oplus/aiunit/core/utils/AIUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n1#2:215\n*E\n"})
public final class p0 {

    @NotNull
    public static final String META_KEY_DOWNLOAD_ENABLE = "aiunit_download_enable";

    @NotNull
    public static final String META_KEY_DOWNLOAD_GROUP = "aiunit_download_group";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static int appVersion;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static Boolean metaDownloadEnable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static String metaDownloadGroup;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static Integer coreSdkVersion;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static Bundle packageMetaData;

    @NotNull
    public static final p0 INSTANCE = new p0();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentMap<String, Pair<Long, Bundle>> cacheMetaDataMap = new ConcurrentHashMap();

    @JvmStatic
    public static final int a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Integer num = coreSdkVersion;
        if (num != null) {
            return num.intValue();
        }
        Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(d(context, "protocol_version_codes"));
        int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
        coreSdkVersion = Integer.valueOf(iIntValue);
        return iIntValue;
    }

    @JvmStatic
    public static final boolean b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Boolean bool = metaDownloadEnable;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean booleanStrictOrNull = StringsKt__StringsKt.toBooleanStrictOrNull(d(context, META_KEY_DOWNLOAD_ENABLE));
        boolean zBooleanValue = booleanStrictOrNull != null ? booleanStrictOrNull.booleanValue() : false;
        metaDownloadEnable = Boolean.valueOf(zBooleanValue);
        return zBooleanValue;
    }

    @JvmStatic
    @NotNull
    public static final String c(@NotNull Context context) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = metaDownloadGroup;
        if (str != null) {
            return str;
        }
        String strD = d(context, META_KEY_DOWNLOAD_GROUP);
        metaDownloadGroup = strD;
        return strD;
    }

    @JvmStatic
    @NotNull
    public static final String d(@NotNull Context context, @NotNull String key) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundle = packageMetaData;
        if (bundle != null) {
            return String.valueOf(bundle.get(key));
        }
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
        Bundle bundle2 = applicationInfo.metaData;
        if (bundle2 == null) {
            return "";
        }
        packageMetaData = bundle2;
        return String.valueOf(bundle2.get(key));
    }

    @JvmStatic
    @NotNull
    public static final String e(@NotNull Context context, @NotNull String pkgName, @NotNull String key) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pkgName, "pkgName");
        Intrinsics.checkNotNullParameter(key, "key");
        long jCurrentTimeMillis = System.currentTimeMillis();
        ConcurrentMap<String, Pair<Long, Bundle>> concurrentMap = cacheMetaDataMap;
        Pair<Long, Bundle> pair = concurrentMap.get(pkgName);
        if (pair != null) {
            if (!(jCurrentTimeMillis - pair.getFirst().longValue() < 300000)) {
                pair = null;
            }
            if (pair != null) {
                return String.valueOf(pair.getSecond().get(key));
            }
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(pkgName, 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null) {
                return "";
            }
            concurrentMap.put(pkgName, new Pair<>(Long.valueOf(jCurrentTimeMillis), bundle));
            return String.valueOf(bundle.get(key));
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    @JvmStatic
    public static final int f(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = appVersion;
        if (i > 0) {
            return i;
        }
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        int iG = g(context, packageName);
        appVersion = iG;
        return iG;
    }

    @JvmStatic
    public static final int g(@NotNull Context context, @NotNull String pkgName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pkgName, "pkgName");
        try {
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
            return packageManager.getPackageInfo(pkgName, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    @JvmStatic
    @SuppressLint({"MissingPermission"})
    public static final boolean h(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            return networkCapabilities != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
        } catch (Throwable th) {
            i0.c("AIUtil", "isInternetValidated check err. " + th);
            return false;
        }
    }

    @JvmStatic
    public static final boolean i(@NotNull Context context, @NotNull String pkgName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pkgName, "pkgName");
        return Boolean.parseBoolean(e(context, pkgName, "supportAIUnitAndOcrService"));
    }
}
