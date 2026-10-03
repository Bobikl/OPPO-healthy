package com.heytap.log;

import android.text.TextUtils;
import android.util.Log;
import com.heytap.log.log.SimpleLog;
import com.heytap.log.uploader.UploadManager;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class Nogger {
    private static final long CHECK_UPLOAD_FOR_CDN_INTERVAL = 120000;
    private static final String TAG = "NearX-HLog";
    private Logger logger;
    private Settings settings;
    private ISimpleLog simpleLog;
    private long lastCheckUploadForCdnTime = 0;
    private LogCacheManager cacheManager = new LogCacheManager();

    private void flushCachedLogs() {
        if (this.simpleLog == null) {
            return;
        }
        List<CachedLogBean> listDrainCache = this.cacheManager.drainCache();
        if (listDrainCache != null && !listDrainCache.isEmpty()) {
            Iterator<CachedLogBean> it = listDrainCache.iterator();
            while (it.hasNext()) {
                writeCachedLog(it.next());
            }
        }
        this.cacheManager.disableCache();
    }

    private void writeCachedLog(CachedLogBean cachedLogBean) {
        if (this.simpleLog == null) {
            return;
        }
        byte level = cachedLogBean.getLevel();
        if (level == 1) {
            this.simpleLog.v(cachedLogBean.getTag(), cachedLogBean.getMessage(), cachedLogBean.isShowConsole());
            return;
        }
        if (level == 2) {
            this.simpleLog.d(cachedLogBean.getTag(), cachedLogBean.getMessage(), cachedLogBean.isShowConsole());
            return;
        }
        if (level == 3) {
            this.simpleLog.i(cachedLogBean.getTag(), cachedLogBean.getMessage(), cachedLogBean.isShowConsole());
        } else if (level == 4) {
            this.simpleLog.w(cachedLogBean.getTag(), cachedLogBean.getMessage(), cachedLogBean.isShowConsole());
        } else {
            if (level != 5) {
                return;
            }
            this.simpleLog.e(cachedLogBean.getTag(), cachedLogBean.getMessage(), cachedLogBean.isShowConsole());
        }
    }

    public void a(String str) {
        Logger logger = this.logger;
        if (logger != null) {
            logger.a(TAG, str);
            return;
        }
        Log.e(TAG, "HLog未初始化-->" + str);
    }

    public void checkOPushDataContent(String str) {
        if (this.logger == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.logger.checkOPushDataContent(str);
    }

    public void checkUploadForCdn() {
        Settings settings;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.lastCheckUploadForCdnTime < CHECK_UPLOAD_FOR_CDN_INTERVAL) {
            Log.d(TAG, "间隔时长小于120秒");
            return;
        }
        Logger logger = this.logger;
        if (logger != null && (settings = this.settings) != null) {
            logger.innerCheckMultiUploadForCdn(settings.getBusiness());
        }
        this.lastCheckUploadForCdnTime = jCurrentTimeMillis;
    }

    public void d(String str) {
        ISimpleLog iSimpleLog = this.simpleLog;
        if (iSimpleLog != null) {
            iSimpleLog.d(TAG, str);
            return;
        }
        if (this.cacheManager.shouldCache()) {
            this.cacheManager.addToCache(TAG, str, (byte) 2, false);
        }
        Log.d(TAG, "HLog未初始化-->" + str);
    }

    public void deleteLogFile() {
        Logger logger = this.logger;
        if (logger != null) {
            logger.deleteLogFile();
        }
    }

    public void e(String str) {
        ISimpleLog iSimpleLog = this.simpleLog;
        if (iSimpleLog != null) {
            iSimpleLog.e(TAG, str);
            return;
        }
        if (this.cacheManager.shouldCache()) {
            this.cacheManager.addToCache(TAG, str, (byte) 5, false);
        }
        Log.e(TAG, "HLog未初始化-->" + str);
    }

    public void flush(boolean z) {
        Logger logger = this.logger;
        if (logger != null) {
            logger.flush(z);
        }
    }

    public File[] getAllLogFiles() {
        Logger logger = this.logger;
        if (logger != null) {
            return logger.getAllFiles();
        }
        return null;
    }

    public Logger getLogger() {
        return this.logger;
    }

    public void i(String str) {
        ISimpleLog iSimpleLog = this.simpleLog;
        if (iSimpleLog != null) {
            iSimpleLog.i(TAG, str);
            return;
        }
        if (this.cacheManager.shouldCache()) {
            this.cacheManager.addToCache(TAG, str, (byte) 3, false);
        }
        Log.i(TAG, "HLog未初始化-->" + str);
    }

    public void init(Settings settings) {
        if (settings == null || settings.getContext() == null) {
            throw new IllegalStateException("init log context or settings is null !");
        }
        this.cacheManager.enableCache();
        this.settings = settings;
        Logger logger = LoggerContext.getInstance().getLogger(settings);
        this.logger = logger;
        this.simpleLog = logger.getSimpleLog() != null ? this.logger.getSimpleLog() : new SimpleLog(null);
        flushCachedLogs();
    }

    public void reportNoWifiUpload(String str, UploadManager.ReportUploaderListener reportUploaderListener) {
        reportUpload(1, str, false, reportUploaderListener);
    }

    @Deprecated
    public void reportUpload(int i, String str, UploadManager.ReportUploaderListener reportUploaderListener) {
        reportUpload(i, str, true, reportUploaderListener);
    }

    public void setDebug(boolean z) {
        Logger logger = this.logger;
        if (logger != null) {
            logger.setDebug(z);
        }
    }

    public void v(String str) {
        ISimpleLog iSimpleLog = this.simpleLog;
        if (iSimpleLog != null) {
            iSimpleLog.v(TAG, str);
            return;
        }
        if (this.cacheManager.shouldCache()) {
            this.cacheManager.addToCache(TAG, str, (byte) 1, false);
        }
        Log.v(TAG, "HLog未初始化-->" + str);
    }

    public void w(String str) {
        ISimpleLog iSimpleLog = this.simpleLog;
        if (iSimpleLog != null) {
            iSimpleLog.w(TAG, str);
            return;
        }
        if (this.cacheManager.shouldCache()) {
            this.cacheManager.addToCache(TAG, str, (byte) 4, false);
        }
        Log.w(TAG, "HLog未初始化-->" + str);
    }

    public void reportUpload(int i, String str, boolean z, UploadManager.ReportUploaderListener reportUploaderListener) {
        if (reportUploaderListener == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = ((long) (i <= 0 ? 1 : i)) * 3600000;
        Logger logger = this.logger;
        if (logger == null || this.settings == null) {
            return;
        }
        logger.setReporterListener(reportUploaderListener);
        this.logger.reportUpload(this.settings.getBusiness(), "" + jCurrentTimeMillis, jCurrentTimeMillis - j2, jCurrentTimeMillis, z, "", this.settings.getMdpName(), str, this.settings.getMdpSecret());
    }

    public void a(String str, String str2) {
        Logger logger = this.logger;
        if (logger == null) {
            Log.e(str, "HLog未初始化-->" + str2);
            return;
        }
        logger.a(str, str2);
    }

    public void d(String str, String str2) {
        ISimpleLog iSimpleLog = this.simpleLog;
        if (iSimpleLog == null) {
            if (this.cacheManager.shouldCache()) {
                this.cacheManager.addToCache(str, str2, (byte) 2, false);
            }
            Log.d(str, "HLog未初始化-->" + str2);
            return;
        }
        iSimpleLog.d(str, str2);
    }

    public void e(String str, String str2) {
        ISimpleLog iSimpleLog = this.simpleLog;
        if (iSimpleLog == null) {
            if (this.cacheManager.shouldCache()) {
                this.cacheManager.addToCache(str, str2, (byte) 5, false);
            }
            Log.e(str, "HLog未初始化-->" + str2);
            return;
        }
        iSimpleLog.e(str, str2);
    }

    public void i(String str, String str2) {
        ISimpleLog iSimpleLog = this.simpleLog;
        if (iSimpleLog == null) {
            if (this.cacheManager.shouldCache()) {
                Log.d("Hlog测试", "i加入addToCache");
                this.cacheManager.addToCache(str, str2, (byte) 3, false);
            }
            Log.i(str, "HLog未初始化-->" + str2);
            return;
        }
        iSimpleLog.i(str, str2);
    }

    public void v(String str, String str2) {
        ISimpleLog iSimpleLog = this.simpleLog;
        if (iSimpleLog == null) {
            if (this.cacheManager.shouldCache()) {
                this.cacheManager.addToCache(str, str2, (byte) 1, false);
            }
            Log.v(str, "HLog未初始化-->" + str2);
            return;
        }
        iSimpleLog.v(str, str2);
    }

    public void w(String str, String str2) {
        ISimpleLog iSimpleLog = this.simpleLog;
        if (iSimpleLog == null) {
            if (this.cacheManager.shouldCache()) {
                this.cacheManager.addToCache(str, str2, (byte) 4, false);
            }
            Log.w(str, "HLog未初始化-->" + str2);
            return;
        }
        iSimpleLog.w(str, str2);
    }

    public void a(String str, String str2, HashMap<String, String> map) {
        Logger logger = this.logger;
        if (logger == null) {
            Log.e(TAG, "HLog未初始化-->" + str2);
            return;
        }
        logger.a(str, str2, map);
    }

    public void reportUpload(String str, UploadManager.ReportUploaderListener reportUploaderListener) {
        reportUpload(1, str, true, reportUploaderListener);
    }

    public void reportUpload(long j2, long j3, String str, boolean z, UploadManager.ReportUploaderListener reportUploaderListener) {
        Logger logger;
        if (reportUploaderListener == null || (logger = this.logger) == null || this.settings == null) {
            return;
        }
        logger.setReporterListener(reportUploaderListener);
        this.logger.reportUpload(this.settings.getBusiness(), "" + j3, j2, j3, z, "", this.settings.getMdpName(), str, this.settings.getMdpSecret());
    }

    public void d(String str, String str2, boolean z) {
        ISimpleLog iSimpleLog = this.simpleLog;
        if (iSimpleLog == null) {
            if (this.cacheManager.shouldCache()) {
                this.cacheManager.addToCache(str, str2, (byte) 2, false);
            }
            Log.d(str, "HLog未初始化-->" + str2);
            return;
        }
        iSimpleLog.d(str, str2, z);
    }

    public void e(String str, String str2, boolean z) {
        ISimpleLog iSimpleLog = this.simpleLog;
        if (iSimpleLog == null) {
            if (this.cacheManager.shouldCache()) {
                this.cacheManager.addToCache(str, str2, (byte) 5, false);
            }
            Log.e(str, "HLog未初始化-->" + str2);
            return;
        }
        iSimpleLog.e(str, str2, z);
    }

    public void v(String str, String str2, boolean z) {
        ISimpleLog iSimpleLog = this.simpleLog;
        if (iSimpleLog == null) {
            if (this.cacheManager.shouldCache()) {
                this.cacheManager.addToCache(str, str2, (byte) 1, false);
            }
            Log.v(str, "HLog未初始化-->" + str2);
            return;
        }
        iSimpleLog.v(str, str2, z);
    }

    public void w(String str, String str2, boolean z) {
        ISimpleLog iSimpleLog = this.simpleLog;
        if (iSimpleLog == null) {
            if (this.cacheManager.shouldCache()) {
                this.cacheManager.addToCache(str, str2, (byte) 4, false);
            }
            Log.w(str, "HLog未初始化-->" + str2);
            return;
        }
        iSimpleLog.w(str, str2, z);
    }

    public void i(String str, String str2, boolean z) {
        ISimpleLog iSimpleLog = this.simpleLog;
        if (iSimpleLog == null) {
            if (this.cacheManager.shouldCache()) {
                this.cacheManager.addToCache(str, str2, (byte) 3, false);
            }
            Log.i(str, "HLog未初始化-->" + str2);
            return;
        }
        iSimpleLog.i(str, str2, z);
    }

    public void reportUpload(long j2, long j3, String str, UploadManager.ReportUploaderListener reportUploaderListener) {
        reportUpload(j2, j3, str, true, reportUploaderListener);
    }
}
