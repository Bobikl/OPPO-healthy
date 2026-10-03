package com.oplus.pantanal.seedling.util;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.UserManager;
import androidx.annotation.WorkerThread;
import com.oplus.channel.client.ClientChannel;
import com.oplus.channel.client.IClientUserContext;
import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.pantanal.seedling.utrace.ITraceNode;
import com.oplus.pantanal.seedling.utrace.TraceNodeHelper;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.wearable.linkservice.sdk.Node;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ0\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0012H\u0086@¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010J*\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0012H\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0016\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/oplus/pantanal/seedling/util/BaseTool;", "", "()V", "isInitializing", "", "userContext", "Lcom/oplus/channel/client/IClientUserContext;", "getUserContext$seedling_support_manualRelease", "()Lcom/oplus/channel/client/IClientUserContext;", "setUserContext$seedling_support_manualRelease", "(Lcom/oplus/channel/client/IClientUserContext;)V", "genServiceInstanceId", "", "isServicesEnabled", "", "context", "Landroid/content/Context;", Constants.KEY_SERVICE_IDS, "", "(Landroid/content/Context;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Constants.IS_SUPPORT_MULTI_INSTANCE, "setUserContext", "", "startInit", "providerAuthority", "Companion", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class BaseTool {
    private static final long CACHE_DURATION = 600000;
    private static final long CACHE_TIME_DURING = 3000;
    private static final int ENABLE = 1;

    @NotNull
    private static final String KEY_IS_USER_UNLOCKED = "isUserUnlocked";
    private static final int QUERY_TYPE = 1004;
    private boolean isInitializing;

    @Nullable
    private volatile IClientUserContext userContext;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static ConcurrentHashMap<String, Pair<Long, Boolean>> servicesSupportCacheMap = new ConcurrentHashMap<>();

    @NotNull
    private static ConcurrentHashMap<String, Long> keyCacheTimeMap = new ConcurrentHashMap<>();

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0016J?\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\u00182\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u001aH\u0000¢\u0006\u0002\b\u001bJ!\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0001¢\u0006\u0002\b\u001fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\fX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000e0\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/oplus/pantanal/seedling/util/BaseTool$Companion;", "", "()V", "CACHE_DURATION", "", "CACHE_TIME_DURING", "ENABLE", "", "KEY_IS_USER_UNLOCKED", "", "QUERY_TYPE", "keyCacheTimeMap", "Ljava/util/concurrent/ConcurrentHashMap;", "servicesSupportCacheMap", "Lkotlin/Pair;", "", "isSupport", "context", "Landroid/content/Context;", ParserTag.TAG_METHOD, Node.I_KEY, "cacheTime", "isSupport$seedling_support_manualRelease", "isSupportByServices", "", Constants.KEY_SERVICE_IDS, "", "isSupportByServices$seedling_support_manualRelease", BaseTool.KEY_IS_USER_UNLOCKED, "bundle", "Landroid/os/Bundle;", "isUserUnlocked$seedling_support_manualRelease", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nBaseTool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseTool.kt\ncom/oplus/pantanal/seedling/util/BaseTool$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,335:1\n1855#2,2:336\n1271#2,2:340\n1285#2,4:342\n215#3,2:338\n*S KotlinDebug\n*F\n+ 1 BaseTool.kt\ncom/oplus/pantanal/seedling/util/BaseTool$Companion\n*L\n171#1:336,2\n206#1:340,2\n206#1:342,4\n196#1:338,2\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ boolean isSupport$seedling_support_manualRelease$default(Companion companion, Context context, String str, String str2, long j, int i, Object obj) {
            if ((i & 8) != 0) {
                j = BaseTool.CACHE_TIME_DURING;
            }
            return companion.isSupport$seedling_support_manualRelease(context, str, str2, j);
        }

        public static /* synthetic */ boolean isUserUnlocked$seedling_support_manualRelease$default(Companion companion, Context context, Bundle bundle, int i, Object obj) {
            if ((i & 2) != 0) {
                bundle = null;
            }
            return companion.isUserUnlocked$seedling_support_manualRelease(context, bundle);
        }

        @JvmStatic
        public final boolean isSupport$seedling_support_manualRelease(@NotNull Context context, @NotNull String method, @NotNull String key, long cacheTime) {
            Throwable th;
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
            Object obj;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(method, ParserTag.TAG_METHOD);
            Intrinsics.checkNotNullParameter(key, Node.I_KEY);
            Long l = (Long) BaseTool.keyCacheTimeMap.get(key);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (l != null) {
                l.longValue();
                if (Math.abs(jCurrentTimeMillis - l.longValue()) < cacheTime) {
                    Logger.INSTANCE.i(Constants.TAG, "isSupport, " + method + " = true,lastCacheTime=" + l);
                    return true;
                }
            }
            boolean z = false;
            Bundle bundleCall = null;
            try {
                Result.Companion companion = Result.Companion;
                contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(Constants.INSTANCE.getINTENT_PROVIDER_URI());
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    try {
                        bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call(method, null, null);
                    } catch (Throwable th2) {
                        th = th2;
                        Result.Companion companion2 = Result.Companion;
                        obj = Result.constructor-impl(ResultKt.createFailure(th));
                    }
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                z = bundleCall != null ? bundleCall.getBoolean(key) : false;
                obj = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th3) {
                th = th3;
                contentProviderClientAcquireUnstableContentProviderClient = null;
            }
            if (Result.exceptionOrNull-impl(obj) != null) {
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                Logger.INSTANCE.e(Constants.TAG, "isSupport, " + method + ", exception");
            }
            if (z) {
                BaseTool.keyCacheTimeMap.put(key, Long.valueOf(jCurrentTimeMillis));
            }
            Logger.INSTANCE.i(Constants.TAG, "isSupport, " + method + " = " + z);
            return z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final Map<String, Boolean> isSupportByServices$seedling_support_manualRelease(@NotNull Context context, @NotNull String method, @NotNull String key, @NotNull List<String> serviceIds) {
            Object obj;
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
            Logger logger;
            String str;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(method, ParserTag.TAG_METHOD);
            Intrinsics.checkNotNullParameter(key, Node.I_KEY);
            Intrinsics.checkNotNullParameter(serviceIds, Constants.KEY_SERVICE_IDS);
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap map = new HashMap();
            Logger.INSTANCE.d(Constants.TAG, "isSupportByServices, serviceIds = " + serviceIds + " ,servicesSupportCacheMap = " + BaseTool.servicesSupportCacheMap);
            Object[] objArr = false;
            for (String str2 : serviceIds) {
                if (BaseTool.servicesSupportCacheMap.isEmpty()) {
                    logger = Logger.INSTANCE;
                    str = "isSupportByServices, servicesSupportValue is empty, need search again";
                } else {
                    Pair pair = (Pair) BaseTool.servicesSupportCacheMap.get(str2);
                    if (pair == null || Math.abs(jCurrentTimeMillis - ((Number) pair.getFirst()).longValue()) >= BaseTool.CACHE_DURATION) {
                        logger = Logger.INSTANCE;
                        str = "isSupportByServices, servicesSupportValue has expired or is empty, need search again";
                    } else {
                        map.put(str2, pair.getSecond());
                    }
                }
                logger.i(Constants.TAG, str);
                objArr = true;
            }
            if (objArr != false) {
                ArrayList<String> arrayList = new ArrayList<>(serviceIds);
                ContentProviderClient contentProviderClient = null;
                try {
                    Result.Companion companion = Result.Companion;
                    contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(Constants.INSTANCE.getINTENT_PROVIDER_URI());
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putStringArrayList(Constants.KEY_IS_SUPPORT_SERVICE_IDS, arrayList);
                        Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient != null ? contentProviderClientAcquireUnstableContentProviderClient.call(method, null, bundle) : null;
                        Serializable serializable = bundleCall != null ? bundleCall.getSerializable(key) : null;
                        HashMap map2 = serializable instanceof HashMap ? (HashMap) serializable : null;
                        if (map2 != null) {
                            for (Map.Entry entry : map2.entrySet()) {
                                BaseTool.servicesSupportCacheMap.put((String) entry.getKey(), new Pair(Long.valueOf(jCurrentTimeMillis), Boolean.valueOf(((Boolean) entry.getValue()).booleanValue())));
                            }
                        }
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
                        Logger.INSTANCE.d(Constants.TAG, "isSupportByServices, needSearchServices = " + serviceIds + " ,searchResult = " + map2);
                        obj = Result.constructor-impl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        th = th;
                        contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                        Result.Companion companion2 = Result.Companion;
                        obj = Result.constructor-impl(ResultKt.createFailure(th));
                        contentProviderClientAcquireUnstableContentProviderClient = contentProviderClient;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                if (Result.exceptionOrNull-impl(obj) != null) {
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    Logger.INSTANCE.e(Constants.TAG, "isSupportByServices, " + method + ", exception");
                }
                Logger.INSTANCE.i(Constants.TAG, "isSupportByServices, all service search from ums , servicesSupportCacheMap = " + BaseTool.servicesSupportCacheMap);
                map = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(serviceIds, 10)), 16));
                for (Object obj2 : serviceIds) {
                    Pair pair2 = (Pair) BaseTool.servicesSupportCacheMap.get((String) obj2);
                    map.put(obj2, Boolean.valueOf(pair2 != null ? ((Boolean) pair2.getSecond()).booleanValue() : false));
                }
            }
            return map;
        }

        @JvmStatic
        public final boolean isUserUnlocked$seedling_support_manualRelease(@NotNull Context context, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(context, "context");
            String strStartNodeTrace$default = bundle != null ? ITraceNode.startNodeTrace$default(TraceNodeHelper.INSTANCE, bundle, TraceNodeHelper.CODE_IS_USER_UNLOCKED, (Map) null, 4, (Object) null) : null;
            try {
                Result.Companion companion = Result.Companion;
                Long l = (Long) BaseTool.keyCacheTimeMap.get(BaseTool.KEY_IS_USER_UNLOCKED);
                long jCurrentTimeMillis = System.currentTimeMillis();
                boolean zIsUserUnlocked = true;
                if (l != null) {
                    l.longValue();
                    if (Math.abs(jCurrentTimeMillis - l.longValue()) < BaseTool.CACHE_TIME_DURING) {
                        ITraceNode.endNodeTrace$default(TraceNodeHelper.INSTANCE, strStartNodeTrace$default, false, 2, null);
                        Logger.INSTANCE.i(Constants.TAG, "isUserUnlocked true, lastCacheTime=" + l);
                        return true;
                    }
                }
                Object systemService = context.getSystemService("user");
                UserManager userManager = systemService instanceof UserManager ? (UserManager) systemService : null;
                if (userManager != null) {
                    zIsUserUnlocked = userManager.isUserUnlocked();
                } else {
                    Logger.INSTANCE.i(Constants.TAG, "isUserUnlocked = null, default = true");
                }
                if (zIsUserUnlocked) {
                    BaseTool.keyCacheTimeMap.put(BaseTool.KEY_IS_USER_UNLOCKED, Long.valueOf(jCurrentTimeMillis));
                }
                Logger.INSTANCE.i(Constants.TAG, "isUserUnlocked = " + zIsUserUnlocked);
                if (strStartNodeTrace$default != null) {
                    ITraceNode.endNodeTrace$default(TraceNodeHelper.INSTANCE, strStartNodeTrace$default, false, 2, null);
                }
                return zIsUserUnlocked;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Throwable th2 = Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th)));
                if (th2 != null) {
                    String str = "isUserUnlocked error.msg=" + th2.getMessage();
                    TraceNodeHelper.INSTANCE.errorNodeTrace(strStartNodeTrace$default, TraceNodeHelper.CODE_IS_USER_UNLOCKED, str);
                    Logger.INSTANCE.e(Constants.TAG, str);
                }
                return false;
            }
        }
    }

    @NotNull
    public final String genServiceInstanceId() {
        return System.nanoTime() + "_" + Thread.currentThread().getId();
    }

    @Nullable
    /* JADX INFO: renamed from: getUserContext$seedling_support_manualRelease, reason: from getter */
    public final IClientUserContext getUserContext() {
        return this.userContext;
    }

    @Nullable
    public final Object isServicesEnabled(@NotNull Context context, @NotNull List<String> list, @NotNull Continuation<? super Map<String, Boolean>> continuation) {
        Object obj;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(Constants.INSTANCE.getUMS_QUERY_ADVICE_URI());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Result.Companion companion = Result.Companion;
            Bundle bundle = new Bundle();
            bundle.putInt(Constants.KEY_QUERYTYPE, 1004);
            bundle.putSerializable(Constants.KEY_SERVICE_IDS, new ArrayList(list));
            Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient != null ? contentProviderClientAcquireUnstableContentProviderClient.call(Constants.KEY_QUERY_FLUID_CLOUD_METHOD, null, bundle) : null;
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                contentProviderClientAcquireUnstableContentProviderClient.close();
            }
            if (bundleCall != null && bundleCall.containsKey(Constants.KEY_FLUID_CLOUD_RESULT)) {
                String string = bundleCall.getString(Constants.KEY_FLUID_CLOUD_RESULT);
                Logger.INSTANCE.i(Constants.TAG, "isServicesEnabled fluidCloudResult = " + string);
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string2 = jSONObject.getString("serviceId");
                    int i2 = jSONObject.getInt(Constants.KEY_SERVICE_SWITCH);
                    Intrinsics.checkNotNull(string2);
                    boolean z = true;
                    if (i2 != 1) {
                        z = false;
                    }
                    linkedHashMap.put(string2, Boxing.boxBoolean(z));
                }
                obj = Result.constructor-impl(Unit.INSTANCE);
                Throwable th = Result.exceptionOrNull-impl(obj);
                if (th != null) {
                    Logger.INSTANCE.e(Constants.TAG, "isServicesEnabled occur error:" + th.getMessage());
                }
                return linkedHashMap;
            }
            Logger.INSTANCE.e(Constants.TAG, "isServicesEnabled error, resultBundle:" + bundleCall);
            return linkedHashMap;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th2));
        }
    }

    @WorkerThread
    @NotNull
    public final Map<String, Boolean> isSupportMultiInstance(@NotNull Context context, @NotNull List<String> serviceIds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(serviceIds, Constants.KEY_SERVICE_IDS);
        Map<String, Boolean> mapIsSupportByServices$seedling_support_manualRelease = INSTANCE.isSupportByServices$seedling_support_manualRelease(context, Constants.KEY_IS_SERVICE_SUPPORT_MULTI_INSTANCE, Constants.KEY_IS_SERVICE_SUPPORT_MULTI_INSTANCE, serviceIds);
        Logger.INSTANCE.i(Constants.TAG, "isSupportMultiInstance valueSupport=" + mapIsSupportByServices$seedling_support_manualRelease);
        return mapIsSupportByServices$seedling_support_manualRelease;
    }

    public final void setUserContext(@Nullable IClientUserContext userContext) {
        this.userContext = userContext;
        ClientChannel.INSTANCE.setUserContext(userContext);
    }

    public final void setUserContext$seedling_support_manualRelease(@Nullable IClientUserContext iClientUserContext) {
        this.userContext = iClientUserContext;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0080  */
    public final boolean startInit(@NotNull Context context, @NotNull String providerAuthority) {
        Object obj;
        Unit unitAcquireUnstableContentProviderClient;
        Throwable th;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(providerAuthority, "providerAuthority");
        if (this.isInitializing) {
            Logger.INSTANCE.e(Constants.TAG, "SeedlingSupportSDK is initializing,please wait!");
            return false;
        }
        boolean z = true;
        this.isInitializing = true;
        Unit unit = null;
        try {
            Result.Companion companion = Result.Companion;
            Logger.INSTANCE.i(Constants.TAG, "startInit start authority=" + providerAuthority);
            Uri uri = Uri.parse("content://" + providerAuthority);
            unitAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(providerAuthority);
            if (unitAcquireUnstableContentProviderClient != null) {
                try {
                    unitAcquireUnstableContentProviderClient.update(uri, null, null, null);
                } catch (Throwable th2) {
                    th = th2;
                    unit = unitAcquireUnstableContentProviderClient;
                    z = false;
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                    unitAcquireUnstableContentProviderClient = unit;
                    th = Result.exceptionOrNull-impl(obj);
                    if (th != null) {
                        if (unitAcquireUnstableContentProviderClient != null) {
                            unitAcquireUnstableContentProviderClient.close();
                        }
                        Logger.INSTANCE.i(Constants.TAG, "startInit: error = " + th.getMessage());
                    }
                    this.isInitializing = false;
                    return z;
                }
            }
            if (unitAcquireUnstableContentProviderClient != null) {
                try {
                    unitAcquireUnstableContentProviderClient.close();
                    unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    th = th3;
                    unit = unitAcquireUnstableContentProviderClient;
                    Result.Companion companion3 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                    unitAcquireUnstableContentProviderClient = unit;
                }
            }
            obj = Result.constructor-impl(unit);
        } catch (Throwable th4) {
            th = th4;
        }
        th = Result.exceptionOrNull-impl(obj);
        if (th != null) {
            if (unitAcquireUnstableContentProviderClient != null) {
                unitAcquireUnstableContentProviderClient.close();
            }
            Logger.INSTANCE.i(Constants.TAG, "startInit: error = " + th.getMessage());
        }
        this.isInitializing = false;
        return z;
    }

    public final boolean isSupportMultiInstance(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Companion companion = INSTANCE;
        if (!Companion.isUserUnlocked$seedling_support_manualRelease$default(companion, context, null, 2, null)) {
            Logger.INSTANCE.e(Constants.TAG, "isSupportFluidCloud error, because isUserUnlocked is false");
            return false;
        }
        boolean zIsSupport$seedling_support_manualRelease = companion.isSupport$seedling_support_manualRelease(context, Constants.KEY_IS_SUPPORT_MULTI_INSTANCE, Constants.KEY_IS_SUPPORT_MULTI_INSTANCE, CACHE_TIME_DURING);
        Logger.INSTANCE.i(Constants.TAG, "isSupportFluidCloud, isSupportFluidCloud = " + zIsSupport$seedling_support_manualRelease);
        return zIsSupport$seedling_support_manualRelease;
    }
}
