package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.aiunit.vision.ua4;
import com.oplus.aiunit.vision.wi6;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class DrivePathV2 extends Path {
    public static final Parcelable.Creator<DrivePathV2> CREATOR = new a();
    private String a;
    private List<DriveStepV2> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1011c;
    private ua4 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private wi6 f1012e;
    private List<Object> f;

    public static class a implements Parcelable.Creator<DrivePathV2> {
        public static DrivePathV2 a(Parcel parcel) {
            return new DrivePathV2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DrivePathV2 createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DrivePathV2[] newArray(int i) {
            return null;
        }
    }

    public DrivePathV2(Parcel parcel) {
        super(parcel);
        this.b = new ArrayList();
        this.f = new ArrayList();
        this.a = parcel.readString();
        this.b = parcel.createTypedArrayList(DriveStepV2.CREATOR);
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<Object> getChargeStationInfo() {
        return this.f;
    }

    public ua4 getCost() {
        return null;
    }

    public wi6 getElecConsumeInfo() {
        return null;
    }

    public int getRestriction() {
        return this.f1011c;
    }

    public List<DriveStepV2> getSteps() {
        return this.b;
    }

    public String getStrategy() {
        return this.a;
    }

    public void setChargeStationInfo(List<Object> list) {
        this.f = list;
    }

    public void setCost(ua4 ua4Var) {
    }

    public void setElecConsumeInfo(wi6 wi6Var) {
    }

    public void setRestriction(int i) {
        this.f1011c = i;
    }

    public void setSteps(List<DriveStepV2> list) {
        this.b = list;
    }

    public void setStrategy(String str) {
        this.a = str;
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.b);
    }

    public DrivePathV2() {
        this.b = new ArrayList();
        this.f = new ArrayList();
    }
}
