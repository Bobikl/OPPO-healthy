package com.heytap.log.core;

import com.heytap.log.Logger;
import com.heytap.log.core.bean.CLogBean;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class Logan {
    static boolean sDebug = false;
    private Logger logger;
    private LoganControlCenter sLoganControlCenter;

    public Logan(Logger logger) {
        this.logger = logger;
        sDebug = logger.isDebug();
        this.sLoganControlCenter = new LoganControlCenter(logger);
    }

    public void flush() {
        flush(null);
    }

    public void flushSync() {
        LoganControlCenter loganControlCenter = this.sLoganControlCenter;
        if (loganControlCenter == null) {
            throw new RuntimeException("Please initialize Logan first");
        }
        loganControlCenter.flushSync();
    }

    public File[] getAllFiles() {
        LoganControlCenter loganControlCenter = this.sLoganControlCenter;
        if (loganControlCenter == null) {
            throw new RuntimeException("Please initialize Logan first");
        }
        File dir = loganControlCenter.getDir();
        if (dir.exists()) {
            return dir.listFiles();
        }
        return null;
    }

    public Map<String, Long> getAllFilesInfo() {
        File[] fileArrListFiles;
        LoganControlCenter loganControlCenter = this.sLoganControlCenter;
        if (loganControlCenter == null) {
            throw new RuntimeException("Please initialize Logan first");
        }
        File dir = loganControlCenter.getDir();
        if (!dir.exists() || (fileArrListFiles = dir.listFiles()) == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (File file : fileArrListFiles) {
            try {
                map.put(Util.getDateStr(Long.parseLong(file.getName())), Long.valueOf(file.length()));
            } catch (NumberFormatException unused) {
            }
        }
        return map;
    }

    public long getCacheQueueSize() {
        LoganControlCenter loganControlCenter = this.sLoganControlCenter;
        if (loganControlCenter != null) {
            return loganControlCenter.getCacheQueueSize();
        }
        return 0L;
    }

    public void onListenerLogWriteStatus(String str, int i) {
        OnLoganProtocolStatus onLoganProtocolStatus = this.sLoganControlCenter.getsLoganProtocolStatus();
        if (onLoganProtocolStatus != null) {
            onLoganProtocolStatus.loganProtocolStatus(str, i);
        }
    }

    public void quitThread() {
        LoganControlCenter loganControlCenter = this.sLoganControlCenter;
        if (loganControlCenter != null) {
            loganControlCenter.quitThread();
        }
    }

    public void s(String[] strArr, SendLogRunnable sendLogRunnable) {
        LoganControlCenter loganControlCenter = this.sLoganControlCenter;
        if (loganControlCenter == null) {
            throw new RuntimeException("Please initialize Logan first");
        }
        loganControlCenter.send(strArr, sendLogRunnable);
    }

    public void setDebug(boolean z) {
        sDebug = z;
    }

    public void setJustDeletedLogFile(boolean z) {
        LoganControlCenter loganControlCenter = this.sLoganControlCenter;
        if (loganControlCenter != null) {
            loganControlCenter.setJustDeletedLogFile(z);
        }
    }

    public void setOnLoganProtocolStatus(OnLoganProtocolStatus onLoganProtocolStatus) {
        this.sLoganControlCenter.setsLoganProtocolStatus(onLoganProtocolStatus);
    }

    public void w(String str, String str2, byte b, int i) {
        LoganControlCenter loganControlCenter = this.sLoganControlCenter;
        if (loganControlCenter == null) {
            throw new RuntimeException("Please initialize Logan first");
        }
        loganControlCenter.write(str, str2, b, i);
    }

    public void flush(LoganModel.OnActionCompleteListener onActionCompleteListener) {
        LoganControlCenter loganControlCenter = this.sLoganControlCenter;
        if (loganControlCenter == null) {
            throw new RuntimeException("Please initialize Logan first");
        }
        loganControlCenter.flush(onActionCompleteListener);
    }

    public void w(String str, String str2, byte b, int i, boolean z) {
        LoganControlCenter loganControlCenter = this.sLoganControlCenter;
        if (loganControlCenter != null) {
            loganControlCenter.write(str, str2, b, i, z);
            return;
        }
        throw new RuntimeException("Please initialize Logan first with keyflag");
    }

    public void w(CLogBean cLogBean) {
        LoganControlCenter loganControlCenter = this.sLoganControlCenter;
        if (loganControlCenter == null) {
            throw new RuntimeException("Please initialize Logan first with keyflag");
        }
        if (cLogBean != null) {
            loganControlCenter.write(cLogBean);
        }
    }
}
