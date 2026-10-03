package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.common.internal.Preconditions;
import java.io.Closeable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
final class zzx implements Closeable {
    final /* synthetic */ TaskQueue zza;

    public /* synthetic */ zzx(TaskQueue taskQueue, zzw zzwVar) {
        this.zza = taskQueue;
        Preconditions.checkState(((Thread) taskQueue.zzd.getAndSet(Thread.currentThread())) == null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zza.zzd.set(null);
        this.zza.zzc();
    }
}
