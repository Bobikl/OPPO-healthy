package com.oplus.aiunit.vision;

import com.heytap.trace.TraceSegment;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J,\u0010\u000f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\fH&¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/fm9;", "", "", "a", "Lcom/heytap/trace/TraceSegment;", "segment", "", "c", "Lcom/oplus/aiunit/vision/gw9;", "request", "", "method", "Lkotlin/Function1;", "Lcom/oplus/aiunit/vision/jw9;", "processChain", "b", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public interface fm9 {
    int a();

    @NotNull
    jw9 b(@NotNull gw9 request, @NotNull String method, @NotNull Function1<? super gw9, jw9> processChain);

    void c(@NotNull TraceSegment segment) throws Exception;
}
