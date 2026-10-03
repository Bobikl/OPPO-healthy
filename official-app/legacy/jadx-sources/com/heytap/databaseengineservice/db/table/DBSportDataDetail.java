package com.heytap.databaseengineservice.db.table;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.heytap.databaseengine.apiv3.data.Element;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;
import com.heytap.sports.record.details.bean.SportSummaryBean;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Entity(primaryKeys = {"ssoid", DBAssessmentRecord.DEVICE_UNIQUE_ID, "start_time"}, tableName = DBSportDataDetail.TABLE_NAME)
@Keep
public class DBSportDataDetail extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBSportDataDetail> CREATOR = new a();
    public static final String TABLE_NAME = "DBSportDataDetail";

    @ColumnInfo(name = "altitude_offset")
    private int altitudeOffset;

    @ColumnInfo(name = "amount_of_exercise")
    private int amountOfExercise;

    @ColumnInfo(name = SportSummaryBean.CALORIES)
    private long calories;

    @ColumnInfo(name = DBSportMetadata.CLIENT_DATA_ID)
    private String clientDataId;

    @ColumnInfo(name = "data_version")
    private int dataVersion;

    @ColumnInfo(name = Element.ELEMENT_NAME_DEVICE_CATEGORY)
    private String deviceType;

    @NonNull
    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @ColumnInfo(name = "display")
    private int display;

    @ColumnInfo(name = "distance")
    private int distance;

    @ColumnInfo(name = "end_time")
    private long endTimestamp;

    @ColumnInfo(name = "modified_time")
    private long modifiedTime;

    @ColumnInfo(name = "sedentary_state")
    private int sedentaryState;

    @ColumnInfo(name = "_id")
    private long sportDetailId;

    @ColumnInfo(name = "sport_mode")
    private int sportMode;

    @NonNull
    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "start_time")
    private long startTimestamp;

    @ColumnInfo(name = "steps")
    private int steps;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "timezone")
    private String timezone;

    @ColumnInfo(name = "updated")
    private int updated;

    @ColumnInfo(name = NotificationCompat.CATEGORY_WORKOUT)
    private int workout;

    public class a implements Parcelable.Creator<DBSportDataDetail> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBSportDataDetail createFromParcel(Parcel parcel) {
            return new DBSportDataDetail(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBSportDataDetail[] newArray(int i) {
            return new DBSportDataDetail[i];
        }
    }

    public DBSportDataDetail() {
        this.ssoid = "";
        this.deviceUniqueId = "";
    }

    public static void changePrimaryKey(SupportSQLiteDatabase supportSQLiteDatabase) {
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists DBSportDataDetail_copy(");
        sb.append("_id INTEGER not null,");
        sb.append("client_data_id TEXT,");
        sb.append("ssoid TEXT not null,");
        sb.append("device_unique_id TEXT not null,");
        sb.append("device_category TEXT,");
        sb.append("start_time INTEGER not null,");
        sb.append("end_time INTEGER not null,");
        sb.append("sport_mode INTEGER not null,");
        sb.append("steps INTEGER not null,");
        sb.append("distance INTEGER not null,");
        sb.append("calories INTEGER not null,");
        sb.append("altitude_offset INTEGER not null,");
        sb.append("display INTEGER not null,");
        sb.append("sync_status INTEGER not null,");
        sb.append("timezone TEXT,");
        sb.append("modified_time INTEGER not null,");
        sb.append("updated INTEGER not null,");
        sb.append("data_version INTEGER not null,");
        sb.append("workout INTEGER not null,");
        sb.append("PRIMARY KEY (ssoid, device_unique_id, start_time)");
        sb.append(");");
        supportSQLiteDatabase.execSQL(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("INSERT INTO DBSportDataDetail_copy (");
        sb2.append(params());
        sb2.append(") SELECT ");
        sb2.append(params());
        sb2.append(" FROM ");
        sb2.append(TABLE_NAME);
        sb2.append(" where display = 1");
        sb2.append(" GROUP BY ");
        sb2.append("ssoid, device_unique_id, start_time, display;");
        supportSQLiteDatabase.execSQL(sb2.toString());
        supportSQLiteDatabase.execSQL("DROP TABLE " + TABLE_NAME + ";");
        supportSQLiteDatabase.execSQL("ALTER TABLE DBSportDataDetail_copy RENAME TO " + TABLE_NAME + ";");
    }

    private static String params() {
        return "_id, " + DBSportMetadata.CLIENT_DATA_ID + ", ssoid, " + DBAssessmentRecord.DEVICE_UNIQUE_ID + ", " + Element.ELEMENT_NAME_DEVICE_CATEGORY + ", start_time, end_time, sport_mode, steps, distance, " + SportSummaryBean.CALORIES + ", altitude_offset, display, sync_status, timezone, modified_time, updated, data_version, " + NotificationCompat.CATEGORY_WORKOUT;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAltitudeOffset() {
        return this.altitudeOffset;
    }

    public int getAmountOfExercise() {
        return this.amountOfExercise;
    }

    public long getCalories() {
        return this.calories;
    }

    public String getClientDataId() {
        return this.clientDataId;
    }

    public int getDataVersion() {
        return this.dataVersion;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public int getDisplay() {
        return this.display;
    }

    public int getDistance() {
        return this.distance;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return this.endTimestamp;
    }

    public long getModifiedTime() {
        return this.modifiedTime;
    }

    public int getSedentaryState() {
        return this.sedentaryState;
    }

    public long getSportDetailId() {
        return this.sportDetailId;
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

    public int getSteps() {
        return this.steps;
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

    public int getWorkout() {
        return this.workout;
    }

    public void setAltitudeOffset(int i) {
        this.altitudeOffset = i;
    }

    public void setAmountOfExercise(int i) {
        this.amountOfExercise = i;
    }

    public void setCalories(long j2) {
        this.calories = j2;
    }

    public void setClientDataId(String str) {
        this.clientDataId = str;
    }

    public void setDataVersion(int i) {
        this.dataVersion = i;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public void setDeviceUniqueId(@NotNull String str) {
        this.deviceUniqueId = str;
    }

    public void setDisplay(int i) {
        this.display = i;
    }

    public void setDistance(int i) {
        this.distance = i;
    }

    public void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public void setModifiedTime(long j2) {
        this.modifiedTime = j2;
    }

    public void setSedentaryState(int i) {
        this.sedentaryState = i;
    }

    public void setSportDetailId(long j2) {
        this.sportDetailId = j2;
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

    public void setSteps(int i) {
        this.steps = i;
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

    public void setWorkout(int i) {
        this.workout = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBSportDataDetail{sportDetailId=" + this.sportDetailId + ", clientDataId='" + this.clientDataId + "', ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', deviceCategory='" + this.deviceType + "', startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", sportMode=" + this.sportMode + ", steps=" + this.steps + ", distance=" + this.distance + ", calories=" + this.calories + ", altitudeOffset=" + this.altitudeOffset + ", display=" + this.display + ", syncStatus=" + this.syncStatus + ", timezone='" + this.timezone + "', modifiedTime=" + this.modifiedTime + ", updated=" + this.updated + ", dataVersion=" + this.dataVersion + ", workout=" + this.workout + ", sedentaryState=" + this.sedentaryState + ", amountOfExercise=" + this.amountOfExercise + '}';
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
        parcel.writeInt(this.steps);
        parcel.writeInt(this.distance);
        parcel.writeLong(this.calories);
        parcel.writeInt(this.altitudeOffset);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
        parcel.writeString(this.timezone);
        parcel.writeLong(this.modifiedTime);
        parcel.writeInt(this.updated);
        parcel.writeInt(this.dataVersion);
        parcel.writeInt(this.workout);
        parcel.writeInt(this.sedentaryState);
        parcel.writeInt(this.amountOfExercise);
    }

    public DBSportDataDetail(Parcel parcel) {
        this.ssoid = "";
        this.deviceUniqueId = "";
        this.clientDataId = parcel.readString();
        String string = parcel.readString();
        Objects.requireNonNull(string);
        this.ssoid = string;
        String string2 = parcel.readString();
        Objects.requireNonNull(string2);
        this.deviceUniqueId = string2;
        this.deviceType = parcel.readString();
        this.startTimestamp = parcel.readLong();
        this.endTimestamp = parcel.readLong();
        this.sportMode = parcel.readInt();
        this.steps = parcel.readInt();
        this.distance = parcel.readInt();
        this.calories = parcel.readLong();
        this.altitudeOffset = parcel.readInt();
        this.display = parcel.readInt();
        this.syncStatus = parcel.readInt();
        this.timezone = parcel.readString();
        this.modifiedTime = parcel.readLong();
        this.updated = parcel.readInt();
        this.dataVersion = parcel.readInt();
        this.workout = parcel.readInt();
        this.sedentaryState = parcel.readInt();
        this.amountOfExercise = parcel.readInt();
    }
}
