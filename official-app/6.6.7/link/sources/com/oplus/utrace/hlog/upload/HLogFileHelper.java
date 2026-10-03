package com.oplus.utrace.hlog.upload;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.heytap.log.util.FileUtil;
import com.oplus.utrace.hlog.HLogConfigHelper;
import com.oplus.utrace.hlog.HLogFilesCollector;
import com.oplus.utrace.hlog.HLogReporter;
import com.oplus.utrace.hlog.HLogUtils;
import com.oplus.utrace.hlog.IHLogReporter;
import com.oplus.utrace.hlog.ULoggerImpl;
import com.oplus.utrace.hlog.UploadParams;
import com.oplus.utrace.lib.HLogConst;
import com.oplus.utrace.sdk.IULogger;
import com.oplus.utrace.sdk.ULog;
import com.oplus.utrace.utils.Logs;
import com.oplus.utrace.utils.TraceUtil;
import com.oplus.utrace.utils.UtilsKt;
import com.oplusos.sau.common.utils.SauAarConstants;
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
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J*\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0007JB\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0019H\u0003J \u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006 "}, d2 = {"Lcom/oplus/utrace/hlog/upload/HLogFileHelper;", "", "()V", "TAG", "", "logPrefix", "getLogPrefix", "()Ljava/lang/String;", "logPrefix$delegate", "Lkotlin/Lazy;", "extractLogFilesFD", "", "Landroid/os/ParcelFileDescriptor;", "bundle", "Landroid/os/Bundle;", "reporter", "Lcom/oplus/utrace/hlog/HLogReporter;", "getLogFiles", "Lkotlin/Pair;", "", "Ljava/io/File;", "tag", "params", "Lcom/oplus/utrace/hlog/UploadParams;", "startTime", "", "endTime", "path", HLogConst.KEY_MAX_FILE_SIZE, "onActionUploadNeedProxy", "", "resultBundle", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHLogFileHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HLogFileHelper.kt\ncom/oplus/utrace/hlog/upload/HLogFileHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,215:1\n1549#2:216\n1620#2,3:217\n1855#2,2:220\n1#3:222\n215#4,2:223\n3792#5:225\n4307#5,2:226\n12744#5,2:228\n*S KotlinDebug\n*F\n+ 1 HLogFileHelper.kt\ncom/oplus/utrace/hlog/upload/HLogFileHelper\n*L\n80#1:216\n80#1:217,3\n93#1:220,2\n122#1:223,2\n157#1:225\n157#1:226,2\n150#1:228,2\n*E\n"})
public final class HLogFileHelper {

    @NotNull
    private static final String TAG = "UTrace.Sdk.HLogFileHelper";

    @NotNull
    public static final HLogFileHelper INSTANCE = new HLogFileHelper();

    @NotNull
    private static final Lazy logPrefix$delegate = LazyKt.lazy(new Function0<String>() { // from class: com.oplus.utrace.hlog.upload.HLogFileHelper$logPrefix$2
        @NotNull
        public final String invoke() {
            return TraceUtil.generateLogPrefix$utrace_sdk_log_logRelease(HLogFileHelper.INSTANCE);
        }
    });

    private HLogFileHelper() {
    }

    @JvmStatic
    @NotNull
    public static final Map<String, ParcelFileDescriptor> extractLogFilesFD(@Nullable Bundle bundle, @NotNull HLogReporter reporter) {
        Object obj;
        Map<String, ParcelFileDescriptor> mapEmptyMap;
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final ArrayList arrayList = new ArrayList();
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(bundle != null ? bundle.getBundle(HLogFilesCollector.KEY_FILES) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logs.INSTANCE.w(TAG, "collect file upload,extractLogFilesFD() exception=" + th2);
        } else {
            th2 = null;
        }
        Bundle bundle2 = (Bundle) (Result.isFailure-impl(obj) ? null : obj);
        if (bundle2 == null || (mapEmptyMap = UtilsKt.extractFdsFromBundle(bundle2, new Function2<String, Throwable, Unit>() { // from class: com.oplus.utrace.hlog.upload.HLogFileHelper$extractLogFilesFD$result$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                invoke((String) obj2, (Throwable) obj3);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull String str, @NotNull Throwable th3) {
                Intrinsics.checkNotNullParameter(str, "fileName");
                Intrinsics.checkNotNullParameter(th3, "exception");
                Ref.ObjectRef<Throwable> objectRef2 = objectRef;
                if (objectRef2.element == null) {
                    objectRef2.element = th3;
                }
                arrayList.add(str);
            }
        })) == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        if (mapEmptyMap.isEmpty() || (!arrayList.isEmpty()) || th2 != null || objectRef.element != null) {
            reporter.setExtras(TuplesKt.to("get_fd_failed_names", arrayList), TuplesKt.to("get_fd_names", mapEmptyMap.keySet()), TuplesKt.to("get_fds_exception", th2), TuplesKt.to("get_fd_exception", objectRef.element)).report(IHLogReporter.Codes.RecvFds_150003_extract_fds, "extracted " + mapEmptyMap.size() + ", failed " + arrayList.size());
        }
        return mapEmptyMap;
    }

