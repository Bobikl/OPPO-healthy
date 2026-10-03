package com.heytap.databaseengine.model.physiqueevaluation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class PhysiqueMeasureAll extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<PhysiqueMeasureAll> CREATOR = new a();
    private int ageRange;
    private int completeCount;
    private String extension;
    private int gender;
    private int lastScore;
    private String ssoid;
    private int syncStatus;
    private String trainConclusion;
    private int trainEvaluation;
    private double trainRank;
    private int trainResult;
    private int trainScore;
    private long trainTime;
    private long updateTime;

    public class a implements Parcelable.Creator<PhysiqueMeasureAll> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PhysiqueMeasureAll createFromParcel(Parcel parcel) {
            return new PhysiqueMeasureAll(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PhysiqueMeasureAll[] newArray(int i) {
            return new PhysiqueMeasureAll[i];
        }
    }

    public PhysiqueMeasureAll() {
        this.updateTime = 0L;
        this.syncStatus = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAgeRange() {
        return this.ageRange;
    }

    public int getCompleteCount() {
        return this.completeCount;
    }

    public String getExtension() {
        return this.extension;
    }

    public int getGender() {
        return this.gender;
    }

    public int getLastScore() {
        return this.lastScore;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public String getTrainConclusion() {
        return this.trainConclusion;
    }

    public int getTrainEvaluation() {
        return this.trainEvaluation;
    }

    public double getTrainRank() {
        return this.trainRank;
    }

    public int getTrainResult() {
        return this.trainResult;
    }

    public int getTrainScore() {
        return this.trainScore;
    }

    public long getTrainTime() {
        return this.trainTime;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public void setAgeRange(int i) {
        this.ageRange = i;
    }

    public void setCompleteCount(int i) {
        this.completeCount = i;
    }

    public void setExtension(String str) {
        this.extension = str;
    }

    public void setGender(int i) {
        this.gender = i;
    }

    public void setLastScore(int i) {
        this.lastScore = i;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setTrainConclusion(String str) {
        this.trainConclusion = str;
    }

    public void setTrainEvaluation(int i) {
        this.trainEvaluation = i;
    }

    public void setTrainRank(double d) {
        this.trainRank = d;
    }

    public void setTrainResult(int i) {
        this.trainResult = i;
    }

    public void setTrainScore(int i) {
        this.trainScore = i;
    }

    public void setTrainTime(long j2) {
        this.trainTime = j2;
    }

    public void setUpdateTime(long j2) {
        this.updateTime = j2;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "PhysiqueMeasureAll{ssoid='" + this.ssoid + "', gender=" + this.gender + ", ageRange=" + this.ageRange + ", trainTime=" + this.trainTime + ", trainResult=" + this.trainResult + ", trainEvaluation=" + this.trainEvaluation + ", trainRank=" + this.trainRank + ", trainScore=" + this.trainScore + ", lastScore=" + this.lastScore + ", completeCount=" + this.completeCount + ", trainConclusion='" + this.trainConclusion + "', extension='" + this.extension + "', updateTime=" + this.updateTime + ", syncStatus=" + this.syncStatus + "} ";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeInt(this.gender);
        parcel.writeInt(this.ageRange);
        parcel.writeLong(this.trainTime);
        parcel.writeInt(this.trainResult);
        parcel.writeInt(this.trainEvaluation);
        parcel.writeDouble(this.trainRank);
        parcel.writeInt(this.trainScore);
        parcel.writeInt(this.lastScore);
        parcel.writeInt(this.completeCount);
        parcel.writeString(this.trainConclusion);
        parcel.writeString(this.extension);
        parcel.writeLong(this.updateTime);
        parcel.writeInt(this.syncStatus);
    }

    public PhysiqueMeasureAll(Parcel parcel) {
        this.updateTime = 0L;
        this.syncStatus = 0;
        this.ssoid = parcel.readString();
        this.gender = parcel.readInt();
        this.ageRange = parcel.readInt();
        this.trainTime = parcel.readLong();
        this.trainResult = parcel.readInt();
        this.trainEvaluation = parcel.readInt();
        this.trainRank = parcel.readDouble();
        this.trainScore = parcel.readInt();
        this.lastScore = parcel.readInt();
        this.completeCount = parcel.readInt();
        this.trainConclusion = parcel.readString();
        this.extension = parcel.readString();
        this.updateTime = parcel.readLong();
        this.syncStatus = parcel.readInt();
    }
}
