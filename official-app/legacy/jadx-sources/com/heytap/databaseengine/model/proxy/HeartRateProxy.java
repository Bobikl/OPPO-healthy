package com.heytap.databaseengine.model.proxy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.model.HeartRate;
import com.heytap.databaseengine.model.SportHealthData;
import com.oplus.weatherservicesdk.data.Weather;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class HeartRateProxy extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<HeartRateProxy> CREATOR = new a();
    private long dataCreatedTimestamp;
    private int heartRateValue;

    public class a implements Parcelable.Creator<HeartRateProxy> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HeartRateProxy createFromParcel(Parcel parcel) {
            return new HeartRateProxy(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HeartRateProxy[] newArray(int i) {
            return new HeartRateProxy[i];
        }
    }

    public HeartRateProxy(@NonNull HeartRate heartRate) {
        this.dataCreatedTimestamp = heartRate.getDataCreatedTimestamp();
        this.heartRateValue = heartRate.getHeartRateValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getDataCreatedTime() {
        return this.dataCreatedTimestamp;
    }

    public int getHeartRateValue() {
        return this.heartRateValue;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "HeartRateProxy:\ndataCreatedTime=" + getDataCreatedTime() + "\nheartRateValue=" + getHeartRateValue() + Weather.SEPARATOR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.dataCreatedTimestamp);
        parcel.writeInt(this.heartRateValue);
    }

    public HeartRateProxy(Parcel parcel) {
        this.dataCreatedTimestamp = parcel.readLong();
        this.heartRateValue = parcel.readInt();
    }
}
