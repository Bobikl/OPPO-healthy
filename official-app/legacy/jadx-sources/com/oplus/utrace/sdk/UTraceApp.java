package com.oplus.utrace.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import com.oplus.utrace.hlog.ULoggerImpl;
import com.oplus.utrace.sdk.internal.SdkConfig;
import com.oplus.utrace.utils.ExceptionProtectUtil;
import com.oplus.utrace.utils.Logs;
import com.oplus.utrace.utils.SharedPreferencesUtil;
import com.oplus.utrace.utils.TraceUtil;
import com.oplus.utrace.utils.UserUnlockManager;
import com.oplus.utrace.utils.UtilsKt;
import io.netty.util.internal.StringUtil;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u0010H\u0001¢\u0006\u0002\b\u001dJ\r\u0010\u001e\u001a\u00020\u0017H\u0001¢\u0006\u0002\b\u001fJ\r\u0010 \u001a\u00020\u0017H\u0001¢\u0006\u0002\b!J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0010H\u0007J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0007J \u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u000bH\u0007J\u0010\u0010%\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0010H\u0002J\r\u0010&\u001a\u00020\u000bH\u0001¢\u0006\u0002\b'J\r\u0010(\u001a\u00020\u000bH\u0001¢\u0006\u0002\b)J\u0018\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0004H\u0007J\b\u0010-\u001a\u00020#H\u0007J\b\u0010.\u001a\u00020#H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015¨\u0006/"}, d2 = {"Lcom/oplus/utrace/sdk/UTraceApp;", "", "()V", "FLAG_ENABLE_CORE", "", "FLAG_ENABLE_LOG_DEBUG", "FLAG_IN_SEEDLING_PLUGIN", "FLAG_SET_HLOG_DEBUG", "NO", "YES", "inSeedlingPlugin", "", "initLockObj", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRegisHLogReceiver", "mContext", "Landroid/content/Context;", "mEnabled", "getMEnabled$utrace_sdk_log_logRelease", "()Z", "setMEnabled$utrace_sdk_log_logRelease", "(Z)V", "mPkgName", "", "moduleName", "setHLogDebug", "getSetHLogDebug$utrace_sdk_log_logRelease", "setSetHLogDebug$utrace_sdk_log_logRelease", "getContext", "getContext$utrace_sdk_log_logRelease", "getModuleName", "getModuleName$utrace_sdk_log_logRelease", "getPkgName", "getPkgName$utrace_sdk_log_logRelease", "init", "", "context", "initLog", "isInSeedlingPlugin", "isInSeedlingPlugin$utrace_sdk_log_logRelease", "isRegisHLogReceive", "isRegisHLogReceive$utrace_sdk_log_logRelease", "setFlag", "flag", "value", "uninit", "uninitLog", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"StaticFieldLeak"})
@SourceDebugExtension({"SMAP\nUTraceApp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UTraceApp.kt\ncom/oplus/utrace/sdk/UTraceApp\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"})
public final class UTraceApp {
    public static final int FLAG_ENABLE_CORE = 1;
    public static final int FLAG_ENABLE_LOG_DEBUG = 3;
    public static final int FLAG_IN_SEEDLING_PLUGIN = 2;
    public static final int FLAG_SET_HLOG_DEBUG = 4;
    public static final int NO = 0;
    public static final int YES = 1;
    private static boolean inSeedlingPlugin;
    private static boolean isRegisHLogReceiver;

    @Nullable
    private static Context mContext;
    private static boolean setHLogDebug;

    @NotNull
    public static final UTraceApp INSTANCE = new UTraceApp();

    @NotNull
    private static String mPkgName = "";

    @NotNull
    private static String moduleName = "base";
    private static boolean mEnabled = true;

    @NotNull
    private static final AtomicBoolean initLockObj = new AtomicBoolean(false);

    private UTraceApp() {
    }

    @JvmStatic
    public static final void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        init(context, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initLog(Context context) {
        Logs.INSTANCE.i("UTrace.Sdk.App", TraceUtil.generateLogPrefix$utrace_sdk_log_logRelease$default(null, 1, null) + " initLog() context=" + context + " loader=" + UTraceApp.class.getClassLoader());
        ULoggerImpl.Companion.loadAndQuery(context);
    }

    @JvmStatic
    public static final void setFlag(int flag, int value) {
        Log.d("UTrace.Sdk.App", "setFlag flag = " + flag + ", value = " + value);
        if (flag == 1) {
            mEnabled = value != 0;
        } else if (flag == 2) {
            inSeedlingPlugin = value != 0;
        } else {
            if (flag != 4) {
                return;
            }
            setHLogDebug = value != 0;
        }
    }

    @JvmStatic
    public static final void uninit() {
        Logs.INSTANCE.i("UTrace.Sdk.App", "uninit() moduleName=" + moduleName + " version=2.0.44-25e9612-20260202-124920");
        UserUnlockManager.INSTANCE.release();
        INSTANCE.uninitLog();
        TraceUtil.quit$utrace_sdk_log_logRelease();
        SdkConfig.INSTANCE.uninit();
        mContext = null;
    }

    private final void uninitLog() {
        Logs.INSTANCE.i("UTrace.Sdk.App", TraceUtil.generateLogPrefix$utrace_sdk_log_logRelease$default(null, 1, null) + " uninit() mLogger=" + ULog.INSTANCE.getMLogger$utrace_sdk_log_logRelease() + " loader=" + UTraceApp.class.getClassLoader());
        ULog.releaseLogger$utrace_sdk_log_logRelease();
        ULoggerImpl.Companion.quit();
    }

    public final boolean getMEnabled$utrace_sdk_log_logRelease() {
        return mEnabled;
    }

    public final boolean getSetHLogDebug$utrace_sdk_log_logRelease() {
        return setHLogDebug;
    }

    public final void setMEnabled$utrace_sdk_log_logRelease(boolean z) {
        mEnabled = z;
    }

    public final void setSetHLogDebug$utrace_sdk_log_logRelease(boolean z) {
        setHLogDebug = z;
    }

    @JvmStatic
    public static final void init(@NotNull Context context, @NotNull String moduleName2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moduleName2, "moduleName");
        init(context, moduleName2, false);
    }

    @JvmStatic
    public static final void init(@NotNull Context context, @NotNull final String moduleName2, boolean isRegisHLogReceiver2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moduleName2, "moduleName");
        if (mContext != null) {
            Log.d("UTrace.Sdk.App", "init() redundant call. moduleName=" + moduleName2 + StringUtil.SPACE);
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        mContext = applicationContext;
        String packageName = applicationContext.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context1.packageName");
        mPkgName = packageName;
        moduleName = moduleName2.length() == 0 ? "base" : moduleName2;
        isRegisHLogReceiver = isRegisHLogReceiver2;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        TraceUtil.runSafeThread$utrace_sdk_log_logRelease(new Function0<Unit>() { // from class: com.oplus.utrace.sdk.UTraceApp.init.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (UTraceApp.initLockObj.getAndSet(true)) {
                    return;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                Logs.INSTANCE.i("UTrace.Sdk.App", "init() moduleName=" + moduleName2 + " process=" + UtilsKt.getProcessName(applicationContext) + " context=" + UTraceApp.mContext + "version=2.0.44-25e9612-20260202-124920,launchSdkInitThread init log time  = " + jCurrentTimeMillis2);
                ExceptionProtectUtil.setContext(applicationContext);
                SharedPreferencesUtil.setContext(applicationContext);
                UserUnlockManager.INSTANCE.init(applicationContext);
                UTraceApp.INSTANCE.initLog(applicationContext);
            }
        });
    }
}
