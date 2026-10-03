package com.liulishuo.okdownload.core.breakpoint;

import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.liulishuo.okdownload.DownloadTask;
import com.liulishuo.okdownload.OkDownload;
import com.liulishuo.okdownload.core.cause.EndCause;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class RemitStoreOnSQLite implements RemitSyncExecutor.RemitAgent, DownloadStore {
    private static final String TAG = "RemitStoreOnSQLite";

    @NonNull
    private final BreakpointStoreOnSQLite onSQLiteWrapper;

    @NonNull
    private final RemitSyncToDBHelper remitHelper;

    @NonNull
    private final BreakpointSQLiteHelper sqLiteHelper;

    @NonNull
    private final DownloadStore sqliteCache;

    public RemitStoreOnSQLite(@NonNull BreakpointStoreOnSQLite breakpointStoreOnSQLite) {
        this.remitHelper = new RemitSyncToDBHelper(this);
        this.onSQLiteWrapper = breakpointStoreOnSQLite;
        this.sqliteCache = breakpointStoreOnSQLite.onCache;
        this.sqLiteHelper = breakpointStoreOnSQLite.helper;
    }

    public static void setRemitToDBDelayMillis(int i) {
        BreakpointStore breakpointStore = OkDownload.with().breakpointStore();
        if (breakpointStore instanceof RemitStoreOnSQLite) {
            ((RemitStoreOnSQLite) breakpointStore).remitHelper.delayMillis = Math.max(0, i);
        } else {
            throw new IllegalStateException("The current store is " + breakpointStore + " not RemitStoreOnSQLite!");
        }
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    @NonNull
    public BreakpointInfo createAndInsert(@NonNull DownloadTask downloadTask) throws IOException {
        return this.remitHelper.isNotFreeToDatabase(downloadTask.getId()) ? this.sqliteCache.createAndInsert(downloadTask) : this.onSQLiteWrapper.createAndInsert(downloadTask);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    @Nullable
    public BreakpointInfo findAnotherInfoFromCompare(@NonNull DownloadTask downloadTask, @NonNull BreakpointInfo breakpointInfo) {
        return this.onSQLiteWrapper.findAnotherInfoFromCompare(downloadTask, breakpointInfo);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public int findOrCreateId(@NonNull DownloadTask downloadTask) {
        return this.onSQLiteWrapper.findOrCreateId(downloadTask);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    @Nullable
    public BreakpointInfo get(int i) {
        return this.onSQLiteWrapper.get(i);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.DownloadStore
    @Nullable
    public BreakpointInfo getAfterCompleted(int i) {
        return null;
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    @Nullable
    public String getResponseFilename(String str) {
        return this.onSQLiteWrapper.getResponseFilename(str);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public boolean isFileDirty(int i) {
        return this.onSQLiteWrapper.isFileDirty(i);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public boolean isOnlyMemoryCache() {
        return false;
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.DownloadStore
    public boolean markFileClear(int i) {
        return this.onSQLiteWrapper.markFileClear(i);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.DownloadStore
    public boolean markFileDirty(int i) {
        return this.onSQLiteWrapper.markFileDirty(i);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.DownloadStore
    public void onSyncToFilesystemSuccess(@NonNull BreakpointInfo breakpointInfo, int i, long j2) throws IOException {
        if (this.remitHelper.isNotFreeToDatabase(breakpointInfo.getId())) {
            this.sqliteCache.onSyncToFilesystemSuccess(breakpointInfo, i, j2);
        } else {
            this.onSQLiteWrapper.onSyncToFilesystemSuccess(breakpointInfo, i, j2);
        }
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.DownloadStore
    public void onTaskEnd(int i, @NonNull EndCause endCause, @Nullable Exception exc) {
        this.sqliteCache.onTaskEnd(i, endCause, exc);
        if (endCause == EndCause.COMPLETED) {
            this.remitHelper.discard(i);
        } else {
            this.remitHelper.endAndEnsureToDB(i);
        }
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.DownloadStore
    public void onTaskStart(int i) {
        this.onSQLiteWrapper.onTaskStart(i);
        this.remitHelper.onTaskStart(i);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public void remove(int i) {
        this.sqliteCache.remove(i);
        this.remitHelper.discard(i);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.RemitSyncExecutor.RemitAgent
    public void removeInfo(int i) {
        this.sqLiteHelper.removeInfo(i);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.RemitSyncExecutor.RemitAgent
    public void syncCacheToDB(List<Integer> list) throws IOException {
        SQLiteDatabase writableDatabase = this.sqLiteHelper.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                syncCacheToDB(it.next().intValue());
            }
            writableDatabase.setTransactionSuccessful();
        } finally {
            writableDatabase.endTransaction();
        }
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public boolean update(@NonNull BreakpointInfo breakpointInfo) throws IOException {
        return this.remitHelper.isNotFreeToDatabase(breakpointInfo.getId()) ? this.sqliteCache.update(breakpointInfo) : this.onSQLiteWrapper.update(breakpointInfo);
    }

    public RemitStoreOnSQLite(@NonNull RemitSyncToDBHelper remitSyncToDBHelper, @NonNull BreakpointStoreOnSQLite breakpointStoreOnSQLite, @NonNull DownloadStore downloadStore, @NonNull BreakpointSQLiteHelper breakpointSQLiteHelper) {
        this.remitHelper = remitSyncToDBHelper;
        this.onSQLiteWrapper = breakpointStoreOnSQLite;
        this.sqliteCache = downloadStore;
        this.sqLiteHelper = breakpointSQLiteHelper;
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.RemitSyncExecutor.RemitAgent
    public void syncCacheToDB(int i) throws IOException {
        this.sqLiteHelper.removeInfo(i);
        BreakpointInfo breakpointInfo = this.sqliteCache.get(i);
        if (breakpointInfo == null || breakpointInfo.getFilename() == null || breakpointInfo.getTotalOffset() <= 0) {
            return;
        }
        this.sqLiteHelper.insert(breakpointInfo);
    }
}
