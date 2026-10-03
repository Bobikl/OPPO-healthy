package com.heytap.databaseengineservice.db.table.relax;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import com.heytap.databaseengine.apiv3.data.Element;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.DBAssessmentRecord;
import com.heytap.databaseengineservice.db.table.newsleep.DBSleepHeartRateStat;
import com.heytap.databaseengineservice.db.table.phycialmental.DBPhysicalMentalAchievement;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
@Entity(primaryKeys = {"ssoid", DBAssessmentRecord.DEVICE_UNIQUE_ID, "start_timestamp"}, tableName = "DBRelax")
@Keep
public class DBRelax extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBRelax> CREATOR = new a();

    @ColumnInfo(name = DBSportMetadata.CLIENT_DATA_ID)
    private String clientDataId;

    @Ignore
    private int del;

    @NonNull
    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @ColumnInfo(name = "display")
    private int display;

    @ColumnInfo(name = DBSportMetadata.EXTENSION)
    private String extension;

    @ColumnInfo(name = "hr_detail")
    private String heartRateDetail;

    @ColumnInfo(name = DBSleepHeartRateStat.MAX_HEART_RATE)
    private int maxHeartRate;

    @ColumnInfo(name = DBSleepHeartRateStat.MIN_HEART_RATE)
    private int minHeartRate;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "physical_mental")
    private Integer physicalMental;

    @ColumnInfo(name = "physical_mental_state")
    private Integer physicalMentalState;

    @ColumnInfo(name = DBPhysicalMentalAchievement.RELAX_DURATION)
    private int relaxDuration;

    @NonNull
    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "start_timestamp")
    private long startTimestamp;

    @ColumnInfo(name = "stress_value")
    private int stressValue;

    @ColumnInfo(name = Element.ELEMENT_NAME_SUB_TYPE)
    private int subType;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "type")
    private int type;

    @ColumnInfo(name = "updated")
    private int updated;

    @ColumnInfo(name = "version")
    private int version;

    public class a implements Parcelable.Creator<DBRelax> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBRelax createFromParcel(Parcel parcel) {
            return new DBRelax(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBRelax[] newArray(int i) {
            return new DBRelax[i];
        }
    }

    public DBRelax() {
        this.ssoid = "";
        this.deviceUniqueId = "";
    }

    public static String createRelaxTableSQL() {
        return "create table if not exists DBRelax(ssoid TEXT not null,client_data_id TEXT,device_unique_id TEXT not null,start_timestamp INTEGER not null,relax_duration INTEGER not null,max_hr INTEGER not null,min_hr INTEGER not null,stress_value INTEGER not null,type INTEGER not null,sub_type INTEGER not null,hr_detail TEXT,version INTEGER not null,extension TEXT,display INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,updated INTEGER not null,primary key(ssoid," + DBAssessmentRecord.DEVICE_UNIQUE_ID + ",start_timestamp))";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getClientDataId() {
        return this.clientDataId;
    }

    public int getDel() {
        return this.del;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NonNull
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public int getDisplay() {
        return this.display;
    }

    public String getExtension() {
        return this.extension;
    }

    public String getHeartRateDetail() {
        return this.heartRateDetail;
    }

    public int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public int getMinHeartRate() {
        return this.minHeartRate;
    }

    public long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public Integer getPhysicalMental() {
        return this.physicalMental;
    }

    public Integer getPhysicalMentalState() {
        return this.physicalMentalState;
    }

    public int getRelaxDuration() {
        return this.relaxDuration;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NonNull
    public String getSsoid() {
        return this.ssoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    public int getStressValue() {
        return this.stressValue;
    }

    public int getSubType() {
        return this.subType;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public int getType() {
        return this.type;
    }

    public int getUpdated() {
        return this.updated;
    }

    public int getVersion() {
        return this.version;
    }

    public void setClientDataId(String str) {
        this.clientDataId = str;
    }

    public void setDel(int i) {
        this.del = i;
    }

    public void setDeviceUniqueId(@NonNull String str) {
        this.deviceUniqueId = str;
    }

    public void setDisplay(int i) {
        this.display = i;
    }

    public void setExtension(String str) {
        this.extension = str;
    }

    public void setHeartRateDetail(String str) {
        this.heartRateDetail = str;
    }

    public void setMaxHeartRate(int i) {
        this.maxHeartRate = i;
    }

    public void setMinHeartRate(int i) {
        this.minHeartRate = i;
    }

    public void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public void setPhysicalMental(Integer num) {
        this.physicalMental = num;
    }

    public void setPhysicalMentalState(Integer num) {
        this.physicalMentalState = num;
    }

    public void setRelaxDuration(int i) {
        this.relaxDuration = i;
    }

    public void setSsoid(@NonNull String str) {
        this.ssoid = str;
    }

    public void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    public void setStressValue(int i) {
        this.stressValue = i;
    }

    public void setSubType(int i) {
        this.subType = i;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUpdated(int i) {
        this.updated = i;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBRelax{clientDataId='" + this.clientDataId + "', ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', startTimestamp=" + this.startTimestamp + ", relaxDuration=" + this.relaxDuration + ", maxHeartRate=" + this.maxHeartRate + ", minHeartRate=" + this.minHeartRate + ", stressValue=" + this.stressValue + ", physicalMental=" + this.physicalMental + ", physicalMentalState=" + this.physicalMentalState + ", type=" + this.type + ", subType=" + this.subType + ", heartRateDetail='" + this.heartRateDetail + "', version=" + this.version + ", extension='" + this.extension + "', display=" + this.display + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ", updated=" + this.updated + ", del=" + this.del + "} ";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.clientDataId);
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeLong(this.startTimestamp);
        parcel.writeInt(this.relaxDuration);
        parcel.writeInt(this.maxHeartRate);
        parcel.writeInt(this.minHeartRate);
        parcel.writeInt(this.stressValue);
        parcel.writeValue(this.physicalMental);
        parcel.writeValue(this.physicalMentalState);
        parcel.writeInt(this.type);
        parcel.writeInt(this.subType);
        parcel.writeString(this.heartRateDetail);
        parcel.writeInt(this.version);
        parcel.writeString(this.extension);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
        parcel.writeInt(this.updated);
        parcel.writeInt(this.del);
    }

    public DBRelax(Parcel parcel) {
        this.ssoid = "";
        this.deviceUniqueId = "";
        this.clientDataId = parcel.readString();
        String string = parcel.readString();
        Objects.requireNonNull(string);
        this.ssoid = string;
        String string2 = parcel.readString();
        Objects.requireNonNull(string2);
        this.deviceUniqueId = string2;
        this.startTimestamp = parcel.readLong();
        this.relaxDuration = parcel.readInt();
        this.maxHeartRate = parcel.readInt();
        this.minHeartRate = parcel.readInt();
        this.stressValue = parcel.readInt();
        this.physicalMental = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.physicalMentalState = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.type = parcel.readInt();
        this.subType = parcel.readInt();
        this.heartRateDetail = parcel.readString();
        this.version = parcel.readInt();
        this.extension = parcel.readString();
        this.display = parcel.readInt();
        this.syncStatus = parcel.readInt();
        this.modifiedTimestamp = parcel.readLong();
        this.updated = parcel.readInt();
        this.del = parcel.readInt();
    }
}
