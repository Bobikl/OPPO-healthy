package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.log.formatter.LogFieldKey;
import com.lifesense.weidong.lzsimplenetlibs.net.invoker.HttpStatus;
import com.oplus.pantanal.log.printer.EncryptType;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.utrace.sdk.ULog;
import com.pantanal.fundation.internal.log.LogcatPrinter;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bM\u0010NJ\u0010\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\u000b\u001a\u00020\bH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u0006\u0010\u0012\u001a\u00020\fJJ\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016JJ\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016JJ\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016JJ\u0010 \u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016JJ\u0010!\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\u000e\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u0003J\u000e\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u0003J\u0006\u0010&\u001a\u00020\u0003J\u001a\u0010)\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\u00032\b\u0010(\u001a\u0004\u0018\u00010\u0003J*\u0010-\u001a\u00020\b2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003J\u000e\u0010/\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u0003J\u0010\u00102\u001a\u00020\b2\b\u00101\u001a\u0004\u0018\u000100R\u0016\u00104\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00103R\u0016\u00107\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00106R\u0018\u00109\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00108R\u0018\u0010:\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00108R\u0016\u0010;\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00108R*\u0010B\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010*\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u00108\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010+\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u00108\u001a\u0004\bG\u0010D\"\u0004\bH\u0010FR$\u0010,\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u00108\u001a\u0004\bI\u0010D\"\u0004\bJ\u0010FR\"\u0010.\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u00108\u001a\u0004\bK\u0010D\"\u0004\bL\u0010F¨\u0006O"}, d2 = {"Lcom/oplus/aiunit/vision/t6e;", "Lcom/oplus/aiunit/vision/bs9;", "", "", "j", "f", "Landroid/content/Context;", "context", "", MapSchema.FIELD_NAME_KEY, LogFieldKey.LEVEL_KEY, "s", "", "r", "Lcom/oplus/aiunit/vision/dn6;", b2n.f, "Lcom/oplus/pantanal/log/printer/EncryptType;", b2n.g, "q", "tag", "msg", "isMsgContainsSensitiveInfo", "sensitiveMsg", "printThreadInfo", "", "stackTraceDepth", "printClassNameAndMethodName", "", "throwable", "b", "d", "c", "a", MapSchema.FIELD_NAME_ENTRY, "tagPrefix", "t", "logTagSecondaryPrefix", "n", "u", "pluginCommitHash", "pluginVersionName", LogFieldKey.PROCESS_NAME_KEY, sbe.PAY_SDK_VERSION_NAME, sbe.PAY_SDK_VERSION_CODE, "sdkCommitHash", "o", TraceConstants.KEY_APP_VERSION_NAME, LogFieldKey.MESSAGE_KEY, "Lcom/oplus/aiunit/vision/ks9;", "logger", "v", "Ld;", "oLog", "Lcom/oplus/aiunit/vision/pv9;", "Lcom/oplus/aiunit/vision/pv9;", "logcatPrinter", "Ljava/lang/String;", "seedlingPluginVersionName", "seedlingPluginCommitHash", "umsBuildType", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "getDebuggable", "()Lkotlin/jvm/functions/Function0;", "setDebuggable", "(Lkotlin/jvm/functions/Function0;)V", "debuggable", "getSdkVersionName", "()Ljava/lang/String;", "setSdkVersionName", "(Ljava/lang/String;)V", "i", "setSdkVersionCode", "getSdkCommitHash", "setSdkCommitHash", "getAppVersionName", "setAppVersionName", "<init>", "()V", "foundation-internal_release"}, k = 1, mv = {1, 8, 0})
public final class t6e implements bs9 {

    @NotNull
    public static final t6e INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static defpackage.d oLog;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static pv9 logcatPrinter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static String seedlingPluginVersionName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static String seedlingPluginCommitHash;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static volatile String umsBuildType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public static Function0<Boolean> debuggable;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public static String sdkVersionName;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public static String sdkVersionCode;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public static String sdkCommitHash;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static String appVersionName;

    static {
        t6e t6eVar = new t6e();
        INSTANCE = t6eVar;
        umsBuildType = "";
        appVersionName = "";
        logcatPrinter = new LogcatPrinter(PrinterConfig.a.v(PrinterConfig.a.t(new PrinterConfig.a().p(3).q("").r("PantaCard").o("PantaLog").y(false).x(t6eVar.h()), 1000, false, 2, null), HttpStatus.USER_CANCEL, false, 2, null).w(t6eVar.g()).a());
        defpackage.d dVar = new defpackage.d();
        oLog = dVar;
        dVar.g(null, logcatPrinter);
    }

