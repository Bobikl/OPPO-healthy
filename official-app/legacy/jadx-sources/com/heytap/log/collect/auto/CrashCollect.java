package com.heytap.log.collect.auto;

import android.content.Context;
import android.util.Log;
import com.heytap.log.IBaseLog;
import com.heytap.log.Logger;
import com.heytap.log.collect.LoggingEvent;
import com.heytap.log.log.ICollectLog;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes19.dex */
public class CrashCollect implements Thread.UncaughtExceptionHandler, IDataCollect, IBaseLog {
    private static final String CRASH_TAG = "crash_info";
    private static final int MAX_EXCEPTION_LENGTH = 10240;
    private Thread.UncaughtExceptionHandler defaultHandler;
    private ICollectLog mAppender;
    private Logger mLogger;

    public CrashCollect(ICollectLog iCollectLog) {
        this.mAppender = iCollectLog;
    }

    private String obtainException(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.close();
        return stringWriter.toString();
    }

    @Override // com.heytap.log.collect.auto.IDataCollect
    public void destroy(Context context) {
        Thread.setDefaultUncaughtExceptionHandler(this.defaultHandler);
        this.defaultHandler = null;
    }

    @Override // com.heytap.log.IBaseLog
    public int getLogType() {
        return 102;
    }

    @Override // com.heytap.log.collect.auto.IDataCollect
    public void init(Context context) {
        this.defaultHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public void setAppender(ICollectLog iCollectLog) {
        this.mAppender = iCollectLog;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (this.mAppender == null) {
            return;
        }
        String strObtainException = obtainException(th);
        Log.e(CRASH_TAG, strObtainException);
        if (strObtainException.length() > 10240) {
            strObtainException = strObtainException.substring(0, 10240) + "\n... [Exception truncated, original length: " + strObtainException.length() + " chars]";
        }
        this.mAppender.appendSync(new LoggingEvent(CRASH_TAG, strObtainException, (byte) 5, thread.getName(), null, null), getLogType());
        try {
            Thread.sleep(300L);
            Logger logger = this.mLogger;
            if (logger != null) {
                logger.flush(true);
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.defaultHandler;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (InterruptedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public CrashCollect(ICollectLog iCollectLog, Logger logger) {
        this.mAppender = iCollectLog;
        this.mLogger = logger;
    }
}
