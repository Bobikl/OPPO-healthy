package com.heytap.databaseengineservice.db.table.physique;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;

/* JADX INFO: loaded from: classes15.dex */
@Entity(primaryKeys = {"ssoid", "train_time"}, tableName = "DBPhysiqueMeasureAll")
@Keep
public class DBPhysiqueMeasureAll extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBPhysiqueMeasureAll> CREATOR = new a();

    @ColumnInfo(name = "age_range")
    private int ageRange;

    @ColumnInfo(name = "complete_count")
    private int completeCount;

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

    @ColumnInfo(name = "train_conclusion")
    private String trainConclusion;

    @ColumnInfo(name = "train_evaluation")
    private int trainEvaluation;

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

    public class a implements Parcelable.Creator<DBPhysiqueMeasureAll> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBPhysiqueMeasureAll createFromParcel(Parcel parcel) {
            return new DBPhysiqueMeasureAll(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBPhysiqueMeasureAll[] newArray(int i) {
            return new DBPhysiqueMeasureAll[i];
        }
    }

    public DBPhysiqueMeasureAll() {
        this.ssoid = "";
        this.updateTime = 0L;
    }

    public static String createPhysiqueMeasureAllTableSQL() {
        return "create table if not exists DBPhysiqueMeasureAll(ssoid TEXT not null,gender INTEGER not null,age_range INTEGER not null,train_time INTEGER not null,train_result INTEGER not null,train_evaluation INTEGER not null,train_rank REAL not null,train_score INTEGER not null,last_score INTEGER not null,complete_count INTEGER not null,train_conclusion TEXT,extension TEXT,update_timestamp INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,primary key(ssoid,train_time))";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAgeRange() {
        return this.ageRange;
    }

    public int getCompleteCount() {
        return this.completeCount;
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

    public String getTrainConclusion() {
        return this.trainConclusion;
    }

    public int getTrainEvaluation() {
        return this.trainEvaluation;
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

    public void setCompleteCount(int i) {
        this.completeCount = i;
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

    public void setTrainConclusion(String str) {
        this.trainConclusion = str;
    }

    public void setTrainEvaluation(int i) {
        this.trainEvaluation = i;
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
        return "DBPhysiqueMeasureAll{ssoid='" + this.ssoid + "', gender=" + this.gender + ", ageRange=" + this.ageRange + ", trainTime=" + this.trainTime + ", trainResult=" + this.trainResult + ", trainEvaluation=" + this.trainEvaluation + ", trainRank=" + this.trainRank + ", trainScore=" + this.trainScore + ", lastScore=" + this.lastScore + ", completeCount=" + this.completeCount + ", trainConclusion='" + this.trainConclusion + "', extension='" + this.extension + "', updateTime=" + this.updateTime + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + "} ";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeInt(this.gender);
        parcel.writeInt(this.ageRange);
        parcel.writeLong(this.trainTime);
        parcel.writeInt(this.trainResult);
        parcel.writeInt(this.trainEvaluation);
        parcel.writeDouble(this.trainRank);
        parcel.writeInt(this.trainScore);
        parcel.writeInt(this.lastScore);
        parcel.writeInt(this.completeCount);
        parcel.writeString(this.trainConclusion);
        parcel.writeString(this.extension);
        parcel.writeLong(this.updateTime);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
    }

    public DBPhysiqueMeasureAll(Parcel parcel) {
        this.ssoid = "";
        this.updateTime = 0L;
        this.ssoid = parcel.readString();
        this.gender = parcel.readInt();
        this.ageRange = parcel.readInt();
        this.trainTime = parcel.readLong();
        this.trainResult = parcel.readInt();
        this.trainEvaluation = parcel.readInt();
        this.trainRank = parcel.readDouble();
        this.trainScore = parcel.readInt();
        this.lastScore = parcel.readInt();
        this.completeCount = parcel.readInt();
        this.trainConclusion = parcel.readString();
        this.extension = parcel.readString();
        this.updateTime = parcel.readLong();
        this.syncStatus = parcel.readInt();
        this.modifiedTimestamp = parcel.readLong();
    }
}
