package com.heytap.log.log;

import android.text.TextUtils;
import com.heytap.log.Logger;
import com.heytap.log.appender.ILogAppender;
import com.heytap.log.collect.ActivityLifeMonitor;
import com.heytap.log.collect.LoggingEvent;
import com.heytap.log.config.DynConfigManager;
import com.heytap.log.core.bean.CLogBean;
import com.heytap.log.uploader.UploadManager;

/* JADX INFO: loaded from: classes19.dex */
public class SimpleLog extends BaseSimpleLog {
    private long INTERVAL_CHECK_TIME;
    Logger logger;
    private final ILogAppender mAppender;
    private CollectLog mCollectLog;
    private long previtionTime;

    public SimpleLog(ILogAppender iLogAppender) {
        this.INTERVAL_CHECK_TIME = 5000L;
        this.logger = null;
        this.mAppender = iLogAppender;
        this.previtionTime = System.currentTimeMillis();
    }

    private CLogBean cvtLogBean(LogBean logBean) {
        if (logBean == null) {
            return null;
        }
        CLogBean cLogBean = new CLogBean();
        cLogBean.setTag(logBean.getTag());
        cLogBean.setMsg(logBean.getLog());
        cLogBean.setPriority(logBean.getLevel());
        cLogBean.setThreadLog(logBean.getThreadLog());
        cLogBean.setThreadName(logBean.getThreadName());
        cLogBean.setType(getLogType());
        cLogBean.setKeyFlag(logBean.isKeyFlag());
        return cLogBean;
    }

    private void log2File(LogBean logBean) {
        ILogAppender iLogAppender;
        if (logBean == null || TextUtils.isEmpty(logBean.getTag()) || TextUtils.isEmpty(logBean.getLog()) || (iLogAppender = this.mAppender) == null) {
            return;
        }
        iLogAppender.append(cvtLogBean(logBean));
    }

    public void append(LoggingEvent loggingEvent, int i) {
        if (loggingEvent != null) {
            LogBean logBean = new LogBean(loggingEvent, i);
            LogProcessor logProcessor = this.mLogProcessor;
            if (logProcessor != null) {
                logProcessor.sendLogInfo(logBean);
                return;
            }
            CollectLog collectLog = this.mCollectLog;
            if (collectLog != null) {
                collectLog.append(loggingEvent, i);
            }
        }
    }

    @Override // com.heytap.log.log.BaseSimpleLog
    public void checkAndLog(String str, String str2, boolean z, byte b) {
    }

    public void quitTd() {
        LogProcessor logProcessor = this.mLogProcessor;
        if (logProcessor != null) {
            logProcessor.quitThread();
        }
    }

    public void quitThread() {
        this.mAppender.quitThread();
        quitTd();
    }

    @Override // com.heytap.log.log.BaseSimpleLog
    public void checkAndLog(LogBean logBean) {
        if (logBean == null) {
            return;
        }
        String tag = logBean.getTag();
        String log = logBean.getLog();
        byte level = logBean.getLevel();
        if (TextUtils.isEmpty(tag) || TextUtils.isEmpty(log) || this.dynConfigManager == null) {
            return;
        }
        Logger logger = this.logger;
        UploadManager uploadManager = logger != null ? logger.getUploadManager() : null;
        if (uploadManager != null) {
            uploadManager.sendMessageWhetherForUpload();
        }
        if (this.dynConfigManager.isPrint(level)) {
            logBean.setKeyFlag(this.dynConfigManager.identityKeyWords(tag, log));
            log2File(logBean);
        }
    }

    private void log2File(String str, String str2, byte b) {
        ILogAppender iLogAppender;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (iLogAppender = this.mAppender) == null) {
            return;
        }
        iLogAppender.append(str, str2, b, getLogType());
    }

    public SimpleLog(ILogAppender iLogAppender, DynConfigManager dynConfigManager, ActivityLifeMonitor activityLifeMonitor) {
        this.INTERVAL_CHECK_TIME = 5000L;
        this.logger = null;
        this.mAppender = iLogAppender;
        this.dynConfigManager = dynConfigManager;
        this.monitor = activityLifeMonitor;
        this.previtionTime = System.currentTimeMillis();
    }

    private void log2File(String str, String str2, byte b, boolean z) {
        ILogAppender iLogAppender;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (iLogAppender = this.mAppender) == null) {
            return;
        }
        iLogAppender.append(str, str2, b, getLogType(), z);
    }

    public SimpleLog(ILogAppender iLogAppender, DynConfigManager dynConfigManager, ActivityLifeMonitor activityLifeMonitor, LogProcessor logProcessor, CollectLog collectLog, Logger logger) {
        super(logProcessor);
        this.INTERVAL_CHECK_TIME = 5000L;
        this.logger = null;
        this.mCollectLog = collectLog;
        this.mLogProcessor = new LogProcessor(this, collectLog, iLogAppender, logger);
        this.mAppender = iLogAppender;
        this.dynConfigManager = dynConfigManager;
        this.monitor = activityLifeMonitor;
        this.logger = logger;
        this.previtionTime = System.currentTimeMillis();
    }
}
