package com.heytap.databaseengine.model.snore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class SnoreDbBuff extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<SnoreDbBuff> CREATOR = new a();
    private int date;
    private String extension;
    private int mode;
    private float secondDBValue;
    private int snoreDbStartUnix;
    private float snoreMaxDb;
    private float snoreMeanDb;
    private float snoreMinDb;
    private byte snoreNum;
    private String ssoid;
    private String timezone;
    private long utcTimestamp;

    public class a implements Parcelable.Creator<SnoreDbBuff> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SnoreDbBuff createFromParcel(Parcel parcel) {
            return new SnoreDbBuff(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SnoreDbBuff[] newArray(int i) {
            return new SnoreDbBuff[i];
        }
    }

    public SnoreDbBuff() {
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

    public void setSsoid(String str) {
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
        return "SnoreDbBuff{ssoid='" + this.ssoid + "', date=" + this.date + ", timezone='" + this.timezone + "', utcTimestamp=" + this.utcTimestamp + ", mode=" + this.mode + ", secondDBValue=" + this.secondDBValue + ", snoreDbStartUnix=" + this.snoreDbStartUnix + ", snoreMaxDb=" + this.snoreMaxDb + ", snoreMinDb=" + this.snoreMinDb + ", snoreMeanDb=" + this.snoreMeanDb + ", snoreNum=" + ((int) this.snoreNum) + ", extension='" + this.extension + "'}";
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

    public SnoreDbBuff(Parcel parcel) {
        this.ssoid = parcel.readString();
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
