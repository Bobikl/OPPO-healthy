package com.heytap.databaseengineservice.db.table.atrialfibril;

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
@Entity(primaryKeys = {"ssoid", DBAssessmentRecord.DEVICE_UNIQUE_ID, "data_created_timestamp", "warn_flag"}, tableName = "DBAtrialFibrilDetail")
@Keep
public class DBAtrialFibrilDetail extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBAtrialFibrilDetail> CREATOR = new a();

    @ColumnInfo(name = "atrial_fibril_status")
    private int atrialFibrilStatus;

    @ColumnInfo(name = DBSportMetadata.CLIENT_DATA_ID)
    private String clientDataId;

    @ColumnInfo(name = "data_created_timestamp")
    private long dataCreatedTimestamp;

    @NonNull
    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @ColumnInfo(name = "display")
    private int display;

    @ColumnInfo(name = "metadata")
    private String metadata;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "reliability")
    private int reliability;

    @NonNull
    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "updated")
    private int updated;

    @ColumnInfo(name = "warn_flag")
    private int warnFlag;

    public class a implements Parcelable.Creator<DBAtrialFibrilDetail> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBAtrialFibrilDetail createFromParcel(Parcel parcel) {
            return new DBAtrialFibrilDetail(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBAtrialFibrilDetail[] newArray(int i) {
            return new DBAtrialFibrilDetail[i];
        }
    }

    public DBAtrialFibrilDetail() {
        this.ssoid = "";
        this.deviceUniqueId = "";
    }

    public static String createAtrialFibrilTableSQL() {
        return "create table if not exists DBAtrialFibrilDetail(client_data_id TEXT,ssoid TEXT not null,device_unique_id TEXT not null,data_created_timestamp INTEGER not null,atrial_fibril_status INTEGER not null,reliability INTEGER not null,warn_flag INTEGER not null,metadata TEXT,display INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,updated INTEGER not null,primary key(ssoid," + DBAssessmentRecord.DEVICE_UNIQUE_ID + ",data_created_timestamp,warn_flag))";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAtrialFibrilStatus() {
        return this.atrialFibrilStatus;
    }

    public String getClientDataId() {
        return this.clientDataId;
    }

    public long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public int getDisplay() {
        return this.display;
    }

    public String getMetadata() {
        return this.metadata;
    }

    public long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public int getReliability() {
        return this.reliability;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public int getUpdated() {
        return this.updated;
    }

    public int getWarnFlag() {
        return this.warnFlag;
    }

    public void setAtrialFibrilStatus(int i) {
        this.atrialFibrilStatus = i;
    }

    public void setClientDataId(String str) {
        this.clientDataId = str;
    }

    public void setDataCreatedTimestamp(long j2) {
        this.dataCreatedTimestamp = j2;
    }

    public void setDeviceUniqueId(@NotNull String str) {
        this.deviceUniqueId = str;
    }

    public void setDisplay(int i) {
        this.display = i;
    }

    public void setMetadata(String str) {
        this.metadata = str;
    }

    public void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public void setReliability(int i) {
        this.reliability = i;
    }

    public void setSsoid(@NotNull String str) {
        this.ssoid = str;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setUpdated(int i) {
        this.updated = i;
    }

    public void setWarnFlag(int i) {
        this.warnFlag = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBAtrialFibrilDetail{clientDataId='" + this.clientDataId + "', ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', dataCreatedTimestamp=" + this.dataCreatedTimestamp + ", atrialFibrilStatus=" + this.atrialFibrilStatus + ", reliability=" + this.reliability + ", warnFlag=" + this.warnFlag + ", metadata='" + this.metadata + "', display=" + this.display + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ", updated=" + this.updated + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.clientDataId);
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeLong(this.dataCreatedTimestamp);
        parcel.writeInt(this.atrialFibrilStatus);
        parcel.writeInt(this.reliability);
        parcel.writeInt(this.warnFlag);
        parcel.writeString(this.metadata);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
        parcel.writeInt(this.updated);
    }

    public DBAtrialFibrilDetail(Parcel parcel) {
        this.ssoid = "";
        this.deviceUniqueId = "";
        this.clientDataId = parcel.readString();
        String string = parcel.readString();
        Objects.requireNonNull(string);
        this.ssoid = string;
        String string2 = parcel.readString();
        Objects.requireNonNull(string2);
        this.deviceUniqueId = string2;
        this.dataCreatedTimestamp = parcel.readLong();
        this.atrialFibrilStatus = parcel.readInt();
        this.reliability = parcel.readInt();
        this.warnFlag = parcel.readInt();
        this.metadata = parcel.readString();
        this.display = parcel.readInt();
        this.syncStatus = parcel.readInt();
        this.modifiedTimestamp = parcel.readLong();
        this.updated = parcel.readInt();
    }
}
