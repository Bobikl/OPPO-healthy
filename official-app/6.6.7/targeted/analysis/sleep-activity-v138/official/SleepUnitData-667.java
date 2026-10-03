package com.heytap.health.core.widget.charts.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateFormat;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public class SleepUnitData implements Parcelable {
    public static final Parcelable.Creator<SleepUnitData> CREATOR = new a();
    public static final int TYPE_AWAKE = 4;
    public static final int TYPE_DEEP_SLEEP = 1;
    public static final int TYPE_EYE_MOVEMENT = 3;
    public static final int TYPE_LIGHT_SLEEP = 2;
    private Integer deviceType;
    private long duration;
    private float heartRateHeightY;
    private float heartRateLowY;
    private boolean isIWatch;
    private boolean isStageSleepEnd;
    private float spo2HeightY;
    private float spo2LowY;
    private long timestamp;
    private int type;

    public class a implements Parcelable.Creator<SleepUnitData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SleepUnitData createFromParcel(Parcel parcel) {
            return new SleepUnitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SleepUnitData[] newArray(int i) {
            return new SleepUnitData[i];
        }
    }

    public SleepUnitData() {
        this.type = 1;
    }

    public boolean deepEquals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepUnitData)) {
            return false;
        }
        SleepUnitData sleepUnitData = (SleepUnitData) obj;
        return this.timestamp == sleepUnitData.timestamp && this.type == sleepUnitData.type && this.duration == sleepUnitData.duration;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SleepUnitData) && this.timestamp == ((SleepUnitData) obj).timestamp;
    }

    public Integer getDeviceType() {
        return this.deviceType;
    }

    public long getDuration() {
        return this.duration;
    }

    public float getHeartRateHeightY() {
        return this.heartRateHeightY;
    }

    public float getHeartRateLowY() {
        return this.heartRateLowY;
    }

    public float getSpo2HeightY() {
        return this.spo2HeightY;
    }

    public float getSpo2LowY() {
        return this.spo2LowY;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.timestamp));
    }

    public boolean isIWatch() {
        return this.isIWatch;
    }

    public boolean isStageSleepEnd() {
        return this.isStageSleepEnd;
    }

    public void setDeviceType(Integer num) {
        this.deviceType = num;
    }

    public void setDuration(long j2) {
        this.duration = j2;
    }

    public void setHeartRateHeightY(float f) {
        this.heartRateHeightY = f;
    }

    public void setHeartRateLowY(float f) {
        this.heartRateLowY = f;
    }

    public void setIWatch(boolean z) {
        this.isIWatch = z;
    }

    public void setSpo2HeightY(float f) {
        this.spo2HeightY = f;
    }

    public void setSpo2LowY(float f) {
        this.spo2LowY = f;
    }

    public void setStageSleepEnd(boolean z) {
        this.isStageSleepEnd = z;
    }

    public void setTimestamp(long j2) {
        this.timestamp = j2;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String toString() {
        return "SleepUnitData{timestamp=" + ((Object) DateFormat.format("yyyy/MM/dd:HH:mm:ss", this.timestamp)) + ", type=" + this.type + ", duration=" + ((this.duration / 60) / 1000) + ", deviceType=" + this.deviceType + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.timestamp);
        parcel.writeInt(this.type);
        parcel.writeLong(this.duration);
        parcel.writeByte(this.isStageSleepEnd ? (byte) 1 : (byte) 0);
    }

    public SleepUnitData(long j2, int i, long j3) {
        this.timestamp = j2;
        this.type = i;
        this.duration = j3;
    }

    public SleepUnitData(Parcel parcel) {
        this.type = 1;
        this.timestamp = parcel.readLong();
        this.type = parcel.readInt();
        this.duration = parcel.readLong();
        this.isStageSleepEnd = parcel.readByte() != 0;
    }
}