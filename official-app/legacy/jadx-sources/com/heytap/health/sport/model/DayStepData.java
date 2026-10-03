package com.heytap.health.sport.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;

/* JADX INFO: loaded from: classes18.dex */
public class DayStepData implements Parcelable {
    public static final Parcelable.Creator<DayStepData> CREATOR = new a();
    private LocalDate date;
    private int step;

    public class a implements Parcelable.Creator<DayStepData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DayStepData createFromParcel(Parcel parcel) {
            return new DayStepData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DayStepData[] newArray(int i) {
            return new DayStepData[i];
        }
    }

    public DayStepData(int i, LocalDate localDate) {
        this.step = i;
        this.date = localDate;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public int getStep() {
        return this.step;
    }

    public void readFromParcel(Parcel parcel) {
        this.step = parcel.readInt();
        this.date = (LocalDate) parcel.readSerializable();
    }

    public void setDate(LocalDate localDate) {
        this.date = localDate;
    }

    public void setStep(int i) {
        this.step = i;
    }

    public String toString() {
        return "DayStepData{step=" + this.step + ", date=" + this.date + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.step);
        parcel.writeSerializable(this.date);
    }

    public DayStepData(Parcel parcel) {
        this.step = parcel.readInt();
        this.date = (LocalDate) parcel.readSerializable();
    }
}
