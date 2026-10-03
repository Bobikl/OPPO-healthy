package com.amap.api.maps.offlinemap;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes12.dex */
public class City implements Parcelable {
    public static final Parcelable.Creator<City> CREATOR = new Parcelable.Creator<City>() { // from class: com.amap.api.maps.offlinemap.City.1
        private static City a(Parcel parcel) {
            return new City(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ City createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ City[] newArray(int i) {
            return a(i);
        }

        private static City[] a(int i) {
            return new City[i];
        }
    };
    private String a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f914c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f915e;

    public City() {
        this.a = "";
        this.b = "";
        this.f914c = "";
        this.d = "";
        this.f915e = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdcode() {
        return this.f915e;
    }

    public String getCity() {
        return this.a;
    }

    public String getCode() {
        return this.b;
    }

    public String getJianpin() {
        return this.f914c;
    }

    public String getPinyin() {
        return this.d;
    }

    public void setAdcode(String str) {
        this.f915e = str;
    }

    public void setCity(String str) {
        this.a = str;
    }

    public void setCode(String str) {
        if (str == null || "[]".equals(str)) {
            return;
        }
        this.b = str;
    }

    public void setJianpin(String str) {
        this.f914c = str;
    }

    public void setPinyin(String str) {
        this.d = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.f914c);
        parcel.writeString(this.d);
        parcel.writeString(this.f915e);
    }

    public City(Parcel parcel) {
        this.a = "";
        this.b = "";
        this.f914c = "";
        this.d = "";
        this.f915e = "";
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.f914c = parcel.readString();
        this.d = parcel.readString();
        this.f915e = parcel.readString();
    }
}
