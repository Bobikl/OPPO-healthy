package com.heytap.health.core.widget.charts.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateFormat;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class TimeStampedData implements Parcelable {
    public static final Parcelable.Creator<TimeStampedData> CREATOR = new a();
    private int color;
    private HealthGradientColor gradientColor;
    private int heartRateType;
    protected long timestamp;
    private float y;
    private boolean bloodOxDottedFlag = false;
    private boolean disconnect = false;

    public class a implements Parcelable.Creator<TimeStampedData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TimeStampedData createFromParcel(Parcel parcel) {
            return new TimeStampedData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TimeStampedData[] newArray(int i) {
            return new TimeStampedData[i];
        }
    }

    public TimeStampedData() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TimeStampedData) && this.timestamp == ((TimeStampedData) obj).timestamp;
    }

    public boolean getBloodOxDottedFlag() {
        return this.bloodOxDottedFlag;
    }

    public int getColor() {
        return this.color;
    }

    public HealthGradientColor getGradientColor() {
        return this.gradientColor;
    }

    public int getHeartRateType() {
        return this.heartRateType;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public float getY() {
        return this.y;
    }

    public boolean isDisconnect() {
        return this.disconnect;
    }

    public void setBloodOxDottedFlag(boolean z) {
        this.bloodOxDottedFlag = z;
    }

    public void setColor(int i) {
        this.color = i;
    }

    public void setDisconnect(boolean z) {
        this.disconnect = z;
    }

    public void setGradientColor(HealthGradientColor healthGradientColor) {
        this.gradientColor = healthGradientColor;
    }

    public void setHeartRateType(int i) {
        this.heartRateType = i;
    }

    public void setTimestamp(long j2) {
        this.timestamp = j2;
    }

    public void setY(float f) {
        this.y = f;
    }

    public String toString() {
        return "TimeStampedData{timestamp=" + this.timestamp + "/" + ((Object) DateFormat.format("yyyy/MM/dd HH:mm:ss", this.timestamp)) + ", y=" + this.y + ", color=" + this.color + ", gradientColor=" + this.gradientColor + ", heartRateType=" + this.heartRateType + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.timestamp);
        parcel.writeFloat(this.y);
        parcel.writeInt(this.color);
        parcel.writeInt(this.heartRateType);
        parcel.writeParcelable(this.gradientColor, i);
    }

    public TimeStampedData(long j2, float f) {
        this.timestamp = j2;
        this.y = f;
    }

    public TimeStampedData(long j2, float f, int i) {
        this.timestamp = j2;
        this.y = f;
        this.color = i;
    }

    public TimeStampedData(long j2, float f, HealthGradientColor healthGradientColor) {
        this.timestamp = j2;
        this.y = f;
        this.gradientColor = healthGradientColor;
    }

    public TimeStampedData(Parcel parcel) {
        this.timestamp = parcel.readLong();
        this.y = parcel.readFloat();
        this.color = parcel.readInt();
        this.heartRateType = parcel.readInt();
        this.gradientColor = (HealthGradientColor) parcel.readParcelable(HealthGradientColor.class.getClassLoader());
    }
}
