package com.heytap.health.hearing.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class Exposure implements Parcelable {
    public static final Parcelable.Creator<Exposure> CREATOR = new a();
    private long time;
    private double value;

    public class a implements Parcelable.Creator<Exposure> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Exposure createFromParcel(Parcel parcel) {
            return new Exposure(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Exposure[] newArray(int i) {
            return new Exposure[i];
        }
    }

    public Exposure() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getTime() {
        return this.time;
    }

    public double getValue() {
        return this.value;
    }

    public void setTime(long j2) {
        this.time = j2;
    }

    public void setValue(double d) {
        this.value = d;
    }

    public String toString() {
        return "Exposure{value=" + this.value + ", time=" + this.time + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.value);
        parcel.writeLong(this.time);
    }

    public Exposure(Parcel parcel) {
        this.value = parcel.readDouble();
        this.time = parcel.readLong();
    }
}
