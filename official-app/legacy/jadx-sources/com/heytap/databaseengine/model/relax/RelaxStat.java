package com.heytap.databaseengine.model.relax;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class RelaxStat extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<RelaxStat> CREATOR = new a();
    private int date;
    private int display;
    private String extension;
    private String ssoid;
    private int syncStatus;
    private String timezone;
    private int totalCounts;
    private long totalDuration;
    private int type;

    public class a implements Parcelable.Creator<RelaxStat> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RelaxStat createFromParcel(Parcel parcel) {
            return new RelaxStat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RelaxStat[] newArray(int i) {
            return new RelaxStat[i];
        }
    }

    public RelaxStat() {
        this.display = 1;
        this.syncStatus = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDate() {
        return this.date;
    }

    public int getDisplay() {
        return this.display;
    }

    public String getExtension() {
        return this.extension;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public int getTotalCounts() {
        return this.totalCounts;
    }

    public long getTotalDuration() {
        return this.totalDuration;
    }

    public int getType() {
        return this.type;
    }

    public void setDate(int i) {
        this.date = i;
    }

    public void setDisplay(int i) {
        this.display = i;
    }

    public void setExtension(String str) {
        this.extension = str;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setTimezone(String str) {
        this.timezone = str;
    }

    public void setTotalCounts(int i) {
        this.totalCounts = i;
    }

    public void setTotalDuration(long j2) {
        this.totalDuration = j2;
    }

    public void setType(int i) {
        this.type = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBRelaxStat{ssoid='" + this.ssoid + "', date=" + this.date + ", timezone='" + this.timezone + "', type=" + this.type + ", totalDuration=" + this.totalDuration + ", totalCounts=" + this.totalCounts + ", extension='" + this.extension + "', display=" + this.display + ", syncStatus=" + this.syncStatus + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeInt(this.date);
        parcel.writeString(this.timezone);
        parcel.writeInt(this.type);
        parcel.writeLong(this.totalDuration);
        parcel.writeInt(this.totalCounts);
        parcel.writeString(this.extension);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
    }

    public RelaxStat(Parcel parcel) {
        this.display = 1;
        this.syncStatus = 0;
        this.ssoid = parcel.readString();
        this.date = parcel.readInt();
        this.timezone = parcel.readString();
        this.type = parcel.readInt();
        this.totalDuration = parcel.readLong();
        this.totalCounts = parcel.readInt();
        this.extension = parcel.readString();
        this.display = parcel.readInt();
        this.syncStatus = parcel.readInt();
    }
}
