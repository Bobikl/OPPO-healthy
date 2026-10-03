package com.heytap.databaseengineservice.db.table.physique;

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

/* JADX INFO: loaded from: classes15.dex */
@Entity(primaryKeys = {"ssoid", "train_parent_id", "train_time"}, tableName = "DBPhysiqueMeasureDetail")
@Keep
public class DBPhysiqueMeasureDetail extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBPhysiqueMeasureDetail> CREATOR = new a();

    @ColumnInfo(name = "age_range")
    private int ageRange;

    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @ColumnInfo(name = "evaluation_name")
    private String evaluationName;

    @ColumnInfo(name = DBSportMetadata.EXTENSION)
    private String extension;

    @ColumnInfo(name = "gender")
    private int gender;

    @ColumnInfo(name = "last_score")
    private int lastScore;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @NonNull
    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "train_evaluation")
    private int trainEvaluation;

    @ColumnInfo(name = "train_id")
    private int trainId;

    @ColumnInfo(name = "train_parent_id")
    private int trainParentId;

    @ColumnInfo(name = "train_rank")
    private double trainRank;

    @ColumnInfo(name = "train_result")
    private int trainResult;

    @ColumnInfo(name = "train_score")
    private int trainScore;

    @ColumnInfo(name = "train_time")
    private long trainTime;

    @ColumnInfo(name = "update_timestamp")
    private long updateTime;

    public class a implements Parcelable.Creator<DBPhysiqueMeasureDetail> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBPhysiqueMeasureDetail createFromParcel(Parcel parcel) {
            return new DBPhysiqueMeasureDetail(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBPhysiqueMeasureDetail[] newArray(int i) {
            return new DBPhysiqueMeasureDetail[i];
        }
    }

    public DBPhysiqueMeasureDetail() {
        this.ssoid = "";
        this.deviceUniqueId = "";
        this.updateTime = 0L;
    }

    public static String createPhysiqueMeasureDetailTableSQL() {
        return "create table if not exists DBPhysiqueMeasureDetail(ssoid TEXT not null,gender INTEGER not null,age_range INTEGER not null,device_unique_id TEXT,train_id INTEGER not null,evaluation_name TEXT,train_parent_id INTEGER not null,train_time INTEGER not null,train_result INTEGER not null,train_rank REAL not null,train_evaluation INTEGER not null,train_score INTEGER not null,last_score INTEGER not null,extension TEXT,update_timestamp INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,primary key(ssoid,train_parent_id,train_time))";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAgeRange() {
        return this.ageRange;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public String getEvaluationName() {
        return this.evaluationName;
    }

    public String getExtension() {
        return this.extension;
    }

    public int getGender() {
        return this.gender;
    }

    public int getLastScore() {
        return this.lastScore;
    }

    public long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NonNull
    public String getSsoid() {
        return this.ssoid;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public int getTrainEvaluation() {
        return this.trainEvaluation;
    }

    public int getTrainId() {
        return this.trainId;
    }

    public int getTrainParentId() {
        return this.trainParentId;
    }

    public double getTrainRank() {
        return this.trainRank;
    }

    public int getTrainResult() {
        return this.trainResult;
    }

    public int getTrainScore() {
        return this.trainScore;
    }

    public long getTrainTime() {
        return this.trainTime;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public void setAgeRange(int i) {
        this.ageRange = i;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setEvaluationName(String str) {
        this.evaluationName = str;
    }

    public void setExtension(String str) {
        this.extension = str;
    }

    public void setGender(int i) {
        this.gender = i;
    }

    public void setLastScore(int i) {
        this.lastScore = i;
    }

    public void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public void setSsoid(@NonNull String str) {
        this.ssoid = str;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setTrainEvaluation(int i) {
        this.trainEvaluation = i;
    }

    public void setTrainId(int i) {
        this.trainId = i;
    }

    public void setTrainParentId(int i) {
        this.trainParentId = i;
    }

    public void setTrainRank(double d) {
        this.trainRank = d;
    }

    public void setTrainResult(int i) {
        this.trainResult = i;
    }

    public void setTrainScore(int i) {
        this.trainScore = i;
    }

    public void setTrainTime(long j2) {
        this.trainTime = j2;
    }

    public void setUpdateTime(long j2) {
        this.updateTime = j2;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBPhysiqueMeasureDetail{ssoid='" + this.ssoid + "', gender=" + this.gender + ", ageRange=" + this.ageRange + ", deviceUniqueId='" + this.deviceUniqueId + "', trainTime=" + this.trainTime + ", trainId=" + this.trainId + ", evaluationName='" + this.evaluationName + "', trainParentId=" + this.trainParentId + ", trainResult=" + this.trainResult + ", trainEvaluation=" + this.trainEvaluation + ", trainRank=" + this.trainRank + ", trainScore=" + this.trainScore + ", lastScore=" + this.lastScore + ", extension='" + this.extension + "', updateTime=" + this.updateTime + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + "} ";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeInt(this.gender);
        parcel.writeInt(this.ageRange);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeInt(this.trainId);
        parcel.writeString(this.evaluationName);
        parcel.writeInt(this.trainParentId);
        parcel.writeLong(this.trainTime);
        parcel.writeInt(this.trainResult);
        parcel.writeDouble(this.trainRank);
        parcel.writeInt(this.lastScore);
        parcel.writeInt(this.trainEvaluation);
        parcel.writeInt(this.trainScore);
        parcel.writeString(this.extension);
        parcel.writeLong(this.updateTime);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
    }

    public DBPhysiqueMeasureDetail(Parcel parcel) {
        this.ssoid = "";
        this.deviceUniqueId = "";
        this.updateTime = 0L;
        String string = parcel.readString();
        Objects.requireNonNull(string);
        this.ssoid = string;
        this.gender = parcel.readInt();
        this.ageRange = parcel.readInt();
        this.deviceUniqueId = parcel.readString();
        this.trainId = parcel.readInt();
        this.evaluationName = parcel.readString();
        this.trainParentId = parcel.readInt();
        this.trainTime = parcel.readLong();
        this.trainResult = parcel.readInt();
        this.trainRank = parcel.readDouble();
        this.lastScore = parcel.readInt();
        this.trainEvaluation = parcel.readInt();
        this.trainScore = parcel.readInt();
        this.extension = parcel.readString();
        this.updateTime = parcel.readLong();
        this.syncStatus = parcel.readInt();
        this.modifiedTimestamp = parcel.readLong();
    }
}
