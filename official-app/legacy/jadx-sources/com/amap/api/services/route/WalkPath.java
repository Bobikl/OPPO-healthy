package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class WalkPath extends Path {
    public static final Parcelable.Creator<WalkPath> CREATOR = new a();
    private List<WalkStep> a;

    public static class a implements Parcelable.Creator<WalkPath> {
        public static WalkPath a(Parcel parcel) {
            return new WalkPath(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ WalkPath createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ WalkPath[] newArray(int i) {
            return null;
        }
    }

    public WalkPath(Parcel parcel) {
        super(parcel);
        this.a = new ArrayList();
        this.a = parcel.createTypedArrayList(WalkStep.CREATOR);
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<WalkStep> getSteps() {
        return this.a;
    }

    public void setSteps(List<WalkStep> list) {
        this.a = list;
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.a);
    }

    public WalkPath() {
        this.a = new ArrayList();
    }
}
