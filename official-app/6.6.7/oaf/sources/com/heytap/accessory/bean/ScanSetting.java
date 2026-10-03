package com.heytap.accessory.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class ScanSetting implements Parcelable {
    public static final Parcelable.Creator<ScanSetting> CREATOR = new Parcelable.Creator<ScanSetting>() { // from class: com.heytap.accessory.bean.ScanSetting.1
        @Override // android.os.Parcelable.Creator
        public ScanSetting createFromParcel(Parcel parcel) {
            return new ScanSetting(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ScanSetting[] newArray(int i) {
            return new ScanSetting[i];
        }
    };
    public static final byte GO_INTENT_MAX = 15;
    public static final byte GO_INTENT_MIN = 0;
    public static final byte GO_INTENT_NOT_SET = -1;
    public static final byte GO_INTENT_PHONE_DEFAULT = 8;
    private static final int LIMITS_BALANCED_MAX_DURATION = 10800000;
    private static final int LIMITS_LOW_LATENCY_MAX_DURATION = 10800000;
    private static final int LIMITS_LOW_POWER_MAX_DURATION = 10800000;
    private static final int LIMITS_TOTAL_SCAN_MAX_DURATION = 10800000;
    public static final int SCAN_TYPE_BLE = 0;
    public static final int SCAN_TYPE_BT = 1;
    public static final int SCAN_TYPE_WIFI = 2;
    private final int mBalancedDuration;
    private final boolean mForcedDiscovery;
    private final boolean mHandleByService;
    private final int mLowLatencyDuration;
    private final int mLowPowerDuration;
    private final int mScanType;

    public static final class Builder {
        private int mScanType = 0;
        private int mLowLatencyDuration = 0;
        private int mBalancedDuration = 0;
        private int mLowPowerDuration = 0;
        private boolean mHandleByService = false;
        private boolean mForcedDiscovery = false;

        public ScanSetting build() {
            return new ScanSetting(this.mScanType, this.mLowLatencyDuration, this.mBalancedDuration, this.mLowPowerDuration, this.mHandleByService, this.mForcedDiscovery);
        }

        public Builder setBalancedDuration(int i) {
            if (i < 0 || i > 10800000) {
                throw new IllegalArgumentException("balancedDuration invalid (must be 0-10800000 milliseconds)");
            }
            this.mBalancedDuration = i;
            return this;
        }

        public Builder setForcedDiscovery(boolean z) {
            this.mForcedDiscovery = z;
            return this;
        }

        public Builder setHandleByService(boolean z) {
            this.mHandleByService = z;
            return this;
        }

        public Builder setLowLatencyDuration(int i) {
            if (i < 0 || i > 10800000) {
                throw new IllegalArgumentException("lowLatencyDuration invalid (must be 0-10800000 milliseconds)");
            }
            this.mLowLatencyDuration = i;
            return this;
        }

        public Builder setLowPowerDuration(int i) {
            if (i < 0 || i > 10800000) {
                throw new IllegalArgumentException("lowPowerDuration invalid (must be 0-10800000 milliseconds)");
            }
            this.mLowPowerDuration = i;
            return this;
        }

        public Builder setScanType(int i) {
            if (i >= 0 && i <= 2) {
                this.mScanType = i;
                return this;
            }
            throw new IllegalArgumentException("unknown scan type " + i);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getBalancedDuration() {
        return this.mBalancedDuration;
    }

    public int getLowLatencyDuration() {
        return this.mLowLatencyDuration;
    }

    public int getLowPowerDuration() {
        return this.mLowPowerDuration;
    }

    public int getScanType() {
        return this.mScanType;
    }

    public boolean isForcedDiscovery() {
        return this.mForcedDiscovery;
    }

    public boolean isHandleByService() {
        return this.mHandleByService;
    }

    public String toString() {
        return "ScanSetting{mScanType=" + this.mScanType + ", mLowLatencyDuration=" + this.mLowLatencyDuration + ", mBalancedDuration=" + this.mBalancedDuration + ", mLowPowerDuration=" + this.mLowPowerDuration + ", mHandleByService=" + this.mHandleByService + ", mForcedDiscovery=" + this.mForcedDiscovery + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mScanType);
        parcel.writeInt(this.mLowLatencyDuration);
        parcel.writeInt(this.mBalancedDuration);
        parcel.writeInt(this.mLowPowerDuration);
        parcel.writeBoolean(this.mHandleByService);
        parcel.writeBoolean(this.mForcedDiscovery);
    }

    private ScanSetting(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        this.mScanType = i;
        this.mLowLatencyDuration = i2;
        this.mBalancedDuration = i3;
        this.mLowPowerDuration = i4;
        this.mHandleByService = z;
        this.mForcedDiscovery = z2;
    }

    public ScanSetting(Parcel parcel) {
        this.mScanType = parcel.readInt();
        this.mLowLatencyDuration = parcel.readInt();
        this.mBalancedDuration = parcel.readInt();
        this.mLowPowerDuration = parcel.readInt();
        this.mHandleByService = parcel.readBoolean();
        this.mForcedDiscovery = parcel.readBoolean();
    }
}
