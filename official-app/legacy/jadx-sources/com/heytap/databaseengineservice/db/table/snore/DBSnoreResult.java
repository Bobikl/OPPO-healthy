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
@Entity(primaryKeys = {"ssoid", "date"}, tableName = "DBSnoreResult")
@Keep
public class DBSnoreResult extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBSnoreResult> CREATOR = new a();

    @ColumnInfo(name = "date")
    private int date;

    @ColumnInfo(name = DBSportMetadata.EXTENSION)
    private String extension;

    @ColumnInfo(name = "snore_db_buff")
    private String snoreDbBuff;

    @ColumnInfo(name = "snore_db_buff_len")
    private int snoreDbBuffLen;

    @ColumnInfo(name = "snore_max_db")
    private float snoreMaxDb;

    @ColumnInfo(name = "snore_mean_db")
    private float snoreMeanDb;

    @ColumnInfo(name = "snore_sum_num")
    private int snoreSumNum;

    @ColumnInfo(name = "snore_sum_time")
    private int snoreSumTimeMs;

    @NonNull
    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "timezone")
    private String timezone;

    public class a implements Parcelable.Creator<DBSnoreResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBSnoreResult createFromParcel(Parcel parcel) {
            return new DBSnoreResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBSnoreResult[] newArray(int i) {
            return new DBSnoreResult[i];
        }
    }

    public DBSnoreResult() {
        this.ssoid = "";
    }

    public static String createSnoreResultTableSQL() {
        return "create table if not exists DBSnoreResult (ssoid TEXT not null,date INTEGER not null,timezone TEXT,snore_db_buff TEXT,snore_db_buff_len INTEGER not null,snore_mean_db REAL not null,snore_max_db REAL not null,snore_sum_time INTEGER not null,snore_sum_num INTEGER not null,extension TEXT,primary key(ssoid,date))";
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

    public String getSnoreDbBuff() {
        return this.snoreDbBuff;
    }

    public int getSnoreDbBuffLen() {
        return this.snoreDbBuffLen;
    }

    public float getSnoreMaxDb() {
        return this.snoreMaxDb;
    }

    public float getSnoreMeanDb() {
        return this.snoreMeanDb;
    }

    public int getSnoreSumNum() {
        return this.snoreSumNum;
    }

    public int getSnoreSumTimeMs() {
        return this.snoreSumTimeMs;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public void setDate(int i) {
        this.date = i;
    }

    public void setExtension(String str) {
        this.extension = str;
    }

    public void setSnoreDbBuff(String str) {
        this.snoreDbBuff = str;
    }

    public void setSnoreDbBuffLen(int i) {
        this.snoreDbBuffLen = i;
    }

    public void setSnoreMaxDb(float f) {
        this.snoreMaxDb = f;
    }

    public void setSnoreMeanDb(float f) {
        this.snoreMeanDb = f;
    }

    public void setSnoreSumNum(int i) {
        this.snoreSumNum = i;
    }

    public void setSnoreSumTimeMs(int i) {
        this.snoreSumTimeMs = i;
    }

    public void setSsoid(@NotNull String str) {
        this.ssoid = str;
    }

    public void setTimezone(String str) {
        this.timezone = str;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBSnoreResult{ssoid='" + this.ssoid + "', date=" + this.date + ", timezone='" + this.timezone + "', snoreDbBuff='" + this.snoreDbBuff + "', snoreDbBuffLen=" + this.snoreDbBuffLen + ", snoreMeanDb=" + this.snoreMeanDb + ", snoreMaxDb=" + this.snoreMaxDb + ", snoreSumTimeMs=" + this.snoreSumTimeMs + ", snoreSumNum=" + this.snoreSumNum + ", extension='" + this.extension + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeInt(this.date);
        parcel.writeString(this.timezone);
        parcel.writeString(this.snoreDbBuff);
        parcel.writeInt(this.snoreDbBuffLen);
        parcel.writeFloat(this.snoreMeanDb);
        parcel.writeFloat(this.snoreMaxDb);
        parcel.writeInt(this.snoreSumTimeMs);
        parcel.writeInt(this.snoreSumNum);
        parcel.writeString(this.extension);
    }

    public DBSnoreResult(Parcel parcel) {
        this.ssoid = "";
        String string = parcel.readString();
        Objects.requireNonNull(string);
        this.ssoid = string;
        this.date = parcel.readInt();
        this.timezone = parcel.readString();
        this.snoreDbBuff = parcel.readString();
        this.snoreDbBuffLen = parcel.readInt();
        this.snoreMeanDb = parcel.readFloat();
        this.snoreMaxDb = parcel.readFloat();
        this.snoreSumTimeMs = parcel.readInt();
        this.snoreSumNum = parcel.readInt();
        this.extension = parcel.readString();
    }
}
