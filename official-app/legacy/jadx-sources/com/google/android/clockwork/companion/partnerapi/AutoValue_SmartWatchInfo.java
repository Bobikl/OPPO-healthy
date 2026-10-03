package com.google.android.clockwork.companion.partnerapi;

import android.bluetooth.BluetoothDevice;
import androidx.annotation.DrawableRes;

/* JADX INFO: loaded from: classes13.dex */
final class AutoValue_SmartWatchInfo extends SmartWatchInfo {
    private final BluetoothDevice bluetoothDevice;
    private final int deviceModelImageResId;
    private final int rssiValue;
    private final long timeStampMs;

    public static final class Builder extends SmartWatchInfo.Builder {
        private BluetoothDevice bluetoothDevice;
        private Integer deviceModelImageResId;
        private Integer rssiValue;
        private Long timeStampMs;

        @Override // com.google.android.clockwork.companion.partnerapi.SmartWatchInfo.Builder
        public SmartWatchInfo build() {
            String str = "";
            if (this.bluetoothDevice == null) {
                str = " bluetoothDevice";
            }
            if (this.rssiValue == null) {
                str = str + " rssiValue";
            }
            if (this.deviceModelImageResId == null) {
                str = str + " deviceModelImageResId";
            }
            if (this.timeStampMs == null) {
                str = str + " timeStampMs";
            }
            if (str.isEmpty()) {
                return new AutoValue_SmartWatchInfo(this.bluetoothDevice, this.rssiValue.intValue(), this.deviceModelImageResId.intValue(), this.timeStampMs.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.clockwork.companion.partnerapi.SmartWatchInfo.Builder
        public SmartWatchInfo.Builder setBluetoothDevice(BluetoothDevice bluetoothDevice) {
            if (bluetoothDevice == null) {
                throw new NullPointerException("Null bluetoothDevice");
            }
            this.bluetoothDevice = bluetoothDevice;
            return this;
        }

        @Override // com.google.android.clockwork.companion.partnerapi.SmartWatchInfo.Builder
        public SmartWatchInfo.Builder setDeviceModelImageResId(int i) {
            this.deviceModelImageResId = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.android.clockwork.companion.partnerapi.SmartWatchInfo.Builder
        public SmartWatchInfo.Builder setRssiValue(int i) {
            this.rssiValue = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.android.clockwork.companion.partnerapi.SmartWatchInfo.Builder
        public SmartWatchInfo.Builder setTimeStampMs(long j2) {
            this.timeStampMs = Long.valueOf(j2);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SmartWatchInfo)) {
            return false;
        }
        SmartWatchInfo smartWatchInfo = (SmartWatchInfo) obj;
        return this.bluetoothDevice.equals(smartWatchInfo.getBluetoothDevice()) && this.rssiValue == smartWatchInfo.getRssiValue() && this.deviceModelImageResId == smartWatchInfo.getDeviceModelImageResId() && this.timeStampMs == smartWatchInfo.getTimeStampMs();
    }

    @Override // com.google.android.clockwork.companion.partnerapi.SmartWatchInfo
    public BluetoothDevice getBluetoothDevice() {
        return this.bluetoothDevice;
    }

    @Override // com.google.android.clockwork.companion.partnerapi.SmartWatchInfo
    @DrawableRes
    public int getDeviceModelImageResId() {
        return this.deviceModelImageResId;
    }

    @Override // com.google.android.clockwork.companion.partnerapi.SmartWatchInfo
    public int getRssiValue() {
        return this.rssiValue;
    }

    @Override // com.google.android.clockwork.companion.partnerapi.SmartWatchInfo
    public long getTimeStampMs() {
        return this.timeStampMs;
    }

    public int hashCode() {
        int iHashCode = (((((this.bluetoothDevice.hashCode() ^ 1000003) * 1000003) ^ this.rssiValue) * 1000003) ^ this.deviceModelImageResId) * 1000003;
        long j2 = this.timeStampMs;
        return ((int) (j2 ^ (j2 >>> 32))) ^ iHashCode;
    }

    public String toString() {
        return "SmartWatchInfo{bluetoothDevice=" + this.bluetoothDevice + ", rssiValue=" + this.rssiValue + ", deviceModelImageResId=" + this.deviceModelImageResId + ", timeStampMs=" + this.timeStampMs + "}";
    }

    private AutoValue_SmartWatchInfo(BluetoothDevice bluetoothDevice, int i, int i2, long j2) {
        this.bluetoothDevice = bluetoothDevice;
        this.rssiValue = i;
        this.deviceModelImageResId = i2;
        this.timeStampMs = j2;
    }
}
