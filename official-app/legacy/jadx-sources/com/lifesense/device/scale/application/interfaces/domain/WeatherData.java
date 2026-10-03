package com.lifesense.device.scale.application.interfaces.domain;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class WeatherData implements Parcelable {
    public static final Parcelable.Creator<WeatherData> CREATOR = new Parcelable.Creator<WeatherData>() { // from class: com.lifesense.device.scale.application.interfaces.domain.WeatherData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WeatherData createFromParcel(Parcel parcel) {
            return new WeatherData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WeatherData[] newArray(int i) {
            return new WeatherData[i];
        }
    };
    public String city;
    public long updateTime;
    public List<WeatherFuture> weatherFutures;

    public WeatherData() {
    }

    public WeatherData(Parcel parcel) {
        this.updateTime = parcel.readLong();
        if (this.weatherFutures == null) {
            this.weatherFutures = new ArrayList();
        }
        this.weatherFutures = parcel.readArrayList(WeatherFuture.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCity() {
        return TextUtils.isEmpty(this.city) ? "" : this.city;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public List<WeatherFuture> getWeatherFutures() {
        return this.weatherFutures;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setUpdateTime(long j2) {
        this.updateTime = j2;
    }

    public void setWeatherFutures(List<WeatherFuture> list) {
        this.weatherFutures = list;
    }

    public String toString() {
        return "WeatherData{updateTime=" + this.updateTime + "weatherFutures=" + this.weatherFutures + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.updateTime);
        parcel.writeList(this.weatherFutures);
    }
}
