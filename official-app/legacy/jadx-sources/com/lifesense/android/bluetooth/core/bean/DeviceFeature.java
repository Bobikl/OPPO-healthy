package com.lifesense.android.bluetooth.core.bean;

/* JADX INFO: loaded from: classes4.dex */
public class DeviceFeature {
    public boolean basalMetabolism;
    public boolean bind;
    public boolean bodyFatPercentage;
    public boolean bodyWaterMass;
    public boolean fatFreeMass;
    public boolean impedance;
    public boolean multiUser;
    public boolean muscleMass;
    public boolean musclePercentage;
    public boolean softLeanMass;
    public boolean timeStamp;
    public boolean timeZone;
    public boolean unbind;
    public boolean utc;

    public boolean canEqual(Object obj) {
        return obj instanceof DeviceFeature;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeviceFeature)) {
            return false;
        }
        DeviceFeature deviceFeature = (DeviceFeature) obj;
        return deviceFeature.canEqual(this) && isBind() == deviceFeature.isBind() && isUnbind() == deviceFeature.isUnbind() && isUtc() == deviceFeature.isUtc() && isTimeZone() == deviceFeature.isTimeZone() && isTimeStamp() == deviceFeature.isTimeStamp() && isMultiUser() == deviceFeature.isMultiUser() && isBodyFatPercentage() == deviceFeature.isBodyFatPercentage() && isBasalMetabolism() == deviceFeature.isBasalMetabolism() && isMusclePercentage() == deviceFeature.isMusclePercentage() && isMuscleMass() == deviceFeature.isMuscleMass() && isFatFreeMass() == deviceFeature.isFatFreeMass() && isSoftLeanMass() == deviceFeature.isSoftLeanMass() && isBodyWaterMass() == deviceFeature.isBodyWaterMass() && isImpedance() == deviceFeature.isImpedance();
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((isBind() ? 79 : 97) + 59) * 59) + (isUnbind() ? 79 : 97)) * 59) + (isUtc() ? 79 : 97)) * 59) + (isTimeZone() ? 79 : 97)) * 59) + (isTimeStamp() ? 79 : 97)) * 59) + (isMultiUser() ? 79 : 97)) * 59) + (isBodyFatPercentage() ? 79 : 97)) * 59) + (isBasalMetabolism() ? 79 : 97)) * 59) + (isMusclePercentage() ? 79 : 97)) * 59) + (isMuscleMass() ? 79 : 97)) * 59) + (isFatFreeMass() ? 79 : 97)) * 59) + (isSoftLeanMass() ? 79 : 97)) * 59) + (isBodyWaterMass() ? 79 : 97)) * 59) + (isImpedance() ? 79 : 97);
    }

    public boolean isBasalMetabolism() {
        return this.basalMetabolism;
    }

    public boolean isBind() {
        return this.bind;
    }

    public boolean isBodyFatPercentage() {
        return this.bodyFatPercentage;
    }

    public boolean isBodyWaterMass() {
        return this.bodyWaterMass;
    }

    public boolean isFatFreeMass() {
        return this.fatFreeMass;
    }

    public boolean isImpedance() {
        return this.impedance;
    }

    public boolean isMultiUser() {
        return this.multiUser;
    }

    public boolean isMuscleMass() {
        return this.muscleMass;
    }

    public boolean isMusclePercentage() {
        return this.musclePercentage;
    }

    public boolean isSoftLeanMass() {
        return this.softLeanMass;
    }

    public boolean isTimeStamp() {
        return this.timeStamp;
    }

    public boolean isTimeZone() {
        return this.timeZone;
    }

    public boolean isUnbind() {
        return this.unbind;
    }

    public boolean isUtc() {
        return this.utc;
    }

    public void setBasalMetabolism(boolean z) {
        this.basalMetabolism = z;
    }

    public void setBind(boolean z) {
        this.bind = z;
    }

    public void setBodyFatPercentage(boolean z) {
        this.bodyFatPercentage = z;
    }

    public void setBodyWaterMass(boolean z) {
        this.bodyWaterMass = z;
    }

    public void setFatFreeMass(boolean z) {
        this.fatFreeMass = z;
    }

    public void setImpedance(boolean z) {
        this.impedance = z;
    }

    public void setMultiUser(boolean z) {
        this.multiUser = z;
    }

    public void setMuscleMass(boolean z) {
        this.muscleMass = z;
    }

    public void setMusclePercentage(boolean z) {
        this.musclePercentage = z;
    }

    public void setSoftLeanMass(boolean z) {
        this.softLeanMass = z;
    }

    public void setTimeStamp(boolean z) {
        this.timeStamp = z;
    }

    public void setTimeZone(boolean z) {
        this.timeZone = z;
    }

    public void setUnbind(boolean z) {
        this.unbind = z;
    }

    public void setUtc(boolean z) {
        this.utc = z;
    }

    public String toString() {
        return "DeviceFeature(bind=" + isBind() + ", unbind=" + isUnbind() + ", utc=" + isUtc() + ", timeZone=" + isTimeZone() + ", timeStamp=" + isTimeStamp() + ", multiUser=" + isMultiUser() + ", bodyFatPercentage=" + isBodyFatPercentage() + ", basalMetabolism=" + isBasalMetabolism() + ", musclePercentage=" + isMusclePercentage() + ", muscleMass=" + isMuscleMass() + ", fatFreeMass=" + isFatFreeMass() + ", softLeanMass=" + isSoftLeanMass() + ", bodyWaterMass=" + isBodyWaterMass() + ", impedance=" + isImpedance() + ")";
    }
}
