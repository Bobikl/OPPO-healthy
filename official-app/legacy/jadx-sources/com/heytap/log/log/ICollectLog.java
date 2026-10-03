package com.heytap.log.log;

import com.heytap.log.collect.LoggingEvent;

/* JADX INFO: loaded from: classes19.dex */
public interface ICollectLog {
    void append(LoggingEvent loggingEvent, int i);

    void appendSync(LoggingEvent loggingEvent, int i);
}
