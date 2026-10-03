package com.oplus.utrace.sdk.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import com.oplus.utrace.lib.SdkConfigConst;
import com.oplus.utrace.lib.SdkConfigData;
import com.oplus.utrace.sdk.UTraceApp;
import com.oplus.utrace.utils.Logs;
import com.oplus.utrace.utils.Providers;
import com.oplus.utrace.utils.SafeHandlerThread;
import com.oplus.utrace.utils.SharedPreferencesUtil;
import com.oplus.utrace.utils.TraceUtil;
import com.oplus.utrace.utils.UtilsKt;
import com.opos.process.bridge.base.BridgeConstant;
import java.util.Date;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\"H\u0002J\u001a\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010&\u001a\u00020\u0006J\u001c\u0010'\u001a\u00020(2\b\u0010$\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010&\u001a\u00020\u0006H\u0002J \u0010'\u001a\u00020\"2\u0006\u0010)\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010*\u001a\u00020(H\u0002J\b\u0010+\u001a\u00020\tH\u0002J\n\u0010,\u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010-\u001a\u00020\"2\b\u0010.\u001a\u0004\u0018\u00010/H\u0002J\u0006\u00100\u001a\u00020\"J\u0012\u00101\u001a\u0004\u0018\u00010%2\u0006\u0010.\u001a\u00020/H\u0002J\n\u00102\u001a\u0004\u0018\u00010\tH\u0002J\u0006\u00103\u001a\u00020\"J\u0012\u00104\u001a\u00020\"2\b\u0010.\u001a\u0004\u0018\u00010/H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u00065"}, d2 = {"Lcom/oplus/utrace/sdk/internal/SdkConfig;", "", "()V", "DELAY_IF_LOCKED", "", "KEY_SDK_CONFIG_DATA", "", "TAG", "configData", "Lcom/oplus/utrace/lib/SdkConfigData;", "getConfigData$utrace_sdk_log_logRelease$annotations", "getConfigData$utrace_sdk_log_logRelease", "()Lcom/oplus/utrace/lib/SdkConfigData;", "setConfigData$utrace_sdk_log_logRelease", "(Lcom/oplus/utrace/lib/SdkConfigData;)V", "coreObserver", "Landroid/database/ContentObserver;", "hLogCtrl", "Lcom/oplus/utrace/lib/SdkConfigData$HLogCtrl;", "getHLogCtrl", "()Lcom/oplus/utrace/lib/SdkConfigData$HLogCtrl;", "ioThread", "Lcom/oplus/utrace/utils/SafeHandlerThread;", "getIoThread", "()Lcom/oplus/utrace/utils/SafeHandlerThread;", "ioThread$delegate", "Lkotlin/Lazy;", "listener", "Lcom/oplus/utrace/sdk/internal/ISdkConfigListener;", "getListener", "()Lcom/oplus/utrace/sdk/internal/ISdkConfigListener;", "setListener", "(Lcom/oplus/utrace/sdk/internal/ISdkConfigListener;)V", "configDataChanged", "", BridgeConstant.PROVIDER_DISPATCH_METHOD, "bundle", "Landroid/os/Bundle;", "from", "dispatchSdkConfig", "", "newData", "canSave", "initFromSp", "loadFromSpImpl", "observeCoreProvider", "context", "Landroid/content/Context;", "queryIfExpired", "querySdkConfig", "reloadFromSp", "uninit", "unobserveCoreProvider", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSdkConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdkConfig.kt\ncom/oplus/utrace/sdk/internal/SdkConfig\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n1#2:200\n*E\n"})
public final class SdkConfig {
    private static final float DELAY_IF_LOCKED = 0.16666667f;

    @NotNull
    public static final SdkConfig INSTANCE;

    @NotNull
    private static final String KEY_SDK_CONFIG_DATA = "key_sdk_config_data";

    @NotNull
    private static final String TAG = "UTrace.Sdk.SdkConfig";

    @NotNull
    private static volatile SdkConfigData configData;
    private static ContentObserver coreObserver;

    @NotNull
    private static final Lazy ioThread$delegate;

    @Nullable
    private static ISdkConfigListener listener;

    static {
        SdkConfig sdkConfig = new SdkConfig();
        INSTANCE = sdkConfig;
        ioThread$delegate = LazyKt.lazy(new Function0<SafeHandlerThread>() { // from class: com.oplus.utrace.sdk.internal.SdkConfig$ioThread$2
            @Nullable
            public final SafeHandlerThread invoke() {
                return TraceUtil.newHandlerThread$utrace_sdk_log_logRelease("UTrace.Sdk.IO");
            }
        });
        configData = sdkConfig.initFromSp();
        sdkConfig.observeCoreProvider(UTraceApp.mContext);
    }

    private SdkConfig() {
    }

    private final void configDataChanged() {
        Logs.INSTANCE.setDebuggable(configData.getLogsDebuggable());
        ISdkConfigListener iSdkConfigListener = listener;
        if (iSdkConfigListener != null) {
            iSdkConfigListener.onSdkConfigChange();
        }
    }

    public static /* synthetic */ void dispatch$default(SdkConfig sdkConfig, Bundle bundle, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        sdkConfig.dispatch(bundle, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean dispatchSdkConfig(Bundle bundle, String from) {
        SdkConfigData sdkConfigDataCreateFromBundle;
        SdkConfigData sdkConfigData = null;
        if (bundle != null) {
            if (!(!bundle.isEmpty())) {
                bundle = null;
            }
            if (bundle != null) {
                if (!(!bundle.containsKey(SdkConfigConst.KEY_IS_VALID) || bundle.getBoolean(SdkConfigConst.KEY_IS_VALID, false))) {
                    bundle = null;
                }
                if (bundle != null && (sdkConfigDataCreateFromBundle = SdkConfigData.INSTANCE.createFromBundle(bundle)) != null) {
                    INSTANCE.dispatchSdkConfig(sdkConfigDataCreateFromBundle, from, true);
                    sdkConfigData = sdkConfigDataCreateFromBundle;
                }
            }
        }
        return sdkConfigData != null;
    }

    public static /* synthetic */ boolean dispatchSdkConfig$default(SdkConfig sdkConfig, Bundle bundle, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return sdkConfig.dispatchSdkConfig(bundle, str);
    }

    @VisibleForTesting
    public static /* synthetic */ void getConfigData$utrace_sdk_log_logRelease$annotations() {
    }

    private final SafeHandlerThread getIoThread() {
        return (SafeHandlerThread) ioThread$delegate.getValue();
    }

    private final SdkConfigData initFromSp() {
        SdkConfigData sdkConfigDataLoadFromSpImpl = loadFromSpImpl();
        if (sdkConfigDataLoadFromSpImpl != null) {
            Context context = UTraceApp.mContext;
            boolean z = false;
            if (context != null && UtilsKt.isCoreProcess(context)) {
                z = true;
            }
            if (!z) {
                Logs.INSTANCE.setDebuggable(sdkConfigDataLoadFromSpImpl.getLogsDebuggable());
            }
        } else {
            sdkConfigDataLoadFromSpImpl = new SdkConfigData(false, null, null, false, null, null, null, 0L, 0L, 255, null);
        }
        Logs logs = Logs.INSTANCE;
        if (logs.getDebuggable()) {
            logs.d(TAG, "initFromSp() result=" + sdkConfigDataLoadFromSpImpl + " expireTime=(" + new Date(sdkConfigDataLoadFromSpImpl.getExpireTime()) + ')');
        }
        return sdkConfigDataLoadFromSpImpl;
    }

    private final SdkConfigData loadFromSpImpl() {
        String string = SharedPreferencesUtil.getString(KEY_SDK_CONFIG_DATA);
        if (string == null) {
            return null;
        }
        if (!(!StringsKt.isBlank(string))) {
            string = null;
        }
        if (string != null) {
            return SdkConfigData.INSTANCE.createFromJSONString(string);
        }
        return null;
    }

    private final void observeCoreProvider(final Context context) {
        Object obj;
        Handler handler;
        if (context == null) {
            return;
        }
        Uri uriResolveCoreUri = Providers.INSTANCE.resolveCoreUri(context);
        if (uriResolveCoreUri == null) {
            Logs.INSTANCE.i(TAG, "observeCoreProvider() can't resolve core uri. context=" + context);
            return;
        }
        if (coreObserver == null) {
            SafeHandlerThread ioThread = getIoThread();
            if (ioThread == null || (handler = ioThread.getHandler()) == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            coreObserver = new ContentObserver(handler) { // from class: com.oplus.utrace.sdk.internal.SdkConfig.observeCoreProvider.2
                @Override // android.database.ContentObserver
                public void onChange(boolean selfChange) {
                    Logs.INSTANCE.d(SdkConfig.TAG, "onChange() invoked");
                    SdkConfig sdkConfig = SdkConfig.INSTANCE;
                    sdkConfig.dispatchSdkConfig(sdkConfig.querySdkConfig(context), "onChange");
                }
            };
        }
        try {
            Result.Companion companion = Result.Companion;
            ContentResolver contentResolver = context.getContentResolver();
            ContentObserver contentObserver = coreObserver;
            if (contentObserver == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coreObserver");
                contentObserver = null;
            }
            contentResolver.registerContentObserver(uriResolveCoreUri, true, contentObserver);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logs.INSTANCE.i(TAG, "observeCoreProvider() can't observe core provider. uri=" + uriResolveCoreUri + " exception=" + th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle querySdkConfig(Context context) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            Bundle bundleCallCoreProvider$default = Providers.callCoreProvider$default(Providers.INSTANCE, context, SdkConfigConst.METHOD_QUERY_SDK_CONFIG, null, 4, null);
            Logs logs = Logs.INSTANCE;
            if (logs.getDebuggable()) {
                StringBuilder sb = new StringBuilder();
                sb.append("querySdkConfig() result=(");
                sb.append(bundleCallCoreProvider$default != null ? Integer.valueOf(bundleCallCoreProvider$default.size()) : null);
                sb.append(')');
                sb.append(bundleCallCoreProvider$default);
                logs.d(TAG, sb.toString());
            }
            obj = Result.constructor-impl(bundleCallCoreProvider$default);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logs.INSTANCE.w(TAG, "querySdkConfig() exception=" + th2.getMessage(), th2);
        }
        return (Bundle) (Result.isFailure-impl(obj) ? null : obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SdkConfigData reloadFromSp() {
        SharedPreferencesUtil.reload();
        return loadFromSpImpl();
    }

    private final void unobserveCoreProvider(Context context) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            if (context == null || coreObserver == null) {
                return;
            }
            ContentResolver contentResolver = context.getContentResolver();
            ContentObserver contentObserver = coreObserver;
            if (contentObserver == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coreObserver");
                contentObserver = null;
            }
            contentResolver.unregisterContentObserver(contentObserver);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.exceptionOrNull-impl(obj) != null) {
            Logs.INSTANCE.i(TAG, "unobserveCoreProvider");
        }
    }

    public final void dispatch(@Nullable Bundle bundle, @NotNull String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        Logs logs = Logs.INSTANCE;
        StringBuilder sb = new StringBuilder();
        sb.append("dispatch() bundle=");
        sb.append(bundle != null ? Integer.valueOf(bundle.size()) : null);
        sb.append('|');
        sb.append(bundle);
        logs.d(TAG, sb.toString());
        dispatchSdkConfig(bundle, "dispatch/" + from);
    }

    @NotNull
    public final SdkConfigData getConfigData$utrace_sdk_log_logRelease() {
        return configData;
    }

    @Nullable
    public final SdkConfigData.HLogCtrl getHLogCtrl() {
        queryIfExpired();
        return configData.getHLogCtrl();
    }

    @Nullable
    public final ISdkConfigListener getListener() {
        return listener;
    }

    public final void queryIfExpired() {
        final Context context = UTraceApp.mContext;
        if (context == null) {
            Logs.INSTANCE.d(TAG, "queryIfExpired() context==null ==> coreState=false");
        } else if (configData.isExpired()) {
            TraceUtil.runSafeThread$utrace_sdk_log_logRelease(new Function0<Unit>() { // from class: com.oplus.utrace.sdk.internal.SdkConfig.queryIfExpired.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    SdkConfig sdkConfig = SdkConfig.INSTANCE;
                    if (sdkConfig.getConfigData$utrace_sdk_log_logRelease().isExpired()) {
                        SdkConfigData sdkConfigDataReloadFromSp = sdkConfig.reloadFromSp();
                        if ((sdkConfigDataReloadFromSp == null || sdkConfigDataReloadFromSp.isExpired()) ? false : true) {
                            sdkConfig.dispatchSdkConfig(sdkConfigDataReloadFromSp, "queryIfExpired/reload", false);
                            return;
                        }
                        if (sdkConfig.dispatchSdkConfig(sdkConfig.querySdkConfig(context), "queryIfExpired/query")) {
                            return;
                        }
                        boolean zIsUserUnlocked = UtilsKt.isUserUnlocked();
                        long jExpireTime = SdkConfigData.INSTANCE.expireTime(zIsUserUnlocked ? null : Float.valueOf(SdkConfig.DELAY_IF_LOCKED));
                        SdkConfigData configData$utrace_sdk_log_logRelease = sdkConfig.getConfigData$utrace_sdk_log_logRelease();
                        sdkConfig.setConfigData$utrace_sdk_log_logRelease(configData$utrace_sdk_log_logRelease.copy((255 & 1) != 0 ? configData$utrace_sdk_log_logRelease.isEnabled : false, (255 & 2) != 0 ? configData$utrace_sdk_log_logRelease.overflow : null, (255 & 4) != 0 ? configData$utrace_sdk_log_logRelease.overflowPt : null, (255 & 8) != 0 ? configData$utrace_sdk_log_logRelease.logsDebuggable : false, (255 & 16) != 0 ? configData$utrace_sdk_log_logRelease.traceCacheMetrics : null, (255 & 32) != 0 ? configData$utrace_sdk_log_logRelease.traceLogCtrl : null, (255 & 64) != 0 ? configData$utrace_sdk_log_logRelease.hLogCtrl : null, (255 & 128) != 0 ? configData$utrace_sdk_log_logRelease.bindWindow : 0L, (255 & 256) != 0 ? configData$utrace_sdk_log_logRelease.expireTime : jExpireTime));
                        Logs.INSTANCE.i(SdkConfig.TAG, "queryIfExpired() unchanged configData=" + sdkConfig.getConfigData$utrace_sdk_log_logRelease() + " unlocked=" + zIsUserUnlocked + " expireTime=(" + new Date(sdkConfig.getConfigData$utrace_sdk_log_logRelease().getExpireTime()) + ')');
                    }
                }
            });
        }
    }

    public final void setConfigData$utrace_sdk_log_logRelease(@NotNull SdkConfigData sdkConfigData) {
        Intrinsics.checkNotNullParameter(sdkConfigData, "<set-?>");
        configData = sdkConfigData;
    }

    public final void setListener(@Nullable ISdkConfigListener iSdkConfigListener) {
        listener = iSdkConfigListener;
    }

    public final void uninit() {
        unobserveCoreProvider(UTraceApp.mContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchSdkConfig(SdkConfigData newData, String from, boolean canSave) {
        boolean zDiverse = newData.diverse(configData);
        Logs.INSTANCE.i(TAG, "dispatchSdkConfig() diverse=" + zDiverse + " canSave=" + canSave + " from=" + from + " expireTime=(" + new Date(newData.getExpireTime()) + ") receive=" + newData);
        configData = newData;
        if (canSave) {
            SharedPreferencesUtil.putString(KEY_SDK_CONFIG_DATA, newData.toJSONString(), true);
        }
        configDataChanged();
    }
}
