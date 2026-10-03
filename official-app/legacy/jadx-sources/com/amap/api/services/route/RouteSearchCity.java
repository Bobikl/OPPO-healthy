package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class RouteSearchCity extends SearchCity {
    public static final Parcelable.Creator<RouteSearchCity> CREATOR = new a();
    List<District> a;

    public static class a implements Parcelable.Creator<RouteSearchCity> {
        public static RouteSearchCity a(Parcel parcel) {
            return new RouteSearchCity(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteSearchCity createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RouteSearchCity[] newArray(int i) {
            return null;
        }
    }

    public RouteSearchCity(Parcel parcel) {
        super(parcel);
        this.a = new ArrayList();
        this.a = parcel.createTypedArrayList(District.CREATOR);
    }

    @Override // com.amap.api.services.route.SearchCity, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<District> getDistricts() {
        return this.a;
    }

    public void setDistricts(List<District> list) {
        this.a = list;
    }

    @Override // com.amap.api.services.route.SearchCity, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.a);
    }

    public RouteSearchCity() {
        this.a = new ArrayList();
    }
}
