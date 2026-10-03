package com.heytap.wearable.watch.clock;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class AlarmSchedule implements Parcelable {
    public static final Parcelable.Creator<AlarmSchedule> CREATOR = new a();
    private int mAlarmState;
    private int mDay;
    private int mHour;
    private int mId;
    private String mLabel;
    private int mMinute;
    private int mMonth;
    private int mSnoozeTime;
    private long mTime;
    private int mYear;

    public class a implements Parcelable.Creator<AlarmSchedule> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AlarmSchedule createFromParcel(Parcel parcel) {
            return new AlarmSchedule(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AlarmSchedule[] newArray(int i) {
            return new AlarmSchedule[i];
        }
    }

    public AlarmSchedule(Parcel parcel) {
        this.mId = parcel.readInt();
        this.mYear = parcel.readInt();
        this.mMonth = parcel.readInt();
        this.mDay = parcel.readInt();
        this.mTime = parcel.readLong();
        this.mHour = parcel.readInt();
        this.mMinute = parcel.readInt();
        this.mSnoozeTime = parcel.readInt();
        this.mAlarmState = parcel.readInt();
        this.mLabel = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAlarmState() {
        return this.mAlarmState;
    }

    public int getDay() {
        return this.mDay;
    }

    public int getHour() {
        return this.mHour;
    }

    public int getId() {
        return this.mId;
    }

    public String getLabel() {
        return this.mLabel;
    }

    public int getMinute() {
        return this.mMinute;
    }

    public int getMonth() {
        return this.mMonth;
    }

    public int getSnoozeTime() {
        return this.mSnoozeTime;
    }

    public long getTime() {
        return this.mTime;
    }

    public int getYear() {
        return this.mYear;
    }

    public void setAlarmState(int i) {
        this.mAlarmState = i;
    }

    public void setDay(int i) {
        this.mDay = i;
    }

    public void setHour(int i) {
        this.mHour = i;
    }

    public void setId(int i) {
        this.mId = i;
    }

    public void setLabel(String str) {
        this.mLabel = str;
    }

    public void setMinute(int i) {
        this.mMinute = i;
    }

    public void setMonth(int i) {
        this.mMonth = i;
    }

    public void setSnoozeTime(int i) {
        this.mSnoozeTime = i;
    }

    public void setTime(long j2) {
        this.mTime = j2;
    }

    public void setYear(int i) {
        this.mYear = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mId);
        parcel.writeInt(this.mYear);
        parcel.writeInt(this.mYear);
        parcel.writeInt(this.mDay);
        parcel.writeLong(this.mTime);
        parcel.writeInt(this.mHour);
        parcel.writeInt(this.mMinute);
        parcel.writeInt(this.mSnoozeTime);
        parcel.writeInt(this.mAlarmState);
        parcel.writeString(this.mLabel);
    }
}
