package com.liulishuo.okdownload.core.breakpoint;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.liulishuo.okdownload.DownloadTask;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public interface BreakpointStore {
    @NonNull
    BreakpointInfo createAndInsert(@NonNull DownloadTask downloadTask) throws IOException;

    @Nullable
    BreakpointInfo findAnotherInfoFromCompare(@NonNull DownloadTask downloadTask, @NonNull BreakpointInfo breakpointInfo);

    int findOrCreateId(@NonNull DownloadTask downloadTask);

    @Nullable
    BreakpointInfo get(int i);

    @Nullable
    String getResponseFilename(String str);

    boolean isFileDirty(int i);

    boolean isOnlyMemoryCache();

    void remove(int i);

    boolean update(@NonNull BreakpointInfo breakpointInfo) throws IOException;
}
