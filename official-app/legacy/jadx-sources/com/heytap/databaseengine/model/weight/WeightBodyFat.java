package com.heytap.databaseengine.model.weight;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class WeightBodyFat extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<WeightBodyFat> CREATOR = new a();
    private int bindChannel;
    private String bmi;
    private String bodyAdviceText;
    private String bodyStyleText;
    private String deviceUniqueId;
    private long measurementTime;
    private long modifiedTime;
    private String oldUserTagId;
    private String openId;
    private String resistance;
    private String sn;
    private String ssoid;
    private int subAccount;
    private String userTagId;
    private String weight;
    private String weightId;
    private List<WeightLabel> weightLabelList;
    private String weightStatus;

    public class a implements Parcelable.Creator<WeightBodyFat> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeightBodyFat createFromParcel(Parcel parcel) {
            return new WeightBodyFat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public WeightBodyFat[] newArray(int i) {
            return new WeightBodyFat[i];
        }
    }

    public WeightBodyFat() {
        this.ssoid = "";
        this.deviceUniqueId = "";
        this.userTagId = "";
        this.oldUserTagId = "";
        this.weightId = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getBindChannel() {
        return this.bindChannel;
    }

    public String getBmi() {
        return this.bmi;
    }

    public String getBodyAdviceText() {
        return this.bodyAdviceText;
    }

    public String getBodyStyleText() {
        return this.bodyStyleText;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public long getMeasurementTime() {
        return this.measurementTime;
    }

    public long getModifiedTime() {
        return this.modifiedTime;
    }

    public String getOldUserTagId() {
        return this.oldUserTagId;
    }

    public String getOpenId() {
        return this.openId;
    }

    public String getResistance() {
        return this.resistance;
    }

    public String getSn() {
        return this.sn;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    public int getSubAccount() {
        return this.subAccount;
    }

    public String getUserTagId() {
        return this.userTagId;
    }

    public String getWeight() {
        return this.weight;
    }

    public String getWeightId() {
        return this.weightId;
    }

    public List<WeightLabel> getWeightLabelList() {
        return this.weightLabelList;
    }

    public String getWeightStatus() {
        return this.weightStatus;
    }

    public void setBindChannel(int i) {
        this.bindChannel = i;
    }

    public void setBmi(String str) {
        this.bmi = str;
    }

    public void setBodyAdviceText(String str) {
        this.bodyAdviceText = str;
    }

    public void setBodyStyleText(String str) {
        this.bodyStyleText = str;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setMeasurementTime(long j2) {
        this.measurementTime = j2;
    }

    public void setModifiedTime(long j2) {
        this.modifiedTime = j2;
    }

    public void setOldUserTagId(String str) {
        this.oldUserTagId = str;
    }

    public void setOpenId(String str) {
        this.openId = str;
    }

    public void setResistance(String str) {
        this.resistance = str;
    }

    public void setSn(String str) {
        this.sn = str;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setSubAccount(int i) {
        this.subAccount = i;
    }

    public void setUserTagId(String str) {
        this.userTagId = str;
    }

    public void setWeight(String str) {
        this.weight = str;
    }

    public void setWeightId(String str) {
        this.weightId = str;
    }

    public void setWeightLabelList(List<WeightLabel> list) {
        this.weightLabelList = list;
    }

    public void setWeightStatus(String str) {
        this.weightStatus = str;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "WeightBodyFat{ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', sn='" + this.sn + "', openId='" + this.openId + "', bindChannel=" + this.bindChannel + ", resistance50K='" + this.resistance + "', subAccount=" + this.subAccount + ", userTagId='" + this.userTagId + "', oldUserTagId='" + this.oldUserTagId + "', weightId='" + this.weightId + "', weightStatus='" + this.weightStatus + "', weight='" + this.weight + "', bmi='" + this.bmi + "', measurementTimestamp=" + this.measurementTime + ", bodyStyleText='" + this.bodyStyleText + "', bodyAdviceText='" + this.bodyAdviceText + "', weightLabelList=" + this.weightLabelList + ", modifiedTimestamp=" + this.modifiedTime + "} ";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeString(this.sn);
        parcel.writeString(this.openId);
        parcel.writeInt(this.bindChannel);
        parcel.writeString(this.resistance);
        parcel.writeInt(this.subAccount);
        parcel.writeString(this.userTagId);
        parcel.writeString(this.oldUserTagId);
        parcel.writeString(this.weightId);
        parcel.writeString(this.weightStatus);
        parcel.writeString(this.weight);
        parcel.writeString(this.bmi);
        parcel.writeLong(this.measurementTime);
        parcel.writeString(this.bodyStyleText);
        parcel.writeString(this.bodyAdviceText);
        parcel.writeList(this.weightLabelList);
        parcel.writeLong(this.modifiedTime);
    }

    public WeightBodyFat(Parcel parcel) {
        this.ssoid = "";
        this.deviceUniqueId = "";
        this.userTagId = "";
        this.oldUserTagId = "";
        this.weightId = "";
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.sn = parcel.readString();
        this.openId = parcel.readString();
        this.bindChannel = parcel.readInt();
        this.resistance = parcel.readString();
        this.subAccount = parcel.readInt();
        this.userTagId = parcel.readString();
        this.oldUserTagId = parcel.readString();
        this.weightId = parcel.readString();
        this.weightStatus = parcel.readString();
        this.weight = parcel.readString();
        this.bmi = parcel.readString();
        this.measurementTime = parcel.readLong();
        this.bodyStyleText = parcel.readString();
        this.bodyAdviceText = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.weightLabelList = arrayList;
        parcel.readList(arrayList, WeightLabel.class.getClassLoader());
        this.modifiedTime = parcel.readLong();
    }
}
