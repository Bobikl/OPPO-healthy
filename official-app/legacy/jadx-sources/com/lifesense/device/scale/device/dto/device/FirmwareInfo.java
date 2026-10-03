package com.lifesense.device.scale.device.dto.device;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class FirmwareInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<FirmwareInfo> CREATOR = new a();

    @JSONField(name = "describe")
    public String description;
    public String deviceName;

    @JSONField(name = "name")
    public String fileName;
    public String fileUrl;
    public boolean forced;
    public String id;
    public String md5;
    public String sha128;
    public String sha256;

    @JSONField(name = "softwareVersion")
    public String version;

    public static class a implements Parcelable.Creator<FirmwareInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FirmwareInfo createFromParcel(Parcel parcel) {
            return new FirmwareInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FirmwareInfo[] newArray(int i) {
            return new FirmwareInfo[i];
        }
    }

    public FirmwareInfo() {
    }

    public FirmwareInfo(Parcel parcel) {
        this.id = parcel.readString();
        this.deviceName = parcel.readString();
        this.version = parcel.readString();
        this.fileName = parcel.readString();
        this.fileUrl = parcel.readString();
        this.md5 = parcel.readString();
        this.sha256 = parcel.readString();
        this.sha128 = parcel.readString();
        this.description = parcel.readString();
        this.forced = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getFileUrl() {
        return this.fileUrl;
    }

    public String getId() {
        return this.id;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getSha128() {
        return this.sha128;
    }

    public String getSha256() {
        return this.sha256;
    }

    public String getVersion() {
        return this.version;
    }

    public boolean isForced() {
        return this.forced;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public void setFileName(String str) {
        this.fileName = str;
    }

    public void setFileUrl(String str) {
        this.fileUrl = str;
    }

    public void setForced(boolean z) {
        this.forced = z;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setSha128(String str) {
        this.sha128 = str;
    }

    public void setSha256(String str) {
        this.sha256 = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.deviceName);
        parcel.writeString(this.version);
        parcel.writeString(this.fileName);
        parcel.writeString(this.fileUrl);
        parcel.writeString(this.md5);
        parcel.writeString(this.sha256);
        parcel.writeString(this.sha128);
        parcel.writeString(this.description);
        parcel.writeByte(this.forced ? (byte) 1 : (byte) 0);
    }
}
