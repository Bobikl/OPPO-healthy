package com.heytap.health.core.widget.charts.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.model.GradientColor;

/* JADX INFO: loaded from: classes16.dex */
public class HealthGradientColor extends GradientColor implements Parcelable {
    public static final Parcelable.Creator<HealthGradientColor> CREATOR = new a();

    public class a implements Parcelable.Creator<HealthGradientColor> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HealthGradientColor createFromParcel(Parcel parcel) {
            return new HealthGradientColor(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HealthGradientColor[] newArray(int i) {
            return new HealthGradientColor[i];
        }
    }

    public HealthGradientColor(int i, int i2) {
        super(i, i2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "HealthGradientColor{startColor: " + getStartColor() + ", endColor: " + getEndColor() + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(getStartColor());
        parcel.writeInt(getEndColor());
    }

    public HealthGradientColor(Parcel parcel) {
        super(parcel.readInt(), parcel.readInt());
    }
}
