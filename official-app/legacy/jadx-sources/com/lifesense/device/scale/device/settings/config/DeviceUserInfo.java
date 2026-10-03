package com.lifesense.device.scale.device.settings.config;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class DeviceUserInfo implements Parcelable {
    public static final Parcelable.Creator<DeviceUserInfo> CREATOR = new a();
    public int age;
    public double height;
    public int sex;
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
    }

    public DeviceUserInfo(Parcel parcel) {
        this.weight = parcel.readDouble();
        this.height = parcel.readDouble();
        this.age = parcel.readInt();
        this.sex = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAge() {
        return this.age;
    }

    public double getHeight() {
        return this.height;
    }

    public int getSex() {
        return this.sex;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setAge(int i) {
        this.age = i;
    }

    public void setHeight(double d) {
        this.height = d;
    }

    public void setSex(int i) {
        this.sex = i;
    }

    public void setWeight(double d) {
        this.weight = d;
    }

    public String toString() {
        return "DeviceUserInfo{weight=" + this.weight + ", height=" + this.height + ", age=" + this.age + ", sex=" + this.sex + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.weight);
        parcel.writeDouble(this.height);
        parcel.writeInt(this.age);
        parcel.writeInt(this.sex);
    }
}
