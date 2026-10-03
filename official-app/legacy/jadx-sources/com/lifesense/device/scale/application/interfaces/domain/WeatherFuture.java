package com.lifesense.device.scale.application.interfaces.domain;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class WeatherFuture implements Parcelable {
    public static final Parcelable.Creator<WeatherFuture> CREATOR = new Parcelable.Creator<WeatherFuture>() { // from class: com.lifesense.device.scale.application.interfaces.domain.WeatherFuture.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WeatherFuture createFromParcel(Parcel parcel) {
            return new WeatherFuture(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WeatherFuture[] newArray(int i) {
            return new WeatherFuture[i];
        }
    };
    public int aqi;
    public int temperature1;
    public int temperature2;
    public int weatherState;

    public WeatherFuture() {
    }

    public WeatherFuture(Parcel parcel) {
        this.weatherState = parcel.readInt();
        this.temperature1 = parcel.readInt();
        this.temperature2 = parcel.readInt();
        this.aqi = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAqi() {
        return this.aqi;
    }

    public int getTemperature1() {
        return this.temperature1;
    }

    public int getTemperature2() {
        return this.temperature2;
    }

    public int getWeatherState() {
        return this.weatherState;
    }

    public void setAqi(int i) {
        this.aqi = i;
    }

    public void setTemperature1(int i) {
        this.temperature1 = i;
    }

    public void setTemperature2(int i) {
        this.temperature2 = i;
    }

    public void setWeatherState(int i) {
        this.weatherState = i;
    }

    public String toString() {
        return "WeatherFuture [weatherState=" + this.weatherState + ", temperature1=" + this.temperature1 + ", temperature2=" + this.temperature2 + ", aqi=" + this.aqi + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.weatherState);
        parcel.writeInt(this.temperature1);
        parcel.writeInt(this.temperature2);
        parcel.writeInt(this.aqi);
    }
}
