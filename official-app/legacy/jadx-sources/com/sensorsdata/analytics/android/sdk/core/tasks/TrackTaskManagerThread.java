package com.sensorsdata.analytics.android.sdk.core.tasks;

import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.TrackTaskManager;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class TrackTaskManagerThread implements Runnable {
    private static final int POOL_SIZE = 1;
    private boolean isStop = false;
    private ExecutorService mPool;
    private TrackTaskManager mTrackTaskManager;

    public TrackTaskManagerThread() {
        try {
            this.mTrackTaskManager = TrackTaskManager.getInstance();
            this.mPool = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.sensorsdata.analytics.android.sdk.core.tasks.TrackTaskManagerThread.1
                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    return new Thread(runnable, ThreadNameConstants.THREAD_TASK_EXECUTE);
                }
            });
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public boolean isStopped() {
        return this.isStop;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (!this.isStop) {
            try {
                this.mPool.execute(this.mTrackTaskManager.takeTrackEventTask());
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
                return;
            }
        }
        while (true) {
            Runnable runnablePollTrackEventTask = this.mTrackTaskManager.pollTrackEventTask();
            if (runnablePollTrackEventTask == null) {
                this.mPool.shutdown();
                return;
            }
            this.mPool.execute(runnablePollTrackEventTask);
        }
    }

    public void stop() {
        this.isStop = true;
        if (this.mTrackTaskManager.isEmpty()) {
            this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.core.tasks.TrackTaskManagerThread.2
                @Override // java.lang.Runnable
                public void run() {
                }
            });
        }
    }
}
