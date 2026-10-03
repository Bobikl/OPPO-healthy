package com.heytap.health.device_data_sync;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes16.dex */
public class DeviceDataSyncResult implements Parcelable {
    public static final String ACTION_DEVICE_DATA_SYNC_RESULT = "com.heytap.device.ACTION_DEVICE_DATA_SYNC_RESULT";
    public static final Parcelable.Creator<DeviceDataSyncResult> CREATOR = new a();
    public static final String KEY_DEVICE_DATA_SYNC_RESULT = "key_device_data_sync_result";
    public static final int RESULT_FAIL = 3;
    public static final int RESULT_SUCCESS_WITHOUT_DATA = 2;
    public static final int RESULT_SUCCESS_WITH_DATA = 1;
    private int dataType;
    private int newDataEndTime;
    private int newDataStartTime;
    private int resultCode;

    public class a implements Parcelable.Creator<DeviceDataSyncResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DeviceDataSyncResult createFromParcel(Parcel parcel) {
            return new DeviceDataSyncResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DeviceDataSyncResult[] newArray(int i) {
            return new DeviceDataSyncResult[i];
        }
    }

    public DeviceDataSyncResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDataType() {
        return this.dataType;
    }

    public int getNewDataEndTime() {
        return this.newDataEndTime;
    }

    public int getNewDataStartTime() {
        return this.newDataStartTime;
    }

    public int getResultCode() {
        return this.resultCode;
    }

    public void setDataType(int i) {
        this.dataType = i;
    }

    public void setNewDataEndTime(int i) {
        this.newDataEndTime = i;
    }

    public void setNewDataStartTime(int i) {
        this.newDataStartTime = i;
    }

    public void setResultCode(int i) {
        this.resultCode = i;
    }

    public String toString() {
        return "SyncResult{dataType=" + this.dataType + ", code=" + this.resultCode + ", start=" + this.newDataStartTime + ", end=" + this.newDataEndTime + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.dataType);
        parcel.writeInt(this.resultCode);
        parcel.writeInt(this.newDataStartTime);
        parcel.writeInt(this.newDataEndTime);
    }

    public DeviceDataSyncResult(Parcel parcel) {
        this.dataType = parcel.readInt();
        this.resultCode = parcel.readInt();
        this.newDataStartTime = parcel.readInt();
        this.newDataEndTime = parcel.readInt();
    }
}