    @JvmStatic
    @NotNull
    public static final Pair<List<File>, String> getLogFiles(@NotNull String tag, @NotNull UploadParams params) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(params, "params");
        IULogger mLogger$utrace_sdk_log_logRelease = ULog.INSTANCE.getMLogger$utrace_sdk_log_logRelease();
        ULoggerImpl uLoggerImpl = mLogger$utrace_sdk_log_logRelease instanceof ULoggerImpl ? (ULoggerImpl) mLogger$utrace_sdk_log_logRelease : null;
        String logFilePath = uLoggerImpl != null ? uLoggerImpl.getLogFilePath() : null;
        if (!(logFilePath == null || StringsKt.isBlank(logFilePath))) {
            return getLogFiles(tag, params.getBeginTime(), params.getEndTime(), logFilePath, params.getMaxFileSize());
        }
        Logs.INSTANCE.i(tag, INSTANCE.getLogPrefix() + " getLogFiles() logFilePath is null or blank");
        return TuplesKt.to(CollectionsKt.emptyList(), "logFilePath is null or blank");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getLogFiles$lambda$11(File file, String str) {
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
    public static final int getLogFiles$lambda$14(Function2 function2, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(function2, "$tmp0");
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    private final String getLogPrefix() {
        return (String) logPrefix$delegate.getValue();
    }

    @JvmStatic
    public static final boolean onActionUploadNeedProxy(@NotNull String tag, @NotNull UploadParams params, @NotNull Bundle resultBundle) {
        IHLogReporter reporter;
        IHLogReporter extras;
        Object obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(resultBundle, "resultBundle");
        boolean zIsLogEnabled$utrace_sdk_log_logRelease = HLogConfigHelper.INSTANCE.isLogEnabled$utrace_sdk_log_logRelease();
        String str = "pkg=" + params.getPushData().getTracePkg() + ",traceId=" + params.getTraceId();
        Logs logs = Logs.INSTANCE;
        StringBuilder sb = new StringBuilder();
        HLogFileHelper hLogFileHelper = INSTANCE;
        sb.append(hLogFileHelper.getLogPrefix());
        sb.append('[');
        sb.append(str);
        sb.append("] collect file upload,onActionUploadNeedProxy logEnabled:");
        sb.append(zIsLogEnabled$utrace_sdk_log_logRelease);
        logs.d(TAG, sb.toString());
        if (!zIsLogEnabled$utrace_sdk_log_logRelease) {
            IHLogReporter reporter2 = params.getReporter();
            if (reporter2 != null) {
                reporter2.report(IHLogReporter.Codes.Receiver_130002_disabled, "isLogEnabled=false");
            }
            return false;
        }
        Pair<List<File>, String> logFiles = getLogFiles(tag, params);
        List<File> list = (List) logFiles.component1();
        String str2 = (String) logFiles.component2();
        if (logs.getDebuggable()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(hLogFileHelper.getLogPrefix());
            sb2.append('[');
            sb2.append(str);
            sb2.append("] collect file upload,onActionUploadNeedProxy files=");
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((File) it.next()).getName());
            }
            sb2.append(arrayList);
            sb2.append(" msg=");
            sb2.append(str2);
            sb2.append(" params=");
            sb2.append(params);
            logs.d(tag, sb2.toString());
        }
        if (list.isEmpty()) {
            Logs.INSTANCE.i(tag, INSTANCE.getLogPrefix() + '[' + str + "] collect file upload,onActionUploadNeedProxy no log files");
            IHLogReporter reporter3 = params.getReporter();
            if (reporter3 != null) {
                reporter3.report(IHLogReporter.Codes.SendFds_140002_open, "no matching log files: " + str2);
            }
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        Throwable th = null;
        for (File file : list) {
            try {
                Result.Companion companion = Result.Companion;
                obj = Result.constructor-impl(ParcelFileDescriptor.open(file, SauAarConstants.L));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th2));
            }
            Throwable th3 = Result.exceptionOrNull-impl(obj);
            if (th3 != null) {
                Logs.INSTANCE.w(tag, INSTANCE.getLogPrefix() + '[' + str + "] collect file upload,onActionUploadNeedProxy open fd exception=" + th3);
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
        Logs.INSTANCE.d(TAG, INSTANCE.getLogPrefix() + '[' + str + "] collect file upload,onActionUploadNeedProxy collect file result success filesSize=" + list.size());
        resultBundle.putLong("traceId", params.getTraceId());
        Bundle bundle = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), (ParcelFileDescriptor) entry.getValue());
        }
        Unit unit = Unit.INSTANCE;
        resultBundle.putBundle(HLogFilesCollector.KEY_FILES, bundle);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0106  */
    /* JADX WARN: Code duplicated, block: B:60:0x0112  */
    @JvmStatic
    private static final Pair<List<File>, String> getLogFiles(String tag, long startTime, long endTime, String path, long maxFileSize) throws ParseException {
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
            Logs.INSTANCE.w(tag, INSTANCE.getLogPrefix() + " getLogFiles() exception=" + th3);
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
            Logs.INSTANCE.i(tag, INSTANCE.getLogPrefix() + " getLogFiles() can't access directory " + path);
            return TuplesKt.to(CollectionsKt.emptyList(), "can't access directory " + path);
        }
        File[] fileArrListFiles = directory.listFiles(new FilenameFilter() { // from class: com.oplus.utrace.hlog.upload.a
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return HLogFileHelper.getLogFiles$lambda$11(file, str);
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
                final 2 r0 = new Function2<File, File, Integer>() { // from class: com.oplus.utrace.hlog.upload.HLogFileHelper.getLogFiles.2
                    @NotNull
                    public final Integer invoke(File file2, File file3) {
                        return Integer.valueOf(MathKt.getSign(file3.lastModified() - file2.lastModified()));
                    }
                };
                return TuplesKt.to(CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.oplus.utrace.hlog.upload.b
                    @Override // java.util.Comparator
                    public final int compare(Object obj2, Object obj3) {
                        return HLogFileHelper.getLogFiles$lambda$14(r0, obj2, obj3);
                    }
                }), "");
            }
        }
        Logs.INSTANCE.i(tag, INSTANCE.getLogPrefix() + " getLogFiles() no log files");
        return TuplesKt.to(CollectionsKt.emptyList(), "no log files");
    }
}
