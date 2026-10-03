package com.heytap.health.watchface.business.legacy.creation.outfits.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class OutfitsWatchFaceBean implements Parcelable {
    public static final Parcelable.Creator<OutfitsWatchFaceBean> CREATOR = new a();
    private List<OutfitsEngineBackgroundBean> mBackgroundBeans;
    private List<OutfitsTimeCategory> mOutfitsTimeCategories;
    private String mPackageName;
    private String mResourcesPath;
    private String mServiceName;
    private int mStyleCount;

    public class a implements Parcelable.Creator<OutfitsWatchFaceBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OutfitsWatchFaceBean createFromParcel(Parcel parcel) {
            return new OutfitsWatchFaceBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public OutfitsWatchFaceBean[] newArray(int i) {
            return new OutfitsWatchFaceBean[i];
        }
    }

    public OutfitsWatchFaceBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<OutfitsEngineBackgroundBean> getBackgroundBeans() {
        return this.mBackgroundBeans;
    }

    public List<OutfitsTimeCategory> getOutfitsTimeCategories() {
        return this.mOutfitsTimeCategories;
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

    public int getStyleCount() {
        return this.mStyleCount;
    }

    public void setBackgroundBeans(List<OutfitsEngineBackgroundBean> list) {
        this.mBackgroundBeans = list;
    }

    public void setOutfitsTimeCategories(List<OutfitsTimeCategory> list) {
        this.mOutfitsTimeCategories = list;
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

    public void setStyleCount(int i) {
        this.mStyleCount = i;
    }

    public String toString() {
        return "OutfitsWatchFaceBean{mResourcesPath='" + this.mResourcesPath + "', mPackageName='" + this.mPackageName + "', mServiceName='" + this.mServiceName + "', mStyleCount=" + this.mStyleCount + ", mBackgroundBeans=" + this.mBackgroundBeans + ", mOutfitsTimeCategories=" + this.mOutfitsTimeCategories + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mResourcesPath);
        parcel.writeString(this.mPackageName);
        parcel.writeString(this.mServiceName);
        parcel.writeInt(this.mStyleCount);
        parcel.writeTypedList(this.mBackgroundBeans);
        parcel.writeTypedList(this.mOutfitsTimeCategories);
    }

    public OutfitsWatchFaceBean(Parcel parcel) {
        this.mResourcesPath = parcel.readString();
        this.mPackageName = parcel.readString();
        this.mServiceName = parcel.readString();
        this.mStyleCount = parcel.readInt();
        this.mBackgroundBeans = parcel.createTypedArrayList(OutfitsEngineBackgroundBean.CREATOR);
        this.mOutfitsTimeCategories = parcel.createTypedArrayList(OutfitsTimeCategory.CREATOR);
    }
}
