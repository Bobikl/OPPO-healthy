package com.heytap.log.log;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.heytap.log.ISimpleLog;
import com.heytap.log.Logger;
import com.heytap.log.appender.ILogAppender;
import com.heytap.log.collect.LoggingEvent;

/* JADX INFO: loaded from: classes19.dex */
public class LogProcessor implements ISimpleLog {
    private static final int MAX_BLOCK_MAIN_SIZE = 100;
    private static final String TAG = "NearX-HLog_LogProcessor";
    private SafeConLinkedQueue blockQueue;
    private Object lock;
    private ILogAppender mAppender;
    private ICollectLog mCollectLog;
    private LogThread mLogThread;
    private SimpleLog mSimpleLog;
    private long preTimeStamp;
    private int blockIndex = 0;
    private boolean isQueueEmpty = true;
    private long filterMainQueueSize = 0;
    private Logger logger = null;

    public class LogThread extends Thread {
        SafeConLinkedQueue blockQueue;
        boolean exit = false;

        public LogThread(SafeConLinkedQueue safeConLinkedQueue) {
            this.blockQueue = safeConLinkedQueue;
        }

        public void Quit() {
            this.exit = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            while (!this.exit) {
                if (this.blockQueue != null) {
                    long cacheQueueSize = LogProcessor.this.mAppender.getCacheQueueSize();
                    if (cacheQueueSize > 450) {
                        try {
                            if (!Thread.currentThread().isInterrupted()) {
                                Thread.sleep(1L);
                            }
                        } catch (Throwable unused) {
                        }
                    } else {
                        LogBean logBeanPoll = this.blockQueue.poll();
                        if (logBeanPoll == null) {
                            synchronized (LogProcessor.this.lock) {
                                try {
                                    this.blockQueue.verifySize();
                                    LogProcessor.this.lock.wait();
                                } catch (Throwable unused2) {
                                }
                            }
                        } else {
                            if (LogProcessor.this.mAppender != null && cacheQueueSize > 200) {
                                if (LogProcessor.this.blockIndex == 0) {
                                    LogProcessor.this.preTimeStamp = System.currentTimeMillis();
                                }
                                LogProcessor.access$208(LogProcessor.this);
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                if (LogProcessor.this.blockIndex >= 10 && jCurrentTimeMillis - LogProcessor.this.preTimeStamp < 1000) {
                                    LogProcessor.this.blockIndex = 0;
                                    try {
                                        if (!Thread.currentThread().isInterrupted()) {
                                            Thread.sleep(100L);
                                        }
                                    } catch (InterruptedException unused3) {
                                        Thread.currentThread().interrupt();
                                    } catch (Throwable unused4) {
                                    }
                                }
                                if (jCurrentTimeMillis - LogProcessor.this.preTimeStamp >= 1000) {
                                    LogProcessor.this.blockIndex = 0;
                                }
                                try {
                                    if (!Thread.currentThread().isInterrupted()) {
                                        Thread.sleep(20L);
                                    }
                                } catch (InterruptedException unused5) {
                                    Thread.currentThread().interrupt();
                                } catch (Throwable unused6) {
                                }
                            }
                            if (logBeanPoll.getMark() == 0) {
                                LogProcessor.this.writeLogInfo(logBeanPoll);
                            } else if (LogProcessor.this.mCollectLog != null) {
                                LogProcessor.this.mCollectLog.append(logBeanPoll.getEvent(), logBeanPoll.getLogType());
                            }
                        }
                    }
                }
            }
            Log.e(LogProcessor.TAG, "***********************************************");
            Log.e(LogProcessor.TAG, "*******************LogProcessor线程退出*****************");
            Log.e(LogProcessor.TAG, "***********************************************");
            SafeConLinkedQueue safeConLinkedQueue = this.blockQueue;
            if (safeConLinkedQueue == null || safeConLinkedQueue.size() <= 0) {
                return;
            }
            this.blockQueue.clear();
        }
    }

    public LogProcessor(SimpleLog simpleLog, ICollectLog iCollectLog, ILogAppender iLogAppender, Logger logger) {
        this.mSimpleLog = simpleLog;
        this.mCollectLog = iCollectLog;
        this.mAppender = iLogAppender;
        this.blockQueue = new SafeConLinkedQueue(logger);
        initThread();
    }

