package com.heytap.nearx.tangramconfig.kit.client;

import android.content.Context;
import android.os.Bundle;
import com.heytap.msp.IMspCallback;
import com.heytap.msp.MspResponse;
import com.heytap.mspsdk.MspSdk;
import com.heytap.mspsdk.constants.Constants;
import com.heytap.mspsdk.core.crash.e;
import com.heytap.mspsdk.exception.MspSdkException;
import com.heytap.mspsdk.log.MspLog;
import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.nearx.tangramconfig.kit.bean.ConfigIpcResponse;
import com.heytap.nearx.tangramconfig.kit.callback.IpcCallback;
import com.heytap.nearx.tangramconfig.kit.client.KitProxy;
import com.heytap.nearx.tangramconfig.kit.config.ConfigDataHelper;
import com.heytap.nearx.tangramconfig.kit.config.ConfigFileManager;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.nearx.tangramconfig.strategy.StrategyEntity;
import com.heytap.nearx.tangramconfig.strategy.StrategyHelper;
import com.heytap.nearx.tangramconfig.util.AppInfoUtil;
import com.heytap.nearx.tangramconfig.util.KitSPUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bJ\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0002J(\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\bJ\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J(\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bJ\u0012\u0010\u0014\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J&\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\t2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\bJ&\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\t2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\bJ\u0012\u0010\u001a\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u000e\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006J(\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¨\u0006\u001f"}, d2 = {"Lcom/heytap/nearx/tangramconfig/kit/client/KitProxy;", "", "()V", "addMspCrashListener", "", "context", "Landroid/content/Context;", "callback", "Lcom/heytap/nearx/tangramconfig/kit/callback/IpcCallback;", "", "assembleBundle", "bundle", "Landroid/os/Bundle;", "checkUpdateConfig", "requestDeanJson", "", "destoryClient", "proxy", "Lcom/heytap/nearx/tangramconfig/kit/client/ICloudCtrlServiceModule;", "gatewayUpdate", "getCloudCtrlKitProxyer", "getConfigData", "Lcom/heytap/nearx/tangramconfig/kit/bean/ConfigIpcResponse;", "getDynamicCondition", "json", "Lcom/heytap/nearx/tangramconfig/strategy/StrategyEntity;", "initMsp", "isSupportCloudCtrlKit", "registerCallback", "requestPids", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class KitProxy {

    @NotNull
    public static final String TAG = "KitProxy";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static ThreadFactory threadFactory = new ThreadFactory() { // from class: com.heytap.nearx.tangramconfig.kit.client.KitProxy$Companion$threadFactory$1
        private int counter;

        @Override // java.util.concurrent.ThreadFactory
        @Nullable
        public Thread newThread(@Nullable Runnable r) {
            Thread thread = new Thread(r);
            StringBuilder sb = new StringBuilder();
            sb.append("KitProxy-");
            int i = this.counter;
            this.counter = i + 1;
            sb.append(i);
            sb.append("-thread");
            thread.setName(sb.toString());
            MspLog.d(KitProxy.TAG, "create KitProxy thread : " + thread.getName());
            return thread;
        }
    };

    @NotNull
    private static final Lazy<ExecutorService> executors$delegate = LazyKt__LazyJVMKt.lazy(new Function0<ExecutorService>() { // from class: com.heytap.nearx.tangramconfig.kit.client.KitProxy$Companion$executors$2
        @Override // p010kotlin.jvm.functions.Function0
        public final ExecutorService invoke() {
            return Executors.newFixedThreadPool(5, KitProxy.INSTANCE.getThreadFactory());
        }
    });

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/heytap/nearx/tangramconfig/kit/client/KitProxy$Companion;", "", "()V", "TAG", "", "executors", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "getExecutors", "()Ljava/util/concurrent/ExecutorService;", "executors$delegate", "Lkotlin/Lazy;", "threadFactory", "Ljava/util/concurrent/ThreadFactory;", "getThreadFactory", "()Ljava/util/concurrent/ThreadFactory;", "setThreadFactory", "(Ljava/util/concurrent/ThreadFactory;)V", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ExecutorService getExecutors() {
            return (ExecutorService) KitProxy.executors$delegate.getValue();
        }

        @NotNull
        public final ThreadFactory getThreadFactory() {
            return KitProxy.threadFactory;
        }

        public final void setThreadFactory(@NotNull ThreadFactory threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "<set-?>");
            KitProxy.threadFactory = threadFactory;
        }
    }

    private final void assembleBundle(Bundle bundle) {
        bundle.putInt(Constants.BUNDLE_KEY_APP_MIN_VERSIONCODE, 2011400);
        bundle.putString(Constants.BUNDLE_KEY_MSP_SDK_KIT_NAME, "cloudctrl");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkUpdateConfig$lambda$3(final KitProxy this$0, Context context, String str, final IpcCallback ipcCallback) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        try {
            final ICloudCtrlServiceModule cloudCtrlKitProxyer = this$0.getCloudCtrlKitProxyer(context);
            cloudCtrlKitProxyer.checkUpdateConfig(str, new IMspCallback.Stub() { // from class: com.heytap.nearx.tangramconfig.kit.client.KitProxy$checkUpdateConfig$1$1
                @Override // com.heytap.msp.IMspCallback
                public void callback(@Nullable MspResponse response) {
                    Bundle data;
                    this.this$0.destoryClient(cloudCtrlKitProxyer);
                    boolean z = false;
                    if (response != null && response.getCode() == 0) {
                        z = true;
                    }
                    if (!z) {
                        IpcCallback<Boolean> ipcCallback2 = ipcCallback;
                        if (ipcCallback2 != null) {
                            ipcCallback2.onFailed(new Exception(response != null ? response.getMessage() : null));
                            return;
                        }
                        return;
                    }
                    if (response == null || (data = response.getData()) == null) {
                        return;
                    }
                    IpcCallback<Boolean> ipcCallback3 = ipcCallback;
                    try {
                        boolean z2 = data.getBoolean("result");
                        long j2 = data.getLong("lastTaskTime");
                        long j3 = data.getLong("nextTaskTime");
                        MspLog.d(KitProxy.TAG, "checkUpdateConfig: callback lastTaskTime : " + j2);
                        MspLog.d(KitProxy.TAG, "checkUpdateConfig: callback nextTaskTime : " + j3);
                        if (ipcCallback3 != null) {
                            ipcCallback3.callback(Boolean.valueOf(z2));
                            Unit unit = Unit.INSTANCE;
                        }
                    } catch (Exception e2) {
                        if (ipcCallback3 != null) {
                            ipcCallback3.onFailed(e2);
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                }
            });
        } catch (Exception e2) {
            if (ipcCallback != null) {
                ipcCallback.onFailed(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void destoryClient(ICloudCtrlServiceModule proxy) {
        MspLog.d(TAG, "destoryClient exec");
        if (proxy != null) {
            try {
                MspLog.d(TAG, "exec unbind");
                MspSdk.unbind(proxy);
            } catch (Throwable th) {
                MspLog.d(TAG, "exec unbind error: " + th.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gatewayUpdate$lambda$2(final KitProxy this$0, Context context, String str, final IpcCallback ipcCallback) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        try {
            final ICloudCtrlServiceModule cloudCtrlKitProxyer = this$0.getCloudCtrlKitProxyer(context);
            cloudCtrlKitProxyer.gatewayUpdate(str, new IMspCallback.Stub() { // from class: com.heytap.nearx.tangramconfig.kit.client.KitProxy$gatewayUpdate$1$1
                @Override // com.heytap.msp.IMspCallback
                public void callback(@Nullable MspResponse response) {
                    Bundle data;
                    this.this$0.destoryClient(cloudCtrlKitProxyer);
                    boolean z = false;
                    if (response != null && response.getCode() == 0) {
                        z = true;
                    }
                    if (!z) {
                        IpcCallback<String> ipcCallback2 = ipcCallback;
                        if (ipcCallback2 != null) {
                            ipcCallback2.onFailed(new Exception(response != null ? response.getMessage() : null));
                            return;
                        }
                        return;
                    }
                    if (response == null || (data = response.getData()) == null) {
                        return;
                    }
                    IpcCallback<String> ipcCallback3 = ipcCallback;
                    try {
                        String string = data.getString("result");
                        long j2 = data.getLong("lastTaskTime");
                        long j3 = data.getLong("nextTaskTime");
                        MspLog.d(KitProxy.TAG, "gatewayUpdate: callback lastTaskTime : " + j2);
                        MspLog.d(KitProxy.TAG, "gatewayUpdate: callback nextTaskTime : " + j3);
                        if (ipcCallback3 != null) {
                            ipcCallback3.callback(string);
                            Unit unit = Unit.INSTANCE;
                        }
                    } catch (Exception e2) {
                        if (ipcCallback3 != null) {
                            ipcCallback3.onFailed(e2);
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                }
            });
        } catch (Exception e2) {
            if (ipcCallback != null) {
                ipcCallback.onFailed(e2);
            }
        }
    }

    private final ICloudCtrlServiceModule getCloudCtrlKitProxyer(Context context) throws MspSdkException {
        initMsp(context);
        Bundle bundle = new Bundle();
        assembleBundle(bundle);
        Object objApiProxy = MspSdk.apiProxy((Class<Object>) ICloudCtrlServiceModule.class, bundle);
        Intrinsics.checkNotNullExpressionValue(objApiProxy, "apiProxy(ICloudCtrlServi…dule::class.java, bundle)");
        return (ICloudCtrlServiceModule) objApiProxy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getConfigData$lambda$1(final KitProxy this$0, final Context context, String requestDeanJson, final IpcCallback ipcCallback) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(requestDeanJson, "$requestDeanJson");
        try {
            final ICloudCtrlServiceModule cloudCtrlKitProxyer = this$0.getCloudCtrlKitProxyer(context);
            cloudCtrlKitProxyer.getConfigData(requestDeanJson, context.getPackageName(), new IMspCallback.Stub() { // from class: com.heytap.nearx.tangramconfig.kit.client.KitProxy$getConfigData$1$1
                @Override // com.heytap.msp.IMspCallback
                public void callback(@Nullable MspResponse response) {
                    Bundle data;
                    this.this$0.destoryClient(cloudCtrlKitProxyer);
                    StringBuilder sb = new StringBuilder();
                    sb.append("getConfigData code : ");
                    sb.append(response != null ? Integer.valueOf(response.getCode()) : null);
                    sb.append(" : ");
                    MspLog.d(KitProxy.TAG, sb.toString());
                    boolean z = false;
                    if (response != null && response.getCode() == 0) {
                        z = true;
                    }
                    if (!z) {
                        IpcCallback<ConfigIpcResponse> ipcCallback2 = ipcCallback;
                        if (ipcCallback2 != null) {
                            ipcCallback2.onFailed(new Exception(response != null ? response.getMessage() : null));
                            return;
                        }
                        return;
                    }
                    if (response == null || (data = response.getData()) == null) {
                        return;
                    }
                    Context context2 = context;
                    IpcCallback<ConfigIpcResponse> ipcCallback3 = ipcCallback;
                    try {
                        String string = data.getString("result");
                        MspLog.d(KitProxy.TAG, "getConfigData: callback result : " + string);
                        ConfigIpcResponse configFile = ConfigFileManager.getConfigFile(context2, data.getString("server_package_name"), ConfigDataHelper.INSTANCE.parseConfigResponse(string));
                        if (ipcCallback3 != null) {
                            ipcCallback3.callback(configFile);
                            Unit unit = Unit.INSTANCE;
                        }
                    } catch (Exception e2) {
                        if (ipcCallback3 != null) {
                            ipcCallback3.onFailed(e2);
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                }
            });
        } catch (Exception e2) {
            if (ipcCallback != null) {
                ipcCallback.onFailed(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getDynamicCondition$lambda$0(final KitProxy this$0, Context context, String json, final IpcCallback ipcCallback) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(json, "$json");
        try {
            final ICloudCtrlServiceModule cloudCtrlKitProxyer = this$0.getCloudCtrlKitProxyer(context);
            cloudCtrlKitProxyer.getDynamicCondition(json, new IMspCallback.Stub() { // from class: com.heytap.nearx.tangramconfig.kit.client.KitProxy$getDynamicCondition$1$1
                @Override // com.heytap.msp.IMspCallback
                public void callback(@Nullable MspResponse response) {
                    Bundle data;
                    this.this$0.destoryClient(cloudCtrlKitProxyer);
                    boolean z = false;
                    if (response != null && response.getCode() == 0) {
                        z = true;
                    }
                    if (!z) {
                        IpcCallback<StrategyEntity> ipcCallback2 = ipcCallback;
                        if (ipcCallback2 != null) {
                            ipcCallback2.onFailed(new Exception(response != null ? response.getMessage() : null));
                            return;
                        }
                        return;
                    }
                    if (response == null || (data = response.getData()) == null) {
                        return;
                    }
                    IpcCallback<StrategyEntity> ipcCallback3 = ipcCallback;
                    try {
                        String string = data.getString("result");
                        if (string != null) {
                            MspLog.d(KitProxy.TAG, "getDynamicCondition result:" + string);
                            StrategyEntity strategyEntity = StrategyHelper.INSTANCE.parseStrategyEntity(string);
                            if (ipcCallback3 != null) {
                                ipcCallback3.callback(strategyEntity);
                                Unit unit = Unit.INSTANCE;
                            }
                        }
                    } catch (Exception e2) {
                        if (ipcCallback3 != null) {
                            ipcCallback3.onFailed(e2);
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                }
            });
        } catch (Exception e2) {
            if (ipcCallback != null) {
                ipcCallback.onFailed(e2);
            }
        }
    }

    private final void initMsp(Context context) {
        if (context != null) {
            MspSdk.init(context);
            KitSPUtils.INSTANCE.init(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerCallback$lambda$5(KitProxy this$0, Context context, String str, final IpcCallback ipcCallback) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        MspLog.d(TAG, "registerCallback task run...");
        try {
            ICloudCtrlServiceModule cloudCtrlKitProxyer = this$0.getCloudCtrlKitProxyer(context);
            if (cloudCtrlKitProxyer != null) {
                MspLog.d(TAG, "registerCallback exec call registerCallbacks");
                cloudCtrlKitProxyer.registerCallbacks(str, new IMspCallback.Stub() { // from class: com.heytap.nearx.tangramconfig.kit.client.KitProxy$registerCallback$1$1
                    @Override // com.heytap.msp.IMspCallback
                    public void callback(@Nullable MspResponse response) {
                        Bundle data;
                        boolean z = false;
                        if (response != null && response.getCode() == 0) {
                            z = true;
                        }
                        if (!z) {
                            IpcCallback<String> ipcCallback2 = ipcCallback;
                            if (ipcCallback2 != null) {
                                ipcCallback2.onFailed(new Exception(response != null ? response.getMessage() : null));
                                return;
                            }
                            return;
                        }
                        if (response == null || (data = response.getData()) == null) {
                            return;
                        }
                        IpcCallback<String> ipcCallback3 = ipcCallback;
                        try {
                            String string = data.getString(Fields.PRODUCT_ID, "");
                            MspLog.d(KitProxy.TAG, "callback result: " + string);
                            if (ipcCallback3 != null) {
                                ipcCallback3.callback(string);
                                Unit unit = Unit.INSTANCE;
                            }
                        } catch (Exception e2) {
                            if (ipcCallback3 != null) {
                                ipcCallback3.onFailed(e2);
                                Unit unit2 = Unit.INSTANCE;
                            }
                        }
                    }
                });
                this$0.destoryClient(cloudCtrlKitProxyer);
            }
        } catch (Exception e2) {
            MspLog.d(TAG, "registerCallback err: " + e2.getMessage());
            if (ipcCallback != null) {
                ipcCallback.onFailed(e2);
            }
        }
    }

    public final void addMspCrashListener(@NotNull Context context, @Nullable final IpcCallback<String> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        MspSdk.addMspProcessCrashListener(context, "com.heytap.htms:cloudctrl", new e() { // from class: com.heytap.nearx.tangramconfig.kit.client.KitProxy.addMspCrashListener.1
            @Override // com.heytap.mspsdk.core.crash.e
            public void onMspProcessCrash(int launchCount, int errorCount, @Nullable String processName, int versionCode, @Nullable String versionName) {
                String str = processName + " launchCount:" + launchCount + ";errorCount:" + errorCount + ";versionCode:" + versionCode + ";versionName:" + versionName + ';';
                MspLog.d(KitProxy.TAG, "onMspProcessCrash:" + str);
                IpcCallback<String> ipcCallback = callback;
                if (ipcCallback != null) {
                    ipcCallback.onFailed(new Exception(str));
                }
            }

            @Override // com.heytap.mspsdk.core.crash.e
            public void onMspProcessRecover(@Nullable String processName, int versionCode, @Nullable String versionName) {
                String str = processName + " versionCode:" + versionCode + ";versionName:" + versionName + ';';
                MspLog.d(KitProxy.TAG, "onMspProcessRecover:" + str);
                IpcCallback<String> ipcCallback = callback;
                if (ipcCallback != null) {
                    ipcCallback.callback(str);
                }
            }
        });
    }

    public final void checkUpdateConfig(@NotNull final Context context, @Nullable final String requestDeanJson, @Nullable final IpcCallback<Boolean> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        INSTANCE.getExecutors().execute(new Runnable() { // from class: com.oplus.aiunit.vision.jpa
            @Override // java.lang.Runnable
            public final void run() {
                KitProxy.checkUpdateConfig$lambda$3(this.i, context, requestDeanJson, callback);
            }
        });
    }

    public final void gatewayUpdate(@NotNull final Context context, @Nullable final String requestDeanJson, @Nullable final IpcCallback<String> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        INSTANCE.getExecutors().execute(new Runnable() { // from class: com.oplus.aiunit.vision.gpa
            @Override // java.lang.Runnable
            public final void run() {
                KitProxy.gatewayUpdate$lambda$2(this.i, context, requestDeanJson, callback);
            }
        });
    }

    public final void getConfigData(@NotNull final Context context, @NotNull final String requestDeanJson, @Nullable final IpcCallback<ConfigIpcResponse> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(requestDeanJson, "requestDeanJson");
        INSTANCE.getExecutors().execute(new Runnable() { // from class: com.oplus.aiunit.vision.ipa
            @Override // java.lang.Runnable
            public final void run() {
                KitProxy.getConfigData$lambda$1(this.i, context, requestDeanJson, callback);
            }
        });
    }

    public final void getDynamicCondition(@NotNull final Context context, @NotNull final String json, @Nullable final IpcCallback<StrategyEntity> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(json, "json");
        INSTANCE.getExecutors().execute(new Runnable() { // from class: com.oplus.aiunit.vision.hpa
            @Override // java.lang.Runnable
            public final void run() {
                KitProxy.getDynamicCondition$lambda$0(this.i, context, json, callback);
            }
        });
    }

    public final boolean isSupportCloudCtrlKit(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AppInfoUtil appInfoUtil = AppInfoUtil.INSTANCE;
        if (appInfoUtil.isServiceAvailable(context, "com.heytap.htms")) {
            return true;
        }
        return appInfoUtil.isServiceAvailable(context, "com.heytap.mcs");
    }

    public final void registerCallback(@NotNull final Context context, @Nullable final String requestPids, @Nullable final IpcCallback<String> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        MspLog.d(TAG, "registerCallback requestPids: " + requestPids);
        INSTANCE.getExecutors().execute(new Runnable() { // from class: com.oplus.aiunit.vision.fpa
            @Override // java.lang.Runnable
            public final void run() {
                KitProxy.registerCallback$lambda$5(this.i, context, requestPids, callback);
            }
        });
    }
}
