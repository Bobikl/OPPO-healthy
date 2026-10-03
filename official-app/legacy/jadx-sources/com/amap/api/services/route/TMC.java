package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class TMC implements Parcelable {
    public static final Parcelable.Creator<TMC> CREATOR = new a();
    private int a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<LatLonPoint> f1060c;

    public static class a implements Parcelable.Creator<TMC> {
        public static TMC a(Parcel parcel) {
            return new TMC(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TMC createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TMC[] newArray(int i) {
            return null;
        }
    }

    public TMC(Parcel parcel) {
        this.f1060c = new ArrayList();
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.f1060c = parcel.createTypedArrayList(LatLonPoint.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDistance() {
        return this.a;
    }

    public List<LatLonPoint> getPolyline() {
        return this.f1060c;
    }

    public String getStatus() {
        return this.b;
    }

    public void setDistance(int i) {
        this.a = i;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.f1060c = list;
    }

    public void setStatus(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeTypedList(this.f1060c);
    }

    public TMC() {
        this.f1060c = new ArrayList();
    }
}
