package com.oplus.aiunit.vision;

import com.heytap.common.util.TimeUtilKt;
import com.heytap.okhttp.extension.request.OKHttpRequestHandler;
import com.heytap.trace.TraceSegment;
import com.heytap.trace.TraceUploadManager;
import java.io.IOException;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J,\u0010\u000f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\fH\u0016R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/me0;", "Lcom/oplus/aiunit/vision/fm9;", "", "a", "Lcom/heytap/trace/TraceSegment;", "segment", "", "c", "Lcom/oplus/aiunit/vision/gw9;", "request", "", "method", "Lkotlin/Function1;", "Lcom/oplus/aiunit/vision/jw9;", "processChain", "b", "Lcom/heytap/trace/TraceUploadManager;", "Lcom/heytap/trace/TraceUploadManager;", "uploadManager", "Lcom/oplus/aiunit/vision/kxg;", "Lcom/oplus/aiunit/vision/kxg;", "getSettingsStore", "()Lcom/oplus/aiunit/vision/kxg;", "settingsStore", "<init>", "(Lcom/oplus/aiunit/vision/kxg;)V", "Companion", "com.heytap.nearx.apptrace"}, k = 1, mv = {1, 4, 0})
public final class me0 implements fm9 {

    @NotNull
    public static final String HEADER_HOST = "Host";

    @NotNull
    public static final String TAG = "AppTraceImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final TraceUploadManager uploadManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final kxg settingsStore;

    public me0(@NotNull kxg settingsStore) {
        Intrinsics.checkNotNullParameter(settingsStore, "settingsStore");
        this.settingsStore = settingsStore;
        this.uploadManager = new TraceUploadManager(settingsStore);
    }

    @Override // com.oplus.aiunit.vision.fm9
    public int a() {
        return this.settingsStore.getSampleRatio();
    }

    @Override // com.oplus.aiunit.vision.fm9
    @NotNull
    public jw9 b(@NotNull gw9 request, @NotNull String method, @NotNull Function1<? super gw9, jw9> processChain) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(processChain, "processChain");
        z3k.Companion companion = z3k.INSTANCE;
        TraceSegment traceSegmentA = companion.a(companion.f(request.getUrl(), method, request.c().get("Host")), Integer.valueOf(a()));
        try {
            if (traceSegmentA == null) {
                return processChain.invoke(request);
            }
            try {
                Map<String, String> mapC = request.c();
                String traceId = traceSegmentA.getTraceId();
                if (traceId == null) {
                    traceId = "";
                }
                mapC.put("traceId", traceId);
                Map<String, String> mapC2 = request.c();
                String level = traceSegmentA.getLevel();
                if (level == null) {
                    level = "";
                }
                mapC2.put("level", level);
                jw9 jw9VarInvoke = processChain.invoke(request);
                String str = (String) jw9VarInvoke.b(OKHttpRequestHandler.RSP_TARGET_IP);
                traceSegmentA.setServerIp(str != null ? str : "");
                traceSegmentA.setEndTime(TimeUtilKt.b());
                traceSegmentA.setStatus(String.valueOf(jw9VarInvoke.getCode()));
                try {
                    c(traceSegmentA);
                } catch (Throwable unused) {
                }
                return jw9VarInvoke;
            } catch (IOException e2) {
                traceSegmentA.setEndTime(TimeUtilKt.b());
                traceSegmentA.setStatus("error");
                traceSegmentA.setErrorMsg(e2.toString());
                throw e2;
            } catch (RuntimeException e3) {
                traceSegmentA.setEndTime(TimeUtilKt.b());
                traceSegmentA.setStatus("error");
                traceSegmentA.setErrorMsg(e3.toString());
                throw e3;
            }
        } catch (Throwable th) {
            try {
                c(traceSegmentA);
            } catch (Throwable unused2) {
            }
            throw th;
        }
    }

    @Override // com.oplus.aiunit.vision.fm9
    public void c(@NotNull TraceSegment segment) throws Exception {
        Intrinsics.checkNotNullParameter(segment, "segment");
        this.uploadManager.e(segment);
    }
}
