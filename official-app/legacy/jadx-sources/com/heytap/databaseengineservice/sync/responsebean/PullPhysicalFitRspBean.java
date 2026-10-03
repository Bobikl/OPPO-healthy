package com.heytap.databaseengineservice.sync.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class PullPhysicalFitRspBean implements Parcelable {
    public static final Parcelable.Creator<PullPhysicalFitRspBean> CREATOR = new a();
    private String aerobicLevel;
    private String anaerobicLevel;
    private String clientDataId;
    private float distanceKmMax;
    private int heartRateAvg;
    private int heartRateMax;
    private int heartRateMin;
    private long modifiedTimestamp;
    private String ssoid;
    private String staminaAerobicEnd;
    private String staminaAerobicMaxUse;
    private String staminaEnd;
    private String staminaLevel;
    private String trainingEffectAerobic;
    private String typeId;
    private String userWorkoutId;
    private String vo2Max;

    public class a implements Parcelable.Creator<PullPhysicalFitRspBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PullPhysicalFitRspBean createFromParcel(Parcel parcel) {
            return new PullPhysicalFitRspBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PullPhysicalFitRspBean[] newArray(int i) {
            return new PullPhysicalFitRspBean[i];
        }
    }

    public PullPhysicalFitRspBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAerobicLevel() {
        return this.aerobicLevel;
    }

    public String getAnaerobicLevel() {
        return this.anaerobicLevel;
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

    public long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public String getSsoid() {
        return this.ssoid;
    }

    public String getStaminaAerobicEnd() {
        return this.staminaAerobicEnd;
    }

    public String getStaminaAerobicMaxUse() {
        return this.staminaAerobicMaxUse;
    }

    public String getStaminaEnd() {
        return this.staminaEnd;
    }

    public String getStaminaLevel() {
        return this.staminaLevel;
    }

    public String getTrainingEffectAerobic() {
        return this.trainingEffectAerobic;
    }

    public String getTypeId() {
        return this.typeId;
    }

    public String getUserWorkoutId() {
        return this.userWorkoutId;
    }

    public String getVo2Max() {
        return this.vo2Max;
    }

    public void setAerobicLevel(String str) {
        this.aerobicLevel = str;
    }

    public void setAnaerobicLevel(String str) {
        this.anaerobicLevel = str;
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

    public void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setStaminaAerobicEnd(String str) {
        this.staminaAerobicEnd = str;
    }

    public void setStaminaAerobicMaxUse(String str) {
        this.staminaAerobicMaxUse = str;
    }

    public void setStaminaEnd(String str) {
        this.staminaEnd = str;
    }

    public void setStaminaLevel(String str) {
        this.staminaLevel = str;
    }

    public void setTrainingEffectAerobic(String str) {
        this.trainingEffectAerobic = str;
    }

    public void setTypeId(String str) {
        this.typeId = str;
    }

    public void setUserWorkoutId(String str) {
        this.userWorkoutId = str;
    }

    public void setVo2Max(String str) {
        this.vo2Max = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.clientDataId);
        parcel.writeString(this.userWorkoutId);
        parcel.writeString(this.typeId);
        parcel.writeString(this.staminaLevel);
        parcel.writeString(this.aerobicLevel);
        parcel.writeString(this.anaerobicLevel);
        parcel.writeInt(this.heartRateMax);
        parcel.writeInt(this.heartRateMin);
        parcel.writeInt(this.heartRateAvg);
        parcel.writeString(this.staminaAerobicMaxUse);
        parcel.writeString(this.staminaEnd);
        parcel.writeString(this.staminaAerobicEnd);
        parcel.writeString(this.vo2Max);
        parcel.writeString(this.trainingEffectAerobic);
        parcel.writeFloat(this.distanceKmMax);
        parcel.writeLong(this.modifiedTimestamp);
    }

    public PullPhysicalFitRspBean(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.clientDataId = parcel.readString();
        this.userWorkoutId = parcel.readString();
        this.typeId = parcel.readString();
        this.staminaLevel = parcel.readString();
        this.aerobicLevel = parcel.readString();
        this.anaerobicLevel = parcel.readString();
        this.heartRateMax = parcel.readInt();
        this.heartRateMin = parcel.readInt();
        this.heartRateAvg = parcel.readInt();
        this.staminaAerobicMaxUse = parcel.readString();
        this.staminaEnd = parcel.readString();
        this.staminaAerobicEnd = parcel.readString();
        this.vo2Max = parcel.readString();
        this.trainingEffectAerobic = parcel.readString();
        this.distanceKmMax = parcel.readFloat();
        this.modifiedTimestamp = parcel.readLong();
    }
}
