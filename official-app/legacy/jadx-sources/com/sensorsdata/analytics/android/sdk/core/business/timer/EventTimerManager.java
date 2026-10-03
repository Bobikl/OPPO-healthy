package com.sensorsdata.analytics.android.sdk.core.business.timer;

import android.os.SystemClock;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.util.SADataHelper;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class EventTimerManager {
    private final Map<String, EventTimer> mTrackTimer;

    public static class SingletonHolder {
        private static final EventTimerManager mInstance = new EventTimerManager();

        private SingletonHolder() {
        }
    }

    public static synchronized EventTimerManager getInstance() {
        return SingletonHolder.mInstance;
    }

    public void addEventTimer(String str, EventTimer eventTimer) {
        synchronized (this.mTrackTimer) {
            this.mTrackTimer.put(str, eventTimer);
        }
    }

    public void appBecomeActive() {
        EventTimer value;
        synchronized (this.mTrackTimer) {
            try {
                for (Map.Entry<String, EventTimer> entry : this.mTrackTimer.entrySet()) {
                    if (entry != null && (value = entry.getValue()) != null) {
                        value.setStartTime(SystemClock.elapsedRealtime());
                    }
                }
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
            }
        }
    }

    public void appEnterBackground() {
        EventTimer value;
        synchronized (this.mTrackTimer) {
            try {
                for (Map.Entry<String, EventTimer> entry : this.mTrackTimer.entrySet()) {
                    if (entry != null && !"$AppEnd".equals(entry.getKey()) && (value = entry.getValue()) != null && !value.isPaused()) {
                        value.setEventAccumulatedDuration((value.getEventAccumulatedDuration() + SystemClock.elapsedRealtime()) - value.getStartTime());
                        value.setStartTime(SystemClock.elapsedRealtime());
                    }
                }
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
            }
        }
    }

    public void clearTimers() {
        try {
            synchronized (this.mTrackTimer) {
                this.mTrackTimer.clear();
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public EventTimer getEventTimer(String str) {
        EventTimer eventTimer;
        synchronized (this.mTrackTimer) {
            eventTimer = this.mTrackTimer.get(str);
            this.mTrackTimer.remove(str);
        }
        return eventTimer;
    }

    public void removeTimer(String str) {
        synchronized (this.mTrackTimer) {
            this.mTrackTimer.remove(str);
        }
    }

    public void updateEndTime(String str, long j2) {
        synchronized (this.mTrackTimer) {
            EventTimer eventTimer = this.mTrackTimer.get(str);
            if (eventTimer != null) {
                eventTimer.setEndTime(j2);
            }
        }
    }

    public void updateTimerState(String str, long j2, boolean z) {
        try {
            SADataHelper.assertEventName(str);
            synchronized (this.mTrackTimer) {
                EventTimer eventTimer = this.mTrackTimer.get(str);
                if (eventTimer != null && eventTimer.isPaused() != z) {
                    eventTimer.setTimerState(z, j2);
                }
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    private EventTimerManager() {
        this.mTrackTimer = new HashMap();
    }
}
