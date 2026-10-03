package com.heytap.sports.move.treadmill.manager;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class RunData implements Parcelable {
    public static final Parcelable.Creator<RunData> CREATOR = new a();
    public final long createTime;
    public final int elapsedTime;
    public final int heartRate;
    public final boolean isPaused;
    public final int speed;
    public final int step;
    public final int totalDistance;
    public final int totalEnergy;

    public class a implements Parcelable.Creator<RunData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RunData createFromParcel(Parcel parcel) {
            return new RunData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RunData[] newArray(int i) {
            return new RunData[i];
        }
    }

    public RunData(int i, int i2, int i3, int i4, int i5, int i6, boolean z, long j2) {
        this.totalDistance = i;
        this.speed = i2;
        this.step = i3;
        this.elapsedTime = i6;
        this.isPaused = z;
        this.totalEnergy = i4;
        this.heartRate = i5;
        this.createTime = j2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "RunData{isPaused=" + this.isPaused + ", speed=" + this.speed + ", step=" + this.step + ", totalDistance=" + this.totalDistance + ", elapsedTime=" + this.elapsedTime + ", totalEnergy=" + this.totalEnergy + ", heartRate=" + this.heartRate + ", createTime=" + this.createTime + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.isPaused ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.speed);
        parcel.writeInt(this.step);
        parcel.writeInt(this.totalDistance);
        parcel.writeInt(this.elapsedTime);
        parcel.writeInt(this.totalEnergy);
        parcel.writeInt(this.heartRate);
        parcel.writeLong(this.createTime);
    }

    public RunData(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.totalDistance = i;
        this.speed = i2;
        this.step = i3;
        this.elapsedTime = i6;
        this.isPaused = z;
        this.totalEnergy = i4;
        this.heartRate = i5;
        this.createTime = System.currentTimeMillis();
    }

    public RunData(Parcel parcel) {
        this.isPaused = parcel.readByte() != 0;
        this.speed = parcel.readInt();
        this.step = parcel.readInt();
        this.totalDistance = parcel.readInt();
        this.elapsedTime = parcel.readInt();
        this.totalEnergy = parcel.readInt();
        this.heartRate = parcel.readInt();
        this.createTime = parcel.readLong();
    }
}