    @JvmStatic
    @NotNull
    public static final List<String> j() {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{seedlingPluginCommitHash, seedlingPluginVersionName});
    }

    @JvmStatic
    public static final void k(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ULog.i("PantaCard", "PantaLog begin to init ");
        t6e t6eVar = INSTANCE;
        t6eVar.l(context);
        t6eVar.s();
    }

    @Override // com.oplus.aiunit.vision.bs9
    public void a(@NotNull String tag, @NotNull String msg, boolean isMsgContainsSensitiveInfo, @NotNull String sensitiveMsg, boolean printThreadInfo, int stackTraceDepth, boolean printClassNameAndMethodName, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(sensitiveMsg, "sensitiveMsg");
        oLog.a(tag, msg, isMsgContainsSensitiveInfo, sensitiveMsg, printThreadInfo, stackTraceDepth, printClassNameAndMethodName, throwable);
    }

    @Override // com.oplus.aiunit.vision.bs9
    public void b(@NotNull String tag, @NotNull String msg, boolean isMsgContainsSensitiveInfo, @NotNull String sensitiveMsg, boolean printThreadInfo, int stackTraceDepth, boolean printClassNameAndMethodName, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(sensitiveMsg, "sensitiveMsg");
        oLog.b(tag, msg, isMsgContainsSensitiveInfo, sensitiveMsg, printThreadInfo, stackTraceDepth, printClassNameAndMethodName, throwable);
    }

    @Override // com.oplus.aiunit.vision.bs9
    public void c(@NotNull String tag, @NotNull String msg, boolean isMsgContainsSensitiveInfo, @NotNull String sensitiveMsg, boolean printThreadInfo, int stackTraceDepth, boolean printClassNameAndMethodName, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(sensitiveMsg, "sensitiveMsg");
        oLog.c(tag, msg, isMsgContainsSensitiveInfo, sensitiveMsg, printThreadInfo, stackTraceDepth, printClassNameAndMethodName, throwable);
    }

    @Override // com.oplus.aiunit.vision.bs9
    public void d(@NotNull String tag, @NotNull String msg, boolean isMsgContainsSensitiveInfo, @NotNull String sensitiveMsg, boolean printThreadInfo, int stackTraceDepth, boolean printClassNameAndMethodName, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(sensitiveMsg, "sensitiveMsg");
        oLog.d(tag, msg, isMsgContainsSensitiveInfo, sensitiveMsg, printThreadInfo, stackTraceDepth, printClassNameAndMethodName, throwable);
    }

    @Override // com.oplus.aiunit.vision.bs9
    public void e(@NotNull String tag, @NotNull String msg, boolean isMsgContainsSensitiveInfo, @NotNull String sensitiveMsg, boolean printThreadInfo, int stackTraceDepth, boolean printClassNameAndMethodName, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(sensitiveMsg, "sensitiveMsg");
        oLog.e(tag, msg, isMsgContainsSensitiveInfo, sensitiveMsg, printThreadInfo, stackTraceDepth, printClassNameAndMethodName, throwable);
    }

    public final String f() {
        String str = seedlingPluginVersionName;
        if (str == null || str.length() == 0) {
            String str2 = appVersionName;
            if (str2 == null || str2.length() == 0) {
                return "[sdk:v" + sdkVersionName + "-" + sdkCommitHash + "]";
            }
        }
        String str3 = seedlingPluginVersionName;
        if (str3 == null || str3.length() == 0) {
            return "[sdk:v" + sdkVersionName + "-" + sdkCommitHash + ",app:v" + appVersionName + "]";
        }
        return "[sdk:v" + sdkVersionName + "-" + sdkCommitHash + ",seed-plugin:v" + seedlingPluginVersionName + "-" + seedlingPluginCommitHash + ",app:v" + appVersionName + "]";
    }

    public final EncryptConfig g() {
        if (r()) {
            return new EncryptConfig("xxx", "yyy", "#", true, null, null, 48, null);
        }
        return null;
    }

    public final EncryptType h() {
        return r() ? EncryptType.BASE64 : EncryptType.NONE;
    }

    @Nullable
    public final String i() {
        return sdkVersionCode;
    }

    public final void l(Context context) {
        Object objM5287constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            umsBuildType = (String) y6e.c(context, "com.oplus.pantanal.ums", "APP_BUILD_TYPE", "");
            objM5287constructorimpl = Result.m5287constructorimpl(Integer.valueOf(ULog.i("PantaCard", "initUmsDebugType umsBuildType:" + umsBuildType)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            ULog.e("PantaCard", "initUmsDebugType error", thM5290exceptionOrNullimpl);
        }
    }

    public final void m(@NotNull String appVersionName2) {
        Intrinsics.checkNotNullParameter(appVersionName2, "appVersionName");
        appVersionName = appVersionName2;
        logcatPrinter.getLogConfig().n(f());
    }

    public final void n(@NotNull String logTagSecondaryPrefix) {
        Intrinsics.checkNotNullParameter(logTagSecondaryPrefix, "logTagSecondaryPrefix");
        logcatPrinter.getLogConfig().p(logTagSecondaryPrefix);
    }

    public final void o(@Nullable String sdkVersionName2, @Nullable String sdkVersionCode2, @Nullable String sdkCommitHash2) {
        sdkVersionName = sdkVersionName2;
        sdkVersionCode = sdkVersionCode2;
        sdkCommitHash = sdkCommitHash2;
        logcatPrinter.getLogConfig().n(f());
    }

    public final void p(@Nullable String pluginCommitHash, @Nullable String pluginVersionName) {
        bs9.a.a(this, "tj", "injectSeedlingPluginVersionInfo,", false, null, false, 0, false, null, 252, null);
        seedlingPluginCommitHash = pluginCommitHash;
        seedlingPluginVersionName = pluginVersionName;
        logcatPrinter.getLogConfig().n(f());
    }

    public final boolean q() {
        Function0<Boolean> function0 = debuggable;
        if (function0 != null) {
            return function0.invoke().booleanValue();
        }
        return true;
    }

    public final boolean r() {
        return Intrinsics.areEqual("release", umsBuildType);
    }

    public final void s() {
        EncryptType encryptTypeH = h();
        logcatPrinter.getLogConfig().r(encryptTypeH);
        ULog.i("PantaCard", "resetMsgEncryptType to " + encryptTypeH);
        EncryptConfig encryptConfigG = g();
        logcatPrinter.getLogConfig().q(encryptConfigG);
        ULog.i("PantaCard", "resetMsgEncryptConfig to " + encryptConfigG);
    }

    public final void t(@NotNull String tagPrefix) {
        Intrinsics.checkNotNullParameter(tagPrefix, "tagPrefix");
        logcatPrinter.getLogConfig().o(tagPrefix);
    }

    @NotNull
    public final String u() {
        return y6e.h(f());
    }

    public final void v(@Nullable ks9 logger) {
    }
}
