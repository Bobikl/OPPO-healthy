package com.amap.api.services.weather;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes12.dex */
public class LocalWeatherLive implements Parcelable {
    public static final Parcelable.Creator<LocalWeatherLive> CREATOR = new a();
    private String a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f1083c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f1084e;
    private String f;
    private String g;
    private String h;
    private String i;

    public static class a implements Parcelable.Creator<LocalWeatherLive> {
        public static LocalWeatherLive a(Parcel parcel) {
            return new LocalWeatherLive(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LocalWeatherLive createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LocalWeatherLive[] newArray(int i) {
            return null;
        }
    }

    public LocalWeatherLive() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdCode() {
        return this.f1083c;
    }

    public String getCity() {
        return this.b;
    }

    public String getHumidity() {
        return this.h;
    }

    public String getProvince() {
        return this.a;
    }

    public String getReportTime() {
        return this.i;
    }

    public String getTemperature() {
        return this.f1084e;
    }

    public String getWeather() {
        return this.d;
    }

    public String getWindDirection() {
        return this.f;
    }

    public String getWindPower() {
        return this.g;
    }

    public void setAdCode(String str) {
        this.f1083c = str;
    }

    public void setCity(String str) {
        this.b = str;
    }

    public void setHumidity(String str) {
        this.h = str;
    }

    public void setProvince(String str) {
        this.a = str;
    }

    public void setReportTime(String str) {
        this.i = str;
    }

    public void setTemperature(String str) {
        this.f1084e = str;
    }

    public void setWeather(String str) {
        this.d = str;
    }

    public void setWindDirection(String str) {
        this.f = str;
    }

    public void setWindPower(String str) {
        this.g = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.f1083c);
        parcel.writeString(this.d);
        parcel.writeString(this.f1084e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
    }

    public LocalWeatherLive(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.f1083c = parcel.readString();
        this.d = parcel.readString();
        this.f1084e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
    }
}
