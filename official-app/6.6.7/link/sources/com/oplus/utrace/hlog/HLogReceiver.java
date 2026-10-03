package com.oplus.utrace.hlog;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.util.LruCache;
import com.heytap.log.util.FileUtil;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.utrace.lib.HLogConst;
import com.oplus.utrace.sdk.IULogger;
import com.oplus.utrace.sdk.IUploadListener;
import com.oplus.utrace.sdk.ULog;
import com.oplus.utrace.sdk.UTraceApp;
import com.oplus.utrace.utils.Logs;
import com.oplus.utrace.utils.Providers;
import com.oplus.utrace.utils.SafeHandlerThread;
import com.oplus.utrace.utils.TraceUtil;
import com.oplus.utrace.utils.UtilsKt;
import com.oplusos.sau.common.utils.SauAarConstants;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.io.File;
import java.io.FilenameFilter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001a\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001c\u0010\r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u000fJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/oplus/utrace/hlog/HLogReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onActionUpload", "", "context", "Landroid/content/Context;", TraceConstants.KEY_ACTION, "Landroid/content/Intent;", "onActionUploadDirectUpload", "params", "Lcom/oplus/utrace/hlog/UploadParams;", "onActionUploadNeedProxy", "onReceive", "register", "register$utrace_sdk_log_logRelease", "unregister", "unregister$utrace_sdk_log_logRelease", "Companion", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHLogReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HLogReceiver.kt\ncom/oplus/utrace/hlog/HLogReceiver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,389:1\n1549#2:390\n1620#2,3:391\n1549#2:394\n1620#2,3:395\n1855#2,2:398\n1#3:400\n215#4,2:401\n*S KotlinDebug\n*F\n+ 1 HLogReceiver.kt\ncom/oplus/utrace/hlog/HLogReceiver\n*L\n281#1:390\n281#1:391,3\n342#1:394\n342#1:395,3\n353#1:398,2\n370#1:401,2\n*E\n"})
public final class HLogReceiver extends BroadcastReceiver {

    @NotNull
    private static final String TAG = "UTrace.Sdk.HLogReceiver";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static LruCache<String, UploadParams> receivedMessages = new LruCache<>(4);

