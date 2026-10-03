package androidx.work;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public interface RunnableScheduler {
    void cancel(@NonNull Runnable runnable);

    void scheduleWithDelay(@IntRange(from = 0) long j2, @NonNull Runnable runnable);
}
