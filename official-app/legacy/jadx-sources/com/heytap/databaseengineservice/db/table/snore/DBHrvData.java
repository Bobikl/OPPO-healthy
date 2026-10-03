package com.heytap.databaseengineservice.db.table.snore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.DBAssessmentRecord;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Entity(primaryKeys = {"ssoid", DBAssessmentRecord.DEVICE_UNIQUE_ID, "start_timestamp", "hrv_type"}, tableName = "DBHrvTable")
@Keep
public class DBHrvData extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBHrvData> CREATOR = new a();

    @ColumnInfo(name = DBSportMetadata.CLIENT_DATA_ID)
    private String clientDataId;

    @NonNull
    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @ColumnInfo(name = "display")
    private int display;

    @ColumnInfo(name = "end_timestamp")
    private long endTimestamp;

    @ColumnInfo(name = "hrv_type")
    private int hrvType;

    @ColumnInfo(name = "hrv_value")
    private int hrvValue;

    @ColumnInfo(name = "metadata")
    private String metadata;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @NonNull
    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "start_timestamp")
    private long startTimestamp;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "updated")
    private int updated;

    public class a implements Parcelable.Creator<DBHrvData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBHrvData createFromParcel(Parcel parcel) {
            return new DBHrvData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBHrvData[] newArray(int i) {
            return new DBHrvData[i];
        }
    }

    public DBHrvData() {
        this.ssoid = "";
        this.deviceUniqueId = "";
    }

    public static String createHrvTableSQL() {
        return "create table if not exists DBHrvTable(client_data_id TEXT,ssoid TEXT not null,device_unique_id TEXT not null,start_timestamp INTEGER not null,end_timestamp INTEGER not null,hrv_type INTEGER not null,hrv_value INTEGER not null,metadata TEXT,display INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,updated INTEGER not null,primary key(ssoid," + DBAssessmentRecord.DEVICE_UNIQUE_ID + ",start_timestamp,hrv_type))";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getClientDataId() {
        return this.clientDataId;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
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

    public int getHrvType() {
        return this.hrvType;
    }

    public int getHrvValue() {
        return this.hrvValue;
    }

    public String getMetadata() {
        return this.metadata;
    }

    public long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
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

    public int getUpdated() {
        return this.updated;
    }

    public void setClientDataId(String str) {
        this.clientDataId = str;
    }

    public void setDeviceUniqueId(@NotNull String str) {
        this.deviceUniqueId = str;
    }

    public void setDisplay(int i) {
        this.display = i;
    }

    public void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public void setHrvType(int i) {
        this.hrvType = i;
    }

    public void setHrvValue(int i) {
        this.hrvValue = i;
    }

    public void setMetadata(String str) {
        this.metadata = str;
    }

    public void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public void setSsoid(@NotNull String str) {
        this.ssoid = str;
    }

    public void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setUpdated(int i) {
        this.updated = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBSleep{clientDataId='" + this.clientDataId + "', ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", hrvType=" + this.hrvType + ", hrvValue=" + this.hrvValue + ", metadata='" + this.metadata + "', display=" + this.display + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ", updated=" + this.updated + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.clientDataId);
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeInt(this.hrvType);
        parcel.writeInt(this.hrvValue);
        parcel.writeString(this.metadata);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
        parcel.writeInt(this.updated);
    }

    public DBHrvData(Parcel parcel) {
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
        this.endTimestamp = parcel.readLong();
        this.hrvType = parcel.readInt();
        this.hrvValue = parcel.readInt();
        this.metadata = parcel.readString();
        this.display = parcel.readInt();
        this.syncStatus = parcel.readInt();
        this.modifiedTimestamp = parcel.readLong();
        this.updated = parcel.readInt();
    }
}
