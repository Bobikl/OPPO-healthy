package com.heytap.databaseengine.model.physiqueevaluation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class PhysiqueMeasureDetail extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<PhysiqueMeasureDetail> CREATOR = new a();
    private int ageRange;
    private String deviceUniqueId;
    private String evaluationName;
    private String extension;
    private int gender;
    private int lastScore;
    private String ssoid;
    private int syncStatus;
    private int trainEvaluation;
    private int trainId;
    private int trainParentId;
    private double trainRank;
    private int trainResult;
    private int trainScore;
    private long trainTime;
    private long updateTime;

    public class a implements Parcelable.Creator<PhysiqueMeasureDetail> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PhysiqueMeasureDetail createFromParcel(Parcel parcel) {
            return new PhysiqueMeasureDetail(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PhysiqueMeasureDetail[] newArray(int i) {
            return new PhysiqueMeasureDetail[i];
        }
    }

    public PhysiqueMeasureDetail() {
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

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public String getEvaluationName() {
        return this.evaluationName;
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

    public int getTrainEvaluation() {
        return this.trainEvaluation;
    }

    public int getTrainId() {
        return this.trainId;
    }

    public int getTrainParentId() {
        return this.trainParentId;
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

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setEvaluationName(String str) {
        this.evaluationName = str;
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

    public void setTrainEvaluation(int i) {
        this.trainEvaluation = i;
    }

    public void setTrainId(int i) {
        this.trainId = i;
    }

    public void setTrainParentId(int i) {
        this.trainParentId = i;
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
        return "PhysiqueMeasureDetail{ssoid='" + this.ssoid + "', gender=" + this.gender + ", ageRange=" + this.ageRange + ", deviceUniqueId='" + this.deviceUniqueId + "', trainTime=" + this.trainTime + ", trainId=" + this.trainId + ", evaluationName='" + this.evaluationName + "', trainParentId=" + this.trainParentId + ", trainResult=" + this.trainResult + ", trainEvaluation=" + this.trainEvaluation + ", trainRank=" + this.trainRank + ", trainScore=" + this.trainScore + ", lastScore=" + this.lastScore + ", extension='" + this.extension + "', updateTime=" + this.updateTime + ", syncStatus=" + this.syncStatus + "} ";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeInt(this.gender);
        parcel.writeInt(this.ageRange);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeInt(this.trainId);
        parcel.writeString(this.evaluationName);
        parcel.writeInt(this.trainParentId);
        parcel.writeLong(this.trainTime);
        parcel.writeInt(this.trainResult);
        parcel.writeInt(this.lastScore);
        parcel.writeInt(this.trainEvaluation);
        parcel.writeDouble(this.trainRank);
        parcel.writeInt(this.trainScore);
        parcel.writeString(this.extension);
        parcel.writeLong(this.updateTime);
        parcel.writeInt(this.syncStatus);
    }

    public PhysiqueMeasureDetail(Parcel parcel) {
        this.updateTime = 0L;
        this.syncStatus = 0;
        this.ssoid = parcel.readString();
        this.gender = parcel.readInt();
        this.ageRange = parcel.readInt();
        this.deviceUniqueId = parcel.readString();
        this.trainId = parcel.readInt();
        this.evaluationName = parcel.readString();
        this.trainParentId = parcel.readInt();
        this.trainTime = parcel.readLong();
        this.trainResult = parcel.readInt();
        this.lastScore = parcel.readInt();
        this.trainEvaluation = parcel.readInt();
        this.trainRank = parcel.readDouble();
        this.trainScore = parcel.readInt();
        this.extension = parcel.readString();
        this.updateTime = parcel.readLong();
        this.syncStatus = parcel.readInt();
    }
}
