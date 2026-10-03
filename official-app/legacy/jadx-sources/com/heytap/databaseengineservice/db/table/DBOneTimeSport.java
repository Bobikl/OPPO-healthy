package com.heytap.databaseengineservice.db.table;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import com.heytap.databaseengine.apiv3.data.Element;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;

/* JADX INFO: loaded from: classes15.dex */
@Entity(tableName = DBOneTimeSport.TABLE_NAME)
@Keep
public class DBOneTimeSport extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBOneTimeSport> CREATOR = new a();
    public static final String TABLE_NAME = "DBOneTimeSport";

    @ColumnInfo(name = DBSportMetadata.CLIENT_DATA_ID)
    private String clientDataId;

    @Ignore
    private ContentValues contentValues;

    @ColumnInfo(name = "data")
    private String data;

    @Ignore
    private int del;

    @ColumnInfo(name = Element.ELEMENT_NAME_DEVICE_CATEGORY)
    private String deviceType;

    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @ColumnInfo(name = "display")
    private int display;

    @ColumnInfo(name = "end_time")
    private long endTimestamp;

    @ColumnInfo(name = "included_rhr")
    private int includedRHR;

    @ColumnInfo(name = "meta_data")
    private String metaData;

    @ColumnInfo(name = "modified_time")
    private long modifiedTime;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    private long oneTimeSportId;

    @ColumnInfo(name = "app_source")
    private int source;

    @ColumnInfo(name = "sport_mode")
    private int sportMode;

    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "start_time")
    private long startTimestamp;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "timezone")
    private String timezone;

    @ColumnInfo(name = "updated")
    private int updated;

    @ColumnInfo(name = "data_version")
    private int version;

    public class a implements Parcelable.Creator<DBOneTimeSport> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBOneTimeSport createFromParcel(Parcel parcel) {
            return new DBOneTimeSport(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBOneTimeSport[] newArray(int i) {
            return new DBOneTimeSport[i];
        }
    }

    public DBOneTimeSport() {
        this.contentValues = new ContentValues();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean getBoolean(String str) {
        Boolean asBoolean = this.contentValues.getAsBoolean(str);
        if (asBoolean == null) {
            return false;
        }
        return asBoolean.booleanValue();
    }

    public String getClientDataId() {
        return this.clientDataId;
    }

    public String getData() {
        return this.data;
    }

    public int getDel() {
        return this.del;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public int getDisplay() {
        return this.display;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return this.endTimestamp;
    }

    public int getIncludedRHR() {
        return this.includedRHR;
    }

    public String getMetaData() {
        return this.metaData;
    }

    public long getModifiedTime() {
        return this.modifiedTime;
    }

    public long getOneTimeSportId() {
        return this.oneTimeSportId;
    }

    public int getSource() {
        return this.source;
    }

    public int getSportMode() {
        return this.sportMode;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public int getUpdated() {
        return this.updated;
    }

    public int getVersion() {
        return this.version;
    }

    public void putBoolean(String str, boolean z) {
        this.contentValues.put(str, Boolean.valueOf(z));
    }

    public void setClientDataId(String str) {
        this.clientDataId = str;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setDel(int i) {
        this.del = i;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setDisplay(int i) {
        this.display = i;
    }

    public void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public void setIncludedRHR(int i) {
        this.includedRHR = i;
    }

    public void setMetaData(String str) {
        this.metaData = str;
    }

    public void setModifiedTime(long j2) {
        this.modifiedTime = j2;
    }

    public void setOneTimeSportId(long j2) {
        this.oneTimeSportId = j2;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public void setSportMode(int i) {
        this.sportMode = i;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setTimezone(String str) {
        this.timezone = str;
    }

    public void setUpdated(int i) {
        this.updated = i;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBOneTimeSport{oneTimeSportId=" + this.oneTimeSportId + ", clientDataId='" + this.clientDataId + "', ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', deviceCategory='" + this.deviceType + "', startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", sportMode=" + this.sportMode + ", source=" + this.source + ", data='" + this.data + "', version='" + this.version + ", metaData='" + this.metaData + "', display=" + this.display + ", syncStatus=" + this.syncStatus + ", timezone='" + this.timezone + "', contentValues=" + this.contentValues + ", modifiedTime=" + this.modifiedTime + ", updated=" + this.updated + ", includedRHR=" + this.includedRHR + ", del=" + this.del + "} ";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.clientDataId);
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeString(this.deviceType);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeInt(this.sportMode);
        parcel.writeInt(this.source);
        parcel.writeString(this.data);
        parcel.writeInt(this.version);
        parcel.writeString(this.metaData);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
        parcel.writeString(this.timezone);
        parcel.writeLong(this.modifiedTime);
        parcel.writeInt(this.updated);
        parcel.writeInt(this.includedRHR);
        parcel.writeInt(this.del);
        parcel.writeParcelable(this.contentValues, i);
    }

    public DBOneTimeSport(Parcel parcel) {
        this.clientDataId = parcel.readString();
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.deviceType = parcel.readString();
        this.startTimestamp = parcel.readLong();
        this.endTimestamp = parcel.readLong();
        this.sportMode = parcel.readInt();
        this.source = parcel.readInt();
        this.data = parcel.readString();
        this.version = parcel.readInt();
        this.metaData = parcel.readString();
        this.display = parcel.readInt();
        this.syncStatus = parcel.readInt();
        this.timezone = parcel.readString();
        this.modifiedTime = parcel.readLong();
        this.updated = parcel.readInt();
        this.includedRHR = parcel.readInt();
        this.del = parcel.readInt();
        this.contentValues = (ContentValues) parcel.readParcelable(ContentValues.class.getClassLoader());
    }
}
