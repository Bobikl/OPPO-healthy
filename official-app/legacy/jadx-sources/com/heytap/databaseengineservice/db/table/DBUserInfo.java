package com.heytap.databaseengineservice.db.table;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthArchiveRecord;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.h27;

/* JADX INFO: loaded from: classes15.dex */
@Entity(tableName = "DBUserInfo")
@Keep
public class DBUserInfo implements Parcelable {
    public static final Parcelable.Creator<DBUserInfo> CREATOR = new a();

    @ColumnInfo(name = "account_name")
    private String accountName;

    @ColumnInfo(defaultValue = "0", name = DBHealthArchiveRecord.AGE)
    private int age;

    @ColumnInfo(name = h27.FAMILY_KEY_PUSH_FRIEND_AVATAR)
    private String avatar;

    @ColumnInfo(name = "birthday")
    private String birthday;

    @ColumnInfo(defaultValue = "0", name = "bloodPressureType")
    private int bloodPressureType;

    @ColumnInfo(name = "country")
    private String country;

    @ColumnInfo(name = "create_time")
    private long createTime;

    @ColumnInfo(name = "guide_status")
    private int guideStatus;

    @ColumnInfo(name = Fields.HEIGHT_FIELD)
    private String height;

    @ColumnInfo(name = "modified_time")
    private long modifiedTime;

    @ColumnInfo(name = "sex")
    private String sex;

    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "status")
    private String status;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "upload_avatar")
    private boolean uploadAvatar;

    @ColumnInfo(name = "user_id")
    private String userId;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    private long userInfoId;

    @ColumnInfo(name = "user_name")
    private String userName;

    @ColumnInfo(name = "user_name_need_modify")
    private boolean userNameNeedModify;

    @ColumnInfo(name = "weight")
    private String weight;

    public class a implements Parcelable.Creator<DBUserInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBUserInfo createFromParcel(Parcel parcel) {
            return new DBUserInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBUserInfo[] newArray(int i) {
            return new DBUserInfo[i];
        }
    }

    public DBUserInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public int getAge() {
        return this.age;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public int getBloodPressureType() {
        return this.bloodPressureType;
    }

    public String getCountry() {
        return this.country;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public int getGuideStatus() {
        return this.guideStatus;
    }

    public String getHeight() {
        return this.height;
    }

    public long getModifiedTime() {
        return this.modifiedTime;
    }

    public String getSex() {
        return this.sex;
    }

    public String getSsoid() {
        return this.ssoid;
    }

    public String getStatus() {
        return this.status;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public String getUserId() {
        return this.userId;
    }

    public long getUserInfoId() {
        return this.userInfoId;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getWeight() {
        return this.weight;
    }

    public boolean isUploadAvatar() {
        return this.uploadAvatar;
    }

    public boolean isUserNameNeedModify() {
        return this.userNameNeedModify;
    }

    public void setAccountName(String str) {
        this.accountName = str;
    }

    public void setAge(int i) {
        this.age = i;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setBirthday(String str) {
        this.birthday = str;
    }

    public void setBloodPressureType(int i) {
        this.bloodPressureType = i;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setCreateTime(long j2) {
        this.createTime = j2;
    }

    public void setGuideStatus(int i) {
        this.guideStatus = i;
    }

    public void setHeight(String str) {
        this.height = str;
    }

    public void setModifiedTime(long j2) {
        this.modifiedTime = j2;
    }

    public void setSex(String str) {
        this.sex = str;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setUploadAvatar(boolean z) {
        this.uploadAvatar = z;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public void setUserInfoId(long j2) {
        this.userInfoId = j2;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public void setUserNameNeedModify(boolean z) {
        this.userNameNeedModify = z;
    }

    public void setWeight(String str) {
        this.weight = str;
    }

    public String toString() {
        return "DBUserInfo{userInfoId=" + this.userInfoId + ", birthday='" + this.birthday + "', sex='" + this.sex + "', height=" + this.height + "', weight=" + this.weight + "', createTime=" + this.createTime + ", syncStatus=" + this.syncStatus + ", modifiedTime=" + this.modifiedTime + ", guideStatus=" + this.guideStatus + ", age=" + this.age + ", bloodPressureType=" + this.bloodPressureType + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.userId);
        parcel.writeString(this.userName);
        parcel.writeString(this.accountName);
        parcel.writeByte(this.userNameNeedModify ? (byte) 1 : (byte) 0);
        parcel.writeString(this.country);
        parcel.writeString(this.status);
        parcel.writeString(this.birthday);
        parcel.writeString(this.sex);
        parcel.writeByte(this.uploadAvatar ? (byte) 1 : (byte) 0);
        parcel.writeString(this.avatar);
        parcel.writeString(this.height);
        parcel.writeString(this.weight);
        parcel.writeLong(this.createTime);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTime);
        parcel.writeInt(this.guideStatus);
        parcel.writeInt(this.age);
        parcel.writeInt(this.bloodPressureType);
    }

    public DBUserInfo(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.userId = parcel.readString();
        this.userName = parcel.readString();
        this.accountName = parcel.readString();
        this.userNameNeedModify = parcel.readByte() != 0;
        this.country = parcel.readString();
        this.status = parcel.readString();
        this.birthday = parcel.readString();
        this.sex = parcel.readString();
        this.uploadAvatar = parcel.readByte() != 0;
        this.avatar = parcel.readString();
        this.height = parcel.readString();
        this.weight = parcel.readString();
        this.createTime = parcel.readLong();
        this.syncStatus = parcel.readInt();
        this.modifiedTime = parcel.readLong();
        this.guideStatus = parcel.readInt();
        this.age = parcel.readInt();
        this.bloodPressureType = parcel.readInt();
    }
}
