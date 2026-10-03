package com.heytap.databaseengineservice.db.table;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.heytap.databaseengine.apiv3.data.Element;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;

/* JADX INFO: loaded from: classes15.dex */
@Entity(tableName = DBTrackTemp.TABLE_NAME)
@Keep
public class DBTrackTemp extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBTrackTemp> CREATOR = new a();
    public static final String TABLE_NAME = "DBTrackTemp";

    @ColumnInfo(name = DBSportMetadata.CLIENT_DATA_ID)
    private String clientDataId;

    @ColumnInfo(name = "data")
    private String data;

    @ColumnInfo(name = Element.ELEMENT_NAME_DEVICE_CATEGORY)
    private String deviceType;

    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @ColumnInfo(name = "display")
    private int display;

    @ColumnInfo(name = "end_time")
    private long endTimestamp;

    @ColumnInfo(name = "meta_data")
    private String metaData;

    @ColumnInfo(name = "modified_time")
    private long modifiedTime;

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

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    private long trackId;

    @ColumnInfo(name = "updated")
    private int updated;

    @ColumnInfo(name = "data_version")
    private int version;

    public class a implements Parcelable.Creator<DBTrackTemp> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBTrackTemp createFromParcel(Parcel parcel) {
            return new DBTrackTemp(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBTrackTemp[] newArray(int i) {
            return new DBTrackTemp[i];
        }
    }

    public DBTrackTemp() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getClientDataId() {
        return this.clientDataId;
    }

    public String getData() {
        return this.data;
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

    public String getMetaData() {
        return this.metaData;
    }

    public long getModifiedTime() {
        return this.modifiedTime;
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

    public long getTrackId() {
        return this.trackId;
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

    public void setData(String str) {
        this.data = str;
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

    public void setMetaData(String str) {
        this.metaData = str;
    }

    public void setModifiedTime(long j2) {
        this.modifiedTime = j2;
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

    public void setTrackId(long j2) {
        this.trackId = j2;
    }

    public void setUpdated(int i) {
        this.updated = i;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBSportTrack{trackId=" + this.trackId + ", clientDataId='" + this.clientDataId + "', ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', deviceCategory='" + this.deviceType + "', startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", sportMode=" + this.sportMode + ", data='" + this.data + "', version='" + this.version + ", metaData='" + this.metaData + "', display=" + this.display + ", syncStatus=" + this.syncStatus + ", timezone='" + this.timezone + "', modifiedTime=" + this.modifiedTime + ", updated=" + this.updated + "} ";
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
        parcel.writeString(this.data);
        parcel.writeInt(this.version);
        parcel.writeString(this.metaData);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
        parcel.writeString(this.timezone);
        parcel.writeLong(this.modifiedTime);
        parcel.writeInt(this.updated);
    }

    public DBTrackTemp(Parcel parcel) {
        this.clientDataId = parcel.readString();
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.deviceType = parcel.readString();
        this.startTimestamp = parcel.readLong();
        this.endTimestamp = parcel.readLong();
        this.sportMode = parcel.readInt();
        this.data = parcel.readString();
        this.version = parcel.readInt();
        this.metaData = parcel.readString();
        this.display = parcel.readInt();
        this.syncStatus = parcel.readInt();
        this.timezone = parcel.readString();
        this.modifiedTime = parcel.readLong();
        this.updated = parcel.readInt();
    }
}
