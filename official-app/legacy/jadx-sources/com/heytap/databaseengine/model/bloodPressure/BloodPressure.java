package com.heytap.databaseengine.model.bloodPressure;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class BloodPressure extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<BloodPressure> CREATOR = new a();
    private int arrhythmiaFlg;
    private int bmFlg;
    private int bpType;
    private int cwsFlg;
    private String deviceUniqueId;
    private int diastolic;
    private int display;
    private int evaluation;
    private int manufacturer;
    private long measureTimestamp;
    private String model;
    private int pulse;
    private String ssoid;
    private int systolic;

    public class a implements Parcelable.Creator<BloodPressure> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BloodPressure createFromParcel(Parcel parcel) {
            return new BloodPressure(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BloodPressure[] newArray(int i) {
            return new BloodPressure[i];
        }
    }

    public BloodPressure() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getArrhythmiaFlg() {
        return this.arrhythmiaFlg;
    }

    public int getBmFlg() {
        return this.bmFlg;
    }

    public int getBpType() {
        return this.bpType;
    }

    public int getCwsFlg() {
        return this.cwsFlg;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public int getDiastolic() {
        return this.diastolic;
    }

    public int getDisplay() {
        return this.display;
    }

    public int getEvaluation() {
        return this.evaluation;
    }

    public int getManufacturer() {
        return this.manufacturer;
    }

    public long getMeasureTimestamp() {
        return this.measureTimestamp;
    }

    public String getModel() {
        return this.model;
    }

    public int getPulse() {
        return this.pulse;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    public int getSystolic() {
        return this.systolic;
    }

    public void setArrhythmiaFlg(int i) {
        this.arrhythmiaFlg = i;
    }

    public void setBmFlg(int i) {
        this.bmFlg = i;
    }

    public void setBpType(int i) {
        this.bpType = i;
    }

    public void setCwsFlg(int i) {
        this.cwsFlg = i;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setDiastolic(int i) {
        this.diastolic = i;
    }

    public void setDisplay(int i) {
        this.display = i;
    }

    public void setEvaluation(int i) {
        this.evaluation = i;
    }

    public void setManufacturer(int i) {
        this.manufacturer = i;
    }

    public void setMeasureTimestamp(long j2) {
        this.measureTimestamp = j2;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setPulse(int i) {
        this.pulse = i;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setSystolic(int i) {
        this.systolic = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "BloodPressure{ssoid='" + this.ssoid + "', manufacturer=" + this.manufacturer + ", model='" + this.model + "', deviceUniqueId='" + this.deviceUniqueId + "', measureTimestamp=" + this.measureTimestamp + ", bpType=" + this.bpType + ", systolic=" + this.systolic + ", diastolic=" + this.diastolic + ", pulse=" + this.pulse + ", arrhythmiaFlg=" + this.arrhythmiaFlg + ", bmFlg=" + this.bmFlg + ", cwsFlg=" + this.cwsFlg + ", evaluation=" + this.evaluation + ", display=" + this.display + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeInt(this.manufacturer);
        parcel.writeString(this.model);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeLong(this.measureTimestamp);
        parcel.writeInt(this.bpType);
        parcel.writeInt(this.systolic);
        parcel.writeInt(this.diastolic);
        parcel.writeInt(this.pulse);
        parcel.writeInt(this.arrhythmiaFlg);
        parcel.writeInt(this.bmFlg);
        parcel.writeInt(this.cwsFlg);
        parcel.writeInt(this.evaluation);
        parcel.writeInt(this.display);
    }

    public BloodPressure(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.manufacturer = parcel.readInt();
        this.model = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.measureTimestamp = parcel.readLong();
        this.bpType = parcel.readInt();
        this.systolic = parcel.readInt();
        this.diastolic = parcel.readInt();
        this.pulse = parcel.readInt();
        this.arrhythmiaFlg = parcel.readInt();
        this.bmFlg = parcel.readInt();
        this.cwsFlg = parcel.readInt();
        this.evaluation = parcel.readInt();
        this.display = parcel.readInt();
    }
}
