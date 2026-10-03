package com.oplus.aiunit.vision;

import com.cloud.sdk.cloudstorage.http.HttpHeaders;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import com.oplus.utrace.sdk.CompletionType;
import com.oplus.utrace.sdk.UTrace;
import com.oplus.utrace.sdk.UTraceContext;
import com.pantanal.server.content.utils.OSUtils;
import io.protostuff.MapSchema;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b,\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bA\u0010BJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007J\u001a\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0003J$\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0003R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R&\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\"\u0010 \u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010%\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\"R\u0014\u0010&\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\"R\u0014\u0010'\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\"R\u0014\u0010(\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\"R\u0014\u0010)\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\"R\u0014\u0010*\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\"R\u0014\u0010+\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\"R\u0014\u0010,\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\"R\u0014\u0010-\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\"R\u0014\u0010.\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\"R\u0014\u0010/\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\"R\u0014\u00100\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\"R\u0014\u00101\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\"R\u0014\u00102\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\"R\u0014\u00103\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\"R\u0014\u00104\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\"R\u0014\u00105\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010\"R\u0014\u00106\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\"R\u0014\u00107\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\"R\u0014\u00108\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010\"R\u0014\u00109\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010\"R\u0014\u0010:\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010\"R\u0014\u0010;\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010\"R\u0014\u0010<\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010\"R\u0014\u0010=\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010\"R\u0014\u0010>\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010\"R\u0014\u0010?\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010\"R\u0014\u0010@\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b@\u0010\"¨\u0006C"}, d2 = {"Lcom/oplus/aiunit/vision/tfk;", "", "", "key", "Lcom/oplus/utrace/sdk/CompletionType;", "type", "", "a", "Lcom/oplus/utrace/sdk/UTraceContext;", HttpHeaders.CTX, "f", "", UTraceSQLiteHelperKt.COL_SPAN_NAME, "parentCtx", b2n.f, "c", MapSchema.FIELD_NAME_ENTRY, "", "d", "KEY_TRACE_NODE_A_4_NAME", "Ljava/lang/String;", "KEY_TRACE_NODE_6_NAME", "", "Ljava/lang/ThreadLocal;", "Ljava/util/Map;", "traceContextMap", "b", "Z", "getUTraceIsOpen", "()Z", "setUTraceIsOpen", "(Z)V", "uTraceIsOpen", "KEY_TRACE_NODE_INFO_4_000", "I", "KEY_TRACE_NODE_INFO_6_000", "KEY_TRACE_NODE_ERROR_6_001", "KEY_TRACE_NODE_ERROR_6_101", "KEY_TRACE_NODE_INFO_6_010", "KEY_TRACE_NODE_INFO_6_011", "KEY_TRACE_NODE_INFO_6_012", "KEY_TRACE_NODE_INFO_6_020", "KEY_TRACE_NODE_INFO_6_030", "KEY_TRACE_NODE_INFO_6_040", "KEY_TRACE_NODE_INFO_6_003", "KEY_TRACE_NODE_INFO_6_013", "KEY_TRACE_NODE_INFO_6_050", "KEY_TRACE_NODE_INFO_6_051", "KEY_TRACE_NODE_INFO_6_004", "KEY_TRACE_NODE_ERROR_6_111", "KEY_TRACE_NODE_ERROR_6_002", "KEY_TRACE_NODE_ERROR_6_301", "KEY_TRACE_NODE_ERROR_6_302", "KEY_TRACE_NODE_ERROR_6_401", "KEY_TRACE_NODE_ERROR_6_501", "KEY_TRACE_NODE_ERROR_6_502", "KEY_TRACE_NODE_ERROR_6_503", "KEY_TRACE_NODE_ERROR_6_003", "KEY_TRACE_NODE_ERROR_6_004", "KEY_TRACE_NODE_ERROR_6_005", "KEY_TRACE_NODE_ERROR_6_006", "KEY_TRACE_NODE_ERROR_6_007", "KEY_TRACE_NODE_ERROR_6_008", "KEY_TRACE_NODE_ERROR_6_009", "KEY_TRACE_NODE_ERROR_6_010", "<init>", "()V", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public final class tfk {

    @NotNull
    public static final String KEY_TRACE_NODE_6_NAME = "tranceNode_A_6000";

    @NotNull
    public static final String KEY_TRACE_NODE_A_4_NAME = "tranceNode_A_4000";
    public static final int KEY_TRACE_NODE_ERROR_6_001 = 660001;
    public static final int KEY_TRACE_NODE_ERROR_6_002 = 660002;
    public static final int KEY_TRACE_NODE_ERROR_6_003 = 660003;
    public static final int KEY_TRACE_NODE_ERROR_6_004 = 660004;
    public static final int KEY_TRACE_NODE_ERROR_6_005 = 660005;
    public static final int KEY_TRACE_NODE_ERROR_6_006 = 660006;
    public static final int KEY_TRACE_NODE_ERROR_6_007 = 660007;
    public static final int KEY_TRACE_NODE_ERROR_6_008 = 660008;
    public static final int KEY_TRACE_NODE_ERROR_6_009 = 660009;
    public static final int KEY_TRACE_NODE_ERROR_6_010 = 660010;
    public static final int KEY_TRACE_NODE_ERROR_6_101 = 660101;
    public static final int KEY_TRACE_NODE_ERROR_6_111 = 660111;
    public static final int KEY_TRACE_NODE_ERROR_6_301 = 660301;
    public static final int KEY_TRACE_NODE_ERROR_6_302 = 660302;
    public static final int KEY_TRACE_NODE_ERROR_6_401 = 660401;
    public static final int KEY_TRACE_NODE_ERROR_6_501 = 660501;
    public static final int KEY_TRACE_NODE_ERROR_6_502 = 660502;
    public static final int KEY_TRACE_NODE_ERROR_6_503 = 660503;
    public static final int KEY_TRACE_NODE_INFO_4_000 = 64000;
    public static final int KEY_TRACE_NODE_INFO_6_000 = 66000;
    public static final int KEY_TRACE_NODE_INFO_6_003 = 66003;
    public static final int KEY_TRACE_NODE_INFO_6_004 = 66004;
    public static final int KEY_TRACE_NODE_INFO_6_010 = 66010;
    public static final int KEY_TRACE_NODE_INFO_6_011 = 66011;
    public static final int KEY_TRACE_NODE_INFO_6_012 = 66012;
    public static final int KEY_TRACE_NODE_INFO_6_013 = 66013;
    public static final int KEY_TRACE_NODE_INFO_6_020 = 66020;
    public static final int KEY_TRACE_NODE_INFO_6_030 = 66030;
    public static final int KEY_TRACE_NODE_INFO_6_040 = 66040;
    public static final int KEY_TRACE_NODE_INFO_6_050 = 66050;
    public static final int KEY_TRACE_NODE_INFO_6_051 = 66051;

    @NotNull
    public static final tfk INSTANCE = new tfk();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, ThreadLocal<UTraceContext>> traceContextMap = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean uTraceIsOpen = true;

    @JvmStatic
    public static final void a(@NotNull String key, @NotNull CompletionType type) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(type, "type");
        UTraceContext uTraceContextC = c(key);
        if (!d(uTraceContextC)) {
            f7b.l("UTraceIntentUtils", "call end(),isUTraceAvailable false");
            return;
        }
        if (uTraceContextC != null) {
            UTrace.end(uTraceContextC, type, false);
        }
        e(key);
    }

    public static /* synthetic */ void b(String str, CompletionType completionType, int i, Object obj) {
        if ((i & 2) != 0) {
            completionType = CompletionType.GOAHEAD;
        }
        a(str, completionType);
    }

    @JvmStatic
    @Nullable
    public static final UTraceContext c(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, ThreadLocal<UTraceContext>> map = traceContextMap;
        ThreadLocal<UTraceContext> threadLocal = map.get(key);
        if (threadLocal == null) {
            threadLocal = new ThreadLocal<>();
            map.put(key, threadLocal);
        }
        return threadLocal.get();
    }

    @JvmStatic
    public static final boolean d(UTraceContext ctx) {
        if (ctx == null) {
            f7b.h("UTraceIntentUtils", "call isUTraceAvailable(),UTraceContext is null!");
        }
        return uTraceIsOpen && ctx != null && Intrinsics.areEqual(OSUtils.c("com.pantanal.server.utrace.switch", "1"), "1");
    }

    @JvmStatic
    public static final void e(String key) {
        ThreadLocal<UTraceContext> threadLocal = traceContextMap.get(key);
        if (threadLocal == null) {
            return;
        }
        threadLocal.remove();
    }

    @JvmStatic
    public static final UTraceContext f(String key, UTraceContext ctx) {
        if (!d(ctx)) {
            return null;
        }
        Map<String, ThreadLocal<UTraceContext>> map = traceContextMap;
        ThreadLocal<UTraceContext> threadLocal = map.get(key);
        if (threadLocal == null) {
            threadLocal = new ThreadLocal<>();
            map.put(key, threadLocal);
        }
        threadLocal.set(ctx);
        return threadLocal.get();
    }

    @JvmStatic
    public static final void g(@NotNull String key, int spanName, @Nullable UTraceContext parentCtx) {
        Intrinsics.checkNotNullParameter(key, "key");
        f7b.l("UTraceIntentUtils", Intrinsics.stringPlus("StaticSDK_UTrace start spanName:", Integer.valueOf(spanName)));
        if (!uTraceIsOpen || !Intrinsics.areEqual(OSUtils.c("com.pantanal.server.utrace.switch", "1"), "1")) {
            f7b.l("UTraceIntentUtils", "call start(),isUTraceAvailable false");
            return;
        }
        if (parentCtx != null) {
            f(key, UTrace.start(parentCtx, null, String.valueOf(spanName)));
            return;
        }
        UTraceContext uTraceContextC = c(key);
        if (uTraceContextC == null) {
            return;
        }
        f(key, UTrace.start(uTraceContextC, null, String.valueOf(spanName)));
    }

    public static /* synthetic */ void h(String str, int i, UTraceContext uTraceContext, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            uTraceContext = null;
        }
        g(str, i, uTraceContext);
    }
}
