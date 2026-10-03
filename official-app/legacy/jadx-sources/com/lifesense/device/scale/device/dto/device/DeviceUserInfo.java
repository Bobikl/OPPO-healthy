package com.lifesense.device.scale.device.dto.device;

import android.os.Parcel;
import android.os.Parcelable;
import com.coloros.sceneservice.dataprovider.bean.SceneStatusInfo;

/* JADX INFO: loaded from: classes4.dex */
public class DeviceUserInfo implements Parcelable {
    public static final Parcelable.Creator<DeviceUserInfo> CREATOR = new a();
    public static final int DEFAULT_WEIGHT = 65;
    public int age;
    public float goalWeight;
    public int height;
    public int sex;
    public int targetSteps;
    public long userId;
    public float waistline;
    public double weight;

    public static class a implements Parcelable.Creator<DeviceUserInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceUserInfo createFromParcel(Parcel parcel) {
            return new DeviceUserInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceUserInfo[] newArray(int i) {
            return new DeviceUserInfo[i];
        }
    }

    public DeviceUserInfo() {
        this.sex = 1;
        this.userId = 0L;
        this.height = 175;
        this.weight = 65.0d;
        this.age = 20;
        this.targetSteps = SceneStatusInfo.SceneConstant.TRIP_IN_JOURNEY;
        this.waistline = 80.0f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAge() {
        return this.age;
    }

    public float getGoalWeight() {
        return this.goalWeight;
    }

    public int getHeight() {
        return this.height;
    }

    public int getSex() {
        return this.sex;
    }

    public int getTargetSteps() {
        return this.targetSteps;
    }

    public long getUserId() {
        return this.userId;
    }

    public float getWaistline() {
        return this.waistline;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setAge(int i) {
        this.age = i;
    }

    public void setGoalWeight(float f) {
        this.goalWeight = f;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setSex(int i) {
        this.sex = i;
    }

    public void setTargetSteps(int i) {
        this.targetSteps = i * 7;
    }

    public void setUserId(long j2) {
        this.userId = j2;
    }

    public void setWaistline(float f) {
        this.waistline = f;
    }

    public void setWeight(double d) {
        this.weight = d;
    }

    public String toString() {
        return "DeviceUserInfo{sex=" + this.sex + ", userId=" + this.userId + ", height=" + this.height + ", weight=" + this.weight + ", age=" + this.age + ", targetSteps=" + this.targetSteps + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.sex);
        parcel.writeLong(this.userId);
        parcel.writeInt(this.height);
        parcel.writeDouble(this.weight);
        parcel.writeInt(this.age);
        parcel.writeInt(this.targetSteps);
        parcel.writeFloat(this.waistline);
        parcel.writeFloat(this.goalWeight);
    }

    public DeviceUserInfo(int i, long j2, int i2, int i3, int i4, int i5) {
        this.targetSteps = i5;
        this.sex = i;
        this.userId = j2;
        this.height = i2;
        this.age = i3;
        this.weight = i4;
    }

    public DeviceUserInfo(Parcel parcel) {
        this.sex = parcel.readInt();
        this.userId = parcel.readLong();
        this.height = parcel.readInt();
        this.weight = parcel.readDouble();
        this.age = parcel.readInt();
        this.targetSteps = parcel.readInt();
        this.waistline = parcel.readFloat();
        this.goalWeight = parcel.readFloat();
    }
}
