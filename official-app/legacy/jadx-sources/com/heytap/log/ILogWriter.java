package com.heytap.log;

import com.heytap.log.core.LoganConfig;
import com.heytap.log.core.LoganModel;
import com.heytap.log.core.bean.CLogBean;

/* JADX INFO: loaded from: classes19.dex */
public interface ILogWriter {
    void append(CLogBean cLogBean);

    void append(String str, String str2, byte b, int i);

    void append(String str, String str2, byte b, int i, boolean z);

    void close();

    void flush();

    void flush(LoganModel.OnActionCompleteListener onActionCompleteListener);

    void flushSync();

    long getCacheQueueSize();

    void init(LoganConfig loganConfig);

    void quitThread();

    void setJustDeletedLogFile(boolean z);
}
