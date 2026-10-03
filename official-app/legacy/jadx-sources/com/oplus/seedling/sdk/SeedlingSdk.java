package com.oplus.seedling.sdk;

import android.content.Context;
import android.content.res.Configuration;
import androidx.annotation.WorkerThread;
import androidx.core.app.FrameMetricsAggregator;
import com.oplus.aiunit.vision.bs9;
import com.oplus.aiunit.vision.t6e;
import com.oplus.aiunit.vision.y6e;
import com.oplus.channel.server.IUserContext;
import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.seedling.sdk.SeedlingSdk;
import com.oplus.seedling.sdk.callback.InitCallback;
import com.oplus.seedling.sdk.cardservice.CardServiceEntranceHelper;
import com.oplus.seedling.sdk.entity.EngineType;
import com.oplus.seedling.sdk.manager.ISeedlingManager;
import com.oplus.seedling.sdk.plugin.PluginManager;
import com.oplus.seedling.sdk.unlock.UserUnlockManager;
import com.oplus.seedling.sdk.utils.SeedlingIntentUtil;
import com.opos.process.bridge.base.BridgeConstant;
import com.pantanal.fundation.internal.thread.DispatchersUtil;
import com.pantanal.fundation.internal.utils.STraceUtils;
import dalvik.system.DexClassLoader;
import java.util.Map;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.coroutines.jvm.internal.SuspendLambda;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001vB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020FH\u0002J\u0010\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020@H\u0002J\b\u0010K\u001a\u00020\u000fH\u0002J \u0010L\u001a\u00020I2\u0006\u0010M\u001a\u00020:2\u0006\u0010J\u001a\u00020@2\u0006\u0010N\u001a\u00020FH\u0002J\u0010\u0010O\u001a\u0004\u0018\u00010P2\u0006\u0010Q\u001a\u00020RJ\b\u0010S\u001a\u0004\u0018\u00010#J\b\u0010T\u001a\u0004\u0018\u00010UJ\b\u0010V\u001a\u00020IH\u0002J\u0018\u0010W\u001a\u00020I2\u0006\u0010M\u001a\u00020:2\u0006\u0010X\u001a\u00020\u0004H\u0002J\u001e\u0010Y\u001a\u00020I2\u0006\u0010M\u001a\u00020:2\u0006\u0010\"\u001a\u00020#2\u0006\u0010Z\u001a\u00020FJ\u001e\u0010Y\u001a\u00020I2\u0006\u0010M\u001a\u00020:2\u0006\u0010J\u001a\u00020@2\u0006\u0010G\u001a\u00020FJ\u001e\u0010Y\u001a\u00020I2\u0006\u0010[\u001a\u00020\t2\u0006\u0010\"\u001a\u00020#2\u0006\u0010Z\u001a\u00020FJ\u001e\u0010Y\u001a\u00020I2\u0006\u0010[\u001a\u00020\t2\u0006\u0010J\u001a\u00020@2\u0006\u0010\\\u001a\u00020FJ\b\u0010]\u001a\u00020%H\u0002J\u000e\u0010^\u001a\u00020\u000f2\u0006\u0010_\u001a\u00020RJ\u0010\u0010`\u001a\u00020\u000f2\u0006\u0010a\u001a\u00020:H\u0007J$\u0010`\u001a\u00020I2\u0006\u0010a\u001a\u00020:2\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020I0bH\u0007J\u0010\u0010c\u001a\u00020\u000f2\u0006\u0010a\u001a\u00020:H\u0007J$\u0010c\u001a\u00020I2\u0006\u0010a\u001a\u00020:2\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020I0bH\u0007J$\u0010c\u001a\u00020I2\u0006\u0010[\u001a\u00020\t2\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020I0bH\u0007J\u0010\u0010d\u001a\u00020\u000f2\u0006\u0010a\u001a\u00020:H\u0007J\u0010\u0010e\u001a\u00020\u000f2\u0006\u0010f\u001a\u00020RH\u0007J\u000e\u0010g\u001a\u00020I2\u0006\u0010h\u001a\u00020iJ,\u0010j\u001a\u00020I2\u0006\u0010k\u001a\u00020\u000f2\u0006\u0010l\u001a\u00020\u000f2\u0014\u0010m\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010!J\u000e\u0010n\u001a\u00020I2\u0006\u0010o\u001a\u00020\u000fJ\u000e\u0010p\u001a\u00020I2\u0006\u0010q\u001a\u00020RJ\u0006\u0010r\u001a\u00020IJ\u0006\u0010s\u001a\u00020IJ\u001c\u0010t\u001a\u00020I2\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020I0bH\u0007J\u0006\u0010u\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\u0012\u0010*\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010+R\u0012\u0010,\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010+R\u001a\u0010-\u001a\u00020.X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u00020\u0016X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0018\"\u0004\b5\u0010\u001aR\u001c\u00106\u001a\u0004\u0018\u00010\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u000b\"\u0004\b8\u0010\rR\u001a\u00109\u001a\u00020:X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020@X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006w"}, d2 = {"Lcom/oplus/seedling/sdk/SeedlingSdk;", "", "()V", "INIT_THREAD_NAME", "", "TAG", "coroutineExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "curUserContext", "Lcom/oplus/channel/server/IUserContext;", "getCurUserContext$pantanal_client_release", "()Lcom/oplus/channel/server/IUserContext;", "setCurUserContext$pantanal_client_release", "(Lcom/oplus/channel/server/IUserContext;)V", "value", "", "enableConfigurationChangeCallback", "getEnableConfigurationChangeCallback", "()Z", "setEnableConfigurationChangeCallback", "(Z)V", "enableInterruptCreatingCard", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getEnableInterruptCreatingCard$pantanal_client_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "setEnableInterruptCreatingCard$pantanal_client_release", "(Ljava/util/concurrent/atomic/AtomicBoolean;)V", "entrancePkgName", "getEntrancePkgName$pantanal_client_release", "()Ljava/lang/String;", "setEntrancePkgName$pantanal_client_release", "(Ljava/lang/String;)V", "extrasDataToEngine", "", "initConfig", "Lcom/oplus/seedling/sdk/SeedlingInitConfig;", "interfaceScope", "Lkotlinx/coroutines/CoroutineScope;", "getInterfaceScope", "()Lkotlinx/coroutines/CoroutineScope;", "interfaceScope$delegate", "Lkotlin/Lazy;", "isHostLightColor", "Ljava/lang/Boolean;", "isHostSupportBlur", "isInitialed", "Ljava/util/concurrent/atomic/AtomicInteger;", "isInitialed$pantanal_client_release", "()Ljava/util/concurrent/atomic/AtomicInteger;", "setInitialed$pantanal_client_release", "(Ljava/util/concurrent/atomic/AtomicInteger;)V", "isQuit", "isQuit$pantanal_client_release", "setQuit$pantanal_client_release", "preUserContext", "getPreUserContext$pantanal_client_release", "setPreUserContext$pantanal_client_release", "sAppContext", "Landroid/content/Context;", "getSAppContext$pantanal_client_release", "()Landroid/content/Context;", "setSAppContext$pantanal_client_release", "(Landroid/content/Context;)V", "sEngineType", "Lcom/oplus/seedling/sdk/entity/EngineType;", "getSEngineType$pantanal_client_release", "()Lcom/oplus/seedling/sdk/entity/EngineType;", "setSEngineType$pantanal_client_release", "(Lcom/oplus/seedling/sdk/entity/EngineType;)V", "buildInitCallbackWrapper", "Lcom/oplus/seedling/sdk/callback/InitCallback;", "entranceCallBack", "checkEngineType", "", "engineType", "checkIfNeedReInit", "doInit", "appContext", "initCallbackWrapper", "gainSeedlingManager", "Lcom/oplus/seedling/sdk/manager/ISeedlingManager;", "entranceType", "", "getInitConfig", "getSeedlingPluginClassLoader", "Ldalvik/system/DexClassLoader;", "handleInitConfig", "handleSaveContext", "curFunName", "init", "initCallback", "userContext", "callback", "initInterfaceScope", "isPluginSupportFeature", "feature", Constants.METHOD_SEEDLING_SUPPORT, "context", "Lkotlin/Function1;", "isSupportFluidCloud", "isSupportSystemSendIntent", "isSupportTryAgain", "errorCode", "notifyConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "notifyHostBlurAbilityChanged", "isSupportBlur", "isLightColor", BridgeConstant.KEY_EXTRAS, "notifyInterruptLoadingCard", "enableInterrupt", "onTrimMemory", "level", "quit", "release", "removeIsSupportFluidCloudCallBack", "shouldInterruptCreatingCard", "InitStatus", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSeedlingSdk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SeedlingSdk.kt\ncom/oplus/seedling/sdk/SeedlingSdk\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,822:1\n48#2,4:823\n*S KotlinDebug\n*F\n+ 1 SeedlingSdk.kt\ncom/oplus/seedling/sdk/SeedlingSdk\n*L\n92#1:823,4\n*E\n"})
public final class SeedlingSdk {

