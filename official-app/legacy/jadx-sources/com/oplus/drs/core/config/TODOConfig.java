package com.oplus.drs.core.config;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class TODOConfig {
    public static final double CLEANUP_TARGET_RATIO = 0.8d;
    public static final int DEFAULT_MAX_STORAGE_MB = 350;
    public static final int DEFAULT_QUOTA_GLOBAL_MB = 150;
    public static final int DEFAULT_QUOTA_PER_APP_MB = 12;

    @SerializedName("drsUploadPeriodMinutes")
    private int drsUploadPeriodMinutes;

    @SerializedName("hashFromMinutes")
    private final int hashFromMinutes;

    @SerializedName("hashUntilMinutes")
    private final int hashUntilMinutes;

    @SerializedName("lowBatteryBlockPercent")
    private int lowBatteryBlockPercent;

    @SerializedName("maxStorageMB")
    private final int maxStorageMB;

    @SerializedName("obusUploadPeriodMinutes")
    private int obusUploadPeriodMinutes;

    @SerializedName("osenseCpuBlockLevel")
    private int osenseCpuBlockLevel;

    @SerializedName("osenseThermalBlockLevel")
    private int osenseThermalBlockLevel;

    @SerializedName("pseudoPeriodMinutes")
    private final int pseudoPeriodMinutes;

    @SerializedName("quotaGlobalMB")
    private final int quotaGlobalMB;

    @SerializedName("quotaPerAppMB")
    private final int quotaPerAppMB;

    public TODOConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.lowBatteryBlockPercent = i;
        this.osenseCpuBlockLevel = i2;
        this.osenseThermalBlockLevel = i3;
        this.maxStorageMB = i4;
        this.quotaPerAppMB = i5;
        this.quotaGlobalMB = i6;
        this.drsUploadPeriodMinutes = i7;
        this.obusUploadPeriodMinutes = i8;
        this.hashFromMinutes = i9;
        this.hashUntilMinutes = i10;
        this.pseudoPeriodMinutes = i11;
    }

    public long getCleanupTargetBytes() {
        return (long) (getMaxStorageBytes() * 0.8d);
    }

    public int getDrsUploadPeriodMinutes() {
        return this.drsUploadPeriodMinutes;
    }

    public int getHashFromMinutes() {
        return this.hashFromMinutes;
    }

    public int getHashUntilMinutes() {
        return this.hashUntilMinutes;
    }

    public int getLowBatteryBlockPercent() {
        int i = this.lowBatteryBlockPercent;
        if (i <= 0 || i > 100) {
            return 20;
        }
        return i;
    }

    public long getMaxStorageBytes() {
        return ((long) getMaxStorageMB()) * 1024 * 1024;
    }

    public int getMaxStorageMB() {
        int i = this.maxStorageMB;
        if (i > 0) {
            return i;
        }
        return 350;
    }

    public int getObusUploadPeriodMinutes() {
        return this.obusUploadPeriodMinutes;
    }

    public int getOsenseCpuBlockLevel() {
        int i = this.osenseCpuBlockLevel;
        if (i > 0) {
            return i;
        }
        return 3;
    }

    public int getOsenseThermalBlockLevel() {
        int i = this.osenseThermalBlockLevel;
        if (i > 0) {
            return i;
        }
        return 3;
    }

    public int getPseudoPeriodMinutes() {
        return this.pseudoPeriodMinutes;
    }

    public long getQuotaGlobalBytes() {
        return ((long) getQuotaGlobalMB()) * 1024 * 1024;
    }

    public int getQuotaGlobalMB() {
        int i = this.quotaGlobalMB;
        if (i > 0) {
            return i;
        }
        return 150;
    }

    public long getQuotaPerAppBytes() {
        return ((long) getQuotaPerAppMB()) * 1024 * 1024;
    }

    public int getQuotaPerAppMB() {
        int i = this.quotaPerAppMB;
        if (i > 0) {
            return i;
        }
        return 12;
    }
}
