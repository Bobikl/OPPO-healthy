package com.heytap.health.heartrate.measure.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes16.dex */
public class HeartRateMeasureEntity implements Parcelable {
    public static final Parcelable.Creator<HeartRateMeasureEntity> CREATOR = new a();
    private int mHeartRate;
    private int mMotionStatus;
    private int mProgress;
    private int mRespRate;
    private int mWarnStatus;

    public class a implements Parcelable.Creator<HeartRateMeasureEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HeartRateMeasureEntity createFromParcel(Parcel parcel) {
            return new HeartRateMeasureEntity(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HeartRateMeasureEntity[] newArray(int i) {
            return new HeartRateMeasureEntity[i];
        }
    }

    public HeartRateMeasureEntity() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getHeartRate() {
        return this.mHeartRate;
    }

    public int getMotionStatus() {
        return this.mMotionStatus;
    }

    public int getProgress() {
        return this.mProgress;
    }

    public int getRespRate() {
        return this.mRespRate;
    }

    public int getWarnStatus() {
        return this.mWarnStatus;
    }

    public void readFromParcel(Parcel parcel) {
        this.mHeartRate = parcel.readInt();
        this.mRespRate = parcel.readInt();
        this.mWarnStatus = parcel.readInt();
        this.mProgress = parcel.readInt();
        this.mMotionStatus = parcel.readInt();
    }

    public void setHeartRate(int i) {
        this.mHeartRate = i;
    }

    public void setMotionStatus(int i) {
        this.mMotionStatus = i;
    }

    public void setProgress(int i) {
        this.mProgress = i;
    }

    public void setRespRate(int i) {
        this.mRespRate = i;
    }

    public void setWarnStatus(int i) {
        this.mWarnStatus = i;
    }

    @NonNull
    public String toString() {
        return "Heart rate is " + this.mHeartRate + " Resp rate is " + this.mRespRate + " Warn status is " + this.mWarnStatus + " Progress is " + this.mProgress + " Motion status is " + this.mMotionStatus;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mHeartRate);
        parcel.writeInt(this.mRespRate);
        parcel.writeInt(this.mWarnStatus);
        parcel.writeInt(this.mProgress);
        parcel.writeInt(this.mMotionStatus);
    }

    public HeartRateMeasureEntity(Parcel parcel) {
        setHeartRate(parcel.readInt());
        setRespRate(parcel.readInt());
        setWarnStatus(parcel.readInt());
        setProgress(parcel.readInt());
        setMotionStatus(parcel.readInt());
    }
}
