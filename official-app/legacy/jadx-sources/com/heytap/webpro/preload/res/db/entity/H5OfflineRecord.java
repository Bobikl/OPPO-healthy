package com.heytap.webpro.preload.res.db.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: classes3.dex */
@Entity(tableName = "h5_offline_record")
@Keep
public class H5OfflineRecord implements Parcelable {
    public static final Parcelable.Creator<H5OfflineRecord> CREATOR = new a();
    private double appId;
    private String groupVersion;
    private String headers;
    private long id;
    private String md5;
    private String name;
    private String productCode;
    private String type;

    @NonNull
    @PrimaryKey
    private String url;

    public class a implements Parcelable.Creator<H5OfflineRecord> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public H5OfflineRecord createFromParcel(Parcel parcel) {
            return new H5OfflineRecord(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public H5OfflineRecord[] newArray(int i) {
            return new H5OfflineRecord[i];
        }
    }

    public H5OfflineRecord() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double getAppId() {
        return this.appId;
    }

    public int getAppIdInt() {
        return (int) getAppId();
    }

    public String getGroupVersion() {
        return this.groupVersion;
    }

    public String getHeaders() {
        return this.headers;
    }

    public long getId() {
        return this.id;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getName() {
        return this.name;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public String getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public void readFromParcel(Parcel parcel) {
        this.productCode = parcel.readString();
        this.appId = parcel.readDouble();
        this.groupVersion = parcel.readString();
        this.md5 = parcel.readString();
        this.url = parcel.readString();
        this.name = parcel.readString();
        this.type = parcel.readString();
        this.headers = parcel.readString();
    }

    public void setAppId(double d) {
        this.appId = d;
    }

    public void setGroupVersion(String str) {
        this.groupVersion = str;
    }

    public void setHeaders(String str) {
        this.headers = str;
    }

    public void setId(long j2) {
        this.id = j2;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setProductCode(String str) {
        this.productCode = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        return "H5OfflineRecord{productCode='" + this.productCode + "', appId=" + this.appId + ", groupVersion='" + this.groupVersion + "', md5='" + this.md5 + "', url='" + this.url + "', name='" + this.name + "', type='" + this.type + "', headers='" + this.headers + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.productCode);
        parcel.writeDouble(this.appId);
        parcel.writeString(this.groupVersion);
        parcel.writeString(this.md5);
        parcel.writeString(this.url);
        parcel.writeString(this.name);
        parcel.writeString(this.type);
        parcel.writeString(this.headers);
    }

    public H5OfflineRecord(Parcel parcel) {
        this.productCode = parcel.readString();
        this.appId = parcel.readDouble();
        this.groupVersion = parcel.readString();
        this.md5 = parcel.readString();
        this.url = parcel.readString();
        this.name = parcel.readString();
        this.type = parcel.readString();
        this.headers = parcel.readString();
    }
}
