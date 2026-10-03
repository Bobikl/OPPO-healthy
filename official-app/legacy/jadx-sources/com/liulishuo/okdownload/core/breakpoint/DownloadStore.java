package com.liulishuo.okdownload.core.breakpoint;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.liulishuo.okdownload.core.cause.EndCause;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public interface DownloadStore extends BreakpointStore {
    @Nullable
    BreakpointInfo getAfterCompleted(int i);

    boolean markFileClear(int i);

    boolean markFileDirty(int i);

    void onSyncToFilesystemSuccess(@NonNull BreakpointInfo breakpointInfo, int i, long j2) throws IOException;

    void onTaskEnd(int i, @NonNull EndCause endCause, @Nullable Exception exc);

    void onTaskStart(int i);
}
