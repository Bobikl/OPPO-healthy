package com.lifesense.device.scale.infrastructure.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.lifesense.android.bluetooth.core.tools.l;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public class DeviceSetting implements Parcelable {
    public static final Parcelable.Creator<DeviceSetting> CREATOR = new a();
    public String content;
    public Date created;
    public boolean deleted;
    public String deviceId;
    public String id;
    public String settingClass;
    public long settingTime;
    public long updated;
    public boolean uploadFlag;

    public static class a implements Parcelable.Creator<DeviceSetting> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceSetting createFromParcel(Parcel parcel) {
            return new DeviceSetting(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceSetting[] newArray(int i) {
            return new DeviceSetting[i];
        }
    }

    public DeviceSetting() {
    }

    public DeviceSetting(Parcel parcel) {
        this.id = parcel.readString();
        this.deviceId = parcel.readString();
        this.settingClass = parcel.readString();
        this.settingTime = parcel.readLong();
        this.content = parcel.readString();
        long j2 = parcel.readLong();
        this.created = j2 == -1 ? null : new Date(j2);
        this.updated = parcel.readLong();
        this.uploadFlag = parcel.readByte() != 0;
        this.deleted = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getContent() {
        return this.content;
    }

    public Date getCreated() {
        return this.created;
    }

    public boolean getDeleted() {
        return this.deleted;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getId() {
        return this.id;
    }

    public String getSettingClass() {
        return this.settingClass;
    }

    public long getSettingTime() {
        return this.settingTime;
    }

    public long getUpdated() {
        return this.updated;
    }

    public boolean getUploadFlag() {
        return this.uploadFlag;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setCreated(Date date) {
        this.created = date;
    }

    public void setDeleted(boolean z) {
        this.deleted = z;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setSettingClass(String str) {
        this.settingClass = str;
    }

    public void setSettingTime(long j2) {
        this.settingTime = j2;
    }

    public void setUpdated(long j2) {
        this.updated = j2;
    }

    public void setUploadFlag(boolean z) {
        this.uploadFlag = z;
    }

    public String toString() {
        return "DeviceSetting{id='" + this.id + "', deviceId='" + this.deviceId + "', settingClass='" + this.settingClass + "', settingTime=" + this.settingTime + ", content='" + this.content + "', created=" + this.created + ", updated=" + this.updated + ", uploadFlag=" + this.uploadFlag + ", deleted=" + this.deleted + '}';
    }

    public void update(String str) {
        this.content = str;
        this.deleted = false;
        this.uploadFlag = false;
        this.settingTime = System.currentTimeMillis();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.deviceId);
        parcel.writeString(this.settingClass);
        parcel.writeLong(this.settingTime);
        parcel.writeString(this.content);
        Date date = this.created;
        parcel.writeLong(date != null ? date.getTime() : -1L);
        parcel.writeLong(this.updated);
        parcel.writeByte(this.uploadFlag ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.deleted ? (byte) 1 : (byte) 0);
    }

    public DeviceSetting(String str, String str2, String str3) {
        this.id = l.a();
        this.deviceId = str;
        this.settingClass = str2;
        this.settingTime = System.currentTimeMillis();
        this.content = str3;
        this.deleted = false;
        this.uploadFlag = false;
        this.created = new Date(System.currentTimeMillis());
    }

    public DeviceSetting(String str, String str2, String str3, long j2, String str4, Date date, long j3, boolean z, boolean z2) {
        this.id = str;
        this.deviceId = str2;
        this.settingClass = str3;
        this.settingTime = j2;
        this.content = str4;
        this.created = date;
        this.updated = j3;
        this.uploadFlag = z;
        this.deleted = z2;
    }
}
