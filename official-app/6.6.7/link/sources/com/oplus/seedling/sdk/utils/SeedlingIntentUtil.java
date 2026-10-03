package com.oplus.seedling.sdk.utils;

import android.app.ActivityManager;
import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.UserHandle;
import android.os.UserManager;
import androidx.annotation.WorkerThread;
import com.oplus.aiunit.vision.ht9;
import com.oplus.aiunit.vision.s8e;
import com.oplus.aiunit.vision.v5d;
import com.oplus.channel.server.IUserContext;
import com.oplus.seedling.sdk.SeedlingSdk;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.wearable.linkservice.sdk.Node;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\rH\u0001¢\u0006\u0002\b\u001fJ\u0018\u0010 \u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u0004H\u0003J*\u0010\"\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020#H\u0003J\u0010\u0010&\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001dH\u0003J\u001e\u0010'\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040(H\u0007J\u0018\u0010)\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\nH\u0003J \u0010+\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0004H\u0003J\u0010\u0010.\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001dH\u0003J\u0010\u0010/\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u0015\u00100\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\b1J\u0015\u00102\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\b3J\u0015\u00104\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\b5R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/oplus/seedling/sdk/utils/SeedlingIntentUtil;", "", "()V", "AUTHORITIES", "", "BUNDLE_KEY_CALL_RESULT", "BUNDLE_KEY_FLUID_CLOUD_SUPPORT", "BUNDLE_KEY_SEEDLING_SUPPORT", "BUNDLE_KEY_SYSTEM_INTENT_SUPPORT", "CACHE_TIME_DURING", "", "CANCEL_INTENT", "INTENT_PROVIDER_URI", "Landroid/net/Uri;", "KEY_CANCEL_PACKAGE", "KEY_IS_USER_UNLOCKED", "META_KEY_SEEDLING_CARD_SUPPORT", "METHOD_CANCEL_INTENTS", "METHOD_FLUID_CLOUD_SUPPORT", "METHOD_INTENT_ERROR", "", "METHOD_SEEDLING_SUPPORT", "METHOD_SYSTEM_INTENT_SUPPORT", "TAG", "keyCacheTimeMap", "Ljava/util/concurrent/ConcurrentHashMap;", "acquireUnstableContentProviderClient", "Landroid/content/ContentProviderClient;", "context", "Landroid/content/Context;", ParserTag.TAG_URI, "acquireUnstableContentProviderClient$pantanal_client_release", "cancelIntent", "packageName", "getBooleanMetaValue", "", Node.I_KEY, "defaultValue", "getIsSupportSeedlingMetaValue", "hostBeKilled", "", "isInCacheTime", "currentTimeFromBoot", "isSupportFeatureFromUms", "callMethodName", "bundleKey", "isSystemUser", SeedlingIntentUtil.KEY_IS_USER_UNLOCKED, "queryIsSeedlingSupport", "queryIsSeedlingSupport$pantanal_client_release", "queryIsSupportFluidCloud", "queryIsSupportFluidCloud$pantanal_client_release", "queryIsSystemSendIntentSupport", "queryIsSystemSendIntentSupport$pantanal_client_release", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SeedlingIntentUtil {

    @NotNull
    private static final String AUTHORITIES = "com.oplus.pantanal.ums.IntentProvider";

    @NotNull
    private static final String BUNDLE_KEY_CALL_RESULT = "result";

    @NotNull
    private static final String BUNDLE_KEY_FLUID_CLOUD_SUPPORT = "is_fluid_cloud_support";

    @NotNull
    private static final String BUNDLE_KEY_SEEDLING_SUPPORT = "is_seedling_support";

    @NotNull
    private static final String BUNDLE_KEY_SYSTEM_INTENT_SUPPORT = "is_system_send_intent_support";
    private static final long CACHE_TIME_DURING = 3000;

    @NotNull
    private static final String CANCEL_INTENT = "content://com.oplus.pantanal.ums.IntentProvider";

    @NotNull
    public static final SeedlingIntentUtil INSTANCE = new SeedlingIntentUtil();

    @NotNull
    private static final Uri INTENT_PROVIDER_URI;

    @NotNull
    private static final String KEY_CANCEL_PACKAGE = "packageName";

    @NotNull
    private static final String KEY_IS_USER_UNLOCKED = "isUserUnlocked";

    @NotNull
    private static final String META_KEY_SEEDLING_CARD_SUPPORT = "isSeedlingCardSupport";

    @NotNull
    private static final String METHOD_CANCEL_INTENTS = "cancel_intents";

    @NotNull
    private static final String METHOD_FLUID_CLOUD_SUPPORT = "isFluidCloudSupport";
    private static final int METHOD_INTENT_ERROR = 0;

    @NotNull
    private static final String METHOD_SEEDLING_SUPPORT = "isSeedlingSupport";

    @NotNull
    private static final String METHOD_SYSTEM_INTENT_SUPPORT = "isSystemSendIntentSupport";

    @NotNull
    private static final String TAG = "SeedlingIntentUtil";

    @NotNull
    private static final ConcurrentHashMap<String, Long> keyCacheTimeMap;

    static {
        Uri uri = Uri.parse("content://com.oplus.pantanal.ums.IntentProvider");
        Intrinsics.checkNotNullExpressionValue(uri, "parse(CANCEL_INTENT)");
        INTENT_PROVIDER_URI = uri;
        keyCacheTimeMap = new ConcurrentHashMap<>();
    }

    private SeedlingIntentUtil() {
    }

    @JvmStatic
    @Nullable
    public static final ContentProviderClient acquireUnstableContentProviderClient$pantanal_client_release(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, ParserTag.TAG_URI);
        String str = "acquireUnstableContentProviderClient, uri:" + uri + ", pgkName:" + context.getPackageName();
        SeedlingSdk seedlingSdk = SeedlingSdk.INSTANCE;
        if (seedlingSdk.getCurUserContext$pantanal_client_release() == null) {
            ht9.a.c(s8e.INSTANCE, TAG, str + ", use normal context", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }
        ht9.a.c(s8e.INSTANCE, TAG, str + ", use userContext", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        IUserContext curUserContext$pantanal_client_release = seedlingSdk.getCurUserContext$pantanal_client_release();
        if (curUserContext$pantanal_client_release != null) {
            return curUserContext$pantanal_client_release.acquireUnstableContentProviderClient(uri);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x011d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0146  */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x011d, please report this as an issue */
    @JvmStatic
    @WorkerThread
    private static final int cancelIntent(Context context, String packageName) {
        int i;
        Object obj;
        Throwable th;
        String str = "cancelIntent entrancePkgName:" + context.getPackageName();
        s8e s8eVar = s8e.INSTANCE;
        ht9.a.c(s8eVar, TAG, str + ", host be killed cancel: " + packageName, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        try {
            Result.Companion companion = Result.Companion;
            Bundle bundle = new Bundle();
            bundle.putString("packageName", StringsKt.replace$default(StringsKt.replace$default(packageName, "[", "", false, 4, (Object) null), "]", "", false, 4, (Object) null));
            Uri uri = Uri.parse("content://com.oplus.pantanal.ums.IntentProvider");
            Intrinsics.checkNotNullExpressionValue(uri, "parse(CANCEL_INTENT)");
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient$pantanal_client_release = acquireUnstableContentProviderClient$pantanal_client_release(context, uri);
            if (contentProviderClientAcquireUnstableContentProviderClient$pantanal_client_release == null) {
                ht9.a.b(s8eVar, TAG, str + " error, providerClient is null", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            } else {
                try {
                    Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient$pantanal_client_release.call(METHOD_CANCEL_INTENTS, null, bundle);
                    AutoCloseableKt.closeFinally(contentProviderClientAcquireUnstableContentProviderClient$pantanal_client_release, (Throwable) null);
                    if (bundleCall != null && bundleCall.containsKey("result")) {
                        i = bundleCall.getInt("result", 0);
                        try {
                            ht9.a.c(s8eVar, TAG, str + " result:" + i, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                            obj = Result.constructor-impl(Unit.INSTANCE);
                        } catch (Throwable th2) {
                            th = th2;
                            Result.Companion companion2 = Result.Companion;
                            obj = Result.constructor-impl(ResultKt.createFailure(th));
                        }
                        th = Result.exceptionOrNull-impl(obj);
                        if (th != null) {
                            return i;
                        }
                        ht9.a.b(s8e.INSTANCE, TAG, str + " onFailure, errorMsg:" + th.getMessage(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                        return 0;
                    }
                    ht9.a.b(s8eVar, TAG, str + " error, resultBundle:" + bundleCall, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AutoCloseableKt.closeFinally(contentProviderClientAcquireUnstableContentProviderClient$pantanal_client_release, th3);
                        throw th4;
                    }
                }
            }
            i = 0;
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th5) {
            th = th5;
            i = 0;
            Result.Companion companion3 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        th = Result.exceptionOrNull-impl(obj);
        if (th != null) {
            return i;
        }
        ht9.a.b(s8e.INSTANCE, TAG, str + " onFailure, errorMsg:" + th.getMessage(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        return 0;
    }

    @JvmStatic
    private static final boolean getBooleanMetaValue(Context context, String packageName, String key, boolean defaultValue) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            boolean z = context.getPackageManager().getApplicationInfo(packageName, 128).metaData.getBoolean(key);
            ht9.a.c(s8e.INSTANCE, TAG, "getBooleanMetaValue, key:" + key + ", value:" + z, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            ht9.a.b(s8e.INSTANCE, TAG, "getBooleanMetaValue error, key:" + key + ", errorMsg:" + th2.getMessage(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }
        return defaultValue;
    }

    public static /* synthetic */ boolean getBooleanMetaValue$default(Context context, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return getBooleanMetaValue(context, str, str2, z);
    }

    @JvmStatic
    private static final boolean getIsSupportSeedlingMetaValue(Context context) {
        return getBooleanMetaValue$default(context, "com.oplus.pantanal.ums", "isSeedlingCardSupport", false, 8, null);
    }

    @JvmStatic
    @WorkerThread
    public static final int hostBeKilled(@NotNull Context context, @NotNull List<String> packageName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        int iCancelIntent = cancelIntent(context, packageName.toString());
        ht9.a.c(s8e.INSTANCE, TAG, "hostBeKilled, cancelIntent:" + iCancelIntent, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        return iCancelIntent;
    }

    @JvmStatic
    private static final boolean isInCacheTime(String key, long currentTimeFromBoot) {
        Long l = keyCacheTimeMap.get(key);
        if (l == null) {
            return false;
        }
        l.longValue();
        if (Math.abs(currentTimeFromBoot - l.longValue()) >= CACHE_TIME_DURING) {
            return false;
        }
        ht9.a.c(s8e.INSTANCE, TAG, "isInCacheTime,key:" + key + " true, lastCacheTime=" + l + ", currentTimeFromBoot=" + currentTimeFromBoot, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0112  */
    /* JADX WARN: Code duplicated, block: B:43:0x013c  */
    /* JADX WARN: Code duplicated, block: B:45:0x013f  */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x0112, please report this as an issue */
    @JvmStatic
    @WorkerThread
    private static final boolean isSupportFeatureFromUms(Context context, String callMethodName, String bundleKey) {
        boolean z;
        Object obj;
        Throwable th;
        String str = "isSupportFeatureFromUms pgName:" + context.getPackageName() + ",callMethodName: " + callMethodName;
        boolean z2 = false;
        if (!isUserUnlocked(context)) {
            ht9.a.b(s8e.INSTANCE, TAG, str + " error, because isUserUnlocked is false", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (isInCacheTime(bundleKey, jElapsedRealtime)) {
            return true;
        }
        try {
            Result.Companion companion = Result.Companion;
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient$pantanal_client_release = acquireUnstableContentProviderClient$pantanal_client_release(context, INTENT_PROVIDER_URI);
            if (contentProviderClientAcquireUnstableContentProviderClient$pantanal_client_release == null) {
                ht9.a.b(s8e.INSTANCE, TAG, str + " error, because providerClient is null", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            } else {
                try {
                    Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient$pantanal_client_release.call(callMethodName, null, null);
                    AutoCloseableKt.closeFinally(contentProviderClientAcquireUnstableContentProviderClient$pantanal_client_release, (Throwable) null);
                    if (bundleCall != null && bundleCall.containsKey(bundleKey)) {
                        z = bundleCall.getBoolean(bundleKey);
                        try {
                            ht9.a.c(s8e.INSTANCE, TAG, str + " isSupport = " + z, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                            obj = Result.constructor-impl(Unit.INSTANCE);
                        } catch (Throwable th2) {
                            th = th2;
                            Result.Companion companion2 = Result.Companion;
                            obj = Result.constructor-impl(ResultKt.createFailure(th));
                        }
                        th = Result.exceptionOrNull-impl(obj);
                        if (th != null) {
                            ht9.a.b(s8e.INSTANCE, TAG, str + " error errorMsg = " + th.getMessage(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                        } else {
                            z2 = z;
                        }
                        if (z2) {
                            keyCacheTimeMap.put(bundleKey, Long.valueOf(jElapsedRealtime));
                        }
                        return z2;
                    }
                    ht9.a.b(s8e.INSTANCE, TAG, str + " error, resultBundle:" + bundleCall + ", bundleKey:" + bundleKey, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AutoCloseableKt.closeFinally(contentProviderClientAcquireUnstableContentProviderClient$pantanal_client_release, th3);
                        throw th4;
                    }
                }
            }
            z = false;
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th5) {
            th = th5;
            z = false;
        }
        th = Result.exceptionOrNull-impl(obj);
        if (th != null) {
            ht9.a.b(s8e.INSTANCE, TAG, str + " error errorMsg = " + th.getMessage(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        } else {
            z2 = z;
        }
        if (z2) {
            keyCacheTimeMap.put(bundleKey, Long.valueOf(jElapsedRealtime));
        }
        return z2;
    }

    @JvmStatic
    private static final boolean isSystemUser(Context context) {
        Object obj;
        String packageName = context.getPackageName();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        boolean zIsSystemUser = true;
        booleanRef.element = true;
        try {
            Result.Companion companion = Result.Companion;
            Object obj2 = UserHandle.class.getField("USER_SYSTEM").get(null);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj2).intValue();
            Object objInvoke = ActivityManager.class.getDeclaredMethod("getCurrentUser", new Class[0]).invoke(null, new Object[0]);
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue2 = ((Integer) objInvoke).intValue();
            boolean z = iIntValue2 == iIntValue;
            booleanRef.element = z;
            ht9.a.c(s8e.INSTANCE, TAG, "by reflection, isSystemUser = " + z + ", packageName:" + packageName + ", userId:" + iIntValue2 + ", userSystem:" + iIntValue, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            String str = "isSystemUser error, packageName:" + packageName + ", errorMsg:" + th2.getMessage();
            s8e s8eVar = s8e.INSTANCE;
            ht9.a.b(s8eVar, TAG, str, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            Object systemService = context.getSystemService("user");
            UserManager userManager = systemService instanceof UserManager ? (UserManager) systemService : null;
            if (userManager != null) {
                zIsSystemUser = userManager.isSystemUser();
            } else {
                ht9.a.e(s8eVar, TAG, "isSystemUser = null, default = true ", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            }
            booleanRef.element = zIsSystemUser;
            ht9.a.c(s8eVar, TAG, "by getService, isSystemUser = " + zIsSystemUser + ", packageName:" + packageName, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }
        return booleanRef.element;
    }

    @JvmStatic
    public static final boolean isUserUnlocked(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = "isUserUnlocked, pkgName:" + context.getPackageName();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zBooleanValue = true;
        if (isInCacheTime(KEY_IS_USER_UNLOCKED, jElapsedRealtime)) {
            return true;
        }
        Object systemService = context.getSystemService("user");
        Boolean boolValueOf = null;
        UserManager userManager = systemService instanceof UserManager ? (UserManager) systemService : null;
        IUserContext curUserContext$pantanal_client_release = SeedlingSdk.INSTANCE.getCurUserContext$pantanal_client_release();
        UserHandle userHandle = curUserContext$pantanal_client_release != null ? curUserContext$pantanal_client_release.getUserHandle() : null;
        if (userHandle != null) {
            ht9.a.c(s8e.INSTANCE, TAG, str + " with userHandle:" + userHandle, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            if (userManager != null) {
                boolValueOf = Boolean.valueOf(userManager.isUserUnlocked(userHandle));
            }
        } else {
            ht9.a.c(s8e.INSTANCE, TAG, str + " without userHandle", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            if (userManager != null) {
                boolValueOf = Boolean.valueOf(userManager.isUserUnlocked());
            }
        }
        if (boolValueOf != null) {
            zBooleanValue = boolValueOf.booleanValue();
        } else {
            ht9.a.e(s8e.INSTANCE, TAG, str + " isUserUnlocked = null, default = true", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }
        if (zBooleanValue) {
            keyCacheTimeMap.put(KEY_IS_USER_UNLOCKED, Long.valueOf(jElapsedRealtime));
        }
        ht9.a.c(s8e.INSTANCE, TAG, str + " isUserUnlocked = " + zBooleanValue, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        return zBooleanValue;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:42:0x011a  */
    /* JADX WARN: Code duplicated, block: B:44:0x011d  */
    /* JADX WARN: Code duplicated, block: B:45:0x011f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0125  */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x00ed, please report this as an issue */
    @JvmStatic
    @WorkerThread
    public static final boolean queryIsSeedlingSupport$pantanal_client_release(@NotNull Context context) {
        boolean z;
        boolean z2;
        Object obj;
        Throwable th;
        boolean isSupportSeedlingMetaValue;
        Intrinsics.checkNotNullParameter(context, "context");
        String str = "queryIsSeedlingSupport pgName:" + context.getPackageName();
        boolean z3 = false;
        if (!isUserUnlocked(context)) {
            ht9.a.b(s8e.INSTANCE, TAG, str + " error, because isUserUnlocked is false", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (isInCacheTime("is_seedling_support", jElapsedRealtime)) {
            return true;
        }
        try {
            Result.Companion companion = Result.Companion;
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient$pantanal_client_release = acquireUnstableContentProviderClient$pantanal_client_release(context, INTENT_PROVIDER_URI);
            try {
                if (contentProviderClientAcquireUnstableContentProviderClient$pantanal_client_release != null) {
                    try {
                        Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient$pantanal_client_release.call("isSeedlingSupport", null, null);
                        AutoCloseableKt.closeFinally(contentProviderClientAcquireUnstableContentProviderClient$pantanal_client_release, (Throwable) null);
                        if (bundleCall == null || !bundleCall.containsKey("is_seedling_support")) {
                            ht9.a.b(s8e.INSTANCE, TAG, str + " error, bundle:" + bundleCall, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                        } else {
                            try {
                                z2 = true;
                                z = bundleCall.getBoolean("is_seedling_support");
                            } catch (Throwable th2) {
                                th = th2;
                                z2 = true;
                                z = false;
                                Result.Companion companion2 = Result.Companion;
                                obj = Result.constructor-impl(ResultKt.createFailure(th));
                                th = Result.exceptionOrNull-impl(obj);
                                if (th != null) {
                                    ht9.a.b(s8e.INSTANCE, TAG, str + " error, because call ums provider error, errorMsg = " + th.getMessage(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                                    z = false;
                                } else {
                                    z3 = z2;
                                }
                                if (z3) {
                                    isSupportSeedlingMetaValue = z;
                                } else {
                                    isSupportSeedlingMetaValue = getIsSupportSeedlingMetaValue(context);
                                }
                                if (isSupportSeedlingMetaValue) {
                                    keyCacheTimeMap.put("is_seedling_support", Long.valueOf(jElapsedRealtime));
                                }
                                ht9.a.c(s8e.INSTANCE, TAG, str + " isSeedlingSupport:" + isSupportSeedlingMetaValue + ", isBundleKeyExist:" + z3 + ", isSupportFromUms:" + z, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                                return isSupportSeedlingMetaValue;
                            }
                        }
                        obj = Result.constructor-impl(Unit.INSTANCE);
                        th = Result.exceptionOrNull-impl(obj);
                        if (th != null) {
                            ht9.a.b(s8e.INSTANCE, TAG, str + " error, because call ums provider error, errorMsg = " + th.getMessage(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                            z = false;
                        } else {
                            z3 = z2;
                        }
                        if (z3) {
                            isSupportSeedlingMetaValue = z;
                        } else {
                            isSupportSeedlingMetaValue = getIsSupportSeedlingMetaValue(context);
                        }
                        if (isSupportSeedlingMetaValue) {
                            keyCacheTimeMap.put("is_seedling_support", Long.valueOf(jElapsedRealtime));
                        }
                        ht9.a.c(s8e.INSTANCE, TAG, str + " isSeedlingSupport:" + isSupportSeedlingMetaValue + ", isBundleKeyExist:" + z3 + ", isSupportFromUms:" + z, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                        return isSupportSeedlingMetaValue;
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            AutoCloseableKt.closeFinally(contentProviderClientAcquireUnstableContentProviderClient$pantanal_client_release, th3);
                            throw th4;
                        }
                    }
                }
                ht9.a.b(s8e.INSTANCE, TAG, str + " error, because providerClient is null", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                obj = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th5) {
                th = th5;
                Result.Companion companion3 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            z = false;
            z2 = false;
        } catch (Throwable th6) {
            th = th6;
            z = false;
            z2 = false;
        }
        th = Result.exceptionOrNull-impl(obj);
        if (th != null) {
            ht9.a.b(s8e.INSTANCE, TAG, str + " error, because call ums provider error, errorMsg = " + th.getMessage(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            z = false;
        } else {
            z3 = z2;
        }
        if (z3) {
            isSupportSeedlingMetaValue = z;
        } else {
            isSupportSeedlingMetaValue = getIsSupportSeedlingMetaValue(context);
        }
        if (isSupportSeedlingMetaValue) {
            keyCacheTimeMap.put("is_seedling_support", Long.valueOf(jElapsedRealtime));
        }
        ht9.a.c(s8e.INSTANCE, TAG, str + " isSeedlingSupport:" + isSupportSeedlingMetaValue + ", isBundleKeyExist:" + z3 + ", isSupportFromUms:" + z, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        return isSupportSeedlingMetaValue;
    }

    @JvmStatic
    @WorkerThread
    public static final boolean queryIsSupportFluidCloud$pantanal_client_release(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return isSupportFeatureFromUms(context, "isFluidCloudSupport", "is_fluid_cloud_support");
    }

    @JvmStatic
    @WorkerThread
    public static final boolean queryIsSystemSendIntentSupport$pantanal_client_release(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        boolean zIsSupportFeatureFromUms = false;
        if (v5d.b(false, 1, (Object) null)) {
            zIsSupportFeatureFromUms = isSupportFeatureFromUms(context, "isSystemSendIntentSupport", "is_system_send_intent_support");
        } else if (isSystemUser(context) && isSupportFeatureFromUms(context, "isSystemSendIntentSupport", "is_system_send_intent_support")) {
            zIsSupportFeatureFromUms = true;
        }
        ht9.a.a(s8e.INSTANCE, TAG, "queryIsSystemSendIntentSupport, result: " + zIsSupportFeatureFromUms, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        return zIsSupportFeatureFromUms;
    }
}
