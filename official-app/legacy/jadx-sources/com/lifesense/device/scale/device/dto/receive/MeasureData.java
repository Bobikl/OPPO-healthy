package com.lifesense.device.scale.device.dto.receive;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.annotation.JSONField;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public class MeasureData implements Parcelable {
    public static final Parcelable.Creator<MeasureData> CREATOR = new a();
    public Date date;
    public SimpleDateFormat dateFormat;

    @JSONField(name = "id")
    public String dbId;
    public String deviceId;
    public String deviceMode;
    public long measurementTime;
    public long userId;

    public static class a implements Parcelable.Creator<MeasureData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MeasureData createFromParcel(Parcel parcel) {
            return new MeasureData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MeasureData[] newArray(int i) {
            return new MeasureData[i];
        }
    }

    public MeasureData() {
    }

    public MeasureData(Parcel parcel) {
        this.userId = parcel.readLong();
        this.dateFormat = (SimpleDateFormat) parcel.readSerializable();
        long j2 = parcel.readLong();
        this.date = j2 == -1 ? null : new Date(j2);
        this.deviceId = parcel.readString();
        this.measurementTime = parcel.readLong();
        this.deviceMode = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String formatDate(long j2) {
        if (this.dateFormat == null) {
            this.dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
        if (this.date == null) {
            this.date = new Date();
        }
        this.date.setTime(j2 * 1000);
        return this.dateFormat.format(this.date);
    }

    public String getDbId() {
        return this.dbId;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getDeviceMode() {
        return this.deviceMode;
    }

    public long getMeasurementTime() {
        return this.measurementTime;
    }

    public long getUserId() {
        return this.userId;
    }

    public MeasureData setDbId(String str) {
        this.dbId = str;
        return this;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setDeviceMode(String str) {
        this.deviceMode = str;
    }

    public void setMeasurementTime(long j2) {
        this.measurementTime = j2;
    }

    public void setUserId(long j2) {
        this.userId = j2;
    }

    public String toString() {
        return "MeasureData{userId=" + this.userId + ", deviceId='" + this.deviceId + "', measurementTime=" + this.measurementTime + ", deviceMode='" + this.deviceMode + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.userId);
        parcel.writeSerializable(this.dateFormat);
        Date date = this.date;
        parcel.writeLong(date != null ? date.getTime() : -1L);
        parcel.writeString(this.deviceId);
        parcel.writeLong(this.measurementTime);
        parcel.writeString(this.deviceMode);
    }
}
