package com.heytap.health.watchface.business.creation.category.paint.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class HandPaintFrame implements Parcelable {
    public static final Parcelable.Creator<HandPaintFrame> CREATOR = new a();
    public List<HandPaintColor> Colors;
    public List<HandPaintPointsCount> PointsCounts;
    public List<HandPaintStep> Steps;

    public class a implements Parcelable.Creator<HandPaintFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HandPaintFrame createFromParcel(Parcel parcel) {
            return new HandPaintFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HandPaintFrame[] newArray(int i) {
            return new HandPaintFrame[i];
        }
    }

    public HandPaintFrame(Parcel parcel) {
        this.Colors = parcel.createTypedArrayList(HandPaintColor.CREATOR);
        this.PointsCounts = parcel.createTypedArrayList(HandPaintPointsCount.CREATOR);
        this.Steps = parcel.createTypedArrayList(HandPaintStep.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.Colors);
        parcel.writeTypedList(this.PointsCounts);
        parcel.writeTypedList(this.Steps);
    }
}
