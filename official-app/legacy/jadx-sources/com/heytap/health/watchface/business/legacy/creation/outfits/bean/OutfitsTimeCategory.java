package com.heytap.health.watchface.business.legacy.creation.outfits.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class OutfitsTimeCategory implements Parcelable {
    public static final Parcelable.Creator<OutfitsTimeCategory> CREATOR = new a();
    private String mDetailConfig;
    private String mPackageName;
    private String mResourcesPath;
    private String mServiceName;
    private String mTimeCategory;
    private int mTimePreViewId;
    private String mTimePreViewResName;

    public class a implements Parcelable.Creator<OutfitsTimeCategory> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OutfitsTimeCategory createFromParcel(Parcel parcel) {
            return new OutfitsTimeCategory(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public OutfitsTimeCategory[] newArray(int i) {
            return new OutfitsTimeCategory[i];
        }
    }

    public OutfitsTimeCategory() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDetailConfig() {
        return this.mDetailConfig;
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    public String getResourcesPath() {
        return this.mResourcesPath;
    }

    public String getServiceName() {
        return this.mServiceName;
    }

    public String getTimeCategory() {
        return this.mTimeCategory;
    }

    public int getTimePreViewId() {
        return this.mTimePreViewId;
    }

    public String getTimePreViewResName() {
        return this.mTimePreViewResName;
    }

    public void setDetailConfig(String str) {
        this.mDetailConfig = str;
    }

    public void setPackageName(String str) {
        this.mPackageName = str;
    }

    public void setResourcesPath(String str) {
        this.mResourcesPath = str;
    }

    public void setServiceName(String str) {
        this.mServiceName = str;
    }

    public void setTimeCategory(String str) {
        this.mTimeCategory = str;
    }

    public void setTimePreViewId(int i) {
        this.mTimePreViewId = i;
    }

    public void setTimePreViewResName(String str) {
        this.mTimePreViewResName = str;
    }

    public String toString() {
        return "OutfitsTimeCategory{mResourcesPath='" + this.mResourcesPath + "', mPackageName='" + this.mPackageName + "', mServiceName='" + this.mServiceName + "', mTimeCategory='" + this.mTimeCategory + "', mTimePreViewId=" + this.mTimePreViewId + ", mTimePreViewResName='" + this.mTimePreViewResName + "', mDetailConfig='" + this.mDetailConfig + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mResourcesPath);
        parcel.writeString(this.mPackageName);
        parcel.writeString(this.mServiceName);
        parcel.writeString(this.mTimeCategory);
        parcel.writeInt(this.mTimePreViewId);
        parcel.writeString(this.mTimePreViewResName);
        parcel.writeString(this.mDetailConfig);
    }

    public OutfitsTimeCategory(Parcel parcel) {
        this.mResourcesPath = parcel.readString();
        this.mPackageName = parcel.readString();
        this.mServiceName = parcel.readString();
        this.mTimeCategory = parcel.readString();
        this.mTimePreViewId = parcel.readInt();
        this.mTimePreViewResName = parcel.readString();
        this.mDetailConfig = parcel.readString();
    }
}