    @NotNull
    private static final String INIT_THREAD_NAME = "pcs_plugin_init";

    @NotNull
    private static final String TAG = "SeedlingSdkInterface";

    @Nullable
    private static volatile IUserContext curUserContext;

    @Nullable
    private static Map<String, ? extends Object> extrasDataToEngine;

    @Nullable
    private static volatile SeedlingInitConfig initConfig;

    @Nullable
    private static Boolean isHostLightColor;

    @Nullable
    private static Boolean isHostSupportBlur;

    @Nullable
    private static volatile IUserContext preUserContext;
    public static volatile Context sAppContext;
    public static EngineType sEngineType;

    @NotNull
    public static final SeedlingSdk INSTANCE = new SeedlingSdk();
    private static boolean enableConfigurationChangeCallback = true;

    @NotNull
    private static String entrancePkgName = "";

    @NotNull
    private static volatile AtomicBoolean enableInterruptCreatingCard = new AtomicBoolean(false);

    @NotNull
    private static AtomicInteger isInitialed = new AtomicInteger(1);

    @NotNull
    private static final CoroutineExceptionHandler coroutineExceptionHandler = new SeedlingSdk$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE);

    /* JADX INFO: renamed from: interfaceScope$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy interfaceScope = LazyKt__LazyJVMKt.lazy(new Function0<CoroutineScope>() { // from class: com.oplus.seedling.sdk.SeedlingSdk$interfaceScope$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final CoroutineScope invoke() {
            return SeedlingSdk.INSTANCE.initInterfaceScope();
        }
    });

    @NotNull
    private static volatile AtomicBoolean isQuit = new AtomicBoolean(false);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/oplus/seedling/sdk/SeedlingSdk$InitStatus;", "", "()V", "INITED", "", "NOT_INITED", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InitStatus {
        public static final int INITED = 2;

        @NotNull
        public static final InitStatus INSTANCE = new InitStatus();
        public static final int NOT_INITED = 1;

        private InitStatus() {
        }
    }

    /* JADX INFO: renamed from: com.oplus.seedling.sdk.SeedlingSdk$init$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.oplus.seedling.sdk.SeedlingSdk$init$1", f = "SeedlingSdk.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17341 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $appContext;
        final /* synthetic */ EngineType $engineType;
        final /* synthetic */ InitCallback $initCallbackWrapper;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17341(Context context, EngineType engineType, InitCallback initCallback, Continuation<? super C17341> continuation) {
            super(2, continuation);
            this.$appContext = context;
            this.$engineType = engineType;
            this.$initCallbackWrapper = initCallback;
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C17341(this.$appContext, this.$engineType, this.$initCallbackWrapper, continuation);
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws InterruptedException {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SeedlingSdk seedlingSdk = SeedlingSdk.INSTANCE;
            int i = seedlingSdk.isInitialed$pantanal_client_release().get();
            if (i == 1) {
                bs9.a.c(t6e.INSTANCE, SeedlingSdk.TAG, "init(),NOT_INITED,doInit", false, null, false, 0, false, null, 252, null);
                seedlingSdk.doInit(this.$appContext, this.$engineType, this.$initCallbackWrapper);
            } else if (i == 2) {
                if (seedlingSdk.checkIfNeedReInit()) {
                    t6e t6eVar = t6e.INSTANCE;
                    bs9.a.c(t6eVar, SeedlingSdk.TAG, "init(), INITED,but need reinit,do release first.", false, null, false, 0, false, null, 252, null);
                    PluginManager.INSTANCE.getSInstance().release();
                    seedlingSdk.isInitialed$pantanal_client_release().set(1);
                    bs9.a.c(t6eVar, SeedlingSdk.TAG, "init(), release done,change state to NOT_INITED", false, null, false, 0, false, null, 252, null);
                    seedlingSdk.doInit(this.$appContext, this.$engineType, this.$initCallbackWrapper);
                } else {
                    bs9.a.c(t6e.INSTANCE, SeedlingSdk.TAG, "SeedlingSdk interface already initialed,just notify success!", false, null, false, 0, false, null, 252, null);
                    this.$initCallbackWrapper.onSuccess();
                }
            }
            return Unit.INSTANCE;
        }

        @Override // p010kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C17341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.oplus.seedling.sdk.SeedlingSdk$isSeedlingSupport$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.oplus.seedling.sdk.SeedlingSdk$isSeedlingSupport$2", f = "SeedlingSdk.kt", i = {}, l = {FrameMetricsAggregator.EVERY_DURATION}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $callback;
        final /* synthetic */ Context $context;
        int label;

        /* JADX INFO: renamed from: com.oplus.seedling.sdk.SeedlingSdk$isSeedlingSupport$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "com.oplus.seedling.sdk.SeedlingSdk$isSeedlingSupport$2$1", f = "SeedlingSdk.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<Boolean, Unit> $callback;
            final /* synthetic */ Context $context;
            final /* synthetic */ boolean $result;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Context context, boolean z, Function1<? super Boolean, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$context = context;
                this.$result = z;
                this.$callback = function1;
            }

            @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$context, this.$result, this.$callback, continuation);
            }

            @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                bs9.a.c(t6e.INSTANCE, SeedlingSdk.TAG, "callback isSeedlingSupport, finally to entrancePkgName:" + this.$context.getPackageName() + ", isSeedlingSupport:" + this.$result, false, null, false, 0, false, null, 252, null);
                STraceUtils.a("panta:sdk:isSeedlingSupport.callback");
                this.$callback.invoke(Boxing.boxBoolean(this.$result));
                STraceUtils.b();
                return Unit.INSTANCE;
            }

            @Override // p010kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Context context, Function1<? super Boolean, Unit> function1, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$callback = function1;
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.$context, this.$callback, continuation);
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SeedlingSdk.INSTANCE.handleSaveContext(this.$context, "isSeedlingSupport with callback.");
                boolean zQueryIsSeedlingSupport$pantanal_client_release = SeedlingIntentUtil.queryIsSeedlingSupport$pantanal_client_release(this.$context);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, zQueryIsSeedlingSupport$pantanal_client_release, this.$callback, null);
                this.label = 1;
                if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // p010kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.oplus.seedling.sdk.SeedlingSdk$isSupportFluidCloud$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.oplus.seedling.sdk.SeedlingSdk$isSupportFluidCloud$2", f = "SeedlingSdk.kt", i = {}, l = {586, 596}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17352 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $callback;
        final /* synthetic */ Context $context;
        int label;

        /* JADX INFO: renamed from: com.oplus.seedling.sdk.SeedlingSdk$isSupportFluidCloud$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "com.oplus.seedling.sdk.SeedlingSdk$isSupportFluidCloud$2$1", f = "SeedlingSdk.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<Boolean, Unit> $callback;
            final /* synthetic */ Context $context;
            final /* synthetic */ String $preMsg;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(String str, Context context, Function1<? super Boolean, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$preMsg = str;
                this.$context = context;
                this.$callback = function1;
            }

            @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$preMsg, this.$context, this.$callback, continuation);
            }

            @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                bs9.a.c(t6e.INSTANCE, SeedlingSdk.TAG, this.$preMsg + ", finally to entrancePkgName:" + this.$context.getPackageName() + ", isSupportFluidCloud:false, because is not userUnlocked", false, null, false, 0, false, null, 252, null);
                this.$callback.invoke(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }

            @Override // p010kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.oplus.seedling.sdk.SeedlingSdk$isSupportFluidCloud$2$2, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "com.oplus.seedling.sdk.SeedlingSdk$isSupportFluidCloud$2$2", f = "SeedlingSdk.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C09812 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<Boolean, Unit> $callback;
            final /* synthetic */ Context $context;
            final /* synthetic */ String $preMsg;
            final /* synthetic */ boolean $result;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C09812(String str, Context context, boolean z, Function1<? super Boolean, Unit> function1, Continuation<? super C09812> continuation) {
                super(2, continuation);
                this.$preMsg = str;
                this.$context = context;
                this.$result = z;
                this.$callback = function1;
            }

            @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C09812(this.$preMsg, this.$context, this.$result, this.$callback, continuation);
            }

            @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                bs9.a.c(t6e.INSTANCE, SeedlingSdk.TAG, this.$preMsg + ", finally to entrancePkgName:" + this.$context.getPackageName() + ", isSupportFluidCloud:" + this.$result, false, null, false, 0, false, null, 252, null);
                STraceUtils.a("panta:sdk:isSupportFluidCloud.callback");
                this.$callback.invoke(Boxing.boxBoolean(this.$result));
                STraceUtils.b();
                return Unit.INSTANCE;
            }

            @Override // p010kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C09812) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C17352(Context context, Function1<? super Boolean, Unit> function1, Continuation<? super C17352> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$callback = function1;
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C17352(this.$context, this.$callback, continuation);
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            SeedlingSdk.INSTANCE.handleSaveContext(this.$context, "isSupportFluidCloud");
            boolean z = !SeedlingIntentUtil.isUserUnlocked(this.$context);
            UserUnlockManager userUnlockManager = UserUnlockManager.INSTANCE;
            userUnlockManager.init(this.$callback, z);
            if (z) {
                MainCoroutineDispatcher main = Dispatchers.getMain();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1("callback normal context, isSupportFluidCloud", this.$context, this.$callback, null);
                this.label = 1;
                if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            userUnlockManager.release();
            boolean zQueryIsSupportFluidCloud$pantanal_client_release = SeedlingIntentUtil.queryIsSupportFluidCloud$pantanal_client_release(this.$context);
            MainCoroutineDispatcher main2 = Dispatchers.getMain();
            C09812 c09812 = new C09812("callback normal context, isSupportFluidCloud", this.$context, zQueryIsSupportFluidCloud$pantanal_client_release, this.$callback, null);
            this.label = 2;
            if (BuildersKt.withContext(main2, c09812, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // p010kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C17352) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.oplus.seedling.sdk.SeedlingSdk$isSupportFluidCloud$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.oplus.seedling.sdk.SeedlingSdk$isSupportFluidCloud$3", f = "SeedlingSdk.kt", i = {}, l = {633, 647}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $callback;
        final /* synthetic */ IUserContext $userContext;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.oplus.seedling.sdk.SeedlingSdk$isSupportFluidCloud$3$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "com.oplus.seedling.sdk.SeedlingSdk$isSupportFluidCloud$3$1", f = "SeedlingSdk.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<Boolean, Unit> $callback;
            final /* synthetic */ String $preMsg;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(String str, Function1<? super Boolean, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$preMsg = str;
                this.$callback = function1;
            }

            @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$preMsg, this.$callback, continuation);
            }

            @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                bs9.a.c(t6e.INSTANCE, SeedlingSdk.TAG, this.$preMsg + ", finally to entrancePkgName:" + SeedlingSdk.INSTANCE.getEntrancePkgName$pantanal_client_release() + ", isSupportFluidCloud:false, because is not userUnlocked", false, null, false, 0, false, null, 252, null);
                this.$callback.invoke(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }

            @Override // p010kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.oplus.seedling.sdk.SeedlingSdk$isSupportFluidCloud$3$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "com.oplus.seedling.sdk.SeedlingSdk$isSupportFluidCloud$3$2", f = "SeedlingSdk.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<Boolean, Unit> $callback;
            final /* synthetic */ String $preMsg;
            final /* synthetic */ boolean $result;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(String str, boolean z, Function1<? super Boolean, Unit> function1, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$preMsg = str;
                this.$result = z;
                this.$callback = function1;
            }

            @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass2(this.$preMsg, this.$result, this.$callback, continuation);
            }

            @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                bs9.a.c(t6e.INSTANCE, SeedlingSdk.TAG, this.$preMsg + ", finally to entrancePkgName:" + SeedlingSdk.INSTANCE.getEntrancePkgName$pantanal_client_release() + ", isSupportFluidCloud:" + this.$result, false, null, false, 0, false, null, 252, null);
                STraceUtils.a("panta:sdk:isSupportFluidCloud.callback");
                this.$callback.invoke(Boxing.boxBoolean(this.$result));
                STraceUtils.b();
                return Unit.INSTANCE;
            }

            @Override // p010kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(IUserContext iUserContext, Function1<? super Boolean, Unit> function1, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$userContext = iUserContext;
            this.$callback = function1;
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$userContext, this.$callback, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            SeedlingSdk seedlingSdk = SeedlingSdk.INSTANCE;
            seedlingSdk.handleSaveContext(this.$userContext.getContext(), "isSupportFluidCloud with callback.");
            seedlingSdk.setCurUserContext$pantanal_client_release(this.$userContext);
            String packageName = this.$userContext.getContext().getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "userContext.context.packageName");
            seedlingSdk.setEntrancePkgName$pantanal_client_release(packageName);
            boolean z = !SeedlingIntentUtil.isUserUnlocked(this.$userContext.getContext());
            UserUnlockManager userUnlockManager = UserUnlockManager.INSTANCE;
            userUnlockManager.init(this.$callback, z);
            if (z) {
                MainCoroutineDispatcher main = Dispatchers.getMain();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1("callback userContext context, isSupportFluidCloud", this.$callback, null);
                this.label = 1;
                if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            userUnlockManager.release();
            boolean zQueryIsSupportFluidCloud$pantanal_client_release = SeedlingIntentUtil.queryIsSupportFluidCloud$pantanal_client_release(this.$userContext.getContext());
            bs9.a.e(t6e.INSTANCE, SeedlingSdk.TAG, "queryIsSupportFluidCloud finish result:" + zQueryIsSupportFluidCloud$pantanal_client_release + " " + seedlingSdk.isQuit$pantanal_client_release().get() + " SeedlingSdk:" + coroutineScope, false, null, false, 0, false, null, 252, null);
            MainCoroutineDispatcher main2 = Dispatchers.getMain();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2("callback userContext context, isSupportFluidCloud", zQueryIsSupportFluidCloud$pantanal_client_release, this.$callback, null);
            this.label = 2;
            if (BuildersKt.withContext(main2, anonymousClass2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // p010kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.oplus.seedling.sdk.SeedlingSdk$quit$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.oplus.seedling.sdk.SeedlingSdk$quit$1", f = "SeedlingSdk.kt", i = {}, l = {471}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17361 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C17361(Continuation<? super C17361> continuation) {
            super(2, continuation);
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C17361(continuation);
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                bs9.a.c(t6e.INSTANCE, SeedlingSdk.TAG, "begin PluginManager.sInstance.quit()", false, null, false, 0, false, null, 252, null);
                PluginManager sInstance = PluginManager.INSTANCE.getSInstance();
                this.label = 1;
                if (sInstance.quit$pantanal_client_release(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // p010kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C17361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.oplus.seedling.sdk.SeedlingSdk$release$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.oplus.seedling.sdk.SeedlingSdk$release$1", f = "SeedlingSdk.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $method;
        final /* synthetic */ long $startTime;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17371(String str, long j2, Continuation<? super C17371> continuation) {
            super(2, continuation);
            this.$method = str;
            this.$startTime = j2;
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C17371(this.$method, this.$startTime, continuation);
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws InterruptedException {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            t6e t6eVar = t6e.INSTANCE;
            bs9.a.c(t6eVar, SeedlingSdk.TAG, this.$method + " Start release. in launch", false, null, false, 0, false, null, 252, null);
            PluginManager.INSTANCE.getSInstance().release();
            bs9.a.c(t6eVar, SeedlingSdk.TAG, this.$method + " End release. in launch,cost " + (System.currentTimeMillis() - this.$startTime) + "ms", false, null, false, 0, false, null, 252, null);
            return Unit.INSTANCE;
        }

        @Override // p010kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C17371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private SeedlingSdk() {
    }

    private final InitCallback buildInitCallbackWrapper(final InitCallback entranceCallBack) {
        return new InitCallback() { // from class: com.oplus.seedling.sdk.SeedlingSdk.buildInitCallbackWrapper.1
            @Override // com.oplus.seedling.sdk.callback.InitCallback
            public void onFailed(int errorCode, @NotNull String errorMsg) {
                Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new SeedlingSdk$buildInitCallbackWrapper$1$onFailed$1(errorCode, errorMsg, entranceCallBack, null), 3, null);
            }

            @Override // com.oplus.seedling.sdk.seedling.IPluginUpdateObserver
            public void onPluginCheckUpdateResult(int status, int newVersion, int oldVersion, long downloadSize) {
                bs9.a.c(t6e.INSTANCE, SeedlingSdk.TAG, "onPluginCheckUpdateResult. pkgName:" + SeedlingSdk.INSTANCE.getEntrancePkgName$pantanal_client_release(), false, null, false, 0, false, null, 252, null);
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new SeedlingSdk$buildInitCallbackWrapper$1$onPluginCheckUpdateResult$1(entranceCallBack, status, newVersion, oldVersion, downloadSize, null), 3, null);
            }

            @Override // com.oplus.seedling.sdk.callback.InitCallback
            public void onSuccess() {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new SeedlingSdk$buildInitCallbackWrapper$1$onSuccess$1(entranceCallBack, null), 3, null);
            }

            @Override // com.oplus.seedling.sdk.seedling.IPluginUpdateObserver
            public void onPluginCheckUpdateResult(int status, int pluginType) {
                bs9.a.c(t6e.INSTANCE, SeedlingSdk.TAG, "onPluginCheckUpdateResult, pkgName:" + SeedlingSdk.INSTANCE.getEntrancePkgName$pantanal_client_release() + ", status=" + status + ", pluginType=" + pluginType, false, null, false, 0, false, null, 252, null);
                entranceCallBack.onPluginCheckUpdateResult(status, pluginType);
            }
        };
    }

    private final void checkEngineType(EngineType engineType) {
        if (sEngineType == null) {
            setSEngineType$pantanal_client_release(engineType);
            return;
        }
        if (getSEngineType$pantanal_client_release() != engineType) {
            String str = "init different engine type, before " + getSEngineType$pantanal_client_release() + " now " + engineType;
            setSEngineType$pantanal_client_release(engineType);
            bs9.a.e(t6e.INSTANCE, TAG, str, false, null, false, 0, false, null, 252, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean checkIfNeedReInit() {
        if (preUserContext == null) {
            bs9.a.e(t6e.INSTANCE, TAG, "checkIfNeedReInit,preUserContext is null,no need reinit", false, null, false, 0, false, null, 252, null);
            return false;
        }
        IUserContext iUserContext = preUserContext;
        int userId = iUserContext != null ? iUserContext.getUserId() : -1;
        IUserContext iUserContext2 = curUserContext;
        int userId2 = iUserContext2 != null ? iUserContext2.getUserId() : -1;
        if (userId == userId2) {
            bs9.a.c(t6e.INSTANCE, TAG, "checkIfNeedReInit,preUserId:" + userId + " == curUserId:" + userId2 + ",no need reinit", false, null, false, 0, false, null, 252, null);
            return false;
        }
        bs9.a.e(t6e.INSTANCE, TAG, "checkIfNeedReInit,preUserId:" + userId + " != curUserId:" + userId2 + ", need reinit!", false, null, false, 0, false, null, 252, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doInit(Context appContext, EngineType engineType, InitCallback initCallbackWrapper) {
        handleSaveContext(appContext, "doInit");
        String packageName = appContext.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "appContext.packageName");
        entrancePkgName = packageName;
        checkEngineType(engineType);
        bs9.a.c(t6e.INSTANCE, TAG, "SeedlingSdk interface start to init, entrancePkgName:" + entrancePkgName + ", entranceSdkVersion:1.3.130, 10030130, priority:" + Thread.currentThread().getPriority() + ", initConfig:" + initConfig, false, null, false, 0, false, null, 252, null);
        PluginManager.INSTANCE.getSInstance().init(initCallbackWrapper, initConfig);
    }

    private final CoroutineScope getInterfaceScope() {
        return (CoroutineScope) interfaceScope.getValue();
    }

    private final void handleInitConfig() {
        SeedlingInitConfig seedlingInitConfig;
        Map<String, Object> extrasDataToEngine2;
        Boolean bool = isHostSupportBlur;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            SeedlingInitConfig seedlingInitConfig2 = initConfig;
            if (seedlingInitConfig2 != null) {
                seedlingInitConfig2.setNeedHostHandleCardBg(zBooleanValue);
            }
        }
        Boolean bool2 = isHostLightColor;
        if (bool2 != null) {
            boolean zBooleanValue2 = bool2.booleanValue();
            SeedlingInitConfig seedlingInitConfig3 = initConfig;
            if (seedlingInitConfig3 != null) {
                seedlingInitConfig3.setHostLightColor(zBooleanValue2);
            }
        }
        Map<String, ? extends Object> map = extrasDataToEngine;
        if (map == null || (seedlingInitConfig = initConfig) == null || (extrasDataToEngine2 = seedlingInitConfig.getExtrasDataToEngine()) == null) {
            return;
        }
        extrasDataToEngine2.putAll(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSaveContext(Context appContext, String curFunName) {
        String str = "handleSaveContext,initSAppContext, pkgName:" + appContext.getPackageName() + ",called from " + curFunName;
        if (appContext.getApplicationContext() != null) {
            bs9.a.c(t6e.INSTANCE, TAG, str + ", use applicationContext", false, null, false, 0, false, null, 252, null);
            appContext = appContext.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(appContext, "{\n            PantaLog.i…licationContext\n        }");
        } else {
            bs9.a.c(t6e.INSTANCE, TAG, str + ", use appContext", false, null, false, 0, false, null, 252, null);
        }
        setSAppContext$pantanal_client_release(appContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CoroutineScope initInterfaceScope() {
        return CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(DispatchersUtil.p(new ThreadFactory() { // from class: com.oplus.aiunit.vision.brg
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return SeedlingSdk.initInterfaceScope$lambda$2(runnable);
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread initInterfaceScope$lambda$2(Runnable runnable) {
        Thread thread = new Thread(runnable, INIT_THREAD_NAME);
        thread.setPriority(10);
        return thread;
    }

    @JvmStatic
    @WorkerThread
    public static final boolean isSeedlingSupport(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (isQuit.get()) {
            bs9.a.e(t6e.INSTANCE, TAG, " entrance is quit return false", false, null, false, 0, false, null, 252, null);
            return false;
        }
        INSTANCE.handleSaveContext(context, Constants.METHOD_SEEDLING_SUPPORT);
        boolean zQueryIsSeedlingSupport$pantanal_client_release = SeedlingIntentUtil.queryIsSeedlingSupport$pantanal_client_release(context);
        bs9.a.c(t6e.INSTANCE, TAG, "isSeedlingSupport, finally to entrancePkgName:" + context.getPackageName() + ", isSeedlingSupport:" + zQueryIsSeedlingSupport$pantanal_client_release, false, null, false, 0, false, null, 252, null);
        return zQueryIsSeedlingSupport$pantanal_client_release;
    }

    @JvmStatic
    @WorkerThread
    public static final boolean isSupportFluidCloud(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (isQuit.get()) {
            bs9.a.e(t6e.INSTANCE, TAG, " entrance is quit return false", false, null, false, 0, false, null, 252, null);
            return false;
        }
        INSTANCE.handleSaveContext(context, "isSupportFluidCloud");
        boolean zQueryIsSupportFluidCloud$pantanal_client_release = SeedlingIntentUtil.queryIsSupportFluidCloud$pantanal_client_release(context);
        bs9.a.c(t6e.INSTANCE, TAG, "isSupportFluidCloud, finally to entrancePkgName:" + context.getPackageName() + ", isSupportFluidCloud:" + zQueryIsSupportFluidCloud$pantanal_client_release, false, null, false, 0, false, null, 252, null);
        return zQueryIsSupportFluidCloud$pantanal_client_release;
    }

    @JvmStatic
    @WorkerThread
    public static final boolean isSupportSystemSendIntent(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (isQuit.get()) {
            bs9.a.e(t6e.INSTANCE, TAG, " entrance is quit return false", false, null, false, 0, false, null, 252, null);
            return false;
        }
        INSTANCE.handleSaveContext(context, "isSupportSystemSendIntent");
        boolean zQueryIsSystemSendIntentSupport$pantanal_client_release = SeedlingIntentUtil.queryIsSystemSendIntentSupport$pantanal_client_release(context);
        bs9.a.c(t6e.INSTANCE, TAG, "isSupportSystemSendIntent, finally to entrancePkgName:" + context.getPackageName() + ", isSupportSystemSendIntent:" + zQueryIsSystemSendIntentSupport$pantanal_client_release, false, null, false, 0, false, null, 252, null);
        return zQueryIsSystemSendIntentSupport$pantanal_client_release;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:6:0x002e A[ORIG_RETURN, RETURN] */
    @JvmStatic
    public static final boolean isSupportTryAgain(int errorCode) {
        switch (errorCode) {
            case 1000:
            case 1001:
            case 1002:
                return true;
            case 1003:
                return false;
            default:
                switch (errorCode) {
                    case 2001:
                    case 2007:
                        return true;
                    case 2002:
                    case 2003:
                    case 2004:
                    case 2005:
                    case 2006:
                        return false;
                    default:
                        bs9.a.e(t6e.INSTANCE, TAG, "isSupportTryAgain, errorCode:" + errorCode + " is invalid", false, null, false, 0, false, null, 252, null);
                        return false;
                }
        }
    }

    @JvmStatic
    public static final void removeIsSupportFluidCloudCallBack(@NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        bs9.a.c(t6e.INSTANCE, TAG, "removeIsSupportFluidCloudCallBack callback= " + callback, false, null, false, 0, false, null, 252, null);
        UserUnlockManager.INSTANCE.removeCallBack(callback);
    }

    @Nullable
    public final ISeedlingManager gainSeedlingManager(int entranceType) {
        String str = entranceType + " gainSeedlingManager no callback";
        t6e t6eVar = t6e.INSTANCE;
        bs9.a.d(t6eVar, TAG, str + " begin ", false, null, false, 0, false, null, 252, null);
        if (isInitialed.get() == 2) {
            bs9.a.d(t6eVar, TAG, str + " begin isInitialed:" + isInitialed.get(), false, null, false, 0, false, null, 252, null);
            return PluginManager.INSTANCE.getSInstance().gainSeedlingManager(entranceType);
        }
        bs9.a.e(t6eVar, TAG, entranceType + " " + str + " invoke failed, since it is not init", false, null, false, 0, false, null, 252, null);
        return null;
    }

    @Nullable
    public final IUserContext getCurUserContext$pantanal_client_release() {
        return curUserContext;
    }

    public final boolean getEnableConfigurationChangeCallback() {
        return enableConfigurationChangeCallback;
    }

    @NotNull
    public final AtomicBoolean getEnableInterruptCreatingCard$pantanal_client_release() {
        return enableInterruptCreatingCard;
    }

    @NotNull
    public final String getEntrancePkgName$pantanal_client_release() {
        return entrancePkgName;
    }

    @Nullable
    public final SeedlingInitConfig getInitConfig() {
        return initConfig;
    }

    @Nullable
    public final IUserContext getPreUserContext$pantanal_client_release() {
        return preUserContext;
    }

    @NotNull
    public final Context getSAppContext$pantanal_client_release() {
        Context context = sAppContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sAppContext");
        return null;
    }

    @NotNull
    public final EngineType getSEngineType$pantanal_client_release() {
        EngineType engineType = sEngineType;
        if (engineType != null) {
            return engineType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sEngineType");
        return null;
    }

    @Nullable
    public final DexClassLoader getSeedlingPluginClassLoader() {
        return PluginManager.INSTANCE.getSInstance().getPluginDexClassLoader();
    }

    public final void init(@NotNull IUserContext userContext, @NotNull EngineType engineType, @NotNull InitCallback callback) {
        Intrinsics.checkNotNullParameter(userContext, "userContext");
        Intrinsics.checkNotNullParameter(engineType, "engineType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        preUserContext = curUserContext;
        curUserContext = userContext;
        bs9.a.c(t6e.INSTANCE, TAG, "start to init with userContext, pkgName:" + userContext.getContext().getPackageName() + ", userId:" + userContext.getUserId(), false, null, false, 0, false, null, 252, null);
        init(userContext.getContext(), engineType, callback);
    }

    @NotNull
    public final AtomicInteger isInitialed$pantanal_client_release() {
        return isInitialed;
    }

    public final boolean isPluginSupportFeature(int feature) {
        if (isInitialed.get() != 2) {
            bs9.a.e(t6e.INSTANCE, TAG, "isPluginSupportFeature return false because not initialized", false, null, false, 0, false, null, 252, null);
            return false;
        }
        boolean zIsPluginSupportFeature$pantanal_client_release = PluginManager.INSTANCE.getSInstance().isPluginSupportFeature$pantanal_client_release(feature);
        bs9.a.c(t6e.INSTANCE, TAG, "isPluginSupportFeature feature= " + feature + ",result= " + zIsPluginSupportFeature$pantanal_client_release, false, null, false, 0, false, null, 252, null);
        return zIsPluginSupportFeature$pantanal_client_release;
    }

    @NotNull
    public final AtomicBoolean isQuit$pantanal_client_release() {
        return isQuit;
    }

    public final void notifyConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        if (isInitialed.get() != 2) {
            bs9.a.c(t6e.INSTANCE, TAG, "notifyConfigurationChanged failed,because not init.", false, null, false, 0, false, null, 252, null);
            return;
        }
        bs9.a.c(t6e.INSTANCE, TAG, "notifyConfigurationChanged newConfig = " + newConfig, false, null, false, 0, false, null, 252, null);
        PluginManager.INSTANCE.getSInstance().dispatchConfigurationChanged$pantanal_client_release(newConfig);
    }

    public final void notifyHostBlurAbilityChanged(boolean isSupportBlur, boolean isLightColor, @NotNull Map<String, ? extends Object> extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        bs9.a.c(t6e.INSTANCE, TAG, "notifyHostBlurAbilityChanged,initState = " + isInitialed.get() + ",isSupportBlur=" + isSupportBlur + ",isLightColor=" + isLightColor + ",extras = " + extras, false, null, false, 0, false, null, 252, null);
        if (isInitialed.get() == 2) {
            PluginManager.INSTANCE.getSInstance().notifyHostBlurAbilityChanged(isSupportBlur, isLightColor, extras);
        }
        isHostSupportBlur = Boolean.valueOf(isSupportBlur);
        isHostLightColor = Boolean.valueOf(isLightColor);
        extrasDataToEngine = extras;
    }

    public final void notifyInterruptLoadingCard(boolean enableInterrupt) {
        enableInterruptCreatingCard.set(enableInterrupt);
        bs9.a.c(t6e.INSTANCE, TAG, "notifyInterruptLoadingCard，enableInterrupt = " + enableInterruptCreatingCard.get(), false, null, false, 0, false, null, 252, null);
    }

    public final void onTrimMemory(int level) {
        if (isInitialed.get() != 2) {
            bs9.a.c(t6e.INSTANCE, TAG, "onTrimMemory invoke failed, since it is not init", false, null, false, 0, false, null, 252, null);
            return;
        }
        bs9.a.c(t6e.INSTANCE, TAG, "onTrimMemory. level = " + level, false, null, false, 0, false, null, 252, null);
        PluginManager.INSTANCE.getSInstance().onTrimMemory(level);
    }

    public final void quit() {
        bs9.a.c(t6e.INSTANCE, TAG, "quit " + this, false, null, false, 0, false, null, 252, null);
        isQuit.set(true);
        y6e.g(SeedlingSdk.class);
        BuildersKt__Builders_commonKt.launch$default(getInterfaceScope(), null, null, new C17361(null), 3, null);
    }

    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Boolean, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r13v3 */
    public final void release() {
        ?? r13;
        t6e t6eVar = t6e.INSTANCE;
        bs9.a.c(t6eVar, TAG, "release begin before compareAndSet, isInitialed:" + isInitialed.get(), false, null, false, 0, false, null, 252, null);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (isInitialed.compareAndSet(2, 1)) {
            bs9.a.c(t6eVar, TAG, "release begin launch, isInitialed:" + isInitialed.get(), false, null, false, 0, false, null, 252, null);
            BuildersKt__Builders_commonKt.launch$default(getInterfaceScope(), null, null, new C17371("release", jCurrentTimeMillis, null), 3, null);
            SeedlingInitConfig seedlingInitConfig = initConfig;
            if (seedlingInitConfig != null && seedlingInitConfig.getShouldNotifyCardServiceToInit()) {
                Context sAppContext$pantanal_client_release = getSAppContext$pantanal_client_release();
                SeedlingInitConfig seedlingInitConfig2 = initConfig;
                CardServiceEntranceHelper.requestDoReleaseInCardService(getSAppContext$pantanal_client_release(), y6e.d(sAppContext$pantanal_client_release, seedlingInitConfig2 != null ? seedlingInitConfig2.getEntranceAuthorityName() : null));
            }
            enableInterruptCreatingCard.set(false);
            r13 = 0;
        } else {
            r13 = 0;
            bs9.a.c(t6eVar, TAG, "release fail, because has already release, just ignore", false, null, false, 0, false, null, 252, null);
        }
        isHostSupportBlur = r13;
        isHostLightColor = r13;
        extrasDataToEngine = r13;
    }

    public final void setCurUserContext$pantanal_client_release(@Nullable IUserContext iUserContext) {
        curUserContext = iUserContext;
    }

    public final void setEnableConfigurationChangeCallback(boolean z) {
        if (z) {
            PluginManager.INSTANCE.getSInstance().registerPluginContextConfigChange$pantanal_client_release();
        } else {
            PluginManager.INSTANCE.getSInstance().unregisterPluginContextConfigChange$pantanal_client_release();
        }
        enableConfigurationChangeCallback = z;
    }

    public final void setEnableInterruptCreatingCard$pantanal_client_release(@NotNull AtomicBoolean atomicBoolean) {
        Intrinsics.checkNotNullParameter(atomicBoolean, "<set-?>");
        enableInterruptCreatingCard = atomicBoolean;
    }

    public final void setEntrancePkgName$pantanal_client_release(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        entrancePkgName = str;
    }

    public final void setInitialed$pantanal_client_release(@NotNull AtomicInteger atomicInteger) {
        Intrinsics.checkNotNullParameter(atomicInteger, "<set-?>");
        isInitialed = atomicInteger;
    }

    public final void setPreUserContext$pantanal_client_release(@Nullable IUserContext iUserContext) {
        preUserContext = iUserContext;
    }

    public final void setQuit$pantanal_client_release(@NotNull AtomicBoolean atomicBoolean) {
        Intrinsics.checkNotNullParameter(atomicBoolean, "<set-?>");
        isQuit = atomicBoolean;
    }

    public final void setSAppContext$pantanal_client_release(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        sAppContext = context;
    }

    public final void setSEngineType$pantanal_client_release(@NotNull EngineType engineType) {
        Intrinsics.checkNotNullParameter(engineType, "<set-?>");
        sEngineType = engineType;
    }

    public final boolean shouldInterruptCreatingCard() {
        boolean z = enableInterruptCreatingCard.get();
        bs9.a.d(t6e.INSTANCE, TAG, "shouldInterruptCreatingCard:" + z, false, null, false, 0, false, null, 252, null);
        return z;
    }

    public final void init(@NotNull IUserContext userContext, @NotNull SeedlingInitConfig initConfig2, @NotNull InitCallback initCallback) {
        Intrinsics.checkNotNullParameter(userContext, "userContext");
        Intrinsics.checkNotNullParameter(initConfig2, "initConfig");
        Intrinsics.checkNotNullParameter(initCallback, "initCallback");
        bs9.a.c(t6e.INSTANCE, TAG, "start to init seedlingsdk with userContext = " + userContext + ", userId:" + userContext.getUserId() + ", initConfig:" + initConfig2, false, null, false, 0, false, null, 252, null);
        preUserContext = curUserContext;
        curUserContext = userContext;
        init(userContext.getContext(), initConfig2, initCallback);
    }

    @JvmStatic
    public static final void isSeedlingSupport(@NotNull Context context, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (isQuit.get()) {
            bs9.a.e(t6e.INSTANCE, TAG, " entrance is quit return false", false, null, false, 0, false, null, 252, null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(INSTANCE.getInterfaceScope(), coroutineExceptionHandler, null, new AnonymousClass2(context, callback, null), 2, null);
        }
    }

    @JvmStatic
    public static final void isSupportFluidCloud(@NotNull Context context, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (isQuit.get()) {
            bs9.a.e(t6e.INSTANCE, TAG, " entrance is quit return false", false, null, false, 0, false, null, 252, null);
            return;
        }
        bs9.a.c(t6e.INSTANCE, TAG, "isSupportFluidCloud begin,context = " + context, false, null, false, 0, false, null, 252, null);
        BuildersKt__Builders_commonKt.launch$default(INSTANCE.getInterfaceScope(), coroutineExceptionHandler, null, new C17352(context, callback, null), 2, null);
    }

    @JvmStatic
    public static final void isSupportFluidCloud(@NotNull IUserContext userContext, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(userContext, "userContext");
        Intrinsics.checkNotNullParameter(callback, "callback");
        t6e t6eVar = t6e.INSTANCE;
        int userId = userContext.getUserId();
        boolean z = isQuit.get();
        SeedlingSdk seedlingSdk = INSTANCE;
        bs9.a.c(t6eVar, TAG, "isSupportFluidCloud begin,userId = " + userId + " " + z + " SeedlingSdk:" + seedlingSdk, false, null, false, 0, false, null, 252, null);
        if (isQuit.get()) {
            bs9.a.e(t6eVar, TAG, " entrance is quit return false", false, null, false, 0, false, null, 252, null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(seedlingSdk.getInterfaceScope(), coroutineExceptionHandler, null, new AnonymousClass3(userContext, callback, null), 2, null);
        }
    }

    public final void init(@NotNull Context appContext, @NotNull SeedlingInitConfig initConfig2, @NotNull InitCallback initCallback) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(initConfig2, "initConfig");
        Intrinsics.checkNotNullParameter(initCallback, "initCallback");
        t6e t6eVar = t6e.INSTANCE;
        bs9.a.c(t6eVar, TAG, "init seedlingsdk with config = " + initConfig2, false, null, false, 0, false, null, 252, null);
        initConfig = initConfig2;
        handleInitConfig();
        STraceUtils.a("panta:sdk:SeedlingSdk.init");
        init(appContext, initConfig2.getEngineType(), initCallback);
        STraceUtils.b();
        if (initConfig2.getShouldNotifyCardServiceToInit()) {
            if (isQuit.get()) {
                bs9.a.c(t6eVar, TAG, "init with config, sdk is quit", false, null, false, 0, false, null, 252, null);
                return;
            }
            STraceUtils.a("panta:sdk:SeedlingSdk.requestDoInitChannelInCardService");
            CardServiceEntranceHelper.requestDoInitChannelInCardService(appContext, y6e.d(appContext, initConfig2.getEntranceAuthorityName()));
            STraceUtils.b();
            return;
        }
        bs9.a.c(t6eVar, TAG, "init with config,no need call card service to init.", false, null, false, 0, false, null, 252, null);
    }

    public final void init(@NotNull Context appContext, @NotNull EngineType engineType, @NotNull InitCallback entranceCallBack) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(engineType, "engineType");
        Intrinsics.checkNotNullParameter(entranceCallBack, "entranceCallBack");
        InitCallback initCallbackBuildInitCallbackWrapper = buildInitCallbackWrapper(entranceCallBack);
        if (isQuit.get()) {
            bs9.a.c(t6e.INSTANCE, TAG, "init with engineType, sdk is quit", false, null, false, 0, false, null, 252, null);
            return;
        }
        bs9.a.c(t6e.INSTANCE, TAG, "SeedlingSdk begin init,engineType = " + engineType, false, null, false, 0, false, null, 252, null);
        BuildersKt__Builders_commonKt.launch$default(getInterfaceScope(), null, null, new C17341(appContext, engineType, initCallbackBuildInitCallbackWrapper, null), 3, null);
    }
}
