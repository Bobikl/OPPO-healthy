package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes12.dex */
public class Business implements Parcelable {
    public static final Parcelable.Creator<Business> CREATOR = new a();
    private String a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f981c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f982e;
    private String f;
    private String g;
    private String h;
    private String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f983j;

    public static class a implements Parcelable.Creator<Business> {
        public static Business a(Parcel parcel) {
            return new Business(parcel);
        }

        public static Business[] b(int i) {
            return new Business[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Business createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Business[] newArray(int i) {
            return b(i);
        }
    }

    public Business(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.a = str;
        this.b = str2;
        this.f981c = str3;
        this.d = str4;
        this.f982e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAlias() {
        return this.i;
    }

    public String getBusinessArea() {
        return this.a;
    }

    public String getCPID() {
        return this.f983j;
    }

    public String getCost() {
        return this.g;
    }

    public String getOpentimeToday() {
        return this.b;
    }

    public String getOpentimeWeek() {
        return this.f981c;
    }

    public String getParkingType() {
        return this.h;
    }

    public String getTag() {
        return this.f982e;
    }

    public String getTel() {
        return this.d;
    }

    public String getmRating() {
        return this.f;
    }

    public void setCPID(String str) {
        this.f983j = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.f981c);
        parcel.writeString(this.d);
        parcel.writeString(this.f982e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.f983j);
    }

    public Business(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.f981c = parcel.readString();
        this.d = parcel.readString();
        this.f982e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.f983j = parcel.readString();
    }
}
