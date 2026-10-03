package com.oplus.utrace.lib;

import android.os.Build;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.oplus.aiunit.vision.vr3;
import com.oplus.utrace.utils.Logs;
import com.oplus.utrace.utils.TimeSupplier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 @2\u00020\u0001:\u0006@ABCDEBa\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0002\u0010\u0012J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\fHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u00100\u001a\u00020\u0010HÆ\u0003J\t\u00101\u001a\u00020\u0010HÆ\u0003Je\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001J\u000e\u00103\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u0000J\u0013\u00105\u001a\u00020\u00032\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\u0006\u00109\u001a\u00020\u0003J\u0006\u0010:\u001a\u00020\u0007J\t\u0010;\u001a\u00020\u0007HÖ\u0001J\u000e\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?R\u001c\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u001d\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u001eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0014\u001a\u0004\b!\u0010\"R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006F"}, d2 = {"Lcom/oplus/utrace/lib/SdkConfigData;", "", "isEnabled", "", "overflow", "Lcom/oplus/utrace/lib/SdkConfigData$FlowCtrl;", "overflowPt", "", "logsDebuggable", "traceCacheMetrics", "Lcom/oplus/utrace/lib/SdkConfigData$TraceCacheMetrics;", "traceLogCtrl", "Lcom/oplus/utrace/lib/SdkConfigData$TraceLogCtrl;", "hLogCtrl", "Lcom/oplus/utrace/lib/SdkConfigData$HLogCtrl;", "bindWindow", "", "expireTime", "(ZLcom/oplus/utrace/lib/SdkConfigData$FlowCtrl;Ljava/lang/String;ZLcom/oplus/utrace/lib/SdkConfigData$TraceCacheMetrics;Lcom/oplus/utrace/lib/SdkConfigData$TraceLogCtrl;Lcom/oplus/utrace/lib/SdkConfigData$HLogCtrl;JJ)V", "getBindWindow$annotations", "()V", "getBindWindow", "()J", "getExpireTime", "flowCtrlPt", "", "getFlowCtrlPt", "()Ljava/util/Map;", "getHLogCtrl", "()Lcom/oplus/utrace/lib/SdkConfigData$HLogCtrl;", "()Z", "getLogsDebuggable", "getOverflow$annotations", "getOverflow", "()Lcom/oplus/utrace/lib/SdkConfigData$FlowCtrl;", "getOverflowPt", "()Ljava/lang/String;", "getTraceCacheMetrics", "()Lcom/oplus/utrace/lib/SdkConfigData$TraceCacheMetrics;", "getTraceLogCtrl", "()Lcom/oplus/utrace/lib/SdkConfigData$TraceLogCtrl;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "diverse", "rhs", "equals", "other", "hashCode", "", "isExpired", "toJSONString", "toString", "writeToBundle", "", "bundle", "Landroid/os/Bundle;", "Companion", "FlowCtrl", "FlowCtrlPt0", "HLogCtrl", "TraceCacheMetrics", "TraceLogCtrl", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSdkConfigData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdkConfigData.kt\ncom/oplus/utrace/lib/SdkConfigData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,422:1\n1#2:423\n*E\n"})
public final /* data */ class SdkConfigData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private static final long DEFAULT_BIND_WINDOW;
    private static final long DEFAULT_EXPIRE_WINDOW;

    @NotNull
    private static final FlowCtrl DEFAULT_OVERFLOW;

    @NotNull
    private static final String KEY_BIND_WINDOW = "bind_window";

    @NotNull
    private static final String KEY_EXPIRE_TIME = "expire_time";

    @NotNull
    private static final String KEY_HLOG_CTRL = "hlog_ctrl";

    @NotNull
    private static final String KEY_LOGS_DEBUGGABLE = "logs_debuggable";

    @NotNull
    private static final String KEY_MAX_FLOW = "max_flow";

    @NotNull
    private static final String KEY_OVERFLOW_MAX = "overflow_max";

    @NotNull
    private static final String KEY_OVERFLOW_PT = "overflow_pt";

    @NotNull
    private static final String KEY_OVERFLOW_WINDOW = "overflow_window";

    @NotNull
    private static final String KEY_PATTERN = "pattern";

    @NotNull
    private static final String KEY_TRACE_CACHE_METRICS = "trace_cache_metrics";

    @NotNull
    private static final String KEY_TRACE_LOG_CTRL = "trace_log_ctrl";

    @NotNull
    private static final String KEY_WINDOW = "window";

    @NotNull
    private static final String TAG = "UTrace.Lib.SdkConfigData";
    private final long bindWindow;
    private final long expireTime;

    @NotNull
    private final Map<String, FlowCtrl> flowCtrlPt;

    @Nullable
    private final HLogCtrl hLogCtrl;
    private final boolean isEnabled;
    private final boolean logsDebuggable;

    @NotNull
    private final FlowCtrl overflow;

    @NotNull
    private final String overflowPt;

    @NotNull
    private final TraceCacheMetrics traceCacheMetrics;

    @NotNull
    private final TraceLogCtrl traceLogCtrl;

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001cH\u0007JX\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0004H\u0002J\u0010\u0010(\u001a\u0004\u0018\u00010\u001e2\u0006\u0010)\u001a\u00020*J\u0010\u0010+\u001a\u0004\u0018\u00010\u001e2\u0006\u0010,\u001a\u00020\rJ\u0017\u0010'\u001a\u00020\u00042\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.¢\u0006\u0002\u0010/J\b\u00100\u001a\u00020\u0004H\u0002J!\u00101\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b022\u0006\u0010,\u001a\u00020\rH\u0001¢\u0006\u0002\b3J\"\u00104\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b022\f\u00105\u001a\b\u0012\u0004\u0012\u00020706H\u0002J\u0016\u00108\u001a\b\u0012\u0004\u0012\u000207062\u0006\u0010,\u001a\u00020\rH\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u001c\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/oplus/utrace/lib/SdkConfigData$Companion;", "", "()V", "DEFAULT_BIND_WINDOW", "", "getDEFAULT_BIND_WINDOW$annotations", "DEFAULT_EXPIRE_WINDOW", "getDEFAULT_EXPIRE_WINDOW$annotations", "getDEFAULT_EXPIRE_WINDOW", "()J", "DEFAULT_OVERFLOW", "Lcom/oplus/utrace/lib/SdkConfigData$FlowCtrl;", "KEY_BIND_WINDOW", "", "KEY_EXPIRE_TIME", "KEY_HLOG_CTRL", "KEY_LOGS_DEBUGGABLE", "KEY_MAX_FLOW", "KEY_OVERFLOW_MAX", "KEY_OVERFLOW_PT", "KEY_OVERFLOW_WINDOW", "KEY_PATTERN", "KEY_TRACE_CACHE_METRICS", "KEY_TRACE_LOG_CTRL", "KEY_WINDOW", "TAG", "bindWindow", "useShortWindow", "", "create", "Lcom/oplus/utrace/lib/SdkConfigData;", "isEnabled", "overflowWindow", "overflowMax", "overflowPt", "logsDebuggable", "traceCacheMetrics", "traceLogCtrl", "hlogCtrl", "expireTime", "createFromBundle", "bundle", "Landroid/os/Bundle;", "createFromJSONString", "s", "longHours", "", "(Ljava/lang/Float;)J", "now", "parseOverflowPt", "", "parseOverflowPt$utrace_lib_release", "parseOverflowPtListToMap", "list", "", "Lcom/oplus/utrace/lib/SdkConfigData$FlowCtrlPt0;", "parseOverflowPtToList", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSdkConfigData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdkConfigData.kt\ncom/oplus/utrace/lib/SdkConfigData$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,422:1\n1#2:423\n1#2:434\n1#2:457\n1#2:460\n1603#3,9:424\n1855#3:433\n1856#3:435\n1612#3:436\n1603#3,9:437\n1855#3:446\n1603#3,9:447\n1855#3:456\n1856#3:458\n1612#3:459\n1856#3:461\n1612#3:462\n1855#3:463\n1855#3,2:464\n1856#3:466\n*S KotlinDebug\n*F\n+ 1 SdkConfigData.kt\ncom/oplus/utrace/lib/SdkConfigData$Companion\n*L\n353#1:434\n357#1:457\n355#1:460\n353#1:424,9\n353#1:433\n353#1:435\n353#1:436\n355#1:437,9\n355#1:446\n357#1:447,9\n357#1:456\n357#1:458\n357#1:459\n355#1:461\n355#1:462\n374#1:463\n376#1:464,2\n374#1:466\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final SdkConfigData create(boolean isEnabled, long overflowWindow, long overflowMax, String overflowPt, boolean logsDebuggable, String traceCacheMetrics, String traceLogCtrl, String hlogCtrl, long bindWindow, long expireTime) {
            return new SdkConfigData(isEnabled, new FlowCtrl(overflowWindow >= 1000 ? overflowWindow : 1000L, overflowMax <= 0 ? Long.MAX_VALUE : overflowMax), overflowPt, logsDebuggable, TraceCacheMetrics.INSTANCE.fromJsonString$utrace_lib_release(traceCacheMetrics), TraceLogCtrl.INSTANCE.fromJsonString$utrace_lib_release(traceLogCtrl), HLogCtrl.INSTANCE.fromJsonString(hlogCtrl), bindWindow < 60000 ? 60000L : bindWindow, expireTime);
        }

        public static /* synthetic */ long expireTime$default(Companion companion, Float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = null;
            }
            return companion.expireTime(f);
        }

        @Deprecated(message = "关联启动优化时废弃")
        private static /* synthetic */ void getDEFAULT_BIND_WINDOW$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getDEFAULT_EXPIRE_WINDOW$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long now() {
            return TimeSupplier.INSTANCE.getInstance().currentTimeMillis();
        }

        private final Map<String, FlowCtrl> parseOverflowPtListToMap(List<FlowCtrlPt0> list) {
            HashMap map = new HashMap();
            for (FlowCtrlPt0 flowCtrlPt0 : list) {
                FlowCtrl flowCtrl = new FlowCtrl(flowCtrlPt0.getWindow(), flowCtrlPt0.getMaxFlow());
                Iterator<T> it = flowCtrlPt0.getPatterns().iterator();
                while (it.hasNext()) {
                    map.put((String) it.next(), flowCtrl);
                }
            }
            return map;
        }

        private final List<FlowCtrlPt0> parseOverflowPtToList(String s) {
            Object obj;
            List listEmptyList;
            try {
                Result.Companion companion = Result.Companion;
                JSONArray jSONArray = new JSONArray(s);
                IntRange intRangeUntil = RangesKt.until(0, jSONArray.length());
                ArrayList<JSONObject> arrayList = new ArrayList();
                IntIterator it = intRangeUntil.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(it.nextInt());
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(jSONObjectOptJSONObject);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (JSONObject jSONObject : arrayList) {
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(SdkConfigData.KEY_PATTERN);
                    if (jSONArrayOptJSONArray != null) {
                        Intrinsics.checkNotNullExpressionValue(jSONArrayOptJSONArray, "optJSONArray(KEY_PATTERN)");
                        IntRange intRangeUntil2 = RangesKt.until(0, jSONArrayOptJSONArray.length());
                        listEmptyList = new ArrayList();
                        IntIterator it2 = intRangeUntil2.iterator();
                        while (it2.hasNext()) {
                            String strOptString = jSONArrayOptJSONArray.optString(it2.nextInt());
                            if (strOptString != null) {
                                listEmptyList.add(strOptString);
                            }
                        }
                    } else {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    List list = listEmptyList;
                    long jOptLong = jSONObject.optLong(SdkConfigData.KEY_WINDOW);
                    long jOptLong2 = jSONObject.optLong(SdkConfigData.KEY_MAX_FLOW);
                    FlowCtrlPt0 flowCtrlPt0 = (list.isEmpty() || jOptLong < 1000 || jOptLong2 <= 0) ? null : new FlowCtrlPt0(list, jOptLong, jOptLong2);
                    if (flowCtrlPt0 != null) {
                        arrayList2.add(flowCtrlPt0);
                    }
                }
                obj = Result.constructor-impl(arrayList2);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                Logs.INSTANCE.d(SdkConfigData.TAG, "parseOverflowPt() string=" + s + " exception=" + th2.getMessage(), th2);
            }
            List listEmptyList2 = CollectionsKt.emptyList();
            if (Result.isFailure-impl(obj)) {
                obj = listEmptyList2;
            }
            return (List) obj;
        }

        @Deprecated(message = "关联启动优化时废弃")
        public final long bindWindow(boolean useShortWindow) {
            if (useShortWindow) {
                return 60000L;
            }
            return ConstValuesKt.HOUR;
        }

        @Nullable
        public final SdkConfigData createFromBundle(@NotNull Bundle bundle) {
            Object obj;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            try {
                Result.Companion companion = Result.Companion;
                boolean z = bundle.getBoolean("is_enabled", false);
                long j = bundle.getLong(SdkConfigData.KEY_OVERFLOW_WINDOW, SdkConfigData.DEFAULT_OVERFLOW.getWindow());
                long j2 = bundle.getLong(SdkConfigData.KEY_OVERFLOW_MAX, SdkConfigData.DEFAULT_OVERFLOW.getMaxFlow());
                String string = bundle.getString(SdkConfigData.KEY_OVERFLOW_PT, SdkConfigConst.EMPTY_JSON_ARRAY);
                Intrinsics.checkNotNullExpressionValue(string, "bundle.getString(KEY_OVE…LOW_PT, EMPTY_JSON_ARRAY)");
                boolean z2 = bundle.getBoolean(SdkConfigData.KEY_LOGS_DEBUGGABLE, Logs.INSTANCE.getDebuggable());
                String string2 = bundle.getString(SdkConfigData.KEY_TRACE_CACHE_METRICS, "");
                Intrinsics.checkNotNullExpressionValue(string2, "bundle.getString(KEY_TRACE_CACHE_METRICS, \"\")");
                String string3 = bundle.getString(SdkConfigData.KEY_TRACE_LOG_CTRL, "");
                Intrinsics.checkNotNullExpressionValue(string3, "bundle.getString(KEY_TRACE_LOG_CTRL, \"\")");
                String string4 = bundle.getString(SdkConfigData.KEY_HLOG_CTRL, "");
                Intrinsics.checkNotNullExpressionValue(string4, "bundle.getString(KEY_HLOG_CTRL, \"\")");
                obj = Result.constructor-impl(create(z, j, j2, string, z2, string2, string3, string4, bundle.getLong(SdkConfigData.KEY_BIND_WINDOW, SdkConfigData.DEFAULT_BIND_WINDOW), bundle.getLong(SdkConfigData.KEY_EXPIRE_TIME, now())));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                Logs.INSTANCE.d(SdkConfigData.TAG, "createFromBundle() exception: " + th2.getMessage(), th2);
            }
            if (Result.isFailure-impl(obj)) {
                obj = null;
            }
            return (SdkConfigData) obj;
        }

        @Nullable
        public final SdkConfigData createFromJSONString(@NotNull String s) {
            Object obj;
            SdkConfigData sdkConfigDataCreate;
            Intrinsics.checkNotNullParameter(s, "s");
            try {
                Result.Companion companion = Result.Companion;
                String str = StringsKt.isBlank(s) ^ true ? s : null;
                if (str != null) {
                    JSONObject jSONObject = new JSONObject(str);
                    boolean zOptBoolean = jSONObject.optBoolean("is_enabled", false);
                    long jOptLong = jSONObject.optLong(SdkConfigData.KEY_OVERFLOW_WINDOW, SdkConfigData.DEFAULT_OVERFLOW.getWindow());
                    long jOptLong2 = jSONObject.optLong(SdkConfigData.KEY_OVERFLOW_MAX, SdkConfigData.DEFAULT_OVERFLOW.getMaxFlow());
                    String strOptString = jSONObject.optString(SdkConfigData.KEY_OVERFLOW_PT, SdkConfigConst.EMPTY_JSON_ARRAY);
                    Intrinsics.checkNotNullExpressionValue(strOptString, "it.optString(KEY_OVERFLOW_PT, EMPTY_JSON_ARRAY)");
                    boolean zOptBoolean2 = jSONObject.optBoolean(SdkConfigData.KEY_LOGS_DEBUGGABLE, Logs.INSTANCE.getDebuggable());
                    String strOptString2 = jSONObject.optString(SdkConfigData.KEY_TRACE_CACHE_METRICS, "");
                    Intrinsics.checkNotNullExpressionValue(strOptString2, "it.optString(KEY_TRACE_CACHE_METRICS, \"\")");
                    String strOptString3 = jSONObject.optString(SdkConfigData.KEY_TRACE_LOG_CTRL, "");
                    Intrinsics.checkNotNullExpressionValue(strOptString3, "it.optString(KEY_TRACE_LOG_CTRL, \"\")");
                    String strOptString4 = jSONObject.optString(SdkConfigData.KEY_HLOG_CTRL, "");
                    Intrinsics.checkNotNullExpressionValue(strOptString4, "it.optString(KEY_HLOG_CTRL, \"\")");
                    sdkConfigDataCreate = create(zOptBoolean, jOptLong, jOptLong2, strOptString, zOptBoolean2, strOptString2, strOptString3, strOptString4, jSONObject.optLong(SdkConfigData.KEY_BIND_WINDOW, SdkConfigData.DEFAULT_BIND_WINDOW), jSONObject.optLong(SdkConfigData.KEY_EXPIRE_TIME, now()));
                } else {
                    sdkConfigDataCreate = null;
                }
                obj = Result.constructor-impl(sdkConfigDataCreate);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                Logs.INSTANCE.d(SdkConfigData.TAG, "createFromJSONString() string='" + s + "' exception='" + th2.getMessage() + '\'', th2);
            }
            return (SdkConfigData) (Result.isFailure-impl(obj) ? null : obj);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x001f  */
        public final long expireTime(@Nullable Float longHours) {
            long default_expire_window;
            if (longHours == null) {
                default_expire_window = getDEFAULT_EXPIRE_WINDOW();
            } else {
                if (!(longHours.floatValue() > vr3.UNSET)) {
                    longHours = null;
                }
                if (longHours != null) {
                    default_expire_window = (long) (longHours.floatValue() * ConstValuesKt.HOUR);
                } else {
                    default_expire_window = getDEFAULT_EXPIRE_WINDOW();
                }
            }
            return now() + default_expire_window;
        }

        public final long getDEFAULT_EXPIRE_WINDOW() {
            return SdkConfigData.DEFAULT_EXPIRE_WINDOW;
        }

        @VisibleForTesting
        @NotNull
        public final Map<String, FlowCtrl> parseOverflowPt$utrace_lib_release(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "s");
            return parseOverflowPtListToMap(parseOverflowPtToList(s));
        }
    }

    @Deprecated(message = "没有在用")
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/oplus/utrace/lib/SdkConfigData$FlowCtrl;", "", SdkConfigData.KEY_WINDOW, "", "maxFlow", "(JJ)V", "getMaxFlow", "()J", "getWindow", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class FlowCtrl {
        private final long maxFlow;
        private final long window;

        public FlowCtrl() {
            this(0L, 0L, 3, null);
        }

        public static /* synthetic */ FlowCtrl copy$default(FlowCtrl flowCtrl, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = flowCtrl.window;
            }
            if ((i & 2) != 0) {
                j2 = flowCtrl.maxFlow;
            }
            return flowCtrl.copy(j, j2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getWindow() {
            return this.window;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getMaxFlow() {
            return this.maxFlow;
        }

        @NotNull
        public final FlowCtrl copy(long window, long maxFlow) {
            return new FlowCtrl(window, maxFlow);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FlowCtrl)) {
                return false;
            }
            FlowCtrl flowCtrl = (FlowCtrl) other;
            return this.window == flowCtrl.window && this.maxFlow == flowCtrl.maxFlow;
        }

        public final long getMaxFlow() {
            return this.maxFlow;
        }

        public final long getWindow() {
            return this.window;
        }

        public int hashCode() {
            return (Long.hashCode(this.window) * 31) + Long.hashCode(this.maxFlow);
        }

        @NotNull
        public String toString() {
            return "FlowCtrl(window=" + this.window + ", maxFlow=" + this.maxFlow + ')';
        }

        public FlowCtrl(long j, long j2) {
            this.window = j;
            this.maxFlow = j2;
        }

        public /* synthetic */ FlowCtrl(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 86400000L : j, (i & 2) != 0 ? Long.MAX_VALUE : j2);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/oplus/utrace/lib/SdkConfigData$FlowCtrlPt0;", "", "patterns", "", "", SdkConfigData.KEY_WINDOW, "", "maxFlow", "(Ljava/util/List;JJ)V", "getMaxFlow", "()J", "getPatterns", "()Ljava/util/List;", "getWindow", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class FlowCtrlPt0 {
        private final long maxFlow;

        @NotNull
        private final List<String> patterns;
        private final long window;

        public FlowCtrlPt0() {
            this(null, 0L, 0L, 7, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FlowCtrlPt0 copy$default(FlowCtrlPt0 flowCtrlPt0, List list, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = flowCtrlPt0.patterns;
            }
            if ((i & 2) != 0) {
                j = flowCtrlPt0.window;
            }
            long j3 = j;
            if ((i & 4) != 0) {
                j2 = flowCtrlPt0.maxFlow;
            }
            return flowCtrlPt0.copy(list, j3, j2);
        }

        @NotNull
        public final List<String> component1() {
            return this.patterns;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getWindow() {
            return this.window;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getMaxFlow() {
            return this.maxFlow;
        }

        @NotNull
        public final FlowCtrlPt0 copy(@NotNull List<String> patterns, long window, long maxFlow) {
            Intrinsics.checkNotNullParameter(patterns, "patterns");
            return new FlowCtrlPt0(patterns, window, maxFlow);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FlowCtrlPt0)) {
                return false;
            }
            FlowCtrlPt0 flowCtrlPt0 = (FlowCtrlPt0) other;
            return Intrinsics.areEqual(this.patterns, flowCtrlPt0.patterns) && this.window == flowCtrlPt0.window && this.maxFlow == flowCtrlPt0.maxFlow;
        }

        public final long getMaxFlow() {
            return this.maxFlow;
        }

        @NotNull
        public final List<String> getPatterns() {
            return this.patterns;
        }

        public final long getWindow() {
            return this.window;
        }

        public int hashCode() {
            return (((this.patterns.hashCode() * 31) + Long.hashCode(this.window)) * 31) + Long.hashCode(this.maxFlow);
        }

        @NotNull
        public String toString() {
            return "FlowCtrlPt0(patterns=" + this.patterns + ", window=" + this.window + ", maxFlow=" + this.maxFlow + ')';
        }

        public FlowCtrlPt0(@NotNull List<String> list, long j, long j2) {
            Intrinsics.checkNotNullParameter(list, "patterns");
            this.patterns = list;
            this.window = j;
            this.maxFlow = j2;
        }

        public /* synthetic */ FlowCtrlPt0(List list, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? 86400000L : j, (i & 4) != 0 ? Long.MAX_VALUE : j2);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0001'BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003JE\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\u0006\u0010$\u001a\u00020%J\t\u0010&\u001a\u00020%HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000e¨\u0006("}, d2 = {"Lcom/oplus/utrace/lib/SdkConfigData$HLogCtrl;", "", "logEnabled", "", "expireDays", "", "maxLogFilesMB", "maxLogFileSizeMB", "logEnabledV2", "expireDaysV2", "(ZIIIZI)V", "getExpireDays$annotations", "()V", "getExpireDays", "()I", "getExpireDaysV2", "hlogEnv", "getHlogEnv", "setHlogEnv", "(I)V", "getLogEnabled$annotations", "getLogEnabled", "()Z", "getLogEnabledV2", "getMaxLogFileSizeMB", "getMaxLogFilesMB", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toJsonString", "", "toString", "Companion", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class HLogCtrl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final int expireDays;
        private final int expireDaysV2;
        private int hlogEnv;
        private final boolean logEnabled;
        private final boolean logEnabledV2;
        private final int maxLogFileSizeMB;
        private final int maxLogFilesMB;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/utrace/lib/SdkConfigData$HLogCtrl$Companion;", "", "()V", "fromJsonString", "Lcom/oplus/utrace/lib/SdkConfigData$HLogCtrl;", "str", "", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nSdkConfigData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdkConfigData.kt\ncom/oplus/utrace/lib/SdkConfigData$HLogCtrl$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,422:1\n1#2:423\n*E\n"})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final HLogCtrl fromJsonString(@NotNull String str) {
                Object obj;
                Intrinsics.checkNotNullParameter(str, "str");
                if (!(!StringsKt.isBlank(str))) {
                    str = null;
                }
                if (str == null) {
                    return null;
                }
                try {
                    Result.Companion companion = Result.Companion;
                    obj = Result.constructor-impl(new JSONObject(str));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                }
                if (Result.isFailure-impl(obj)) {
                    obj = null;
                }
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject == null) {
                    return null;
                }
                boolean zOptBoolean = jSONObject.optBoolean(HLogConst.KEY_LOG_ENABLED, false);
                boolean zOptBoolean2 = jSONObject.optBoolean(HLogConst.KEY_LOG_ENABLED_V2, zOptBoolean);
                Integer numValueOf = Integer.valueOf(jSONObject.optInt(HLogConst.KEY_LOG_EXPIRE_DAYS, 0));
                if (!(numValueOf.intValue() > 0)) {
                    numValueOf = null;
                }
                int iIntValue = numValueOf != null ? numValueOf.intValue() : 7;
                Integer numValueOf2 = Integer.valueOf(jSONObject.optInt(HLogConst.KEY_LOG_EXPIRE_DAYS_V2, iIntValue));
                if (!(numValueOf2.intValue() > 0)) {
                    numValueOf2 = null;
                }
                int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 7;
                Integer numValueOf3 = Integer.valueOf(jSONObject.optInt(HLogConst.KEY_MAX_LOG_FILES_MB, 0));
                if (!(numValueOf3.intValue() > 0)) {
                    numValueOf3 = null;
                }
                int iIntValue3 = numValueOf3 != null ? numValueOf3.intValue() : 500;
                Integer numValueOf4 = Integer.valueOf(jSONObject.optInt(HLogConst.KEY_MAX_LOG_FILE_SIZE_MB, 0));
                int iIntValue4 = numValueOf4.intValue();
                IntRange log_file_size_mb_range = HLogConst.INSTANCE.getLOG_FILE_SIZE_MB_RANGE();
                Integer num = iIntValue4 <= log_file_size_mb_range.getLast() && log_file_size_mb_range.getFirst() <= iIntValue4 ? numValueOf4 : null;
                int iIntValue5 = num != null ? num.intValue() : 4;
                int iOptInt = jSONObject.optInt(HLogConst.KEY_HLOG_CONFIG_ENV, -1);
                HLogCtrl hLogCtrl = new HLogCtrl(zOptBoolean, iIntValue, iIntValue3, iIntValue5, zOptBoolean2, iIntValue2);
                hLogCtrl.setHlogEnv(iOptInt);
                return hLogCtrl;
            }
        }

        public HLogCtrl() {
            this(false, 0, 0, 0, false, 0, 63, null);
        }

        public static /* synthetic */ HLogCtrl copy$default(HLogCtrl hLogCtrl, boolean z, int i, int i2, int i3, boolean z2, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                z = hLogCtrl.logEnabled;
            }
            if ((i5 & 2) != 0) {
                i = hLogCtrl.expireDays;
            }
            int i6 = i;
            if ((i5 & 4) != 0) {
                i2 = hLogCtrl.maxLogFilesMB;
            }
            int i7 = i2;
            if ((i5 & 8) != 0) {
                i3 = hLogCtrl.maxLogFileSizeMB;
            }
            int i8 = i3;
            if ((i5 & 16) != 0) {
                z2 = hLogCtrl.logEnabledV2;
            }
            boolean z3 = z2;
            if ((i5 & 32) != 0) {
                i4 = hLogCtrl.expireDaysV2;
            }
            return hLogCtrl.copy(z, i6, i7, i8, z3, i4);
        }

        @Deprecated(message = "改用expireDaysV2，本变量仅为兼容性而保留")
        public static /* synthetic */ void getExpireDays$annotations() {
        }

        @Deprecated(message = "改用logEnabledV2，本变量仅为兼容性而保留")
        public static /* synthetic */ void getLogEnabled$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getLogEnabled() {
            return this.logEnabled;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getExpireDays() {
            return this.expireDays;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getMaxLogFilesMB() {
            return this.maxLogFilesMB;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getMaxLogFileSizeMB() {
            return this.maxLogFileSizeMB;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getLogEnabledV2() {
            return this.logEnabledV2;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getExpireDaysV2() {
            return this.expireDaysV2;
        }

        @NotNull
        public final HLogCtrl copy(boolean logEnabled, int expireDays, int maxLogFilesMB, int maxLogFileSizeMB, boolean logEnabledV2, int expireDaysV2) {
            return new HLogCtrl(logEnabled, expireDays, maxLogFilesMB, maxLogFileSizeMB, logEnabledV2, expireDaysV2);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HLogCtrl)) {
                return false;
            }
            HLogCtrl hLogCtrl = (HLogCtrl) other;
            return this.logEnabled == hLogCtrl.logEnabled && this.expireDays == hLogCtrl.expireDays && this.maxLogFilesMB == hLogCtrl.maxLogFilesMB && this.maxLogFileSizeMB == hLogCtrl.maxLogFileSizeMB && this.logEnabledV2 == hLogCtrl.logEnabledV2 && this.expireDaysV2 == hLogCtrl.expireDaysV2;
        }

        @VisibleForTesting
        public final int getExpireDays() {
            return this.expireDays;
        }

        public final int getExpireDaysV2() {
            return this.expireDaysV2;
        }

        public final int getHlogEnv() {
            return this.hlogEnv;
        }

        @VisibleForTesting
        public final boolean getLogEnabled() {
            return this.logEnabled;
        }

        public final boolean getLogEnabledV2() {
            return this.logEnabledV2;
        }

        public final int getMaxLogFileSizeMB() {
            return this.maxLogFileSizeMB;
        }

        public final int getMaxLogFilesMB() {
            return this.maxLogFilesMB;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r0v9, types: [int] */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        public int hashCode() {
            boolean z = this.logEnabled;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int iHashCode = ((((((r0 * 31) + Integer.hashCode(this.expireDays)) * 31) + Integer.hashCode(this.maxLogFilesMB)) * 31) + Integer.hashCode(this.maxLogFileSizeMB)) * 31;
            boolean z2 = this.logEnabledV2;
            return ((iHashCode + (z2 ? 1 : z2)) * 31) + Integer.hashCode(this.expireDaysV2);
        }

        public final void setHlogEnv(int i) {
            this.hlogEnv = i;
        }

        @NotNull
        public final String toJsonString() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(HLogConst.KEY_LOG_ENABLED, this.logEnabled);
            jSONObject.put(HLogConst.KEY_LOG_ENABLED_V2, this.logEnabledV2);
            jSONObject.put(HLogConst.KEY_LOG_EXPIRE_DAYS, this.expireDays);
            jSONObject.put(HLogConst.KEY_LOG_EXPIRE_DAYS_V2, this.expireDaysV2);
            jSONObject.put(HLogConst.KEY_MAX_LOG_FILES_MB, this.maxLogFilesMB);
            jSONObject.put(HLogConst.KEY_MAX_LOG_FILE_SIZE_MB, this.maxLogFileSizeMB);
            jSONObject.put(HLogConst.KEY_HLOG_CONFIG_ENV, this.hlogEnv);
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "JSONObject().also {\n    …Env)\n        }.toString()");
            return string;
        }

        @NotNull
        public String toString() {
            return "HLogCtrl(logEnabled=" + this.logEnabled + ", expireDays=" + this.expireDays + ", maxLogFilesMB=" + this.maxLogFilesMB + ", maxLogFileSizeMB=" + this.maxLogFileSizeMB + ", logEnabledV2=" + this.logEnabledV2 + ", expireDaysV2=" + this.expireDaysV2 + ')';
        }

        public HLogCtrl(boolean z, int i, int i2, int i3, boolean z2, int i4) {
            this.logEnabled = z;
            this.expireDays = i;
            this.maxLogFilesMB = i2;
            this.maxLogFileSizeMB = i3;
            this.logEnabledV2 = z2;
            this.expireDaysV2 = i4;
            this.hlogEnv = -1;
        }

        public /* synthetic */ HLogCtrl(boolean z, int i, int i2, int i3, boolean z2, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? false : z, (i5 & 2) != 0 ? 7 : i, (i5 & 4) != 0 ? 500 : i2, (i5 & 8) != 0 ? 4 : i3, (i5 & 16) != 0 ? false : z2, (i5 & 32) != 0 ? 7 : i4);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000 02\u00020\u0001:\u00010BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\u001d\u0010(\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010\u00062\u0006\u0010*\u001a\u00020%¢\u0006\u0002\u0010+J\r\u0010,\u001a\u00020-H\u0000¢\u0006\u0002\b.J\t\u0010/\u001a\u00020-HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017¨\u00061"}, d2 = {"Lcom/oplus/utrace/lib/SdkConfigData$TraceCacheMetrics;", "", "maxPendingRecordsL1", "", "maxPendingRecordsL2", "delayAddTraceList", "", "spanNameCacheSize", "dbCacheWindow", "dbSendWindow", "dbExpireWindow", "dbDelaySend", "(IIJIJJJJ)V", "getDbCacheWindow", "()J", "getDbDelaySend", "getDbExpireWindow", "getDbSendWindow", "getDelayAddTraceList$annotations", "()V", "getDelayAddTraceList", "getMaxPendingRecordsL1$annotations", "getMaxPendingRecordsL1", "()I", "getMaxPendingRecordsL2$annotations", "getMaxPendingRecordsL2", "getSpanNameCacheSize", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "overrideDBCacheWindow", SdkConfigData.KEY_WINDOW, "short", "(Ljava/lang/Long;Z)Lcom/oplus/utrace/lib/SdkConfigData$TraceCacheMetrics;", "toJsonString", "", "toJsonString$utrace_lib_release", "toString", "Companion", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class TraceCacheMetrics {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        private static final long DEFAULT_DB_CACHE_WINDOW;
        public static final long DEFAULT_DB_DELAY_SEND = 300000;
        private static final int DEFAULT_DB_EXPIRE_MP = 6;
        private static final long DEFAULT_DB_EXPIRE_WINDOW;
        private static final long DEFAULT_DB_SEND_WINDOW;
        public static final long DEFAULT_DEV_TIME_OUT = 900000;
        private static final int DEFAULT_SPAN_NAME_CACHE_SIZE = 600;
        private static final long DELAY_ADDTRACE_LIST = 500;
        private static final int INVALID_VALUE = 0;

        @NotNull
        private static final String KEY_DB_CACHE_WINDOW = "key_db_cache_window";

        @NotNull
        private static final String KEY_DB_DELAY_SEND = "key_db_delay_send";

        @NotNull
        private static final String KEY_DB_EXPIRE_WINDOW = "key_db_expire_window";

        @NotNull
        private static final String KEY_DB_SEND_WINDOW = "key_db_send_window";

        @NotNull
        private static final String KEY_DELAY_ADDTRACE_LIST = "key_delay_addtrace_list";

        @NotNull
        private static final String KEY_MAX_PENDING_RECORDS_L1 = "key_max_pending_records_l1";

        @NotNull
        private static final String KEY_MAX_PENDING_RECORDS_L2 = "key_max_pending_records_l2";

        @NotNull
        private static final String KEY_SPAN_NAME_CACHE_SIZE = "key_span_name_cache_size";
        private static final int MAX_PENDING_RECORDS_L1 = 1000;
        private static final int MAX_PENDING_RECORDS_L2 = 50;
        private static final int MAX_SPAN_NAME_CACHE_SIZE = 1000;
        private static final int MIN_SPAN_NAME_CACHE_SIZE = 50;
        private final long dbCacheWindow;
        private final long dbDelaySend;
        private final long dbExpireWindow;
        private final long dbSendWindow;
        private final long delayAddTraceList;
        private final int maxPendingRecordsL1;
        private final int maxPendingRecordsL2;
        private final int spanNameCacheSize;

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0016H\u0000¢\u0006\u0002\b%J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020(H\u0002J\u001f\u0010)\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010\u00042\u0006\u0010'\u001a\u00020(H\u0002¢\u0006\u0002\u0010+J\u001f\u0010,\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010\u00042\u0006\u0010'\u001a\u00020(H\u0002¢\u0006\u0002\u0010+R\u001c\u0010\u0003\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/oplus/utrace/lib/SdkConfigData$TraceCacheMetrics$Companion;", "", "()V", "DEFAULT_DB_CACHE_WINDOW", "", "getDEFAULT_DB_CACHE_WINDOW$utrace_lib_release$annotations", "getDEFAULT_DB_CACHE_WINDOW$utrace_lib_release", "()J", "DEFAULT_DB_DELAY_SEND", "getDEFAULT_DB_DELAY_SEND$utrace_lib_release$annotations", "DEFAULT_DB_EXPIRE_MP", "", "DEFAULT_DB_EXPIRE_WINDOW", "getDEFAULT_DB_EXPIRE_WINDOW$utrace_lib_release$annotations", "getDEFAULT_DB_EXPIRE_WINDOW$utrace_lib_release", "DEFAULT_DB_SEND_WINDOW", "getDEFAULT_DB_SEND_WINDOW", "DEFAULT_DEV_TIME_OUT", "DEFAULT_SPAN_NAME_CACHE_SIZE", "DELAY_ADDTRACE_LIST", "INVALID_VALUE", "KEY_DB_CACHE_WINDOW", "", "KEY_DB_DELAY_SEND", "KEY_DB_EXPIRE_WINDOW", "KEY_DB_SEND_WINDOW", "KEY_DELAY_ADDTRACE_LIST", "KEY_MAX_PENDING_RECORDS_L1", "KEY_MAX_PENDING_RECORDS_L2", "KEY_SPAN_NAME_CACHE_SIZE", "MAX_PENDING_RECORDS_L1", "MAX_PENDING_RECORDS_L2", "MAX_SPAN_NAME_CACHE_SIZE", "MIN_SPAN_NAME_CACHE_SIZE", "fromJsonString", "Lcom/oplus/utrace/lib/SdkConfigData$TraceCacheMetrics;", "str", "fromJsonString$utrace_lib_release", "getDBCacheWindow", "short", "", "getDBExpireWindow", "dbCacheWindow", "(Ljava/lang/Long;Z)J", "getDBSendWindow", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nSdkConfigData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdkConfigData.kt\ncom/oplus/utrace/lib/SdkConfigData$TraceCacheMetrics$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,422:1\n1#2:423\n*E\n"})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final long getDBCacheWindow(boolean z) {
                Integer num = 0;
                num = num.intValue() > 0 ? 0 : null;
                if (num != null) {
                    return ((long) num.intValue()) * 60000;
                }
                if (z) {
                    return 120000L;
                }
                return ConstValuesKt.HOUR;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final long getDBExpireWindow(Long dbCacheWindow, boolean z) {
                return (dbCacheWindow != null ? dbCacheWindow.longValue() : getDBCacheWindow(z)) * ((long) 6);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final long getDBSendWindow(Long dbCacheWindow, boolean z) {
                return dbCacheWindow != null ? dbCacheWindow.longValue() : getDBCacheWindow(z);
            }

            @VisibleForTesting
            public static /* synthetic */ void getDEFAULT_DB_CACHE_WINDOW$utrace_lib_release$annotations() {
            }

            @VisibleForTesting
            public static /* synthetic */ void getDEFAULT_DB_DELAY_SEND$utrace_lib_release$annotations() {
            }

            @VisibleForTesting
            public static /* synthetic */ void getDEFAULT_DB_EXPIRE_WINDOW$utrace_lib_release$annotations() {
            }

            @NotNull
            public final TraceCacheMetrics fromJsonString$utrace_lib_release(@NotNull String str) {
                Object obj;
                String str2 = str;
                Intrinsics.checkNotNullParameter(str2, "str");
                if (!(!StringsKt.isBlank(str))) {
                    str2 = null;
                }
                if (str2 != null) {
                    Companion companion = TraceCacheMetrics.INSTANCE;
                    try {
                        Result.Companion companion2 = Result.Companion;
                        obj = Result.constructor-impl(new JSONObject(str2));
                    } catch (Throwable th) {
                        Result.Companion companion3 = Result.Companion;
                        obj = Result.constructor-impl(ResultKt.createFailure(th));
                    }
                    if (Result.isFailure-impl(obj)) {
                        obj = null;
                    }
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject != null) {
                        Integer numValueOf = Integer.valueOf(jSONObject.optInt(TraceCacheMetrics.KEY_MAX_PENDING_RECORDS_L1, 0));
                        if (!(numValueOf.intValue() > 0)) {
                            numValueOf = null;
                        }
                        int iIntValue = numValueOf != null ? numValueOf.intValue() : 1000;
                        Integer numValueOf2 = Integer.valueOf(jSONObject.optInt(TraceCacheMetrics.KEY_MAX_PENDING_RECORDS_L2, 0));
                        if (!(numValueOf2.intValue() > 0)) {
                            numValueOf2 = null;
                        }
                        int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 50;
                        Long lValueOf = Long.valueOf(jSONObject.optLong(TraceCacheMetrics.KEY_DELAY_ADDTRACE_LIST, 0L));
                        if (!(lValueOf.longValue() > 0)) {
                            lValueOf = null;
                        }
                        long jLongValue = lValueOf != null ? lValueOf.longValue() : TraceCacheMetrics.DELAY_ADDTRACE_LIST;
                        Integer numValueOf3 = Integer.valueOf(jSONObject.optInt(TraceCacheMetrics.KEY_SPAN_NAME_CACHE_SIZE, TraceCacheMetrics.DEFAULT_SPAN_NAME_CACHE_SIZE));
                        int iIntValue3 = numValueOf3.intValue();
                        if (!(50 <= iIntValue3 && iIntValue3 < 1001)) {
                            numValueOf3 = null;
                        }
                        int iIntValue4 = numValueOf3 != null ? numValueOf3.intValue() : TraceCacheMetrics.DEFAULT_SPAN_NAME_CACHE_SIZE;
                        Long lValueOf2 = Long.valueOf(jSONObject.optLong(TraceCacheMetrics.KEY_DB_CACHE_WINDOW, 0L));
                        if (!(lValueOf2.longValue() >= 60000)) {
                            lValueOf2 = null;
                        }
                        long jLongValue2 = lValueOf2 != null ? lValueOf2.longValue() : TraceCacheMetrics.INSTANCE.getDEFAULT_DB_CACHE_WINDOW$utrace_lib_release();
                        Long lValueOf3 = Long.valueOf(jSONObject.optLong(TraceCacheMetrics.KEY_DB_SEND_WINDOW, 0L));
                        if (!(lValueOf3.longValue() >= 60000)) {
                            lValueOf3 = null;
                        }
                        long jLongValue3 = lValueOf3 != null ? lValueOf3.longValue() : TraceCacheMetrics.INSTANCE.getDEFAULT_DB_SEND_WINDOW();
                        Long lValueOf4 = Long.valueOf(jSONObject.optLong(TraceCacheMetrics.KEY_DB_EXPIRE_WINDOW, 0L));
                        if (!(lValueOf4.longValue() >= 60000)) {
                            lValueOf4 = null;
                        }
                        long jLongValue4 = lValueOf4 != null ? lValueOf4.longValue() : TraceCacheMetrics.INSTANCE.getDEFAULT_DB_EXPIRE_WINDOW$utrace_lib_release();
                        Long lValueOf5 = Long.valueOf(jSONObject.optLong(TraceCacheMetrics.KEY_DB_DELAY_SEND, 300000L));
                        Long l = lValueOf5.longValue() > 0 ? lValueOf5 : null;
                        return new TraceCacheMetrics(iIntValue, iIntValue2, jLongValue, iIntValue4, jLongValue2, jLongValue3, jLongValue4, l != null ? l.longValue() : 300000L);
                    }
                }
                return new TraceCacheMetrics(0, 0, 0L, 0, 0L, 0L, 0L, 0L, 255, null);
            }

            public final long getDEFAULT_DB_CACHE_WINDOW$utrace_lib_release() {
                return TraceCacheMetrics.DEFAULT_DB_CACHE_WINDOW;
            }

            public final long getDEFAULT_DB_EXPIRE_WINDOW$utrace_lib_release() {
                return TraceCacheMetrics.DEFAULT_DB_EXPIRE_WINDOW;
            }

            public final long getDEFAULT_DB_SEND_WINDOW() {
                return TraceCacheMetrics.DEFAULT_DB_SEND_WINDOW;
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            long dBCacheWindow = companion.getDBCacheWindow(false);
            DEFAULT_DB_CACHE_WINDOW = dBCacheWindow;
            DEFAULT_DB_SEND_WINDOW = companion.getDBSendWindow(Long.valueOf(dBCacheWindow), false);
            DEFAULT_DB_EXPIRE_WINDOW = companion.getDBExpireWindow(Long.valueOf(dBCacheWindow), false);
        }

        public TraceCacheMetrics() {
            this(0, 0, 0L, 0, 0L, 0L, 0L, 0L, 255, null);
        }

        public static /* synthetic */ TraceCacheMetrics copy$default(TraceCacheMetrics traceCacheMetrics, int i, int i2, long j, int i3, long j2, long j3, long j4, long j5, int i4, Object obj) {
            return traceCacheMetrics.copy((i4 & 1) != 0 ? traceCacheMetrics.maxPendingRecordsL1 : i, (i4 & 2) != 0 ? traceCacheMetrics.maxPendingRecordsL2 : i2, (i4 & 4) != 0 ? traceCacheMetrics.delayAddTraceList : j, (i4 & 8) != 0 ? traceCacheMetrics.spanNameCacheSize : i3, (i4 & 16) != 0 ? traceCacheMetrics.dbCacheWindow : j2, (i4 & 32) != 0 ? traceCacheMetrics.dbSendWindow : j3, (i4 & 64) != 0 ? traceCacheMetrics.dbExpireWindow : j4, (i4 & 128) != 0 ? traceCacheMetrics.dbDelaySend : j5);
        }

        @Deprecated(message = "兼容关联启动优化前的版本")
        public static /* synthetic */ void getDelayAddTraceList$annotations() {
        }

        @Deprecated(message = "兼容关联启动优化前的版本")
        public static /* synthetic */ void getMaxPendingRecordsL1$annotations() {
        }

        @Deprecated(message = "兼容关联启动优化前的版本")
        public static /* synthetic */ void getMaxPendingRecordsL2$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMaxPendingRecordsL1() {
            return this.maxPendingRecordsL1;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getMaxPendingRecordsL2() {
            return this.maxPendingRecordsL2;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getDelayAddTraceList() {
            return this.delayAddTraceList;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getSpanNameCacheSize() {
            return this.spanNameCacheSize;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getDbCacheWindow() {
            return this.dbCacheWindow;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final long getDbSendWindow() {
            return this.dbSendWindow;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final long getDbExpireWindow() {
            return this.dbExpireWindow;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final long getDbDelaySend() {
            return this.dbDelaySend;
        }

        @NotNull
        public final TraceCacheMetrics copy(int maxPendingRecordsL1, int maxPendingRecordsL2, long delayAddTraceList, int spanNameCacheSize, long dbCacheWindow, long dbSendWindow, long dbExpireWindow, long dbDelaySend) {
            return new TraceCacheMetrics(maxPendingRecordsL1, maxPendingRecordsL2, delayAddTraceList, spanNameCacheSize, dbCacheWindow, dbSendWindow, dbExpireWindow, dbDelaySend);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TraceCacheMetrics)) {
                return false;
            }
            TraceCacheMetrics traceCacheMetrics = (TraceCacheMetrics) other;
            return this.maxPendingRecordsL1 == traceCacheMetrics.maxPendingRecordsL1 && this.maxPendingRecordsL2 == traceCacheMetrics.maxPendingRecordsL2 && this.delayAddTraceList == traceCacheMetrics.delayAddTraceList && this.spanNameCacheSize == traceCacheMetrics.spanNameCacheSize && this.dbCacheWindow == traceCacheMetrics.dbCacheWindow && this.dbSendWindow == traceCacheMetrics.dbSendWindow && this.dbExpireWindow == traceCacheMetrics.dbExpireWindow && this.dbDelaySend == traceCacheMetrics.dbDelaySend;
        }

        public final long getDbCacheWindow() {
            return this.dbCacheWindow;
        }

        public final long getDbDelaySend() {
            return this.dbDelaySend;
        }

        public final long getDbExpireWindow() {
            return this.dbExpireWindow;
        }

        public final long getDbSendWindow() {
            return this.dbSendWindow;
        }

        public final long getDelayAddTraceList() {
            return this.delayAddTraceList;
        }

        public final int getMaxPendingRecordsL1() {
            return this.maxPendingRecordsL1;
        }

        public final int getMaxPendingRecordsL2() {
            return this.maxPendingRecordsL2;
        }

        public final int getSpanNameCacheSize() {
            return this.spanNameCacheSize;
        }

        public int hashCode() {
            return (((((((((((((Integer.hashCode(this.maxPendingRecordsL1) * 31) + Integer.hashCode(this.maxPendingRecordsL2)) * 31) + Long.hashCode(this.delayAddTraceList)) * 31) + Integer.hashCode(this.spanNameCacheSize)) * 31) + Long.hashCode(this.dbCacheWindow)) * 31) + Long.hashCode(this.dbSendWindow)) * 31) + Long.hashCode(this.dbExpireWindow)) * 31) + Long.hashCode(this.dbDelaySend);
        }

        @NotNull
        public final TraceCacheMetrics overrideDBCacheWindow(@Nullable Long window, boolean z) {
            long jLongValue = window != null ? window.longValue() : INSTANCE.getDBCacheWindow(z);
            Companion companion = INSTANCE;
            return copy$default(this, 0, 0, 0L, 0, jLongValue, companion.getDBSendWindow(Long.valueOf(jLongValue), z), companion.getDBExpireWindow(Long.valueOf(jLongValue), z), 0L, 143, null);
        }

        @NotNull
        public final String toJsonString$utrace_lib_release() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(KEY_MAX_PENDING_RECORDS_L1, this.maxPendingRecordsL1);
            jSONObject.put(KEY_MAX_PENDING_RECORDS_L2, this.maxPendingRecordsL2);
            jSONObject.put(KEY_DELAY_ADDTRACE_LIST, this.delayAddTraceList);
            jSONObject.put(KEY_SPAN_NAME_CACHE_SIZE, this.spanNameCacheSize);
            jSONObject.put(KEY_DB_CACHE_WINDOW, this.dbCacheWindow);
            jSONObject.put(KEY_DB_SEND_WINDOW, this.dbSendWindow);
            jSONObject.put(KEY_DB_EXPIRE_WINDOW, this.dbExpireWindow);
            jSONObject.put(KEY_DB_DELAY_SEND, this.dbDelaySend);
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "JSONObject().also {\n    …end)\n        }.toString()");
            return string;
        }

        @NotNull
        public String toString() {
            return "TraceCacheMetrics(maxPendingRecordsL1=" + this.maxPendingRecordsL1 + ", maxPendingRecordsL2=" + this.maxPendingRecordsL2 + ", delayAddTraceList=" + this.delayAddTraceList + ", spanNameCacheSize=" + this.spanNameCacheSize + ", dbCacheWindow=" + this.dbCacheWindow + ", dbSendWindow=" + this.dbSendWindow + ", dbExpireWindow=" + this.dbExpireWindow + ", dbDelaySend=" + this.dbDelaySend + ')';
        }

        public TraceCacheMetrics(int i, int i2, long j, int i3, long j2, long j3, long j4, long j5) {
            this.maxPendingRecordsL1 = i;
            this.maxPendingRecordsL2 = i2;
            this.delayAddTraceList = j;
            this.spanNameCacheSize = i3;
            this.dbCacheWindow = j2;
            this.dbSendWindow = j3;
            this.dbExpireWindow = j4;
            this.dbDelaySend = j5;
        }

        public /* synthetic */ TraceCacheMetrics(int i, int i2, long j, int i3, long j2, long j3, long j4, long j5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 1000 : i, (i4 & 2) != 0 ? 50 : i2, (i4 & 4) != 0 ? DELAY_ADDTRACE_LIST : j, (i4 & 8) != 0 ? DEFAULT_SPAN_NAME_CACHE_SIZE : i3, (i4 & 16) != 0 ? DEFAULT_DB_CACHE_WINDOW : j2, (i4 & 32) != 0 ? DEFAULT_DB_SEND_WINDOW : j3, (i4 & 64) != 0 ? DEFAULT_DB_EXPIRE_WINDOW : j4, (i4 & 128) != 0 ? 300000L : j5);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\r\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012J\t\u0010\u0013\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/oplus/utrace/lib/SdkConfigData$TraceLogCtrl;", "", "intentUseInfo", "", "codeUseInfo", "(ZZ)V", "getCodeUseInfo", "()Z", "getIntentUseInfo", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toJsonString", "", "toJsonString$utrace_lib_release", "toString", "Companion", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class TraceLogCtrl {
        private static final boolean CODE_USE_DEFAULT = true;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private static final boolean INTENT_USE_DEFAULT = false;

        @NotNull
        private static final String KEY_CODE_USE_INFO = "key_code_use_info";

        @NotNull
        private static final String KEY_INTENT_USE_INFO = "key_intent_use_info";
        private final boolean codeUseInfo;
        private final boolean intentUseInfo;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/oplus/utrace/lib/SdkConfigData$TraceLogCtrl$Companion;", "", "()V", "CODE_USE_DEFAULT", "", "INTENT_USE_DEFAULT", "KEY_CODE_USE_INFO", "", "KEY_INTENT_USE_INFO", "fromJsonString", "Lcom/oplus/utrace/lib/SdkConfigData$TraceLogCtrl;", "str", "fromJsonString$utrace_lib_release", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final TraceLogCtrl fromJsonString$utrace_lib_release(@NotNull String str) {
                Object obj;
                Intrinsics.checkNotNullParameter(str, "str");
                DefaultConstructorMarker defaultConstructorMarker = null;
                if (!(!StringsKt.isBlank(str))) {
                    str = null;
                }
                boolean z = false;
                if (str != null) {
                    try {
                        Result.Companion companion = Result.Companion;
                        obj = Result.constructor-impl(new JSONObject(str));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        obj = Result.constructor-impl(ResultKt.createFailure(th));
                    }
                    if (Result.isFailure-impl(obj)) {
                        obj = null;
                    }
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject != null) {
                        return new TraceLogCtrl(jSONObject.optBoolean(TraceLogCtrl.KEY_INTENT_USE_INFO, false), jSONObject.optBoolean(TraceLogCtrl.KEY_CODE_USE_INFO, true));
                    }
                }
                return new TraceLogCtrl(z, z, 3, defaultConstructorMarker);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public TraceLogCtrl() {
            boolean z = false;
            this(z, z, 3, null);
        }

        public static /* synthetic */ TraceLogCtrl copy$default(TraceLogCtrl traceLogCtrl, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = traceLogCtrl.intentUseInfo;
            }
            if ((i & 2) != 0) {
                z2 = traceLogCtrl.codeUseInfo;
            }
            return traceLogCtrl.copy(z, z2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIntentUseInfo() {
            return this.intentUseInfo;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getCodeUseInfo() {
            return this.codeUseInfo;
        }

        @NotNull
        public final TraceLogCtrl copy(boolean intentUseInfo, boolean codeUseInfo) {
            return new TraceLogCtrl(intentUseInfo, codeUseInfo);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TraceLogCtrl)) {
                return false;
            }
            TraceLogCtrl traceLogCtrl = (TraceLogCtrl) other;
            return this.intentUseInfo == traceLogCtrl.intentUseInfo && this.codeUseInfo == traceLogCtrl.codeUseInfo;
        }

        public final boolean getCodeUseInfo() {
            return this.codeUseInfo;
        }

        public final boolean getIntentUseInfo() {
            return this.intentUseInfo;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        public int hashCode() {
            boolean z = this.intentUseInfo;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            boolean z2 = this.codeUseInfo;
            return i + (z2 ? 1 : z2);
        }

        @NotNull
        public final String toJsonString$utrace_lib_release() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(KEY_INTENT_USE_INFO, this.intentUseInfo);
            jSONObject.put(KEY_CODE_USE_INFO, this.codeUseInfo);
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "JSONObject().also {\n    …nfo)\n        }.toString()");
            return string;
        }

        @NotNull
        public String toString() {
            return "TraceLogCtrl(intentUseInfo=" + this.intentUseInfo + ", codeUseInfo=" + this.codeUseInfo + ')';
        }

        public TraceLogCtrl(boolean z, boolean z2) {
            this.intentUseInfo = z;
            this.codeUseInfo = z2;
        }

        public /* synthetic */ TraceLogCtrl(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        DEFAULT_OVERFLOW = new FlowCtrl(1000L, Long.MAX_VALUE);
        DEFAULT_BIND_WINDOW = companion.bindWindow(false);
        DEFAULT_EXPIRE_WINDOW = ((long) (Build.VERSION.SDK_INT >= 35 ? 12 : 1)) * ConstValuesKt.HOUR;
    }

    public SdkConfigData() {
        this(false, null, null, false, null, null, null, 0L, 0L, 511, null);
    }

    @Deprecated(message = "关联启动优化时废弃")
    public static /* synthetic */ void getBindWindow$annotations() {
    }

    @Deprecated(message = "没有在用")
    public static /* synthetic */ void getOverflow$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FlowCtrl getOverflow() {
        return this.overflow;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOverflowPt() {
        return this.overflowPt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getLogsDebuggable() {
        return this.logsDebuggable;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TraceCacheMetrics getTraceCacheMetrics() {
        return this.traceCacheMetrics;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TraceLogCtrl getTraceLogCtrl() {
        return this.traceLogCtrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final HLogCtrl getHLogCtrl() {
        return this.hLogCtrl;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getBindWindow() {
        return this.bindWindow;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getExpireTime() {
        return this.expireTime;
    }

    @NotNull
    public final SdkConfigData copy(boolean isEnabled, @NotNull FlowCtrl overflow, @NotNull String overflowPt, boolean logsDebuggable, @NotNull TraceCacheMetrics traceCacheMetrics, @NotNull TraceLogCtrl traceLogCtrl, @Nullable HLogCtrl hLogCtrl, long bindWindow, long expireTime) {
        Intrinsics.checkNotNullParameter(overflow, "overflow");
        Intrinsics.checkNotNullParameter(overflowPt, "overflowPt");
        Intrinsics.checkNotNullParameter(traceCacheMetrics, "traceCacheMetrics");
        Intrinsics.checkNotNullParameter(traceLogCtrl, "traceLogCtrl");
        return new SdkConfigData(isEnabled, overflow, overflowPt, logsDebuggable, traceCacheMetrics, traceLogCtrl, hLogCtrl, bindWindow, expireTime);
    }

    public final boolean diverse(@NotNull SdkConfigData rhs) {
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        if (this.isEnabled == rhs.isEnabled && this.logsDebuggable == rhs.logsDebuggable) {
            HLogCtrl hLogCtrl = this.hLogCtrl;
            Boolean boolValueOf = hLogCtrl != null ? Boolean.valueOf(hLogCtrl.getLogEnabledV2()) : null;
            HLogCtrl hLogCtrl2 = rhs.hLogCtrl;
            if (Intrinsics.areEqual(boolValueOf, hLogCtrl2 != null ? Boolean.valueOf(hLogCtrl2.getLogEnabledV2()) : null)) {
                HLogCtrl hLogCtrl3 = this.hLogCtrl;
                Integer numValueOf = hLogCtrl3 != null ? Integer.valueOf(hLogCtrl3.getExpireDaysV2()) : null;
                HLogCtrl hLogCtrl4 = rhs.hLogCtrl;
                if (Intrinsics.areEqual(numValueOf, hLogCtrl4 != null ? Integer.valueOf(hLogCtrl4.getExpireDaysV2()) : null) && Intrinsics.areEqual(this.traceCacheMetrics, rhs.traceCacheMetrics)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdkConfigData)) {
            return false;
        }
        SdkConfigData sdkConfigData = (SdkConfigData) other;
        return this.isEnabled == sdkConfigData.isEnabled && Intrinsics.areEqual(this.overflow, sdkConfigData.overflow) && Intrinsics.areEqual(this.overflowPt, sdkConfigData.overflowPt) && this.logsDebuggable == sdkConfigData.logsDebuggable && Intrinsics.areEqual(this.traceCacheMetrics, sdkConfigData.traceCacheMetrics) && Intrinsics.areEqual(this.traceLogCtrl, sdkConfigData.traceLogCtrl) && Intrinsics.areEqual(this.hLogCtrl, sdkConfigData.hLogCtrl) && this.bindWindow == sdkConfigData.bindWindow && this.expireTime == sdkConfigData.expireTime;
    }

    public final long getBindWindow() {
        return this.bindWindow;
    }

    public final long getExpireTime() {
        return this.expireTime;
    }

    @NotNull
    public final Map<String, FlowCtrl> getFlowCtrlPt() {
        return this.flowCtrlPt;
    }

    @Nullable
    public final HLogCtrl getHLogCtrl() {
        return this.hLogCtrl;
    }

    public final boolean getLogsDebuggable() {
        return this.logsDebuggable;
    }

    @NotNull
    public final FlowCtrl getOverflow() {
        return this.overflow;
    }

    @NotNull
    public final String getOverflowPt() {
        return this.overflowPt;
    }

    @NotNull
    public final TraceCacheMetrics getTraceCacheMetrics() {
        return this.traceCacheMetrics;
    }

    @NotNull
    public final TraceLogCtrl getTraceLogCtrl() {
        return this.traceLogCtrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    public int hashCode() {
        boolean z = this.isEnabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iHashCode = ((((r0 * 31) + this.overflow.hashCode()) * 31) + this.overflowPt.hashCode()) * 31;
        boolean z2 = this.logsDebuggable;
        int iHashCode2 = (((((iHashCode + (z2 ? 1 : z2)) * 31) + this.traceCacheMetrics.hashCode()) * 31) + this.traceLogCtrl.hashCode()) * 31;
        HLogCtrl hLogCtrl = this.hLogCtrl;
        return ((((iHashCode2 + (hLogCtrl == null ? 0 : hLogCtrl.hashCode())) * 31) + Long.hashCode(this.bindWindow)) * 31) + Long.hashCode(this.expireTime);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isExpired() {
        return INSTANCE.now() > this.expireTime;
    }

    @NotNull
    public final String toJSONString() throws JSONException {
        String jsonString;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_enabled", this.isEnabled);
        jSONObject.put(KEY_OVERFLOW_MAX, this.overflow.getMaxFlow());
        jSONObject.put(KEY_OVERFLOW_WINDOW, this.overflow.getWindow());
        jSONObject.put(KEY_OVERFLOW_PT, this.overflowPt);
        jSONObject.put(KEY_LOGS_DEBUGGABLE, this.logsDebuggable);
        jSONObject.put(KEY_TRACE_CACHE_METRICS, this.traceCacheMetrics.toJsonString$utrace_lib_release());
        jSONObject.put(KEY_TRACE_LOG_CTRL, this.traceLogCtrl.toJsonString$utrace_lib_release());
        HLogCtrl hLogCtrl = this.hLogCtrl;
        if (hLogCtrl != null && (jsonString = hLogCtrl.toJsonString()) != null) {
            jSONObject.put(KEY_HLOG_CTRL, jsonString);
        }
        jSONObject.put(KEY_BIND_WINDOW, this.bindWindow);
        jSONObject.put(KEY_EXPIRE_TIME, this.expireTime);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject().also {\n    …ime)\n        }.toString()");
        return string;
    }

    @NotNull
    public String toString() {
        return "SdkConfigData(isEnabled=" + this.isEnabled + ", overflow=" + this.overflow + ", overflowPt=" + this.overflowPt + ", logsDebuggable=" + this.logsDebuggable + ", traceCacheMetrics=" + this.traceCacheMetrics + ", traceLogCtrl=" + this.traceLogCtrl + ", hLogCtrl=" + this.hLogCtrl + ", bindWindow=" + this.bindWindow + ", expireTime=" + this.expireTime + ')';
    }

    public final void writeToBundle(@NotNull Bundle bundle) {
        String jsonString;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        bundle.putBoolean("is_enabled", this.isEnabled);
        bundle.putLong(KEY_OVERFLOW_MAX, this.overflow.getMaxFlow());
        bundle.putLong(KEY_OVERFLOW_WINDOW, this.overflow.getWindow());
        bundle.putString(KEY_OVERFLOW_PT, this.overflowPt);
        bundle.putBoolean(KEY_LOGS_DEBUGGABLE, this.logsDebuggable);
        bundle.putString(KEY_TRACE_CACHE_METRICS, this.traceCacheMetrics.toJsonString$utrace_lib_release());
        bundle.putString(KEY_TRACE_LOG_CTRL, this.traceLogCtrl.toJsonString$utrace_lib_release());
        HLogCtrl hLogCtrl = this.hLogCtrl;
        if (hLogCtrl != null && (jsonString = hLogCtrl.toJsonString()) != null) {
            bundle.putString(KEY_HLOG_CTRL, jsonString);
        }
        bundle.putLong(KEY_BIND_WINDOW, this.bindWindow);
        bundle.putLong(KEY_EXPIRE_TIME, this.expireTime);
    }

    public SdkConfigData(boolean z, @NotNull FlowCtrl flowCtrl, @NotNull String str, boolean z2, @NotNull TraceCacheMetrics traceCacheMetrics, @NotNull TraceLogCtrl traceLogCtrl, @Nullable HLogCtrl hLogCtrl, long j, long j2) {
        Intrinsics.checkNotNullParameter(flowCtrl, "overflow");
        Intrinsics.checkNotNullParameter(str, "overflowPt");
        Intrinsics.checkNotNullParameter(traceCacheMetrics, "traceCacheMetrics");
        Intrinsics.checkNotNullParameter(traceLogCtrl, "traceLogCtrl");
        this.isEnabled = z;
        this.overflow = flowCtrl;
        this.overflowPt = str;
        this.logsDebuggable = z2;
        this.traceCacheMetrics = traceCacheMetrics;
        this.traceLogCtrl = traceLogCtrl;
        this.hLogCtrl = hLogCtrl;
        this.bindWindow = j;
        this.expireTime = j2;
        this.flowCtrlPt = INSTANCE.parseOverflowPt$utrace_lib_release(str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SdkConfigData(boolean z, FlowCtrl flowCtrl, String str, boolean z2, TraceCacheMetrics traceCacheMetrics, TraceLogCtrl traceLogCtrl, HLogCtrl hLogCtrl, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z3 = false;
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? DEFAULT_OVERFLOW : flowCtrl, (i & 4) != 0 ? SdkConfigConst.EMPTY_JSON_ARRAY : str, (i & 8) != 0 ? Logs.INSTANCE.getDebuggable() : z2, (i & 16) != 0 ? new TraceCacheMetrics(0, 0, 0L, 0, 0L, 0L, 0L, 0L, 255, null) : traceCacheMetrics, (i & 32) != 0 ? new TraceLogCtrl(z3, z3, 3, null) : traceLogCtrl, (i & 64) != 0 ? null : hLogCtrl, (i & 128) != 0 ? DEFAULT_BIND_WINDOW : j, (i & 256) != 0 ? Companion.expireTime$default(INSTANCE, null, 1, null) : j2);
    }
}
