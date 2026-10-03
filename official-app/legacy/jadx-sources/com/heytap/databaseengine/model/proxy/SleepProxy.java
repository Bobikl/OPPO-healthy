package com.heytap.databaseengine.model.proxy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.model.Sleep;
import com.heytap.databaseengine.model.SportHealthData;
import com.oplus.weatherservicesdk.data.Weather;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class SleepProxy extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<SleepProxy> CREATOR = new a();
    private long endTimestamp;
    private int sleepState;
    private int sleepType;
    private long startTimestamp;

    public class a implements Parcelable.Creator<SleepProxy> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SleepProxy createFromParcel(Parcel parcel) {
            return new SleepProxy(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SleepProxy[] newArray(int i) {
            return new SleepProxy[i];
        }
    }

    public SleepProxy(@NonNull Sleep sleep) {
        this.startTimestamp = sleep.getStartTimestamp();
        this.endTimestamp = sleep.getEndTimestamp();
        this.sleepType = sleep.getSleepType();
        this.sleepState = sleep.getSleepState();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getEndTime() {
        return this.endTimestamp;
    }

    public int getSleepState() {
        return this.sleepState;
    }

    public int getSleepType() {
        return this.sleepType;
    }

    public long getStartTime() {
        return this.startTimestamp;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "SleepProxy:\nstartTime=" + getStartTime() + "\nendTime=" + getEndTime() + "\nsleepType=" + getSleepType() + "\nsleepState=" + getSleepState() + Weather.SEPARATOR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeInt(this.sleepType);
        parcel.writeInt(this.sleepState);
    }

    public SleepProxy(Parcel parcel) {
        this.startTimestamp = parcel.readLong();
        this.endTimestamp = parcel.readLong();
        this.sleepType = parcel.readInt();
        this.sleepState = parcel.readInt();
    }
}
