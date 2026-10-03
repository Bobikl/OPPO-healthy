package com.oplus.utrace.hlog.upload;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.oplus.utrace.hlog.HLogFilesCollector;
import com.oplus.utrace.hlog.HLogReporter;
import com.oplus.utrace.hlog.HLogUploaderTaskKt;
import com.oplus.utrace.hlog.HLogUtils;
import com.oplus.utrace.hlog.IHLogReporter;
import com.oplus.utrace.hlog.PushData;
import com.oplus.utrace.hlog.UploadFlag;
import com.oplus.utrace.hlog.UploadParams;
import com.oplus.utrace.lib.HLogConst;
import com.oplus.utrace.lib.PackageNames;
import com.oplus.utrace.utils.Logs;
import com.oplus.utrace.utils.Providers;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J.\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J \u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bH\u0002J \u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bH\u0002JH\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\"\u0010\u001a\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00150\u001bj\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0015`\u001c2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013J\u001a\u0010\u001d\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¨\u0006\u001f"}, d2 = {"Lcom/oplus/utrace/hlog/upload/HLogHandlerPushCollectFile;", "", "()V", "buildBundle", "Landroid/os/Bundle;", "context", "Landroid/content/Context;", "pushData", "Lcom/oplus/utrace/hlog/PushData;", "buildIntent", "Landroid/content/Intent;", "bundle", "checkUploadFlag", "Lcom/oplus/utrace/hlog/UploadFlag;", "pkg", "", "collectPackageAppLog", "", "list", "", "isSceneServiceApp", "", "isUMSApp", "notifyAppCollectLogAndProxy", "startCanUploadTask", "startCollectAppUploadHLog", "pkgMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "startProxyLogFile", "Companion", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHLogHandlerPushCollectFile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HLogHandlerPushCollectFile.kt\ncom/oplus/utrace/hlog/upload/HLogHandlerPushCollectFile\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,304:1\n215#2,2:305\n*S KotlinDebug\n*F\n+ 1 HLogHandlerPushCollectFile.kt\ncom/oplus/utrace/hlog/upload/HLogHandlerPushCollectFile\n*L\n79#1:305,2\n*E\n"})
public final class HLogHandlerPushCollectFile {

    @NotNull
    private static final String PROVIDER_SCENE_SERVICE_URI = "com.oplus.sceneservice.wxapi.provider.WXContentProvider";

