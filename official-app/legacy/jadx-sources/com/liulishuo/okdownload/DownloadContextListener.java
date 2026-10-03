package com.liulishuo.okdownload;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.liulishuo.okdownload.core.cause.EndCause;

/* JADX INFO: loaded from: classes5.dex */
public interface DownloadContextListener {
    void queueEnd(@NonNull DownloadContext downloadContext);

    void taskEnd(@NonNull DownloadContext downloadContext, @NonNull DownloadTask downloadTask, @NonNull EndCause endCause, @Nullable Exception exc, int i);
}
