package com.heytap.databaseengineservice.db.table.weight;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.h27;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
@Entity(primaryKeys = {"ssoid", DBWeightGoal.USER_TAG_ID}, tableName = "DBFamilyMemberInfoTable")
@Keep
public class DBFamilyMemberInfo extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBFamilyMemberInfo> CREATOR = new a();

    @ColumnInfo(name = h27.FAMILY_KEY_PUSH_FRIEND_AVATAR)
    private String avatar;

    @ColumnInfo(name = "birthday")
    private String birthday;

    @ColumnInfo(name = "created_timestamp")
    private long createTimestamp;

    @ColumnInfo(name = "deleted")
    private int deleted;

    @ColumnInfo(name = Fields.HEIGHT_FIELD)
    private String height;

    @ColumnInfo(name = "last_weight")
    private int lastWeight;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "sex")
    private String sex;

    @NonNull
    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "sub_account")
    private int subAccount;

    @ColumnInfo(name = "user_name")
    private String userName;

    @NonNull
    @ColumnInfo(name = DBWeightGoal.USER_TAG_ID)
    private String userTagId;

    public class a implements Parcelable.Creator<DBFamilyMemberInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBFamilyMemberInfo createFromParcel(Parcel parcel) {
            return new DBFamilyMemberInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBFamilyMemberInfo[] newArray(int i) {
            return new DBFamilyMemberInfo[i];
        }
    }

    public DBFamilyMemberInfo() {
        this.ssoid = "";
        this.userName = "";
        this.userTagId = "";
    }

    public static String createFamilyMemberInfoTableSQL() {
        return "create table if not exists DBFamilyMemberInfoTable(ssoid TEXT not null,user_name TEXT,sub_account INTEGER not null,user_tag_id TEXT not null,deleted INTEGER not null,sex TEXT,height TEXT,birthday TEXT,avatar TEXT,last_weight INTEGER not null,created_timestamp INTEGER not null,modified_timestamp INTEGER not null,primary key(ssoid," + DBWeightGoal.USER_TAG_ID + "))";
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

    public int getDeleted() {
        return this.deleted;
    }

    public String getHeight() {
        return this.height;
    }

    public int getLastWeight() {
        return this.lastWeight;
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

    public void setDeleted(int i) {
        this.deleted = i;
    }

    public void setHeight(String str) {
        this.height = str;
    }

    public void setLastWeight(int i) {
        this.lastWeight = i;
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
        return "DBFamilyMemberInfo{  userName='" + this.userName + "', subAccount=" + this.subAccount + ", userTagId='" + this.userTagId + "', sex='" + this.sex + "', deleted=" + this.deleted + ", height'=" + this.height + "', birthday='" + this.birthday + "', avatar='" + this.avatar + "', lastWeight=" + this.lastWeight + ", createTimestamp=" + this.createTimestamp + ", modifiedTimestamp=" + this.modifiedTimestamp + "} ";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.userName);
        parcel.writeInt(this.subAccount);
        parcel.writeString(this.userTagId);
        parcel.writeInt(this.deleted);
        parcel.writeString(this.sex);
        parcel.writeString(this.height);
        parcel.writeString(this.birthday);
        parcel.writeString(this.avatar);
        parcel.writeInt(this.lastWeight);
        parcel.writeLong(this.createTimestamp);
        parcel.writeLong(this.modifiedTimestamp);
    }

    public DBFamilyMemberInfo(Parcel parcel) {
        this.ssoid = "";
        this.userName = "";
        this.userTagId = "";
        String string = parcel.readString();
        Objects.requireNonNull(string);
        this.ssoid = string;
        this.userName = parcel.readString();
        this.subAccount = parcel.readInt();
        String string2 = parcel.readString();
        Objects.requireNonNull(string2);
        this.userTagId = string2;
        this.deleted = parcel.readInt();
        this.sex = parcel.readString();
        this.height = parcel.readString();
        this.birthday = parcel.readString();
        this.avatar = parcel.readString();
        this.lastWeight = parcel.readInt();
        this.createTimestamp = parcel.readLong();
        this.modifiedTimestamp = parcel.readLong();
    }
}
