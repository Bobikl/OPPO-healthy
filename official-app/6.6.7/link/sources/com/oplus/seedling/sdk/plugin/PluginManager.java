package com.oplus.seedling.sdk.plugin;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.annotation.VisibleForTesting;
import com.google.gson.Gson;
import com.oplus.aiunit.vision.d14;
import com.oplus.aiunit.vision.hkk;
import com.oplus.aiunit.vision.ht9;
import com.oplus.aiunit.vision.q8a;
import com.oplus.aiunit.vision.s8e;
import com.oplus.aiunit.vision.toe;
import com.oplus.aiunit.vision.x8e;
import com.oplus.aiunit.vision.zoe;
import com.oplus.channel.server.IUserContext;
import com.oplus.pantanal.plugin.PluginFileUtils;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.seedling.sdk.BuildConfig;
import com.oplus.seedling.sdk.LogUtils;
import com.oplus.seedling.sdk.SeedlingInitConfig;
import com.oplus.seedling.sdk.SeedlingSdk;
import com.oplus.seedling.sdk.callback.InitCallback;
import com.oplus.seedling.sdk.callback.InstallMonitorCallback;
import com.oplus.seedling.sdk.entity.EngineType;
import com.oplus.seedling.sdk.manager.IInitManager;
import com.oplus.seedling.sdk.manager.ISeedlingManager;
import com.oplus.seedling.sdk.plugin.bean.SeedlingSdkConfigBean;
import com.oplus.seedling.sdk.plugin.classloader.SeedlingClassLoader;
import com.oplus.seedling.sdk.statistics.StatisticsTrackUtil;
import com.oplus.seedling.sdk.utils.CallerTraceUtil;
import com.oplusos.sau.common.utils.SauAarConstants;
import com.opos.process.bridge.base.BridgeConstant;
import com.pantanal.fundation.internal.utils.STraceUtils;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0093\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\b\u0007*\u0001g\b\u0000\u0018\u0000 k2\u00020\u0001:\u0002klB\t\b\u0002¢\u0006\u0004\bj\u0010KJ$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J4\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\u001a\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\fH\u0002J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0018\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u001e\u001a\u00020\bH\u0002J\b\u0010\u001f\u001a\u00020\bH\u0002J\u0010\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0002J\n\u0010$\u001a\u0004\u0018\u00010#H\u0002J\u0012\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010%\u001a\u00020 H\u0002J\u0014\u0010)\u001a\u00020(2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010+\u001a\u00020*2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010,\u001a\u00020(H\u0002J\"\u00100\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u000f2\b\u0010/\u001a\u0004\u0018\u00010\u000fH\u0002J,\u00105\u001a\u00020\b2\u0006\u00101\u001a\u00020 2\u0006\u00102\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u00104\u001a\u0004\u0018\u000103H\u0002J\u0012\u00107\u001a\u00020\b2\b\u00106\u001a\u0004\u0018\u00010\u0006H\u0002J\u0018\u00108\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u000e\u00109\u001a\u00020\b2\u0006\u0010!\u001a\u00020 J\u0006\u0010:\u001a\u00020\bJ\u0010\u0010;\u001a\u0004\u0018\u00010&2\u0006\u0010%\u001a\u00020 J\u000e\u0010<\u001a\u00020\b2\u0006\u0010%\u001a\u00020 J\u000e\u0010=\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u000fJ,\u00107\u001a\u00020\b2\u0006\u0010>\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u00042\u0014\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010A0@J\b\u0010C\u001a\u00020\bH\u0016J\u0011\u0010F\u001a\u0004\u0018\u00010(H\u0000¢\u0006\u0004\bD\u0010EJ\u0013\u0010I\u001a\u00020\bH\u0080@ø\u0001\u0000¢\u0006\u0004\bG\u0010HJ\u000f\u0010L\u001a\u00020\bH\u0000¢\u0006\u0004\bJ\u0010KJ\u000f\u0010N\u001a\u00020\bH\u0000¢\u0006\u0004\bM\u0010KJ\u0017\u0010Q\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\bO\u0010PJ\u0017\u0010U\u001a\u00020\u00042\u0006\u0010R\u001a\u00020 H\u0000¢\u0006\u0004\bS\u0010TR \u0010W\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020&0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Y\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR(\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010[\u001a\u0004\u0018\u00010\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\\\u001a\u0004\b]\u0010^R\u0018\u0010_\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010a\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010`R\u0018\u0010b\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010d\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010cR\u0018\u0010e\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010h\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010i\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006m"}, d2 = {"Lcom/oplus/seedling/sdk/plugin/PluginManager;", "Lcom/oplus/aiunit/vision/zoe;", "Lcom/oplus/seedling/sdk/callback/InitCallback;", "initCallback", "", "isPluginUpdated", "Lcom/oplus/seedling/sdk/SeedlingInitConfig;", "initConfig", "", "doInit", "Landroid/content/Context;", "hostContext", "Landroid/content/res/Configuration;", "newConfig", "updateNewConfig", "", "status", "Lcom/oplus/aiunit/vision/toe;", "pluginContext", "showConfigMsg", "preMsg", "config", "showSingleConfigMsg", "doInitSdk", "Lcom/oplus/seedling/sdk/plugin/PluginManager$InstallMonitor;", "installMonitorCallback", "handleInitAsync", "Lcom/oplus/seedling/sdk/callback/InstallMonitorCallback;", "initSdkWithUserContext", "invokeInitSdk", "invokeExchangeVersion", "invokeReleaseSdk", "", "level", "invokeOnTrimMemory", "Lcom/oplus/seedling/sdk/manager/IInitManager;", "loadInitManager", "entranceType", "Lcom/oplus/seedling/sdk/manager/ISeedlingManager;", "loadSeedlingManager", "Ldalvik/system/DexClassLoader;", "initPluginClassLoader", "Ljava/lang/ClassLoader;", "getHostClassLoader", "gainPluginClassLoader", "eventId", "packageName", "message", "reportStatistics", "errorCode", "errorMsgToEntrance", "", "throwable", "reportInitFail", "seedlingInitConfig", "notifyHostBlurAbilityChanged", "init", "onTrimMemory", "release", "gainSeedlingManager", "releaseSeedlingManager", "reportPluginFileInitExecution", "supportBlur", "isLightColor", "", "", BridgeConstant.KEY_EXTRAS, "onPluginUpdated", "getSeedlingPluginClassLoader$pantanal_client_release", "()Ldalvik/system/DexClassLoader;", "getSeedlingPluginClassLoader", "quit$pantanal_client_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "quit", "registerPluginContextConfigChange$pantanal_client_release", "()V", "registerPluginContextConfigChange", "unregisterPluginContextConfigChange$pantanal_client_release", "unregisterPluginContextConfigChange", "dispatchConfigurationChanged$pantanal_client_release", "(Landroid/content/res/Configuration;)V", "dispatchConfigurationChanged", "feature", "isPluginSupportFeature$pantanal_client_release", "(I)Z", "isPluginSupportFeature", "Ljava/util/concurrent/ConcurrentHashMap;", "seedlingManagerMap", "Ljava/util/concurrent/ConcurrentHashMap;", "pluginDexClassLoader", "Ldalvik/system/DexClassLoader;", "<set-?>", "Lcom/oplus/aiunit/vision/toe;", "getPluginContext", "()Lcom/oplus/aiunit/vision/toe;", "entranceSdkVersionCode", "Ljava/lang/Integer;", "pluginVersionCode", "pluginVersionName", "Ljava/lang/String;", "pluginGitCommitHash", "initManager", "Lcom/oplus/seedling/sdk/manager/IInitManager;", "com/oplus/seedling/sdk/plugin/PluginManager$hostConfigurationChangedCallback$1", "hostConfigurationChangedCallback", "Lcom/oplus/seedling/sdk/plugin/PluginManager$hostConfigurationChangedCallback$1;", "<init>", "Companion", "InstallMonitor", "pantanal-client_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPluginManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginManager.kt\ncom/oplus/seedling/sdk/plugin/PluginManager\n+ 2 PluginFileUtils.kt\ncom/oplus/pantanal/plugin/PluginFileUtils\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1024:1\n256#2,20:1025\n1855#3,2:1045\n*S KotlinDebug\n*F\n+ 1 PluginManager.kt\ncom/oplus/seedling/sdk/plugin/PluginManager\n*L\n168#1:1025,20\n195#1:1045,2\n*E\n"})
public final class PluginManager implements zoe {
    private static final long INTERNAL_SDK_INIT_TIMEOUT = 8000;
    private static final long SDK_DELAY_QUIT = 100;

