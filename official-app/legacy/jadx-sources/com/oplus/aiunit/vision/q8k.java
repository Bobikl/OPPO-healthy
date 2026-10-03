package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ2\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u001c\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u0011\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u0004J$\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/q8k;", "", "", "isPrePayModel", "", "order", sbe.PAY_SDK_PREPAYTOKEN, "merchantTraceId", "", MapSchema.FIELD_NAME_ENTRY, "d", "c", ebe.TRACE_TRACEID, "f", "traceId", "b", ebe.TRACE_TRACECONTEXT, b2n.f, "a", "", "Ljava/util/Map;", "traceIdMap", "tradeTraceContextMap", "Ljava/lang/String;", "tradeTraceIdName", "<init>", "()V", "paysdk_statistic_release"}, k = 1, mv = {1, 8, 0})
public final class q8k {

    @NotNull
    public static final q8k INSTANCE = new q8k();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, String> traceIdMap = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, String> tradeTraceContextMap = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static String tradeTraceIdName = "tradeTraceIdName";

    public final String a(boolean isPrePayModel, String order, String prePayToken) {
        String str;
        if (isPrePayModel) {
            if (prePayToken == null) {
                return "";
            }
            str = "sdk-" + r8k.INSTANCE.b(prePayToken);
            if (str == null) {
                return "";
            }
        } else {
            if (order == null) {
                return "";
            }
            str = "sdk-" + r8k.INSTANCE.b(order);
            if (str == null) {
                return "";
            }
        }
        return str;
    }

    @Nullable
    public final String b(@Nullable String traceId) {
        Map<String, String> map = tradeTraceContextMap;
        if (traceId == null) {
            traceId = "";
        }
        return map.get(traceId);
    }

    @Nullable
    public final String c() {
        return traceIdMap.get(tradeTraceIdName);
    }

    @Nullable
    public final String d(@Nullable String order, @Nullable String prePayToken) {
        return traceIdMap.get(r8k.INSTANCE.a(order, prePayToken));
    }

    public final void e(boolean isPrePayModel, @Nullable String order, @Nullable String prePayToken, @Nullable String merchantTraceId) {
        if (merchantTraceId == null || merchantTraceId.length() == 0) {
            merchantTraceId = a(isPrePayModel, order, prePayToken);
        }
        Map<String, String> map = traceIdMap;
        map.put(r8k.INSTANCE.a(order, prePayToken), merchantTraceId);
        map.put(tradeTraceIdName, merchantTraceId);
        qae.b("initTradeTraceId traceId=" + merchantTraceId);
    }

    public final boolean f(@Nullable String tradeTraceId) {
        if (tradeTraceId != null) {
            return StringsKt__StringsJVMKt.startsWith$default(tradeTraceId, "sdk-", false, 2, null);
        }
        return false;
    }

    public final void g(@Nullable String traceId, @NotNull String tradeTraceContext) {
        Intrinsics.checkNotNullParameter(tradeTraceContext, "tradeTraceContext");
        Map<String, String> map = tradeTraceContextMap;
        if (traceId == null) {
            traceId = "";
        }
        map.put(traceId, tradeTraceContext);
    }
}
