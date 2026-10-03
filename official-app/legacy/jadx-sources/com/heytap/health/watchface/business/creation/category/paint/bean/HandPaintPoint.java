package com.heytap.health.watchface.business.creation.category.paint.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes19.dex */
class HandPaintPoint implements Parcelable {
    public static final Parcelable.Creator<HandPaintPoint> CREATOR = new a();
    public double X;
    public double Y;

    public class a implements Parcelable.Creator<HandPaintPoint> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HandPaintPoint createFromParcel(Parcel parcel) {
            return new HandPaintPoint(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HandPaintPoint[] newArray(int i) {
            return new HandPaintPoint[i];
        }
    }

    public HandPaintPoint(Parcel parcel) {
        this.X = parcel.readDouble();
        this.Y = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.X);
        parcel.writeDouble(this.Y);
    }
}
