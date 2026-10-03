package com.heytap.health.sleep.formula;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.heytap.health.sleep.formula.formula.OsaUserBean;

/* JADX INFO: loaded from: classes18.dex */
public class SnoreParameterUserBean implements Parcelable {
    public static final Parcelable.Creator<SnoreParameterUserBean> CREATOR = new a();
    private byte age;
    private int date;
    private int deviceType;
    private int generation;
    private int height;
    private byte sex;
    private int weight;

    public class a implements Parcelable.Creator<SnoreParameterUserBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SnoreParameterUserBean createFromParcel(Parcel parcel) {
            return new SnoreParameterUserBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SnoreParameterUserBean[] newArray(int i) {
            return new SnoreParameterUserBean[i];
        }
    }

    public SnoreParameterUserBean(int i, OsaUserBean osaUserBean, int i2, int i3) {
        this.height = osaUserBean.height;
        this.weight = osaUserBean.weight;
        this.sex = osaUserBean.sex;
        this.age = osaUserBean.age;
        this.date = i;
        this.deviceType = i2;
        this.generation = i3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(SnoreParameterUserBean snoreParameterUserBean) {
        return this.height == snoreParameterUserBean.height && this.weight == snoreParameterUserBean.weight && this.sex == snoreParameterUserBean.sex && this.age == snoreParameterUserBean.age && this.deviceType == snoreParameterUserBean.deviceType && this.generation == snoreParameterUserBean.generation;
    }

    public byte getAge() {
        return this.age;
    }

    public int getDate() {
        return this.date;
    }

    public int getDeviceType() {
        return this.deviceType;
    }

    public int getGeneration() {
        return this.generation;
    }

    public int getHeight() {
        return this.height;
    }

    public byte getSex() {
        return this.sex;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setAge(byte b) {
        this.age = b;
    }

    public void setDate(int i) {
        this.date = i;
    }

    public void setDeviceType(int i) {
        this.deviceType = i;
    }

    public void setGeneration(int i) {
        this.generation = i;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setSex(byte b) {
        this.sex = b;
    }

    public void setWeight(int i) {
        this.weight = i;
    }

    @NonNull
    public String toString() {
        return "SnoreParameterUserBean{height=" + this.height + ", weight=" + this.weight + ", sex=" + ((int) this.sex) + ", age=" + ((int) this.age) + ", date=" + this.date + ", deviceType=" + this.deviceType + ", generation=" + this.generation + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.height);
        parcel.writeInt(this.weight);
        parcel.writeByte(this.sex);
        parcel.writeByte(this.age);
        parcel.writeInt(this.date);
        parcel.writeInt(this.deviceType);
        parcel.writeInt(this.generation);
    }

    public SnoreParameterUserBean(Parcel parcel) {
        this.height = parcel.readInt();
        this.weight = parcel.readInt();
        this.sex = parcel.readByte();
        this.age = parcel.readByte();
        this.date = parcel.readInt();
        this.deviceType = parcel.readInt();
        this.generation = parcel.readInt();
    }
}
