package com.coloros.platformalarmclock;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes13.dex */
public class PlatformClockInfo implements Parcelable {
    public static final Parcelable.Creator<PlatformClockInfo> CREATOR = new a();
    public long a;
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1519c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f1520e;
    public boolean f;
    public int g;
    public int h;

    public class a implements Parcelable.Creator<PlatformClockInfo> {
        @Override // android.os.Parcelable.Creator
        public final PlatformClockInfo createFromParcel(Parcel parcel) {
            return new PlatformClockInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PlatformClockInfo[] newArray(int i) {
            return new PlatformClockInfo[i];
        }
    }

    public PlatformClockInfo() {
    }

    public PlatformClockInfo(long j2, long j3, boolean z, String str, String str2) {
        this.a = j2;
        this.b = j3;
        this.f1519c = z;
        this.d = str;
        this.f1520e = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getAlarmTime() {
        return this.b;
    }

    public String getLanguage() {
        return this.f1520e;
    }

    public long getScheduleId() {
        return this.a;
    }

    public String getTagName() {
        return this.d;
    }

    public int getmRingNum() {
        return this.g;
    }

    public int getmSnoozeTime() {
        return this.h;
    }

    public boolean isDelayReminder() {
        return this.f1519c;
    }

    public boolean ismIsGarbAlarm() {
        return this.f;
    }

    public void setAlarmTime(long j2) {
        this.b = j2;
    }

    public void setDelayReminder(boolean z) {
        this.f1519c = z;
    }

    public void setLanguage(String str) {
        this.f1520e = str;
    }

    public void setScheduleId(long j2) {
        this.a = j2;
    }

    public void setTagName(String str) {
        this.d = str;
    }

    public void setmIsGarbAlarm(boolean z) {
        this.f = z;
    }

    public void setmRingNum(int i) {
        this.g = i;
    }

    public void setmSnoozeTime(int i) {
        this.h = i;
    }

    public String toString() {
        return "PlatformClockInfo{mScheduleId=" + this.a + ", mAlarmTime=" + this.b + ", mDelayReminder=" + this.f1519c + ", mTagName='" + this.d + ", mLanguage='" + this.f1520e + ", mIsGarbAlarm='" + this.f + ", mRingNum='" + this.g + ", mSnoozeTime='" + this.h + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeByte(this.f1519c ? (byte) 1 : (byte) 0);
        parcel.writeString(this.d);
        parcel.writeString(this.f1520e);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
    }

    public PlatformClockInfo(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.f1519c = parcel.readByte() != 0;
        this.d = parcel.readString();
        this.f1520e = parcel.readString();
        this.f = parcel.readByte() != 0;
        this.g = parcel.readInt();
        this.h = parcel.readInt();
    }
}
