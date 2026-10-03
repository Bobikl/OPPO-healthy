package com.oplus.aiunit.vision;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0002"}, d2 = {"Lcom/oplus/aiunit/vision/efd;", "a", "network_release"}, k = 2, mv = {1, 6, 0})
public final class s45 {
    @NotNull
    public static final efd a() {
        efd.a aVar = new efd.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.g(6L, timeUnit);
        aVar.b0(10000L, timeUnit);
        aVar.X(10000L, timeUnit);
        efd efdVarC = aVar.c();
        Intrinsics.checkNotNullExpressionValue(efdVarC, "builder.build()");
        return efdVarC;
    }
}
