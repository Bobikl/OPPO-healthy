package com.amap.api.maps.offlinemap;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class OfflineMapProvince extends Province {
    public static final Parcelable.Creator<OfflineMapProvince> CREATOR = new Parcelable.Creator<OfflineMapProvince>() { // from class: com.amap.api.maps.offlinemap.OfflineMapProvince.1
        private static OfflineMapProvince a(Parcel parcel) {
            return new OfflineMapProvince(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OfflineMapProvince createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OfflineMapProvince[] newArray(int i) {
            return a(i);
        }

        private static OfflineMapProvince[] a(int i) {
            return new OfflineMapProvince[i];
        }
    };
    private String a;
    private int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f924c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f925e;
    private ArrayList<OfflineMapCity> f;

    public OfflineMapProvince() {
        this.b = 6;
        this.f925e = 0;
    }

    @Override // com.amap.api.maps.offlinemap.Province, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ArrayList<OfflineMapCity> getCityList() {
        ArrayList<OfflineMapCity> arrayList = this.f;
        return arrayList == null ? new ArrayList<>() : arrayList;
    }

    public ArrayList<OfflineMapCity> getDownloadedCityList() {
        ArrayList<OfflineMapCity> arrayList = new ArrayList<>();
        ArrayList<OfflineMapCity> arrayList2 = this.f;
        if (arrayList2 == null) {
            return arrayList;
        }
        for (OfflineMapCity offlineMapCity : arrayList2) {
            if (offlineMapCity.getState() != 6) {
                arrayList.add(offlineMapCity);
            }
        }
        return arrayList;
    }

    public long getSize() {
        return this.f924c;
    }

    public int getState() {
        return this.b;
    }

    public String getUrl() {
        return this.a;
    }

    public String getVersion() {
        return this.d;
    }

    public int getcompleteCode() {
        return this.f925e;
    }

    public void setCityList(ArrayList<OfflineMapCity> arrayList) {
        this.f = arrayList;
    }

    public void setCompleteCode(int i) {
        this.f925e = i;
    }

    public void setSize(long j2) {
        this.f924c = j2;
    }

    public void setState(int i) {
        this.b = i;
    }

    public void setUrl(String str) {
        this.a = str;
    }

    public void setVersion(String str) {
        this.d = str;
    }

    @Override // com.amap.api.maps.offlinemap.Province, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeLong(this.f924c);
        parcel.writeString(this.d);
        parcel.writeInt(this.f925e);
        parcel.writeTypedList(this.f);
    }

    public OfflineMapProvince(Parcel parcel) {
        super(parcel);
        this.b = 6;
        this.f925e = 0;
        this.a = parcel.readString();
        this.b = parcel.readInt();
        this.f924c = parcel.readLong();
        this.d = parcel.readString();
        this.f925e = parcel.readInt();
        this.f = parcel.createTypedArrayList(OfflineMapCity.CREATOR);
    }
}
