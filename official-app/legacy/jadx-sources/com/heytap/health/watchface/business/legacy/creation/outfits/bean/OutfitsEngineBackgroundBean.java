package com.heytap.health.watchface.business.legacy.creation.outfits.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class OutfitsEngineBackgroundBean implements Parcelable {
    public static final Parcelable.Creator<OutfitsEngineBackgroundBean> CREATOR = new a();
    private int mBackgroundCategory;
    private int mEngineBackgroundId;
    private String mEngineBackgroundName;
    private String mSupportTimeCategory;

    public class a implements Parcelable.Creator<OutfitsEngineBackgroundBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OutfitsEngineBackgroundBean createFromParcel(Parcel parcel) {
            return new OutfitsEngineBackgroundBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public OutfitsEngineBackgroundBean[] newArray(int i) {
            return new OutfitsEngineBackgroundBean[i];
        }
    }

    public OutfitsEngineBackgroundBean(int i, String str, int i2, String str2) {
        this.mEngineBackgroundId = i;
        this.mEngineBackgroundName = str;
        this.mBackgroundCategory = i2;
        this.mSupportTimeCategory = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getBackgroundCategory() {
        return this.mBackgroundCategory;
    }

    public int getEngineBackgroundId() {
        return this.mEngineBackgroundId;
    }

    public String getEngineBackgroundName() {
        return this.mEngineBackgroundName;
    }

    public String getSupportTimeCategory() {
        return this.mSupportTimeCategory;
    }

    public void setBackgroundCategory(int i) {
        this.mBackgroundCategory = i;
    }

    public void setEngineBackgroundId(int i) {
        this.mEngineBackgroundId = i;
    }

    public void setEngineBackgroundName(String str) {
        this.mEngineBackgroundName = str;
    }

    public void setSupportTimeCategory(String str) {
        this.mSupportTimeCategory = str;
    }

    public String toString() {
        return "{mEngineBackgroundId=" + this.mEngineBackgroundId + ", mEngineBackgroundName='" + this.mEngineBackgroundName + "', mBackgroundCategory=" + this.mBackgroundCategory + ", mSupportTimeCategory='" + this.mSupportTimeCategory + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mEngineBackgroundId);
        parcel.writeString(this.mEngineBackgroundName);
        parcel.writeInt(this.mBackgroundCategory);
        parcel.writeString(this.mSupportTimeCategory);
    }

    public OutfitsEngineBackgroundBean(Parcel parcel) {
        this.mEngineBackgroundId = parcel.readInt();
        this.mEngineBackgroundName = parcel.readString();
        this.mBackgroundCategory = parcel.readInt();
        this.mSupportTimeCategory = parcel.readString();
    }
}
