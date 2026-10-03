package com.amap.api.services.weather;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class LocalWeatherForecast implements Parcelable {
    public static final Parcelable.Creator<LocalWeatherForecast> CREATOR = new a();
    private String a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f1081c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<LocalDayWeatherForecast> f1082e;

    public static class a implements Parcelable.Creator<LocalWeatherForecast> {
        public static LocalWeatherForecast a(Parcel parcel) {
            return new LocalWeatherForecast(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LocalWeatherForecast createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LocalWeatherForecast[] newArray(int i) {
            return null;
        }
    }

    public LocalWeatherForecast() {
        this.f1082e = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdCode() {
        return this.f1081c;
    }

    public String getCity() {
        return this.b;
    }

    public String getProvince() {
        return this.a;
    }

    public String getReportTime() {
        return this.d;
    }

    public List<LocalDayWeatherForecast> getWeatherForecast() {
        return this.f1082e;
    }

    public void setAdCode(String str) {
        this.f1081c = str;
    }

    public void setCity(String str) {
        this.b = str;
    }

    public void setProvince(String str) {
        this.a = str;
    }

    public void setReportTime(String str) {
        this.d = str;
    }

    public void setWeatherForecast(List<LocalDayWeatherForecast> list) {
        this.f1082e = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.f1081c);
        parcel.writeString(this.d);
        parcel.writeList(this.f1082e);
    }

    public LocalWeatherForecast(Parcel parcel) {
        this.f1082e = new ArrayList();
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.f1081c = parcel.readString();
        this.d = parcel.readString();
        this.f1082e = parcel.readArrayList(LocalWeatherForecast.class.getClassLoader());
    }
}