    @NotNull
    private static final Lazy<String> logPrefix$delegate = LazyKt.lazy(new Function0<String>() { // from class: com.oplus.utrace.hlog.HLogReceiver$Companion$logPrefix$2
        @NotNull
        public final String invoke() {
            return TraceUtil.generateLogPrefix$utrace_sdk_log_logRelease(HLogReceiver.INSTANCE);
        }
    });

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UploadFlag.values().length];
            try {
                iArr[UploadFlag.NO_UPLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UploadFlag.CAN_UPLOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UploadFlag.NEED_PROXY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void onActionUpload(Context context, Intent intent) {
        UploadParams uploadParamsFrom = UploadParams.INSTANCE.from(intent);
        Logs logs = Logs.INSTANCE;
        StringBuilder sb = new StringBuilder();
        Companion companion = INSTANCE;
        sb.append(companion.getLogPrefix());
        sb.append(" onActionUpload() uploadParams=");
        sb.append(uploadParamsFrom);
        sb.append(" this=");
        sb.append(this);
        logs.i(TAG, sb.toString());
        HLogReporter pushData = new HLogReporter().setPushData(uploadParamsFrom.getPushData());
        uploadParamsFrom.setReporter(pushData);
        IHLogReporter reporter = uploadParamsFrom.getReporter();
        if (reporter != null) {
            reporter.report(IHLogReporter.Codes.Receiver_130005_onreceive, uploadParamsFrom.getPushData().getTracePkg() + " onReceive params=" + uploadParamsFrom);
        }
        boolean zIsLogEnabled$utrace_sdk_log_logRelease = HLogConfigHelper.INSTANCE.isLogEnabled$utrace_sdk_log_logRelease();
        logs.d(TAG, companion.getLogPrefix() + " onActionUpload() logEnabled:" + zIsLogEnabled$utrace_sdk_log_logRelease);
        if (!zIsLogEnabled$utrace_sdk_log_logRelease) {
            pushData.report(IHLogReporter.Codes.Receiver_130002_disabled, "isLogEnabled=false");
            return;
        }
        UploadParams uploadParams = receivedMessages.get(uploadParamsFrom.toKey());
        if (uploadParams != null) {
            if (!(SystemClock.elapsedRealtime() - uploadParams.getCreateTime() <= 1000)) {
                uploadParams = null;
            }
            if (uploadParams != null) {
                logs.d(TAG, companion.getLogPrefix() + " onActionUpload() duplicated upload message. previous=" + uploadParams);
                pushData.report(IHLogReporter.Codes.Receiver_130003_duplicated, "previously created " + (SystemClock.elapsedRealtime() - uploadParams.getCreateTime()) + "ms ago");
                return;
            }
        }
        receivedMessages.put(uploadParamsFrom.toKey(), uploadParamsFrom);
        int i = WhenMappings.$EnumSwitchMapping$0[uploadParamsFrom.getUploadFlag().ordinal()];
        if (i == 2) {
            onActionUploadDirectUpload(uploadParamsFrom);
        } else {
            if (i != 3) {
                return;
            }
            onActionUploadNeedProxy(context, uploadParamsFrom);
        }
    }

    private final void onActionUploadDirectUpload(final UploadParams params) {
        IULogger mLogger$utrace_sdk_log_logRelease = ULog.INSTANCE.getMLogger$utrace_sdk_log_logRelease();
        if (mLogger$utrace_sdk_log_logRelease == null) {
            Logs.INSTANCE.w(TAG, INSTANCE.getLogPrefix() + " onActionUpload() mLogger is null. this=" + this);
            IHLogReporter reporter = params.getReporter();
            if (reporter != null) {
                reporter.report(IHLogReporter.Codes.Receiver_130002_disabled, "logger==null");
                return;
            }
            return;
        }
        Companion companion = INSTANCE;
        Pair logFiles = companion.getLogFiles(params);
        List<? extends File> list = (List) logFiles.component1();
        String str = (String) logFiles.component2();
        Logs logs = Logs.INSTANCE;
        if (logs.getDebuggable()) {
            StringBuilder sb = new StringBuilder();
            sb.append(companion.getLogPrefix());
            sb.append(" onActionUploadDirectUpload() files=");
            List<? extends File> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((File) it.next()).getName());
            }
            sb.append(arrayList);
            sb.append(" msg=");
            sb.append(str);
            logs.d(TAG, sb.toString());
        }
        IHLogReporter reporter2 = params.getReporter();
        if (reporter2 != null) {
            reporter2.setLogFiles(list);
        }
        Logs.INSTANCE.i(TAG, INSTANCE.getLogPrefix() + " 通过广播收集日志，开始发起日志上传，onActionUpload() invoke logger.upload() with uploadParams=" + params + " this=" + this);
        mLogger$utrace_sdk_log_logRelease.upload(params.getPushData().getRawContent(), new IUploadListener() { // from class: com.oplus.utrace.hlog.HLogReceiver.onActionUploadDirectUpload.2
            @Override // com.oplus.utrace.sdk.IUploadListener
            public void onUploadFail(@NotNull String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                IHLogReporter reporter3 = params.getReporter();
                if (reporter3 != null) {
                    reporter3.report(IHLogReporter.Codes.Receiver_130004_upload_fail, message);
                }
            }

            @Override // com.oplus.utrace.sdk.IUploadListener
            public void onUploadSuccess(@NotNull String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                IHLogReporter reporter3 = params.getReporter();
                if (reporter3 != null) {
                    reporter3.report(IHLogReporter.Codes.Receiver_130000_upload_succ, message);
                }
            }
        });
    }

    private final void onActionUploadNeedProxy(final Context context, final UploadParams params) {
        Handler handler;
        IHLogReporter reporter;
        IHLogReporter extras;
        Object obj;
        IHLogReporter extras2;
        if (context == null) {
            Logs.INSTANCE.i(TAG, INSTANCE.getLogPrefix() + " onActionUploadNeedProxy() context=null");
            IHLogReporter reporter2 = params.getReporter();
            if (reporter2 != null) {
                reporter2.report(IHLogReporter.Codes.SendFds_140001_resolve, "context==null");
                return;
            }
            return;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        HLogFilesCollector.Companion companion = HLogFilesCollector.INSTANCE;
        Uri uriResolveLogCollectorUri$utrace_sdk_log_logRelease = companion.resolveLogCollectorUri$utrace_sdk_log_logRelease(context, params.getSendFrom());
        objectRef.element = uriResolveLogCollectorUri$utrace_sdk_log_logRelease;
        if (uriResolveLogCollectorUri$utrace_sdk_log_logRelease == null) {
            Logs logs = Logs.INSTANCE;
            StringBuilder sb = new StringBuilder();
            Companion companion2 = INSTANCE;
            sb.append(companion2.getLogPrefix());
            sb.append(" onActionUploadNeedProxy() collectorUri=null");
            logs.w(TAG, sb.toString());
            IHLogReporter reporter3 = params.getReporter();
            if (reporter3 != null) {
                reporter3.report(IHLogReporter.Codes.SendFds_140001_resolve, "collectorUri==null sendFrom=" + params.getSendFrom());
            }
            objectRef.element = companion.getUmsHLogFileUploadUri();
            logs.w(TAG, companion2.getLogPrefix() + " onActionUploadNeedProxy getHLogUri=" + objectRef.element);
            if (objectRef.element == null) {
                return;
            }
        }
        Companion companion3 = INSTANCE;
        Pair logFiles = companion3.getLogFiles(params);
        List<? extends File> list = (List) logFiles.component1();
        String str = (String) logFiles.component2();
        Logs logs2 = Logs.INSTANCE;
        if (logs2.getDebuggable()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(companion3.getLogPrefix());
            sb2.append(" onActionUploadNeedProxy() files=");
            List<? extends File> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((File) it.next()).getName());
            }
            sb2.append(arrayList);
            sb2.append(" msg=");
            sb2.append(str);
            sb2.append(" params=");
            sb2.append(params);
            logs2.d(TAG, sb2.toString());
        }
        IHLogReporter reporter4 = params.getReporter();
        if (reporter4 != null && (extras2 = reporter4.setExtras(TuplesKt.to("collector_uri", objectRef.element))) != null) {
            extras2.setLogFiles(list);
        }
        if (list.isEmpty()) {
            Logs.INSTANCE.i(TAG, INSTANCE.getLogPrefix() + " onActionUploadNeedProxy() no log files");
            IHLogReporter reporter5 = params.getReporter();
            if (reporter5 != null) {
                reporter5.report(IHLogReporter.Codes.SendFds_140002_open, "no matching log files: " + str);
                return;
            }
            return;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        Throwable th = null;
        for (File file : list) {
            try {
                Result.Companion companion4 = Result.Companion;
                obj = Result.constructor-impl(ParcelFileDescriptor.open(file, SauAarConstants.L));
            } catch (Throwable th2) {
                Result.Companion companion5 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th2));
            }
            Throwable th3 = Result.exceptionOrNull-impl(obj);
            if (th3 != null) {
                Logs.INSTANCE.w(TAG, INSTANCE.getLogPrefix() + " onActionUploadNeedProxy() open fd exception=" + th3);
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "file.name");
                arrayList2.add(name);
                if (th == null) {
                    th = th3;
                }
            }
            if (Result.isFailure-impl(obj)) {
                obj = null;
            }
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
            if (parcelFileDescriptor != null) {
                String name2 = file.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "file.name");
                linkedHashMap.put(name2, parcelFileDescriptor);
            }
        }
        if ((!arrayList2.isEmpty()) && (reporter = params.getReporter()) != null && (extras = reporter.setExtras(TuplesKt.to("open_failed_names", arrayList2))) != null) {
            extras.report(IHLogReporter.Codes.SendFds_140002_open, "error opening log files: " + th);
        }
        final Bundle bundle = new Bundle();
        bundle.putLong("traceId", params.getTraceId());
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            bundle2.putParcelable((String) entry.getKey(), (ParcelFileDescriptor) entry.getValue());
        }
        Unit unit = Unit.INSTANCE;
        bundle.putBundle(HLogFilesCollector.KEY_FILES, bundle2);
        final Function0<Unit> function0 = new Function0<Unit>() { // from class: com.oplus.utrace.hlog.HLogReceiver$onActionUploadNeedProxy$actionCall$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                Object obj2;
                IHLogReporter extras3;
                Context context2 = context;
                Ref.ObjectRef<Uri> objectRef2 = objectRef;
                Bundle bundle3 = bundle;
                UploadParams uploadParams = params;
                Map<String, ParcelFileDescriptor> map = linkedHashMap;
                try {
                    Result.Companion companion6 = Result.Companion;
                    Bundle bundleUnstableProviderCall$default = Providers.unstableProviderCall$default(Providers.INSTANCE, context2, (Uri) objectRef2.element, HLogFilesCollector.METHOD_RECV_FILES, null, bundle3, 8, null);
                    IHLogReporter reporter6 = uploadParams.getReporter();
                    Integer num = null;
                    if (reporter6 != null && (extras3 = reporter6.setExtras(TuplesKt.to("send_fds", map.keySet()))) != null) {
                        IHLogReporter.Codes codes = IHLogReporter.Codes.SendFds_140000_send;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("result=");
                        sb3.append(bundleUnstableProviderCall$default != null ? Integer.valueOf(bundleUnstableProviderCall$default.size()) : null);
                        sb3.append('|');
                        sb3.append(bundleUnstableProviderCall$default);
                        extras3.report(codes, sb3.toString());
                        num = Unit.INSTANCE;
                    }
                    obj2 = Result.constructor-impl(num);
                } catch (Throwable th4) {
                    Result.Companion companion7 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(th4));
                }
                UploadParams uploadParams2 = params;
                Throwable th5 = Result.exceptionOrNull-impl(obj2);
                if (th5 != null) {
                    Logs.INSTANCE.w("UTrace.Sdk.HLogReceiver", HLogReceiver.INSTANCE.getLogPrefix() + " onActionUploadNeedProxy() provider call exception=" + th5, th5);
                    IHLogReporter reporter7 = uploadParams2.getReporter();
                    if (reporter7 != null) {
                        reporter7.report(IHLogReporter.Codes.SendFds_140003_call, "invoke call() exception: " + th5);
                    }
                }
            }
        };
        if (!params.getSimFdTimeout()) {
            function0.invoke();
            return;
        }
        Logs.INSTANCE.d(TAG, INSTANCE.getLogPrefix() + " onActionUploadNeedProxy() simulate fd timeout");
        SafeHandlerThread commonThread = TraceUtil.INSTANCE.getCommonThread();
        if (commonThread == null || (handler = commonThread.getHandler()) == null) {
            return;
        }
        handler.postDelayed(new Runnable() { // from class: com.oplus.utrace.hlog.f
            @Override // java.lang.Runnable
            public final void run() {
                HLogReceiver.onActionUploadNeedProxy$lambda$15(function0);
            }
        }, 30000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActionUploadNeedProxy$lambda$15(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "$tmp0");
        function0.invoke();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        if (intent == null) {
            Logs.INSTANCE.d(TAG, INSTANCE.getLogPrefix() + " onReceive intent is null");
            new HLogReporter().report(IHLogReporter.Codes.Receiver_130001_invalid_message, "intent==null");
            return;
        }
        if (!UtilsKt.checkIntent(intent)) {
            new HLogReporter().report(IHLogReporter.Codes.Receiver_130001_invalid_message, "check intent fail");
            return;
        }
        Logs logs = Logs.INSTANCE;
        StringBuilder sb = new StringBuilder();
        Companion companion = INSTANCE;
        sb.append(companion.getLogPrefix());
        sb.append(" onReceive() ");
        sb.append(intent);
        sb.append(" this=");
        sb.append(this);
        logs.i(TAG, sb.toString());
        String action = intent.getAction();
        if (Intrinsics.areEqual(action, HLogConst.PUSH_TO_UPLOAD_ACTION)) {
            onActionUpload(context, intent);
            return;
        }
        logs.d(TAG, companion.getLogPrefix() + " onReceive action:" + action);
    }

    public final void register$utrace_sdk_log_logRelease(@NotNull Context context) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Logs.INSTANCE.d(TAG, INSTANCE.getLogPrefix() + " register() context=" + context + " this=" + this);
        try {
            Result.Companion companion = Result.Companion;
            IntentFilter intentFilter = new IntentFilter(HLogConst.PUSH_TO_UPLOAD_ACTION);
            obj = Result.constructor-impl(Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(this, intentFilter, 2) : context.registerReceiver(this, intentFilter));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logs.INSTANCE.w(TAG, INSTANCE.getLogPrefix() + " register() exception=" + th2.getMessage() + " this=" + this, th2);
        }
    }

    public final void unregister$utrace_sdk_log_logRelease(@NotNull Context context) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Logs.INSTANCE.d(TAG, INSTANCE.getLogPrefix() + " unregister() context=" + context + " this=" + this);
        try {
            Result.Companion companion = Result.Companion;
            context.unregisterReceiver(this);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logs.INSTANCE.w(TAG, INSTANCE.getLogPrefix() + " unregister() exception=" + th2.getMessage() + " this=" + this, th2);
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u0011\u001a\u00020\fH\u0002J:\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0013H\u0002J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0000¢\u0006\u0002\b\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/oplus/utrace/hlog/HLogReceiver$Companion;", "", "()V", "TAG", "", "logPrefix", "getLogPrefix", "()Ljava/lang/String;", "logPrefix$delegate", "Lkotlin/Lazy;", "receivedMessages", "Landroid/util/LruCache;", "Lcom/oplus/utrace/hlog/UploadParams;", "getLogFiles", "Lkotlin/Pair;", "", "Ljava/io/File;", "params", "startTime", "", "endTime", "path", HLogConst.KEY_MAX_FILE_SIZE, "register", "Lcom/oplus/utrace/hlog/HLogReceiver;", "context", "Landroid/content/Context;", "register$utrace_sdk_log_logRelease", "registerReceiver", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nHLogReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HLogReceiver.kt\ncom/oplus/utrace/hlog/HLogReceiver$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,389:1\n3792#2:390\n4307#2,2:391\n12744#2,2:393\n*S KotlinDebug\n*F\n+ 1 HLogReceiver.kt\ncom/oplus/utrace/hlog/HLogReceiver$Companion\n*L\n189#1:390\n189#1:391,2\n182#1:393,2\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:56:0x0104  */
        /* JADX WARN: Code duplicated, block: B:60:0x0110  */
        private final Pair<List<File>, String> getLogFiles(long startTime, long endTime, String path, long maxFileSize) throws ParseException {
            long jLongValue;
            Object obj;
            boolean z;
            Boolean boolValueOf;
            SimpleDateFormat logFileTimeFormat$utrace_sdk_log_logRelease = HLogUtils.getLogFileTimeFormat$utrace_sdk_log_logRelease();
            try {
                Result.Companion companion = Result.Companion;
                jLongValue = startTime;
                try {
                    Date date = logFileTimeFormat$utrace_sdk_log_logRelease.parse(logFileTimeFormat$utrace_sdk_log_logRelease.format(new Date(jLongValue)));
                    obj = Result.constructor-impl(date != null ? Long.valueOf(date.getTime()) : null);
                } catch (Throwable th) {
                    th = th;
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                }
            } catch (Throwable th2) {
                th = th2;
                jLongValue = startTime;
            }
            Throwable th3 = Result.exceptionOrNull-impl(obj);
            if (th3 != null) {
                Logs.INSTANCE.w(HLogReceiver.TAG, HLogReceiver.INSTANCE.getLogPrefix() + " getLogFiles() exception=" + th3);
            }
            if (Result.isFailure-impl(obj)) {
                obj = null;
            }
            Long l = (Long) obj;
            if (l != null) {
                jLongValue = l.longValue();
            }
            File directory = FileUtil.getDirectory(path);
            if (directory == null) {
                Logs.INSTANCE.i(HLogReceiver.TAG, getLogPrefix() + " getLogFiles() can't access directory " + path);
                return TuplesKt.to(CollectionsKt.emptyList(), "can't access directory " + path);
            }
            File[] fileArrListFiles = directory.listFiles(new FilenameFilter() { // from class: com.oplus.utrace.hlog.g
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    return HLogReceiver.Companion.getLogFiles$lambda$4(file, str);
                }
            });
            if (fileArrListFiles != null) {
                if (!(fileArrListFiles.length == 0)) {
                    ArrayList arrayList = new ArrayList();
                    for (File file : fileArrListFiles) {
                        if (jLongValue > 0 && endTime > 0) {
                            Intrinsics.checkNotNullExpressionValue(file, "file");
                            Date date2 = logFileTimeFormat$utrace_sdk_log_logRelease.parse(HLogUtils.extractFileTimeFromDogFile$utrace_sdk_log_logRelease(file));
                            if (date2 != null) {
                                long time = date2.getTime();
                                boolValueOf = Boolean.valueOf(jLongValue <= time && time <= endTime);
                            } else {
                                boolValueOf = null;
                            }
                            if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
                                if (maxFileSize > 0) {
                                }
                                z = true;
                            } else {
                                z = false;
                            }
                        } else if (maxFileSize > 0 || file.length() <= maxFileSize) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList.add(file);
                        }
                    }
                    final HLogReceiver$Companion$getLogFiles$2 hLogReceiver$Companion$getLogFiles$2 = new Function2<File, File, Integer>() { // from class: com.oplus.utrace.hlog.HLogReceiver$Companion$getLogFiles$2
                        @NotNull
                        public final Integer invoke(File file2, File file3) {
                            return Integer.valueOf(MathKt.getSign(file3.lastModified() - file2.lastModified()));
                        }
                    };
                    return TuplesKt.to(CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.oplus.utrace.hlog.h
                        @Override // java.util.Comparator
                        public final int compare(Object obj2, Object obj3) {
                            return HLogReceiver.Companion.getLogFiles$lambda$7(hLogReceiver$Companion$getLogFiles$2, obj2, obj3);
                        }
                    }), "");
                }
            }
            Logs.INSTANCE.i(HLogReceiver.TAG, getLogPrefix() + " getLogFiles() no log files");
            return TuplesKt.to(CollectionsKt.emptyList(), "no log files");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean getLogFiles$lambda$4(File file, String str) {
            boolean z;
            Intrinsics.checkNotNullExpressionValue(str, "filename");
            if (str.length() > 0) {
                String[] dOG_EXT$utrace_sdk_log_logRelease = HLogUtils.INSTANCE.getDOG_EXT$utrace_sdk_log_logRelease();
                int length = dOG_EXT$utrace_sdk_log_logRelease.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    if (StringsKt.endsWith$default(str, dOG_EXT$utrace_sdk_log_logRelease[i], false, 2, (Object) null)) {
                        z = true;
                        break;
                    }
                    i++;
                }
                if (z) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int getLogFiles$lambda$7(Function2 function2, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(function2, "$tmp0");
            return ((Number) function2.invoke(obj, obj2)).intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getLogPrefix() {
            return (String) HLogReceiver.logPrefix$delegate.getValue();
        }

        private final synchronized HLogReceiver registerReceiver(Context context) {
            if (UtilsKt.isSubProcess(context)) {
                return null;
            }
            HLogReceiver hLogReceiver = new HLogReceiver();
            hLogReceiver.register$utrace_sdk_log_logRelease(context);
            return hLogReceiver;
        }

        @Nullable
        public final HLogReceiver register$utrace_sdk_log_logRelease(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (UTraceApp.inSeedlingPlugin || UTraceApp.isRegisHLogReceiver) {
                return registerReceiver(context);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Pair<List<File>, String> getLogFiles(UploadParams params) {
            IULogger mLogger$utrace_sdk_log_logRelease = ULog.INSTANCE.getMLogger$utrace_sdk_log_logRelease();
            ULoggerImpl uLoggerImpl = mLogger$utrace_sdk_log_logRelease instanceof ULoggerImpl ? (ULoggerImpl) mLogger$utrace_sdk_log_logRelease : null;
            String logFilePath$utrace_sdk_log_logRelease = uLoggerImpl != null ? uLoggerImpl.getLogFilePath() : null;
            if (logFilePath$utrace_sdk_log_logRelease == null || StringsKt.isBlank(logFilePath$utrace_sdk_log_logRelease)) {
                Logs.INSTANCE.i(HLogReceiver.TAG, getLogPrefix() + " getLogFiles() logFilePath is null or blank");
                return TuplesKt.to(CollectionsKt.emptyList(), "logFilePath is null or blank");
            }
            return getLogFiles(params.getBeginTime(), params.getEndTime(), logFilePath$utrace_sdk_log_logRelease, params.getMaxFileSize());
        }
    }
}