    @NotNull
    private static final String TAG = "UTrace.Sdk.HLogHandlerPushCollectFile";

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UploadFlag.values().length];
            try {
                iArr[UploadFlag.CAN_UPLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UploadFlag.NEED_PROXY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final Bundle buildBundle(Context context, PushData pushData) {
        Bundle bundle = new Bundle();
        bundle.putString(HLogConst.KEY_BUSINESS, pushData.getBusiness());
        bundle.putLong("traceId", pushData.getTraceId());
        bundle.putLong("startTime", pushData.getBeginTime());
        bundle.putLong("endTime", pushData.getEndTime());
        bundle.putBoolean(HLogConst.KEY_USE_WIFI, pushData.getUseWifi());
        bundle.putLong(HLogConst.KEY_MAX_FILE_SIZE, HLogUploaderTaskKt.DEFAULT_MAX_FILE_SIZE);
        bundle.putString(HLogConst.KEY_SEND_FROM, context.getPackageName());
        bundle.putString(HLogConst.KEY_TRACE_PKG, pushData.getTracePkg());
        bundle.putString(HLogConst.KEY_RAW_CONTENT, pushData.getRawContent());
        if (ArraysKt.contains(PackageNames.INSTANCE.getUTRACE_DEMO_APPS(), context.getPackageName())) {
            bundle.putBoolean(HLogConst.KEY_EXTRAS_SIM_FD_TIMEOUT, Intrinsics.areEqual(pushData.getExtras().get(HLogConst.KEY_EXTRAS_SIM_FD_TIMEOUT), Boolean.TRUE));
        }
        return bundle;
    }

    private final Intent buildIntent(Bundle bundle) {
        Intent intent = new Intent(HLogConst.PUSH_TO_UPLOAD_ACTION);
        intent.putExtras(bundle);
        return intent;
    }

    private final UploadFlag checkUploadFlag(PushData pushData, String pkg) {
        if (ArraysKt.contains(PackageNames.INSTANCE.getUTRACE_DEMO_APPS(), pkg)) {
            Object orDefault = pushData.getExtras().getOrDefault(HLogConst.KEY_EXTRAS_UPLOAD_FLAG, 0);
            Integer num = orDefault instanceof Integer ? (Integer) orDefault : null;
            if (num != null) {
                UploadFlag uploadFlagFrom = UploadFlag.INSTANCE.from(num.intValue());
                if (uploadFlagFrom != null) {
                    return uploadFlagFrom;
                }
            }
        }
        return HLogUtils.INSTANCE.getDefaultUploadFlags$utrace_sdk_log_logRelease().getOrDefault(pkg, UploadFlag.CAN_UPLOAD);
    }

    private final void collectPackageAppLog(Context context, PushData pushData, String pkg, List<String> list) {
        try {
            Result.Companion companion = Result.Companion;
            int i = WhenMappings.$EnumSwitchMapping$0[checkUploadFlag(pushData, pkg).ordinal()];
            if (i == 1) {
                boolean zStartCanUploadTask = startCanUploadTask(context, pkg, pushData);
                Logs.INSTANCE.i(TAG, "[pkg=" + pkg + ",traceId=" + pushData.getTraceId() + ",”本次推送通过provider日志处理结果“] collectPackageAppLog result " + zStartCanUploadTask);
                if (!zStartCanUploadTask) {
                    list.add(pkg);
                }
            } else if (i != 2) {
                Logs.INSTANCE.i(TAG, "no need upload pkg=" + pkg);
            } else {
                boolean zNotifyAppCollectLogAndProxy = notifyAppCollectLogAndProxy(context, pkg, pushData);
                Logs.INSTANCE.i(TAG, "[pkg=" + pkg + ",traceId=" + pushData.getTraceId() + ",”本次推送通过provider日志处理结果“] collectPackageAppLog result " + zNotifyAppCollectLogAndProxy);
                if (!zNotifyAppCollectLogAndProxy) {
                    list.add(pkg);
                }
            }
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
    }

    private final boolean isSceneServiceApp(String pkg) {
        return TextUtils.equals(pkg, PackageNames.SCENE_SERVICE);
    }

    private final boolean isUMSApp(String pkg) {
        return TextUtils.equals(pkg, "com.oplus.pantanal.ums");
    }

    private final boolean notifyAppCollectLogAndProxy(Context context, String pkg, PushData pushData) {
        Bundle bundleBuildBundle = buildBundle(context, pushData);
        ComponentName componentName = new ComponentName(pkg, HLogFilesCollector.class.getName());
        Providers providers = Providers.INSTANCE;
        Uri uriResolveUriWithComponent = providers.resolveUriWithComponent(context, componentName, false);
        String str = "[pkg=" + pkg + ",traceId=" + pushData.getTraceId() + "，”通过provider通知入口发起上传“] collect file upload,notifyAppCollectLogAndProxy notify uri= " + uriResolveUriWithComponent + " , pushData = " + pushData;
        Logs logs = Logs.INSTANCE;
        logs.i(TAG, str);
        if (uriResolveUriWithComponent != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            IHLogReporter reporter = pushData.getReporter();
            if (reporter != null) {
                reporter.report(IHLogReporter.Codes.Proxy_180000_start, str);
            }
            Bundle bundleUnstableProviderCall = providers.unstableProviderCall(context, uriResolveUriWithComponent, HLogFilesCollector.METHOD_COLLECT_PUSH_LOG_FILE, "", bundleBuildBundle);
            Integer numValueOf = bundleUnstableProviderCall != null ? Integer.valueOf(bundleUnstableProviderCall.getInt("result", -2)) : null;
            String string = bundleUnstableProviderCall != null ? bundleUnstableProviderCall.getString("msg", "") : null;
            String str2 = "notifyAppCollectLogAndProxy notify result code=" + numValueOf + "，message=" + string + " delTime=" + (System.currentTimeMillis() - jCurrentTimeMillis);
            logs.i(TAG, "[[pkg=" + pkg + ",traceId=" + pushData.getTraceId() + ",”通过provider通知入口发起上传的结果“] collect file upload," + str2);
            IHLogReporter reporter2 = pushData.getReporter();
            if (reporter2 != null) {
                reporter2.report(IHLogReporter.Codes.Proxy_180001_result, str2);
            }
            if (numValueOf != null && numValueOf.intValue() == 200) {
                startProxyLogFile(bundleUnstableProviderCall, pkg);
                return true;
            }
        }
        return false;
    }

    private final boolean startCanUploadTask(Context context, String pkg, PushData pushData) {
        Uri uriResolveUriWithComponent;
        Bundle bundleBuildBundle = buildBundle(context, pushData);
        Logs logs = Logs.INSTANCE;
        logs.d(TAG, "[pkg=" + pkg + ",traceId=" + pushData.getTraceId() + ",开始收集日志] collect file upload start pkg=" + pkg + ',');
        if (isUMSApp(pkg)) {
            return new HLogUploadHelper().onActionUploadDirectUpload(UploadParams.INSTANCE.fromAndInitReporter(buildIntent(bundleBuildBundle))).length() == 0;
        }
        if (isSceneServiceApp(pkg)) {
            uriResolveUriWithComponent = Uri.parse("content://com.oplus.sceneservice.wxapi.provider.WXContentProvider");
        } else {
            uriResolveUriWithComponent = Providers.INSTANCE.resolveUriWithComponent(context, new ComponentName(pkg, HLogFilesCollector.class.getName()), false);
        }
        Uri uri = uriResolveUriWithComponent;
        String str = "[pkg=" + pkg + ",traceId=" + pushData.getTraceId() + ",”通过provider通知入口发起上传“] collect file upload,startCanUploadTask notify uri= " + uri + " , pushData = " + pushData;
        logs.i(TAG, str);
        if (uri != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            IHLogReporter reporter = pushData.getReporter();
            if (reporter != null) {
                reporter.report(IHLogReporter.Codes.Proxy_180000_start, str);
            }
            Bundle bundleUnstableProviderCall = Providers.INSTANCE.unstableProviderCall(context, uri, HLogFilesCollector.METHOD_PULL_LOG_FILE, "", bundleBuildBundle);
            Integer numValueOf = bundleUnstableProviderCall != null ? Integer.valueOf(bundleUnstableProviderCall.getInt("result", -2)) : null;
            String string = bundleUnstableProviderCall != null ? bundleUnstableProviderCall.getString("msg", "") : null;
            String str2 = "startCanUploadTask notify result code=" + numValueOf + "，message=" + string + " delTime=" + (System.currentTimeMillis() - jCurrentTimeMillis) + " pkg=" + pkg + ",traceId=[" + pushData.getTraceId() + ']';
            logs.i(TAG, "[pkg=" + pkg + ",traceId=" + pushData.getTraceId() + ",”通过provider通知入口发起上传的结果“] collect file upload," + str2);
            IHLogReporter reporter2 = pushData.getReporter();
            if (reporter2 != null) {
                reporter2.report(IHLogReporter.Codes.Proxy_180001_result, str2);
            }
            if (numValueOf != null && numValueOf.intValue() == 200) {
                return true;
            }
        }
        return false;
    }

    private final void startProxyLogFile(Bundle bundle, String pkg) {
        Long lValueOf = bundle != null ? Long.valueOf(bundle.getLong("traceId")) : null;
        HLogReporter extras = new HLogReporter().setExtras(TuplesKt.to("calling_pkg", pkg));
        if (lValueOf == null) {
            extras.report(IHLogReporter.Codes.RecvFds_150001_invalid_call, "traceId==null");
            return;
        }
        IHLogReporter.DefaultImpls.report$default(extras.setPushData(lValueOf.longValue(), pkg, (Object) null), IHLogReporter.Codes.RecvFds_150002_enqueue, null, 2, null);
        Map<String, ParcelFileDescriptor> mapExtractLogFilesFD = HLogFileHelper.extractLogFilesFD(bundle, extras);
        if (!mapExtractLogFilesFD.isEmpty()) {
            new HLogUploadHelper().startUploadProxyLogFile(lValueOf.longValue(), pkg, mapExtractLogFilesFD, extras);
            return;
        }
        Logs.INSTANCE.i(TAG, "collect file upload,startProxyLogFile package " + pkg + " collect file is null");
    }

    public final void startCollectAppUploadHLog(@NotNull Context context, @NotNull PushData pushData, @NotNull HashMap<String, Boolean> pkgMap, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pushData, "pushData");
        Intrinsics.checkNotNullParameter(pkgMap, "pkgMap");
        Intrinsics.checkNotNullParameter(list, "list");
        Iterator<Map.Entry<String, Boolean>> it = pkgMap.entrySet().iterator();
        while (it.hasNext()) {
            collectPackageAppLog(context, pushData, it.next().getKey(), list);
        }
    }
}
