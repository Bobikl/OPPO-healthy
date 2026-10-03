package com.heytap.wearable.emergency.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.model.UserInfo;
import com.oplus.aiunit.vision.j1j;
import com.oplus.aiunit.vision.nt1;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class MedicalCard implements Parcelable {
    public static final Parcelable.Creator<MedicalCard> CREATOR = new a();
    private static final int MAX_NAME_CODE_POINT_COUNT = 45;
    private String allergicReaction;
    private String blood;
    private int bloodType;
    private boolean isRhYin;
    private String medicalHistory;
    private String medicine;
    private String name;
    private int runGoal;
    private UserInfo userInfo;

    public class a implements Parcelable.Creator<MedicalCard> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MedicalCard createFromParcel(Parcel parcel) {
            return new MedicalCard(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MedicalCard[] newArray(int i) {
            return new MedicalCard[i];
        }
    }

    public MedicalCard() {
        this.name = "";
        this.medicalHistory = "";
        this.allergicReaction = "";
        this.medicine = "";
        this.userInfo = new UserInfo();
        setBloodType(5);
    }

    public void checkValid() {
        this.name = j1j.d(this.name, 45);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MedicalCard medicalCard = (MedicalCard) obj;
        return this.bloodType == medicalCard.bloodType && Objects.equals(this.blood, medicalCard.blood) && this.isRhYin == medicalCard.isRhYin && Objects.equals(this.userInfo, medicalCard.userInfo) && Objects.equals(this.name, medicalCard.name) && Objects.equals(this.medicalHistory, medicalCard.medicalHistory) && Objects.equals(this.allergicReaction, medicalCard.allergicReaction) && Objects.equals(this.medicine, medicalCard.medicine) && this.runGoal == medicalCard.runGoal;
    }

    public String getAllergicReaction() {
        return this.allergicReaction;
    }

    public String getBlood() {
        return this.blood;
    }

    public int getBloodType() {
        return this.bloodType;
    }

    public String getMedicalHistory() {
        return this.medicalHistory;
    }

    public String getMedicine() {
        return this.medicine;
    }

    public String getName() {
        return this.name;
    }

    public int getRunGoal() {
        return this.runGoal;
    }

    public UserInfo getUserInfo() {
        return this.userInfo;
    }

    public int hashCode() {
        return Objects.hash(this.userInfo, this.name, Integer.valueOf(this.bloodType), this.blood, Boolean.valueOf(this.isRhYin), this.medicalHistory, this.allergicReaction, this.medicine, Integer.valueOf(this.runGoal));
    }

    public boolean isEmpty() {
        return TextUtils.isEmpty(this.userInfo.getSsoid());
    }

    public boolean isRhYin() {
        return this.isRhYin;
    }

    public void setAllergicReaction(String str) {
        this.allergicReaction = str;
    }

    public void setBloodType(int i) {
        this.bloodType = i;
        this.blood = nt1.b(i);
        this.isRhYin = nt1.d(i);
    }

    public void setMedicalHistory(String str) {
        this.medicalHistory = str;
    }

    public void setMedicine(String str) {
        this.medicine = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setRunGoal(int i) {
        this.runGoal = i;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @NonNull
    public String toString() {
        return "{name=" + this.name + " bloodType=" + this.bloodType + " medicalHistory=" + this.medicalHistory + " allergicReaction=" + this.allergicReaction + " medicine=" + this.medicine + " userInfo=" + this.userInfo + " runGoal=" + this.runGoal + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.userInfo, i);
        parcel.writeString(this.name);
        parcel.writeInt(this.bloodType);
        parcel.writeString(this.blood);
        parcel.writeBooleanArray(new boolean[]{this.isRhYin});
        parcel.writeString(this.medicalHistory);
        parcel.writeString(this.allergicReaction);
        parcel.writeString(this.medicine);
        parcel.writeInt(this.runGoal);
    }

    public MedicalCard(MedicalCard medicalCard) {
        this.name = "";
        this.medicalHistory = "";
        this.allergicReaction = "";
        this.medicine = "";
        this.userInfo = new UserInfo(medicalCard.getUserInfo());
        this.name = medicalCard.getName();
        this.bloodType = medicalCard.getBloodType();
        this.blood = medicalCard.getBlood();
        this.isRhYin = medicalCard.isRhYin();
        this.medicalHistory = medicalCard.getMedicalHistory();
        this.allergicReaction = medicalCard.getAllergicReaction();
        this.medicine = medicalCard.getMedicine();
        this.runGoal = medicalCard.runGoal;
    }

    public MedicalCard(RescueFile rescueFile) {
        this.name = "";
        this.medicalHistory = "";
        this.allergicReaction = "";
        this.medicine = "";
        this.name = rescueFile.getName();
        if (rescueFile.getBloodType() == null) {
            setBloodType(5);
        } else {
            try {
                setBloodType(Integer.parseInt(rescueFile.getBloodType()));
            } catch (NumberFormatException unused) {
                setBloodType(5);
            }
        }
        this.medicalHistory = rescueFile.getMedicalHistory();
        this.allergicReaction = rescueFile.getAllergies();
        this.medicine = rescueFile.getDrugs();
        this.runGoal = rescueFile.getRunGoal();
    }

    public MedicalCard(Parcel parcel) {
        this.name = "";
        this.medicalHistory = "";
        this.allergicReaction = "";
        this.medicine = "";
        this.userInfo = (UserInfo) parcel.readParcelable(UserInfo.class.getClassLoader());
        this.name = parcel.readString();
        this.bloodType = parcel.readInt();
        this.blood = parcel.readString();
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.isRhYin = zArr[0];
        this.medicalHistory = parcel.readString();
        this.allergicReaction = parcel.readString();
        this.medicine = parcel.readString();
        this.runGoal = parcel.readInt();
    }
}
