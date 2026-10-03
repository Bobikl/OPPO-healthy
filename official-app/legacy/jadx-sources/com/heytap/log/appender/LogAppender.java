package com.heytap.log.appender;

import com.heytap.log.ILogWriter;
import com.heytap.log.Logger;
import com.heytap.log.NLogWriter;
import com.heytap.log.core.LoganModel;
import com.heytap.log.core.bean.CLogBean;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes19.dex */
public class LogAppender implements ILogAppender {
    private final AtomicBoolean inited = new AtomicBoolean(false);
    private final Logger logger;
    private ILogWriter mLogWriter;

    public LogAppender(Logger logger) {
        this.logger = logger;
        this.mLogWriter = new NLogWriter(logger);
    }

    @Override // com.heytap.log.appender.ILogAppender
    public void append(CLogBean cLogBean) {
        if (cLogBean == null) {
            return;
        }
        ensureInit();
        ILogWriter iLogWriter = this.mLogWriter;
        if (iLogWriter != null) {
            iLogWriter.append(cLogBean);
        }
    }

    @Override // com.heytap.log.appender.ILogAppender
    public void close() {
        if (this.mLogWriter != null) {
            ensureInit();
            this.mLogWriter.close();
        }
    }

    public void ensureInit() {
        if (this.inited.get()) {
            return;
        }
        synchronized (this) {
            if (!this.inited.get()) {
                this.mLogWriter.init(this.logger.getConfig());
                this.inited.set(true);
            }
        }
    }

    @Override // com.heytap.log.appender.ILogAppender
    public void flush() {
        flush(null);
    }

    @Override // com.heytap.log.appender.ILogAppender
    public void flushSync() {
        ensureInit();
        ILogWriter iLogWriter = this.mLogWriter;
        if (iLogWriter != null) {
            iLogWriter.flushSync();
        }
    }

    @Override // com.heytap.log.appender.ILogAppender
    public long getCacheQueueSize() {
        ensureInit();
        ILogWriter iLogWriter = this.mLogWriter;
        if (iLogWriter != null) {
            return iLogWriter.getCacheQueueSize();
        }
        return 0L;
    }

    @Override // com.heytap.log.appender.ILogAppender
    public void quitThread() {
        if (this.mLogWriter != null) {
            ensureInit();
            this.mLogWriter.quitThread();
        }
    }

    public void setJustDeletedLogFile(boolean z) {
        if (this.mLogWriter != null) {
            ensureInit();
            this.mLogWriter.setJustDeletedLogFile(z);
        }
    }

    @Override // com.heytap.log.appender.ILogAppender
    public void flush(LoganModel.OnActionCompleteListener onActionCompleteListener) {
        ensureInit();
        ILogWriter iLogWriter = this.mLogWriter;
        if (iLogWriter != null) {
            iLogWriter.flush(onActionCompleteListener);
        }
    }

    @Override // com.heytap.log.appender.ILogAppender
    public void append(String str, String str2, byte b, int i) {
        ensureInit();
        ILogWriter iLogWriter = this.mLogWriter;
        if (iLogWriter != null) {
            iLogWriter.append(str, str2, b, i);
        }
    }

    @Override // com.heytap.log.appender.ILogAppender
    public void append(String str, String str2, byte b, int i, boolean z) {
        ensureInit();
        ILogWriter iLogWriter = this.mLogWriter;
        if (iLogWriter != null) {
            iLogWriter.append(str, str2, b, i, z);
        }
    }
}
