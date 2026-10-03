package com.lifesense.device.scale.device.dto.receive;

import android.os.Parcel;
import android.os.Parcelable;
import com.lifesense.android.bluetooth.scale.bean.WeightData_A3;
import com.lifesense.device.scale.utils.e;

/* JADX INFO: loaded from: classes4.dex */
public class WeightData extends MeasureData {
    public static final Parcelable.Creator CREATOR = new a();
    public int battery;
    public int heartRate;
    public double resistance50k;
    public double resistance5k;
    public int userNo;
    public double weight;
    public double weightLevel;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public WeightData createFromParcel(Parcel parcel) {
            return new WeightData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public WeightData[] newArray(int i) {
            return new WeightData[i];
        }
    }

    public WeightData() {
    }

    public WeightData(Parcel parcel) {
        super(parcel);
        this.userNo = parcel.readInt();
        this.weight = parcel.readDouble();
        this.weightLevel = parcel.readDouble();
        this.resistance5k = parcel.readDouble();
        this.battery = parcel.readInt();
    }

    public static WeightData from(WeightData_A3 weightData_A3) {
        WeightData weightData = new WeightData();
        weightData.setDeviceId(weightData_A3.getDeviceId());
        weightData.setUserNo(0);
        weightData.setMeasurementTime(weightData_A3.getUtc());
        weightData.setBattery(weightData_A3.getBattery());
        weightData.setResistance50k(weightData_A3.getImpedance());
        weightData.setWeight(weightData_A3.getWeight());
        weightData.setHeartRate(weightData_A3.getHeartRate());
        e.a(weightData);
        return weightData;
    }

    @Override // com.lifesense.device.scale.device.dto.receive.MeasureData, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getBattery() {
        return this.battery;
    }

    public int getHeartRate() {
        return this.heartRate;
    }

    public double getResistance50k() {
        return this.resistance50k;
    }

    public double getResistance5K() {
        return this.resistance5k;
    }

    public double getResistance5k() {
        return this.resistance5k;
    }

    public int getUserNo() {
        return this.userNo;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getWeightLevel() {
        return this.weightLevel;
    }

    public void setBattery(int i) {
        this.battery = i;
    }

    public void setHeartRate(int i) {
        this.heartRate = i;
    }

    public void setResistance50k(double d) {
        this.resistance50k = d;
    }

    public void setResistance5k(double d) {
        this.resistance5k = d;
    }

    public void setUserNo(int i) {
        this.userNo = i;
    }

    public void setWeight(double d) {
        this.weight = d;
    }

    public void setWeightLevel(double d) {
        this.weightLevel = d;
    }

    @Override // com.lifesense.device.scale.device.dto.receive.MeasureData
    public String toString() {
        return "WeightData{userId=" + this.userId + ", deviceId='" + this.deviceId + "', measurementTime=" + this.measurementTime + " " + formatDate(this.measurementTime) + ", userNo=" + this.userNo + ", weight=" + this.weight + ", weightLevel=" + this.weightLevel + ", resistance5K=" + this.resistance5k + ", resistance50K=" + this.resistance50k + ", battery=" + this.battery + ", heartRate=" + this.heartRate + '}';
    }

    @Override // com.lifesense.device.scale.device.dto.receive.MeasureData, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.userNo);
        parcel.writeDouble(this.weight);
        parcel.writeDouble(this.resistance5k);
        parcel.writeDouble(this.resistance50k);
        parcel.writeInt(this.battery);
    }
}
