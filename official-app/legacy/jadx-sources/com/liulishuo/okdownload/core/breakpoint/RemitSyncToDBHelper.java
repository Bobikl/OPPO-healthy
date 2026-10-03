package com.liulishuo.okdownload.core.breakpoint;

import android.support.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
class RemitSyncToDBHelper {
    long delayMillis;
    private final RemitSyncExecutor executor;

    public RemitSyncToDBHelper(@NonNull RemitSyncExecutor.RemitAgent remitAgent) {
        this(new RemitSyncExecutor(remitAgent));
    }

    public void discard(int i) {
        this.executor.removePostWithId(i);
        this.executor.postRemoveInfo(i);
    }

    public void endAndEnsureToDB(int i) {
        this.executor.removePostWithId(i);
        try {
            if (this.executor.isFreeToDatabase(i)) {
                return;
            }
            this.executor.postSync(i);
        } finally {
            this.executor.postRemoveFreeId(i);
        }
    }

    public boolean isNotFreeToDatabase(int i) {
        return !this.executor.isFreeToDatabase(i);
    }

    public void onTaskStart(int i) {
        this.executor.removePostWithId(i);
        this.executor.postSyncInfoDelay(i, this.delayMillis);
    }

    public void shutdown() {
        this.executor.shutdown();
    }

    public RemitSyncToDBHelper(@NonNull RemitSyncExecutor remitSyncExecutor) {
        this.executor = remitSyncExecutor;
        this.delayMillis = 1500L;
    }
}
