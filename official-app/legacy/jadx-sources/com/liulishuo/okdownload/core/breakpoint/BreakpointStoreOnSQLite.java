package com.liulishuo.okdownload.core.breakpoint;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.liulishuo.okdownload.DownloadTask;
import com.liulishuo.okdownload.core.Util;
import com.liulishuo.okdownload.core.cause.EndCause;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class BreakpointStoreOnSQLite implements DownloadStore {
    private static final String TAG = "BreakpointStoreOnSQLite";
    protected final BreakpointSQLiteHelper helper;
    protected final BreakpointStoreOnCache onCache;

    public BreakpointStoreOnSQLite(BreakpointSQLiteHelper breakpointSQLiteHelper, BreakpointStoreOnCache breakpointStoreOnCache) {
        this.helper = breakpointSQLiteHelper;
        this.onCache = breakpointStoreOnCache;
    }

    public void close() {
        this.helper.close();
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    @NonNull
    public BreakpointInfo createAndInsert(@NonNull DownloadTask downloadTask) throws IOException {
        BreakpointInfo breakpointInfoCreateAndInsert = this.onCache.createAndInsert(downloadTask);
        this.helper.insert(breakpointInfoCreateAndInsert);
        return breakpointInfoCreateAndInsert;
    }

    @NonNull
    public DownloadStore createRemitSelf() {
        return new RemitStoreOnSQLite(this);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    @Nullable
    public BreakpointInfo findAnotherInfoFromCompare(@NonNull DownloadTask downloadTask, @NonNull BreakpointInfo breakpointInfo) {
        return this.onCache.findAnotherInfoFromCompare(downloadTask, breakpointInfo);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public int findOrCreateId(@NonNull DownloadTask downloadTask) {
        return this.onCache.findOrCreateId(downloadTask);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    @Nullable
    public BreakpointInfo get(int i) {
        return this.onCache.get(i);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.DownloadStore
    @Nullable
    public BreakpointInfo getAfterCompleted(int i) {
        return null;
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    @Nullable
    public String getResponseFilename(String str) {
        return this.onCache.getResponseFilename(str);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public boolean isFileDirty(int i) {
        return this.onCache.isFileDirty(i);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public boolean isOnlyMemoryCache() {
        return false;
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.DownloadStore
    public boolean markFileClear(int i) {
        if (!this.onCache.markFileClear(i)) {
            return false;
        }
        this.helper.markFileClear(i);
        return true;
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.DownloadStore
    public boolean markFileDirty(int i) {
        if (!this.onCache.markFileDirty(i)) {
            return false;
        }
        this.helper.markFileDirty(i);
        return true;
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.DownloadStore
    public void onSyncToFilesystemSuccess(@NonNull BreakpointInfo breakpointInfo, int i, long j2) throws IOException {
        this.onCache.onSyncToFilesystemSuccess(breakpointInfo, i, j2);
        this.helper.updateBlockIncrease(breakpointInfo, i, breakpointInfo.getBlock(i).getCurrentOffset());
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.DownloadStore
    public void onTaskEnd(int i, @NonNull EndCause endCause, @Nullable Exception exc) {
        this.onCache.onTaskEnd(i, endCause, exc);
        if (endCause == EndCause.COMPLETED) {
            this.helper.removeInfo(i);
        }
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.DownloadStore
    public void onTaskStart(int i) {
        this.onCache.onTaskStart(i);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public void remove(int i) {
        this.onCache.remove(i);
        this.helper.removeInfo(i);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public boolean update(@NonNull BreakpointInfo breakpointInfo) throws IOException {
        boolean zUpdate = this.onCache.update(breakpointInfo);
        this.helper.updateInfo(breakpointInfo);
        String filename = breakpointInfo.getFilename();
        Util.d(TAG, "update " + breakpointInfo);
        if (breakpointInfo.isTaskOnlyProvidedParentPath() && filename != null) {
            this.helper.updateFilename(breakpointInfo.getUrl(), filename);
        }
        return zUpdate;
    }

    public BreakpointStoreOnSQLite(Context context) {
        BreakpointSQLiteHelper breakpointSQLiteHelper = new BreakpointSQLiteHelper(context.getApplicationContext());
        this.helper = breakpointSQLiteHelper;
        this.onCache = new BreakpointStoreOnCache(breakpointSQLiteHelper.loadToCache(), breakpointSQLiteHelper.loadDirtyFileList(), breakpointSQLiteHelper.loadResponseFilenameToMap());
    }
}
