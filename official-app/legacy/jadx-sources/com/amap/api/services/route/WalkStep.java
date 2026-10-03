package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class WalkStep implements Parcelable {
    public static final Parcelable.Creator<WalkStep> CREATOR = new a();
    private String a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f1074c;
    private float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f1075e;
    private List<LatLonPoint> f;
    private String g;
    private String h;
    private int i;

    public static class a implements Parcelable.Creator<WalkStep> {
        public static WalkStep a(Parcel parcel) {
            return new WalkStep(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ WalkStep createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ WalkStep[] newArray(int i) {
            return null;
        }
    }

    public WalkStep(Parcel parcel) {
        this.f = new ArrayList();
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.f1074c = parcel.readString();
        this.d = parcel.readFloat();
        this.f1075e = parcel.readFloat();
        this.f = parcel.createTypedArrayList(LatLonPoint.CREATOR);
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAction() {
        return this.g;
    }

    public String getAssistantAction() {
        return this.h;
    }

    public float getDistance() {
        return this.d;
    }

    public float getDuration() {
        return this.f1075e;
    }

    public String getInstruction() {
        return this.a;
    }

    public String getOrientation() {
        return this.b;
    }

    public List<LatLonPoint> getPolyline() {
        return this.f;
    }

    public String getRoad() {
        return this.f1074c;
    }

    public int getRoadType() {
        return this.i;
    }

    public void setAction(String str) {
        this.g = str;
    }

    public void setAssistantAction(String str) {
        this.h = str;
    }

    public void setDistance(float f) {
        this.d = f;
    }

    public void setDuration(float f) {
        this.f1075e = f;
    }

    public void setInstruction(String str) {
        this.a = str;
    }

    public void setOrientation(String str) {
        this.b = str;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.f = list;
    }

    public void setRoad(String str) {
        this.f1074c = str;
    }

    public void setRoadType(int i) {
        this.i = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.f1074c);
        parcel.writeFloat(this.d);
        parcel.writeFloat(this.f1075e);
        parcel.writeTypedList(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
    }

    public WalkStep() {
        this.f = new ArrayList();
    }
}
