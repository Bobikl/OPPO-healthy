package com.oplus.aiunit.vision;

import android.content.Context;
import com.platform.usercenter.trace.rumtime.AutoTraceNew;
import java.util.Map;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ(\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/vbe;", "", "Landroid/content/Context;", "context", "", "", "baseMap", "Lcom/platform/usercenter/trace/rumtime/AutoTraceNew;", "a", "<init>", "()V", "paysdk_statistic_release"}, k = 1, mv = {1, 8, 0})
public final class vbe {

    @NotNull
    public static final vbe INSTANCE = new vbe();

    @JvmStatic
    @NotNull
    public static final AutoTraceNew a(@Nullable Context context, @Nullable Map<String, String> baseMap) {
        ube ubeVar = new ube(context, baseMap);
        AutoTraceNew.Builder builderAddTraceInterceptor = new AutoTraceNew.Builder(ubeVar).addTraceInterceptor(new ncg(baseMap));
        Executor executorB = na0.a().b();
        Intrinsics.checkNotNullExpressionValue(executorB, "getInstance().networkIO");
        return builderAddTraceInterceptor.uploadExecutor(executorB).create();
    }
}
