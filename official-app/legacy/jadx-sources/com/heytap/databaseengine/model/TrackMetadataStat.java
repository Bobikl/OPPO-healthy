package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class TrackMetadataStat extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<TrackMetadataStat> CREATOR = new a();
    private int abnormalTrack;
    private int avgHR;
    private int avgPace;
    private int avgStepRate;
    private int bestPace;
    private int bestStepRate;
    private String clientDataId;
    private int date;
    private String deviceCategory;
    private String deviceUniqueId;
    private long endTimestamp;
    private String extension;
    private int maxHR;
    private float maxVo2;
    private int minHR;
    private String runExtra;
    private int sportMode;
    private String sportName;
    private String ssoid;
    private long startTimestamp;
    private String timezone;
    private long totalAltitudeOffset;
    private long totalCalories;
    private long totalDistance;
    private long totalSteps;
    private long totalTime;

    public class a implements Parcelable.Creator<TrackMetadataStat> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrackMetadataStat createFromParcel(Parcel parcel) {
            return new TrackMetadataStat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TrackMetadataStat[] newArray(int i) {
            return new TrackMetadataStat[i];
        }
    }

    public TrackMetadataStat() {
    }

    public TrackMetadataStat copy() {
        Parcel parcelObtain = Parcel.obtain();
        writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        return CREATOR.createFromParcel(parcelObtain);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAbnormalTrack() {
        return this.abnormalTrack;
    }

    public int getAvgHR() {
        return this.avgHR;
    }

    public int getAvgPace() {
        return this.avgPace;
    }

    public int getAvgStepRate() {
        return this.avgStepRate;
    }

    public int getBestPace() {
        return this.bestPace;
    }

    public int getBestStepRate() {
        return this.bestStepRate;
    }

    public String getClientDataId() {
        return this.clientDataId;
    }

    public int getDate() {
        return this.date;
    }

    public String getDeviceCategory() {
        return this.deviceCategory;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return this.endTimestamp;
    }

    public String getExtension() {
        return this.extension;
    }

    public int getMaxHR() {
        return this.maxHR;
    }

    public float getMaxVo2() {
        return this.maxVo2;
    }

    public int getMinHR() {
        return this.minHR;
    }

    public String getRunExtra() {
        return this.runExtra;
    }

    public int getSportMode() {
        return this.sportMode;
    }

    public String getSportName() {
        return this.sportName;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public long getTotalAltitudeOffset() {
        return this.totalAltitudeOffset;
    }

    public long getTotalCalories() {
        return this.totalCalories;
    }

    public long getTotalDistance() {
        return this.totalDistance;
    }

    public long getTotalSteps() {
        return this.totalSteps;
    }

    public long getTotalTime() {
        return this.totalTime;
    }

    public void setAbnormalTrack(int i) {
        this.abnormalTrack = i;
    }

    public void setAvgHR(int i) {
        this.avgHR = i;
    }

    public void setAvgPace(int i) {
        this.avgPace = i;
    }

    public void setAvgStepRate(int i) {
        this.avgStepRate = i;
    }

    public void setBestPace(int i) {
        this.bestPace = i;
    }

    public void setBestStepRate(int i) {
        this.bestStepRate = i;
    }

    public void setClientDataId(String str) {
        this.clientDataId = str;
    }

    public void setDate(int i) {
        this.date = i;
    }

    public void setDeviceCategory(String str) {
        this.deviceCategory = str;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public void setExtension(String str) {
        this.extension = str;
    }

    public void setMaxHR(int i) {
        this.maxHR = i;
    }

    public void setMaxVo2(float f) {
        this.maxVo2 = f;
    }

    public void setMinHR(int i) {
        this.minHR = i;
    }

    public void setRunExtra(String str) {
        this.runExtra = str;
    }

    public void setSportMode(int i) {
        this.sportMode = i;
    }

    public void setSportName(String str) {
        this.sportName = str;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    public void setTimezone(String str) {
        this.timezone = str;
    }

    public void setTotalAltitudeOffset(long j2) {
        this.totalAltitudeOffset = j2;
    }

    public void setTotalCalories(long j2) {
        this.totalCalories = j2;
    }

    public void setTotalDistance(long j2) {
        this.totalDistance = j2;
    }

    public void setTotalSteps(long j2) {
        this.totalSteps = j2;
    }

    public void setTotalTime(long j2) {
        this.totalTime = j2;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "TrackMetadataStat{avgPace=" + this.avgPace + ", bestPace=" + this.bestPace + ", avgHR=" + this.avgHR + ", maxHR=" + this.maxHR + ", minHR=" + this.minHR + ", avgStepRate=" + this.avgStepRate + ", bestStepRate=" + this.bestStepRate + ", totalDistance=" + this.totalDistance + ", totalCalories=" + this.totalCalories + ", totalSteps=" + this.totalSteps + ", totalTime=" + this.totalTime + ", totalAltitudeOffset=" + this.totalAltitudeOffset + ", sportName='" + this.sportName + "', abnormalTrack=" + this.abnormalTrack + ", maxVo2=" + this.maxVo2 + ", ssoid='" + this.ssoid + "', sportMode=" + this.sportMode + ", deviceUniqueId='" + this.deviceUniqueId + "', deviceCategory='" + this.deviceCategory + "', startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", clientDataId='" + this.clientDataId + "', date=" + this.date + ", timezone='" + this.timezone + "', runExtra='" + this.runExtra + "', extension='" + this.extension + "'} ";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.avgPace);
        parcel.writeInt(this.bestPace);
        parcel.writeInt(this.avgHR);
        parcel.writeInt(this.maxHR);
        parcel.writeInt(this.minHR);
        parcel.writeInt(this.avgStepRate);
        parcel.writeInt(this.bestStepRate);
        parcel.writeLong(this.totalDistance);
        parcel.writeLong(this.totalCalories);
        parcel.writeLong(this.totalSteps);
        parcel.writeLong(this.totalTime);
        parcel.writeLong(this.totalAltitudeOffset);
        parcel.writeString(this.sportName);
        parcel.writeInt(this.abnormalTrack);
        parcel.writeFloat(this.maxVo2);
        parcel.writeString(this.ssoid);
        parcel.writeInt(this.sportMode);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeString(this.deviceCategory);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeString(this.clientDataId);
        parcel.writeInt(this.date);
        parcel.writeString(this.timezone);
        parcel.writeString(this.runExtra);
        parcel.writeString(this.extension);
    }

    public TrackMetadataStat(Parcel parcel) {
        this.avgPace = parcel.readInt();
        this.bestPace = parcel.readInt();
        this.avgHR = parcel.readInt();
        this.maxHR = parcel.readInt();
        this.minHR = parcel.readInt();
        this.avgStepRate = parcel.readInt();
        this.bestStepRate = parcel.readInt();
        this.totalDistance = parcel.readLong();
        this.totalCalories = parcel.readLong();
        this.totalSteps = parcel.readLong();
        this.totalTime = parcel.readLong();
        this.totalAltitudeOffset = parcel.readLong();
        this.sportName = parcel.readString();
        this.abnormalTrack = parcel.readInt();
        this.maxVo2 = parcel.readFloat();
        this.ssoid = parcel.readString();
        this.sportMode = parcel.readInt();
        this.deviceUniqueId = parcel.readString();
        this.deviceCategory = parcel.readString();
        this.startTimestamp = parcel.readLong();
        this.endTimestamp = parcel.readLong();
        this.clientDataId = parcel.readString();
        this.date = parcel.readInt();
        this.timezone = parcel.readString();
        this.runExtra = parcel.readString();
        this.extension = parcel.readString();
    }
}
