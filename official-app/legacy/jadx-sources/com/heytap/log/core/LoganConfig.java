package com.heytap.log.core;

import android.text.TextUtils;
import com.heytap.log.config.DynConfigManager;

/* JADX INFO: loaded from: classes19.dex */
public class LoganConfig {
    private static final long DAYS = 86400000;
    private static final long DEFAULT_DAY = 604800000;
    public static final long DEFAULT_FILE_MAX_M = 8;
    private static final long DEFAULT_FILE_SIZE = 8388608;
    public static final int DEFAULT_INNER_FIRST_CACHE_SIZE = 50000;
    public static final long DEFAULT_LOGS_MAX_SIZE = 1761607680;
    public static final int DEFAULT_MIN_FIRST_CACHE_SIZE = 10000;
    public static final long DEFAULT_MIN_LOGS_MAX_SIZE = 83886080;
    public static final long DEFAULT_MIN_SDCARD_SIZE = 52428800;
    public static final int DEFAULT_QUEUE = 500;
    public static final long DEFAULT_REPORT_ZIP_SIZE = 8388608;
    public static final long M = 1048576;
    public static final int MAX_LOGAN_MMAP_LENGTH = 768000;
    public static final int MIN_LOGAN_MMAP_LENGTH = 102400;
    public static final int MIN_SIZE_QUEUE = 200;
    long allLogsFileSize;
    DynConfigManager dynConfigManager;
    private int fisrtCacheSize;
    String mCachePath;
    long mDay;
    byte[] mEncryptIv16;
    byte[] mEncryptKey16;
    String mFileNamePrefix;
    long mMaxFile;
    long mMaxQueue;
    long mMinSDCard;
    public String mPathPath;

    public static final class Builder {
        long allLogSize;
        String mCachePath;
        DynConfigManager mDynConfigManager;
        byte[] mEncryptIv16;
        byte[] mEncryptKey16;
        String mPath;
        long mMaxFile = 8388608;
        long mDay = 604800000;
        long mMinSDCard = LoganConfig.DEFAULT_MIN_SDCARD_SIZE;
        String mFileNamePrefix = "";
        long maxQueue = 500;
        int fisrtCacheSize = 10000;

        public LoganConfig build() {
            LoganConfig loganConfig = new LoganConfig();
            loganConfig.setCachePath(this.mCachePath);
            loganConfig.setPathPath(this.mPath);
            loganConfig.setMaxFile(this.mMaxFile);
            loganConfig.setMinSDCard(this.mMinSDCard);
            loganConfig.setDay(this.mDay);
            loganConfig.setEncryptKey16(this.mEncryptKey16);
            loganConfig.setEncryptIV16(this.mEncryptIv16);
            loganConfig.setFileNamePrefix(this.mFileNamePrefix);
            loganConfig.setDynConfigManager(this.mDynConfigManager);
            loganConfig.setMaxQueue(this.maxQueue);
            loganConfig.setAllLogsFileSize(this.allLogSize);
            loganConfig.setFisrtCacheSize(this.fisrtCacheSize);
            return loganConfig;
        }

        public Builder setAllLogSize(long j2) {
            if (j2 < LoganConfig.DEFAULT_MIN_LOGS_MAX_SIZE) {
                j2 = 83886080;
            }
            this.allLogSize = j2;
            return this;
        }

        public Builder setCachePath(String str) {
            this.mCachePath = str;
            return this;
        }

        public Builder setDay(long j2) {
            this.mDay = j2 * 86400000;
            return this;
        }

        public Builder setDynConfigManager(DynConfigManager dynConfigManager) {
            this.mDynConfigManager = dynConfigManager;
            return this;
        }

        public Builder setEncryptIV16(byte[] bArr) {
            this.mEncryptIv16 = bArr;
            return this;
        }

        public Builder setEncryptKey16(byte[] bArr) {
            this.mEncryptKey16 = bArr;
            return this;
        }

        public Builder setFileNamePrefix(String str) {
            this.mFileNamePrefix = str;
            return this;
        }

        public Builder setFisrtCacheSize(int i) {
            if (i > 10000) {
                this.fisrtCacheSize = i;
            }
            return this;
        }

        public Builder setMaxFile(long j2) {
            this.mMaxFile = j2 * 1048576;
            return this;
        }

        public Builder setMaxQueue(long j2) {
            this.maxQueue = j2;
            return this;
        }

        public Builder setMinSDCard(long j2) {
            if (j2 < LoganConfig.DEFAULT_MIN_SDCARD_SIZE) {
                j2 = 52428800;
            }
            this.mMinSDCard = j2;
            return this;
        }

        public Builder setPath(String str) {
            this.mPath = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCachePath(String str) {
        this.mCachePath = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDay(long j2) {
        this.mDay = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncryptIV16(byte[] bArr) {
        this.mEncryptIv16 = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncryptKey16(byte[] bArr) {
        this.mEncryptKey16 = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileNamePrefix(String str) {
        this.mFileNamePrefix = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxFile(long j2) {
        this.mMaxFile = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxQueue(long j2) {
        if (j2 < 500) {
            return;
        }
        this.mMaxQueue = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinSDCard(long j2) {
        if (j2 < DEFAULT_MIN_SDCARD_SIZE) {
            j2 = 52428800;
        }
        this.mMinSDCard = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPathPath(String str) {
        this.mPathPath = str;
    }

    public int getFisrtCacheSize() {
        return this.fisrtCacheSize;
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(this.mCachePath) || TextUtils.isEmpty(this.mPathPath) || this.mEncryptKey16 == null || this.mEncryptIv16 == null) ? false : true;
    }

    public void setAllLogsFileSize(long j2) {
        if (j2 < DEFAULT_MIN_LOGS_MAX_SIZE) {
            j2 = 83886080;
        }
        this.allLogsFileSize = j2;
    }

    public void setDynConfigManager(DynConfigManager dynConfigManager) {
        this.dynConfigManager = dynConfigManager;
    }

    public void setFisrtCacheSize(int i) {
        if (i > 10000) {
            this.fisrtCacheSize = i;
        }
    }

    private LoganConfig() {
        this.allLogsFileSize = DEFAULT_LOGS_MAX_SIZE;
        this.mFileNamePrefix = "";
        this.mMaxFile = 8388608L;
        this.mDay = 604800000L;
        this.mMaxQueue = 500L;
        this.mMinSDCard = DEFAULT_MIN_SDCARD_SIZE;
        this.mEncryptKey16 = "0123456789012345".getBytes();
        this.mEncryptIv16 = "0123456789012345".getBytes();
        this.fisrtCacheSize = 50000;
    }
}