    public static /* synthetic */ int access$208(LogProcessor logProcessor) {
        int i = logProcessor.blockIndex;
        logProcessor.blockIndex = i + 1;
        return i;
    }

    private boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public void append(LoggingEvent loggingEvent, int i) {
        if (loggingEvent != null) {
            sendLogInfo(new LogBean(loggingEvent, i));
        }
    }

    public boolean canWriteLog() {
        SafeConLinkedQueue safeConLinkedQueue = this.blockQueue;
        if (safeConLinkedQueue != null) {
            return safeConLinkedQueue.canWriteLog();
        }
        return true;
    }

    @Override // com.heytap.log.ISimpleLog
    public void d(String str, String str2) {
        sendLogInfo(new LogBean((byte) 2, str, str2));
    }

    @Override // com.heytap.log.ISimpleLog
    public void e(String str, String str2) {
        sendLogInfo(new LogBean((byte) 5, str, str2));
    }

    @Override // com.heytap.log.ISimpleLog
    public void i(String str, String str2) {
        sendLogInfo(new LogBean((byte) 3, str, str2));
    }

    public void initThread() {
        this.lock = new Object();
        LogThread logThread = new LogThread(this.blockQueue);
        this.mLogThread = logThread;
        logThread.setName("logan-thread-1");
        this.mLogThread.start();
    }

    public void notifyRun() {
        synchronized (this.lock) {
            this.lock.notify();
        }
    }

    public void quitThread() {
        LogThread logThread = this.mLogThread;
        if (logThread == null || !logThread.isAlive()) {
            return;
        }
        this.mLogThread.Quit();
        this.mLogThread.interrupt();
    }

    public void sendLogInfo(LogBean logBean) {
        if (logBean == null || this.mLogThread.exit) {
            return;
        }
        String tag = logBean.getTag();
        String log = logBean.getLog();
        if (TextUtils.isEmpty(tag)) {
            logBean.setTag("hlog");
        }
        if (TextUtils.isEmpty(log)) {
            return;
        }
        if (this.mSimpleLog == null) {
            Log.e(TAG, "HLog未初始化-->" + logBean.getLog());
            return;
        }
        SafeConLinkedQueue safeConLinkedQueue = this.blockQueue;
        if (safeConLinkedQueue != null) {
            safeConLinkedQueue.offer(logBean);
            if (isMainThread()) {
                long j2 = this.filterMainQueueSize + 1;
                this.filterMainQueueSize = j2;
                if (j2 > 100) {
                    this.filterMainQueueSize = 0L;
                }
            } else {
                this.filterMainQueueSize = 0L;
            }
            if (this.filterMainQueueSize == 0) {
                notifyRun();
            }
        }
    }

    @Override // com.heytap.log.ISimpleLog
    public void v(String str, String str2) {
        sendLogInfo(new LogBean((byte) 1, str, str2));
    }

    @Override // com.heytap.log.ISimpleLog
    public void w(String str, String str2) {
        sendLogInfo(new LogBean((byte) 4, str, str2));
    }

    public void writeLogInfo(LogBean logBean) {
        if (logBean == null) {
            return;
        }
        SimpleLog simpleLog = this.mSimpleLog;
        if (simpleLog != null) {
            simpleLog.checkAndLog(logBean);
            return;
        }
        Log.e(TAG, "HLog未初始化-->" + logBean.getLog());
    }

    @Override // com.heytap.log.ISimpleLog
    public void d(String str, String str2, boolean z) {
        sendLogInfo(new LogBean((byte) 2, str, str2, z));
    }

    @Override // com.heytap.log.ISimpleLog
    public void e(String str, String str2, boolean z) {
        sendLogInfo(new LogBean((byte) 5, str, str2, z));
    }

    @Override // com.heytap.log.ISimpleLog
    public void i(String str, String str2, boolean z) {
        sendLogInfo(new LogBean((byte) 3, str, str2, z));
    }

    @Override // com.heytap.log.ISimpleLog
    public void v(String str, String str2, boolean z) {
        sendLogInfo(new LogBean((byte) 1, str, str2, z));
    }

    @Override // com.heytap.log.ISimpleLog
    public void w(String str, String str2, boolean z) {
        sendLogInfo(new LogBean((byte) 4, str, str2, z));
    }
}
