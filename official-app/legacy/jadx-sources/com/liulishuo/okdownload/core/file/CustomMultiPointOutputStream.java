package com.liulishuo.okdownload.core.file;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.liulishuo.okdownload.DownloadTask;
import com.liulishuo.okdownload.core.Util;
import com.liulishuo.okdownload.core.breakpoint.BreakpointInfo;
import com.liulishuo.okdownload.core.breakpoint.DownloadStore;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class CustomMultiPointOutputStream extends MultiPointOutputStream {
    private static final String TAG = "CustomMultiPointOutputStream";
    private final DownloadTask task;

    public CustomMultiPointOutputStream(@NonNull DownloadTask downloadTask, @NonNull BreakpointInfo breakpointInfo, @NonNull DownloadStore downloadStore, @Nullable Runnable runnable) {
        super(downloadTask, breakpointInfo, downloadStore);
        this.task = downloadTask;
    }

    @Override // com.liulishuo.okdownload.core.file.MultiPointOutputStream
    public synchronized void close(int i) throws IOException {
        DownloadOutputStream downloadOutputStream = this.outputStreamMap.get(i);
        if (downloadOutputStream != null) {
            downloadOutputStream.close();
            synchronized (this.noSyncLengthMap) {
                this.outputStreamMap.remove(i);
                this.noSyncLengthMap.remove(i);
            }
            Util.d(TAG, "OutputStream close task[" + this.task.getId() + "] block[" + i + "]");
        }
    }

    public CustomMultiPointOutputStream(@NonNull DownloadTask downloadTask, @NonNull BreakpointInfo breakpointInfo, @NonNull DownloadStore downloadStore) {
        this(downloadTask, breakpointInfo, downloadStore, null);
    }
}
