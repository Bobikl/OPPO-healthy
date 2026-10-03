package com.heytap.databaseengine.apiv2.device.game.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.HeartRate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class GameHealthData implements Parcelable {
    public static final Parcelable.Creator<GameHealthData> CREATOR = new a();
    private int calorie;
    private long endTime;
    private List<HeartRate> heartRateList;
    private String packageName;
    private long startTime;
    private int stressAvg;

    public class a implements Parcelable.Creator<GameHealthData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GameHealthData createFromParcel(Parcel parcel) {
            return new GameHealthData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GameHealthData[] newArray(int i) {
            return new GameHealthData[i];
        }
    }

    public GameHealthData() {
        this.heartRateList = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCalorie() {
        return this.calorie;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public List<HeartRate> getHeartRateList() {
        return this.heartRateList;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public int getStressAvg() {
        return this.stressAvg;
    }

    public void setCalorie(int i) {
        this.calorie = i;
    }

    public void setEndTime(long j2) {
        this.endTime = j2;
    }

    public void setHeartRateList(List<HeartRate> list) {
        this.heartRateList = list;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setStartTime(long j2) {
        this.startTime = j2;
    }

    public void setStressAvg(int i) {
        this.stressAvg = i;
    }

    public String toString() {
        return "GameHealthData{packageName='" + this.packageName + "', startTime=" + this.startTime + ", endTime=" + this.endTime + ", calorie=" + this.calorie + ", heartRateList=" + this.heartRateList + ", stressAvg=" + this.stressAvg + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.packageName);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeInt(this.calorie);
        parcel.writeTypedList(this.heartRateList);
        parcel.writeInt(this.stressAvg);
    }

    public GameHealthData(Parcel parcel) {
        this.heartRateList = new ArrayList();
        this.packageName = parcel.readString();
        this.startTime = parcel.readLong();
        this.endTime = parcel.readLong();
        this.calorie = parcel.readInt();
        this.heartRateList = parcel.createTypedArrayList(HeartRate.CREATOR);
        this.stressAvg = parcel.readInt();
    }
}
