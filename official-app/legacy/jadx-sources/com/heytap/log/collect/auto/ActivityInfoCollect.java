package com.heytap.log.collect.auto;

import android.app.Activity;
import android.content.Context;
import com.heytap.log.IBaseLog;
import com.heytap.log.collect.LoggingEvent;
import com.heytap.log.log.ICollectLog;
import com.heytap.log.log.SimpleLog;
import com.heytap.log.util.BaseInfoUtil;
import com.heytap.log.util.ThreadUtil;

/* JADX INFO: loaded from: classes19.dex */
public class ActivityInfoCollect implements IAutoCollect, IBaseLog {
    private static final String ACTIVITY_TAG = "activity_lifecycle";
    private static final String SESSION_TAG = "session";
    private static ICollectLog mAppender;
    private static SimpleLog mSimpleLog;
    private int mActVisCount = 0;
    private boolean mIgnActVisCountChg = false;

    public ActivityInfoCollect(ICollectLog iCollectLog) {
        mAppender = iCollectLog;
    }

    private boolean isActivityConfigChanging(Activity activity) {
        return activity.getChangingConfigurations() != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateActVisCnt(boolean z, boolean z2, Context context, String str) {
        if (mAppender == null) {
            return;
        }
        if (!z) {
            int i = this.mActVisCount - 1;
            this.mActVisCount = i;
            if (i == 0 || z2) {
                LoggingEvent loggingEvent = new LoggingEvent(SESSION_TAG, "session end", (byte) 4, null, null, null);
                SimpleLog simpleLog = mSimpleLog;
                if (simpleLog != null) {
                    simpleLog.append(loggingEvent, getLogType());
                    return;
                } else {
                    mAppender.append(loggingEvent, getLogType());
                    return;
                }
            }
            return;
        }
        int i2 = this.mActVisCount;
        this.mActVisCount = i2 + 1;
        if (i2 != 0 || z2) {
            return;
        }
        LoggingEvent loggingEvent2 = new LoggingEvent(SESSION_TAG, "session start", (byte) 4, null, null, null);
        SimpleLog simpleLog2 = mSimpleLog;
        if (simpleLog2 != null) {
            simpleLog2.append(loggingEvent2, getLogType());
        } else {
            mAppender.append(loggingEvent2, getLogType());
        }
        try {
            LoggingEvent loggingEvent3 = new LoggingEvent(NetworkChangeCollect.NETWORK_TAG, BaseInfoUtil.getNetWorkInfo(), (byte) 4, null, null, null);
            SimpleLog simpleLog3 = mSimpleLog;
            if (simpleLog3 != null) {
                simpleLog3.append(loggingEvent3, 104);
            } else {
                mAppender.append(loggingEvent3, 103);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.heytap.log.collect.auto.IDataCollect
    public void destroy(Context context) {
    }

    @Override // com.heytap.log.IBaseLog
    public int getLogType() {
        return 104;
    }

    @Override // com.heytap.log.collect.auto.IDataCollect
    public void init(Context context) {
    }

    @Override // com.heytap.log.collect.auto.IAutoCollect
    public void onActivityStart(final Context context) {
        if (mAppender == null) {
            return;
        }
        final String simpleName = ((Activity) context).getClass().getSimpleName();
        ThreadUtil.executeInThreadPool(new Runnable() { // from class: com.heytap.log.collect.auto.ActivityInfoCollect.1
            @Override // java.lang.Runnable
            public void run() {
                ActivityInfoCollect activityInfoCollect = ActivityInfoCollect.this;
                activityInfoCollect.updateActVisCnt(true, activityInfoCollect.mIgnActVisCountChg, context, simpleName);
            }
        });
        this.mIgnActVisCountChg = false;
        LoggingEvent loggingEvent = new LoggingEvent(ACTIVITY_TAG, simpleName + " start ", (byte) 4, null, null, null);
        SimpleLog simpleLog = mSimpleLog;
        if (simpleLog != null) {
            simpleLog.append(loggingEvent, getLogType());
        } else {
            mAppender.append(loggingEvent, getLogType());
        }
    }

    @Override // com.heytap.log.collect.auto.IAutoCollect
    public void onActivityStop(Context context) {
        if (mAppender == null) {
            return;
        }
        Activity activity = (Activity) context;
        LoggingEvent loggingEvent = new LoggingEvent(ACTIVITY_TAG, activity.getClass().getSimpleName() + " stop ", (byte) 4, null, null, null);
        SimpleLog simpleLog = mSimpleLog;
        if (simpleLog != null) {
            simpleLog.append(loggingEvent, getLogType());
        } else {
            mAppender.append(loggingEvent, getLogType());
        }
        this.mIgnActVisCountChg = isActivityConfigChanging(activity);
        ThreadUtil.executeInThreadPool(new Runnable() { // from class: com.heytap.log.collect.auto.ActivityInfoCollect.2
            @Override // java.lang.Runnable
            public void run() {
                ActivityInfoCollect activityInfoCollect = ActivityInfoCollect.this;
                activityInfoCollect.updateActVisCnt(false, activityInfoCollect.mIgnActVisCountChg, null, null);
            }
        });
    }

    public ActivityInfoCollect(ICollectLog iCollectLog, SimpleLog simpleLog) {
        mAppender = iCollectLog;
        mSimpleLog = simpleLog;
    }
}
