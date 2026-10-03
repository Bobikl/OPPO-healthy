package com.heytap.databaseengineservice.db.table.weight;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.databaseengine.apiv3.data.Element;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.DBAssessmentRecord;
import com.oplus.aiunit.vision.dj8;
import com.oplus.aiunit.vision.k9g;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
@Entity(primaryKeys = {"ssoid", DBWeightGoal.USER_TAG_ID, "weight_id"}, tableName = "DBWeightBodyFatTable")
@Keep
public class DBWeightBodyFat extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBWeightBodyFat> CREATOR = new a();

    @ColumnInfo(name = "bind_channel")
    private int bindChannel;

    @ColumnInfo(name = Element.ELEMENT_NAME_BMI)
    private String bmi;

    @ColumnInfo(name = Element.ELEMENT_NAME_BODY_ADVICE_TEXT)
    private String bodyAdviceText;

    @ColumnInfo(name = Element.ELEMENT_NAME_BODY_STYLE_TEXT)
    private String bodyStyleText;

    @ColumnInfo(name = "deleted")
    private int deleted;

    @NonNull
    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @ColumnInfo(name = "measurement_timestamp")
    private long measurementTime;

    @ColumnInfo(name = "metadata")
    private String metadata;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTime;

    @NonNull
    @ColumnInfo(name = "old_user_tag_id")
    private String oldUserTagId;

    @ColumnInfo(name = k9g.OPEN_ID)
    private String openId;

    @ColumnInfo(name = "resistance")
    private String resistance;

    @ColumnInfo(name = dj8.KEY_SN)
    private String sn;

    @NonNull
    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "sub_account")
    private int subAccount;

    @NonNull
    @ColumnInfo(name = DBWeightGoal.USER_TAG_ID)
    private String userTagId;

    @ColumnInfo(name = "weight")
    private String weight;

    @NonNull
    @ColumnInfo(name = "weight_id")
    private String weightId;

    @ColumnInfo(name = "weight_status")
    private int weightStatus;

    public class a implements Parcelable.Creator<DBWeightBodyFat> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBWeightBodyFat createFromParcel(Parcel parcel) {
            return new DBWeightBodyFat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBWeightBodyFat[] newArray(int i) {
            return new DBWeightBodyFat[i];
        }
    }

    public DBWeightBodyFat() {
        this.ssoid = "";
        this.deviceUniqueId = "";
        this.userTagId = "";
        this.oldUserTagId = "";
        this.weightId = "";
    }

    public static String createWeightBodyFatTableSQL() {
        return "create table if not exists DBWeightBodyFatTable(ssoid TEXT not null,device_unique_id TEXT not null,sn TEXT,open_id TEXT,bind_channel INTEGER not null,measurement_timestamp INTEGER not null,resistance TEXT,sub_account INTEGER not null,user_tag_id TEXT not null,old_user_tag_id TEXT not null,deleted INTEGER not null,weight TEXT,weight_id TEXT not null,bmi TEXT,weight_status INTEGER not null,body_style_text TEXT,body_advice_text TEXT,metadata TEXT,modified_timestamp INTEGER not null,primary key(ssoid," + DBWeightGoal.USER_TAG_ID + ",weight_id))";
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

    public int getDeleted() {
        return this.deleted;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NonNull
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public long getMeasurementTime() {
        return this.measurementTime;
    }

    public String getMetadata() {
        return this.metadata;
    }

    public long getModifiedTime() {
        return this.modifiedTime;
    }

    @NonNull
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
    @NonNull
    public String getSsoid() {
        return this.ssoid;
    }

    public int getSubAccount() {
        return this.subAccount;
    }

    @NonNull
    public String getUserTagId() {
        return this.userTagId;
    }

    public String getWeight() {
        return this.weight;
    }

    @NonNull
    public String getWeightId() {
        return this.weightId;
    }

    public int getWeightStatus() {
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

    public void setDeleted(int i) {
        this.deleted = i;
    }

    public void setDeviceUniqueId(@NonNull String str) {
        this.deviceUniqueId = str;
    }

    public void setMeasurementTime(long j2) {
        this.measurementTime = j2;
    }

    public void setMetadata(String str) {
        this.metadata = str;
    }

    public void setModifiedTime(long j2) {
        this.modifiedTime = j2;
    }

    public void setOldUserTagId(@NonNull String str) {
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

    public void setSsoid(@NonNull String str) {
        this.ssoid = str;
    }

    public void setSubAccount(int i) {
        this.subAccount = i;
    }

    public void setUserTagId(@NonNull String str) {
        this.userTagId = str;
    }

    public void setWeight(String str) {
        this.weight = str;
    }

    public void setWeightId(@NonNull String str) {
        this.weightId = str;
    }

    public void setWeightStatus(int i) {
        this.weightStatus = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBWeightBodyFat{ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', sn='" + this.sn + "', openId='" + this.openId + "', bindChannel=" + this.bindChannel + ", resistance='" + this.resistance + "', measurementTimestamp=" + this.measurementTime + ", subAccount=" + this.subAccount + ", userTagId='" + this.userTagId + "', oldUserTagId='" + this.oldUserTagId + "', deleted=" + this.deleted + ", weight='" + this.weight + "', weightId='" + this.weightId + "', bmi='" + this.bmi + "', weightStatus=" + this.weightStatus + ", bodyStyleText='" + this.bodyStyleText + "', bodyAdviceText='" + this.bodyAdviceText + "', metadata='" + this.metadata + "', modifiedTimestamp=" + this.modifiedTime + "} ";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeString(this.sn);
        parcel.writeString(this.openId);
        parcel.writeInt(this.bindChannel);
        parcel.writeString(this.resistance);
        parcel.writeLong(this.measurementTime);
        parcel.writeInt(this.subAccount);
        parcel.writeString(this.userTagId);
        parcel.writeString(this.oldUserTagId);
        parcel.writeInt(this.deleted);
        parcel.writeString(this.weight);
        parcel.writeString(this.weightId);
        parcel.writeString(this.bmi);
        parcel.writeInt(this.weightStatus);
        parcel.writeString(this.bodyStyleText);
        parcel.writeString(this.bodyAdviceText);
        parcel.writeString(this.metadata);
        parcel.writeLong(this.modifiedTime);
    }

    public DBWeightBodyFat(Parcel parcel) {
        this.ssoid = "";
        this.deviceUniqueId = "";
        this.userTagId = "";
        this.oldUserTagId = "";
        this.weightId = "";
        String string = parcel.readString();
        Objects.requireNonNull(string);
        this.ssoid = string;
        String string2 = parcel.readString();
        Objects.requireNonNull(string2);
        this.deviceUniqueId = string2;
        this.sn = parcel.readString();
        this.openId = parcel.readString();
        this.bindChannel = parcel.readInt();
        this.resistance = parcel.readString();
        this.measurementTime = parcel.readLong();
        this.subAccount = parcel.readInt();
        String string3 = parcel.readString();
        Objects.requireNonNull(string3);
        this.userTagId = string3;
        String string4 = parcel.readString();
        Objects.requireNonNull(string4);
        this.oldUserTagId = string4;
        this.deleted = parcel.readInt();
        this.weight = parcel.readString();
        String string5 = parcel.readString();
        Objects.requireNonNull(string5);
        this.weightId = string5;
        this.bmi = parcel.readString();
        this.weightStatus = parcel.readInt();
        this.bodyStyleText = parcel.readString();
        this.bodyAdviceText = parcel.readString();
        this.metadata = parcel.readString();
        this.modifiedTime = parcel.readLong();
    }
}
