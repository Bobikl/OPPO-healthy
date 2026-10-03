package com.heytap.databaseengine.model.weight;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class FamilyMemberInfo extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<FamilyMemberInfo> CREATOR = new a();
    private String avatar;
    private String birthday;
    private long createTimestamp;
    private String height;
    private int lastWight;
    private long modifiedTimestamp;
    private String sex;
    private String ssoid;
    private int subAccount;
    private String userName;
    private String userTagId;

    public class a implements Parcelable.Creator<FamilyMemberInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FamilyMemberInfo createFromParcel(Parcel parcel) {
            return new FamilyMemberInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FamilyMemberInfo[] newArray(int i) {
            return new FamilyMemberInfo[i];
        }
    }

    public FamilyMemberInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public String getHeight() {
        return this.height;
    }

    public int getLastWight() {
        return this.lastWight;
    }

    public long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public String getSex() {
        return this.sex;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    public int getSubAccount() {
        return this.subAccount;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getUserTagId() {
        return this.userTagId;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setBirthday(String str) {
        this.birthday = str;
    }

    public void setCreateTimestamp(long j2) {
        this.createTimestamp = j2;
    }

    public void setHeight(String str) {
        this.height = str;
    }

    public void setLastWight(int i) {
        this.lastWight = i;
    }

    public void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public void setSex(String str) {
        this.sex = str;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setSubAccount(int i) {
        this.subAccount = i;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public void setUserTagId(String str) {
        this.userTagId = str;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "FamilyMemberInfo{ssoid='" + this.ssoid + "', userName='" + this.userName + "', subAccount=" + this.subAccount + ", userTagId='" + this.userTagId + "', sex='" + this.sex + "', height='" + this.height + "', birthday='" + this.birthday + "', avatar='" + this.avatar + "', lastWight=" + this.lastWight + ", createTimestamp=" + this.createTimestamp + ", modifiedTimestamp=" + this.modifiedTimestamp + "} ";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.userName);
        parcel.writeInt(this.subAccount);
        parcel.writeString(this.userTagId);
        parcel.writeString(this.sex);
        parcel.writeString(this.height);
        parcel.writeString(this.birthday);
        parcel.writeString(this.avatar);
        parcel.writeInt(this.lastWight);
        parcel.writeLong(this.createTimestamp);
        parcel.writeLong(this.modifiedTimestamp);
    }

    public FamilyMemberInfo(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.userName = parcel.readString();
        this.subAccount = parcel.readInt();
        this.userTagId = parcel.readString();
        this.sex = parcel.readString();
        this.height = parcel.readString();
        this.birthday = parcel.readString();
        this.avatar = parcel.readString();
        this.lastWight = parcel.readInt();
        this.createTimestamp = parcel.readLong();
        this.modifiedTimestamp = parcel.readLong();
    }
}
