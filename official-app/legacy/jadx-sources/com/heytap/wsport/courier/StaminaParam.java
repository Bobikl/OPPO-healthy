package com.heytap.wsport.courier;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class StaminaParam implements Parcelable {
    public static final Parcelable.Creator<StaminaParam> CREATOR = new a();
    public float aerobicPtc;
    public float anaerobicPtc;
    public String checkSum;
    public int lastWorkoutTime;
    public float maxHeartRate;
    public int restHr;
    public float staminaLevel;
    public List<TrainingDetail> trainingDetailList;
    public float vo2Max;

    public class a implements Parcelable.Creator<StaminaParam> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StaminaParam createFromParcel(Parcel parcel) {
            return new StaminaParam(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StaminaParam[] newArray(int i) {
            return new StaminaParam[i];
        }
    }

    public StaminaParam() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getAerobicPtc() {
        return this.aerobicPtc;
    }

    public float getAnaerobicPtc() {
        return this.anaerobicPtc;
    }

    public String getCheckSum() {
        return this.checkSum;
    }

    public int getLastWorkoutTime() {
        return this.lastWorkoutTime;
    }

    public float getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public int getRestHr() {
        return this.restHr;
    }

    public float getStaminaLevel() {
        return this.staminaLevel;
    }

    public List<TrainingDetail> getTrainingDetailList() {
        return this.trainingDetailList;
    }

    public float getVo2Max() {
        return this.vo2Max;
    }

    public String toString() {
        return "StaminaParam{staminaLevel=" + this.staminaLevel + ", aerobicPtc=" + this.aerobicPtc + ", anaerobicPtc=" + this.anaerobicPtc + ", checkSum='" + this.checkSum + "', maxHeartRate=" + this.maxHeartRate + ", lastWorkoutTime=" + this.lastWorkoutTime + ", restHr=" + this.restHr + ", vo2Max=" + this.vo2Max + ", trainingDetailList=" + this.trainingDetailList + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.staminaLevel);
        parcel.writeFloat(this.aerobicPtc);
        parcel.writeFloat(this.anaerobicPtc);
        parcel.writeString(this.checkSum);
        parcel.writeFloat(this.maxHeartRate);
        parcel.writeInt(this.lastWorkoutTime);
        parcel.writeInt(this.restHr);
        parcel.writeFloat(this.vo2Max);
        parcel.writeTypedList(this.trainingDetailList);
    }

    public StaminaParam(Parcel parcel) {
        this.staminaLevel = parcel.readFloat();
        this.aerobicPtc = parcel.readFloat();
        this.anaerobicPtc = parcel.readFloat();
        this.checkSum = parcel.readString();
        this.maxHeartRate = parcel.readFloat();
        this.lastWorkoutTime = parcel.readInt();
        this.restHr = parcel.readInt();
        this.vo2Max = parcel.readFloat();
        this.trainingDetailList = parcel.createTypedArrayList(TrainingDetail.CREATOR);
    }
}
