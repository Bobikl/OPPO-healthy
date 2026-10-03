package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class OneTimeSportStat extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<OneTimeSportStat> CREATOR = new a();
    private short britishFastestPace;
    private int date;
    private String deviceUniqueId;
    private int display;
    private long endTimestamp;
    private short fastestPace;
    private int longestDistance;
    private long maxDuration;
    private int oxMax;
    private int sportMode;
    private String ssoid;
    private long startTimestamp;
    private int syncStatus;
    private String timezone;
    private int totalAbnormalCounts;
    private long totalAltitudeOffset;
    private long totalCalories;
    private int totalCounts;
    private long totalDistance;
    private long totalDuration;
    private long totalSteps;

    public class a implements Parcelable.Creator<OneTimeSportStat> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OneTimeSportStat createFromParcel(Parcel parcel) {
            return new OneTimeSportStat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public OneTimeSportStat[] newArray(int i) {
            return new OneTimeSportStat[i];
        }
    }

    public OneTimeSportStat() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public short getBritishFastestPace() {
        return this.britishFastestPace;
    }

    public int getDate() {
        return this.date;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public int getDisplay() {
        return this.display;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return this.endTimestamp;
    }

    public short getFastestPace() {
        return this.fastestPace;
    }

    public int getLongestDistance() {
        return this.longestDistance;
    }

    public long getMaxDuration() {
        return this.maxDuration;
    }

    public int getOxMax() {
        return this.oxMax;
    }

    public int getSportMode() {
        return this.sportMode;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public int getTotalAbnormalCounts() {
        return this.totalAbnormalCounts;
    }

    public long getTotalAltitudeOffset() {
        return this.totalAltitudeOffset;
    }

    public long getTotalCalories() {
        return this.totalCalories;
    }

    public int getTotalCounts() {
        return this.totalCounts;
    }

    public long getTotalDistance() {
        return this.totalDistance;
    }

    public long getTotalDuration() {
        return this.totalDuration;
    }

    public long getTotalSteps() {
        return this.totalSteps;
    }

    public void setBritishFastestPace(short s) {
        this.britishFastestPace = s;
    }

    public void setDate(int i) {
        this.date = i;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setDisplay(int i) {
        this.display = i;
    }

    public void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public void setFastestPace(short s) {
        this.fastestPace = s;
    }

    public void setLongestDistance(int i) {
        this.longestDistance = i;
    }

    public void setMaxDuration(long j2) {
        this.maxDuration = j2;
    }

    public void setOxMax(int i) {
        this.oxMax = i;
    }

    public void setSportMode(int i) {
        this.sportMode = i;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setTimezone(String str) {
        this.timezone = str;
    }

    public void setTotalAbnormalCounts(int i) {
        this.totalAbnormalCounts = i;
    }

    public void setTotalAltitudeOffset(long j2) {
        this.totalAltitudeOffset = j2;
    }

    public void setTotalCalories(long j2) {
        this.totalCalories = j2;
    }

    public void setTotalCounts(int i) {
        this.totalCounts = i;
    }

    public void setTotalDistance(long j2) {
        this.totalDistance = j2;
    }

    public void setTotalDuration(long j2) {
        this.totalDuration = j2;
    }

    public void setTotalSteps(long j2) {
        this.totalSteps = j2;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "OneTimeSportStat{ssoid=" + this.ssoid + ", deviceUniqueId='" + this.deviceUniqueId + "', startTimeStamp=" + this.startTimestamp + ", endTimeStamp=" + this.endTimestamp + ", date=" + this.date + ", sportMode=" + this.sportMode + ", totalSteps=" + this.totalSteps + ", totalDistance=" + this.totalDistance + ", totalCalories=" + this.totalCalories + ", totalDuration=" + this.totalDuration + ", maxDuration=" + this.maxDuration + ", totalAltitudeOffset=" + this.totalAltitudeOffset + ", totalCounts=" + this.totalCounts + ", totalAbnormalCounts=" + this.totalAbnormalCounts + ", fastestPace=" + ((int) this.fastestPace) + ", longestDistance=" + this.longestDistance + ", oxMax=" + this.oxMax + ", britishFastestPace=" + ((int) this.britishFastestPace) + ", display=" + this.display + ", syncStatus=" + this.syncStatus + ", timezone='" + this.timezone + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeInt(this.date);
        parcel.writeInt(this.sportMode);
        parcel.writeLong(this.totalSteps);
        parcel.writeLong(this.totalDistance);
        parcel.writeLong(this.totalCalories);
        parcel.writeLong(this.totalDuration);
        parcel.writeLong(this.totalAltitudeOffset);
        parcel.writeInt(this.totalCounts);
        parcel.writeInt(this.totalAbnormalCounts);
        parcel.writeInt(this.fastestPace);
        parcel.writeInt(this.longestDistance);
        parcel.writeInt(this.oxMax);
        parcel.writeInt(this.britishFastestPace);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
        parcel.writeString(this.timezone);
        parcel.writeLong(this.maxDuration);
    }

    public OneTimeSportStat(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.startTimestamp = parcel.readLong();
        this.endTimestamp = parcel.readLong();
        this.date = parcel.readInt();
        this.sportMode = parcel.readInt();
        this.totalSteps = parcel.readLong();
        this.totalDistance = parcel.readLong();
        this.totalCalories = parcel.readLong();
        this.totalDuration = parcel.readLong();
        this.totalAltitudeOffset = parcel.readLong();
        this.totalCounts = parcel.readInt();
        this.totalAbnormalCounts = parcel.readInt();
        this.fastestPace = (short) parcel.readInt();
        this.longestDistance = parcel.readInt();
        this.oxMax = parcel.readInt();
        this.britishFastestPace = (short) parcel.readInt();
        this.display = parcel.readInt();
        this.syncStatus = parcel.readInt();
        this.timezone = parcel.readString();
        this.maxDuration = parcel.readLong();
    }
}
