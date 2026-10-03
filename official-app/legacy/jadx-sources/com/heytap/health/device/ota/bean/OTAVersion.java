package com.heytap.health.device.ota.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class OTAVersion implements Parcelable {
    public static final Parcelable.Creator<OTAVersion> CREATOR = new a();
    public String descriptionUrl;
    public transient List fileList;
    public String firmwareUrl;

    @Deprecated
    public boolean forceUpdate;
    public String hwID;
    public String md5;
    public String model;
    public String msg;
    public String otaVersion;
    public int resultCode;
    public String size;
    public String summary;
    public String versionName;

    public class a implements Parcelable.Creator<OTAVersion> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OTAVersion createFromParcel(Parcel parcel) {
            return new OTAVersion(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public OTAVersion[] newArray(int i) {
            return new OTAVersion[i];
        }
    }

    public OTAVersion() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "OTAVersion{model='" + this.model + "', hwID='" + this.hwID + "', versionName='" + this.versionName + "', otaVersion='" + this.otaVersion + "', descriptionUrl=" + this.descriptionUrl + ", summary='" + this.summary + "', firmwareUrl='" + this.firmwareUrl + "', size='" + this.size + "', forceUpdate='" + this.forceUpdate + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.resultCode);
        parcel.writeString(this.msg);
        parcel.writeString(this.model);
        parcel.writeString(this.hwID);
        parcel.writeString(this.versionName);
        parcel.writeString(this.otaVersion);
        parcel.writeString(this.summary);
        parcel.writeString(this.descriptionUrl);
        parcel.writeString(this.firmwareUrl);
        parcel.writeString(this.size);
        parcel.writeString(this.md5);
        parcel.writeByte(this.forceUpdate ? (byte) 1 : (byte) 0);
    }

    public OTAVersion(Parcel parcel) {
        this.resultCode = parcel.readInt();
        this.msg = parcel.readString();
        this.model = parcel.readString();
        this.hwID = parcel.readString();
        this.versionName = parcel.readString();
        this.otaVersion = parcel.readString();
        this.summary = parcel.readString();
        this.descriptionUrl = parcel.readString();
        this.firmwareUrl = parcel.readString();
        this.size = parcel.readString();
        this.md5 = parcel.readString();
        this.forceUpdate = parcel.readByte() != 0;
    }
}
