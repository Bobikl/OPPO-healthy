package com.heytap.health.watchface.business.creation.category.paint.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
class HandPaintStep implements Parcelable {
    public static final Parcelable.Creator<HandPaintStep> CREATOR = new a();
    public List<HandPaintPoint> Points;

    public class a implements Parcelable.Creator<HandPaintStep> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HandPaintStep createFromParcel(Parcel parcel) {
            return new HandPaintStep(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HandPaintStep[] newArray(int i) {
            return new HandPaintStep[i];
        }
    }

    public HandPaintStep(Parcel parcel) {
        this.Points = parcel.createTypedArrayList(HandPaintPoint.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.Points);
    }
}
