package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes12.dex */
public class SubPoiItemV2 implements Parcelable {
    public static final Parcelable.Creator<SubPoiItemV2> CREATOR = new a();
    private String a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LatLonPoint f989c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f990e;
    private String f;

    public static class a implements Parcelable.Creator<SubPoiItemV2> {
        public static SubPoiItemV2 a(Parcel parcel) {
            return new SubPoiItemV2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SubPoiItemV2 createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SubPoiItemV2[] newArray(int i) {
            return null;
        }
    }

    public SubPoiItemV2(String str, LatLonPoint latLonPoint, String str2, String str3) {
        this.a = str;
        this.f989c = latLonPoint;
        this.b = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLonPoint getLatLonPoint() {
        return this.f989c;
    }

    public String getPoiId() {
        return this.a;
    }

    public String getSnippet() {
        return this.d;
    }

    public String getSubTypeDes() {
        return this.f990e;
    }

    public String getTitle() {
        return this.b;
    }

    public String getTypeCode() {
        return this.f;
    }

    public void setLatLonPoint(LatLonPoint latLonPoint) {
        this.f989c = latLonPoint;
    }

    public void setPoiId(String str) {
        this.a = str;
    }

    public void setSnippet(String str) {
        this.d = str;
    }

    public void setSubTypeDes(String str) {
        this.f990e = str;
    }

    public void setTitle(String str) {
        this.b = str;
    }

    public void setTypeCode(String str) {
        this.f = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeValue(this.f989c);
        parcel.writeString(this.d);
        parcel.writeString(this.f990e);
        parcel.writeString(this.f);
    }

    public SubPoiItemV2(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.f989c = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.d = parcel.readString();
        this.f990e = parcel.readString();
        this.f = parcel.readString();
    }
}
