package com.heytap.nearx.taphttp.statitics;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.heytap.common.bean.DnsType;
import com.heytap.common.bean.NetworkType;
import com.heytap.common.manager.ApkInfo;
import com.heytap.httpdns.domainUnit.DomainUnitEntity;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.http.detector.DetectListener;
import com.heytap.nearx.http.detector.NetworkDetector;
import com.heytap.nearx.http.detector.NetworkDetectorManager;
import com.heytap.nearx.taphttp.core.HeyCenter;
import com.oplus.aiunit.vision.CallStat;
import com.oplus.aiunit.vision.CommonStat;
import com.oplus.aiunit.vision.HttpStat;
import com.oplus.aiunit.vision.HttpStatConfig;
import com.oplus.aiunit.vision.QuicStat;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.ch5;
import com.oplus.aiunit.vision.ini;
import com.oplus.aiunit.vision.iyj;
import com.oplus.aiunit.vision.j35;
import com.oplus.aiunit.vision.o95;
import com.oplus.aiunit.vision.oni;
import com.oplus.aiunit.vision.opc;
import com.oplus.aiunit.vision.pni;
import com.oplus.aiunit.vision.qni;
import com.oplus.aiunit.vision.r7b;
import io.protostuff.MapSchema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.codec.language.Soundex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 a2\u00020\u0001:\u0001%B)\u0012\u0006\u0010O\u001a\u00020K\u0012\u0006\u0010T\u001a\u00020P\u0012\b\u0010Y\u001a\u0004\u0018\u00010U\u0012\u0006\u0010^\u001a\u00020Z¢\u0006\u0004\b_\u0010`JF\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004JR\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004J$\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0010J(\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0010J(\u0010\u001c\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001aJ\u001c\u0010 \u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eJ\u0018\u0010#\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\"\u001a\u00020!J\u0018\u0010%\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010$\u001a\u00020\u0002J\u0018\u0010&\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010$\u001a\u00020\u0002J\u0018\u0010'\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010$\u001a\u00020\u0002J\u0018\u0010(\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010$\u001a\u00020\u0002J$\u0010+\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u00042\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\rH\u0002R\u0019\u00100\u001a\u0004\u0018\u00010,8\u0006¢\u0006\f\n\u0004\b%\u0010-\u001a\u0004\b.\u0010/R\u0017\u00105\u001a\u0002018\u0006¢\u0006\f\n\u0004\b \u00102\u001a\u0004\b3\u00104R\u0017\u0010:\u001a\u0002068\u0006¢\u0006\f\n\u0004\b(\u00107\u001a\u0004\b8\u00109R\u0016\u0010<\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010;R\u0016\u0010=\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010;R\u0016\u0010>\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010;R\"\u0010E\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001b\u0010J\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010O\u001a\u00020K8\u0006¢\u0006\f\n\u0004\b\u001c\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010T\u001a\u00020P8\u0006¢\u0006\f\n\u0004\bH\u0010Q\u001a\u0004\bR\u0010SR\u0019\u0010Y\u001a\u0004\u0018\u00010U8\u0006¢\u0006\f\n\u0004\b8\u0010V\u001a\u0004\bW\u0010XR\u0017\u0010^\u001a\u00020Z8\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b[\u0010]¨\u0006b"}, d2 = {"Lcom/heytap/nearx/taphttp/statitics/HttpStatHelper;", "", "", "isSuccess", "", "path", "host", "region", "adg", DomainUnitEntity.COLUMN_AUG, "error", "", LogFieldKey.PROCESS_NAME_KEY, "", "q", "pathSegment", "Lcom/heytap/common/bean/NetworkType;", "requestType", "Lcom/oplus/aiunit/vision/us2;", b2n.f, "callStat", "ip", "Lcom/heytap/common/bean/DnsType;", "dnsType", "networkType", b2n.g, "Ljava/io/IOException;", "ioException", "i", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "b", "", "responseCode", "f", "success", "a", MapSchema.FIELD_NAME_ENTRY, "d", "c", "eventId", "map", "r", "Lcom/oplus/aiunit/vision/ini;", "Lcom/oplus/aiunit/vision/ini;", "o", "()Lcom/oplus/aiunit/vision/ini;", "statisticSdkCaller", "Lcom/oplus/aiunit/vision/r7b;", "Lcom/oplus/aiunit/vision/r7b;", LogFieldKey.MESSAGE_KEY, "()Lcom/oplus/aiunit/vision/r7b;", "logger", "Landroid/content/Context;", "Landroid/content/Context;", MapSchema.FIELD_NAME_KEY, "()Landroid/content/Context;", "context", "Z", "isStatisticV1", "isStatisticV2", "isStatisticV3", "Lcom/heytap/nearx/taphttp/statitics/StatRateHelper;", "Lcom/heytap/nearx/taphttp/statitics/StatRateHelper;", "n", "()Lcom/heytap/nearx/taphttp/statitics/StatRateHelper;", "setStatRateHelper", "(Lcom/heytap/nearx/taphttp/statitics/StatRateHelper;)V", "statRateHelper", "Lcom/heytap/common/manager/ApkInfo;", "Lkotlin/Lazy;", "j", "()Lcom/heytap/common/manager/ApkInfo;", "apkInfo", "Lcom/heytap/nearx/taphttp/core/HeyCenter;", "Lcom/heytap/nearx/taphttp/core/HeyCenter;", "getHeyCenter", "()Lcom/heytap/nearx/taphttp/core/HeyCenter;", "heyCenter", "Lcom/oplus/aiunit/vision/lk9;", "Lcom/oplus/aiunit/vision/lk9;", "getHeyConfig", "()Lcom/oplus/aiunit/vision/lk9;", "heyConfig", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "getSpConfig", "()Landroid/content/SharedPreferences;", "spConfig", "Lcom/oplus/aiunit/vision/ch5;", LogFieldKey.LEVEL_KEY, "Lcom/oplus/aiunit/vision/ch5;", "()Lcom/oplus/aiunit/vision/ch5;", "deviceInfo", "<init>", "(Lcom/heytap/nearx/taphttp/core/HeyCenter;Lcom/oplus/aiunit/vision/lk9;Landroid/content/SharedPreferences;Lcom/oplus/aiunit/vision/ch5;)V", "Companion", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final class HttpStatHelper {

    @NotNull
    public static final String HTTP_BODY_FAIL = "10007";

    @NotNull
    public static final String HTTP_BODY_ID = "10010";

    @NotNull
    public static final String HTTP_CATEGORY = "10000";

    @NotNull
    public static final String HTTP_DNS_ID = "10011";

    @NotNull
    public static final String HTTP_DN_UNIT_FAIL = "10006";

    @NotNull
    public static final String HTTP_EVENT_ID = "10001";

    @NotNull
    public static final String HUBBLE_CATEGORY = "20000";

    @NotNull
    public static final String HUBBLE_EVENT_ID = "20001";

    @NotNull
    public static final String HUBBLE_WEAK_NET_EVENT_ID = "20002";
    public static final int MAX_RECORDS_NUM = 1000;

    @NotNull
    public static final String QUIC_BODY_ID = "10009";

    @NotNull
    public static final String QUIC_EVENT_ID = "10008";

    @NotNull
    public static final String RECORD_NUM = "records_nums";

    @NotNull
    public static final String TAG = "Statistics-Helper";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final ini statisticSdkCaller;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final r7b logger;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean isStatisticV1;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isStatisticV2;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean isStatisticV3;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public StatRateHelper statRateHelper;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final Lazy apkInfo;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final HeyCenter heyCenter;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final HttpStatConfig heyConfig;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public final SharedPreferences spConfig;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ch5 deviceInfo;

    @JvmField
    public static final int APP_CODE = 20214;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/heytap/nearx/taphttp/statitics/HttpStatHelper$b", "Lcom/heytap/nearx/http/detector/DetectListener;", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
    public static final class b implements DetectListener {
        public final /* synthetic */ o95 a;

        public b(o95 o95Var) {
            this.a = o95Var;
        }
    }

    public HttpStatHelper(@NotNull HeyCenter heyCenter, @NotNull HttpStatConfig heyConfig, @Nullable SharedPreferences sharedPreferences, @NotNull ch5 deviceInfo) {
        Intrinsics.checkNotNullParameter(heyCenter, "heyCenter");
        Intrinsics.checkNotNullParameter(heyConfig, "heyConfig");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.heyCenter = heyCenter;
        this.heyConfig = heyConfig;
        this.spConfig = sharedPreferences;
        this.deviceInfo = deviceInfo;
        this.statisticSdkCaller = heyConfig.getStatisticCaller();
        this.logger = heyCenter.getLogger();
        this.context = heyCenter.getContext();
        this.isStatisticV1 = true;
        this.isStatisticV2 = true;
        this.isStatisticV3 = true;
        this.statRateHelper = new StatRateHelper(heyCenter, heyConfig, sharedPreferences);
        this.apkInfo = LazyKt__LazyJVMKt.lazy(new Function0<ApkInfo>() { // from class: com.heytap.nearx.taphttp.statitics.HttpStatHelper$apkInfo$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final ApkInfo invoke() {
                return new ApkInfo(this.this$0.getContext(), this.this$0.getLogger());
            }
        });
    }

    public final void a(@Nullable CallStat callStat, boolean success) {
        if ((callStat == null || !callStat.getIsFinish() || callStat.getIsBodyException()) && callStat != null) {
            callStat.getHttpStat().r(SystemClock.uptimeMillis());
            callStat.getHttpStat().t(success);
            callStat.getCommonStat().k(this.deviceInfo.isConnectNet());
            callStat.j(true);
            r(callStat.getIsBodyException() ? "10007" : "10001", callStat.getIsBodyException() ? callStat.k() : callStat.l());
        }
    }

    public final void b(@Nullable CallStat callStat, @NotNull Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (callStat != null) {
            StringBuilder errorMessage = callStat.getHttpStat().getErrorMessage();
            StringBuilder sb = new StringBuilder();
            sb.append(exception.getClass().getName());
            sb.append("[(");
            sb.append(exception.getMessage());
            sb.append(")cause by:(");
            Throwable cause = exception.getCause();
            sb.append(cause != null ? cause.getClass().getName() : null);
            sb.append(",");
            Throwable cause2 = exception.getCause();
            sb.append(cause2 != null ? cause2.getMessage() : null);
            sb.append(")]");
            errorMessage.append(sb.toString());
            try {
                NetworkDetectorManager networkDetectorManager = (NetworkDetectorManager) this.heyCenter.g(NetworkDetectorManager.class);
                if (networkDetectorManager != null) {
                    List<String> listC = callStat.getCommonStat().c();
                    Map mapDetect = networkDetectorManager.detect(callStat.getHttpStat().getDomain(), CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"NET_TYPE", "NET_CARRIER", "WLAN_RSSI", "MOBILE_RSSI", "MOBILE_ROAMING", "NET_PROXY", "NET_LOCAL_DNS", "NET_PING"}));
                    ArrayList arrayList = new ArrayList(mapDetect.size());
                    for (Map.Entry entry : mapDetect.entrySet()) {
                        arrayList.add(((String) entry.getKey()) + Soundex.SILENT_MARKER + ((String) entry.getValue()));
                    }
                    listC.addAll(arrayList);
                    o95 o95Var = (o95) this.heyCenter.g(o95.class);
                    if (o95Var != null) {
                        networkDetectorManager.detectAsync(callStat.getHttpStat().getDomain(), NetworkDetector.Companion.getAllInfo(), new b(o95Var));
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void c(@Nullable CallStat callStat, boolean success) {
        if (callStat != null) {
            callStat.getHttpStat().t(success);
            callStat.getCommonStat().k(this.deviceInfo.isConnectNet());
            r("10010", callStat.k());
        }
    }

    public final void d(@Nullable CallStat callStat, boolean success) {
        if (callStat != null) {
            callStat.getQuicStat().t(success);
            callStat.getCommonStat().k(this.deviceInfo.isConnectNet());
            r("10009", callStat.m());
        }
    }

    public final void e(@Nullable CallStat callStat, boolean success) {
        if (callStat != null) {
            callStat.getQuicStat().p(SystemClock.uptimeMillis());
            callStat.getQuicStat().t(success);
            callStat.getCommonStat().k(this.deviceInfo.isConnectNet());
            r("10008", callStat.n());
        }
    }

    public final void f(@Nullable CallStat callStat, int responseCode) {
        if (callStat != null) {
            callStat.getHttpStat().getErrorMessage().append("Code-" + responseCode);
            callStat.getQuicStat().getQuicErrorMessage().append("Code-" + responseCode);
        }
    }

    @Nullable
    public final CallStat g(@NotNull String host, @Nullable String pathSegment, @NotNull NetworkType requestType) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        if (!this.statRateHelper.b()) {
            return null;
        }
        CallStat callStat = new CallStat(new CommonStat(j().packageName(), this.deviceInfo.d(), iyj.INSTANCE.a(), "4.9.3.7", new opc(requestType.name(), null, 2, null), null, null, false, null, null, 992, null), new HttpStat(host, j35.c(pathSegment), false, 0, null, null, null, null, null, null, null, null, 0L, 0L, 0L, 32760, null), new QuicStat(host, j35.c(pathSegment), false, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 2044, null));
        long jUptimeMillis = SystemClock.uptimeMillis();
        callStat.getHttpStat().s(jUptimeMillis);
        callStat.getQuicStat().s(jUptimeMillis);
        return callStat;
    }

    public final void h(@Nullable CallStat callStat, @NotNull String ip, @NotNull DnsType dnsType, @NotNull NetworkType networkType) {
        Intrinsics.checkNotNullParameter(ip, "ip");
        Intrinsics.checkNotNullParameter(dnsType, "dnsType");
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        if (callStat != null) {
            callStat.getHttpStat().e().add(ip + ':' + dnsType.getText());
            HttpStat httpStat = callStat.getHttpStat();
            httpStat.q(httpStat.getConnCount() + 1);
            callStat.getCommonStat().getNetworkTypeStat().a().add(networkType.name());
        }
    }

    public final void i(@Nullable CallStat callStat, @NotNull String ip, @NotNull DnsType dnsType, @NotNull IOException ioException) {
        Intrinsics.checkNotNullParameter(ip, "ip");
        Intrinsics.checkNotNullParameter(dnsType, "dnsType");
        Intrinsics.checkNotNullParameter(ioException, "ioException");
        if (callStat != null) {
            callStat.getHttpStat().e().add(ip + ':' + dnsType.getText());
            HttpStat httpStat = callStat.getHttpStat();
            httpStat.q(httpStat.getConnCount() + 1);
        }
    }

    public final ApkInfo j() {
        return (ApkInfo) this.apkInfo.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final ch5 getDeviceInfo() {
        return this.deviceInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final r7b getLogger() {
        return this.logger;
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final StatRateHelper getStatRateHelper() {
        return this.statRateHelper;
    }

    @Nullable
    /* JADX INFO: renamed from: o, reason: from getter */
    public final ini getStatisticSdkCaller() {
        return this.statisticSdkCaller;
    }

    public final void p(boolean isSuccess, @NotNull String path, @NotNull String host, @Nullable String region, @Nullable String adg, @Nullable String aug, @Nullable String error) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(host, "host");
        if (this.statRateHelper.b()) {
            r("10011", q(isSuccess, path, host, region, adg, aug, error));
        }
    }

    @NotNull
    public final Map<String, String> q(boolean isSuccess, @NotNull String path, @NotNull String host, @Nullable String region, @Nullable String adg, @Nullable String aug, @Nullable String error) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(host, "host");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("isSuccess", String.valueOf(isSuccess));
        linkedHashMap.put("path", path);
        linkedHashMap.put("host", host);
        linkedHashMap.put("region", j35.c(region));
        linkedHashMap.put("adg", j35.c(adg));
        linkedHashMap.put(DomainUnitEntity.COLUMN_AUG, j35.c(aug));
        linkedHashMap.put("error_message", j35.c(error));
        linkedHashMap.put("package_name", j().packageName());
        linkedHashMap.put("client_version", "4.9.3.7");
        return linkedHashMap;
    }

    public final void r(String eventId, Map<String, String> map) {
        ini iniVar = this.statisticSdkCaller;
        if (iniVar != null) {
            Context context = this.context;
            int i = APP_CODE;
            iniVar.recordCustomEvent(context, i, "10000", eventId, map);
            r7b.l(this.logger, TAG, "app code is " + i + " http request:" + this, null, null, 12, null);
        } else if (this.isStatisticV1 || this.isStatisticV2 || this.isStatisticV3) {
            if (this.isStatisticV3) {
                this.isStatisticV3 = qni.INSTANCE.a(this.logger, "10000", map, eventId);
            }
            if (!this.isStatisticV3 && this.isStatisticV2) {
                this.isStatisticV2 = pni.INSTANCE.b(this.logger, map, eventId);
            }
            if (!this.isStatisticV3 && !this.isStatisticV2 && this.isStatisticV1) {
                this.isStatisticV1 = oni.INSTANCE.a(this.context, this.logger, map, eventId);
            }
        }
        this.statRateHelper.g();
    }
}
