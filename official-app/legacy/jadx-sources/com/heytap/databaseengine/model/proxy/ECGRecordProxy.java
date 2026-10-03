package com.heytap.databaseengine.model.proxy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.model.ECGRecord;
import com.heytap.databaseengine.model.SportHealthData;
import com.oplus.weatherservicesdk.data.Weather;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class ECGRecordProxy extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<ECGRecordProxy> CREATOR = new a();
    private int avgHeartRate;
    private long endTimestamp;
    private String expertInterpretation;
    private int hand;
    private long startTimestamp;

    public class a implements Parcelable.Creator<ECGRecordProxy> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ECGRecordProxy createFromParcel(Parcel parcel) {
            return new ECGRecordProxy(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ECGRecordProxy[] newArray(int i) {
            return new ECGRecordProxy[i];
        }
    }

    public ECGRecordProxy(@NonNull ECGRecord eCGRecord) {
        this.startTimestamp = eCGRecord.getStartTimestamp();
        this.endTimestamp = eCGRecord.getEndTimestamp();
        this.hand = eCGRecord.getHand();
        this.avgHeartRate = eCGRecord.getAvgHeartRate();
        this.expertInterpretation = eCGRecord.getExpertInterpretation();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAvgHeartRate() {
        return this.avgHeartRate;
    }

    public long getEndTime() {
        return this.endTimestamp;
    }

    public String getExpertInterpretation() {
        return this.expertInterpretation;
    }

    public int getHand() {
        return this.hand;
    }

    public long getStartTime() {
        return this.startTimestamp;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "ECGRecordProxy:\nstartTime=" + getStartTime() + "\nendTime=" + getEndTime() + "\nhand=" + getHand() + "\navgHeartRate=" + getAvgHeartRate() + "\nexpertInterpretation" + getExpertInterpretation() + Weather.SEPARATOR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeInt(this.hand);
        parcel.writeInt(this.avgHeartRate);
        parcel.writeString(this.expertInterpretation);
    }

    public ECGRecordProxy(Parcel parcel) {
        this.startTimestamp = parcel.readLong();
        this.endTimestamp = parcel.readLong();
        this.hand = parcel.readInt();
        this.avgHeartRate = parcel.readInt();
        this.expertInterpretation = parcel.readString();
    }
}
