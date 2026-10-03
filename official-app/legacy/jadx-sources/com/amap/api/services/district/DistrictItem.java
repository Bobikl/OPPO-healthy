package com.amap.api.services.district;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class DistrictItem implements Parcelable {
    public static final Parcelable.Creator<DistrictItem> CREATOR = new a();
    private String a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f959c;
    private LatLonPoint d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f960e;
    private List<DistrictItem> f;
    private String[] g;

    public static class a implements Parcelable.Creator<DistrictItem> {
        public static DistrictItem a(Parcel parcel) {
            return new DistrictItem(parcel);
        }

        public static DistrictItem[] b(int i) {
            return new DistrictItem[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DistrictItem createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DistrictItem[] newArray(int i) {
            return b(i);
        }
    }

    public DistrictItem() {
        this.f = new ArrayList();
        this.g = new String[0];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String[] districtBoundary() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DistrictItem.class != obj.getClass()) {
            return false;
        }
        DistrictItem districtItem = (DistrictItem) obj;
        String str = this.b;
        if (str == null) {
            if (districtItem.b != null) {
                return false;
            }
        } else if (!str.equals(districtItem.b)) {
            return false;
        }
        LatLonPoint latLonPoint = this.d;
        if (latLonPoint == null) {
            if (districtItem.d != null) {
                return false;
            }
        } else if (!latLonPoint.equals(districtItem.d)) {
            return false;
        }
        String str2 = this.a;
        if (str2 == null) {
            if (districtItem.a != null) {
                return false;
            }
        } else if (!str2.equals(districtItem.a)) {
            return false;
        }
        if (!Arrays.equals(this.g, districtItem.g)) {
            return false;
        }
        List<DistrictItem> list = this.f;
        if (list == null) {
            if (districtItem.f != null) {
                return false;
            }
        } else if (!list.equals(districtItem.f)) {
            return false;
        }
        String str3 = this.f960e;
        if (str3 == null) {
            if (districtItem.f960e != null) {
                return false;
            }
        } else if (!str3.equals(districtItem.f960e)) {
            return false;
        }
        String str4 = this.f959c;
        if (str4 == null) {
            if (districtItem.f959c != null) {
                return false;
            }
        } else if (!str4.equals(districtItem.f959c)) {
            return false;
        }
        return true;
    }

    public final String getAdcode() {
        return this.b;
    }

    public final LatLonPoint getCenter() {
        return this.d;
    }

    public final String getCitycode() {
        return this.a;
    }

    public final String getLevel() {
        return this.f960e;
    }

    public final String getName() {
        return this.f959c;
    }

    public final List<DistrictItem> getSubDistrict() {
        return this.f;
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        LatLonPoint latLonPoint = this.d;
        int iHashCode2 = (iHashCode + (latLonPoint == null ? 0 : latLonPoint.hashCode())) * 31;
        String str2 = this.a;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Arrays.hashCode(this.g)) * 31;
        List<DistrictItem> list = this.f;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f960e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f959c;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setAdcode(String str) {
        this.b = str;
    }

    public final void setCenter(LatLonPoint latLonPoint) {
        this.d = latLonPoint;
    }

    public final void setCitycode(String str) {
        this.a = str;
    }

    public final void setDistrictBoundary(String[] strArr) {
        this.g = strArr;
    }

    public final void setLevel(String str) {
        this.f960e = str;
    }

    public final void setName(String str) {
        this.f959c = str;
    }

    public final void setSubDistrict(ArrayList<DistrictItem> arrayList) {
        this.f = arrayList;
    }

    public final String toString() {
        return "DistrictItem [mCitycode=" + this.a + ", mAdcode=" + this.b + ", mName=" + this.f959c + ", mCenter=" + this.d + ", mLevel=" + this.f960e + ", mDistricts=" + this.f + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.f959c);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.f960e);
        parcel.writeTypedList(this.f);
        parcel.writeInt(this.g.length);
        parcel.writeStringArray(this.g);
    }

    public DistrictItem(String str, String str2, String str3, LatLonPoint latLonPoint, String str4) {
        this.f = new ArrayList();
        this.g = new String[0];
        this.f959c = str;
        this.a = str2;
        this.b = str3;
        this.d = latLonPoint;
        this.f960e = str4;
    }

    public DistrictItem(Parcel parcel) {
        this.f = new ArrayList();
        this.g = new String[0];
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.f959c = parcel.readString();
        this.d = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f960e = parcel.readString();
        this.f = parcel.createTypedArrayList(CREATOR);
        int i = parcel.readInt();
        if (i <= 0 || i > 52428800) {
            return;
        }
        String[] strArr = new String[i];
        this.g = strArr;
        parcel.readStringArray(strArr);
    }
}
