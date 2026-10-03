package com.heytap.databaseengineservice.db.table.bloodpressure;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.databaseengine.model.SportHealthData;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Entity(primaryKeys = {"ssoid", "date", "bp_type"}, tableName = "DBBloodPressureStat")
@Keep
public class DBBloodPressureStat extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBBloodPressureStat> CREATOR = new a();

    @ColumnInfo(defaultValue = "0", name = "avg_diastolic")
    private int avgDiastolic;

    @ColumnInfo(defaultValue = "0", name = "avg_systolic")
    private int avgSystolic;

    @ColumnInfo(name = "bp_type")
    private int bpType;

    @ColumnInfo(name = "date")
    private int date;

    @ColumnInfo(defaultValue = "0", name = "high_normal_times")
    private int highNormalTimes;

    @ColumnInfo(name = "high_times")
    private int highTimes;

    @ColumnInfo(name = "low_times")
    private int lowTimes;

    @ColumnInfo(name = "max_diastolic")
    private int maxDiastolic;

    @ColumnInfo(name = "max_systolic")
    private int maxSystolic;

    @ColumnInfo(defaultValue = "0", name = "mild_hypertension_times")
    private int mildHypertensionTimes;

    @ColumnInfo(name = "min_diastolic")
    private int minDiastolic;

    @ColumnInfo(name = "min_systolic")
    private int minSystolic;

    @ColumnInfo(defaultValue = "0", name = "moderate_hypertension_times")
    private int moderateHypertensionTimes;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "normal_times")
    private int normalTimes;

    @ColumnInfo(defaultValue = "0", name = "severe_hypertension_times")
    private int severeHypertensionTimes;

    @NonNull
    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "updated")
    private int updated;

    public class a implements Parcelable.Creator<DBBloodPressureStat> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBBloodPressureStat createFromParcel(Parcel parcel) {
            return new DBBloodPressureStat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBBloodPressureStat[] newArray(int i) {
            return new DBBloodPressureStat[i];
        }
    }

    public DBBloodPressureStat() {
        this.ssoid = "";
    }

    public static String createBloodPressureStatTable() {
        return "create table if not exists DBBloodPressureStat(ssoid TEXT not null,date INTEGER not null,bp_type INTEGER not null,max_systolic INTEGER not null,min_systolic INTEGER not null,max_diastolic INTEGER not null,min_diastolic INTEGER not null,normal_times INTEGER not null,high_times INTEGER not null,low_times INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,updated INTEGER not null,primary key(ssoid,date,bp_type))";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAvgDiastolic() {
        return this.avgDiastolic;
    }

    public int getAvgSystolic() {
        return this.avgSystolic;
    }

    public int getBpType() {
        return this.bpType;
    }

    public int getDate() {
        return this.date;
    }

    public int getHighNormalTimes() {
        return this.highNormalTimes;
    }

    public int getHighTimes() {
        return this.highTimes;
    }

    public int getLowTimes() {
        return this.lowTimes;
    }

    public int getMaxDiastolic() {
        return this.maxDiastolic;
    }

    public int getMaxSystolic() {
        return this.maxSystolic;
    }

    public int getMildHypertensionTimes() {
        return this.mildHypertensionTimes;
    }

    public int getMinDiastolic() {
        return this.minDiastolic;
    }

    public int getMinSystolic() {
        return this.minSystolic;
    }

    public int getModerateHypertensionTimes() {
        return this.moderateHypertensionTimes;
    }

    public long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public int getNormalTimes() {
        return this.normalTimes;
    }

    public int getSevereHypertensionTimes() {
        return this.severeHypertensionTimes;
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

    public void setAvgDiastolic(int i) {
        this.avgDiastolic = i;
    }

    public void setAvgSystolic(int i) {
        this.avgSystolic = i;
    }

    public void setBpType(int i) {
        this.bpType = i;
    }

    public void setDate(int i) {
        this.date = i;
    }

    public void setHighNormalTimes(int i) {
        this.highNormalTimes = i;
    }

    public void setHighTimes(int i) {
        this.highTimes = i;
    }

    public void setLowTimes(int i) {
        this.lowTimes = i;
    }

    public void setMaxDiastolic(int i) {
        this.maxDiastolic = i;
    }

    public void setMaxSystolic(int i) {
        this.maxSystolic = i;
    }

    public void setMildHypertensionTimes(int i) {
        this.mildHypertensionTimes = i;
    }

    public void setMinDiastolic(int i) {
        this.minDiastolic = i;
    }

    public void setMinSystolic(int i) {
        this.minSystolic = i;
    }

    public void setModerateHypertensionTimes(int i) {
        this.moderateHypertensionTimes = i;
    }

    public void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public void setNormalTimes(int i) {
        this.normalTimes = i;
    }

    public void setSevereHypertensionTimes(int i) {
        this.severeHypertensionTimes = i;
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

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBBloodPressureStat{ssoid='" + this.ssoid + "', date=" + this.date + ", bpType=" + this.bpType + ", maxSystolic=" + this.maxSystolic + ", minSystolic=" + this.minSystolic + ", avgSystolic=" + this.avgSystolic + ", maxDiastolic=" + this.maxDiastolic + ", minDiastolic=" + this.minDiastolic + ", avgDiastolic=" + this.avgDiastolic + ", normalTimes=" + this.normalTimes + ", highNormalTimes=" + this.highNormalTimes + ", mildHypertensionTimes=" + this.mildHypertensionTimes + ", moderateHypertensionTimes=" + this.moderateHypertensionTimes + ", severeHypertensionTimes=" + this.severeHypertensionTimes + ", highTimes=" + this.highTimes + ", lowTimes=" + this.lowTimes + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ", updated=" + this.updated + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeInt(this.date);
        parcel.writeInt(this.bpType);
        parcel.writeInt(this.maxSystolic);
        parcel.writeInt(this.minSystolic);
        parcel.writeInt(this.avgSystolic);
        parcel.writeInt(this.maxDiastolic);
        parcel.writeInt(this.minDiastolic);
        parcel.writeInt(this.avgDiastolic);
        parcel.writeInt(this.normalTimes);
        parcel.writeInt(this.highNormalTimes);
        parcel.writeInt(this.mildHypertensionTimes);
        parcel.writeInt(this.moderateHypertensionTimes);
        parcel.writeInt(this.severeHypertensionTimes);
        parcel.writeInt(this.highTimes);
        parcel.writeInt(this.lowTimes);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
        parcel.writeInt(this.updated);
    }

    public DBBloodPressureStat(Parcel parcel) {
        this.ssoid = "";
        String string = parcel.readString();
        Objects.requireNonNull(string);
        this.ssoid = string;
        this.date = parcel.readInt();
        this.bpType = parcel.readInt();
        this.maxSystolic = parcel.readInt();
        this.minSystolic = parcel.readInt();
        this.avgSystolic = parcel.readInt();
        this.maxDiastolic = parcel.readInt();
        this.minDiastolic = parcel.readInt();
        this.avgDiastolic = parcel.readInt();
        this.normalTimes = parcel.readInt();
        this.highNormalTimes = parcel.readInt();
        this.mildHypertensionTimes = parcel.readInt();
        this.moderateHypertensionTimes = parcel.readInt();
        this.severeHypertensionTimes = parcel.readInt();
        this.highTimes = parcel.readInt();
        this.lowTimes = parcel.readInt();
        this.syncStatus = parcel.readInt();
        this.modifiedTimestamp = parcel.readLong();
        this.updated = parcel.readInt();
    }
}
