package com.heytap.databaseengine.model.proxy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengine.model.stress.Stress;
import com.oplus.weatherservicesdk.data.Weather;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class StressProxy extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<StressProxy> CREATOR = new a();
    private long dataCreatedTimestamp;
    private int stressValue;

    public class a implements Parcelable.Creator<StressProxy> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StressProxy createFromParcel(Parcel parcel) {
            return new StressProxy(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StressProxy[] newArray(int i) {
            return new StressProxy[i];
        }
    }

    public StressProxy(@NonNull Stress stress) {
        this.dataCreatedTimestamp = stress.getDataCreatedTimestamp();
        this.stressValue = stress.getStressValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getDataCreatedTime() {
        return this.dataCreatedTimestamp;
    }

    public int getStressValue() {
        return this.stressValue;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "StressProxy:\ndataCreatedTime=" + getDataCreatedTime() + "\nstressValue=" + getStressValue() + Weather.SEPARATOR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.dataCreatedTimestamp);
        parcel.writeInt(this.stressValue);
    }

    public StressProxy(Parcel parcel) {
        this.dataCreatedTimestamp = parcel.readLong();
        this.stressValue = parcel.readInt();
    }
}
