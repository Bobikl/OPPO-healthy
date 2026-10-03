package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes12.dex */
public class SearchCity implements Parcelable {
    public static final Parcelable.Creator<SearchCity> CREATOR = new a();
    private String a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f1059c;

    public static class a implements Parcelable.Creator<SearchCity> {
        public static SearchCity a(Parcel parcel) {
            return new SearchCity(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SearchCity createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SearchCity[] newArray(int i) {
            return null;
        }
    }

    public SearchCity(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.f1059c = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getSearchCityAdCode() {
        return this.f1059c;
    }

    public String getSearchCityName() {
        return this.a;
    }

    public String getSearchCitycode() {
        return this.b;
    }

    public void setSearchCityName(String str) {
        this.a = str;
    }

    public void setSearchCitycode(String str) {
        this.b = str;
    }

    public void setSearchCityhAdCode(String str) {
        this.f1059c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.f1059c);
    }

    public SearchCity() {
    }
}
