package com.pantanal.fundation.internal.thread;

import java.util.concurrent.ThreadFactory;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class DispatchersUtil$cardConvertDispatcher$2 extends Lambda implements Function0<ExecutorCoroutineDispatcher> {
    public static final DispatchersUtil$cardConvertDispatcher$2 INSTANCE = new DispatchersUtil$cardConvertDispatcher$2();

    public DispatchersUtil$cardConvertDispatcher$2() {
        super(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread invoke$lambda$0(Runnable runnable) {
        return new Thread(runnable, "pcs_convert");
    }

    @Override // p010kotlin.jvm.functions.Function0
    @NotNull
    public final ExecutorCoroutineDispatcher invoke() {
        return ExecutorsKt.from(DispatchersUtil.p(new ThreadFactory() { // from class: com.pantanal.fundation.internal.thread.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return DispatchersUtil$cardConvertDispatcher$2.invoke$lambda$0(runnable);
            }
        }));
    }
}
