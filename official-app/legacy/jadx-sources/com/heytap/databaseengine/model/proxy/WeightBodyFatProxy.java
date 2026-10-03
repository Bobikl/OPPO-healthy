package com.heytap.databaseengine.model.proxy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengine.model.weight.WeightBodyFat;
import com.oplus.weatherservicesdk.data.Weather;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class WeightBodyFatProxy extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<WeightBodyFatProxy> CREATOR = new a();
    private String bmi;
    private long measurementTime;
    private String weight;

    public class a implements Parcelable.Creator<WeightBodyFatProxy> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeightBodyFatProxy createFromParcel(Parcel parcel) {
            return new WeightBodyFatProxy(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public WeightBodyFatProxy[] newArray(int i) {
            return new WeightBodyFatProxy[i];
        }
    }

    public WeightBodyFatProxy(WeightBodyFat weightBodyFat) {
        this.weight = weightBodyFat.getWeight();
        this.bmi = weightBodyFat.getBmi();
        this.measurementTime = weightBodyFat.getMeasurementTime();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBmi() {
        return this.bmi;
    }

    public long getMeasurementTime() {
        return this.measurementTime;
    }

    public String getWeight() {
        return this.weight;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "WeightBodyFatProxy:\nweight=" + getWeight() + "\nBMI=" + getBmi() + "\nmeasurementTime=" + getMeasurementTime() + Weather.SEPARATOR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.weight);
        parcel.writeString(this.bmi);
        parcel.writeLong(this.measurementTime);
    }

    public WeightBodyFatProxy(Parcel parcel) {
        this.weight = parcel.readString();
        this.bmi = parcel.readString();
        this.measurementTime = parcel.readLong();
    }
}
