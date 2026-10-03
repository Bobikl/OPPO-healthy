package com.amap.api.maps.offlinemap;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes12.dex */
public class Province implements Parcelable {
    public static final Parcelable.Creator<Province> CREATOR = new Parcelable.Creator<Province>() { // from class: com.amap.api.maps.offlinemap.Province.1
        private static Province a(Parcel parcel) {
            return new Province(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Province createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Province[] newArray(int i) {
            return a(i);
        }

        private static Province[] a(int i) {
            return new Province[i];
        }
    };
    private String a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f926c;
    private String d;

    public Province() {
        this.a = "";
        this.d = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getJianpin() {
        return this.b;
    }

    public String getPinyin() {
        return this.f926c;
    }

    public String getProvinceCode() {
        return this.d;
    }

    public String getProvinceName() {
        return this.a;
    }

    public void setJianpin(String str) {
        this.b = str;
    }

    public void setPinyin(String str) {
        this.f926c = str;
    }

    public void setProvinceCode(String str) {
        this.d = str;
    }

    public void setProvinceName(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.f926c);
        parcel.writeString(this.d);
    }

    public Province(Parcel parcel) {
        this.a = "";
        this.d = "";
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.f926c = parcel.readString();
        this.d = parcel.readString();
    }
}
