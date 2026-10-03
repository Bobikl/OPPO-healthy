package com.heytap.health.hearing.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class Volume implements Parcelable {
    public static final Parcelable.Creator<Volume> CREATOR = new a();
    private long duration;
    private long timestamp;
    private double volume;

    public class a implements Parcelable.Creator<Volume> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Volume createFromParcel(Parcel parcel) {
            return new Volume(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Volume[] newArray(int i) {
            return new Volume[i];
        }
    }

    public Volume() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getDuration() {
        return this.duration;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public double getVolume() {
        return this.volume;
    }

    public void setDuration(long j2) {
        this.duration = j2;
    }

    public void setTimestamp(long j2) {
        this.timestamp = j2;
    }

    public void setVolume(double d) {
        this.volume = d;
    }

    public String toString() {
        return "Volume{value=" + this.volume + ", duration=" + this.duration + ", timestamp=" + this.timestamp + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.volume);
        parcel.writeLong(this.duration);
        parcel.writeLong(this.timestamp);
    }

    public Volume(Parcel parcel) {
        this.volume = parcel.readDouble();
        this.duration = parcel.readLong();
        this.timestamp = parcel.readLong();
    }
}
