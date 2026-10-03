package com.pantanal.fundation.internal.utils;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class ThreadUtils$executor$2 extends Lambda implements Function0<ScheduledExecutorService> {
    public static final ThreadUtils$executor$2 INSTANCE = new ThreadUtils$executor$2();

    public ThreadUtils$executor$2() {
        super(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread invoke$lambda$0(Runnable runnable) {
        return new Thread(runnable, "PantanalCardSdk");
    }

    @Override // p010kotlin.jvm.functions.Function0
    public final ScheduledExecutorService invoke() {
        return Executors.newScheduledThreadPool(1, new ThreadFactory() { // from class: com.pantanal.fundation.internal.utils.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return ThreadUtils$executor$2.invoke$lambda$0(runnable);
            }
        });
    }
}
