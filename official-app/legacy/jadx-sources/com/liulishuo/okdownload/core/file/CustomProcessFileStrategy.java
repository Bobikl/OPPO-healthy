package com.liulishuo.okdownload.core.file;

import androidx.annotation.NonNull;
import com.liulishuo.okdownload.DownloadTask;
import com.liulishuo.okdownload.core.breakpoint.BreakpointInfo;
import com.liulishuo.okdownload.core.breakpoint.DownloadStore;

/* JADX INFO: loaded from: classes5.dex */
public class CustomProcessFileStrategy extends ProcessFileStrategy {
    @Override // com.liulishuo.okdownload.core.file.ProcessFileStrategy
    @NonNull
    public MultiPointOutputStream createProcessStream(@NonNull DownloadTask downloadTask, @NonNull BreakpointInfo breakpointInfo, @NonNull DownloadStore downloadStore) {
        return new CustomMultiPointOutputStream(downloadTask, breakpointInfo, downloadStore);
    }
}
