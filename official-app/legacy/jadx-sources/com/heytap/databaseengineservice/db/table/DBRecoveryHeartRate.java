package com.heytap.databaseengineservice.db.table;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.databaseengine.apiv3.data.Element;
import com.heytap.databaseengine.model.SportHealthData;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Entity(primaryKeys = {"ssoid", DBAssessmentRecord.DEVICE_UNIQUE_ID, "sport_mode", "start_timestamp"}, tableName = "DBRecoveryHeartRate")
@Keep
public class DBRecoveryHeartRate extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBRecoveryHeartRate> CREATOR = new a();

    @ColumnInfo(name = Element.ELEMENT_NAME_DEVICE_CATEGORY)
    private String deviceCategory;

    @NonNull
    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @ColumnInfo(name = "end_timestamp")
    private long endTimestamp;

    @ColumnInfo(name = "recovery_heart_rate")
    private String recoveryHeartRate;

    @ColumnInfo(name = "sport_mode")
    private int sportMode;

    @NonNull
    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "start_timestamp")
    private long startTimestamp;

    @ColumnInfo(name = "version")
    private int version;

    public class a implements Parcelable.Creator<DBRecoveryHeartRate> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBRecoveryHeartRate createFromParcel(Parcel parcel) {
            return new DBRecoveryHeartRate(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBRecoveryHeartRate[] newArray(int i) {
            return new DBRecoveryHeartRate[i];
        }
    }

    public DBRecoveryHeartRate() {
        this.ssoid = "";
        this.deviceUniqueId = "";
    }

    public static String createRecoveryHeartRateTable() {
        return "create table if not exists DBRecoveryHeartRate(ssoid TEXT not null,device_unique_id TEXT not null,device_category TEXT,sport_mode INTEGER not null,start_timestamp INTEGER not null,end_timestamp INTEGER not null,recovery_heart_rate TEXT,version INTEGER not null,primary key(ssoid," + DBAssessmentRecord.DEVICE_UNIQUE_ID + ",sport_mode,start_timestamp))";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDeviceCategory() {
        return this.deviceCategory;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return this.endTimestamp;
    }

    public String getRecoveryHeartRate() {
        return this.recoveryHeartRate;
    }

    public int getSportMode() {
        return this.sportMode;
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

    public int getVersion() {
        return this.version;
    }

    public void setDeviceCategory(String str) {
        this.deviceCategory = str;
    }

    public void setDeviceUniqueId(@NotNull String str) {
        this.deviceUniqueId = str;
    }

    public void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public void setRecoveryHeartRate(String str) {
        this.recoveryHeartRate = str;
    }

    public void setSportMode(int i) {
        this.sportMode = i;
    }

    public void setSsoid(@NotNull String str) {
        this.ssoid = str;
    }

    public void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBRecoveryHeartRate{, deviceCategory='" + this.deviceCategory + "', sportMode=" + this.sportMode + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", recoveryHeartRate='" + this.recoveryHeartRate + "', version=" + this.version + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeString(this.deviceCategory);
        parcel.writeInt(this.sportMode);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeString(this.recoveryHeartRate);
        parcel.writeInt(this.version);
    }

    public DBRecoveryHeartRate(Parcel parcel) {
        this.ssoid = "";
        this.deviceUniqueId = "";
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.deviceCategory = parcel.readString();
        this.sportMode = parcel.readInt();
        this.startTimestamp = parcel.readLong();
        this.endTimestamp = parcel.readLong();
        this.recoveryHeartRate = parcel.readString();
        this.version = parcel.readInt();
    }
}
