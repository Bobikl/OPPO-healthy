package com.heytap.health.connect.rawapi.call;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/util/concurrent/ThreadPoolExecutor;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class Call$Companion$mExecutor$2 extends Lambda implements Function0<ThreadPoolExecutor> {
    public static final Call$Companion$mExecutor$2 INSTANCE = new Call$Companion$mExecutor$2();

    public Call$Companion$mExecutor$2() {
        super(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread invoke$lambda$0(Runnable runnable) {
        return new Thread(runnable, "MsgCall#" + Call.f3679n.getAndIncrement());
    }

    @Override // p010kotlin.jvm.functions.Function0
    @NotNull
    public final ThreadPoolExecutor invoke() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 2, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.heytap.health.connect.rawapi.call.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return Call$Companion$mExecutor$2.invoke$lambda$0(runnable);
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