    @NotNull
    private static final String SECONDARY_HOME_PKG = "com.oplus.secondaryhome";
    private static final long SHUTDOWN_TIMEOUTS = 1000;

    @NotNull
    private static final String TAG = "PluginManager";

    @Nullable
    private Integer entranceSdkVersionCode;

    @NotNull
    private PluginManager$hostConfigurationChangedCallback$1 hostConfigurationChangedCallback;

    @Nullable
    private volatile IInitManager initManager;

    @Nullable
    private toe pluginContext;

    @Nullable
    private DexClassLoader pluginDexClassLoader;

    @Nullable
    private String pluginGitCommitHash;

    @Nullable
    private Integer pluginVersionCode;

    @Nullable
    private String pluginVersionName;

    @NotNull
    private final ConcurrentHashMap<Integer, ISeedlingManager> seedlingManagerMap;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<PluginManager> sInstance$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0<PluginManager>() { // from class: com.oplus.seedling.sdk.plugin.PluginManager$Companion$sInstance$2
        @NotNull
        public final PluginManager invoke() {
            return new PluginManager(null);
        }
    });

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/oplus/seedling/sdk/plugin/PluginManager$Companion;", "", "()V", "INTERNAL_SDK_INIT_TIMEOUT", "", "SDK_DELAY_QUIT", "SECONDARY_HOME_PKG", "", "SHUTDOWN_TIMEOUTS", "TAG", "sInstance", "Lcom/oplus/seedling/sdk/plugin/PluginManager;", "getSInstance", "()Lcom/oplus/seedling/sdk/plugin/PluginManager;", "sInstance$delegate", "Lkotlin/Lazy;", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PluginManager getSInstance() {
            return (PluginManager) PluginManager.sInstance$delegate.getValue();
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007R$\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/oplus/seedling/sdk/plugin/PluginManager$InstallMonitor;", "Lcom/oplus/seedling/sdk/callback/InstallMonitorCallback;", "Lcom/oplus/seedling/sdk/callback/InitCallback;", "initCallBack", "Lcom/oplus/aiunit/vision/zoe;", "buildInitCallbackWrapper", "", "onUmsUpdated", "", "isSuccess", "onSdkInternalInited", "Landroid/content/Context;", "context", "", "path", "", "getAssetsFileSize", "isSdkInternalInitSuccess", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setSdkInternalInitSuccess", "(Ljava/lang/Boolean;)V", "mInitCallback", "Lcom/oplus/seedling/sdk/callback/InitCallback;", "getMInitCallback", "()Lcom/oplus/seedling/sdk/callback/InitCallback;", "setMInitCallback", "(Lcom/oplus/seedling/sdk/callback/InitCallback;)V", "<init>", "()V", "pantanal-client_release"}, k = 1, mv = {1, 8, 0})
    public static final class InstallMonitor implements InstallMonitorCallback {

        @Nullable
        private volatile Boolean isSdkInternalInitSuccess;

        @Nullable
        private InitCallback mInitCallback;

        private final zoe buildInitCallbackWrapper(final InitCallback initCallBack) {
            return new zoe() { // from class: com.oplus.seedling.sdk.plugin.PluginManager$InstallMonitor$buildInitCallbackWrapper$1
                @Override // com.oplus.aiunit.vision.zoe
                public void onPluginCheckUpdateResult(int status, int newVersion, int oldVersion, long downloadSize) {
                    InitCallback initCallback = initCallBack;
                    if (initCallback != null) {
                        initCallback.onPluginCheckUpdateResult(status, newVersion, oldVersion, downloadSize);
                    }
                }

                public void onPluginUpdated() {
                    zoe.a.c(this);
                }

                @Override // com.oplus.aiunit.vision.zoe
                public void onPluginCheckUpdateResult(int status, int pluginType) {
                    ht9.a.c(s8e.INSTANCE, "PluginManager", "UmsUpdateCallback-onPluginCheckUpdateResult, pkgName:" + SeedlingSdk.INSTANCE.getEntrancePkgName$pantanal_client_release() + ", status=" + status + ", pluginType=" + pluginType, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                    InitCallback initCallback = initCallBack;
                    if (initCallback != null) {
                        initCallback.onPluginCheckUpdateResult(status, pluginType);
                    }
                }
            };
        }

        @VisibleForTesting
        public final long getAssetsFileSize(@NotNull Context context, @NotNull String path) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(path, "path");
            try {
                return context.getResources().getAssets().open(path).available();
            } catch (IOException e) {
                ht9.a.b(s8e.INSTANCE, PluginManager.TAG, "getAssetsFileSize fail: " + e.getMessage(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                return -1L;
            }
        }

        @Nullable
        public final InitCallback getMInitCallback() {
            return this.mInitCallback;
        }

        @Nullable
        /* JADX INFO: renamed from: isSdkInternalInitSuccess, reason: from getter */
        public final Boolean getIsSdkInternalInitSuccess() {
            return this.isSdkInternalInitSuccess;
        }

        @Override // com.oplus.seedling.sdk.callback.InstallMonitorCallback
        public void onSdkInternalInited(boolean isSuccess) {
            ht9.a.c(s8e.INSTANCE, PluginManager.TAG, "onSdkInternalInited " + hashCode() + " isSuccess = " + isSuccess, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            synchronized (this) {
                this.isSdkInternalInitSuccess = Boolean.valueOf(isSuccess);
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                notify();
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // com.oplus.seedling.sdk.callback.InstallMonitorCallback
        public void onUmsUpdated() throws PackageManager.NameNotFoundException {
            s8e s8eVar = s8e.INSTANCE;
            ht9.a.c(s8eVar, PluginManager.TAG, "On ums updated.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            long jCurrentTimeMillis = System.currentTimeMillis();
            SeedlingSdk seedlingSdk = SeedlingSdk.INSTANCE;
            Context contextCreatePackageContext = seedlingSdk.getSAppContext$pantanal_client_release().createPackageContext("com.oplus.pantanal.ums", 2);
            PluginManager$InstallMonitor$onUmsUpdated$reportPluginFileInitExecution$1 pluginManager$InstallMonitor$onUmsUpdated$reportPluginFileInitExecution$1 = new Function1<String, Unit>() { // from class: com.oplus.seedling.sdk.plugin.PluginManager$InstallMonitor$onUmsUpdated$reportPluginFileInitExecution$1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((String) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull String str) {
                    Intrinsics.checkNotNullParameter(str, "errorMessage");
                    PluginManager.INSTANCE.getSInstance().reportPluginFileInitExecution(str);
                }
            };
            zoe zoeVarBuildInitCallbackWrapper = buildInitCallbackWrapper(this.mInitCallback);
            boolean z = seedlingSdk.getSEngineType$pantanal_client_release() == EngineType.LITE;
            Intrinsics.checkNotNullExpressionValue(contextCreatePackageContext, "urtContext");
            hkk.b(contextCreatePackageContext, seedlingSdk.getSAppContext$pantanal_client_release(), pluginManager$InstallMonitor$onUmsUpdated$reportPluginFileInitExecution$1, zoeVarBuildInitCallbackWrapper, z);
            ht9.a.c(s8eVar, PluginManager.TAG, " onUmsUpdated: end  consuming: " + (System.currentTimeMillis() - jCurrentTimeMillis), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }

        public final void setMInitCallback(@Nullable InitCallback initCallback) {
            this.mInitCallback = initCallback;
        }

        public final void setSdkInternalInitSuccess(@Nullable Boolean bool) {
            this.isSdkInternalInitSuccess = bool;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.oplus.seedling.sdk.plugin.PluginManager$invokeReleaseSdk$1", f = "PluginManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class 1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public 1(Continuation<? super 1> continuation) {
            super(2, continuation);
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PluginManager.this.new 1(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object obj2;
            Unit unit;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            s8e s8eVar = s8e.INSTANCE;
            ht9.a.c(s8eVar, PluginManager.TAG, "Start invoke release sdk,step2", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            STraceUtils.a("panta:sdk:PluginManager.invokeReleaseSdk");
            PluginManager pluginManager = PluginManager.this;
            try {
                Result.Companion companion = Result.Companion;
                IInitManager iInitManagerLoadInitManager = pluginManager.loadInitManager();
                if (iInitManagerLoadInitManager != null) {
                    iInitManagerLoadInitManager.releaseSdk();
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    ht9.a.e(s8eVar, PluginManager.TAG, "releaseSdk failed via manager is null.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                }
                obj2 = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj2);
            if (th2 != null) {
                ht9.a.b(s8e.INSTANCE, PluginManager.TAG, "Exception happen for invoke release sdk ", false, (String) null, false, 0, false, th2, 124, (Object) null);
            }
            STraceUtils.b();
            return Unit.INSTANCE;
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }
    }

    public /* synthetic */ PluginManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final void doInit(InitCallback initCallback, boolean isPluginUpdated, SeedlingInitConfig initConfig) {
        Object obj;
        s8e s8eVar = s8e.INSTANCE;
        ht9.a.c(s8eVar, TAG, "doInit begin", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        String pathLocalConfig = SeedlingConstants.PluginFilePath.getPathLocalConfig(SeedlingSdk.INSTANCE.getSAppContext$pantanal_client_release());
        ht9.a.c(s8eVar, PluginFileUtils.TAG, "Start load local config for " + pathLocalConfig + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        File file = new File(pathLocalConfig);
        Object obj2 = null;
        if (file.exists()) {
            try {
                FileReader fileReader = new FileReader(file);
                try {
                    Object objFromJson = new Gson().fromJson(fileReader, SeedlingSdkConfigBean.class);
                    try {
                        CloseableKt.closeFinally(fileReader, (Throwable) null);
                        obj2 = objFromJson;
                    } catch (Exception e) {
                        e = e;
                        obj2 = objFromJson;
                        ht9.a.b(s8e.INSTANCE, PluginFileUtils.TAG, "Exception while read config : " + e.getMessage() + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(fileReader, th);
                        throw th2;
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
        } else {
            ht9.a.e(s8eVar, PluginFileUtils.TAG, "File is not exist.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }
        if (obj2 == null) {
            reportInitFail$default(this, 1000, "doInit, localConfig is null, consider this is the first time to copy plugin and failed", initCallback, null, 8, null);
            return;
        }
        if (this.pluginDexClassLoader == null || isPluginUpdated) {
            try {
                Result.Companion companion = Result.Companion;
                this.pluginDexClassLoader = initPluginClassLoader(initConfig);
                obj = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th3) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th3));
            }
            Throwable th4 = Result.exceptionOrNull-impl(obj);
            if (th4 != null) {
                reportInitFail$default(this, 1000, "doInit, initPluginClassLoader fail " + th4.getMessage() + " ", initCallback, null, 8, null);
                return;
            }
        }
        STraceUtils.a("panta:sdk:PluginManager.doInitSdk");
        doInitSdk(initConfig, initCallback);
        STraceUtils.b();
    }

    public static /* synthetic */ void doInit$default(PluginManager pluginManager, InitCallback initCallback, boolean z, SeedlingInitConfig seedlingInitConfig, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        pluginManager.doInit(initCallback, z, seedlingInitConfig);
    }

    private final void doInitSdk(SeedlingInitConfig initConfig, InitCallback initCallback) {
        Object obj;
        s8e s8eVar = s8e.INSTANCE;
        ht9.a.c(s8eVar, TAG, "doInitSdk,begin.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        this.entranceSdkVersionCode = Integer.valueOf(Integer.parseInt(BuildConfig.SDK_VERSION_CODE));
        try {
            Result.Companion companion = Result.Companion;
            invokeExchangeVersion();
            boolean zIsPluginSupportFeature$pantanal_client_release = isPluginSupportFeature$pantanal_client_release(0);
            InstallMonitor installMonitor = new InstallMonitor();
            ht9.a.c(s8eVar, TAG, "doInitSdk, SeedlingSdk version of entrance = 1.3.130, 10030130, isSupportCallback:" + zIsPluginSupportFeature$pantanal_client_release, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            installMonitor.setMInitCallback(initCallback);
            if (zIsPluginSupportFeature$pantanal_client_release) {
                handleInitAsync(installMonitor, initCallback, initConfig);
            } else {
                BuildersKt.runBlocking(Dispatchers.getMain(), new PluginManager$doInitSdk$1$1(this, installMonitor, initCallback, null));
                SeedlingSdk.INSTANCE.isInitialed$pantanal_client_release().set(2);
                initCallback.onSuccess();
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            reportInitFail(1002, "doInitSdk error, Exception happen for doInitSdk.", initCallback, th2);
        }
    }

    private final DexClassLoader gainPluginClassLoader() {
        DexClassLoader dexClassLoader = this.pluginDexClassLoader;
        if (dexClassLoader != null) {
            ht9.a.c(s8e.INSTANCE, TAG, "plugin class loader has inited,classloader = " + dexClassLoader, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return dexClassLoader;
        }
        DexClassLoader dexClassLoaderInitPluginClassLoader$default = initPluginClassLoader$default(this, null, 1, null);
        this.pluginDexClassLoader = dexClassLoaderInitPluginClassLoader$default;
        Intrinsics.checkNotNull(dexClassLoaderInitPluginClassLoader$default);
        x8e.g(dexClassLoaderInitPluginClassLoader$default.getClass());
        ht9.a.e(s8e.INSTANCE, TAG, "gainPluginClassLoader,pluginDexClassLoader create in gainPluginClassLoader!!", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        return dexClassLoaderInitPluginClassLoader$default;
    }

    private final ClassLoader getHostClassLoader(SeedlingInitConfig initConfig) {
        if ((initConfig != null ? initConfig.getHostClassLoader() : null) != null) {
            ht9.a.c(s8e.INSTANCE, TAG, "initPluginClassLoader,hostClassLoader use initConfig's classloader.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            ClassLoader hostClassLoader = initConfig.getHostClassLoader();
            Intrinsics.checkNotNull(hostClassLoader);
            return hostClassLoader;
        }
        if (initConfig == null || initConfig.getIsContextLoadedByAppDefaultClassLoader()) {
            ht9.a.c(s8e.INSTANCE, TAG, "initPluginClassLoader,hostClassLoader use sAppContext's classLoader.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            ClassLoader classLoader = SeedlingSdk.INSTANCE.getSAppContext$pantanal_client_release().getClassLoader();
            Intrinsics.checkNotNullExpressionValue(classLoader, "SeedlingSdk.sAppContext.classLoader");
            return classLoader;
        }
        SeedlingSdk seedlingSdk = SeedlingSdk.INSTANCE;
        ClassLoader parent = seedlingSdk.getSAppContext$pantanal_client_release().getClassLoader().getParent();
        s8e s8eVar = s8e.INSTANCE;
        ht9.a.c(s8eVar, TAG, "initPluginClassLoader,use appContext's parent classloader,classloader = ", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        if (parent.getParent() == null) {
            ht9.a.b(s8eVar, TAG, "initPluginClassLoader,hostAppClassLoader.parent is null,use origin classloadr,check your cofing. ", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            parent = seedlingSdk.getSAppContext$pantanal_client_release().getClassLoader();
        }
        Intrinsics.checkNotNullExpressionValue(parent, "hostAppClassLoader");
        return parent;
    }

    private final void handleInitAsync(InstallMonitor installMonitorCallback, InitCallback initCallback, SeedlingInitConfig initConfig) {
        s8e s8eVar;
        synchronized (installMonitorCallback) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (isPluginSupportFeature$pantanal_client_release(4)) {
                invokeInitSdk(installMonitorCallback, initCallback);
            } else {
                BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), (CoroutineContext) null, (CoroutineStart) null, new PluginManager$handleInitAsync$1$1(this, installMonitorCallback, initCallback, null), 3, (Object) null);
            }
            s8eVar = s8e.INSTANCE;
            ht9.a.c(s8eVar, TAG, "doInitSdk wait invokeInitSdk", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            Intrinsics.checkNotNull(installMonitorCallback, "null cannot be cast to non-null type java.lang.Object");
            installMonitorCallback.wait(8000L);
            ht9.a.c(s8eVar, TAG, "doInitSdk wait invokeInitSdk end, Time consuming " + (System.currentTimeMillis() - jCurrentTimeMillis), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            Unit unit = Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(installMonitorCallback.getIsSdkInternalInitSuccess(), Boolean.TRUE)) {
            SeedlingSdk.INSTANCE.isInitialed$pantanal_client_release().set(2);
            initCallback.onSuccess();
            notifyHostBlurAbilityChanged(initConfig);
            return;
        }
        ht9.a.b(s8eVar, TAG, "doInitSdk fail, " + installMonitorCallback.hashCode() + " isSdkInternalInitSuccess = " + installMonitorCallback.getIsSdkInternalInitSuccess(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        invokeReleaseSdk();
        reportInitFail$default(this, 1002, "sdk internal init fail", initCallback, null, 8, null);
    }

    private final DexClassLoader initPluginClassLoader(SeedlingInitConfig initConfig) throws IllegalAccessException, NoSuchFieldException {
        s8e s8eVar = s8e.INSTANCE;
        ht9.a.c(s8eVar, TAG, "initPluginClassLoader,Start init class loader,initConfig = " + initConfig, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        SeedlingSdk seedlingSdk = SeedlingSdk.INSTANCE;
        x8e.g(seedlingSdk.getSAppContext$pantanal_client_release().getClass());
        Context sAppContext$pantanal_client_release = seedlingSdk.getSAppContext$pantanal_client_release();
        Context contextHookResources = ReflectUtils.hookResources(sAppContext$pantanal_client_release);
        if (contextHookResources != null) {
            this.pluginContext = new toe(contextHookResources, contextHookResources.getTheme(), sAppContext$pantanal_client_release);
        }
        ClassLoader hostClassLoader = getHostClassLoader(initConfig);
        ht9.a.c(s8eVar, TAG, "initPluginClassLoader,hostAppClassLoader is " + hostClassLoader, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        String pathPlugin = SeedlingConstants.PluginFilePath.getPathPlugin(seedlingSdk.getSAppContext$pantanal_client_release());
        String absolutePath = seedlingSdk.getSAppContext$pantanal_client_release().getFilesDir().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "SeedlingSdk.sAppContext.filesDir.absolutePath");
        SeedlingClassLoader seedlingClassLoader = new SeedlingClassLoader(pathPlugin, absolutePath, SeedlingConstants.PluginFilePath.getPathFolderSo(seedlingSdk.getSAppContext$pantanal_client_release()), hostClassLoader, initConfig);
        toe toeVar = this.pluginContext;
        if (toeVar != null) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(toeVar);
            Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
            declaredField.setAccessible(true);
            declaredField.set(layoutInflaterFrom, new q8a(layoutInflaterFrom.getFactory2(), seedlingClassLoader));
        }
        return seedlingClassLoader;
    }

    public static /* synthetic */ DexClassLoader initPluginClassLoader$default(PluginManager pluginManager, SeedlingInitConfig seedlingInitConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            seedlingInitConfig = null;
        }
        return pluginManager.initPluginClassLoader(seedlingInitConfig);
    }

    private final void initSdkWithUserContext(InstallMonitorCallback installMonitorCallback, InitCallback initCallback) {
        IInitManager iInitManagerLoadInitManager;
        boolean zIsPluginSupportFeature$pantanal_client_release = isPluginSupportFeature$pantanal_client_release(1);
        if (!zIsPluginSupportFeature$pantanal_client_release) {
            reportInitFail$default(this, 1003, "initSdkWithUserContext error, because isSupportInitWithContext:" + zIsPluginSupportFeature$pantanal_client_release + ", pluginSdkVersionCode:" + this.pluginVersionCode, initCallback, null, 8, null);
            return;
        }
        IUserContext curUserContext$pantanal_client_release = SeedlingSdk.INSTANCE.getCurUserContext$pantanal_client_release();
        if (curUserContext$pantanal_client_release == null || (iInitManagerLoadInitManager = loadInitManager()) == null) {
            return;
        }
        ht9.a.e(s8e.INSTANCE, TAG, "initSdkWithUserContext success", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        iInitManagerLoadInitManager.initSdk(curUserContext$pantanal_client_release, installMonitorCallback);
    }

    private final void invokeExchangeVersion() {
        Object obj;
        Unit unit;
        final String str = "invokeExchangeVersion";
        try {
            Result.Companion companion = Result.Companion;
            s8e s8eVar = s8e.INSTANCE;
            ht9.a.c(s8eVar, TAG, "invokeExchangeVersion, Start invoke init exchange version.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            IInitManager iInitManagerLoadInitManager = loadInitManager();
            List<String> listExchangeVersion = iInitManagerLoadInitManager != null ? iInitManagerLoadInitManager.exchangeVersion("1.3.130-5a024cf", BuildConfig.SDK_VERSION_CODE) : null;
            if (listExchangeVersion != null) {
                String str2 = listExchangeVersion.get(0);
                String str3 = listExchangeVersion.get(1);
                ht9.a.c(s8eVar, TAG, "invokeExchangeVersion, plugin SeedlingSdk version name = " + str2 + ", VersionCode = " + str3, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                this.pluginVersionName = str2;
                this.pluginVersionCode = Integer.valueOf(Integer.parseInt(str3));
                if (!isPluginSupportFeature$pantanal_client_release(2) || listExchangeVersion.size() <= 2) {
                    ht9.a.c(s8eVar, TAG, "invokeExchangeVersion,plugin not support git commit hash or return list size < 3!", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                } else {
                    this.pluginGitCommitHash = listExchangeVersion.get(2);
                }
                unit = Unit.INSTANCE;
            } else {
                unit = new Function0<Unit>() { // from class: com.oplus.seedling.sdk.plugin.PluginManager$invokeExchangeVersion$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    public /* bridge */ /* synthetic */ Object invoke() {
                        invoke();
                        return Unit.INSTANCE;
                    }

                    public final void invoke() {
                        ht9.a.b(s8e.INSTANCE, "PluginManager", str + ",get plugin version failed!", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                    }
                };
            }
            obj = Result.constructor-impl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            ht9.a.e(s8e.INSTANCE, TAG, "invokeExchangeVersion,Exception happen for invoke exchange version : " + th2.getMessage() + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }
        LogUtils.injectPluginVersionInfo(this.pluginVersionName, this.pluginGitCommitHash);
        s8e.INSTANCE.p(this.pluginGitCommitHash, this.pluginVersionName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invokeInitSdk(InstallMonitorCallback installMonitorCallback, InitCallback initCallback) {
        Object obj;
        Unit unit;
        STraceUtils.a("panta:sdk:PluginManager.invokeInitSdk");
        SeedlingSdk seedlingSdk = SeedlingSdk.INSTANCE;
        String str = "Start invoke init sdk, pkgName:" + seedlingSdk.getSAppContext$pantanal_client_release().getPackageName();
        Context sAppContext$pantanal_client_release = this.pluginContext;
        if (sAppContext$pantanal_client_release == null) {
            sAppContext$pantanal_client_release = seedlingSdk.getSAppContext$pantanal_client_release();
        }
        try {
            Result.Companion companion = Result.Companion;
            if (seedlingSdk.getCurUserContext$pantanal_client_release() != null) {
                ht9.a.e(s8e.INSTANCE, TAG, str + " use userContext.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                initSdkWithUserContext(installMonitorCallback, initCallback);
            } else {
                s8e s8eVar = s8e.INSTANCE;
                ht9.a.e(s8eVar, TAG, str + " use normal context.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                IInitManager iInitManagerLoadInitManager = loadInitManager();
                if (iInitManagerLoadInitManager != null) {
                    iInitManagerLoadInitManager.initSdk(sAppContext$pantanal_client_release, installMonitorCallback);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    ht9.a.e(s8eVar, TAG, "initSdk failed via manager is null.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                }
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            reportInitFail(1002, str + " error, Exception happen for doInitSdk.", initCallback, th2);
        }
        STraceUtils.b();
    }

    private final void invokeOnTrimMemory(int level) {
        Object obj;
        Unit unit;
        s8e s8eVar = s8e.INSTANCE;
        ht9.a.c(s8eVar, TAG, "Start invoke invokeOnTrimMemory.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        try {
            Result.Companion companion = Result.Companion;
            IInitManager iInitManagerLoadInitManager = loadInitManager();
            if (iInitManagerLoadInitManager != null) {
                iInitManagerLoadInitManager.onTrimMemory(level);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                ht9.a.e(s8eVar, TAG, "onTrimMemory invoke failed via manager is null.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            ht9.a.b(s8e.INSTANCE, TAG, "Exception happen for invoke onTrimMemory", false, (String) null, false, 0, false, th2, 124, (Object) null);
        }
    }

    private final void invokeReleaseSdk() {
        s8e s8eVar = s8e.INSTANCE;
        ht9.a.c(s8eVar, TAG, "invokeReleaseSdk,begin,step1", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        long jCurrentTimeMillis = System.currentTimeMillis();
        BuildersKt.runBlocking(Dispatchers.getMain(), new 1(null));
        ht9.a.c(s8eVar, TAG, "invokeReleaseSdk,end,cost = " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IInitManager loadInitManager() {
        Object obj;
        s8e s8eVar = s8e.INSTANCE;
        ht9.a.c(s8eVar, TAG, "Start load init manager.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        if (this.initManager != null) {
            ht9.a.c(s8eVar, TAG, "loadInitManager,initManager has init,just return", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return this.initManager;
        }
        STraceUtils.a("panta:sdk:PluginManager.loadInitManager");
        x8e.g(SeedlingSdk.INSTANCE.getClass());
        try {
            Result.Companion companion = Result.Companion;
            Class<?> clsLoadClass = gainPluginClassLoader().loadClass(SeedlingConstants.PluginClassField.PACKAGE_PATH_SEEDLING_SDK);
            Intrinsics.checkNotNullExpressionValue(clsLoadClass, "pluginDexClassLoader.loa…ACKAGE_PATH_SEEDLING_SDK)");
            x8e.g(clsLoadClass);
            Object obj2 = clsLoadClass.getDeclaredField("INSTANCE").get(null);
            ht9.a.c(s8eVar, TAG, "loadInitManager  field.get(null) " + obj2 + "  class " + obj2.getClass(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            x8e.g(obj2.getClass());
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.oplus.seedling.sdk.manager.IInitManager");
            this.initManager = (IInitManager) obj2;
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            ht9.a.b(s8e.INSTANCE, TAG, "Exception happen for loadInitManager,msg = " + th2.getMessage(), false, (String) null, false, 0, false, th2, 124, (Object) null);
            String packageName = SeedlingSdk.INSTANCE.getSAppContext$pantanal_client_release().getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "SeedlingSdk.sAppContext.packageName");
            reportStatistics(StatisticsTrackUtil.EVENT_ID_LOAD_CLASS_ERROR, packageName, "Exception happen for loadInitManager,msg = " + th2.getMessage() + " trace:" + CallerTraceUtil.getCallerTrace(TAG, th2.getStackTrace()));
        }
        if (this.initManager == null) {
            ht9.a.e(s8e.INSTANCE, TAG, "initManager is null.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }
        STraceUtils.b();
        return this.initManager;
    }

    private final ISeedlingManager loadSeedlingManager(int entranceType) {
        Object obj;
        ht9.a.c(s8e.INSTANCE, TAG, "Start load seedling manager for " + entranceType + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        STraceUtils.a("panta:sdk:PluginManager.loadSeedlingManager");
        ISeedlingManager iSeedlingManager = null;
        try {
            Result.Companion companion = Result.Companion;
            Class<?> clsLoadClass = gainPluginClassLoader().loadClass(SeedlingConstants.PluginClassField.PACKAGE_PATH_SEEDLING_MANAGER);
            Intrinsics.checkNotNullExpressionValue(clsLoadClass, "pluginDexClassLoader.loa…GE_PATH_SEEDLING_MANAGER)");
            Method[] declaredMethods = clsLoadClass.getDeclaredMethods();
            Intrinsics.checkNotNullExpressionValue(declaredMethods, "clazz.declaredMethods");
            for (Method method : declaredMethods) {
                if (Intrinsics.areEqual("getInstance", method.getName())) {
                    ht9.a.c(s8e.INSTANCE, TAG, "Find the method of getInstance.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                    Object objInvoke = method.invoke(null, Integer.valueOf(entranceType));
                    if (!(objInvoke instanceof ISeedlingManager)) {
                        break;
                    }
                    iSeedlingManager = (ISeedlingManager) objInvoke;
                    break;
                }
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            ht9.a.b(s8e.INSTANCE, TAG, "Exception happen for loadSeedlingManager.", false, (String) null, false, 0, false, th2, 124, (Object) null);
            String packageName = SeedlingSdk.INSTANCE.getSAppContext$pantanal_client_release().getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "SeedlingSdk.sAppContext.packageName");
            reportStatistics(StatisticsTrackUtil.EVENT_ID_LOAD_CLASS_ERROR, packageName, "Exception happen for loadSeedlingManager. trace:" + CallerTraceUtil.getCallerTrace(TAG, th2.getStackTrace()));
        }
        if (iSeedlingManager == null) {
            ht9.a.e(s8e.INSTANCE, TAG, "seedlingmanager is null.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }
        STraceUtils.b();
        return iSeedlingManager;
    }

    private final void reportInitFail(int errorCode, String errorMsgToEntrance, InitCallback initCallback, Throwable throwable) {
        String packageName = SeedlingSdk.INSTANCE.getSAppContext$pantanal_client_release().getPackageName();
        String str = "reportInitFail pkgName:" + packageName + " errorMsgToEntrance:" + errorMsgToEntrance;
        if (throwable == null) {
            ht9.a.b(s8e.INSTANCE, TAG, str, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        } else {
            String str2 = str + ", throwable.message:" + throwable.getMessage();
            str = str + " trace: " + CallerTraceUtil.getCallerTrace(TAG, throwable.getStackTrace());
            ht9.a.b(s8e.INSTANCE, TAG, str2, false, (String) null, false, 0, false, throwable, 124, (Object) null);
        }
        Intrinsics.checkNotNullExpressionValue(packageName, TraceConstants.KEY_PKG_NAME);
        reportStatistics(StatisticsTrackUtil.EVENT_ID_PLUGIN_INIT, packageName, str);
        initCallback.onFailed(errorCode, errorMsgToEntrance);
    }

    public static /* synthetic */ void reportInitFail$default(PluginManager pluginManager, int i, String str, InitCallback initCallback, Throwable th, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            th = null;
        }
        pluginManager.reportInitFail(i, str, initCallback, th);
    }

    private final void reportStatistics(String eventId, String packageName, String message) {
        Map mapMutableMapOf = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to(StatisticsTrackUtil.KEY_PACKAGE_NAME, packageName)});
        if (message != null) {
            mapMutableMapOf.put("message", message);
        }
        StatisticsTrackUtil.uploadTechTrack$default(SeedlingSdk.INSTANCE.getSAppContext$pantanal_client_release(), eventId, mapMutableMapOf, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showConfigMsg(String status, toe pluginContext, Context hostContext, Configuration newConfig) {
        Resources resources;
        Resources resources2;
        ht9.a.c(s8e.INSTANCE, TAG, status + " showConfigMsg: ", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        Configuration configuration = null;
        Configuration configuration2 = (hostContext == null || (resources2 = hostContext.getResources()) == null) ? null : resources2.getConfiguration();
        if (pluginContext != null && (resources = pluginContext.getResources()) != null) {
            configuration = resources.getConfiguration();
        }
        showSingleConfigMsg("[pluginConfig]", configuration);
        showSingleConfigMsg("[hostContext]", configuration2);
        showSingleConfigMsg("[newConfig]", newConfig);
    }

    public static /* synthetic */ void showConfigMsg$default(PluginManager pluginManager, String str, toe toeVar, Context context, Configuration configuration, int i, Object obj) {
        if ((i & 2) != 0) {
            toeVar = null;
        }
        if ((i & 4) != 0) {
            context = null;
        }
        if ((i & 8) != 0) {
            configuration = null;
        }
        pluginManager.showConfigMsg(str, toeVar, context, configuration);
    }

    private final void showSingleConfigMsg(String preMsg, Configuration config) {
        if (config == null) {
            return;
        }
        ht9.a.c(s8e.INSTANCE, TAG, "showSingleConfigMsg, " + preMsg + " densityDpi = " + config.densityDpi + ", uiMode = " + config.uiMode + ", whole config = " + config, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateNewConfig(Context hostContext, Configuration newConfig) {
        String packageName = hostContext.getPackageName();
        s8e s8eVar = s8e.INSTANCE;
        ht9.a.c(s8eVar, TAG, "updateNewConfig, hostPkgName = " + packageName, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        if (!Intrinsics.areEqual(packageName, "com.oplus.secondaryhome")) {
            ht9.a.c(s8eVar, TAG, "updateNewConfig, not secondaryhome, do nothing", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        } else {
            newConfig.densityDpi = hostContext.getResources().getConfiguration().densityDpi;
            showSingleConfigMsg("updateNewConfig finish [newConfig]", newConfig);
        }
    }

    public final void dispatchConfigurationChanged$pantanal_client_release(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        try {
            this.hostConfigurationChangedCallback.onConfigurationChanged(newConfig);
            IInitManager iInitManagerLoadInitManager = loadInitManager();
            if (iInitManagerLoadInitManager != null) {
                iInitManagerLoadInitManager.dispatchConfigurationChanged(newConfig);
            }
        } catch (AbstractMethodError unused) {
            ht9.a.b(s8e.INSTANCE, TAG, "dispatchConfigurationChanged fail", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }
    }

    @Nullable
    public final ISeedlingManager gainSeedlingManager(int entranceType) {
        ISeedlingManager iSeedlingManager;
        String str = "gainSeedlingManager, entranceType:" + entranceType;
        s8e s8eVar = s8e.INSTANCE;
        ht9.a.d(s8eVar, TAG, str + ", Start gain seedling manager.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        ISeedlingManager iSeedlingManager2 = this.seedlingManagerMap.get(Integer.valueOf(entranceType));
        if (iSeedlingManager2 != null) {
            ht9.a.d(s8eVar, TAG, str + ", Seedling manager is already exist,step1.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return iSeedlingManager2;
        }
        synchronized (this.seedlingManagerMap) {
            ISeedlingManager iSeedlingManager3 = this.seedlingManagerMap.get(Integer.valueOf(entranceType));
            if (iSeedlingManager3 != null) {
                ht9.a.d(s8eVar, TAG, str + ", Seedling manager is already exist,step2.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                return iSeedlingManager3;
            }
            ISeedlingManager iSeedlingManagerLoadSeedlingManager = loadSeedlingManager(entranceType);
            if (iSeedlingManagerLoadSeedlingManager != null) {
                ht9.a.c(s8eVar, TAG, str + ", Seedling manager load success,before save to cache," + this.seedlingManagerMap, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                this.seedlingManagerMap.put(Integer.valueOf(entranceType), iSeedlingManagerLoadSeedlingManager);
                ht9.a.c(s8eVar, TAG, str + ", Seedling manager load success,after save to cache," + this.seedlingManagerMap, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                iSeedlingManager = iSeedlingManagerLoadSeedlingManager;
            } else {
                iSeedlingManager = null;
            }
            return iSeedlingManager;
        }
    }

    @Nullable
    public final toe getPluginContext() {
        return this.pluginContext;
    }

    @Nullable
    /* JADX INFO: renamed from: getSeedlingPluginClassLoader$pantanal_client_release, reason: from getter */
    public final DexClassLoader getPluginDexClassLoader() {
        return this.pluginDexClassLoader;
    }

    public final void init(@NotNull InitCallback initCallback, @Nullable SeedlingInitConfig initConfig) {
        Intrinsics.checkNotNullParameter(initCallback, "initCallback");
        s8e s8eVar = s8e.INSTANCE;
        ht9.a.c(s8eVar, TAG, "Start init plugin ", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        registerPluginContextConfigChange$pantanal_client_release();
        STraceUtils.a("panta:sdk:PluginManager.initPluginFiles");
        int iInitPluginFiles = SeedlingSdkPluginFileUtils.initPluginFiles(initConfig);
        STraceUtils.b();
        if (iInitPluginFiles == 1010 || iInitPluginFiles == 1011) {
            doInit$default(this, initCallback, false, initConfig, 2, null);
        }
        switch (iInitPluginFiles) {
            case 1000:
                reportInitFail$default(this, 1000, "plugin copy error", initCallback, null, 8, null);
                break;
            case 1001:
                reportInitFail$default(this, 1001, "plugin verify error", initCallback, null, 8, null);
                break;
            case 1002:
                reportInitFail$default(this, 1002, "throw exception during init plugin files", initCallback, null, 8, null);
                break;
            default:
                ht9.a.b(s8eVar, TAG, "init error, because " + iInitPluginFiles + " is not exist, maybe the code is not correct", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                break;
        }
    }

    public final boolean isPluginSupportFeature$pantanal_client_release(int feature) {
        Object obj;
        boolean zIsPluginSupportFeature;
        String str = "isPluginSupportFeature feature:" + feature;
        try {
            Result.Companion companion = Result.Companion;
            IInitManager iInitManagerLoadInitManager = loadInitManager();
            if (iInitManagerLoadInitManager != null) {
                zIsPluginSupportFeature = iInitManagerLoadInitManager.isPluginSupportFeature(feature);
            } else {
                ht9.a.e(s8e.INSTANCE, TAG, str + ", get result is null, so return false", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                zIsPluginSupportFeature = false;
            }
            obj = Result.constructor-impl(Boolean.valueOf(zIsPluginSupportFeature));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            ht9.a.b(s8e.INSTANCE, TAG, str + ", pluginSdkVersionCode:" + this.pluginVersionCode + ", maybe version is not compatible, errorMsg:" + th2.getMessage(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }
        Boolean bool = Boolean.FALSE;
        if (Result.isFailure-impl(obj)) {
            obj = bool;
        }
        return ((Boolean) obj).booleanValue();
    }

    public final void notifyHostBlurAbilityChanged(boolean supportBlur, boolean isLightColor, @NotNull Map<String, ? extends Object> extras) {
        Intrinsics.checkNotNullParameter(extras, BridgeConstant.KEY_EXTRAS);
        s8e s8eVar = s8e.INSTANCE;
        ht9.a.e(s8eVar, TAG, "notifyHostBlurAbilityChanged begin,supportBlur=" + supportBlur + ",isLightColor=" + isLightColor + ",extras=" + extras, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        if (!isPluginSupportFeature$pantanal_client_release(3)) {
            ht9.a.e(s8eVar, TAG, "notifyHostBlurAbilityChanged just return,plugin is old.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            IInitManager iInitManagerLoadInitManager = loadInitManager();
            if (iInitManagerLoadInitManager == null) {
                ht9.a.b(s8eVar, TAG, "notifyHostBlurAbilityChanged failed,initManager is null.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            } else {
                iInitManagerLoadInitManager.notifyHostBlurAbilityChanged(supportBlur, isLightColor, extras);
            }
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
    }

    @Override // com.oplus.aiunit.vision.zoe
    public void onPluginCheckUpdateResult(int i, int i2) {
        zoe.a.a(this, i, i2);
    }

    public void onPluginUpdated() {
    }

    public final void onTrimMemory(int level) {
        invokeOnTrimMemory(level);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object quit$pantanal_client_release(@NotNull Continuation<? super Unit> continuation) {
        PluginManager$quit$1 pluginManager$quit$1;
        Object obj;
        Unit unit;
        PluginManager pluginManager = this;
        if (continuation instanceof PluginManager$quit$1) {
            pluginManager$quit$1 = (PluginManager$quit$1) continuation;
            int i = pluginManager$quit$1.label;
            if ((i & SauAarConstants.I) != 0) {
                pluginManager$quit$1.label = i - SauAarConstants.I;
            } else {
                pluginManager$quit$1 = new PluginManager$quit$1(pluginManager, continuation);
            }
        } else {
            pluginManager$quit$1 = new PluginManager$quit$1(pluginManager, continuation);
        }
        Object obj2 = pluginManager$quit$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = pluginManager$quit$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj2);
            x8e.g(Dispatchers.getMain().getClass());
            INSTANCE.getSInstance().pluginDexClassLoader = null;
            pluginManager$quit$1.L$0 = pluginManager;
            pluginManager$quit$1.label = 1;
            if (DelayKt.delay(SDK_DELAY_QUIT, pluginManager$quit$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pluginManager = (PluginManager) pluginManager$quit$1.L$0;
            ResultKt.throwOnFailure(obj2);
        }
        PluginManager pluginManager2 = pluginManager;
        try {
            Result.Companion companion = Result.Companion;
            ht9.a.c(s8e.INSTANCE, TAG, "quit() initManager=" + pluginManager2.initManager + " ", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            toe toeVar = pluginManager2.pluginContext;
            if (toeVar != null) {
                IInitManager iInitManager = pluginManager2.initManager;
                if (iInitManager != null) {
                    iInitManager.quitSdk(toeVar);
                }
                pluginManager2.initManager = null;
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            obj = Result.constructor-impl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            ht9.a.e(s8e.INSTANCE, TAG, "quit() exception=" + th2, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }
        pluginManager2.pluginContext = null;
        return Unit.INSTANCE;
    }

    public final void registerPluginContextConfigChange$pantanal_client_release() {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            SeedlingSdk seedlingSdk = SeedlingSdk.INSTANCE;
            seedlingSdk.getSAppContext$pantanal_client_release().unregisterComponentCallbacks(this.hostConfigurationChangedCallback);
            seedlingSdk.getSAppContext$pantanal_client_release().registerComponentCallbacks(this.hostConfigurationChangedCallback);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            ht9.a.b(s8e.INSTANCE, TAG, "registerPluginContextConfigChange error " + th2.getMessage(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }
    }

    public final void release() {
        ht9.a.a(s8e.INSTANCE, TAG, "release begin,seedlingManagerMap = " + this.seedlingManagerMap, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        Collection<ISeedlingManager> collectionValues = this.seedlingManagerMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "seedlingManagerMap.values");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((ISeedlingManager) it.next()).release();
        }
        this.seedlingManagerMap.clear();
        invokeReleaseSdk();
        unregisterPluginContextConfigChange$pantanal_client_release();
        ht9.a.a(s8e.INSTANCE, TAG, "pluginDexClassLoader:" + INSTANCE.getSInstance().pluginDexClassLoader, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
    }

    public final void releaseSeedlingManager(int entranceType) {
        Unit unit;
        String str = "releaseSeedlingManager, entranceType:" + entranceType;
        ISeedlingManager iSeedlingManagerRemove = this.seedlingManagerMap.remove(Integer.valueOf(entranceType));
        if (iSeedlingManagerRemove != null) {
            ht9.a.c(s8e.INSTANCE, TAG, str + ", Start release seedling manager.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            iSeedlingManagerRemove.release();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            ht9.a.c(s8e.INSTANCE, TAG, str + ", seedlingManager is null, ignore", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }
    }

    public final void reportPluginFileInitExecution(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String packageName = SeedlingSdk.INSTANCE.getSAppContext$pantanal_client_release().getPackageName();
        String str = ("reportPluginFileInitExecution pkgName:" + packageName + "[1.3.130] ") + message;
        ht9.a.b(s8e.INSTANCE, TAG, str, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        Intrinsics.checkNotNullExpressionValue(packageName, TraceConstants.KEY_PKG_NAME);
        reportStatistics(StatisticsTrackUtil.EVENT_ID_PLUGIN_INIT, packageName, str);
    }

    public final void unregisterPluginContextConfigChange$pantanal_client_release() {
        Object obj;
        s8e s8eVar = s8e.INSTANCE;
        SeedlingSdk seedlingSdk = SeedlingSdk.INSTANCE;
        ht9.a.c(s8eVar, TAG, "unregisterPluginContextConfigChange SeedlingSdk.sAppContext:" + seedlingSdk.getSAppContext$pantanal_client_release() + "sAppContext.applicationContext: " + seedlingSdk.getSAppContext$pantanal_client_release().getApplicationContext(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        try {
            Result.Companion companion = Result.Companion;
            seedlingSdk.getSAppContext$pantanal_client_release().unregisterComponentCallbacks(this.hostConfigurationChangedCallback);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            ht9.a.b(s8e.INSTANCE, TAG, "unregister hostConfigurationChangedCallback error " + th2.getMessage(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }
    }

    private PluginManager() {
        this.seedlingManagerMap = new ConcurrentHashMap<>();
        this.hostConfigurationChangedCallback = new PluginManager$hostConfigurationChangedCallback$1(this);
    }

    @Override // com.oplus.aiunit.vision.zoe
    public void onPluginCheckUpdateResult(int i, int i2, int i3, long j) {
        zoe.a.b(this, i, i2, i3, j);
    }

    private final void notifyHostBlurAbilityChanged(SeedlingInitConfig seedlingInitConfig) {
        if (seedlingInitConfig == null) {
            ht9.a.e(s8e.INSTANCE, TAG, "notifyHostBlurAbilityChanged just return,initConfig is null.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        } else {
            notifyHostBlurAbilityChanged(seedlingInitConfig.getNeedHostHandleCardBg(), seedlingInitConfig.getIsHostLightColor(), seedlingInitConfig.getExtrasDataToEngine());
        }
    }
}
