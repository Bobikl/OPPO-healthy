package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateFormat;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class Spo2Warning extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<Spo2Warning> CREATOR = new a();
    private String deviceUniqueId;
    private long endTimestamp;
    private Integer highestValue;
    private Integer lowestValue;
    private String ssoid;
    private long startTimestamp;

    public class a implements Parcelable.Creator<Spo2Warning> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Spo2Warning createFromParcel(Parcel parcel) {
            return new Spo2Warning(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Spo2Warning[] newArray(int i) {
            return new Spo2Warning[i];
        }
    }

    public Spo2Warning() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return this.endTimestamp;
    }

    public int getHighestValue() {
        return this.highestValue.intValue();
    }

    public int getLowestValue() {
        return this.lowestValue.intValue();
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public void setHighestValue(int i) {
        this.highestValue = Integer.valueOf(i);
    }

    public void setLowestValue(int i) {
        this.lowestValue = Integer.valueOf(i);
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "Spo2Warning{ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', lowestValue=" + this.lowestValue + ", highestValue=" + this.highestValue + ", startTimestamp=" + ((Object) DateFormat.format("yyyy/MM/dd HH:mm:ss", this.startTimestamp)) + ", endTimestamp=" + ((Object) DateFormat.format("yyyy/MM/dd HH:mm:ss", this.endTimestamp)) + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeInt(this.lowestValue.intValue());
        parcel.writeInt(this.highestValue.intValue());
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
    }

    public Spo2Warning(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.lowestValue = Integer.valueOf(parcel.readInt());
        this.highestValue = Integer.valueOf(parcel.readInt());
        this.startTimestamp = parcel.readLong();
        this.endTimestamp = parcel.readLong();
    }
}
