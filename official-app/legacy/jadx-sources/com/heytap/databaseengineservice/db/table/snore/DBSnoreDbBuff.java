package com.heytap.databaseengineservice.db.table.snore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Entity(primaryKeys = {"ssoid", "utc_timestamp", "mode"}, tableName = "DBSnoreDbBuff")
@Keep
public class DBSnoreDbBuff extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBSnoreDbBuff> CREATOR = new a();

    @ColumnInfo(name = "date")
    private int date;

    @ColumnInfo(name = DBSportMetadata.EXTENSION)
    private String extension;

    @ColumnInfo(name = "mode")
    private int mode;

    @ColumnInfo(name = "second_db_value")
    private float secondDBValue;

    @ColumnInfo(name = "snore_db_start_time")
    private int snoreDbStartUnix;

    @ColumnInfo(name = "snore_max_db")
    private float snoreMaxDb;

    @ColumnInfo(name = "snore_mean_db")
    private float snoreMeanDb;

    @ColumnInfo(name = "snore_min_db")
    private float snoreMinDb;

    @ColumnInfo(name = DBSnoreOsaSummarize.SNORE_NUM)
    private byte snoreNum;

    @NonNull
    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "timezone")
    private String timezone;

    @ColumnInfo(name = "utc_timestamp")
    private long utcTimestamp;

    public class a implements Parcelable.Creator<DBSnoreDbBuff> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBSnoreDbBuff createFromParcel(Parcel parcel) {
            return new DBSnoreDbBuff(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBSnoreDbBuff[] newArray(int i) {
            return new DBSnoreDbBuff[i];
        }
    }

    public DBSnoreDbBuff() {
        this.ssoid = "";
    }

    public static String createSnoreDbBuffTableSQL() {
        return "create table if not exists DBSnoreDbBuff (ssoid TEXT not null,date INTEGER not null,timezone TEXT,utc_timestamp INTEGER not null,mode INTEGER not null,second_db_value REAL not null,snore_db_start_time INTEGER not null,snore_max_db REAL not null,snore_min_db REAL not null,snore_mean_db REAL not null,snore_num INTEGER not null,extension TEXT,primary key(ssoid,utc_timestamp,mode))";
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

    public float getSecondDBValue() {
        return this.secondDBValue;
    }

    public int getSnoreDbStartUnix() {
        return this.snoreDbStartUnix;
    }

    public float getSnoreMaxDb() {
        return this.snoreMaxDb;
    }

    public float getSnoreMeanDb() {
        return this.snoreMeanDb;
    }

    public float getSnoreMinDb() {
        return this.snoreMinDb;
    }

    public byte getSnoreNum() {
        return this.snoreNum;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public long getUtcTimestamp() {
        return this.utcTimestamp;
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

    public void setSecondDBValue(float f) {
        this.secondDBValue = f;
    }

    public void setSnoreDbStartUnix(int i) {
        this.snoreDbStartUnix = i;
    }

    public void setSnoreMaxDb(float f) {
        this.snoreMaxDb = f;
    }

    public void setSnoreMeanDb(float f) {
        this.snoreMeanDb = f;
    }

    public void setSnoreMinDb(float f) {
        this.snoreMinDb = f;
    }

    public void setSnoreNum(byte b) {
        this.snoreNum = b;
    }

    public void setSsoid(@NotNull String str) {
        this.ssoid = str;
    }

    public void setTimezone(String str) {
        this.timezone = str;
    }

    public void setUtcTimestamp(long j2) {
        this.utcTimestamp = j2;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBSnoreDbBuff{ssoid='" + this.ssoid + "', date=" + this.date + ", timezone='" + this.timezone + "', utcTimestamp=" + this.utcTimestamp + ", mode=" + this.mode + ", secondDBValue=" + this.secondDBValue + ", snoreDbStartUnix=" + this.snoreDbStartUnix + ", snoreMaxDb=" + this.snoreMaxDb + ", snoreMinDb=" + this.snoreMinDb + ", snoreMeanDb=" + this.snoreMeanDb + ", snoreNum=" + ((int) this.snoreNum) + ", extension='" + this.extension + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeInt(this.date);
        parcel.writeString(this.timezone);
        parcel.writeLong(this.utcTimestamp);
        parcel.writeInt(this.mode);
        parcel.writeFloat(this.secondDBValue);
        parcel.writeInt(this.snoreDbStartUnix);
        parcel.writeFloat(this.snoreMaxDb);
        parcel.writeFloat(this.snoreMinDb);
        parcel.writeFloat(this.snoreMeanDb);
        parcel.writeByte(this.snoreNum);
        parcel.writeString(this.extension);
    }

    public DBSnoreDbBuff(Parcel parcel) {
        this.ssoid = "";
        String string = parcel.readString();
        Objects.requireNonNull(string);
        this.ssoid = string;
        this.date = parcel.readInt();
        this.timezone = parcel.readString();
        this.utcTimestamp = parcel.readLong();
        this.mode = parcel.readInt();
        this.secondDBValue = parcel.readFloat();
        this.snoreDbStartUnix = parcel.readInt();
        this.snoreMaxDb = parcel.readFloat();
        this.snoreMinDb = parcel.readFloat();
        this.snoreMeanDb = parcel.readFloat();
        this.snoreNum = parcel.readByte();
        this.extension = parcel.readString();
    }
}
