package com.heytap.device.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes15.dex */
public class SyncDataParam implements Parcelable {
    public static final Parcelable.Creator<SyncDataParam> CREATOR = new a();
    public static final int SYNC_ALL = 1;
    public static final int SYNC_BY_TYPES = 2;
    public static final int SYNC_FOR_CUSTOM_TIME = 3;
    public static final int SYNC_RANDOM_FOR_TEST = 4;
    private int[] dataTypeList;
    private int endTime;
    private boolean isAutoSync;
    private int randomSyncCount;
    private int startTime;
    private int syncType;
    private int triggerType;

    public class a implements Parcelable.Creator<SyncDataParam> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SyncDataParam createFromParcel(Parcel parcel) {
            return new SyncDataParam(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SyncDataParam[] newArray(int i) {
            return new SyncDataParam[i];
        }
    }

    public SyncDataParam() {
        this.startTime = -1;
        this.endTime = -1;
        this.randomSyncCount = 0;
        this.isAutoSync = false;
        this.triggerType = 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int[] getDataTypeList() {
        return this.dataTypeList;
    }

    public int getEndTime() {
        return this.endTime;
    }

    public int getRandomSyncCount() {
        return this.randomSyncCount;
    }

    public int getStartTime() {
        return this.startTime;
    }

    public int getSyncType() {
        return this.syncType;
    }

    public int getTriggerType() {
        return this.triggerType;
    }

    public boolean isAutoSync() {
        return this.isAutoSync;
    }

    public void setAutoSync(boolean z) {
        this.isAutoSync = z;
    }

    public void setDataTypeList(int[] iArr) {
        this.dataTypeList = iArr;
    }

    public void setEndTime(int i) {
        this.endTime = i;
    }

    public void setRandomSyncCount(int i) {
        this.randomSyncCount = i;
    }

    public void setStartTime(int i) {
        this.startTime = i;
    }

    public void setSyncType(int i) {
        this.syncType = i;
    }

    public void setTriggerType(int i) {
        this.triggerType = i;
    }

    @NonNull
    public String toString() {
        return "SyncDataParam{syncType=" + this.syncType + ", dataTypeList=" + Arrays.toString(this.dataTypeList) + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", randomSyncCount=" + this.randomSyncCount + ", isAutoSync=" + this.isAutoSync + ", triggerType=" + this.triggerType + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.syncType);
        parcel.writeIntArray(this.dataTypeList);
        parcel.writeInt(this.startTime);
        parcel.writeInt(this.endTime);
        parcel.writeInt(this.randomSyncCount);
        parcel.writeByte(this.isAutoSync ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.triggerType);
    }

    public SyncDataParam(Parcel parcel) {
        this.startTime = -1;
        this.endTime = -1;
        this.randomSyncCount = 0;
        this.isAutoSync = false;
        this.triggerType = 1;
        this.syncType = parcel.readInt();
        this.dataTypeList = parcel.createIntArray();
        this.startTime = parcel.readInt();
        this.endTime = parcel.readInt();
        this.randomSyncCount = parcel.readInt();
        this.isAutoSync = parcel.readByte() != 0;
        this.triggerType = parcel.readInt();
    }
}
