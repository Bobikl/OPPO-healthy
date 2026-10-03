package com.heytap.databaseengine.model.proxy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengine.model.bloodoxygensaturation.BloodOxygenSaturation;
import com.oplus.weatherservicesdk.data.Weather;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class BloodOxygenSaturationProxy extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<BloodOxygenSaturationProxy> CREATOR = new a();
    private int bloodOxygenSaturationValue;
    private long dataCreatedTimestamp;

    public class a implements Parcelable.Creator<BloodOxygenSaturationProxy> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BloodOxygenSaturationProxy createFromParcel(Parcel parcel) {
            return new BloodOxygenSaturationProxy(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BloodOxygenSaturationProxy[] newArray(int i) {
            return new BloodOxygenSaturationProxy[i];
        }
    }

    public BloodOxygenSaturationProxy(@NonNull BloodOxygenSaturation bloodOxygenSaturation) {
        this.dataCreatedTimestamp = bloodOxygenSaturation.getDataCreatedTimestamp();
        this.bloodOxygenSaturationValue = bloodOxygenSaturation.getBloodOxygenSaturationValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getDataCreatedTime() {
        return this.dataCreatedTimestamp;
    }

    public int getSpO2() {
        return this.bloodOxygenSaturationValue;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "BloodOxygenSaturationProxy:\ndataCreatedTime=" + getDataCreatedTime() + "\nSpO2=" + getSpO2() + Weather.SEPARATOR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.dataCreatedTimestamp);
        parcel.writeInt(this.bloodOxygenSaturationValue);
    }

    public BloodOxygenSaturationProxy(Parcel parcel) {
        this.dataCreatedTimestamp = parcel.readLong();
        this.bloodOxygenSaturationValue = parcel.readInt();
    }
}
