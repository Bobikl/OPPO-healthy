package com.heytap.databaseengine.model.proxy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.model.OneTimeSportStat;
import com.heytap.databaseengine.model.SportHealthData;
import com.oplus.aiunit.vision.cu4;
import com.oplus.weatherservicesdk.data.Weather;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class OneTimeSportStatProxy extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<OneTimeSportStatProxy> CREATOR = new a();
    private int date;
    private long endTimestamp;
    private int sportMode;
    private long startTimestamp;
    private String timezone;
    private long totalAltitudeOffset;
    private long totalCalories;
    private long totalDistance;
    private long totalDuration;
    private long totalSteps;

    public class a implements Parcelable.Creator<OneTimeSportStatProxy> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OneTimeSportStatProxy createFromParcel(Parcel parcel) {
            return new OneTimeSportStatProxy(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public OneTimeSportStatProxy[] newArray(int i) {
            return new OneTimeSportStatProxy[i];
        }
    }

    public OneTimeSportStatProxy(@NonNull OneTimeSportStat oneTimeSportStat) {
        this.startTimestamp = oneTimeSportStat.getStartTimestamp();
        this.endTimestamp = oneTimeSportStat.getEndTimestamp();
        this.date = oneTimeSportStat.getDate();
        this.sportMode = cu4.l(oneTimeSportStat.getSportMode());
        this.totalSteps = oneTimeSportStat.getTotalSteps();
        this.totalDistance = oneTimeSportStat.getTotalDistance();
        this.totalCalories = oneTimeSportStat.getTotalCalories();
        this.totalDuration = oneTimeSportStat.getTotalDuration();
        this.totalAltitudeOffset = oneTimeSportStat.getTotalAltitudeOffset();
        this.timezone = oneTimeSportStat.getTimezone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDate() {
        return this.date;
    }

    public long getEndTime() {
        return this.endTimestamp;
    }

    public int getSportMode() {
        return this.sportMode;
    }

    public long getStartTime() {
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

    public long getTotalDuration() {
        return this.totalDuration;
    }

    public long getTotalSteps() {
        return this.totalSteps;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "OneTimeSportStatProxy:\nstartTime=" + getStartTime() + "\nendTime=" + getEndTime() + "\ndate=" + getDate() + "\nsportMode=" + getSportMode() + "\ntotalSteps=" + getTotalSteps() + "\ntotalDistance=" + getTotalDistance() + "\ntotalCalories=" + getTotalCalories() + "\ntotalDuration=" + getTotalDuration() + "\ntotalAltitudeOffset=" + getTotalAltitudeOffset() + "\ntimezone=" + getTimezone() + Weather.SEPARATOR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeInt(this.date);
        parcel.writeInt(this.sportMode);
        parcel.writeLong(this.totalSteps);
        parcel.writeLong(this.totalDistance);
        parcel.writeLong(this.totalCalories);
        parcel.writeLong(this.totalDuration);
        parcel.writeLong(this.totalAltitudeOffset);
        parcel.writeString(this.timezone);
    }

    public OneTimeSportStatProxy(Parcel parcel) {
        this.startTimestamp = parcel.readLong();
        this.endTimestamp = parcel.readLong();
        this.date = parcel.readInt();
        this.sportMode = parcel.readInt();
        this.totalSteps = parcel.readLong();
        this.totalDistance = parcel.readLong();
        this.totalCalories = parcel.readLong();
        this.totalDuration = parcel.readLong();
        this.totalAltitudeOffset = parcel.readLong();
        this.timezone = parcel.readString();
    }
}
