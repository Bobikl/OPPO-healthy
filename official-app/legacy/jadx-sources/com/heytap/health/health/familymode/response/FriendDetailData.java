package com.heytap.health.health.familymode.response;

import androidx.annotation.Keep;
import com.heytap.health.health.familymode.request.AtrialFibrillation;
import com.heytap.health.health.familymode.request.FamilySportRecordObject;
import com.heytap.health.health.familymode.request.GlucoseObject;
import com.heytap.health.health.familymode.request.PhysicalMentalObject;
import com.heytap.health.health.familymode.request.WristTemperatureObject;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class FriendDetailData {
    private AtrialFibrillation atrialFibrillationObject;
    private String avatar;
    private DailyBaseData baseDataObject;
    private DailyBloodOxygenData bloodOxygenObject;
    private DailyECGData cardiogramObject;
    private int deviceType;
    private String friendNickname;
    private GlucoseObject glucoseObject;
    private DailyHeartRateData heartRateObject;
    private long modifiedTimestamp;
    private PhysicalMentalObject physicalMentalObject;
    private DailySleepData sleepObject;
    private FamilySportRecordObject sportRecordObject;
    private String ssoid;
    private DailyStressData stressObject;
    private WristTemperatureObject wristTemperatureObject;

    public AtrialFibrillation getAtrialFibrillationObject() {
        return this.atrialFibrillationObject;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public DailyBaseData getBaseDataObject() {
        return this.baseDataObject;
    }

    public DailyBloodOxygenData getBloodOxygenObject() {
        return this.bloodOxygenObject;
    }

    public DailyECGData getCardiogramObject() {
        return this.cardiogramObject;
    }

    public int getDeviceType() {
        return this.deviceType;
    }

    public String getFriendNickname() {
        return this.friendNickname;
    }

    public GlucoseObject getGlucoseObject() {
        return this.glucoseObject;
    }

    public DailyHeartRateData getHeartRateObject() {
        return this.heartRateObject;
    }

    public long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public PhysicalMentalObject getPhysicalMentalObject() {
        return this.physicalMentalObject;
    }

    public DailySleepData getSleepObject() {
        return this.sleepObject;
    }

    public FamilySportRecordObject getSportRecordObject() {
        return this.sportRecordObject;
    }

    public String getSsoid() {
        return this.ssoid;
    }

    public DailyStressData getStressObject() {
        return this.stressObject;
    }

    public WristTemperatureObject getWristTemperatureObject() {
        return this.wristTemperatureObject;
    }

    public String toString() {
        return "FriendDetailData{ssoid='" + this.ssoid + "', deviceType=" + this.deviceType + ", modifiedTimestamp=" + this.modifiedTimestamp + ", friendNickname='" + this.friendNickname + "', avatar='" + this.avatar + "', baseDataObject=" + this.baseDataObject + ", heartRateObject=" + this.heartRateObject + ", bloodOxygenObject=" + this.bloodOxygenObject + ", cardiogramObject=" + this.cardiogramObject + ", stressObject=" + this.stressObject + ", sleepObject=" + this.sleepObject + ", atrialFibrillationObject=" + this.atrialFibrillationObject + ", sportRecordObject=" + this.sportRecordObject + ", wristTemperatureObject=" + this.wristTemperatureObject + ", glucoseObject=" + this.glucoseObject + ", physicalMentalObject=" + this.physicalMentalObject + '}';
    }
}
