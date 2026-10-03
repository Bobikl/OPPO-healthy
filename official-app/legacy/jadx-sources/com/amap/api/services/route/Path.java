package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class Path implements Parcelable {
    public static final Parcelable.Creator<Path> CREATOR = new a();
    private float a;
    private long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<LatLonPoint> f1025c;

    public static class a implements Parcelable.Creator<Path> {
        public static Path a(Parcel parcel) {
            return new Path(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Path createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Path[] newArray(int i) {
            return null;
        }
    }

    public Path(Parcel parcel) {
        this.f1025c = new ArrayList();
        this.a = parcel.readFloat();
        this.b = parcel.readLong();
        this.f1025c = parcel.createTypedArrayList(LatLonPoint.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getDistance() {
        return this.a;
    }

    public long getDuration() {
        return this.b;
    }

    public List<LatLonPoint> getPolyline() {
        return this.f1025c;
    }

    public void setDistance(float f) {
        this.a = f;
    }

    public void setDuration(long j2) {
        this.b = j2;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.f1025c = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
        parcel.writeLong(this.b);
        parcel.writeTypedList(this.f1025c);
    }

    public Path() {
        this.f1025c = new ArrayList();
    }
}
