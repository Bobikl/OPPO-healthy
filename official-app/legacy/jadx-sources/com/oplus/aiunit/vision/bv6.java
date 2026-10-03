package com.oplus.aiunit.vision;

import com.heytap.speech.engine.HeytapSpeechEngine;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\b\u0010\t\u001a\u0004\u0018\u00010\u0007R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/bv6;", "", "Lcom/oplus/aiunit/vision/aq9;", "executorAdapter", "", "d", "c", "Ljava/util/concurrent/ExecutorService;", "b", "a", "Lcom/oplus/aiunit/vision/aq9;", "connectExecutor", "Ljava/util/concurrent/ExecutorService;", "engineExecutor", "agentExecutor", "<init>", "()V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public final class bv6 {

    @NotNull
    public static final bv6 INSTANCE = new bv6();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static aq9 connectExecutor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static ExecutorService engineExecutor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static ExecutorService agentExecutor;

    @Nullable
    public final synchronized ExecutorService a() {
        if (agentExecutor == null) {
            agentExecutor = new hg4(1, 1, 0L, TimeUnit.SECONDS, o45.TAG_AGENT_MESSAGE, 10);
        }
        return agentExecutor;
    }

    @Nullable
    public final synchronized ExecutorService b() {
        if (engineExecutor == null) {
            engineExecutor = new hg4(1, 1, 0L, TimeUnit.SECONDS, o45.TAG_ENGINE, 10);
        }
        return engineExecutor;
    }

    @NotNull
    public final synchronized aq9 c() {
        aq9 aq9Var;
        if (connectExecutor == null) {
            connectExecutor = new o45();
        }
        aq9Var = connectExecutor;
        Intrinsics.checkNotNull(aq9Var);
        return aq9Var;
    }

    public final void d(@Nullable aq9 executorAdapter) {
        if (executorAdapter == null) {
            t7b.INSTANCE.b(HeytapSpeechEngine.TAG, "executor hook is null, will use default executor.");
        } else {
            connectExecutor = executorAdapter;
        }
    }
}
