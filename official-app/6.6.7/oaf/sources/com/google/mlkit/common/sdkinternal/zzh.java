package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
enum zzh implements Executor {
    zza;

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        MLTaskExecutor.getInstance().zzc.post(runnable);
    }
}
