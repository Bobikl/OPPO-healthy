package com.amap.api.services.district;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.AMapException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public final class DistrictResult implements Parcelable {
    public Parcelable.Creator<DistrictResult> CREATOR;
    private DistrictSearchQuery a;
    private ArrayList<DistrictItem> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f961c;
    private AMapException d;

    public class a implements Parcelable.Creator<DistrictResult> {
        public a() {
        }

        public static DistrictResult a(Parcel parcel) {
            return new DistrictResult(parcel);
        }

        public static DistrictResult[] b(int i) {
            return new DistrictResult[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DistrictResult createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DistrictResult[] newArray(int i) {
            return b(i);
        }
    }

    public DistrictResult(DistrictSearchQuery districtSearchQuery, ArrayList<DistrictItem> arrayList) {
        this.b = new ArrayList<>();
        this.CREATOR = new a();
        this.a = districtSearchQuery;
        this.b = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DistrictResult.class != obj.getClass()) {
            return false;
        }
        DistrictResult districtResult = (DistrictResult) obj;
        DistrictSearchQuery districtSearchQuery = this.a;
        if (districtSearchQuery == null) {
            if (districtResult.a != null) {
                return false;
            }
        } else if (!districtSearchQuery.equals(districtResult.a)) {
            return false;
        }
        ArrayList<DistrictItem> arrayList = this.b;
        if (arrayList == null) {
            if (districtResult.b != null) {
                return false;
            }
        } else if (!arrayList.equals(districtResult.b)) {
            return false;
        }
        return true;
    }

    public final AMapException getAMapException() {
        return this.d;
    }

    public final ArrayList<DistrictItem> getDistrict() {
        return this.b;
    }

    public final int getPageCount() {
        return this.f961c;
    }

    public final DistrictSearchQuery getQuery() {
        return this.a;
    }

    public final int hashCode() {
        DistrictSearchQuery districtSearchQuery = this.a;
        int iHashCode = ((districtSearchQuery == null ? 0 : districtSearchQuery.hashCode()) + 31) * 31;
        ArrayList<DistrictItem> arrayList = this.b;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final void setAMapException(AMapException aMapException) {
        this.d = aMapException;
    }

    public final void setDistrict(ArrayList<DistrictItem> arrayList) {
        this.b = arrayList;
    }

    public final void setPageCount(int i) {
        this.f961c = i;
    }

    public final void setQuery(DistrictSearchQuery districtSearchQuery) {
        this.a = districtSearchQuery;
    }

    public final String toString() {
        return "DistrictResult [mDisQuery=" + this.a + ", mDistricts=" + this.b + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeTypedList(this.b);
    }

    public DistrictResult() {
        this.b = new ArrayList<>();
        this.CREATOR = new a();
    }

    public DistrictResult(Parcel parcel) {
        this.b = new ArrayList<>();
        this.CREATOR = new a();
        this.a = (DistrictSearchQuery) parcel.readParcelable(DistrictSearchQuery.class.getClassLoader());
        this.b = parcel.createTypedArrayList(DistrictItem.CREATOR);
    }
}
