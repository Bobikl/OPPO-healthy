package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class PhysicalFitness extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<PhysicalFitness> CREATOR = new a();
    private float aerobicLevel;
    private float anaerobicLevel;
    private String checksum;
    private String checksum_01;
    private String clientDataId;
    private float distanceKmMax;
    private int heartRateAvg;
    private int heartRateMax;
    private int heartRateMin;
    private float heytapLevel;
    private float prevAerobicPtc;
    private float prevAnaerobicPtc;
    private String ssoid;
    private int staminaAerobicEnd;
    private int staminaAerobicMaxUse;
    private float staminaChange;
    private int staminaEnd;
    private float staminaLevel;
    private float trainingEffectAerobic;
    private String typeId;
    private int userWorkoutId;
    private float vo2Max;
    private int workoutStatus;

    public class a implements Parcelable.Creator<PhysicalFitness> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PhysicalFitness createFromParcel(Parcel parcel) {
            return new PhysicalFitness(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PhysicalFitness[] newArray(int i) {
            return new PhysicalFitness[i];
        }
    }

    public PhysicalFitness() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getAerobicLevel() {
        return this.aerobicLevel;
    }

    public float getAnaerobicLevel() {
        return this.anaerobicLevel;
    }

    public String getChecksum() {
        return this.checksum;
    }

    public String getChecksum_01() {
        return this.checksum_01;
    }

    public String getClientDataId() {
        return this.clientDataId;
    }

    public float getDistanceKmMax() {
        return this.distanceKmMax;
    }

    public int getHeartRateAvg() {
        return this.heartRateAvg;
    }

    public int getHeartRateMax() {
        return this.heartRateMax;
    }

    public int getHeartRateMin() {
        return this.heartRateMin;
    }

    public float getHeytapLevel() {
        return this.heytapLevel;
    }

    public float getPrevAerobicPtc() {
        return this.prevAerobicPtc;
    }

    public float getPrevAnaerobicPtc() {
        return this.prevAnaerobicPtc;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    public int getStaminaAerobicEnd() {
        return this.staminaAerobicEnd;
    }

    public int getStaminaAerobicMaxUse() {
        return this.staminaAerobicMaxUse;
    }

    public float getStaminaChange() {
        return this.staminaChange;
    }

    public int getStaminaEnd() {
        return this.staminaEnd;
    }

    public float getStaminaLevel() {
        return this.staminaLevel;
    }

    public float getTrainingEffectAerobic() {
        return this.trainingEffectAerobic;
    }

    public String getTypeId() {
        return this.typeId;
    }

    public int getUserWorkoutId() {
        return this.userWorkoutId;
    }

    public float getVo2Max() {
        return this.vo2Max;
    }

    public int getWorkoutStatus() {
        return this.workoutStatus;
    }

    public void setAerobicLevel(float f) {
        this.aerobicLevel = f;
    }

    public void setAnaerobicLevel(float f) {
        this.anaerobicLevel = f;
    }

    public void setChecksum(String str) {
        this.checksum = str;
    }

    public void setChecksum_01(String str) {
        this.checksum_01 = str;
    }

    public void setClientDataId(String str) {
        this.clientDataId = str;
    }

    public void setDistanceKmMax(float f) {
        this.distanceKmMax = f;
    }

    public void setHeartRateAvg(int i) {
        this.heartRateAvg = i;
    }

    public void setHeartRateMax(int i) {
        this.heartRateMax = i;
    }

    public void setHeartRateMin(int i) {
        this.heartRateMin = i;
    }

    public void setHeytapLevel(float f) {
        this.heytapLevel = f;
    }

    public void setPrevAerobicPtc(float f) {
        this.prevAerobicPtc = f;
    }

    public void setPrevAnaerobicPtc(float f) {
        this.prevAnaerobicPtc = f;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setStaminaAerobicEnd(int i) {
        this.staminaAerobicEnd = i;
    }

    public void setStaminaAerobicMaxUse(int i) {
        this.staminaAerobicMaxUse = i;
    }

    public void setStaminaChange(float f) {
        this.staminaChange = f;
    }

    public void setStaminaEnd(int i) {
        this.staminaEnd = i;
    }

    public void setStaminaLevel(float f) {
        this.staminaLevel = f;
    }

    public void setTrainingEffectAerobic(float f) {
        this.trainingEffectAerobic = f;
    }

    public void setTypeId(String str) {
        this.typeId = str;
    }

    public void setUserWorkoutId(int i) {
        this.userWorkoutId = i;
    }

    public void setVo2Max(float f) {
        this.vo2Max = f;
    }

    public void setWorkoutStatus(int i) {
        this.workoutStatus = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "PhysicalFitness{clientDataId='" + this.clientDataId + "', userWorkoutId=" + this.userWorkoutId + ", ssoid='" + this.ssoid + "', typeId=" + this.typeId + ", staminaLevel=" + this.staminaLevel + ", heytapLevel=" + this.heytapLevel + ", staminaChange=" + this.staminaChange + ", aerobicLevel=" + this.aerobicLevel + ", anaerobicLevel=" + this.anaerobicLevel + ", heartRateMax=" + this.heartRateMax + ", heartRateAvg=" + this.heartRateAvg + ", heartRateMin=" + this.heartRateMin + ", staminaAerobicMaxUse=" + this.staminaAerobicMaxUse + ", staminaEnd=" + this.staminaEnd + ", staminaAerobicEnd=" + this.staminaAerobicEnd + ", vo2Max=" + this.vo2Max + ", trainingEffectAerobic=" + this.trainingEffectAerobic + ", distanceKmMax=" + this.distanceKmMax + ", prevAerobicPtc=" + this.prevAerobicPtc + ", prevAnaerobicPtc=" + this.prevAnaerobicPtc + ", checksum=" + this.checksum + ", checksum_01=" + this.checksum_01 + ", workoutStatus=" + this.workoutStatus + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.clientDataId);
        parcel.writeInt(this.userWorkoutId);
        parcel.writeString(this.ssoid);
        parcel.writeString(this.typeId);
        parcel.writeFloat(this.staminaLevel);
        parcel.writeFloat(this.heytapLevel);
        parcel.writeFloat(this.staminaChange);
        parcel.writeFloat(this.aerobicLevel);
        parcel.writeFloat(this.anaerobicLevel);
        parcel.writeInt(this.heartRateMax);
        parcel.writeInt(this.heartRateAvg);
        parcel.writeInt(this.heartRateMin);
        parcel.writeInt(this.staminaAerobicMaxUse);
        parcel.writeInt(this.staminaEnd);
        parcel.writeInt(this.staminaAerobicEnd);
        parcel.writeFloat(this.vo2Max);
        parcel.writeFloat(this.trainingEffectAerobic);
        parcel.writeFloat(this.distanceKmMax);
        parcel.writeFloat(this.prevAerobicPtc);
        parcel.writeFloat(this.prevAnaerobicPtc);
        parcel.writeString(this.checksum);
        parcel.writeString(this.checksum_01);
        parcel.writeInt(this.workoutStatus);
    }

    public PhysicalFitness(Parcel parcel) {
        this.clientDataId = parcel.readString();
        this.userWorkoutId = parcel.readInt();
        this.ssoid = parcel.readString();
        this.typeId = parcel.readString();
        this.staminaLevel = parcel.readFloat();
        this.heytapLevel = parcel.readFloat();
        this.staminaChange = parcel.readFloat();
        this.aerobicLevel = parcel.readFloat();
        this.anaerobicLevel = parcel.readFloat();
        this.heartRateMax = parcel.readInt();
        this.heartRateAvg = parcel.readInt();
        this.heartRateMin = parcel.readInt();
        this.staminaAerobicMaxUse = parcel.readInt();
        this.staminaEnd = parcel.readInt();
        this.staminaAerobicEnd = parcel.readInt();
        this.vo2Max = parcel.readFloat();
        this.trainingEffectAerobic = parcel.readFloat();
        this.distanceKmMax = parcel.readFloat();
        this.prevAerobicPtc = parcel.readFloat();
        this.prevAnaerobicPtc = parcel.readFloat();
        this.checksum = parcel.readString();
        this.checksum_01 = parcel.readString();
        this.workoutStatus = parcel.readInt();
    }
}
