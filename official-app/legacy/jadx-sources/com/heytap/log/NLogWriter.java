package com.heytap.log;

import android.util.Log;
import com.heytap.log.core.Logan;
import com.heytap.log.core.LoganConfig;
import com.heytap.log.core.LoganModel;
import com.heytap.log.core.OnLoganProtocolStatus;
import com.heytap.log.core.bean.CLogBean;

/* JADX INFO: loaded from: classes19.dex */
public class NLogWriter implements ILogWriter {
    private static final String TAG = "NLogWriter";
    private Logger logger;
    private Logan mLogan = null;

    public NLogWriter(Logger logger) {
        this.logger = logger;
    }

    @Override // com.heytap.log.ILogWriter
    public void append(String str, String str2, byte b, int i) {
        try {
            this.mLogan.w(str, str2, b, i);
        } catch (Exception e2) {
            Log.e(TAG, "append : " + e2.toString());
        }
    }

    @Override // com.heytap.log.ILogWriter
    public void close() {
    }

    @Override // com.heytap.log.ILogWriter
    public void flush() {
        flush(null);
    }

    @Override // com.heytap.log.ILogWriter
    public void flushSync() {
        try {
            this.mLogan.flushSync();
        } catch (Exception e2) {
            Log.e(TAG, "flushSync : " + e2.toString());
        }
    }

    @Override // com.heytap.log.ILogWriter
    public long getCacheQueueSize() {
        Logan logan = this.mLogan;
        if (logan != null) {
            return logan.getCacheQueueSize();
        }
        return 0L;
    }

    @Override // com.heytap.log.ILogWriter
    public void init(LoganConfig loganConfig) {
        try {
            Logan logan = new Logan(this.logger);
            this.mLogan = logan;
            logan.setOnLoganProtocolStatus(new OnLoganProtocolStatus() { // from class: com.heytap.log.NLogWriter.1
                @Override // com.heytap.log.core.OnLoganProtocolStatus
                public void loganProtocolStatus(String str, int i) {
                    Log.i(NLogWriter.TAG, "loganProtocolStatus: " + str + "," + i);
                }
            });
        } catch (Throwable th) {
            Log.e(TAG, "init : " + th.toString());
        }
    }

    @Override // com.heytap.log.ILogWriter
    public void quitThread() {
        Logan logan = this.mLogan;
        if (logan != null) {
            logan.quitThread();
        }
    }

    @Override // com.heytap.log.ILogWriter
    public void setJustDeletedLogFile(boolean z) {
        Logan logan = this.mLogan;
        if (logan != null) {
            logan.setJustDeletedLogFile(z);
        }
    }

    @Override // com.heytap.log.ILogWriter
    public void flush(LoganModel.OnActionCompleteListener onActionCompleteListener) {
        try {
            this.mLogan.flush(onActionCompleteListener);
        } catch (Exception e2) {
            Log.e(TAG, "flush : " + e2.toString());
        }
    }

    @Override // com.heytap.log.ILogWriter
    public void append(String str, String str2, byte b, int i, boolean z) {
        try {
            this.mLogan.w(str, str2, b, i, z);
        } catch (Exception e2) {
            Log.e(TAG, "append : " + e2.toString());
        }
    }

    @Override // com.heytap.log.ILogWriter
    public void append(CLogBean cLogBean) {
        try {
            this.mLogan.w(cLogBean);
        } catch (Exception e2) {
            Log.e(TAG, "append : " + e2.toString());
        }
    }
}
