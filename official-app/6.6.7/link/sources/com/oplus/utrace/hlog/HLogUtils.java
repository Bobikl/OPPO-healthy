package com.oplus.utrace.hlog;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.heytap.log.INetAvailable;
import com.heytap.log.Logger;
import com.heytap.log.Settings;
import com.oplus.aiunit.vision.d14;
import com.oplus.aiunit.vision.gsi;
import com.oplus.utrace.lib.HLogConst;
import com.oplus.utrace.lib.PackageNames;
import com.oplus.utrace.sdk.BuildConfig;
import com.oplus.utrace.sdk.UTraceApp;
import com.oplus.utrace.utils.Logs;
import com.oplus.utrace.utils.SafeHandlerThread;
import com.oplus.utrace.utils.TraceUtil;
import com.oplus.utrace.utils.UtilsKt;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bB\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u000f\u0010\u0012\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0004H\u0007J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0019\u001a\u00020\nH\u0007J\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\"\u001a\u00020\u001fH\u0001¢\u0006\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010$R\u001b\u0010)\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010+R\u0014\u00100\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010$R\u0014\u00101\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010$R\u001d\u00106\u001a\u0004\u0018\u0001028@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b4\u00105R&\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u000208078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R \u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040=8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lcom/oplus/utrace/hlog/HLogUtils;", "", "Landroid/content/Context;", "context", "", "defaultLogPath", "", "traceId", "defaultLogUploadPath", "defaultLogCachePath", "", "resolveReceiver", "", "Landroid/content/pm/ResolveInfo;", "resolveReceivers", "", "ensureLibraryDirectories$utrace_sdk_log_logRelease", "()V", "ensureLibraryDirectories", "Lcom/oplus/aiunit/vision/gsi;", "deviceIds", "logFilePath", "Lcom/heytap/log/Logger;", "buildLogger", "isNeedNetAvailable", "isInPlugin", "Ljava/io/File;", "file", "extractFileTimeFromDogFile$utrace_sdk_log_logRelease", "(Ljava/io/File;)Ljava/lang/String;", "extractFileTimeFromDogFile", "Ljava/text/SimpleDateFormat;", "getLogFileTimeFormat$utrace_sdk_log_logRelease", "()Ljava/text/SimpleDateFormat;", "getLogFileTimeFormat", "TAG", "Ljava/lang/String;", "logPrefix$delegate", "Lkotlin/Lazy;", "getLogPrefix", "()Ljava/lang/String;", "logPrefix", "canResolveReceiver", "Ljava/lang/Boolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "libDirEnsured", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isPlugin", "HLOG_SO_NAME", "HLOG_SO_DIR", "Lcom/oplus/utrace/utils/SafeHandlerThread;", "thread$delegate", "getThread$utrace_sdk_log_logRelease", "()Lcom/oplus/utrace/utils/SafeHandlerThread;", "thread", "", "Lcom/oplus/utrace/hlog/UploadFlag;", "defaultUploadFlags", "Ljava/util/Map;", "getDefaultUploadFlags$utrace_sdk_log_logRelease", "()Ljava/util/Map;", "", "DOG_EXT", "[Ljava/lang/String;", "getDOG_EXT$utrace_sdk_log_logRelease", "()[Ljava/lang/String;", "<init>", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0})
public final class HLogUtils {

    @NotNull
    private static final String[] DOG_EXT;

    @NotNull
    private static final String HLOG_SO_DIR = "lib/arm64-v8a";

    @NotNull
    private static final String HLOG_SO_NAME = "heytaplog";

    @NotNull
    public static final String TAG = "UTrace.Sdk.HLogUtils";

    @Nullable
    private static volatile Boolean canResolveReceiver;

    @NotNull
    private static final Map<String, UploadFlag> defaultUploadFlags;

    @Nullable
    private static volatile Boolean isPlugin;

    @NotNull
    public static final HLogUtils INSTANCE = new HLogUtils();

    @NotNull
    private static final Lazy logPrefix$delegate = LazyKt.lazy(new Function0<String>() { // from class: com.oplus.utrace.hlog.HLogUtils$logPrefix$2
        @NotNull
        public final String invoke() {
            return TraceUtil.generateLogPrefix$utrace_sdk_log_logRelease$default(null, 1, null);
        }
    });

    @NotNull
    private static final AtomicBoolean libDirEnsured = new AtomicBoolean(false);

    @NotNull
    private static final Lazy thread$delegate = LazyKt.lazy(new Function0<SafeHandlerThread>() { // from class: com.oplus.utrace.hlog.HLogUtils$thread$2
        @Nullable
        public final SafeHandlerThread invoke() {
            return TraceUtil.newHandlerThread$utrace_sdk_log_logRelease(HLogUtils.TAG);
        }
    });

