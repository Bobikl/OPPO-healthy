package com.heytap.health.watchface.business.creation.category.paint.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes19.dex */
class HandPaintPointsCount implements Parcelable {
    public static final Parcelable.Creator<HandPaintPointsCount> CREATOR = new a();
    public int PointsCount;

    public class a implements Parcelable.Creator<HandPaintPointsCount> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HandPaintPointsCount createFromParcel(Parcel parcel) {
            return new HandPaintPointsCount(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HandPaintPointsCount[] newArray(int i) {
            return new HandPaintPointsCount[i];
        }
    }

    public HandPaintPointsCount(Parcel parcel) {
        this.PointsCount = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.PointsCount);
    }
}
