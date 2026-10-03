package com.sensorsdata.analytics.android.sdk;

import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes10.dex */
public class TrackTaskManager {
    private static TrackTaskManager trackTaskManager;
    private final LinkedBlockingQueue<Runnable> mTrackEventTasks = new LinkedBlockingQueue<>();

    private TrackTaskManager() {
    }

    public static synchronized TrackTaskManager getInstance() {
        try {
            if (trackTaskManager == null) {
                trackTaskManager = new TrackTaskManager();
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
        return trackTaskManager;
    }

    public void addTrackEventTask(Runnable runnable) {
        try {
            this.mTrackEventTasks.put(runnable);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public boolean isEmpty() {
        return this.mTrackEventTasks.isEmpty();
    }

    public Runnable pollTrackEventTask() {
        try {
            return this.mTrackEventTasks.poll();
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return null;
        }
    }

    public Runnable takeTrackEventTask() {
        try {
            return this.mTrackEventTasks.take();
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return null;
        }
    }
}