    static {
        UploadFlag uploadFlag = UploadFlag.NEED_PROXY;
        Pair pair = TuplesKt.to("com.android.systemui", uploadFlag);
        Pair pair2 = TuplesKt.to(PackageNames.LAUNCHER, uploadFlag);
        Pair pair3 = TuplesKt.to(PackageNames.SECONDARY_HOME, uploadFlag);
        Pair pair4 = TuplesKt.to("com.coloros.assistantscreen", uploadFlag);
        UploadFlag uploadFlag2 = UploadFlag.CAN_UPLOAD;
        defaultUploadFlags = MapsKt.mapOf(new Pair[]{pair, pair2, pair3, pair4, TuplesKt.to("com.oplus.pantanal.ums", uploadFlag2), TuplesKt.to(PackageNames.METIS, uploadFlag2), TuplesKt.to(PackageNames.SCENE_SERVICE, uploadFlag2), TuplesKt.to("com.oplus.utrace", uploadFlag2), TuplesKt.to(PackageNames.UTRACE_MGR, uploadFlag)});
        DOG_EXT = new String[]{".dog3", ".dog2", ".dog1"};
    }

    private HLogUtils() {
    }

    @JvmStatic
    @Nullable
    public static final Logger buildLogger(@NotNull final Context context, @Nullable final gsi deviceIds, @NotNull String logFilePath) {
        long j;
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logFilePath, "logFilePath");
        Logs logs = Logs.INSTANCE;
        StringBuilder sb = new StringBuilder();
        HLogUtils hLogUtils = INSTANCE;
        sb.append(hLogUtils.getLogPrefix());
        sb.append(" buildLogger() context=");
        sb.append(context);
        sb.append(" logFilePath=");
        sb.append(logFilePath);
        logs.d(TAG, sb.toString());
        String strB = deviceIds != null ? deviceIds.b() : null;
        if (strB == null || StringsKt.isBlank(strB)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(hLogUtils.getLogPrefix());
            sb2.append(" buildLogger() ouid='");
            sb2.append(deviceIds != null ? deviceIds.b() : null);
            sb2.append('\'');
            logs.w(TAG, sb2.toString());
            return null;
        }
        Pair pairGenerateFileNamePrefix$utrace_sdk_log_logRelease$default = TraceUtil.generateFileNamePrefix$utrace_sdk_log_logRelease$default(context, null, 2, null);
        String str = (String) pairGenerateFileNamePrefix$utrace_sdk_log_logRelease$default.component1();
        String str2 = (String) pairGenerateFileNamePrefix$utrace_sdk_log_logRelease$default.component2();
        logs.d(TAG, hLogUtils.getLogPrefix() + " buildLogger() processName=" + str + " namePrefix=" + str2);
        Settings.IImeiProvider iImeiProvider = new Settings.IImeiProvider() { // from class: com.oplus.utrace.hlog.p
            public final String getImei() {
                return HLogUtils.buildLogger$lambda$9();
            }
        };
        Settings.IOpenIdProvider iOpenIdProvider = new Settings.IOpenIdProvider() { // from class: com.oplus.utrace.hlog.HLogUtils$buildLogger$idProvider$1
            @NotNull
            public String getDuid() {
                gsi gsiVar = deviceIds;
                String strA = gsiVar != null ? gsiVar.a() : null;
                return strA == null ? "" : strA;
            }

            @NotNull
            public String getGuid() {
                return "";
            }

            @NotNull
            public String getOuid() {
                gsi gsiVar = deviceIds;
                String strB2 = gsiVar != null ? gsiVar.b() : null;
                return strB2 == null ? "" : strB2;
            }
        };
        HLogConfigHelper hLogConfigHelper = HLogConfigHelper.INSTANCE;
        int logExpireDays$utrace_sdk_log_logRelease = hLogConfigHelper.getLogExpireDays$utrace_sdk_log_logRelease();
        long maxLogFileSizeMB$utrace_sdk_log_logRelease = (long) hLogConfigHelper.getMaxLogFileSizeMB$utrace_sdk_log_logRelease();
        long maxLogFileTotalMB$utrace_sdk_log_logRelease = (long) hLogConfigHelper.getMaxLogFileTotalMB$utrace_sdk_log_logRelease();
        try {
            Result.Companion companion = Result.Companion;
            j = maxLogFileTotalMB$utrace_sdk_log_logRelease;
            try {
                Settings settingsBuild = new Settings.Builder(context, HLogConst.HLOG_BUSINESS_NAME, "2013", "GSzWOMibB8fp00EYG19FGGwixN9EJJS9", iImeiProvider, iOpenIdProvider).setDebug(UTraceApp.INSTANCE.getSetHLogDebug$utrace_sdk_log_logRelease()).fileLogLevel(3).consoleLogLevel(6).fileExpireDays(logExpireDays$utrace_sdk_log_logRelease).logNamePrefix(str2 + '_' + str + '_').setNetAvailable(new INetAvailable() { // from class: com.oplus.utrace.hlog.q
                    public final boolean isNetworkAvailable() {
                        return HLogUtils.buildLogger$lambda$12$lambda$10(context);
                    }
                }).build(context);
                settingsBuild.setPath(logFilePath);
                settingsBuild.setUploadPath(logFilePath);
                settingsBuild.setCacheDir(defaultLogCachePath(context) + File.separator + str);
                Logger logger = new Logger();
                logger.init(settingsBuild);
                obj = Result.constructor-impl(logger);
            } catch (Throwable th) {
                th = th;
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
        } catch (Throwable th2) {
            th = th2;
            j = maxLogFileTotalMB$utrace_sdk_log_logRelease;
        }
        Throwable th3 = Result.exceptionOrNull-impl(obj);
        if (th3 != null) {
            Logs.INSTANCE.w(TAG, INSTANCE.getLogPrefix() + " buildLogger() exception=" + th3, th3);
        }
        Logger logger2 = (Logger) (Result.isFailure-impl(obj) ? null : obj);
        Logs.INSTANCE.i(TAG, INSTANCE.getLogPrefix() + " buildLogger() logger=" + logger2 + " setHLogDebug=" + UTraceApp.INSTANCE.getSetHLogDebug$utrace_sdk_log_logRelease() + " logExpireDays=" + logExpireDays$utrace_sdk_log_logRelease + " maxLogFileSizeMB=" + maxLogFileSizeMB$utrace_sdk_log_logRelease + " maxLogFileTotalMB=" + j);
        return logger2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean buildLogger$lambda$12$lambda$10(Context context) {
        Intrinsics.checkNotNullParameter(context, "$context");
        return isNeedNetAvailable(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String buildLogger$lambda$9() {
        return "";
    }

    @JvmStatic
    @NotNull
    public static final String defaultLogCachePath(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return defaultLogPath(context) + File.separator + "cache";
    }

    @JvmStatic
    @NotNull
    public static final String defaultLogPath(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getFilesDir() + File.separator + BuildConfig.FLAVOR;
    }

    @JvmStatic
    @NotNull
    public static final String defaultLogUploadPath(@NotNull Context context, long traceId) {
        Intrinsics.checkNotNullParameter(context, "context");
        StringBuilder sb = new StringBuilder();
        sb.append(defaultLogPath(context));
        String str = File.separator;
        sb.append(str);
        sb.append("upload");
        sb.append(str);
        sb.append(traceId);
        return sb.toString();
    }

    @JvmStatic
    @SuppressLint({"DiscouragedPrivateApi"})
    public static final void ensureLibraryDirectories$utrace_sdk_log_logRelease() {
        Object obj;
        Object obj2;
        boolean andSet = libDirEnsured.getAndSet(true);
        Logs logs = Logs.INSTANCE;
        StringBuilder sb = new StringBuilder();
        HLogUtils hLogUtils = INSTANCE;
        sb.append(hLogUtils.getLogPrefix());
        sb.append(" ensureLibraryDirectories() libDirEnsured=");
        sb.append(andSet);
        logs.d(TAG, sb.toString());
        if (andSet) {
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            ClassLoader classLoader = hLogUtils.getClass().getClassLoader();
            logs.d(TAG, hLogUtils.getLogPrefix() + " ensureLibraryDirectories() classLoader=" + classLoader);
            Field declaredField = BaseDexClassLoader.class.getDeclaredField("pathList");
            declaredField.setAccessible(true);
            Object obj3 = declaredField.get(classLoader);
            String firstDexFileNameFromPathList = UtilsKt.getFirstDexFileNameFromPathList(obj3);
            logs.d(TAG, hLogUtils.getLogPrefix() + " ensureLibraryDirectories() firstDexFileName=" + firstDexFileNameFromPathList);
            if (firstDexFileNameFromPathList == null || firstDexFileNameFromPathList.length() == 0) {
                return;
            }
            Method declaredMethod = obj3.getClass().getDeclaredMethod("addNativePath", Collection.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(obj3, CollectionsKt.listOf(firstDexFileNameFromPathList + "!/lib/arm64-v8a"));
            Field declaredField2 = obj3.getClass().getDeclaredField("nativeLibraryPathElements");
            declaredField2.setAccessible(true);
            Object obj4 = declaredField2.get(obj3);
            logs.i(TAG, hLogUtils.getLogPrefix() + " ensureLibraryDirectories() nativeLibraryPathElements(after)=" + ArraysKt.contentDeepToString(obj4 instanceof Object[] ? (Object[]) obj4 : null));
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logs.INSTANCE.w(TAG, INSTANCE.getLogPrefix() + " ensureLibraryDirectories() exception=" + th2.getMessage(), th2);
        }
        Logs logs2 = Logs.INSTANCE;
        if (logs2.getDebuggable()) {
            HLogUtils hLogUtils2 = INSTANCE;
            try {
                System.loadLibrary(HLOG_SO_NAME);
                logs2.d(TAG, hLogUtils2.getLogPrefix() + " ensureLibraryDirectories() try load heytaplog ok");
                obj2 = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(th3));
            }
            Throwable th4 = Result.exceptionOrNull-impl(obj2);
            if (th4 != null) {
                Logs.INSTANCE.d(TAG, INSTANCE.getLogPrefix() + " ensureLibraryDirectories() try load heytaplog fails: " + th4.getMessage(), th4);
            }
        }
    }

    @JvmStatic
    @NotNull
    public static final String extractFileTimeFromDogFile$utrace_sdk_log_logRelease(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        List listSplit$default = StringsKt.split$default((CharSequence) StringsKt.split$default(name, new String[]{d14.POINT_REGEX}, false, 0, 6, (Object) null).get(0), new String[]{"_"}, false, 0, 6, (Object) null);
        int size = listSplit$default.size();
        return ((String) listSplit$default.get(size - 4)) + '-' + ((String) listSplit$default.get(size - 3)) + '-' + ((String) listSplit$default.get(size - 2)) + '-' + ((String) listSplit$default.get(size - 1));
    }

    @JvmStatic
    @SuppressLint({"SimpleDateFormat"})
    @NotNull
    public static final SimpleDateFormat getLogFileTimeFormat$utrace_sdk_log_logRelease() {
        return new SimpleDateFormat("yyyy-MM-dd-HH");
    }

    private final String getLogPrefix() {
        return (String) logPrefix$delegate.getValue();
    }

    @JvmStatic
    public static final boolean isInPlugin() {
        Context applicationContext;
        if (isPlugin == null) {
            Context context = UTraceApp.mContext;
            ClassLoader classLoader = (context == null || (applicationContext = context.getApplicationContext()) == null) ? null : applicationContext.getClass().getClassLoader();
            ClassLoader classLoader2 = HLogUtils.class.getClassLoader();
            if (classLoader != null) {
                isPlugin = Boolean.valueOf(!classLoader.equals(classLoader2));
            }
            Logs.INSTANCE.d(TAG, INSTANCE.getLogPrefix() + " isInPlugin() isPlugin=" + isPlugin + " myLoader=" + classLoader2 + " appLoader=" + classLoader);
        }
        return Intrinsics.areEqual(isPlugin, Boolean.TRUE);
    }

    @JvmStatic
    private static final boolean isNeedNetAvailable(Context context) {
        String packageName = context.getPackageName();
        boolean z = !ArraysKt.contains(PackageNames.INSTANCE.getKEY_NEED_PROXY_APP(), packageName) && UtilsKt.isMainProcess(context);
        Logs.INSTANCE.d(TAG, "isNeedNetAvailable===name==" + packageName + "===ret=" + z);
        return z;
    }

    @JvmStatic
    public static final boolean resolveReceiver(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (canResolveReceiver == null) {
            List<ResolveInfo> listResolveReceivers = resolveReceivers(context);
            Logs logs = Logs.INSTANCE;
            if (logs.getDebuggable()) {
                logs.d(TAG, INSTANCE.getLogPrefix() + " resolveReceiver() resolvedList=" + listResolveReceivers);
            }
            canResolveReceiver = Boolean.valueOf(!listResolveReceivers.isEmpty());
        }
        return Intrinsics.areEqual(canResolveReceiver, Boolean.TRUE);
    }

    @JvmStatic
    private static final List<ResolveInfo> resolveReceivers(Context context) {
        Object obj;
        Intent intent = new Intent(HLogConst.PUSH_TO_UPLOAD_ACTION);
        intent.setPackage(context.getPackageName());
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().queryBroadcastReceivers(intent, PackageManager.ResolveInfoFlags.of(128L)) : context.getPackageManager().queryBroadcastReceivers(intent, 128));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logs.INSTANCE.d(TAG, INSTANCE.getLogPrefix() + " resolveReceivers() exception=" + th2.getMessage(), th2);
        }
        if (Result.isFailure-impl(obj)) {
            obj = null;
        }
        List<ResolveInfo> list = (List) obj;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @NotNull
    public final String[] getDOG_EXT$utrace_sdk_log_logRelease() {
        return DOG_EXT;
    }

    @NotNull
    public final Map<String, UploadFlag> getDefaultUploadFlags$utrace_sdk_log_logRelease() {
        return defaultUploadFlags;
    }

    @Nullable
    public final SafeHandlerThread getThread$utrace_sdk_log_logRelease() {
        return (SafeHandlerThread) thread$delegate.getValue();
    }
}
