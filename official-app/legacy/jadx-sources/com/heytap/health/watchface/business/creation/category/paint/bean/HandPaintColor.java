package com.heytap.health.watchface.business.creation.category.paint.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes19.dex */
class HandPaintColor implements Parcelable {
    public static final Parcelable.Creator<HandPaintColor> CREATOR = new a();
    public double A;
    public double B;
    public double G;
    public double R;

    public class a implements Parcelable.Creator<HandPaintColor> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HandPaintColor createFromParcel(Parcel parcel) {
            return new HandPaintColor(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HandPaintColor[] newArray(int i) {
            return new HandPaintColor[i];
        }
    }

    public HandPaintColor(Parcel parcel) {
        this.R = parcel.readDouble();
        this.G = parcel.readDouble();
        this.B = parcel.readDouble();
        this.A = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.R);
        parcel.writeDouble(this.G);
        parcel.writeDouble(this.B);
        parcel.writeDouble(this.A);
    }
}
