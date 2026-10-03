package com.lifesense.device.scale.login;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public class User implements Cloneable, Parcelable {
    public static final Parcelable.Creator<User> CREATOR = new a();
    public static final int DEFAULT_AGE = 40;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public Date birthday;
    public String clientId;
    public Date created;
    public boolean deleted;
    public String email;
    public String headImg;
    public double height;
    public Long id;
    public String idcard;
    public String insuranceId;
    public int lengthUnit;
    public String lifesenseId;
    public String mobile;
    public String name;
    public boolean qq;
    public int sex;
    public long updated;
    public boolean uploadFlag;
    public double waist;
    public boolean wechat;
    public double weight;
    public int weightUnit;

    public static class a implements Parcelable.Creator<User> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public User createFromParcel(Parcel parcel) {
            return new User(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public User[] newArray(int i) {
            return new User[i];
        }
    }

    public User() {
    }

    public User(Parcel parcel) {
        this.id = (Long) parcel.readValue(Long.class.getClassLoader());
        this.lifesenseId = parcel.readString();
        this.headImg = parcel.readString();
        this.name = parcel.readString();
        this.sex = parcel.readInt();
        long j2 = parcel.readLong();
        this.birthday = j2 == -1 ? null : new Date(j2);
        this.email = parcel.readString();
        this.mobile = parcel.readString();
        this.idcard = parcel.readString();
        this.insuranceId = parcel.readString();
        this.waist = parcel.readDouble();
        this.weight = parcel.readDouble();
        this.height = parcel.readDouble();
        this.wechat = parcel.readByte() != 0;
        this.qq = parcel.readByte() != 0;
        this.clientId = parcel.readString();
        long j3 = parcel.readLong();
        this.created = j3 != -1 ? new Date(j3) : null;
        this.updated = parcel.readLong();
        this.uploadFlag = parcel.readByte() != 0;
        this.deleted = parcel.readByte() != 0;
        this.lengthUnit = parcel.readInt();
        this.weightUnit = parcel.readInt();
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public User m5134clone() {
        return (User) super.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAge() {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        if (this.birthday == null) {
            return 40;
        }
        calendar2.setTime(new Date());
        calendar.setTime(this.birthday);
        if (calendar.after(calendar2)) {
            return 40;
        }
        int i = calendar2.get(1) - calendar.get(1);
        return calendar2.get(6) < calendar.get(6) ? i - 1 : i;
    }

    public Date getBirthday() {
        if (this.birthday == null) {
            this.birthday = new Date(946656000000L);
        }
        return this.birthday;
    }

    public String getClientId() {
        return this.clientId;
    }

    public Date getCreated() {
        return this.created;
    }

    public int getDefaultWeight() {
        return isFemale() ? 50 : 65;
    }

    public boolean getDeleted() {
        return this.deleted;
    }

    public String getEmail() {
        return this.email;
    }

    public String getFileName() {
        return "[" + this.name + "][id=" + this.id + "]";
    }

    public String getHeadImg() {
        return this.headImg;
    }

    public int getHeartAge() {
        Calendar calendar = Calendar.getInstance();
        Date date = this.birthday;
        if (date == null || calendar.before(date)) {
            return 40;
        }
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        calendar.setTime(this.birthday);
        int i4 = calendar.get(1);
        int i5 = calendar.get(2);
        int i6 = calendar.get(5);
        int i7 = i - i4;
        if (i2 <= i5) {
            return (i2 != i5 || i3 < i6) ? i7 - 1 : i7;
        }
        return i7;
    }

    public int getHeartAgeByTimeInMillis(long j2) {
        Calendar calendar = Calendar.getInstance();
        if (j2 == 0) {
            return 40;
        }
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        calendar.setTimeInMillis(j2);
        int i4 = calendar.get(1);
        int i5 = calendar.get(2);
        int i6 = calendar.get(5);
        int i7 = i - i4;
        if (i2 <= i5) {
            return (i2 != i5 || i3 < i6) ? i7 - 1 : i7;
        }
        return i7;
    }

    public double getHeight() {
        return this.height;
    }

    public Long getId() {
        return this.id;
    }

    public String getIdcard() {
        return this.idcard;
    }

    public String getInsuranceId() {
        return this.insuranceId;
    }

    public int getLengthUnit() {
        return this.lengthUnit;
    }

    public String getLifesenseId() {
        return this.lifesenseId;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getName() {
        return this.name;
    }

    public int getOldAge() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.birthday);
        int i = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        return calendar.get(1) - i;
    }

    public boolean getQq() {
        return this.qq;
    }

    public int getServerAge() {
        Calendar calendar = Calendar.getInstance();
        Date date = this.birthday;
        if (date == null || calendar.before(date)) {
            return 40;
        }
        int i = calendar.get(1);
        int i2 = calendar.get(2) + 1;
        int i3 = calendar.get(5);
        calendar.setTime(this.birthday);
        int i4 = calendar.get(1);
        int i5 = calendar.get(2);
        int i6 = calendar.get(5);
        int i7 = i - i4;
        if (i2 <= i5) {
            return (i2 != i5 || i3 < i6) ? i7 - 1 : i7;
        }
        return i7;
    }

    public int getSex() {
        return this.sex;
    }

    public long getUpdated() {
        return this.updated;
    }

    public boolean getUploadFlag() {
        return this.uploadFlag;
    }

    public double getWaist() {
        return this.waist;
    }

    public boolean getWechat() {
        return this.wechat;
    }

    public double getWeight() {
        return this.weight;
    }

    public int getWeightUnit() {
        return this.weightUnit;
    }

    public boolean isDeleted() {
        return this.deleted;
    }

    public boolean isFemale() {
        return this.sex == 2;
    }

    public boolean isNewUser() {
        return this.updated == 0;
    }

    public boolean isQq() {
        return this.qq;
    }

    public boolean isUploadFlag() {
        return this.uploadFlag;
    }

    public boolean isWechat() {
        return this.wechat;
    }

    public void setBirthday(Date date) {
        this.birthday = date;
    }

    public void setClientId(String str) {
        this.clientId = str;
    }

    public void setCreated(Date date) {
        this.created = date;
    }

    public void setDeleted(boolean z) {
        this.deleted = z;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setHeadImg(String str) {
        this.headImg = str;
    }

    public void setHeight(double d) {
        this.height = d;
    }

    public void setId(Long l2) {
        this.id = l2;
    }

    public void setIdcard(String str) {
        this.idcard = str;
    }

    public void setInsuranceId(String str) {
        this.insuranceId = str;
    }

    public void setLengthUnit(int i) {
        this.lengthUnit = i;
    }

    public void setLifesenseId(String str) {
        this.lifesenseId = str;
    }

    public void setMobile(String str) {
        this.mobile = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setQq(boolean z) {
        this.qq = z;
    }

    public void setSex(int i) {
        this.sex = i;
    }

    public void setUpdated(long j2) {
        this.updated = j2;
    }

    public void setUploadFlag(boolean z) {
        this.uploadFlag = z;
    }

    public void setWaist(double d) {
        this.waist = d;
    }

    public void setWechat(boolean z) {
        this.wechat = z;
    }

    public void setWeight(double d) {
        this.weight = d;
    }

    public void setWeightUnit(int i) {
        this.weightUnit = i;
    }

    public String toString() {
        return "User{id=" + this.id + ", lifesenseId='" + this.lifesenseId + "', headImg='" + this.headImg + "', name='" + this.name + "', sex=" + this.sex + ", birthday=" + this.birthday + ", email='" + this.email + "', mobile='" + this.mobile + "', idcard='" + this.idcard + "', insuranceId='" + this.insuranceId + "', waist=" + this.waist + ", weight=" + this.weight + ", height=" + this.height + ", wechat=" + this.wechat + ", qq=" + this.qq + ", clientId='" + this.clientId + "', created=" + this.created + ", updated=" + this.updated + ", uploadFlag=" + this.uploadFlag + ", deleted=" + this.deleted + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.id);
        parcel.writeString(this.lifesenseId);
        parcel.writeString(this.headImg);
        parcel.writeString(this.name);
        parcel.writeInt(this.sex);
        Date date = this.birthday;
        parcel.writeLong(date != null ? date.getTime() : -1L);
        parcel.writeString(this.email);
        parcel.writeString(this.mobile);
        parcel.writeString(this.idcard);
        parcel.writeString(this.insuranceId);
        parcel.writeDouble(this.waist);
        parcel.writeDouble(this.weight);
        parcel.writeDouble(this.height);
        parcel.writeByte(this.wechat ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.qq ? (byte) 1 : (byte) 0);
        parcel.writeString(this.clientId);
        Date date2 = this.created;
        parcel.writeLong(date2 != null ? date2.getTime() : -1L);
        parcel.writeLong(this.updated);
        parcel.writeByte(this.uploadFlag ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.deleted ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.lengthUnit);
        parcel.writeInt(this.weightUnit);
    }
}
