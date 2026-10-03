package com.pantanal.server.content.sdk;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.WorkerThread;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.f7b;
import com.oplus.aiunit.vision.ueg;
import com.oplus.channel.server.IUserContext;
import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.utrace.sdk.UTraceContext;
import com.pantanal.server.content.decision.DecisionCenter;
import com.pantanal.server.content.decision.SceneDecisionCenter;
import com.pantanal.server.content.decision.cardsupport.shelf.ShelfDecisionCenter;
import com.pantanal.server.content.domail.FluidCloudInfo;
import com.pantanal.server.content.domail.SeedlingServiceHelper;
import com.pantanal.server.content.domail.SeedlingServiceInfo;
import com.pantanal.server.content.dot.StatisticsBean;
import com.pantanal.server.content.dot.StatisticsManager;
import com.pantanal.server.content.recommendlist.ListObserver;
import com.pantanal.server.content.recommendlist.SceneInfo;
import com.pantanal.server.content.recommendlist.ServiceInfo;
import com.pantanal.server.content.upkmanage.base.UpkBusiness;
import com.pantanal.server.content.upkmanage.entity.UpkEntity;
import com.pantanal.server.content.upkmanage.protocol.UpkDaoRoomImpl;
import com.pantanal.server.content.utils.OSUtils;
import io.protostuff.MapSchema;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.ThreadPoolDispatcherKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 G2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\bE\u0010FJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J \u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u000eH\u0017J,\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0007H\u0017J(\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J \u0010\u0019\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0007H\u0016J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u001e\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0011H\u0016J\b\u0010 \u001a\u00020\u0002H\u0016J\b\u0010!\u001a\u00020\u0002H\u0016J/\u0010(\u001a\u0004\u0018\u00010'2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010&\u001a\u0004\u0018\u00010\u001aH\u0017¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*2\u0006\u0010%\u001a\u00020$H\u0016J\u0010\u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020$H\u0016J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u001a\u00101\u001a\u0004\u0018\u0001002\u0006\u0010/\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$H\u0016J&\u00103\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\u00112\u0006\u0010/\u001a\u00020\u00052\f\u00102\u001a\b\u0012\u0004\u0012\u00020$0\u0011H\u0016J\u0018\u00105\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u000204H\u0016J \u00106\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u000204H\u0016J\u0018\u00107\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0007H\u0016J&\u00109\u001a\b\u0012\u0004\u0012\u0002080\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0007H\u0016R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010D\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006H"}, d2 = {"Lcom/pantanal/server/content/sdk/StaticSdk;", "Lcom/pantanal/server/content/sdk/IStaticSdk;", "", "y", "x", "Landroid/content/Context;", "appContext", "", "isPluginLoader", "isSupportChildThread", b2n.f, "Lcom/oplus/channel/server/IUserContext;", MapSchema.FIELD_NAME_ENTRY, "", "", "entranceType", "type", "", "Lcom/pantanal/server/content/recommendlist/ServiceInfo;", "b", Constants.IS_SUPPORT_MULTI_INSTANCE, LogFieldKey.LEVEL_KEY, "Lcom/pantanal/server/content/recommendlist/ListObserver;", "observer", LogFieldKey.MESSAGE_KEY, "c", "", "Lcom/pantanal/server/content/dot/StatisticsBean;", "statisticsBean", "f", "statisticsList", "j", "A", ExifInterface.LONGITUDE_EAST, "Lcom/oplus/utrace/sdk/UTraceContext;", "parentCtx", "", "serviceId", "versionCode", "Lcom/pantanal/server/content/upkmanage/entity/UpkEntity;", "a", "(Lcom/oplus/utrace/sdk/UTraceContext;Ljava/lang/String;Ljava/lang/Long;)Lcom/pantanal/server/content/upkmanage/entity/UpkEntity;", "Lcom/pantanal/server/content/domail/SeedlingServiceInfo;", "queryServiceInfo", "subDomain", "disableSubDomain", "getDecisionAllData", "context", "Lcom/pantanal/server/content/domail/FluidCloudInfo;", Constants.KEY_QUERY_FLUID_CLOUD_METHOD, Constants.KEY_SERVICE_IDS, "queryFluidClouds", "Lcom/oplus/aiunit/vision/ueg;", MapSchema.FIELD_NAME_KEY, "i", b2n.g, "Lcom/pantanal/server/content/recommendlist/SceneInfo;", "d", "Landroid/content/Context;", "w", "()Landroid/content/Context;", "setAppContext", "(Landroid/content/Context;)V", "Lcom/oplus/channel/server/IUserContext;", "z", "()Lcom/oplus/channel/server/IUserContext;", "setUserContext", "(Lcom/oplus/channel/server/IUserContext;)V", "userContext", "<init>", "()V", "Companion", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public final class StaticSdk implements IStaticSdk {

    @NotNull
    public static final String TAG = "StaticSdk";

    @NotNull
    public static final String VERSION = "1.1.46-betaa9370b2-SNAPSHOT";

    @Nullable
    public static Job h;
    public static boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static Job f20243j;

    @Nullable
    public static volatile StaticSdk k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f20244l;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public Context appContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public IUserContext userContext;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Uri f20241c = Uri.parse("content://com.oplus.pantanal.ums.statictis/engine_version");

    @NotNull
    public static final ExecutorCoroutineDispatcher d = ThreadPoolDispatcherKt.newSingleThreadContext("#entrance_version");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final ExecutorCoroutineDispatcher f20242e = ThreadPoolDispatcherKt.newSingleThreadContext("#entrance_export_config");
    public static final Uri f = Uri.parse("content://com.oplus.pantanal.ums.statictis/type");
    public static int g = -1;

    @NotNull
    public static ConcurrentHashMap<String, UpkEntity> m = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.pantanal.server.content.sdk.StaticSdk$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b<\u0010=J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R.\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010#R\u0014\u0010(\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010#R\u0014\u0010)\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010#R\u0014\u0010*\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010#R\u0014\u0010+\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010#R\u0014\u0010,\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010#R\u0014\u0010-\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010#R\u001c\u00100\u001a\n /*\u0004\u0018\u00010.0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00102\u001a\n /*\u0004\u0018\u00010.0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00101R\u0014\u00103\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010#R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00106R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010:¨\u0006>"}, d2 = {"Lcom/pantanal/server/content/sdk/StaticSdk$a;", "", "Lcom/pantanal/server/content/sdk/IStaticSdk;", "d", "Landroid/content/Context;", "a", "Lcom/oplus/channel/server/IUserContext;", "c", "", "engineVersion", "I", "b", "()I", b2n.g, "(I)V", "", "isExport", "Z", b2n.f, "()Z", "i", "(Z)V", "supportChildThread", MapSchema.FIELD_NAME_ENTRY, "setSupportChildThread", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/pantanal/server/content/upkmanage/entity/UpkEntity;", "upkEntityMap", "Ljava/util/concurrent/ConcurrentHashMap;", "f", "()Ljava/util/concurrent/ConcurrentHashMap;", "setUpkEntityMap", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "AUTHORITIES", "Ljava/lang/String;", "Lcom/pantanal/server/content/sdk/StaticSdk;", "INSTANCE", "Lcom/pantanal/server/content/sdk/StaticSdk;", "IS_SUPPORT_ENTRANCE", "KEY_META_DATA", "LAUNCHER_PROCESS_PACKAGE_NAME", "PACKAGE_ASSISTANTSCREEN", "TAG", "TYPE", "UMS_PACKAGE_NAME", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "UPK_ENGINE_VERSION_URI", "Landroid/net/Uri;", "UPK_ENTRY_TYPE_URI", "VERSION", "Lkotlinx/coroutines/Job;", "exportConfigJob", "Lkotlinx/coroutines/Job;", "job", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "mDispatcher", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "mExportConfigDispatcher", "<init>", "()V", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Context a() {
            Context appContext = ((StaticSdk) d()).getAppContext();
            if (appContext != null) {
                return appContext;
            }
            throw new NullPointerException("Static sdk not init");
        }

        public final int b() {
            return StaticSdk.g;
        }

        @Nullable
        public final IUserContext c() {
            return ((StaticSdk) d()).getUserContext();
        }

        @NotNull
        public final IStaticSdk d() {
            StaticSdk staticSdk = StaticSdk.k;
            if (staticSdk == null) {
                synchronized (this) {
                    staticSdk = StaticSdk.k;
                    if (staticSdk == null) {
                        staticSdk = new StaticSdk();
                        StaticSdk.k = staticSdk;
                    }
                }
            }
            return staticSdk;
        }

        public final boolean e() {
            return StaticSdk.f20244l;
        }

        @NotNull
        public final ConcurrentHashMap<String, UpkEntity> f() {
            return StaticSdk.m;
        }

        public final boolean g() {
            return StaticSdk.i;
        }

        public final void h(int i) {
            StaticSdk.g = i;
        }

        public final void i(boolean z) {
            StaticSdk.i = z;
        }
    }

    public void A() {
        f7b.h(TAG, "call watchDatabase..");
        if (OSUtils.j() && Intrinsics.areEqual(INSTANCE.a().getPackageName(), "com.coloros.assistantscreen")) {
            f7b.h(TAG, "call watchDatabase , os 13 and pkgName is assistantscreen");
        } else {
            UpkDaoRoomImpl.INSTANCE.a().v();
        }
    }

    @Override // com.pantanal.server.content.sdk.IStaticSdk
    public void E() {
        f7b.h(TAG, "call unInit..");
        if (OSUtils.j() && Intrinsics.areEqual(INSTANCE.a().getPackageName(), "com.coloros.assistantscreen")) {
            f7b.h(TAG, "call unInit , os 13 and pkgName is assistantscreen");
        } else {
            UpkDaoRoomImpl.INSTANCE.a().s();
        }
    }

    @Override // com.pantanal.server.content.sdk.IStaticSdk
    @WorkerThread
    @Nullable
    public UpkEntity a(@Nullable UTraceContext parentCtx, @Nullable String serviceId, @Nullable Long versionCode) {
        f7b.h(TAG, Intrinsics.stringPlus("[intent_trace] staticEntrance_get_intent_trace_context_from_SeedlingSDK is:", parentCtx));
        UpkEntity upkEntityI = UpkBusiness.INSTANCE.a().i(INSTANCE.a(), serviceId, parentCtx, versionCode);
        f7b.d(TAG, Intrinsics.stringPlus("upkEntity info:", upkEntityI));
        return upkEntityI;
    }

    @Override // com.pantanal.server.content.sdk.IStaticSdk
    @WorkerThread
    @NotNull
    public List<ServiceInfo> b(@NotNull Set<Integer> entranceType, int type) {
        Intrinsics.checkNotNullParameter(entranceType, "entranceType");
        f7b.h(TAG, Intrinsics.stringPlus("getCurRecommendList ", Integer.valueOf(type)));
        return l(entranceType, type, false);
    }

    @Override // com.pantanal.server.content.sdk.IStaticSdk
    public void c(int entranceType, int type, boolean isSupportMultiInstance) {
        f7b.h(TAG, "unregister. entranceType:" + entranceType + " isSupportMultiInstance:" + isSupportMultiInstance + " type = " + type + '.');
        if (type == 4) {
            ShelfDecisionCenter.INSTANCE.g();
        } else {
            DecisionCenter.INSTANCE.w(entranceType, isSupportMultiInstance);
        }
    }

    @Override // com.pantanal.server.content.sdk.IStaticSdk
    @NotNull
    public List<SceneInfo> d(int entranceType, int type, boolean isSupportMultiInstance) {
        return SceneDecisionCenter.INSTANCE.w(entranceType, isSupportMultiInstance);
    }

    @Override // com.pantanal.server.content.sdk.IStaticSdk
    public boolean disableSubDomain(@NotNull String subDomain) {
        Intrinsics.checkNotNullParameter(subDomain, "subDomain");
        return SeedlingServiceHelper.INSTANCE.disableSubDomain(subDomain);
    }

    @Override // com.pantanal.server.content.sdk.IStaticSdk
    public void e(@NotNull IUserContext appContext, boolean isPluginLoader, boolean isSupportChildThread) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.userContext = appContext;
        this.appContext = appContext.getContext().getApplicationContext();
        f20244l = isSupportChildThread;
        f7b.h(TAG, Intrinsics.stringPlus("init IUserContext,staticSdk version:1.1.46-betaa9370b2-SNAPSHOT,isSupportChildThread:", Boolean.valueOf(isSupportChildThread)));
        A();
        if (g == -1) {
            y();
        }
        x();
    }

    @Override // com.pantanal.server.content.sdk.IStaticSdk
    public void f(long entranceType, @NotNull StatisticsBean statisticsBean) {
        Intrinsics.checkNotNullParameter(statisticsBean, "statisticsBean");
        f7b.h(TAG, "reportStatistics");
        StatisticsManager.INSTANCE.a().d(entranceType, statisticsBean);
    }

    @Override // com.pantanal.server.content.sdk.IStaticSdk
    public void g(@NotNull Context appContext, boolean isPluginLoader, boolean isSupportChildThread) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.appContext = appContext.getApplicationContext();
        f20244l = isSupportChildThread;
        f7b.h(TAG, Intrinsics.stringPlus("init context,staticSdk version:1.1.46-betaa9370b2-SNAPSHOT,isSupportChildThread:", Boolean.valueOf(isSupportChildThread)));
        A();
        if (g == -1) {
            y();
        }
        x();
    }

    @Override // com.pantanal.server.content.sdk.IStaticSdk
    @NotNull
    public List<ServiceInfo> getDecisionAllData() {
        return DecisionCenter.INSTANCE.t();
    }

    @Override // com.pantanal.server.content.sdk.IStaticSdk
    public void h(int entranceType, boolean isSupportMultiInstance) {
        SceneDecisionCenter.INSTANCE.A(entranceType, isSupportMultiInstance);
    }

    @Override // com.pantanal.server.content.sdk.IStaticSdk
    public void i(int entranceType, boolean isSupportMultiInstance, @NotNull ueg observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        SceneDecisionCenter.INSTANCE.x(entranceType, isSupportMultiInstance, observer);
    }

    @Override // com.pantanal.server.content.sdk.IStaticSdk
    public void j(long entranceType, @NotNull List<StatisticsBean> statisticsList) {
        Intrinsics.checkNotNullParameter(statisticsList, "statisticsList");
        f7b.h(TAG, "reportStatistics");
        StatisticsManager.INSTANCE.a().e(entranceType, statisticsList);
    }

    @Override // com.pantanal.server.content.sdk.IStaticSdk
    public void k(int entranceType, @NotNull ueg observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        i(entranceType, false, observer);
    }

    @Override // com.pantanal.server.content.sdk.IStaticSdk
    @WorkerThread
    @NotNull
    public List<ServiceInfo> l(@NotNull Set<Integer> entranceType, int type, boolean isSupportMultiInstance) {
        Intrinsics.checkNotNullParameter(entranceType, "entranceType");
        f7b.h(TAG, Intrinsics.stringPlus("getCurRecommendList ", Integer.valueOf(type)));
        return type == 4 ? ShelfDecisionCenter.INSTANCE.e() : DecisionCenter.INSTANCE.u(entranceType, isSupportMultiInstance);
    }

    @Override // com.pantanal.server.content.sdk.IStaticSdk
    public void m(int entranceType, int type, boolean isSupportMultiInstance, @NotNull ListObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        f7b.h(TAG, "register. type = " + type + '.');
        if (type == 4) {
            ShelfDecisionCenter.INSTANCE.f(observer);
        } else {
            DecisionCenter.INSTANCE.v(entranceType, isSupportMultiInstance, observer);
        }
    }

    @Override // com.pantanal.server.content.sdk.IStaticSdk
    @Nullable
    public FluidCloudInfo queryFluidCloud(@NotNull Context context, @NotNull String serviceId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        return SeedlingServiceHelper.INSTANCE.queryFluidCloud(context, serviceId);
    }

    @Override // com.pantanal.server.content.sdk.IStaticSdk
    @Nullable
    public List<FluidCloudInfo> queryFluidClouds(@NotNull Context context, @NotNull List<String> serviceIds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(serviceIds, "serviceIds");
        return SeedlingServiceHelper.INSTANCE.queryFluidClouds(context, serviceIds);
    }

    @Override // com.pantanal.server.content.sdk.IStaticSdk
    @NotNull
    public SeedlingServiceInfo queryServiceInfo(@NotNull String serviceId) {
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        return SeedlingServiceHelper.INSTANCE.queryServiceInfo(serviceId);
    }

    @Nullable
    /* JADX INFO: renamed from: w, reason: from getter */
    public final Context getAppContext() {
        return this.appContext;
    }

    public final void x() {
        if (Intrinsics.areEqual(INSTANCE.a().getPackageName(), "com.android.launcher")) {
            f20243j = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(f20242e), null, null, new StaticSdk$getExportConfig$1(null), 3, null);
        }
    }

    public final void y() {
        h = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(d), null, null, new StaticSdk$getPlatformVerison$1(null), 3, null);
    }

    @Nullable
    /* JADX INFO: renamed from: z, reason: from getter */
    public final IUserContext getUserContext() {
        return this.userContext;
    }
}
