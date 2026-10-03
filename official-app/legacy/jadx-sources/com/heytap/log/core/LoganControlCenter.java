package com.heytap.log.core;

import android.os.Process;
import android.text.TextUtils;
import com.heytap.log.Logger;
import com.heytap.log.core.bean.CLogBean;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes19.dex */
class LoganControlCenter {
    private Logger logger;
    private long mAllLogsFileSize;
    private LinkedBlockingQueue<LoganModel> mCacheLogQueue;
    private String mCachePath;
    private String mEncryptIv16;
    private String mEncryptKey16;
    private String mFileNamePrefix;
    private LoganThread mLoganThread;
    private long mMaxLogFile;
    private int mMaxQueue;
    private long mMinSDCard;
    private String mPath;
    private long mSaveTime;
    private SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd");
    private long queueSize = 0;

    public LoganControlCenter(Logger logger) {
        this.mMaxQueue = 500;
        logger.getConfig().isValid();
        this.logger = logger;
        LoganConfig config = logger.getConfig();
        this.mPath = config.mPathPath;
        this.mCachePath = config.mCachePath;
        this.mFileNamePrefix = config.mFileNamePrefix;
        this.mSaveTime = config.mDay;
        this.mMinSDCard = config.mMinSDCard;
        this.mMaxLogFile = config.mMaxFile;
        this.mMaxQueue = (int) config.mMaxQueue;
        this.mAllLogsFileSize = config.allLogsFileSize;
        this.mEncryptKey16 = new String(config.mEncryptKey16);
        this.mEncryptIv16 = new String(config.mEncryptIv16);
        if (this.mMaxQueue < 200) {
            this.mMaxQueue = 500;
        }
        this.mCacheLogQueue = new LinkedBlockingQueue<>(this.mMaxQueue);
        logger.debug("HLog", "second cache size : " + this.mMaxQueue);
        logger.debug("HLog", "mAllLogsFileSize : " + this.mAllLogsFileSize);
        init();
    }

    private long getDateTime(String str) {
        try {
            return this.dataFormat.parse(str).getTime();
        } catch (ParseException e2) {
            this.logger.e("LoganControlCenter", "getDateTime : " + e2.toString());
            return 0L;
        }
    }

    private void init() {
        if (this.mLoganThread == null) {
            LoganThread loganThread = new LoganThread(this.logger, this.mCacheLogQueue, this.mCachePath, this.mPath, this.mSaveTime, this.mMaxLogFile, this.mMinSDCard, this.mEncryptKey16, this.mEncryptIv16, this.mFileNamePrefix, this.mAllLogsFileSize);
            this.mLoganThread = loganThread;
            loganThread.setName("logan-thread");
            this.mLoganThread.start();
        }
    }

    public void flush() {
        flush(null);
    }

    public void flushSync() {
        LoganThread loganThread;
        if (TextUtils.isEmpty(this.mPath) || (loganThread = this.mLoganThread) == null) {
            return;
        }
        loganThread.doFlushLog2File();
    }

    public long getCacheQueueSize() {
        return this.logger.getSecQueueSize();
    }

    public File getDir() {
        return new File(this.mPath);
    }

    public OnLoganProtocolStatus getsLoganProtocolStatus() {
        return this.mLoganThread.getsLoganProtocolStatus();
    }

    public void quitThread() {
        try {
            LoganThread loganThread = this.mLoganThread;
            if (loganThread != null) {
                loganThread.quit();
                this.mLoganThread.interrupt();
            }
        } catch (Exception unused) {
        }
    }

