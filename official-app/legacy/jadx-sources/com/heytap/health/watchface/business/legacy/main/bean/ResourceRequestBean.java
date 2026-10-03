package com.heytap.health.watchface.business.legacy.main.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class ResourceRequestBean implements Parcelable {
    public static final Parcelable.Creator<ResourceRequestBean> CREATOR = new a();

    @SerializedName("packageName")
    private String mPackageName;

    @SerializedName("version")
    private int mVersion;

    @SerializedName("versionTime")
    private long mVersionTime;

    public class a implements Parcelable.Creator<ResourceRequestBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ResourceRequestBean createFromParcel(Parcel parcel) {
            return new ResourceRequestBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ResourceRequestBean[] newArray(int i) {
            return new ResourceRequestBean[i];
        }
    }

    public ResourceRequestBean(String str, int i, long j2) {
        this.mPackageName = str;
        this.mVersion = i;
        this.mVersionTime = j2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public long getVersionTime() {
        return this.mVersionTime;
    }

    public void setPackageName(String str) {
        this.mPackageName = str;
    }

    public void setVersion(int i) {
        this.mVersion = i;
    }

    public void setVersionTime(long j2) {
        this.mVersionTime = j2;
    }

    public String toString() {
        return "ResourceRequestBean{mPackageName='" + this.mPackageName + "', mVersion=" + this.mVersion + ", mVersionTime=" + this.mVersionTime + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mPackageName);
        parcel.writeInt(this.mVersion);
        parcel.writeLong(this.mVersionTime);
    }

    public ResourceRequestBean(Parcel parcel) {
        this.mPackageName = parcel.readString();
        this.mVersion = parcel.readInt();
        this.mVersionTime = parcel.readLong();
    }
}
