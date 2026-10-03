package com.heytap.wearable.emergency.api.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class RescueFile implements Parcelable {
    public static final Parcelable.Creator<RescueFile> CREATOR = new a();
    private String allergies;

    @Deprecated
    private String birthday;
    private String bloodType;
    private String drugs;

    @Deprecated
    private String height;
    private String medicalHistory;
    private String name;
    private int runGoal;

    @Deprecated
    private String sex;

    @Deprecated
    private String weight;

    public class a implements Parcelable.Creator<RescueFile> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RescueFile createFromParcel(Parcel parcel) {
            return new RescueFile(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RescueFile[] newArray(int i) {
            return new RescueFile[i];
        }
    }

    public RescueFile() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAllergies() {
        String str = this.allergies;
        return str == null ? "" : str;
    }

    @Deprecated
    public String getBirthday() {
        return this.birthday;
    }

    public String getBloodType() {
        return this.bloodType;
    }

    public String getDrugs() {
        String str = this.drugs;
        return str == null ? "" : str;
    }

    @Deprecated
    public String getHeight() {
        return this.height;
    }

    public String getMedicalHistory() {
        String str = this.medicalHistory;
        return str == null ? "" : str;
    }

    public String getName() {
        String str = this.name;
        return str == null ? "" : str;
    }

    public int getRunGoal() {
        return this.runGoal;
    }

    @Deprecated
    public String getSex() {
        return this.sex;
    }

    @Deprecated
    public String getWeight() {
        return this.weight;
    }

    public void setAllergies(String str) {
        this.allergies = str;
    }

    @Deprecated
    public void setBirthday(String str) {
        this.birthday = str;
    }

    public void setBloodType(String str) {
        this.bloodType = str;
    }

    public void setDrugs(String str) {
        this.drugs = str;
    }

    @Deprecated
    public void setHeight(String str) {
        this.height = str;
    }

    public void setMedicalHistory(String str) {
        this.medicalHistory = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setRunGoal(int i) {
        this.runGoal = i;
    }

    @Deprecated
    public void setSex(String str) {
        this.sex = str;
    }

    @Deprecated
    public void setWeight(String str) {
        this.weight = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.sex);
        parcel.writeString(this.birthday);
        parcel.writeString(this.height);
        parcel.writeString(this.weight);
        parcel.writeString(this.bloodType);
        parcel.writeString(this.allergies);
        parcel.writeString(this.medicalHistory);
        parcel.writeString(this.drugs);
        parcel.writeInt(this.runGoal);
    }

    public RescueFile(MedicalCard medicalCard) {
        this.name = medicalCard.getName();
        this.sex = medicalCard.getUserInfo().getSex();
        this.birthday = medicalCard.getUserInfo().getBirthday();
        this.height = medicalCard.getUserInfo().getHeight();
        this.weight = medicalCard.getUserInfo().getWeight();
        this.bloodType = String.valueOf(medicalCard.getBloodType());
        this.allergies = medicalCard.getAllergicReaction();
        this.medicalHistory = medicalCard.getMedicalHistory();
        this.drugs = medicalCard.getMedicine();
        this.runGoal = medicalCard.getRunGoal();
    }

    public RescueFile(Parcel parcel) {
        this.name = parcel.readString();
        this.sex = parcel.readString();
        this.birthday = parcel.readString();
        this.height = parcel.readString();
        this.weight = parcel.readString();
        this.bloodType = parcel.readString();
        this.allergies = parcel.readString();
        this.medicalHistory = parcel.readString();
        this.drugs = parcel.readString();
        this.runGoal = parcel.readInt();
    }
}
