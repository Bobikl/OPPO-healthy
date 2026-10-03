package com.heytap.databaseengineservice.db.table.snore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Entity(primaryKeys = {"ssoid", "mode", "snore_start_timestamp", "spo2_start_time"}, tableName = "DBTypicalFragment")
@Keep
public class DBTypicalFragment extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBTypicalFragment> CREATOR = new a();

    @ColumnInfo(name = "date")
    private int date;

    @ColumnInfo(name = DBSportMetadata.EXTENSION)
    private String extension;

    @ColumnInfo(name = "mode")
    private int mode;

    @ColumnInfo(name = "snore_start_timestamp")
    private long snoreBeginUnix;

    @ColumnInfo(name = "snore_end_timestamp")
    private long snoreEndUnix;

    @ColumnInfo(name = "snore_max_db")
    private Float snoreMaxDb;

    @ColumnInfo(name = "snore_min_db")
    private Float snoreMinDb;

    @ColumnInfo(name = DBSnoreOsaSummarize.SNORE_NUM)
    private int snoreNum;

    @ColumnInfo(name = "source")
    private int source;

    @ColumnInfo(name = "spo2_start_time")
    private int spo2BeginUnix;

    @ColumnInfo(name = "spo2_end_time")
    private int spo2EndUnix;

    @NonNull
    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "timezone")
    private String timezone;

    @ColumnInfo(name = "weighted")
    private int weighted;

    public class a implements Parcelable.Creator<DBTypicalFragment> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBTypicalFragment createFromParcel(Parcel parcel) {
            return new DBTypicalFragment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBTypicalFragment[] newArray(int i) {
            return new DBTypicalFragment[i];
        }
    }

    public DBTypicalFragment() {
        this.ssoid = "";
    }

    public static String createTypicalFragmentTableSQL() {
        return "create table if not exists DBTypicalFragment (ssoid TEXT not null,date INTEGER not null,timezone TEXT,snore_start_timestamp INTEGER not null,snore_end_timestamp INTEGER not null,spo2_start_time INTEGER not null,spo2_end_time INTEGER not null,mode INTEGER not null,weighted INTEGER not null,source INTEGER not null,extension TEXT,primary key(ssoid,mode,snore_start_timestamp,spo2_start_time))";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDate() {
        return this.date;
    }

    public String getExtension() {
        return this.extension;
    }

    public int getMode() {
        return this.mode;
    }

    public long getSnoreBeginUnix() {
        return this.snoreBeginUnix;
    }

    public long getSnoreEndUnix() {
        return this.snoreEndUnix;
    }

    public Float getSnoreMaxDb() {
        return this.snoreMaxDb;
    }

    public Float getSnoreMinDb() {
        return this.snoreMinDb;
    }

    public int getSnoreNum() {
        return this.snoreNum;
    }

    public int getSource() {
        return this.source;
    }

    public int getSpo2BeginUnix() {
        return this.spo2BeginUnix;
    }

    public int getSpo2EndUnix() {
        return this.spo2EndUnix;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public int getWeighted() {
        return this.weighted;
    }

    public void setDate(int i) {
        this.date = i;
    }

    public void setExtension(String str) {
        this.extension = str;
    }

    public void setMode(int i) {
        this.mode = i;
    }

    public void setSnoreBeginUnix(long j2) {
        this.snoreBeginUnix = j2;
    }

    public void setSnoreEndUnix(long j2) {
        this.snoreEndUnix = j2;
    }

    public void setSnoreMaxDb(Float f) {
        this.snoreMaxDb = f;
    }

    public void setSnoreMinDb(Float f) {
        this.snoreMinDb = f;
    }

    public void setSnoreNum(int i) {
        this.snoreNum = i;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public void setSpo2BeginUnix(int i) {
        this.spo2BeginUnix = i;
    }

    public void setSpo2EndUnix(int i) {
        this.spo2EndUnix = i;
    }

    public void setSsoid(@NotNull String str) {
        this.ssoid = str;
    }

    public void setTimezone(String str) {
        this.timezone = str;
    }

    public void setWeighted(int i) {
        this.weighted = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBTypicalFragment{ssoid='" + this.ssoid + "', date=" + this.date + ", timezone='" + this.timezone + "', snoreBeginUnix=" + this.snoreBeginUnix + ", snoreEndUnix=" + this.snoreEndUnix + ", spo2BeginUnix=" + this.spo2BeginUnix + ", spo2EndUnix=" + this.spo2EndUnix + ", mode=" + this.mode + ", weighted=" + this.weighted + ", snoreNum=" + this.snoreNum + ", snoreMaxDb=" + this.snoreMaxDb + ", snoreMinDb=" + this.snoreMinDb + ", source=" + this.source + ", extension='" + this.extension + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeInt(this.date);
        parcel.writeString(this.timezone);
        parcel.writeLong(this.snoreBeginUnix);
        parcel.writeLong(this.snoreEndUnix);
        parcel.writeInt(this.spo2BeginUnix);
        parcel.writeInt(this.spo2EndUnix);
        parcel.writeInt(this.mode);
        parcel.writeInt(this.weighted);
        parcel.writeInt(this.snoreNum);
        parcel.writeValue(this.snoreMaxDb);
        parcel.writeValue(this.snoreMinDb);
        parcel.writeInt(this.source);
        parcel.writeString(this.extension);
    }

    public DBTypicalFragment(Parcel parcel) {
        this.ssoid = "";
        this.ssoid = parcel.readString();
        this.date = parcel.readInt();
        this.timezone = parcel.readString();
        this.snoreBeginUnix = parcel.readLong();
        this.snoreEndUnix = parcel.readLong();
        this.spo2BeginUnix = parcel.readInt();
        this.spo2EndUnix = parcel.readInt();
        this.mode = parcel.readInt();
        this.weighted = parcel.readInt();
        this.snoreNum = parcel.readInt();
        this.snoreMaxDb = (Float) parcel.readValue(Float.class.getClassLoader());
        this.snoreMinDb = (Float) parcel.readValue(Float.class.getClassLoader());
        this.source = parcel.readInt();
        this.extension = parcel.readString();
    }
}
