package com.heytap.log.collect.auto;

import android.content.Context;
import com.heytap.log.IBaseLog;
import com.heytap.log.collect.LoggingEvent;
import com.heytap.log.log.ICollectLog;
import com.heytap.log.log.SimpleLog;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class ActionCollect implements IDataCollect, IBaseLog {
    private ICollectLog mAppender;
    private SimpleLog mSimpleLog;

    public ActionCollect(ICollectLog iCollectLog) {
        this.mAppender = iCollectLog;
    }

    public void appendActionInfo(String str, String str2) {
        if (this.mAppender != null) {
            LoggingEvent loggingEvent = new LoggingEvent(str, str2, (byte) 4, Thread.currentThread().getName(), null, null);
            SimpleLog simpleLog = this.mSimpleLog;
            if (simpleLog != null) {
                simpleLog.append(loggingEvent, getLogType());
            } else {
                this.mAppender.append(loggingEvent, getLogType());
            }
        }
    }

    @Override // com.heytap.log.collect.auto.IDataCollect
    public void destroy(Context context) {
    }

    @Override // com.heytap.log.IBaseLog
    public int getLogType() {
        return 106;
    }

    @Override // com.heytap.log.collect.auto.IDataCollect
    public void init(Context context) {
    }

    public ActionCollect(ICollectLog iCollectLog, SimpleLog simpleLog) {
        this.mAppender = iCollectLog;
        this.mSimpleLog = simpleLog;
    }

    public void appendActionInfo(String str, String str2, HashMap<String, String> map) {
        if (this.mAppender != null) {
            LoggingEvent loggingEvent = new LoggingEvent(str, str2, (byte) 4, Thread.currentThread().getName(), map, null);
            SimpleLog simpleLog = this.mSimpleLog;
            if (simpleLog != null) {
                simpleLog.append(loggingEvent, getLogType());
            } else {
                this.mAppender.append(loggingEvent, getLogType());
            }
        }
    }
}
