package com.oplus.utrace.hlog;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import androidx.annotation.VisibleForTesting;
import com.oplus.aiunit.vision.d14;
import com.oplus.aiunit.vision.gsi;
import com.oplus.utrace.lib.ConstValuesKt;
import com.oplus.utrace.lib.HLogConst;
import com.oplus.utrace.lib.SdkConfigConst;
import com.oplus.utrace.lib.SdkConfigData;
import com.oplus.utrace.sdk.IULogger;
import com.oplus.utrace.sdk.ULog;
import com.oplus.utrace.sdk.UTraceApp;
import com.oplus.utrace.sdk.internal.ISdkConfigListener;
import com.oplus.utrace.sdk.internal.SdkConfig;
import com.oplus.utrace.utils.Logs;
import com.oplus.utrace.utils.Providers;
import com.oplus.utrace.utils.SafeHandlerThread;
import com.oplus.utrace.utils.SharedPreferencesUtil;
import com.oplus.utrace.utils.TraceUtil;
import java.io.File;
import java.io.FileFilter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0011*\u0001M\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\\\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\"\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0019\u0010\u001a\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u001d\u001a\u00020\u0002J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000eH\u0007J\b\u0010 \u001a\u00020\u0002H\u0016R\u0014\u0010!\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010$\u001a\u00020#8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010,R\u0014\u0010.\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u0010/\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010,R\u0014\u00100\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010,R\u0014\u00103\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010,R\u0014\u00104\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u00101R\u0014\u00105\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u0010\"R\u0014\u00106\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u0010\"R$\u00108\u001a\u0004\u0018\u0001078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R*\u0010?\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u00078\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001b\u0010I\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0016\u0010K\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001b\u0010Q\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010F\u001a\u0004\bO\u0010PR\u0014\u0010T\u001a\u00020J8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010W\u001a\u00020*8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010Y\u001a\u00020*8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bX\u0010VR\u0014\u0010[\u001a\u00020*8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010V¨\u0006]"}, d2 = {"Lcom/oplus/utrace/hlog/HLogConfigHelper;", "Lcom/oplus/utrace/sdk/internal/ISdkConfigListener;", "", "delayQueryConfig", "Landroid/content/Context;", "context", "doQueryHLogConfig", "Lcom/oplus/utrace/lib/SdkConfigData$HLogCtrl;", "newCtrl", "handlerHLogConfig", "queryLogConfigBySetting", "queryLogConfigByProvider", "initHLog", "releaseHLog", "", "folderPath", "", "Lkotlin/Pair;", "Ljava/io/File;", "", "visitLogFolder", "checkLogFiles", "getHLogConfigInfo", "now", "getDelayTime$utrace_sdk_log_logRelease", "(J)J", "getDelayTime", "loadHLogConfigFromSp", "queryHLogConfig", "release", "moduleName", "handleModuleName", "onSdkConfigChange", "TAG", "Ljava/lang/String;", "Lkotlin/ranges/LongRange;", "DELAY_RANGE", "Lkotlin/ranges/LongRange;", "getDELAY_RANGE$utrace_sdk_log_logRelease", "()Lkotlin/ranges/LongRange;", "getDELAY_RANGE$utrace_sdk_log_logRelease$annotations", "()V", "", "MSG_START_QUERY_CONFIG", "I", "MSG_SCHED_NEXT_QUERY", "MSG_CHECK_FILES", "MSG_SDKCONFIG_CHANGED", "DELAY_SDKCONFIG_CHANGED", "J", "CHECK_FILES_DEF_PRINT_CNT", "CHECK_FILES_MAX_PRINT_CNT", "DELAY_CHECK_FILES", "KEY_HLOG_CTRL", "KEY_HLOG_CLOUD_CONFIG", "Lcom/oplus/aiunit/vision/gsi;", "deviceIds", "Lcom/oplus/aiunit/vision/gsi;", "getDeviceIds$utrace_sdk_log_logRelease", "()Lcom/oplus/aiunit/vision/gsi;", "setDeviceIds$utrace_sdk_log_logRelease", "(Lcom/oplus/aiunit/vision/gsi;)V", "rhs", "localHLogCtrl", "Lcom/oplus/utrace/lib/SdkConfigData$HLogCtrl;", "getLocalHLogCtrl$utrace_sdk_log_logRelease", "()Lcom/oplus/utrace/lib/SdkConfigData$HLogCtrl;", "setLocalHLogCtrl", "(Lcom/oplus/utrace/lib/SdkConfigData$HLogCtrl;)V", "logPrefix$delegate", "Lkotlin/Lazy;", "getLogPrefix", "()Ljava/lang/String;", "logPrefix", "", "running", "Z", "com/oplus/utrace/hlog/HLogConfigHelper$handler$2$1", "handler$delegate", "getHandler", "()Lcom/oplus/utrace/hlog/HLogConfigHelper$handler$2$1;", "handler", "isLogEnabled$utrace_sdk_log_logRelease", "()Z", "isLogEnabled", "getLogExpireDays$utrace_sdk_log_logRelease", "()I", "logExpireDays", "getMaxLogFileTotalMB$utrace_sdk_log_logRelease", "maxLogFileTotalMB", "getMaxLogFileSizeMB$utrace_sdk_log_logRelease", "maxLogFileSizeMB", "<init>", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHLogConfigHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HLogConfigHelper.kt\ncom/oplus/utrace/hlog/HLogConfigHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,371:1\n1#2:372\n11335#3:373\n11670#3,3:374\n12744#3,2:377\n*S KotlinDebug\n*F\n+ 1 HLogConfigHelper.kt\ncom/oplus/utrace/hlog/HLogConfigHelper\n*L\n294#1:373\n294#1:374,3\n293#1:377,2\n*E\n"})
public final class HLogConfigHelper implements ISdkConfigListener {
    private static final int CHECK_FILES_DEF_PRINT_CNT = 10;
    private static final int CHECK_FILES_MAX_PRINT_CNT = 24;
    private static final long DELAY_CHECK_FILES = 300000;
    private static final long DELAY_SDKCONFIG_CHANGED = 500;

    @NotNull
    private static final String KEY_HLOG_CLOUD_CONFIG = "utrace_hlog_config_cloud";

    @NotNull
    private static final String KEY_HLOG_CTRL = "key_hlog_ctrl_cache";
    private static final int MSG_CHECK_FILES = 103;
    private static final int MSG_SCHED_NEXT_QUERY = 102;
    private static final int MSG_SDKCONFIG_CHANGED = 104;
    private static final int MSG_START_QUERY_CONFIG = 101;

    @NotNull
    private static final String TAG = "UTrace.Sdk.HLogConfigHelper";

    @Nullable
    private static gsi deviceIds;

    @NotNull
    public static final HLogConfigHelper INSTANCE = new HLogConfigHelper();

    @NotNull
    private static final LongRange DELAY_RANGE = new LongRange(2700000, 3300000);

    @NotNull
    private static SdkConfigData.HLogCtrl localHLogCtrl = new SdkConfigData.HLogCtrl(false, 0, 0, 0, false, 0, 63, null);

    @NotNull
    private static final Lazy logPrefix$delegate = LazyKt.lazy(new Function0<String>() { // from class: com.oplus.utrace.hlog.HLogConfigHelper$logPrefix$2
        @NotNull
        public final String invoke() {
            return TraceUtil.generateLogPrefix$utrace_sdk_log_logRelease$default(null, 1, null);
        }
    });
    private static volatile boolean running = true;

    @NotNull
    private static final Lazy handler$delegate = LazyKt.lazy(new Function0<HLogConfigHelper$handler$2.1>() { // from class: com.oplus.utrace.hlog.HLogConfigHelper$handler$2
        /* JADX WARN: Type inference failed for: r0v0, types: [com.oplus.utrace.hlog.HLogConfigHelper$handler$2$1] */
        @NotNull
        public final 1 invoke() {
            Looper mainLooper;
            SafeHandlerThread commonThread = TraceUtil.INSTANCE.getCommonThread();
            if (commonThread == null || (mainLooper = commonThread.getLooper()) == null) {
                mainLooper = Looper.getMainLooper();
            }
            return new Handler(mainLooper) { // from class: com.oplus.utrace.hlog.HLogConfigHelper$handler$2.1
                @Override // android.os.Handler
                public void handleMessage(@NotNull Message msg) {
                    Intrinsics.checkNotNullParameter(msg, "msg");
                    switch (msg.what) {
                        case 101:
                        case 102:
                        case 104:
                            Context context = UTraceApp.mContext;
                            if (context != null) {
                                HLogConfigHelper.INSTANCE.doQueryHLogConfig(context);
                            }
                            break;
                        case 103:
                            Context context2 = UTraceApp.mContext;
                            if (context2 != null) {
                                HLogConfigHelper.INSTANCE.checkLogFiles(context2);
                            }
                            break;
                    }
                }
            };
        }
    });

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nHLogConfigHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HLogConfigHelper.kt\ncom/oplus/utrace/hlog/HLogConfigHelper$checkLogFiles$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,371:1\n1#2:372\n1549#3:373\n1620#3,3:374\n777#3:377\n788#3:378\n1864#3,2:379\n789#3,2:381\n1866#3:383\n791#3:384\n*S KotlinDebug\n*F\n+ 1 HLogConfigHelper.kt\ncom/oplus/utrace/hlog/HLogConfigHelper$checkLogFiles$1\n*L\n320#1:373\n320#1:374,3\n330#1:377\n330#1:378\n330#1:379,2\n330#1:381,2\n330#1:383\n330#1:384\n*E\n"})
    public static final class 1 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$5$lambda$2(Function2 function2, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(function2, "$tmp0");
            return ((Number) function2.invoke(obj, obj2)).intValue();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return Unit.INSTANCE;
        }

        public final void invoke() {
            Object obj;
            HLogConfigHelper hLogConfigHelper = HLogConfigHelper.INSTANCE;
            Context context = this.$context;
            try {
                Result.Companion companion = Result.Companion;
                List listVisitLogFolder = hLogConfigHelper.visitLogFolder(HLogUtils.defaultLogPath(context));
                if (listVisitLogFolder.isEmpty()) {
                    Logs.INSTANCE.i(HLogConfigHelper.TAG, hLogConfigHelper.getLogPrefix() + " checkLogFiles() no log files");
                } else {
                    int size = listVisitLogFolder.size();
                    Iterator it = listVisitLogFolder.iterator();
                    long jLongValue = 0;
                    while (it.hasNext()) {
                        jLongValue += ((Number) ((Pair) it.next()).getSecond()).longValue();
                    }
                    List<Pair> list = listVisitLogFolder;
                    int i = 10;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (Pair pair : list) {
                        arrayList.add(new Triple(pair.getFirst(), pair.getSecond(), HLogUtils.extractFileTimeFromDogFile$utrace_sdk_log_logRelease((File) pair.getFirst())));
                    }
                    final HLogConfigHelper$checkLogFiles$1$1$sortedFiles$2 hLogConfigHelper$checkLogFiles$1$1$sortedFiles$2 = new Function2<Triple<? extends File, ? extends Long, ? extends String>, Triple<? extends File, ? extends Long, ? extends String>, Integer>() { // from class: com.oplus.utrace.hlog.HLogConfigHelper$checkLogFiles$1$1$sortedFiles$2
                        @NotNull
                        public final Integer invoke(Triple<? extends File, Long, String> triple, Triple<? extends File, Long, String> triple2) {
                            return Integer.valueOf(((String) triple.getThird()).compareTo((String) triple2.getThird()));
                        }
                    };
                    List listSortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.oplus.utrace.hlog.c
                        @Override // java.util.Comparator
                        public final int compare(Object obj2, Object obj3) {
                            return HLogConfigHelper.1.invoke$lambda$5$lambda$2(hLogConfigHelper$checkLogFiles$1$1$sortedFiles$2, obj2, obj3);
                        }
                    });
                    SimpleDateFormat logFileTimeFormat$utrace_sdk_log_logRelease = HLogUtils.getLogFileTimeFormat$utrace_sdk_log_logRelease();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String str = logFileTimeFormat$utrace_sdk_log_logRelease.format(new Date(jCurrentTimeMillis - ConstValuesKt.HOUR));
                    String str2 = logFileTimeFormat$utrace_sdk_log_logRelease.format(new Date(jCurrentTimeMillis));
                    List arrayList2 = new ArrayList();
                    int i2 = 0;
                    for (Object obj2 : listSortedWith) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        Triple triple = (Triple) obj2;
                        if (i2 < i || i2 >= size + (-10) || Intrinsics.areEqual(triple.getThird(), str2) || Intrinsics.areEqual(triple.getThird(), str)) {
                            arrayList2.add(obj2);
                        }
                        i2 = i3;
                        i = 10;
                    }
                    if (arrayList2.size() > 24) {
                        arrayList2 = arrayList2.subList(arrayList2.size() - 24, arrayList2.size());
                    }
                    String strJoinToString$default = CollectionsKt.joinToString$default(arrayList2, d14.COMMA_REGEX, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1<Triple<? extends File, ? extends Long, ? extends String>, CharSequence>() { // from class: com.oplus.utrace.hlog.HLogConfigHelper$checkLogFiles$1$1$recentFiles$3
                        @NotNull
                        public final CharSequence invoke(@NotNull Triple<? extends File, Long, String> triple2) {
                            Intrinsics.checkNotNullParameter(triple2, "it");
                            return '(' + ((File) triple2.getFirst()).getName() + ',' + ((Number) triple2.getSecond()).longValue() + ')';
                        }
                    }, 30, (Object) null);
                    Logs.INSTANCE.i(HLogConfigHelper.TAG, hLogConfigHelper.getLogPrefix() + " checkLogFiles() totalSize=" + jLongValue + '(' + (jLongValue / ConstValuesKt.MB) + "MB) logFiles.size=" + size + " recentFiles={" + strJoinToString$default + '}');
                }
                obj = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                Logs.INSTANCE.w(HLogConfigHelper.TAG, HLogConfigHelper.INSTANCE.getLogPrefix() + " checkLogFiles() exception=" + th2, th2);
            }
            HLogConfigHelper.INSTANCE.getHandler().sendEmptyMessageDelayed(103, ConstValuesKt.HOUR);
        }
    }

    private HLogConfigHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkLogFiles(Context context) {
        TraceUtil.runSafeThread$utrace_sdk_log_logRelease(new 1(context));
    }

    private final void delayQueryConfig() {
        if (!running) {
            Logs.INSTANCE.i(TAG, getLogPrefix() + " delayQueryConfig() running=false");
            return;
        }
        Logs.INSTANCE.i(TAG, getLogPrefix() + " delayQueryConfig() sendEmptyMessageDelayed what = MSG_SCHED_NEXT_QUERY,delayMillis = HOUR");
        getHandler().removeMessages(104);
        getHandler().removeMessages(102);
        getHandler().sendEmptyMessageDelayed(102, ConstValuesKt.HOUR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doQueryHLogConfig(final Context context) {
        Handler handler;
        Logs.INSTANCE.d(TAG, getLogPrefix() + " doQueryHLogConfig() context=" + context);
        SafeHandlerThread thread$utrace_sdk_log_logRelease = HLogUtils.INSTANCE.getThread$utrace_sdk_log_logRelease();
        if (thread$utrace_sdk_log_logRelease != null && (handler = thread$utrace_sdk_log_logRelease.getHandler()) != null) {
            handler.post(new Runnable() { // from class: com.oplus.utrace.hlog.b
                @Override // java.lang.Runnable
                public final void run() {
                    HLogConfigHelper.doQueryHLogConfig$lambda$6(context);
                }
            });
        }
        delayQueryConfig();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doQueryHLogConfig$lambda$6(Context context) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "$context");
        HLogConfigHelper hLogConfigHelper = INSTANCE;
        SdkConfigData.HLogCtrl hLogCtrlQueryLogConfigBySetting = hLogConfigHelper.queryLogConfigBySetting(context);
        if (hLogCtrlQueryLogConfigBySetting != null && hLogCtrlQueryLogConfigBySetting.getHlogEnv() != -1 && localHLogCtrl.getHlogEnv() == hLogCtrlQueryLogConfigBySetting.getHlogEnv()) {
            hLogConfigHelper.handlerHLogConfig(hLogCtrlQueryLogConfigBySetting);
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            if (running) {
                SdkConfigData.HLogCtrl hLogCtrl = SdkConfig.INSTANCE.getHLogCtrl();
                if (hLogCtrl == null) {
                    hLogCtrl = hLogConfigHelper.queryLogConfigByProvider(context);
                }
                if (hLogCtrl != null) {
                    hLogConfigHelper.handlerHLogConfig(hLogCtrl);
                } else {
                    Logs.INSTANCE.i(TAG, hLogConfigHelper.getLogPrefix() + " doQueryHLogConfig() can't query log config");
                    Unit unit = Unit.INSTANCE;
                }
            } else {
                Logs.INSTANCE.i(TAG, hLogConfigHelper.getLogPrefix() + " doQueryHLogConfig() running=false #2");
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logs.INSTANCE.e(TAG, INSTANCE.getLogPrefix() + " doQueryHLogConfig error: " + th2.getMessage());
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getDELAY_RANGE$utrace_sdk_log_logRelease$annotations() {
    }

    public static /* synthetic */ long getDelayTime$utrace_sdk_log_logRelease$default(HLogConfigHelper hLogConfigHelper, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = System.currentTimeMillis();
        }
        return hLogConfigHelper.getDelayTime$utrace_sdk_log_logRelease(j);
    }

    private final String getHLogConfigInfo(Context context) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            if (context != null) {
                String string = Settings.Secure.getString(context.getContentResolver(), KEY_HLOG_CLOUD_CONFIG);
                Logs.INSTANCE.i(TAG, "getHLogConfigInfo data=" + string);
                return string;
            }
            obj = Result.constructor-impl((Object) null);
            Throwable th = Result.exceptionOrNull-impl(obj);
            if (th != null) {
                Logs.INSTANCE.e(TAG, "getHLogConfigInfo fail result=" + th);
            }
            return null;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HLogConfigHelper$handler$2.1 getHandler() {
        return (HLogConfigHelper$handler$2.1) handler$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getLogPrefix() {
        return (String) logPrefix$delegate.getValue();
    }

    private final void handlerHLogConfig(SdkConfigData.HLogCtrl newCtrl) {
        boolean z = false;
        boolean z2 = newCtrl.getLogEnabledV2() != localHLogCtrl.getLogEnabledV2();
        boolean z3 = newCtrl.getExpireDaysV2() != localHLogCtrl.getExpireDaysV2();
        Logs logs = Logs.INSTANCE;
        StringBuilder sb = new StringBuilder();
        sb.append(getLogPrefix());
        sb.append(" doQueryHLogConfig() result=");
        sb.append(newCtrl);
        sb.append(" enableChanged=");
        sb.append(z2);
        sb.append(" hlog=");
        ULog uLog = ULog.INSTANCE;
        sb.append(uLog.getMLogger$utrace_sdk_log_logRelease());
        sb.append(" expireChanged=");
        sb.append(z3);
        logs.i(TAG, sb.toString());
        setLocalHLogCtrl(newCtrl);
        SharedPreferencesUtil.putString(KEY_HLOG_CTRL, localHLogCtrl.toJsonString(), true);
        if (z2) {
            if (localHLogCtrl.getLogEnabledV2()) {
                initHLog();
                return;
            } else {
                releaseHLog();
                return;
            }
        }
        if (localHLogCtrl.getLogEnabledV2()) {
            if (!z3) {
                IULogger mLogger$utrace_sdk_log_logRelease = uLog.getMLogger$utrace_sdk_log_logRelease();
                if (mLogger$utrace_sdk_log_logRelease != null && mLogger$utrace_sdk_log_logRelease.available()) {
                    z = true;
                }
                if (z) {
                    return;
                }
            }
            initHLog();
        }
    }

    private final void initHLog() {
        Logs logs = Logs.INSTANCE;
        StringBuilder sb = new StringBuilder();
        sb.append(getLogPrefix());
        sb.append(" initHLog() enter. logger=");
        ULog uLog = ULog.INSTANCE;
        sb.append(uLog.getMLogger$utrace_sdk_log_logRelease());
        logs.d(TAG, sb.toString());
        ULog.releaseLogger$utrace_sdk_log_logRelease();
        Context context = UTraceApp.mContext;
        uLog.setMLogger$utrace_sdk_log_logRelease(context != null ? new ULoggerImpl(context) : null);
        logs.d(TAG, getLogPrefix() + " initHLog() exit. logger=" + uLog.getMLogger$utrace_sdk_log_logRelease());
    }

    private final SdkConfigData.HLogCtrl queryLogConfigByProvider(Context context) {
        Providers providers = Providers.INSTANCE;
        Bundle bundle = new Bundle();
        bundle.putString(HLogConst.KEY_MODULE_NAME, ArraysKt.joinToString$default(new String[]{context.getPackageName(), UTraceApp.moduleName}, d14.COMMA_REGEX, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        Iterator<T> it = INSTANCE.visitLogFolder(HLogUtils.defaultLogPath(context)).iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += ((Number) ((Pair) it.next()).getSecond()).longValue();
        }
        bundle.putLong("size", jLongValue);
        Logs logs = Logs.INSTANCE;
        StringBuilder sb = new StringBuilder();
        HLogConfigHelper hLogConfigHelper = INSTANCE;
        sb.append(hLogConfigHelper.getLogPrefix());
        sb.append(" queryLogConfigByProvider() extras=");
        sb.append(bundle);
        logs.d(TAG, sb.toString());
        Unit unit = Unit.INSTANCE;
        Bundle bundleCallCoreProvider = providers.callCoreProvider(context, HLogConst.METHOD_GET_LOG_CONFIG, bundle);
        if (logs.getDebuggable()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(hLogConfigHelper.getLogPrefix());
            sb2.append(" queryLogConfigByProvider() result=(");
            sb2.append(bundleCallCoreProvider != null ? Integer.valueOf(bundleCallCoreProvider.size()) : null);
            sb2.append(')');
            sb2.append(bundleCallCoreProvider);
            logs.d(TAG, sb2.toString());
        }
        if (bundleCallCoreProvider == null) {
            return null;
        }
        if (!(!bundleCallCoreProvider.isEmpty())) {
            bundleCallCoreProvider = null;
        }
        if (bundleCallCoreProvider == null) {
            return null;
        }
        if (!(!bundleCallCoreProvider.containsKey(SdkConfigConst.KEY_IS_VALID) || bundleCallCoreProvider.getBoolean(SdkConfigConst.KEY_IS_VALID, false))) {
            bundleCallCoreProvider = null;
        }
        if (bundleCallCoreProvider == null) {
            return null;
        }
        boolean z = bundleCallCoreProvider.getBoolean(HLogConst.KEY_LOG_ENABLED, false);
        boolean z2 = bundleCallCoreProvider.getBoolean(HLogConst.KEY_LOG_ENABLED_V2, z);
        Integer numValueOf = Integer.valueOf(bundleCallCoreProvider.getInt(HLogConst.KEY_LOG_EXPIRE_DAYS, 0));
        if (!(numValueOf.intValue() > 0)) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 7;
        Integer numValueOf2 = Integer.valueOf(bundleCallCoreProvider.getInt(HLogConst.KEY_LOG_EXPIRE_DAYS_V2, iIntValue));
        if (!(numValueOf2.intValue() > 0)) {
            numValueOf2 = null;
        }
        int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 7;
        Integer numValueOf3 = Integer.valueOf(bundleCallCoreProvider.getInt(HLogConst.KEY_MAX_LOG_FILES_MB, 0));
        Integer num = numValueOf3.intValue() > 0 ? numValueOf3 : null;
        int iIntValue3 = num != null ? num.intValue() : 500;
        int i = bundleCallCoreProvider.getInt(HLogConst.KEY_HLOG_CONFIG_ENV, -1);
        SdkConfigData.HLogCtrl hLogCtrl = new SdkConfigData.HLogCtrl(z, iIntValue, iIntValue3, 0, z2, iIntValue2, 8, null);
        hLogCtrl.setHlogEnv(i);
        return hLogCtrl;
    }

    private final SdkConfigData.HLogCtrl queryLogConfigBySetting(Context context) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            JSONObject jSONObject = new JSONObject(INSTANCE.getHLogConfigInfo(context));
            boolean zOptBoolean = jSONObject.optBoolean(HLogConst.KEY_LOG_ENABLED);
            boolean zOptBoolean2 = jSONObject.optBoolean(HLogConst.KEY_LOG_ENABLED_V2);
            Integer numValueOf = Integer.valueOf(jSONObject.optInt(HLogConst.KEY_LOG_EXPIRE_DAYS));
            boolean z = true;
            if (!(numValueOf.intValue() > 0)) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : 7;
            Integer numValueOf2 = Integer.valueOf(jSONObject.optInt(HLogConst.KEY_LOG_EXPIRE_DAYS_V2));
            if (!(numValueOf2.intValue() > 0)) {
                numValueOf2 = null;
            }
            int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 7;
            Integer numValueOf3 = Integer.valueOf(jSONObject.optInt(HLogConst.KEY_MAX_LOG_FILES_MB));
            if (numValueOf3.intValue() <= 0) {
                z = false;
            }
            if (!z) {
                numValueOf3 = null;
            }
            int iIntValue3 = numValueOf3 != null ? numValueOf3.intValue() : 500;
            int iOptInt = jSONObject.optInt(HLogConst.KEY_HLOG_CONFIG_ENV, -1);
            SdkConfigData.HLogCtrl hLogCtrl = new SdkConfigData.HLogCtrl(zOptBoolean, iIntValue, iIntValue3, 0, zOptBoolean2, iIntValue2, 8, null);
            hLogCtrl.setHlogEnv(iOptInt);
            obj = Result.constructor-impl(hLogCtrl);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logs.INSTANCE.i(TAG, INSTANCE.getLogPrefix() + " queryLogConfigBySetting() fail:" + th2.getMessage());
        }
        return null;
    }

    private final void releaseHLog() {
        Logs.INSTANCE.d(TAG, getLogPrefix() + " releaseHLog() logger=" + ULog.INSTANCE.getMLogger$utrace_sdk_log_logRelease());
        ULog.releaseLogger$utrace_sdk_log_logRelease();
    }

    private final void setLocalHLogCtrl(SdkConfigData.HLogCtrl hLogCtrl) {
        localHLogCtrl = hLogCtrl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Pair<File, Long>> visitLogFolder(String folderPath) {
        File[] fileArrListFiles;
        File file = new File(folderPath);
        if (!file.exists()) {
            file = null;
        }
        if (file == null || (fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.oplus.utrace.hlog.a
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return HLogConfigHelper.visitLogFolder$lambda$26(file2);
            }
        })) == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (File file2 : fileArrListFiles) {
            arrayList.add(TuplesKt.to(file2, Long.valueOf(file2.length())));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:18:? A[RETURN, SYNTHETIC] */
    public static final boolean visitLogFolder$lambda$26(File file) {
        boolean z;
        if (!file.isFile()) {
            return false;
        }
        for (String str : HLogUtils.INSTANCE.getDOG_EXT$utrace_sdk_log_logRelease()) {
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "file.name");
            if (StringsKt.endsWith$default(name, str, false, 2, (Object) null)) {
                z = true;
                if (z) {
                    return true;
                }
                return false;
            }
        }
        z = false;
        if (z) {
            return true;
        }
        return false;
    }

    @NotNull
    public final LongRange getDELAY_RANGE$utrace_sdk_log_logRelease() {
        return DELAY_RANGE;
    }

    @VisibleForTesting
    public final long getDelayTime$utrace_sdk_log_logRelease(long now) {
        long j = ((now + ConstValuesKt.HOUR) - SdkConfigData.TraceCacheMetrics.DEFAULT_DEV_TIME_OUT) - 1;
        return ((j - (j % ConstValuesKt.HOUR)) + RangesKt.random(DELAY_RANGE, Random.Default)) - now;
    }

    @Nullable
    public final gsi getDeviceIds$utrace_sdk_log_logRelease() {
        return deviceIds;
    }

    @NotNull
    public final SdkConfigData.HLogCtrl getLocalHLogCtrl$utrace_sdk_log_logRelease() {
        return localHLogCtrl;
    }

    public final int getLogExpireDays$utrace_sdk_log_logRelease() {
        return localHLogCtrl.getExpireDaysV2();
    }

    public final int getMaxLogFileSizeMB$utrace_sdk_log_logRelease() {
        return localHLogCtrl.getMaxLogFileSizeMB();
    }

    public final int getMaxLogFileTotalMB$utrace_sdk_log_logRelease() {
        return localHLogCtrl.getMaxLogFilesMB();
    }

    @VisibleForTesting
    @NotNull
    public final String handleModuleName(@NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        return (String) CollectionsKt.last(StringsKt.split$default(moduleName, new String[]{d14.POINT_REGEX}, false, 0, 6, (Object) null));
    }

    public final boolean isLogEnabled$utrace_sdk_log_logRelease() {
        return localHLogCtrl.getLogEnabledV2();
    }

    public final void loadHLogConfigFromSp(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SdkConfigData.HLogCtrl.Companion companion = SdkConfigData.HLogCtrl.INSTANCE;
        String string = SharedPreferencesUtil.getString(KEY_HLOG_CTRL);
        if (string == null) {
            string = "";
        }
        SdkConfigData.HLogCtrl hLogCtrlFromJsonString = companion.fromJsonString(string);
        if (hLogCtrlFromJsonString == null) {
            boolean z = SharedPreferencesUtil.getBoolean(HLogConst.KEY_LOG_ENABLED);
            int i = SharedPreferencesUtil.getInt(HLogConst.KEY_LOG_EXPIRE_DAYS);
            if (i <= 0) {
                i = 7;
            }
            int i2 = i;
            hLogCtrlFromJsonString = new SdkConfigData.HLogCtrl(z, i2, SharedPreferencesUtil.getInt(HLogConst.KEY_MAX_LOG_FILES_MB), 0, z, i2, 8, null);
        }
        setLocalHLogCtrl(hLogCtrlFromJsonString);
        Logs.INSTANCE.i(TAG, getLogPrefix() + " loadHLogConfigFromSp() hLogCtrl=" + localHLogCtrl);
    }

    @Override // com.oplus.utrace.sdk.internal.ISdkConfigListener
    public void onSdkConfigChange() {
        Logs logs = Logs.INSTANCE;
        if (logs.getDebuggable()) {
            logs.d(TAG, "onSdkConfigChange() running=" + running);
        }
        if (running) {
            getHandler().removeMessages(104);
            getHandler().sendEmptyMessageDelayed(104, DELAY_SDKCONFIG_CHANGED);
        }
    }

    public final void queryHLogConfig(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (context.getApplicationContext() != null) {
            Logs.INSTANCE.d(TAG, getLogPrefix() + " queryHLogConfig() call doQueryHLogConfig() now");
            doQueryHLogConfig(context);
        } else {
            Logs.INSTANCE.d(TAG, getLogPrefix() + " queryHLogConfig() send MSG_START_QUERY_CONFIG");
            getHandler().sendEmptyMessage(101);
        }
        SdkConfig.INSTANCE.setListener(this);
        getHandler().sendEmptyMessageDelayed(103, 300000L);
    }

    public final void release() {
        Logs.INSTANCE.i(TAG, getLogPrefix() + " release()");
        running = false;
        getHandler().removeMessages(101);
        getHandler().removeMessages(102);
        getHandler().removeMessages(104);
        getHandler().removeMessages(103);
    }

    public final void setDeviceIds$utrace_sdk_log_logRelease(@Nullable gsi gsiVar) {
        deviceIds = gsiVar;
    }
}
