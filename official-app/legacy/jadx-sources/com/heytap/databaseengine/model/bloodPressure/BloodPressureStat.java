package com.heytap.databaseengine.model.bloodPressure;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class BloodPressureStat extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<BloodPressureStat> CREATOR = new a();
    private int avgDiastolic;
    private int avgSystolic;
    private int bpType;
    private int date;
    private int highNormalTimes;
    private int highTimes;
    private int lowTimes;
    private int maxDiastolic;
    private int maxSystolic;
    private int mildHypertensionTimes;
    private int minDiastolic;
    private int minSystolic;
    private int moderateHypertensionTimes;
    private int normalTimes;
    private int severeHypertensionTimes;
    private String ssoid;

    public class a implements Parcelable.Creator<BloodPressureStat> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BloodPressureStat createFromParcel(Parcel parcel) {
            return new BloodPressureStat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BloodPressureStat[] newArray(int i) {
            return new BloodPressureStat[i];
        }
    }

    public BloodPressureStat() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAvgDiastolic() {
        return this.avgDiastolic;
    }

    public int getAvgSystolic() {
        return this.avgSystolic;
    }

    public int getBpType() {
        return this.bpType;
    }

    public int getDate() {
        return this.date;
    }

    public int getHighNormalTimes() {
        return this.highNormalTimes;
    }

    public int getHighTimes() {
        return this.highTimes;
    }

    public int getLowTimes() {
        return this.lowTimes;
    }

    public int getMaxDiastolic() {
        return this.maxDiastolic;
    }

    public int getMaxSystolic() {
        return this.maxSystolic;
    }

    public int getMildHypertensionTimes() {
        return this.mildHypertensionTimes;
    }

    public int getMinDiastolic() {
        return this.minDiastolic;
    }

    public int getMinSystolic() {
        return this.minSystolic;
    }

    public int getModerateHypertensionTimes() {
        return this.moderateHypertensionTimes;
    }

    public int getNormalTimes() {
        return this.normalTimes;
    }

    public int getSevereHypertensionTimes() {
        return this.severeHypertensionTimes;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    public void setAvgDiastolic(int i) {
        this.avgDiastolic = i;
    }

    public void setAvgSystolic(int i) {
        this.avgSystolic = i;
    }

    public void setBpType(int i) {
        this.bpType = i;
    }

    public void setDate(int i) {
        this.date = i;
    }

    public void setHighNormalTimes(int i) {
        this.highNormalTimes = i;
    }

    public void setHighTimes(int i) {
        this.highTimes = i;
    }

    public void setLowTimes(int i) {
        this.lowTimes = i;
    }

    public void setMaxDiastolic(int i) {
        this.maxDiastolic = i;
    }

    public void setMaxSystolic(int i) {
        this.maxSystolic = i;
    }

    public void setMildHypertensionTimes(int i) {
        this.mildHypertensionTimes = i;
    }

    public void setMinDiastolic(int i) {
        this.minDiastolic = i;
    }

    public void setMinSystolic(int i) {
        this.minSystolic = i;
    }

    public void setModerateHypertensionTimes(int i) {
        this.moderateHypertensionTimes = i;
    }

    public void setNormalTimes(int i) {
        this.normalTimes = i;
    }

    public void setSevereHypertensionTimes(int i) {
        this.severeHypertensionTimes = i;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "BloodPressureStat{ssoid='" + this.ssoid + "', date=" + this.date + ", bpType=" + this.bpType + ", maxSystolic=" + this.maxSystolic + ", minSystolic=" + this.minSystolic + ", avgSystolic=" + this.avgSystolic + ", maxDiastolic=" + this.maxDiastolic + ", minDiastolic=" + this.minDiastolic + ", avgDiastolic=" + this.avgDiastolic + ", normalTimes=" + this.normalTimes + ", highNormalTimes=" + this.highNormalTimes + ", mildHypertensionTimes=" + this.mildHypertensionTimes + ", moderateHypertensionTimes=" + this.moderateHypertensionTimes + ", severeHypertensionTimes=" + this.severeHypertensionTimes + ", highTimes=" + this.highTimes + ", lowTimes=" + this.lowTimes + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeInt(this.date);
        parcel.writeInt(this.bpType);
        parcel.writeInt(this.maxSystolic);
        parcel.writeInt(this.minSystolic);
        parcel.writeInt(this.avgSystolic);
        parcel.writeInt(this.maxDiastolic);
        parcel.writeInt(this.minDiastolic);
        parcel.writeInt(this.avgDiastolic);
        parcel.writeInt(this.normalTimes);
        parcel.writeInt(this.highNormalTimes);
        parcel.writeInt(this.mildHypertensionTimes);
        parcel.writeInt(this.moderateHypertensionTimes);
        parcel.writeInt(this.severeHypertensionTimes);
        parcel.writeInt(this.highTimes);
        parcel.writeInt(this.lowTimes);
    }

    public BloodPressureStat(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.date = parcel.readInt();
        this.bpType = parcel.readInt();
        this.maxSystolic = parcel.readInt();
        this.minSystolic = parcel.readInt();
        this.avgSystolic = parcel.readInt();
        this.maxDiastolic = parcel.readInt();
        this.minDiastolic = parcel.readInt();
        this.avgDiastolic = parcel.readInt();
        this.normalTimes = parcel.readInt();
        this.highNormalTimes = parcel.readInt();
        this.mildHypertensionTimes = parcel.readInt();
        this.moderateHypertensionTimes = parcel.readInt();
        this.severeHypertensionTimes = parcel.readInt();
        this.highTimes = parcel.readInt();
        this.lowTimes = parcel.readInt();
    }
}
