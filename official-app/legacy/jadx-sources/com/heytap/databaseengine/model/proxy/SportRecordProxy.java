package com.heytap.databaseengine.model.proxy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengine.model.SportRecord;
import com.oplus.aiunit.vision.cu4;
import com.oplus.weatherservicesdk.data.Weather;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class SportRecordProxy extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<SportRecordProxy> CREATOR = new a();
    private String deviceType;
    private int distance;
    private long duration;
    private long endTime;
    private String metaData;
    private long startTime;
    private String timezone;
    private int trackType;

    public class a implements Parcelable.Creator<SportRecordProxy> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SportRecordProxy createFromParcel(Parcel parcel) {
            return new SportRecordProxy(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SportRecordProxy[] newArray(int i) {
            return new SportRecordProxy[i];
        }
    }

    public SportRecordProxy(@NonNull SportRecord sportRecord) {
        this.trackType = cu4.l(sportRecord.getTrackType());
        this.startTime = sportRecord.getStartTime();
        this.endTime = sportRecord.getEndTime();
        this.duration = sportRecord.getDuration();
        this.distance = sportRecord.getDistance();
        this.metaData = sportRecord.getMetaData();
        this.timezone = sportRecord.getTimezone();
        this.deviceType = sportRecord.getDeviceType();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public int getDistance() {
        return this.distance;
    }

    public long getDuration() {
        return this.duration;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public String getMetaData() {
        return this.metaData;
    }

    public int getSportMode() {
        return this.trackType;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public String getTimezone() {
        return this.timezone;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "SportRecordProxy:\nstartTime=" + getStartTime() + "\nendTime=" + getEndTime() + "\nsportMode=" + getSportMode() + "\nduration=" + getDuration() + "\ndistance=" + getDistance() + "\nmetaData=" + getMetaData() + "\ntimezone=" + getTimezone() + "\ndeviceType=" + getDeviceType() + Weather.SEPARATOR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.trackType);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeLong(this.duration);
        parcel.writeInt(this.distance);
        parcel.writeString(this.metaData);
        parcel.writeString(this.timezone);
        parcel.writeString(this.deviceType);
    }

    public SportRecordProxy(Parcel parcel) {
        this.trackType = parcel.readInt();
        this.startTime = parcel.readLong();
        this.endTime = parcel.readLong();
        this.duration = parcel.readLong();
        this.distance = parcel.readInt();
        this.metaData = parcel.readString();
        this.timezone = parcel.readString();
        this.deviceType = parcel.readString();
    }
}
