package com.heytap.databaseengineservice.db.table.bloodpressure;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.DBAssessmentRecord;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Entity(primaryKeys = {"ssoid", DBAssessmentRecord.DEVICE_UNIQUE_ID, "measure_timestamp"}, tableName = "DBBloodPressure")
@Keep
public class DBBloodPressure extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBBloodPressure> CREATOR = new a();

    @ColumnInfo(name = "arrhythmia_flg")
    private int arrhythmiaFlg;

    @ColumnInfo(name = "bm_flg")
    private int bmFlg;

    @ColumnInfo(name = "bp_type")
    private int bpType;

    @ColumnInfo(name = "collect_exception_type")
    private int collectExceptionType;

    @ColumnInfo(name = "cws_flg")
    private int cwsFlg;

    @ColumnInfo(name = "deleted")
    private int deleted;

    @NonNull
    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @ColumnInfo(name = "diastolic")
    private int diastolic;

    @ColumnInfo(name = "display")
    private int display;

    @ColumnInfo(name = "evaluation")
    private int evaluation;

    @ColumnInfo(name = "manufacturer")
    private int manufacturer;

    @ColumnInfo(name = "measure_timestamp")
    private long measureTimestamp;

    @ColumnInfo(name = "model")
    private String model;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "pulse")
    private int pulse;

    @NonNull
    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "systolic")
    private int systolic;

    @ColumnInfo(name = "updated")
    private int updated;

    public class a implements Parcelable.Creator<DBBloodPressure> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBBloodPressure createFromParcel(Parcel parcel) {
            return new DBBloodPressure(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBBloodPressure[] newArray(int i) {
            return new DBBloodPressure[i];
        }
    }

    public DBBloodPressure() {
        this.ssoid = "";
        this.deviceUniqueId = "";
    }

    public static String createBloodPressureTable() {
        return "create table if not exists DBBloodPressure(ssoid TEXT not null,manufacturer INTEGER not null,model TEXT,device_unique_id TEXT not null,measure_timestamp INTEGER not null,bp_type INTEGER not null,systolic INTEGER not null,diastolic INTEGER not null,pulse INTEGER not null,arrhythmia_flg INTEGER not null,bm_flg INTEGER not null,cws_flg INTEGER not null,evaluation INTEGER not null,display INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,updated INTEGER not null,deleted INTEGER not null,primary key(ssoid," + DBAssessmentRecord.DEVICE_UNIQUE_ID + ",measure_timestamp))";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getArrhythmiaFlg() {
        return this.arrhythmiaFlg;
    }

    public int getBmFlg() {
        return this.bmFlg;
    }

    public int getBpType() {
        return this.bpType;
    }

    public int getCollectExceptionType() {
        return this.collectExceptionType;
    }

    public int getCwsFlg() {
        return this.cwsFlg;
    }

    public int getDeleted() {
        return this.deleted;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public int getDiastolic() {
        return this.diastolic;
    }

    public int getDisplay() {
        return this.display;
    }

    public int getEvaluation() {
        return this.evaluation;
    }

    public int getManufacturer() {
        return this.manufacturer;
    }

    public long getMeasureTimestamp() {
        return this.measureTimestamp;
    }

    public String getModel() {
        return this.model;
    }

    public long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public int getPulse() {
        return this.pulse;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public int getSystolic() {
        return this.systolic;
    }

    public int getUpdated() {
        return this.updated;
    }

    public void setArrhythmiaFlg(int i) {
        this.arrhythmiaFlg = i;
    }

    public void setBmFlg(int i) {
        this.bmFlg = i;
    }

    public void setBpType(int i) {
        this.bpType = i;
    }

    public void setCollectExceptionType(int i) {
        this.collectExceptionType = i;
    }

    public void setCwsFlg(int i) {
        this.cwsFlg = i;
    }

    public void setDeleted(int i) {
        this.deleted = i;
    }

    public void setDeviceUniqueId(@NotNull String str) {
        this.deviceUniqueId = str;
    }

    public void setDiastolic(int i) {
        this.diastolic = i;
    }

    public void setDisplay(int i) {
        this.display = i;
    }

    public void setEvaluation(int i) {
        this.evaluation = i;
    }

    public void setManufacturer(int i) {
        this.manufacturer = i;
    }

    public void setMeasureTimestamp(long j2) {
        this.measureTimestamp = j2;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public void setPulse(int i) {
        this.pulse = i;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setSystolic(int i) {
        this.systolic = i;
    }

    public void setUpdated(int i) {
        this.updated = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBBloodPressure{ssoid='" + this.ssoid + "', manufacturer=" + this.manufacturer + ", model='" + this.model + "', deviceUniqueId='" + this.deviceUniqueId + "', measureTimestamp=" + this.measureTimestamp + ", bpType=" + this.bpType + ", systolic=" + this.systolic + ", diastolic=" + this.diastolic + ", pulse=" + this.pulse + ", arrhythmiaFlg=" + this.arrhythmiaFlg + ", bmFlg=" + this.bmFlg + ", cwsFlg=" + this.cwsFlg + ", evaluation=" + this.evaluation + ", display=" + this.display + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ", updated=" + this.updated + ", deleted=" + this.deleted + ", collectExceptionType=" + this.collectExceptionType + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeInt(this.manufacturer);
        parcel.writeString(this.model);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeLong(this.measureTimestamp);
        parcel.writeInt(this.bpType);
        parcel.writeInt(this.systolic);
        parcel.writeInt(this.diastolic);
        parcel.writeInt(this.pulse);
        parcel.writeInt(this.arrhythmiaFlg);
        parcel.writeInt(this.bmFlg);
        parcel.writeInt(this.cwsFlg);
        parcel.writeInt(this.evaluation);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
        parcel.writeInt(this.updated);
        parcel.writeInt(this.deleted);
        parcel.writeInt(this.collectExceptionType);
    }

    public DBBloodPressure(Parcel parcel) {
        this.ssoid = "";
        this.deviceUniqueId = "";
        String string = parcel.readString();
        Objects.requireNonNull(string);
        this.ssoid = string;
        this.manufacturer = parcel.readInt();
        this.model = parcel.readString();
        String string2 = parcel.readString();
        Objects.requireNonNull(string2);
        this.deviceUniqueId = string2;
        this.measureTimestamp = parcel.readLong();
        this.bpType = parcel.readInt();
        this.systolic = parcel.readInt();
        this.diastolic = parcel.readInt();
        this.pulse = parcel.readInt();
        this.arrhythmiaFlg = parcel.readInt();
        this.bmFlg = parcel.readInt();
        this.cwsFlg = parcel.readInt();
        this.evaluation = parcel.readInt();
        this.display = parcel.readInt();
        this.syncStatus = parcel.readInt();
        this.modifiedTimestamp = parcel.readLong();
        this.updated = parcel.readInt();
        this.deleted = parcel.readInt();
        this.collectExceptionType = parcel.readInt();
    }
}
