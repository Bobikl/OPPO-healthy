package com.heytap.databaseengine.model.snore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class TypicalFragmentBean extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<TypicalFragmentBean> CREATOR = new a();
    private int date;
    private int mode;
    private long snoreBeginUnix;
    private long snoreEndUnix;
    private Float snoreMaxDb;
    private Float snoreMinDb;
    private int snoreNum;
    private int source;
    private int spo2BeginTime;
    private int spo2EndTime;
    private String ssoid;
    private String timezone;
    private int weighted;

    public class a implements Parcelable.Creator<TypicalFragmentBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TypicalFragmentBean createFromParcel(Parcel parcel) {
            return new TypicalFragmentBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TypicalFragmentBean[] newArray(int i) {
            return new TypicalFragmentBean[i];
        }
    }

    public TypicalFragmentBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDate() {
        return this.date;
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

    public int getSpo2BeginTime() {
        return this.spo2BeginTime;
    }

    public int getSpo2EndTime() {
        return this.spo2EndTime;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
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

    public void setSpo2BeginTime(int i) {
        this.spo2BeginTime = i;
    }

    public void setSpo2EndTime(int i) {
        this.spo2EndTime = i;
    }

    public void setSsoid(String str) {
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
        return "TypicalFragmentBean{, date=" + this.date + ", timezone='" + this.timezone + "', snoreBeginUnix=" + this.snoreBeginUnix + ", snoreEndUnix=" + this.snoreEndUnix + ", spo2BeginTime=" + this.spo2BeginTime + ", spo2EndTime=" + this.spo2EndTime + ", mode=" + this.mode + ", weighted=" + this.weighted + ", snoreNum=" + this.snoreNum + ", snoreMaxDb=" + this.snoreMaxDb + ", snoreMinDb=" + this.snoreMinDb + ", source=" + this.source + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeInt(this.date);
        parcel.writeString(this.timezone);
        parcel.writeLong(this.snoreBeginUnix);
        parcel.writeLong(this.snoreEndUnix);
        parcel.writeInt(this.spo2BeginTime);
        parcel.writeInt(this.spo2EndTime);
        parcel.writeInt(this.mode);
        parcel.writeInt(this.weighted);
        parcel.writeInt(this.snoreNum);
        parcel.writeValue(this.snoreMaxDb);
        parcel.writeValue(this.snoreMinDb);
        parcel.writeInt(this.source);
    }

    public TypicalFragmentBean(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.date = parcel.readInt();
        this.timezone = parcel.readString();
        this.snoreBeginUnix = parcel.readLong();
        this.snoreEndUnix = parcel.readLong();
        this.spo2BeginTime = parcel.readInt();
        this.spo2EndTime = parcel.readInt();
        this.mode = parcel.readInt();
        this.weighted = parcel.readInt();
        this.snoreNum = parcel.readInt();
        this.snoreMaxDb = (Float) parcel.readValue(Float.class.getClassLoader());
        this.snoreMinDb = (Float) parcel.readValue(Float.class.getClassLoader());
        this.source = parcel.readInt();
    }
}