    public void send(String[] strArr, SendLogRunnable sendLogRunnable) {
        if (TextUtils.isEmpty(this.mPath) || strArr == null || strArr.length == 0) {
            return;
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                long dateTime = getDateTime(str);
                if (dateTime > 0) {
                    LoganModel loganModel = new LoganModel();
                    SendAction sendAction = new SendAction();
                    loganModel.action = LoganModel.Action.SEND;
                    sendAction.date = String.valueOf(dateTime);
                    sendAction.sendLogRunnable = sendLogRunnable;
                    loganModel.sendAction = sendAction;
                    this.mCacheLogQueue.add(loganModel);
                }
            }
        }
    }

    public void setJustDeletedLogFile(boolean z) {
        LoganThread loganThread = this.mLoganThread;
        if (loganThread != null) {
            loganThread.setJustDeletedLogFile(z);
        }
    }

    public void setsLoganProtocolStatus(OnLoganProtocolStatus onLoganProtocolStatus) {
        this.mLoganThread.setsLoganProtocolStatus(onLoganProtocolStatus);
    }

    public void write(String str, String str2, byte b, int i) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        LoganModel loganModel = new LoganModel();
        loganModel.action = LoganModel.Action.WRITE;
        WriteAction writeAction = new WriteAction();
        String name = Thread.currentThread().getName();
        long jMyTid = Process.myTid();
        writeAction.tag = str;
        writeAction.log = str2;
        writeAction.level = b;
        writeAction.localTime = System.currentTimeMillis();
        writeAction.flag = i;
        writeAction.threadId = jMyTid;
        writeAction.threadName = name;
        loganModel.writeAction = writeAction;
        try {
            this.mCacheLogQueue.put(loganModel);
            this.logger.inSecQueueSize();
            if (this.logger.getSecQueueSize() % 100 == 0) {
                this.logger.setSecQueueSize(this.mCacheLogQueue.size());
            }
        } catch (Throwable unused) {
        }
    }

    public void flush(LoganModel.OnActionCompleteListener onActionCompleteListener) {
        if (TextUtils.isEmpty(this.mPath)) {
            return;
        }
        LoganModel loganModel = new LoganModel();
        loganModel.action = LoganModel.Action.FLUSH;
        loganModel.listener = onActionCompleteListener;
        this.mCacheLogQueue.add(loganModel);
    }

    public void write(String str, String str2, byte b, int i, boolean z) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        LoganModel loganModel = new LoganModel();
        loganModel.action = LoganModel.Action.WRITE;
        WriteAction writeAction = new WriteAction();
        String name = Thread.currentThread().getName();
        long jMyTid = Process.myTid();
        writeAction.tag = str;
        writeAction.log = str2;
        writeAction.level = b;
        writeAction.localTime = System.currentTimeMillis();
        writeAction.flag = i;
        writeAction.threadId = jMyTid;
        writeAction.threadName = name;
        writeAction.isKeyFlag = z;
        loganModel.writeAction = writeAction;
        try {
            this.mCacheLogQueue.put(loganModel);
            this.logger.inSecQueueSize();
            if (this.logger.getSecQueueSize() % 100 == 0) {
                this.logger.setSecQueueSize(this.mCacheLogQueue.size());
            }
        } catch (Throwable unused) {
        }
    }

    public void write(CLogBean cLogBean) {
        if (cLogBean == null || TextUtils.isEmpty(cLogBean.getMsg())) {
            return;
        }
        LoganModel loganModel = new LoganModel();
        loganModel.action = LoganModel.Action.WRITE;
        WriteAction writeAction = new WriteAction();
        writeAction.tag = cLogBean.getTag();
        writeAction.log = cLogBean.getMsg();
        writeAction.level = cLogBean.getPriority();
        writeAction.localTime = System.currentTimeMillis();
        writeAction.flag = cLogBean.getType();
        writeAction.threadId = cLogBean.getThreadLog();
        writeAction.threadName = cLogBean.getThreadName();
        writeAction.isKeyFlag = cLogBean.isKeyFlag();
        loganModel.writeAction = writeAction;
        try {
            this.mCacheLogQueue.put(loganModel);
            this.logger.inSecQueueSize();
            if (this.logger.getSecQueueSize() % 100 == 0) {
                this.logger.setSecQueueSize(this.mCacheLogQueue.size());
            }
        } catch (InterruptedException e2) {
            throw new RuntimeException(e2);
        }
    }
}
